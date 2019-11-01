/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.serializer;

import com.google.inject.Inject;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClause;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralClauseContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralPredefinedDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.GeneralTerm;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Model;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Operation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.OperationContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Param;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositivePredicate;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.RelationalDependency;
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
			case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY:
				sequence_ConditionalDependency(context, (ConditionalDependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
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
			case InterparameterDependenciesLanguagePackage.GENERAL_TERM:
				if (rule == grammarAccess.getPositiveTermRule()) {
					sequence_PositiveTerm(context, (GeneralTerm) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTermRule()) {
					sequence_Term(context, (GeneralTerm) semanticObject); 
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
			case InterparameterDependenciesLanguagePackage.POSITIVE_PREDICATE:
				sequence_PositivePredicate(context, (PositivePredicate) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.PREDICATE:
				sequence_Predicate(context, (Predicate) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.RELATIONAL_DEPENDENCY:
				sequence_RelationalDependency(context, (RelationalDependency) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ArithmeticDependency returns ArithmeticDependency
	 *
	 * Constraint:
	 *     (operation=Operation relationalOp=RelationalOperator result=DOUBLE)
	 */
	protected void sequence_ArithmeticDependency(ISerializationContext context, ArithmeticDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__OPERATION));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__RELATIONAL_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__RELATIONAL_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__RESULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getOperationOperationParserRuleCall_0_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getRelationalOpRelationalOperatorParserRuleCall_1_0(), semanticObject.getRelationalOp());
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getResultDOUBLETerminalRuleCall_2_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClauseContinuation returns GeneralClauseContinuation
	 *
	 * Constraint:
	 *     (logicalOp=LogicalOperator additionalElements=Predicate)
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
		feeder.accept(grammarAccess.getClauseContinuationAccess().getAdditionalElementsPredicateParserRuleCall_1_0(), semanticObject.getAdditionalElements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Clause returns GeneralClause
	 *
	 * Constraint:
	 *     (
	 *         firstElement=Term | 
	 *         firstElement=RelationalDependency | 
	 *         firstElement=ArithmeticDependency | 
	 *         firstElement=PredefinedDependency | 
	 *         (not=Not? openingParenthesis='(' predicate=Predicate closingParenthesis=')')
	 *     )
	 */
	protected void sequence_Clause(ISerializationContext context, GeneralClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalDependency returns ConditionalDependency
	 *
	 * Constraint:
	 *     (condition=Predicate consequence=Predicate)
	 */
	protected void sequence_ConditionalDependency(ISerializationContext context, ConditionalDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONSEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONSEQUENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalDependencyAccess().getConditionPredicateParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getConditionalDependencyAccess().getConsequencePredicateParserRuleCall_3_0(), semanticObject.getConsequence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (dep=RelationalDependency | dep=ArithmeticDependency | dep=ConditionalDependency | dep=PredefinedDependency)
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
	 *     (arithOp=ArithmeticOperator (additionalParams=Param | additionalParams=Operation))
	 */
	protected void sequence_OperationContinuation(ISerializationContext context, OperationContinuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (firstParam=Param operationContinuation=OperationContinuation) | 
	 *         (openingParenthesis='(' operation=Operation closingParenthesis=')' operationContinuation=OperationContinuation?)
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
	 *     (name=ID | name=ID_SPECIAL_CHARS)
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParamAssignment returns Param
	 *
	 * Constraint:
	 *     (
	 *         (name=ID | name=ID_SPECIAL_CHARS) 
	 *         ((stringValues+=STRING stringValues+=STRING*) | patternString=STRING | booleanValue=BOOLEAN | (relationalOp=RelationalOperator doubleValue=DOUBLE))
	 *     )
	 */
	protected void sequence_Param_ParamAssignment(ISerializationContext context, Param semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClauseContinuation returns GeneralClauseContinuation
	 *
	 * Constraint:
	 *     (logicalOp=LogicalOperator additionalElements=PositivePredicate)
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
		feeder.accept(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsPositivePredicateParserRuleCall_1_0(), semanticObject.getAdditionalElements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClause returns GeneralClause
	 *
	 * Constraint:
	 *     (
	 *         firstElement=PositiveTerm | 
	 *         firstElement=RelationalDependency | 
	 *         firstElement=ArithmeticDependency | 
	 *         firstElement=PositivePredefinedDependency | 
	 *         (openingParenthesis='(' predicate=PositivePredicate closingParenthesis=')')
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
	 *         predefDepElements+=PositivePredicate 
	 *         predefDepElements+=PositivePredicate+
	 *     )
	 */
	protected void sequence_PositivePredefinedDependency(ISerializationContext context, GeneralPredefinedDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositivePredicate returns PositivePredicate
	 *
	 * Constraint:
	 *     (firstClause=PositiveClause clauseContinuation=PositiveClauseContinuation?)
	 */
	protected void sequence_PositivePredicate(ISerializationContext context, PositivePredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveTerm returns GeneralTerm
	 *
	 * Constraint:
	 *     (param=Param | param=ParamAssignment)
	 */
	protected void sequence_PositiveTerm(ISerializationContext context, GeneralTerm semanticObject) {
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
	 *         predefDepElements+=PositivePredicate 
	 *         predefDepElements+=PositivePredicate+
	 *     )
	 */
	protected void sequence_PredefinedDependency(ISerializationContext context, GeneralPredefinedDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Predicate returns Predicate
	 *
	 * Constraint:
	 *     (firstClause=Clause clauseContinuation=ClauseContinuation?)
	 */
	protected void sequence_Predicate(ISerializationContext context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalDependency returns RelationalDependency
	 *     PositiveTerm returns RelationalDependency
	 *
	 * Constraint:
	 *     (param1=Param relationalOp=RelationalOperator param2=Param)
	 */
	protected void sequence_RelationalDependency(ISerializationContext context, RelationalDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.RELATIONAL_DEPENDENCY__PARAM1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.RELATIONAL_DEPENDENCY__PARAM1));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.RELATIONAL_DEPENDENCY__RELATIONAL_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.RELATIONAL_DEPENDENCY__RELATIONAL_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.RELATIONAL_DEPENDENCY__PARAM2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.RELATIONAL_DEPENDENCY__PARAM2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationalDependencyAccess().getParam1ParamParserRuleCall_0_0(), semanticObject.getParam1());
		feeder.accept(grammarAccess.getRelationalDependencyAccess().getRelationalOpRelationalOperatorParserRuleCall_1_0(), semanticObject.getRelationalOp());
		feeder.accept(grammarAccess.getRelationalDependencyAccess().getParam2ParamParserRuleCall_2_0(), semanticObject.getParam2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Term returns GeneralTerm
	 *
	 * Constraint:
	 *     ((not=Not? param=Param) | (not=Not? param=ParamAssignment))
	 */
	protected void sequence_Term(ISerializationContext context, GeneralTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
