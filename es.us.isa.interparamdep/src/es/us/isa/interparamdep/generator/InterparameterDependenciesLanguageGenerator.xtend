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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class InterparameterDependenciesLanguageGenerator extends AbstractGenerator {
	
	val String path = System.getProperty("user.home") + "/output.txt"
	val File file = new File(path)
	val Path writePath = Paths.get(path)

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		file.delete
		file.createNewFile
		
		for (dependency: resource.allContents.filter(Dependency).toIterable) {
//			solveDependencyAndOrIterate(dependency.dep, 0, 0)
//	    	Files.write(writePath, Arrays.asList("....................."),
//		    	StandardCharsets.UTF_8, StandardOpenOption.APPEND)

			if (dependency.dep.class == typeof(ConditionalDependencyImpl)) {
				solveConditionalDependency(dependency.dep as ConditionalDependency)
			} else if (dependency.dep.class == typeof(ComparisonDependencyImpl)) {
				solveComparisonDependency(dependency.dep as ComparisonDependency)
			} else if (dependency.dep.class == typeof(ArithmeticDependencyImpl)) {
//				solveArithmeticDependency(dependency.dep as ArithmeticDependency)
			} else if (dependency.dep.class == typeof(GeneralPredefinedDependencyImpl)) {
				solvePredefinedDependency(dependency.dep as GeneralPredefinedDependency)
			} else {
				throw new Exception("The dependency must be a conditional, an " + 
					"arithmetic or a predefined one")
			}

		    for (subElement: dependency.eAllContents.toIterable) {
		    	Files.write(writePath, Arrays.asList(subElement.toString),
		    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
		    }
		    Files.write(writePath, Arrays.asList("---------------------"),
		    	StandardCharsets.UTF_8, StandardOpenOption.APPEND)
		}
	}
	
	
	
	
	
	
	
//	def void solveDependencyAndOrIterate(EObject object, int depthLevel, int objectDepthLevel) {
//		if (object.class == typeof(ConditionalDependencyImpl)) {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Conditional dependency: " + object),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//	    	Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Condition"),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//    		solveDependencyAndOrIterate((object as ConditionalDependency).condition, depthLevel+1, objectDepthLevel+1)
//	    	Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Consequence"),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//    		solveDependencyAndOrIterate((object as ConditionalDependency).consequence, depthLevel+1, objectDepthLevel+1)
//		} else if (object.class == typeof(ComparisonDependencyImpl)) {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Arithmetic dependency: " + object),
//    			StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//		} else if (object.class == typeof(GeneralPredefinedDependencyImpl)) {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Predefined dependency: " + object),
//	    		StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//	    	for (element: object.eContents) {
//	    		solveDependencyAndOrIterate(element, depthLevel+1, objectDepthLevel+1)
//	    	}
//		} else {
//			Files.write(writePath, Arrays.asList("("+ depthLevel + ", " + objectDepthLevel + ") - Object: " + object),
//	    			StandardCharsets.UTF_8, StandardOpenOption.APPEND)
//			for (subElement: object.eContents) {
////				if (subElement.class == typeof(GeneralClauseImpl)) {
////					solveLogicalClause((subElement as GeneralClause).firstElement, (subElement as GeneralClause).clauseContinuation)
////				}
//				solveDependencyAndOrIterate(subElement, depthLevel, objectDepthLevel+1)
//			}
//		}
//	}




	/**
	 * Auxiliar function to process sub elements of dependencies, specifically
	 * predicates (an atomic or a clause).
	 */
	def boolean solvePredicate(EObject predicate) {
		if (predicate.class == typeof(GeneralAtomicImpl)) {
			// TODO
			return true
		} else if(predicate.class == typeof(ComparisonDependencyImpl)) {
			return solveComparisonDependency(predicate as ComparisonDependency)
		} else if(predicate.class == typeof(GeneralClauseImpl)) {
			return solveLogicalClause(
				(predicate as GeneralClause).firstElement,
				(predicate as GeneralClause).clauseContinuation,
				(predicate as GeneralClause).clauseContinuation2
			)
		} else {
			throw new Exception("The element must be a param, an arithmetic" + 
				"dependency or a clause")
		}
	}
	
	
	// Solving a dependency means returning 'true' or 'false'.
	
	/**
	 * Since the arithmetic dependency cannot nest any other dependencies, its
	 * solving stops after the CSP mapping, i.e. there's no need to iterate over
	 * other possibly nested dependencies.
	 */
	def boolean solveComparisonDependency(ComparisonDependency dep) {
		// TODO: Implement CSP mapping
		
		return true
	}
	
	def boolean solvePredefinedDependency(GeneralPredefinedDependency dep) {
		// TODO: Implement CSP mapping
		
		var elementOutputs = newArrayList
		for (depElement: dep.predefDepClauses) {
			elementOutputs.add(solvePredicate(depElement))
		}
		
		switch dep.predefDepType {
			case "Or":
				return true
			case "OnlyOne":
				return true
			case "AllOrNone":
				return true
			case "ZeroOrOne":
				return true
			default:
				throw new Exception("The predefined dependency can only be 'Or', " + 
					"'OnlyOne', 'AllOrNone' or 'ZeroOrOne'")
		}
		
	}
	
	def boolean solveConditionalDependency(ConditionalDependency dep) {
		// TODO: Implement CSP mapping
		
		var boolean conditionOutput
		var boolean consequenceOutput
		
		conditionOutput = solvePredicate(dep.condition)
		consequenceOutput = solvePredicate(dep.consequence)
		
		// If the condition is met, the consequence must meet too
		if (conditionOutput && !consequenceOutput) {
			return false
		}
		
		return true
	}
	
	def boolean solveLogicalClause(EObject firstElement, GeneralClauseContinuation clauseCont, GeneralClauseContinuation clauseCont2) {
		// TODO: Implement CSP mapping
		
		var boolean firstElementOutput
		var boolean secondElementOutput
		var boolean thirdElementOutput
		var boolean clauseOutput
		
		// Solve first element, which can only be a param, arithmetic dep or predefined dep
		if (firstElement.class == typeof(GeneralAtomicImpl)) { // param or param assignment
			// TODO
			firstElementOutput = true
		} else if(firstElement.class == typeof(ComparisonDependencyImpl)) {
			firstElementOutput = solveComparisonDependency(firstElement as ComparisonDependency)
		} else if(firstElement.class == typeof(GeneralPredefinedDependencyImpl)) {
			firstElementOutput = solvePredefinedDependency(firstElement as GeneralPredefinedDependency)
		} else {
			throw new Exception("The first element of a clause must be a param, an " + 
				"arithmetic dependency or a predefined dependency")
		}
		
		clauseOutput = firstElementOutput
		
		// Solve second element, which is a clause continuation containing either
		// a GeneralAtomic or another clause
		if (clauseCont !== null) {
			secondElementOutput = solvePredicate(clauseCont.additionalElements)
			if (clauseCont.logicalOp == "AND") {
				clauseOutput = clauseOutput && secondElementOutput
			} else if (clauseCont.logicalOp == "OR") {
				clauseOutput = clauseOutput || secondElementOutput
			} else {
				throw new Exception("The logical operator can only be AND or OR")
			}
		}
		
		// Solve third element, which is a clause continuation containing either
		// a GeneralAtomic or another clause
		if (clauseCont2 !== null) {
			thirdElementOutput = solvePredicate(clauseCont2.additionalElements)
			if (clauseCont2.logicalOp == "AND") {
				clauseOutput = clauseOutput && thirdElementOutput
			} else if (clauseCont2.logicalOp == "OR") {
				clauseOutput = clauseOutput || thirdElementOutput
			} else {
				throw new Exception("The logical operator can only be AND or OR")
			}
		}
		
		return clauseOutput
	}
	
}






