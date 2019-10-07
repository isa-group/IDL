/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.serializer;

import com.google.inject.Inject;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ComparisonDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralAtomic;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClauseContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Model;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Operation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.OperationContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Param;
import es.us.isa.interparamdep.services.InterparameterDependenciesLanguageGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class InterparameterDependenciesLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private InterparameterDependenciesLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == InterparameterDependenciesLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case InterparameterDependenciesLanguagePackage.ARITHMETIC_DEPENDENCY:
				sequence_ArithmeticDependency(context, (ArithmeticDependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.COMPARISON_DEPENDENCY:
				sequence_ComparisonDependency(context, (ComparisonDependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY:
				sequence_ConditionalDependency(context, (ConditionalDependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.GENERAL_ATOMIC:
				if (rule == grammarAccess.getAtomicRule()) {
					sequence_Atomic(context, (GeneralAtomic) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPositiveAtomicRule()) {
					sequence_PositiveAtomic(context, (GeneralAtomic) semanticObject); 
					return; 
				}
				else break;
			case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE:
				if (rule == grammarAccess.getClauseRule()) {
					sequence_Clause(context, (GeneralClause) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPositiveClauseRule()) {
					sequence_PositiveClause(context, (GeneralClause) semanticObject); 
					return; 
				}
				else break;
			case InterparameterDependenciesLanguagePackage.GENERAL_CLAUSE_CONTINUATION:
				if (rule == grammarAccess.getClauseContinuationRule()) {
					sequence_ClauseContinuation(context, (GeneralClauseContinuation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPositiveClauseContinuationRule()) {
					sequence_PositiveClauseContinuation(context, (GeneralClauseContinuation) semanticObject); 
					return; 
				}
				else break;
			case InterparameterDependenciesLanguagePackage.GENERAL_PREDEFINED_DEPENDENCY:
				if (rule == grammarAccess.getPositivePredefinedDependencyRule()) {
					sequence_PositivePredefinedDependency(context, (GeneralPredefinedDependency) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPredefinedDependencyRule()) {
					sequence_PredefinedDependency(context, (GeneralPredefinedDependency) semanticObject); 
					return; 
				}
				else break;
			case InterparameterDependenciesLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.OPERATION_CONTINUATION:
				sequence_OperationContinuation(context, (OperationContinuation) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.PARAM:
				if (rule == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParamAssignmentRule()) {
					sequence_Param_ParamAssignment(context, (Param) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ArithmeticDependency returns ArithmeticDependency
	 *
	 * Constraint:
	 *     (operation=Operation arithOp=ArithmeticOperator result=DOUBLE)
	 */
	protected void sequence_ArithmeticDependency(ISerializationContext context, ArithmeticDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__OPERATION));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__ARITH_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__ARITH_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__RESULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getOperationOperationParserRuleCall_0_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getArithOpArithmeticOperatorParserRuleCall_1_0(), semanticObject.getArithOp());
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getResultDOUBLETerminalRuleCall_2_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns GeneralAtomic
	 *
	 * Constraint:
	 *     ((not=Not? param=Param) | (not=Not? param=ParamAssignment))
	 */
	protected void sequence_Atomic(ISerializationContext context, GeneralAtomic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClauseContinuation returns GeneralClauseContinuation
	 *
	 * Constraint:
	 *     (logicalOp=LogicalOperator additionalElements=Clause)
	 */
	protected void sequence_ClauseContinuation(ISerializationContext context, GeneralClauseContinuation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__LOGICAL_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__LOGICAL_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClauseContinuationAccess().getLogicalOpLogicalOperatorParserRuleCall_0_0(), semanticObject.getLogicalOp());
		feeder.accept(grammarAccess.getClauseContinuationAccess().getAdditionalElementsClauseParserRuleCall_1_0(), semanticObject.getAdditionalElements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Clause returns GeneralClause
	 *
	 * Constraint:
	 *     (
	 *         (firstElement=Atomic clauseContinuation=ClauseContinuation?) | 
	 *         (
	 *             not=Not? 
	 *             (firstElement=Atomic | firstElement=PredefinedDependency | firstElement=ArithmeticDependency) 
	 *             clauseContinuation=ClauseContinuation 
	 *             clauseContinuation2=ClauseContinuation?
	 *         ) | 
	 *         ((firstElement=PredefinedDependency | firstElement=ArithmeticDependency) clauseContinuation=ClauseContinuation?)
	 *     )
	 */
	protected void sequence_Clause(ISerializationContext context, GeneralClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComparisonDependency returns ComparisonDependency
	 *     Atomic returns ComparisonDependency
	 *     PositiveAtomic returns ComparisonDependency
	 *
	 * Constraint:
	 *     (param1=ID arithOp=ArithmeticOperator param2=ID)
	 */
	protected void sequence_ComparisonDependency(ISerializationContext context, ComparisonDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.COMPARISON_DEPENDENCY__PARAM1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.COMPARISON_DEPENDENCY__PARAM1));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.COMPARISON_DEPENDENCY__ARITH_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.COMPARISON_DEPENDENCY__ARITH_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.COMPARISON_DEPENDENCY__PARAM2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.COMPARISON_DEPENDENCY__PARAM2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonDependencyAccess().getParam1IDTerminalRuleCall_0_0(), semanticObject.getParam1());
		feeder.accept(grammarAccess.getComparisonDependencyAccess().getArithOpArithmeticOperatorParserRuleCall_1_0(), semanticObject.getArithOp());
		feeder.accept(grammarAccess.getComparisonDependencyAccess().getParam2IDTerminalRuleCall_2_0(), semanticObject.getParam2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalDependency returns ConditionalDependency
	 *
	 * Constraint:
	 *     (condition=Clause consequence=Clause)
	 */
	protected void sequence_ConditionalDependency(ISerializationContext context, ConditionalDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONSEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONSEQUENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalDependencyAccess().getConditionClauseParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getConditionalDependencyAccess().getConsequenceClauseParserRuleCall_3_0(), semanticObject.getConsequence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (dep=ComparisonDependency | dep=ArithmeticDependency | dep=ConditionalDependency | dep=PredefinedDependency)
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     dependencies+=Dependency+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperationContinuation returns OperationContinuation
	 *
	 * Constraint:
	 *     (mathOp=MathOperator additionalParams=Operation)
	 */
	protected void sequence_OperationContinuation(ISerializationContext context, OperationContinuation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.OPERATION_CONTINUATION__MATH_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.OPERATION_CONTINUATION__MATH_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.OPERATION_CONTINUATION__ADDITIONAL_PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.OPERATION_CONTINUATION__ADDITIONAL_PARAMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationContinuationAccess().getMathOpMathOperatorParserRuleCall_0_0(), semanticObject.getMathOp());
		feeder.accept(grammarAccess.getOperationContinuationAccess().getAdditionalParamsOperationParserRuleCall_1_0(), semanticObject.getAdditionalParams());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (firstParam=Param operationContinuation=OperationContinuation?) | 
	 *         (firstParam=Param operationContinuation=OperationContinuation operationContinuation2=OperationContinuation?)
	 *     )
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Param returns Param
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.PARAM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParamAssignment returns Param
	 *
	 * Constraint:
	 *     (name=ID ((paramValues+=STRING paramValues+=STRING*) | paramValues+=BOOLEAN | (arithOp=ArithmeticOperator paramValues+=DOUBLE)))
	 */
	protected void sequence_Param_ParamAssignment(ISerializationContext context, Param semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveAtomic returns GeneralAtomic
	 *
	 * Constraint:
	 *     (param=Param | param=ParamAssignment)
	 */
	protected void sequence_PositiveAtomic(ISerializationContext context, GeneralAtomic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClauseContinuation returns GeneralClauseContinuation
	 *
	 * Constraint:
	 *     (logicalOp=LogicalOperator additionalElements=PositiveClause)
	 */
	protected void sequence_PositiveClauseContinuation(ISerializationContext context, GeneralClauseContinuation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__LOGICAL_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__LOGICAL_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.GENERAL_CLAUSE_CONTINUATION__ADDITIONAL_ELEMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPositiveClauseContinuationAccess().getLogicalOpLogicalOperatorParserRuleCall_0_0(), semanticObject.getLogicalOp());
		feeder.accept(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsPositiveClauseParserRuleCall_1_0(), semanticObject.getAdditionalElements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClause returns GeneralClause
	 *
	 * Constraint:
	 *     (
	 *         (firstElement=PositiveAtomic clauseContinuation=PositiveClauseContinuation?) | 
	 *         (
	 *             (firstElement=PositiveAtomic | firstElement=PositivePredefinedDependency | firstElement=ArithmeticDependency) 
	 *             clauseContinuation=PositiveClauseContinuation 
	 *             clauseContinuation2=PositiveClauseContinuation?
	 *         ) | 
	 *         ((firstElement=PositivePredefinedDependency | firstElement=ArithmeticDependency) clauseContinuation=PositiveClauseContinuation?)
	 *     )
	 */
	protected void sequence_PositiveClause(ISerializationContext context, GeneralClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositivePredefinedDependency returns GeneralPredefinedDependency
	 *
	 * Constraint:
	 *     (
	 *         (predefDepType='Or' | predefDepType='OnlyOne' | predefDepType='AllOrNone' | predefDepType='ZeroOrOne') 
	 *         predefDepClauses+=PositiveClause 
	 *         predefDepClauses+=PositiveClause+
	 *     )
	 */
	protected void sequence_PositivePredefinedDependency(ISerializationContext context, GeneralPredefinedDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PredefinedDependency returns GeneralPredefinedDependency
	 *
	 * Constraint:
	 *     (
	 *         not=Not? 
	 *         (predefDepType='Or' | predefDepType='OnlyOne' | predefDepType='AllOrNone' | predefDepType='ZeroOrOne') 
	 *         predefDepClauses+=PositiveClause 
	 *         predefDepClauses+=PositiveClause+
	 *     )
	 */
	protected void sequence_PredefinedDependency(ISerializationContext context, GeneralPredefinedDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
