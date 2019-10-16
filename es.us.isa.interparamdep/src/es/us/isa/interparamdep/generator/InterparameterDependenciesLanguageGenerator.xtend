/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays
import java.nio.charset.StandardCharsets
import java.nio.file.StandardOpenOption
import java.io.File
import java.nio.file.Path

import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClauseContinuation
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ComparisonDependency
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralClauseImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralAtomicImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ComparisonDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ConditionalDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.GeneralPredefinedDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ArithmeticDependencyImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Operation
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Param
import es.us.isa.interparamdep.interparameterDependenciesLanguage.impl.ParamImpl
import es.us.isa.interparamdep.interparameterDependenciesLanguage.OperationContinuation
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralAtomic
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ParamAssignment
import java.util.ArrayList
import java.util.Map
import java.util.Map.Entry
import java.util.HashMap
import java.util.AbstractMap.SimpleEntry

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class InterparameterDependenciesLanguageGenerator extends AbstractGenerator {
	
	val String path = System.getProperty("user.home") + "/constraints.mzn"
	val File file = new File(path)
	val Path writePath = Paths.get(path)
	var String csp
	var int intedString
	var Map<Entry<String, String>, Integer> paramStringsToInts = new HashMap<Entry<String, String>, Integer>()

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		file.delete
		file.createNewFile
		
		intedString = 1
		paramStringsToInts.clear
		
		for (dependency: resource.allContents.filter(Dependency).toIterable) {
			csp = "constraint "
			if (dependency.dep.class == typeof(ConditionalDependencyImpl)) {
				writeConditionalDependency(dependency.dep as ConditionalDependency)
			} else if (dependency.dep.class == typeof(ComparisonDependencyImpl)) {
				writeComparisonDependency(dependency.dep as ComparisonDependency)
			} else if (dependency.dep.class == typeof(ArithmeticDependencyImpl)) {
				writeArithmeticDependency(dependency.dep as ArithmeticDependency)
			} else if (dependency.dep.class == typeof(GeneralPredefinedDependencyImpl)) {
				writePredefinedDependency(dependency.dep as GeneralPredefinedDependency)
			} else {
				throw new Exception("The dependency must be a conditional, an " + 
					"arithmetic, a comparison or a predefined one")
			}
			csp += ";"
			
		    Files.write(writePath, Arrays.asList(csp),
		    	StandardCharsets.UTF_8, StandardOpenOption.APPEND)
		    Files.write(writePath, Arrays.asList("%---------------------"),
		    	StandardCharsets.UTF_8, StandardOpenOption.APPEND)
		}
	}
	

	/**
	 * Used to assign an int to a param that is a string
	 */
	def int stringToInt(String param, String string) {
		// TODO: Save tuple of param-string-int in some external file
		var Entry<String, String> paramEntry = new SimpleEntry<String, String>(param, string) // Search int associated to param and string
		if (paramStringsToInts.get(paramEntry) !== null) { // If exists, return it
			return paramStringsToInts.get(paramEntry)
		} else { // Otherwise, add new entry with new int and return it
			paramStringsToInts.put(paramEntry, intedString)
			return intedString++
		}
	}

	/**
	 * Auxiliar function to process sub elements of dependencies, specifically
	 * predicates (an atomic or a clause).
	 */
	def void writePredicate(EObject predicate) {
		if (predicate.class == typeof(GeneralAtomicImpl)) {
			val GeneralAtomic atomic = (predicate as GeneralAtomic)
			val Param param = (atomic.param as Param)
			
			if (atomic.not !== null)
				csp += "(not "
			csp += "("

			csp += param.name + "Set==1"
			
			if (isParamAssignment(param)) {
				csp += " /\\ "
				if (param.booleanValue !== null) {
					csp += param.name + "==" + param.booleanValue
				} else if (param.doubleValue !== null) {
					csp += param.name + param.arithOp + param.doubleValue
				} else if (param.stringValues.size !== 0) {
					csp += "("
					for (string: param.stringValues) {
						csp += param.name + "==" + stringToInt(param.name, string) + " \\/ "
					}
					csp = csp.substring(0, csp.length-4) // Trim last " \\/ "
					csp += ")"
				}
			}
			csp += ")"
			if (atomic.not !== null)
				csp += ")"
			
		} else if(predicate.class == typeof(ComparisonDependencyImpl)) {
			writeComparisonDependency(predicate as ComparisonDependency)
		} else if(predicate.class == typeof(GeneralClauseImpl)) {
			writeLogicalClause(predicate as GeneralClause)
		} else {
			throw new Exception("The element must be a param, a comparison" + 
				"dependency or a clause")
		}
	}
	
	def boolean isParamAssignment(Param param) {
		return param.stringValues.size !== 0 || param.booleanValue !== null || param.doubleValue !== null
	}

	def void writeComparisonDependency(ComparisonDependency dep) {
		csp += "((" + dep.param1 + "Set==1 /\\ " + dep.param2 + "Set==1) -> (" +
				dep.param1 + dep.arithOp + dep.param2 + "))"
	}
	
	def void writeArithmeticDependency(ArithmeticDependency dep) {
		csp += "(("
		for (param: dep.eAllContents.filter(Param).toIterable) {
			csp += param.name + "Set==1 /\\ "
		}
		csp = csp.substring(0, csp.length-4) // Trim last " \\/ "
		csp += ") -> ("
		writeOperation(dep.operation)
		csp += dep.arithOp
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
		csp += opCont.mathOp
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
		
	def void writeZeroOrOneOnlyOneElement(EObject element, EObject[] allElements) {
		writeZeroOrOneAllOrNoneElement(element, allElements, false, true)
	}
	
	def void writeAllOrNoneElement(EObject element, EObject[] allElements) {
		writeZeroOrOneAllOrNoneElement(element, allElements, false, false)
		csp += ") /\\ ("
		writeZeroOrOneAllOrNoneElement(element, allElements, true, true)
	}
	
	def void writeZeroOrOneAllOrNoneElement(EObject element, EObject[] allElements, boolean negateElement, boolean negateRemainingElements) {
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
	
	def void writeConditionalDependency(ConditionalDependency dep) {
		csp += "("
		writePredicate(dep.condition)
		csp += ") -> ("
		writePredicate(dep.consequence)
		csp += ")"
	}
	
	def void writeLogicalClause(GeneralClause clause) {
		if (clause.clause !== null) {
			if (clause.not !== null)
				csp += "(not "
			csp += "("
			writeLogicalClause(clause.clause)
			csp += ")"
			if (clause.not !== null)
				csp += ")"
		}
		
		// Solve first element, which can only be a param, arithmetic dep, comparison dep or predefined dep
		if (clause.firstElement !== null) {
			if (clause.firstElement.class == typeof(GeneralAtomicImpl)) { // param or param assignment
				writePredicate(clause.firstElement)
			} else if(clause.firstElement.class == typeof(ComparisonDependencyImpl)) {
				writeComparisonDependency(clause.firstElement as ComparisonDependency)
			} else if(clause.firstElement.class == typeof(ArithmeticDependencyImpl)) {
				writeArithmeticDependency(clause.firstElement as ArithmeticDependency)
			} else if(clause.firstElement.class == typeof(GeneralPredefinedDependencyImpl)) {
				writePredefinedDependency(clause.firstElement as GeneralPredefinedDependency)
			} else {
				throw new Exception("The first element of a clause must be a param, an " + 
					"arithmetic dependency, a comparison dependency or a predefined dependency")
			}
		}

		// Solve second element, which is a clause continuation containing either a GeneralAtomic or another clause
		if (clause.clauseContinuation !== null) {
			if (clause.clauseContinuation.logicalOp == "AND") {
				csp += " /\\ "
			} else if (clause.clauseContinuation.logicalOp == "OR") {
				csp += " \\/ "
			} else {
				throw new Exception("The logical operator can only be AND or OR")
			}
			writePredicate(clause.clauseContinuation.additionalElements)
		}
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






