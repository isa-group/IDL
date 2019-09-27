/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.serializer;

import com.google.inject.Inject;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ArithmeticDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Clause;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Clause2;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Clause3;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ClauseContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.ConditionalDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Dependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.InterparameterDependenciesLanguagePackage;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Model;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Param;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositiveClause;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositiveClause2;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositiveClause3;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PositiveClauseContinuation;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PredefinedDependency;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.PredefinedDependency2;
import es.us.isa.interparamdep.interparameterDependenciesLanguage.Predicate;
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
			case InterparameterDependenciesLanguagePackage.CLAUSE:
				sequence_Clause(context, (Clause) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.CLAUSE2:
				sequence_Clause2(context, (Clause2) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.CLAUSE3:
				sequence_Clause3(context, (Clause3) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.CLAUSE_CONTINUATION:
				sequence_ClauseContinuation(context, (ClauseContinuation) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.CONDITIONAL_DEPENDENCY:
				sequence_ConditionalDependency(context, (ConditionalDependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.PARAM:
				if (rule == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPredicate2Rule()
						|| rule == grammarAccess.getAtomicRule()
						|| rule == grammarAccess.getNegativeAtomicRule()
						|| rule == grammarAccess.getPositiveAtomicRule()) {
					sequence_Param_ParamAssignment(context, (Param) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParamAssignmentRule()) {
					sequence_Param_ParamAssignment(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE:
				sequence_PositiveClause(context, (PositiveClause) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE2:
				sequence_PositiveClause2(context, (PositiveClause2) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE3:
				sequence_PositiveClause3(context, (PositiveClause3) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.POSITIVE_CLAUSE_CONTINUATION:
				sequence_PositiveClauseContinuation(context, (PositiveClauseContinuation) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.PREDEFINED_DEPENDENCY:
				sequence_PredefinedDependency(context, (PredefinedDependency) semanticObject); 
				return; 
			case InterparameterDependenciesLanguagePackage.PREDEFINED_DEPENDENCY2:
				if (rule == grammarAccess.getPositiveClause3Rule()) {
					sequence_PositiveClause3_PredefinedDependency2(context, (PredefinedDependency2) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPredefinedDependency2Rule()) {
					sequence_PredefinedDependency2(context, (PredefinedDependency2) semanticObject); 
					return; 
				}
				else break;
			case InterparameterDependenciesLanguagePackage.PREDICATE:
				sequence_Predicate(context, (Predicate) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ArithmeticDependency returns ArithmeticDependency
	 *     Predicate2 returns ArithmeticDependency
	 *     Atomic returns ArithmeticDependency
	 *     PositiveAtomic returns ArithmeticDependency
	 *
	 * Constraint:
	 *     (param1=ID arithOp=ArithmeticOperator param2=ID)
	 */
	protected void sequence_ArithmeticDependency(ISerializationContext context, ArithmeticDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__PARAM1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__PARAM1));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__ARITH_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__ARITH_OP));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__PARAM2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.ARITHMETIC_DEPENDENCY__PARAM2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getParam1IDTerminalRuleCall_0_0(), semanticObject.getParam1());
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getArithOpArithmeticOperatorParserRuleCall_1_0(), semanticObject.getArithOp());
		feeder.accept(grammarAccess.getArithmeticDependencyAccess().getParam2IDTerminalRuleCall_2_0(), semanticObject.getParam2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Clause2 returns Clause2
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (firstElement=PositiveAtomic | firstElement=NegativeAtomic) 
	 *             logicalOp=LogicalOperator 
	 *             (additionalElements=PositiveAtomic | additionalElements=NegativeAtomic | additionalElements=Clause2)
	 *         ) | 
	 *         (
	 *             (firstElement=PositiveAtomic | firstElement=NegativeAtomic) 
	 *             logicalOp=LogicalOperator 
	 *             (additionalElements=PositiveAtomic | additionalElements=NegativeAtomic | additionalElements=Clause2)
	 *         )
	 *     )
	 */
	protected void sequence_Clause2(ISerializationContext context, Clause2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Predicate2 returns Clause3
	 *     Clause3 returns Clause3
	 *
	 * Constraint:
	 *     (
	 *         ((firstElement=PositiveAtomic | firstElement=NegativeAtomic) clauseContinuation=ClauseContinuation) | 
	 *         (
	 *             (firstElement=PositiveAtomic | firstElement=NegativeAtomic | firstElement=PredefinedDependency2) 
	 *             clauseContinuation=ClauseContinuation 
	 *             clauseContinuation2=ClauseContinuation?
	 *         ) | 
	 *         (firstElement=PredefinedDependency2 clauseContinuation=ClauseContinuation?)
	 *     )
	 */
	protected void sequence_Clause3(ISerializationContext context, Clause3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClauseContinuation returns ClauseContinuation
	 *
	 * Constraint:
	 *     (logicalOp=LogicalOperator (additionalElements=PositiveAtomic | additionalElements=NegativeAtomic | additionalElements=Clause3))
	 */
	protected void sequence_ClauseContinuation(ISerializationContext context, ClauseContinuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Clause returns Clause
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (atomicElements+=PositiveAtomic | atomicElements+=NegativeAtomic) 
	 *             atomicElements+=PositiveAtomic? 
	 *             (atomicElements+=NegativeAtomic? atomicElements+=PositiveAtomic?)*
	 *         ) | 
	 *         (clauses+=Clause clauses+=Clause*)
	 *     )
	 */
	protected void sequence_Clause(ISerializationContext context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalDependency returns ConditionalDependency
	 *
	 * Constraint:
	 *     (condition=Predicate2 consequence=Predicate2)
	 */
	protected void sequence_ConditionalDependency(ISerializationContext context, ConditionalDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION));
			if (transientValues.isValueTransient(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONSEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InterparameterDependenciesLanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONSEQUENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalDependencyAccess().getConditionPredicate2ParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getConditionalDependencyAccess().getConsequencePredicate2ParserRuleCall_3_0(), semanticObject.getConsequence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (dep=ArithmeticDependency | dep=ConditionalDependency | dep=PredefinedDependency2)
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
	 *     Predicate2 returns Param
	 *     Atomic returns Param
	 *     NegativeAtomic returns Param
	 *     PositiveAtomic returns Param
	 *
	 * Constraint:
	 *     (name=ID (paramValues+=STRING paramValues+=STRING*)?)
	 */
	protected void sequence_Param_ParamAssignment(ISerializationContext context, Param semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	// This method is commented out because it has the same signature as another method in this class.
	// This is probably a bug in Xtext's serializer, please report it here: 
	// https://bugs.eclipse.org/bugs/enter_bug.cgi?product=TMF
	//
	// Contexts:
	//     ParamAssignment returns Param
	//
	// Constraint:
	//     (name=ID paramValues+=STRING paramValues+=STRING*)
	//
	// protected void sequence_Param_ParamAssignment(ISerializationContext context, Param semanticObject) { }
	
	/**
	 * Contexts:
	 *     PositiveClause2 returns PositiveClause2
	 *     PositiveFullClause2 returns PositiveClause2
	 *
	 * Constraint:
	 *     (
	 *         (firstElement=PositiveAtomic logicalOp=LogicalOperator (additionalElements=PositiveAtomic | additionalElements=PositiveClause2)) | 
	 *         (firstElement=PositiveAtomic logicalOp=LogicalOperator (additionalElements=PositiveAtomic | additionalElements=PositiveClause2))
	 *     )
	 */
	protected void sequence_PositiveClause2(ISerializationContext context, PositiveClause2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClause3 returns PositiveClause3
	 *
	 * Constraint:
	 *     (
	 *         (positiveFirstElement=PositiveAtomic positiveClauseContinuation=PositiveClauseContinuation) | 
	 *         (
	 *             (positiveFirstElement=PositiveAtomic | positiveFirstElement=PredefinedDependency2) 
	 *             positiveClauseContinuation=PositiveClauseContinuation 
	 *             positiveClauseContinuation2=PositiveClauseContinuation?
	 *         )
	 *     )
	 */
	protected void sequence_PositiveClause3(ISerializationContext context, PositiveClause3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClause3 returns PredefinedDependency2
	 *
	 * Constraint:
	 *     (
	 *         (predefDepType='Or' | predefDepType='OnlyOne' | predefDepType='AllOrNone' | predefDepType='ZeroOrOne') 
	 *         (predefDepClauses+=PositiveAtomic | predefDepClauses+=PositiveClause3) 
	 *         (predefDepClauses+=PositiveAtomic | predefDepClauses+=PositiveClause3)+ 
	 *         positiveClauseContinuation=PositiveClauseContinuation?
	 *     )
	 */
	protected void sequence_PositiveClause3_PredefinedDependency2(ISerializationContext context, PredefinedDependency2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClauseContinuation returns PositiveClauseContinuation
	 *
	 * Constraint:
	 *     (logicalOp=LogicalOperator (additionalElements=PositiveAtomic | additionalElements=PositiveClause3))
	 */
	protected void sequence_PositiveClauseContinuation(ISerializationContext context, PositiveClauseContinuation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PositiveClause returns PositiveClause
	 *     PositiveFullClause returns PositiveClause
	 *
	 * Constraint:
	 *     (
	 *         positiveClauses+=PositiveAtomic 
	 *         (positiveClauses+=PositiveClause | positiveClauses+=PositiveFullClause | positiveClauses+=PredefinedDependency)*
	 *     )
	 */
	protected void sequence_PositiveClause(ISerializationContext context, PositiveClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PredefinedDependency2 returns PredefinedDependency2
	 *
	 * Constraint:
	 *     (
	 *         (predefDepType='Or' | predefDepType='OnlyOne' | predefDepType='AllOrNone' | predefDepType='ZeroOrOne') 
	 *         (predefDepClauses+=PositiveAtomic | predefDepClauses+=PositiveClause3) 
	 *         (predefDepClauses+=PositiveAtomic | predefDepClauses+=PositiveClause3)+
	 *     )
	 */
	protected void sequence_PredefinedDependency2(ISerializationContext context, PredefinedDependency2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Clause returns PredefinedDependency
	 *     PredefinedDependency returns PredefinedDependency
	 *
	 * Constraint:
	 *     (
	 *         (predefDepType='Or' | predefDepType='OnlyOne' | predefDepType='AllOrNone' | predefDepType='ZeroOrOne') 
	 *         (predefDepClauses+=PositiveClause | predefDepClauses+=PositiveFullClause | predefDepClauses+=PredefinedDependency) 
	 *         (predefDepClauses+=PositiveClause | predefDepClauses+=PositiveFullClause | predefDepClauses+=PredefinedDependency)+
	 *     )
	 */
	protected void sequence_PredefinedDependency(ISerializationContext context, PredefinedDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Predicate returns Predicate
	 *
	 * Constraint:
	 *     (clauses+=Clause clauses+=Clause*)
	 */
	protected void sequence_Predicate(ISerializationContext context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
