/*
 * generated by Xtext 2.19.0
 */
package es.us.isa.interparamdep.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import es.us.isa.interparamdep.ide.contentassist.antlr.internal.InternalInterparameterDependenciesLanguageParser;
import es.us.isa.interparamdep.services.InterparameterDependenciesLanguageGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class InterparameterDependenciesLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(InterparameterDependenciesLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, InterparameterDependenciesLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDependencyAccess().getDepAlternatives_0_0(), "rule__Dependency__DepAlternatives_0_0");
			builder.put(grammarAccess.getArithmeticOperatorAccess().getAlternatives(), "rule__ArithmeticOperator__Alternatives");
			builder.put(grammarAccess.getPredicateAccess().getAlternatives(), "rule__Predicate__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getClauseAccess().getAlternatives(), "rule__Clause__Alternatives");
			builder.put(grammarAccess.getClauseAccess().getFirstElementAlternatives_1_2_0(), "rule__Clause__FirstElementAlternatives_1_2_0");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeAlternatives_1_0(), "rule__PredefinedDependency__PredefDepTypeAlternatives_1_0");
			builder.put(grammarAccess.getPositivePredicateAccess().getAlternatives(), "rule__PositivePredicate__Alternatives");
			builder.put(grammarAccess.getPositiveAtomicAccess().getAlternatives(), "rule__PositiveAtomic__Alternatives");
			builder.put(grammarAccess.getPositiveClauseAccess().getAlternatives(), "rule__PositiveClause__Alternatives");
			builder.put(grammarAccess.getPositiveClauseAccess().getFirstElementAlternatives_1_1_0(), "rule__PositiveClause__FirstElementAlternatives_1_1_0");
			builder.put(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepTypeAlternatives_0_0(), "rule__PositivePredefinedDependency__PredefDepTypeAlternatives_0_0");
			builder.put(grammarAccess.getLogicalOperatorAccess().getAlternatives(), "rule__LogicalOperator__Alternatives");
			builder.put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
			builder.put(grammarAccess.getArithmeticDependencyAccess().getGroup(), "rule__ArithmeticDependency__Group__0");
			builder.put(grammarAccess.getConditionalDependencyAccess().getGroup(), "rule__ConditionalDependency__Group__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getParamAssignmentAccess().getGroup(), "rule__ParamAssignment__Group__0");
			builder.put(grammarAccess.getParamAssignmentAccess().getGroup_3(), "rule__ParamAssignment__Group_3__0");
			builder.put(grammarAccess.getClauseAccess().getGroup_0(), "rule__Clause__Group_0__0");
			builder.put(grammarAccess.getClauseAccess().getGroup_1(), "rule__Clause__Group_1__0");
			builder.put(grammarAccess.getClauseAccess().getGroup_2(), "rule__Clause__Group_2__0");
			builder.put(grammarAccess.getClauseContinuationAccess().getGroup(), "rule__ClauseContinuation__Group__0");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getGroup(), "rule__PredefinedDependency__Group__0");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getGroup_4(), "rule__PredefinedDependency__Group_4__0");
			builder.put(grammarAccess.getPositiveClauseAccess().getGroup_0(), "rule__PositiveClause__Group_0__0");
			builder.put(grammarAccess.getPositiveClauseAccess().getGroup_1(), "rule__PositiveClause__Group_1__0");
			builder.put(grammarAccess.getPositiveClauseAccess().getGroup_2(), "rule__PositiveClause__Group_2__0");
			builder.put(grammarAccess.getPositiveClauseContinuationAccess().getGroup(), "rule__PositiveClauseContinuation__Group__0");
			builder.put(grammarAccess.getPositivePredefinedDependencyAccess().getGroup(), "rule__PositivePredefinedDependency__Group__0");
			builder.put(grammarAccess.getPositivePredefinedDependencyAccess().getGroup_3(), "rule__PositivePredefinedDependency__Group_3__0");
			builder.put(grammarAccess.getModelAccess().getDependenciesAssignment(), "rule__Model__DependenciesAssignment");
			builder.put(grammarAccess.getDependencyAccess().getDepAssignment_0(), "rule__Dependency__DepAssignment_0");
			builder.put(grammarAccess.getArithmeticDependencyAccess().getParam1Assignment_0(), "rule__ArithmeticDependency__Param1Assignment_0");
			builder.put(grammarAccess.getArithmeticDependencyAccess().getArithOpAssignment_1(), "rule__ArithmeticDependency__ArithOpAssignment_1");
			builder.put(grammarAccess.getArithmeticDependencyAccess().getParam2Assignment_2(), "rule__ArithmeticDependency__Param2Assignment_2");
			builder.put(grammarAccess.getConditionalDependencyAccess().getConditionAssignment_1(), "rule__ConditionalDependency__ConditionAssignment_1");
			builder.put(grammarAccess.getConditionalDependencyAccess().getConsequenceAssignment_3(), "rule__ConditionalDependency__ConsequenceAssignment_3");
			builder.put(grammarAccess.getAtomicAccess().getNotAssignment_0_0(), "rule__Atomic__NotAssignment_0_0");
			builder.put(grammarAccess.getAtomicAccess().getParamAssignment_0_1(), "rule__Atomic__ParamAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getNotAssignment_1_0(), "rule__Atomic__NotAssignment_1_0");
			builder.put(grammarAccess.getAtomicAccess().getParamAssignment_1_1(), "rule__Atomic__ParamAssignment_1_1");
			builder.put(grammarAccess.getParamAccess().getNameAssignment(), "rule__Param__NameAssignment");
			builder.put(grammarAccess.getParamAssignmentAccess().getParamValuesAssignment_2(), "rule__ParamAssignment__ParamValuesAssignment_2");
			builder.put(grammarAccess.getParamAssignmentAccess().getParamValuesAssignment_3_1(), "rule__ParamAssignment__ParamValuesAssignment_3_1");
			builder.put(grammarAccess.getClauseAccess().getFirstElementAssignment_0_0(), "rule__Clause__FirstElementAssignment_0_0");
			builder.put(grammarAccess.getClauseAccess().getClauseContinuationAssignment_0_1(), "rule__Clause__ClauseContinuationAssignment_0_1");
			builder.put(grammarAccess.getClauseAccess().getNotAssignment_1_0(), "rule__Clause__NotAssignment_1_0");
			builder.put(grammarAccess.getClauseAccess().getFirstElementAssignment_1_2(), "rule__Clause__FirstElementAssignment_1_2");
			builder.put(grammarAccess.getClauseAccess().getClauseContinuationAssignment_1_3(), "rule__Clause__ClauseContinuationAssignment_1_3");
			builder.put(grammarAccess.getClauseAccess().getClauseContinuation2Assignment_1_5(), "rule__Clause__ClauseContinuation2Assignment_1_5");
			builder.put(grammarAccess.getClauseAccess().getFirstElementAssignment_2_0(), "rule__Clause__FirstElementAssignment_2_0");
			builder.put(grammarAccess.getClauseAccess().getClauseContinuationAssignment_2_1(), "rule__Clause__ClauseContinuationAssignment_2_1");
			builder.put(grammarAccess.getClauseContinuationAccess().getLogicalOpAssignment_0(), "rule__ClauseContinuation__LogicalOpAssignment_0");
			builder.put(grammarAccess.getClauseContinuationAccess().getAdditionalElementsAssignment_1(), "rule__ClauseContinuation__AdditionalElementsAssignment_1");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getNotAssignment_0(), "rule__PredefinedDependency__NotAssignment_0");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeAssignment_1(), "rule__PredefinedDependency__PredefDepTypeAssignment_1");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesAssignment_3(), "rule__PredefinedDependency__PredefDepClausesAssignment_3");
			builder.put(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesAssignment_4_1(), "rule__PredefinedDependency__PredefDepClausesAssignment_4_1");
			builder.put(grammarAccess.getPositiveAtomicAccess().getParamAssignment_0(), "rule__PositiveAtomic__ParamAssignment_0");
			builder.put(grammarAccess.getPositiveAtomicAccess().getParamAssignment_1(), "rule__PositiveAtomic__ParamAssignment_1");
			builder.put(grammarAccess.getPositiveClauseAccess().getFirstElementAssignment_0_0(), "rule__PositiveClause__FirstElementAssignment_0_0");
			builder.put(grammarAccess.getPositiveClauseAccess().getClauseContinuationAssignment_0_1(), "rule__PositiveClause__ClauseContinuationAssignment_0_1");
			builder.put(grammarAccess.getPositiveClauseAccess().getFirstElementAssignment_1_1(), "rule__PositiveClause__FirstElementAssignment_1_1");
			builder.put(grammarAccess.getPositiveClauseAccess().getClauseContinuationAssignment_1_2(), "rule__PositiveClause__ClauseContinuationAssignment_1_2");
			builder.put(grammarAccess.getPositiveClauseAccess().getClauseContinuation2Assignment_1_4(), "rule__PositiveClause__ClauseContinuation2Assignment_1_4");
			builder.put(grammarAccess.getPositiveClauseAccess().getFirstElementAssignment_2_0(), "rule__PositiveClause__FirstElementAssignment_2_0");
			builder.put(grammarAccess.getPositiveClauseAccess().getClauseContinuationAssignment_2_1(), "rule__PositiveClause__ClauseContinuationAssignment_2_1");
			builder.put(grammarAccess.getPositiveClauseContinuationAccess().getLogicalOpAssignment_0(), "rule__PositiveClauseContinuation__LogicalOpAssignment_0");
			builder.put(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsAssignment_1(), "rule__PositiveClauseContinuation__AdditionalElementsAssignment_1");
			builder.put(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepTypeAssignment_0(), "rule__PositivePredefinedDependency__PredefDepTypeAssignment_0");
			builder.put(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesAssignment_2(), "rule__PositivePredefinedDependency__PredefDepClausesAssignment_2");
			builder.put(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesAssignment_3_1(), "rule__PositivePredefinedDependency__PredefDepClausesAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private InterparameterDependenciesLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalInterparameterDependenciesLanguageParser createParser() {
		InternalInterparameterDependenciesLanguageParser result = new InternalInterparameterDependenciesLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public InterparameterDependenciesLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InterparameterDependenciesLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
