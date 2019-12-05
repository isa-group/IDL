/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import java.io.File
import java.util.Map
import java.util.Map.Entry
import java.util.HashMap
import java.util.AbstractMap.SimpleEntry

import static es.us.isa.interparamdep.generator.ReservedWords.RESERVED_WORDS
import es.us.isa.interparamdep.generator.ParamStringIntTuple

import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ConditionalDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralPredefinedDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ArithmeticDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Operation
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Param
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ParamImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.OperationContinuation
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.RelationalDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.RelationalDependency
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralTermImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralTerm
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredicate
import java.io.BufferedWriter
import java.io.FileWriter
import java.util.Set
import java.util.HashSet
import java.util.Comparator
import java.io.FileOutputStream
import java.io.ObjectOutputStream

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class InterparameterDependenciesLanguageGenerator extends AbstractGenerator {
	
	val String constraintsFilePath = System.getProperty("user.home") + "/constraints_folder/constraints.mzn"
	val String paramStringIntTuplesFilePath = System.getProperty("user.home") + "/constraints_folder/param_string_int_mapping.json"
	// val String path = "./idl_aux_files/aux_constraints.mzn"
	
//	var File file
//	var BufferedWriter out
	var String csp
//	var int intedString
//	var Map<Entry<String, String>, Integer> paramStringsToInts = new HashMap<Entry<String, String>, Integer>()
//	var Set<ParamStringIntTuple> paramStringIntTuples = new HashSet<ParamStringIntTuple>()
	var Map<String, Map<String, Integer>> paramStringIntMappings = new HashMap<String, Map<String, Integer>>()

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		var file = new File(constraintsFilePath)
		file.delete
		if (!file.exists) {
		  file.parentFile.mkdirs
		  file.createNewFile
		}
		var out = new BufferedWriter(new FileWriter(file, false))
		
//		intedString = 1
//		paramStringsToInts.clear
		paramStringIntMappings.clear
		
		for (dependency: resource.allContents.filter(Dependency).toIterable) {
			csp = "constraint "
			if (dependency.dep.class == typeof(ConditionalDependencyImpl)) {
				writeConditionalDependency(dependency.dep as ConditionalDependency)
			} else if (dependency.dep.class == typeof(RelationalDependencyImpl)) {
				writeRelationalDependency(dependency.dep as RelationalDependency)
			} else if (dependency.dep.class == typeof(ArithmeticDependencyImpl)) {
				writeArithmeticDependency(dependency.dep as ArithmeticDependency)
			} else if (dependency.dep.class == typeof(GeneralPredefinedDependencyImpl)) {
				writePredefinedDependency(dependency.dep as GeneralPredefinedDependency)
			} else {
				throw new Exception("The dependency must be a conditional, an " + 
					"arithmetic, a relational or a predefined one")
			}
			csp += ";"
			
		    out.append(csp + "\n")
		}
		out.flush
		out.close
		
//		var mappingFile = new File(paramStringIntTuplesFilePath)
//		mappingFile.delete
//		if (!mappingFile.exists) {
//		  mappingFile.parentFile.mkdirs
//		  mappingFile.createNewFile
//		}
//        var ObjectOutputStream mappingOut = new ObjectOutputStream(new FileOutputStream(paramStringIntTuplesFilePath));
//        mappingOut.writeObject(paramStringIntMappings);
//        mappingOut.close();
	}
	
	
	def int stringToInt3(String param, String string) {
		var Integer intMapping = 0
		var Map<String, Integer> paramMap =	paramStringIntMappings.get(param)
		if (paramMap !== null) {
			var Integer paramStringMapping = paramMap.get(string)
			if (paramStringMapping !== null) {
				intMapping = paramStringMapping
			} else {
				var Entry<String,Integer> mappingWithHighestInt = paramMap.entrySet.stream
						.max(Comparator.comparing(entry | entry.value))
						.orElse(null)
				intMapping = mappingWithHighestInt.value+1
				paramMap.put(string, intMapping)
			}
		} else {
			paramStringIntMappings.put(param, new HashMap<String, Integer>())
			paramStringIntMappings.get(param).put(string, 0)
		}
		
		return intMapping
	}
	
//	/**
//	 * Used to assign an int to a param that is a string
//	 */
//	def int stringToInt2(String param, String string) {
//		var ParamStringIntTuple existingTuple = paramStringIntTuples.stream
//				.filter(tuple | tuple.name==param && tuple.stringValue==string)
//				.findFirst
//				.orElse(null)
//		if (existingTuple !== null) {
//			return existingTuple.intValue
//		} else {
//			var Integer nextIntValue = 0
//			var ParamStringIntTuple tupleWithHighestInt = paramStringIntTuples.stream
//					.filter(tuple | tuple.name==param)
//					.max(Comparator.comparing(tuple | tuple.intValue))
//					.orElse(null)
//			if (tupleWithHighestInt !== null)
//				nextIntValue = tupleWithHighestInt.intValue+1
//			paramStringIntTuples.add(new ParamStringIntTuple(param, string, nextIntValue))
//			
//			return nextIntValue	
//		}
//	}
	

//	/**
//	 * Used to assign an int to a param that is a string
//	 */
//	def int stringToInt(String param, String string) {
//		var a = new ParamStringIntTuple("dsfd", "sfvs", 12)
//		a.name
//		// TODO: Save tuple of param-string-int in some external file
//		var Entry<String, String> paramEntry = new SimpleEntry<String, String>(param, string) // Search int associated to param and string
//		if (paramStringsToInts.get(paramEntry) !== null) { // If exists, return it
//			return paramStringsToInts.get(paramEntry)
//		} else { // Otherwise, add new entry with new int and return it
//			paramStringsToInts.put(paramEntry, intedString)
//			return intedString++
//		}
//	}
	
	/**
	 * Remove and replace special characters from paramName
	 */
	def String parseParamName(String paramName) {
		var String parsedParamName = paramName.replaceAll("[\\[\\]]", "").replaceAll("[\\.\\-\\/\\:]", "_")
		if (RESERVED_WORDS.contains(parsedParamName))
			parsedParamName += "_R"
		return parsedParamName
	}
	
	/**
	 * Returns true if param is actually a ParamValueRelation. False if it is a Param
	 */
	def boolean isParamValueRelation(Param param) {
		return param.stringValues.size !== 0 || param.patternString !== null || param.booleanValue !== null || param.doubleValue !== null
	}
	
	def void writePredicate(GeneralPredicate predicate) {
		writeClause(predicate.firstClause)
		
		if (predicate.clauseContinuation !== null) {
			// Solve second element, which is a clause continuation containing a predicate
			if (predicate.clauseContinuation.logicalOp == "AND") {
				csp += " /\\ "
			} else if (predicate.clauseContinuation.logicalOp == "OR") {
				csp += " \\/ "
			} else {
				throw new Exception("The logical operator can only be AND or OR")
			}
			writePredicate(predicate.clauseContinuation.additionalElements)
		}
	}
	
	def void writeClause(GeneralClause clause) {
		if (clause.predicate !== null) {
			if (clause.not !== null)
				csp += "(not "
			csp += "("
			writePredicate(clause.predicate)
			csp += ")"
			if (clause.not !== null)
				csp += ")"
		}
		
		// Solve firstElement, which can be a term, arithmetic dep, relational dep or predefined dep
		if (clause.firstElement !== null) {
			if (clause.firstElement.class == typeof(GeneralTermImpl)) { // param or param assignment
				val GeneralTerm term = (clause.firstElement as GeneralTerm)
				val Param param = (term.param as Param)
				
				if (term.not !== null)
					csp += "(not "
				csp += "("
	
				csp += parseParamName(param.name) + "Set==1"
				
				if (isParamValueRelation(param)) {
					csp += " /\\ "
					if (param.booleanValue !== null) {
						csp += parseParamName(param.name) + "==" + param.booleanValue
					} else if (param.doubleValue !== null) {
						csp += parseParamName(param.name) + param.relationalOp + param.doubleValue
					} else if (param.stringValues.size !== 0) {
						csp += "("
						for (string: param.stringValues) {
							csp += parseParamName(param.name) + "==" + stringToInt3(parseParamName(param.name), string) + " \\/ "
						}
						csp = csp.substring(0, csp.length-4) // Trim last " \\/ "
						csp += ")"
					} else if (param.patternString !== null) {
						// TODO: Implement CSP mapping (none for now)
						csp += "true"
					}
				}
				csp += ")"
				if (term.not !== null)
					csp += ")"
			} else if(clause.firstElement.class == typeof(RelationalDependencyImpl)) {
				writeRelationalDependency(clause.firstElement as RelationalDependency)
			} else if(clause.firstElement.class == typeof(ArithmeticDependencyImpl)) {
				writeArithmeticDependency(clause.firstElement as ArithmeticDependency)
			} else if(clause.firstElement.class == typeof(GeneralPredefinedDependencyImpl)) {
				writePredefinedDependency(clause.firstElement as GeneralPredefinedDependency)
			} else {
				throw new Exception("The first element of a clause must be a term, an " + 
					"arithmetic dependency, a relational dependency or a predefined dependency")
			}
		}
	}
	
	def void writeConditionalDependency(ConditionalDependency dep) {
		csp += "("
		writePredicate(dep.condition)
		csp += ") -> ("
		writePredicate(dep.consequence)
		csp += ")"
	}

	def void writeRelationalDependency(RelationalDependency dep) {
		csp += "((" + parseParamName(dep.param1.name) + "Set==1 /\\ " + parseParamName(dep.param2.name) + "Set==1) -> (" +
				parseParamName(dep.param1.name) + dep.relationalOp + parseParamName(dep.param2.name) + "))"
	}
	
	def void writeArithmeticDependency(ArithmeticDependency dep) {
		csp += "(("
		for (param: dep.eAllContents.filter(Param).toIterable) {
			csp += parseParamName(param.name) + "Set==1 /\\ "
		}
		csp = csp.substring(0, csp.length-4) // Trim last " \\/ "
		csp += ") -> ("
		writeOperation(dep.operation)
		csp += dep.relationalOp
		csp += dep.result
		csp += "))"
	}
	
	def void writeOperation(Operation operation) {
		if (operation.openingParenthesis === null) { // Alternative 1 of Operation
			csp += operation.firstParam.name
			writeOperationContinuation(operation.operationContinuation)
			
		} else { // Alternative 2 of Operation
			csp += "("
			writeOperation(operation.operation)
			csp += ")"
			if (operation.operationContinuation !== null) {
				writeOperationContinuation(operation.operationContinuation)
			}
			
		}
	}
	
	def void writeOperationContinuation(OperationContinuation opCont) {
		csp += opCont.arithOp
		if (opCont.additionalParams.class == typeof(ParamImpl)) {
			csp += (opCont.additionalParams as Param).name
		} else {
			writeOperation(opCont.additionalParams as Operation)
		}
	}
	
	def void writePredefinedDependency(GeneralPredefinedDependency dep) {		
		if (dep.not !== null)
			csp += "(not "
		csp += "("
		
		for (depElement: dep.predefDepElements) {
			csp += "("
			switch dep.predefDepType {
				case "Or": {
					writePredicate(depElement)
					csp += ") \\/ "
				} case "OnlyOne": {
					writeZeroOrOneOnlyOneElement(depElement, dep.predefDepElements)
					csp += ") /\\ "
				} case "AllOrNone": {
					writeAllOrNoneElement(depElement, dep.predefDepElements)
					csp += ") /\\ "
				} case "ZeroOrOne": {
					writeZeroOrOneOnlyOneElement(depElement, dep.predefDepElements)
					csp += ") /\\ "
				} default:
					throw new Exception("The predefined dependency can only be 'Or', " + 
						"'OnlyOne', 'AllOrNone' or 'ZeroOrOne'")
			}
		}
		if (dep.predefDepType.equals("OnlyOne")) { // If dep is OnlyOne, one more clause must be added
			csp += "("
			for (depElement: dep.predefDepElements) {
				csp += "("
				writePredicate(depElement)
				csp += ") \\/ "
			}
			csp = csp.substring(0, csp.length-4) // Trim last " /\\ " or " \\/ "
			csp += ")"
		} else { // Otherwise, last logicalOp must be removed
			csp = csp.substring(0, csp.length-4) // Trim last " /\\ " or " \\/ "
		}
		csp += ")"
		if (dep.not !== null)
			csp += ")"
	}
		
	def void writeZeroOrOneOnlyOneElement(GeneralPredicate element, GeneralPredicate[] allElements) {
		writeZeroOrOneAllOrNoneElement(element, allElements, false, true)
	}
	
	def void writeAllOrNoneElement(GeneralPredicate element, GeneralPredicate[] allElements) {
		writeZeroOrOneAllOrNoneElement(element, allElements, false, false)
		csp += ") /\\ ("
		writeZeroOrOneAllOrNoneElement(element, allElements, true, true)
	}
	
	def void writeZeroOrOneAllOrNoneElement(GeneralPredicate element, GeneralPredicate[] allElements, boolean negateElement, boolean negateRemainingElements) {
		if (negateElement) { // For AllOrNone dependencies
			csp += "(not ("
			writePredicate(element)
			csp += ")) -> ("
		} else { // For ZeroOrOne, AllOrNone and OnlyOne dependencies
			csp += "("
			writePredicate(element)
			csp += ") -> ("
		}
		for (remainingElement: allElements) {
			if (!remainingElement.equals(element)) { // Include remaining elements in the consequence
				if (negateRemainingElements) { // For ZeroOrOne dependencies
					csp += "(not ("
					writePredicate(remainingElement)
					csp += ")) /\\ "
				} else { // For ZeroOrOne, AllOrNone and OnlyOne dependencies
					csp += "("
					writePredicate(remainingElement)
					csp += ") /\\ "
				}
			}
		}
		csp = csp.substring(0, csp.length-4) // Trim last " /\\ "
		csp += ")"
	}
	
}





// ***************
// ADDITIONAL CODE
// ***************

//			writeDependencyAndOrIterate(dependency.dep, 0, 0)
//	    	Files.write(writePath, Arrays.asList("....................."),
//		    	StandardCharsets.UTF_8, StandardOpenOption.APPEND)

//		    for (subElement: dependency.eAllContents.toIterable) {
//		    	Files.write(writePath, Arrays.asList(subElement.toString),
//		    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//		    }
//		    Files.write(writePath, Arrays.asList("---------------------"),
//		    	StandardCharsets.UTF_8, StandardOpenOption.APPEND)

//	def void writeDependencyAndOrIterate(EObject object, int depthLevel, int objectDepthLevel) {
//		if (object.class == typeof(ConditionalDependencyImpl)) {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Conditional dependency: " + object),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//	    	Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Condition"),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//    		writeDependencyAndOrIterate((object as ConditionalDependency).condition, depthLevel+1, objectDepthLevel+1)
//	    	Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Consequence"),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//    		writeDependencyAndOrIterate((object as ConditionalDependency).consequence, depthLevel+1, objectDepthLevel+1)
//		} else if (object.class == typeof(ComparisonDependencyImpl)) {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Arithmetic dependency: " + object),
//    			StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//		} else if (object.class == typeof(GeneralPredefinedDependencyImpl)) {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Predefined dependency: " + object),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//	    	for (element: object.eContents) {
//	    		writeDependencyAndOrIterate(element, depthLevel+1, objectDepthLevel+1)
//	    	}
//		} else {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Object: " + object),
//	    			StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//			for (subElement: object.eContents) {
////				if (subElement.class == typeof(GeneralClauseImpl)) {
////					writeLogicalClause((subElement as GeneralClause).firstElement, (subElement as GeneralClause).clauseContinuation)
////				}
//				writeDependencyAndOrIterate(subElement, depthLevel, objectDepthLevel+1)
//			}
//		}
//	}






