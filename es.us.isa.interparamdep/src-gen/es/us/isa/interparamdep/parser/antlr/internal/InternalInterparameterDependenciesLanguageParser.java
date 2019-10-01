package es.us.isa.interparamdep.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.us.isa.interparamdep.services.InterparameterDependenciesLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInterparameterDependenciesLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'IF'", "'THEN'", "'|'", "'('", "')'", "'Or'", "'OnlyOne'", "'AllOrNone'", "'ZeroOrOne'", "','", "'NOT'", "'AND'", "'OR'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalInterparameterDependenciesLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInterparameterDependenciesLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInterparameterDependenciesLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInterparameterDependenciesLanguage.g"; }



     	private InterparameterDependenciesLanguageGrammarAccess grammarAccess;

        public InternalInterparameterDependenciesLanguageParser(TokenStream input, InterparameterDependenciesLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected InterparameterDependenciesLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalInterparameterDependenciesLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalInterparameterDependenciesLanguage.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalInterparameterDependenciesLanguage.g:71:1: ruleModel returns [EObject current=null] : ( (lv_dependencies_0_0= ruleDependency ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:77:2: ( ( (lv_dependencies_0_0= ruleDependency ) )* )
            // InternalInterparameterDependenciesLanguage.g:78:2: ( (lv_dependencies_0_0= ruleDependency ) )*
            {
            // InternalInterparameterDependenciesLanguage.g:78:2: ( (lv_dependencies_0_0= ruleDependency ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==19||(LA1_0>=24 && LA1_0<=27)||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:79:3: (lv_dependencies_0_0= ruleDependency )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:79:3: (lv_dependencies_0_0= ruleDependency )
            	    // InternalInterparameterDependenciesLanguage.g:80:4: lv_dependencies_0_0= ruleDependency
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_dependencies_0_0=ruleDependency();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"dependencies",
            	    					lv_dependencies_0_0,
            	    					"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Dependency");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDependency"
    // InternalInterparameterDependenciesLanguage.g:100:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:100:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:101:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalInterparameterDependenciesLanguage.g:107:1: ruleDependency returns [EObject current=null] : ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_NL_2=null;
        EObject lv_dep_0_1 = null;

        EObject lv_dep_0_2 = null;

        EObject lv_dep_0_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:113:2: ( ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? ) )
            // InternalInterparameterDependenciesLanguage.g:114:2: ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? )
            {
            // InternalInterparameterDependenciesLanguage.g:114:2: ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? )
            // InternalInterparameterDependenciesLanguage.g:115:3: ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )?
            {
            // InternalInterparameterDependenciesLanguage.g:115:3: ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) ) )
            // InternalInterparameterDependenciesLanguage.g:116:4: ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) )
            {
            // InternalInterparameterDependenciesLanguage.g:116:4: ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency ) )
            // InternalInterparameterDependenciesLanguage.g:117:5: (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:117:5: (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:118:6: lv_dep_0_1= ruleArithmeticDependency
                    {

                    						newCompositeNode(grammarAccess.getDependencyAccess().getDepArithmeticDependencyParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_dep_0_1=ruleArithmeticDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependencyRule());
                    						}
                    						set(
                    							current,
                    							"dep",
                    							lv_dep_0_1,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ArithmeticDependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:134:6: lv_dep_0_2= ruleConditionalDependency
                    {

                    						newCompositeNode(grammarAccess.getDependencyAccess().getDepConditionalDependencyParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_4);
                    lv_dep_0_2=ruleConditionalDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependencyRule());
                    						}
                    						set(
                    							current,
                    							"dep",
                    							lv_dep_0_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ConditionalDependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:150:6: lv_dep_0_3= rulePredefinedDependency
                    {

                    						newCompositeNode(grammarAccess.getDependencyAccess().getDepPredefinedDependencyParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_4);
                    lv_dep_0_3=rulePredefinedDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependencyRule());
                    						}
                    						set(
                    							current,
                    							"dep",
                    							lv_dep_0_3,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getSemicolonKeyword_1());
            		
            // InternalInterparameterDependenciesLanguage.g:172:3: (this_NL_2= RULE_NL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:173:4: this_NL_2= RULE_NL
                    {
                    this_NL_2=(Token)match(input,RULE_NL,FOLLOW_2); 

                    				newLeafNode(this_NL_2, grammarAccess.getDependencyAccess().getNLTerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleArithmeticDependency"
    // InternalInterparameterDependenciesLanguage.g:182:1: entryRuleArithmeticDependency returns [EObject current=null] : iv_ruleArithmeticDependency= ruleArithmeticDependency EOF ;
    public final EObject entryRuleArithmeticDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:182:61: (iv_ruleArithmeticDependency= ruleArithmeticDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:183:2: iv_ruleArithmeticDependency= ruleArithmeticDependency EOF
            {
             newCompositeNode(grammarAccess.getArithmeticDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticDependency=ruleArithmeticDependency();

            state._fsp--;

             current =iv_ruleArithmeticDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticDependency"


    // $ANTLR start "ruleArithmeticDependency"
    // InternalInterparameterDependenciesLanguage.g:189:1: ruleArithmeticDependency returns [EObject current=null] : ( ( (lv_param1_0_0= RULE_ID ) ) ( (lv_arithOp_1_0= ruleArithmeticOperator ) ) ( (lv_param2_2_0= RULE_ID ) ) ) ;
    public final EObject ruleArithmeticDependency() throws RecognitionException {
        EObject current = null;

        Token lv_param1_0_0=null;
        Token lv_param2_2_0=null;
        AntlrDatatypeRuleToken lv_arithOp_1_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:195:2: ( ( ( (lv_param1_0_0= RULE_ID ) ) ( (lv_arithOp_1_0= ruleArithmeticOperator ) ) ( (lv_param2_2_0= RULE_ID ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:196:2: ( ( (lv_param1_0_0= RULE_ID ) ) ( (lv_arithOp_1_0= ruleArithmeticOperator ) ) ( (lv_param2_2_0= RULE_ID ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:196:2: ( ( (lv_param1_0_0= RULE_ID ) ) ( (lv_arithOp_1_0= ruleArithmeticOperator ) ) ( (lv_param2_2_0= RULE_ID ) ) )
            // InternalInterparameterDependenciesLanguage.g:197:3: ( (lv_param1_0_0= RULE_ID ) ) ( (lv_arithOp_1_0= ruleArithmeticOperator ) ) ( (lv_param2_2_0= RULE_ID ) )
            {
            // InternalInterparameterDependenciesLanguage.g:197:3: ( (lv_param1_0_0= RULE_ID ) )
            // InternalInterparameterDependenciesLanguage.g:198:4: (lv_param1_0_0= RULE_ID )
            {
            // InternalInterparameterDependenciesLanguage.g:198:4: (lv_param1_0_0= RULE_ID )
            // InternalInterparameterDependenciesLanguage.g:199:5: lv_param1_0_0= RULE_ID
            {
            lv_param1_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_param1_0_0, grammarAccess.getArithmeticDependencyAccess().getParam1IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArithmeticDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param1",
            						lv_param1_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:215:3: ( (lv_arithOp_1_0= ruleArithmeticOperator ) )
            // InternalInterparameterDependenciesLanguage.g:216:4: (lv_arithOp_1_0= ruleArithmeticOperator )
            {
            // InternalInterparameterDependenciesLanguage.g:216:4: (lv_arithOp_1_0= ruleArithmeticOperator )
            // InternalInterparameterDependenciesLanguage.g:217:5: lv_arithOp_1_0= ruleArithmeticOperator
            {

            					newCompositeNode(grammarAccess.getArithmeticDependencyAccess().getArithOpArithmeticOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_arithOp_1_0=ruleArithmeticOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticDependencyRule());
            					}
            					set(
            						current,
            						"arithOp",
            						lv_arithOp_1_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ArithmeticOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:234:3: ( (lv_param2_2_0= RULE_ID ) )
            // InternalInterparameterDependenciesLanguage.g:235:4: (lv_param2_2_0= RULE_ID )
            {
            // InternalInterparameterDependenciesLanguage.g:235:4: (lv_param2_2_0= RULE_ID )
            // InternalInterparameterDependenciesLanguage.g:236:5: lv_param2_2_0= RULE_ID
            {
            lv_param2_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_param2_2_0, grammarAccess.getArithmeticDependencyAccess().getParam2IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArithmeticDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param2",
            						lv_param2_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticDependency"


    // $ANTLR start "entryRuleArithmeticOperator"
    // InternalInterparameterDependenciesLanguage.g:256:1: entryRuleArithmeticOperator returns [String current=null] : iv_ruleArithmeticOperator= ruleArithmeticOperator EOF ;
    public final String entryRuleArithmeticOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticOperator = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:256:58: (iv_ruleArithmeticOperator= ruleArithmeticOperator EOF )
            // InternalInterparameterDependenciesLanguage.g:257:2: iv_ruleArithmeticOperator= ruleArithmeticOperator EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticOperator=ruleArithmeticOperator();

            state._fsp--;

             current =iv_ruleArithmeticOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // InternalInterparameterDependenciesLanguage.g:263:1: ruleArithmeticOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:269:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '=' | kw= '!=' ) )
            // InternalInterparameterDependenciesLanguage.g:270:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '=' | kw= '!=' )
            {
            // InternalInterparameterDependenciesLanguage.g:270:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '=' | kw= '!=' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:271:3: kw= '<'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:277:3: kw= '>'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:283:3: kw= '<='
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalInterparameterDependenciesLanguage.g:289:3: kw= '>='
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalInterparameterDependenciesLanguage.g:295:3: kw= '='
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalInterparameterDependenciesLanguage.g:301:3: kw= '!='
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArithmeticOperatorAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "entryRuleConditionalDependency"
    // InternalInterparameterDependenciesLanguage.g:310:1: entryRuleConditionalDependency returns [EObject current=null] : iv_ruleConditionalDependency= ruleConditionalDependency EOF ;
    public final EObject entryRuleConditionalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:310:62: (iv_ruleConditionalDependency= ruleConditionalDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:311:2: iv_ruleConditionalDependency= ruleConditionalDependency EOF
            {
             newCompositeNode(grammarAccess.getConditionalDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalDependency=ruleConditionalDependency();

            state._fsp--;

             current =iv_ruleConditionalDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalDependency"


    // $ANTLR start "ruleConditionalDependency"
    // InternalInterparameterDependenciesLanguage.g:317:1: ruleConditionalDependency returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate ) ) ) ;
    public final EObject ruleConditionalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_consequence_3_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:323:2: ( (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:324:2: (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:324:2: (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate ) ) )
            // InternalInterparameterDependenciesLanguage.g:325:3: otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalDependencyAccess().getIFKeyword_0());
            		
            // InternalInterparameterDependenciesLanguage.g:329:3: ( (lv_condition_1_0= rulePredicate ) )
            // InternalInterparameterDependenciesLanguage.g:330:4: (lv_condition_1_0= rulePredicate )
            {
            // InternalInterparameterDependenciesLanguage.g:330:4: (lv_condition_1_0= rulePredicate )
            // InternalInterparameterDependenciesLanguage.g:331:5: lv_condition_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getConditionalDependencyAccess().getConditionPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalDependencyAccess().getTHENKeyword_2());
            		
            // InternalInterparameterDependenciesLanguage.g:352:3: ( (lv_consequence_3_0= rulePredicate ) )
            // InternalInterparameterDependenciesLanguage.g:353:4: (lv_consequence_3_0= rulePredicate )
            {
            // InternalInterparameterDependenciesLanguage.g:353:4: (lv_consequence_3_0= rulePredicate )
            // InternalInterparameterDependenciesLanguage.g:354:5: lv_consequence_3_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getConditionalDependencyAccess().getConsequencePredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_consequence_3_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
            					}
            					set(
            						current,
            						"consequence",
            						lv_consequence_3_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalDependency"


    // $ANTLR start "entryRulePredicate"
    // InternalInterparameterDependenciesLanguage.g:375:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:375:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalInterparameterDependenciesLanguage.g:376:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalInterparameterDependenciesLanguage.g:382:1: rulePredicate returns [EObject current=null] : (this_Atomic_0= ruleAtomic | this_Clause_1= ruleClause ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_Atomic_0 = null;

        EObject this_Clause_1 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:388:2: ( (this_Atomic_0= ruleAtomic | this_Clause_1= ruleClause ) )
            // InternalInterparameterDependenciesLanguage.g:389:2: (this_Atomic_0= ruleAtomic | this_Clause_1= ruleClause )
            {
            // InternalInterparameterDependenciesLanguage.g:389:2: (this_Atomic_0= ruleAtomic | this_Clause_1= ruleClause )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:390:3: this_Atomic_0= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getAtomicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:399:3: this_Clause_1= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_1=ruleClause();

                    state._fsp--;


                    			current = this_Clause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleAtomic"
    // InternalInterparameterDependenciesLanguage.g:411:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:411:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalInterparameterDependenciesLanguage.g:412:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalInterparameterDependenciesLanguage.g:418:1: ruleAtomic returns [EObject current=null] : ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_not_0_0 = null;

        EObject lv_param_1_0 = null;

        AntlrDatatypeRuleToken lv_not_2_0 = null;

        EObject lv_param_3_0 = null;

        EObject this_ArithmeticDependency_4 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:424:2: ( ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency ) )
            // InternalInterparameterDependenciesLanguage.g:425:2: ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:425:2: ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==17) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==EOF||LA8_3==12||LA8_3==20||LA8_3==23||(LA8_3>=30 && LA8_3<=31)) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==RULE_ID) ) {
                        alt8=3;
                    }
                    else if ( (LA8_4==RULE_STRING) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 12:
                case 20:
                case 23:
                case 30:
                case 31:
                    {
                    alt8=1;
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:426:3: ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:426:3: ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) )
                    // InternalInterparameterDependenciesLanguage.g:427:4: ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:427:4: ( (lv_not_0_0= ruleNot ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==29) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:428:5: (lv_not_0_0= ruleNot )
                            {
                            // InternalInterparameterDependenciesLanguage.g:428:5: (lv_not_0_0= ruleNot )
                            // InternalInterparameterDependenciesLanguage.g:429:6: lv_not_0_0= ruleNot
                            {

                            						newCompositeNode(grammarAccess.getAtomicAccess().getNotNotParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_not_0_0=ruleNot();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAtomicRule());
                            						}
                            						set(
                            							current,
                            							"not",
                            							lv_not_0_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Not");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalInterparameterDependenciesLanguage.g:446:4: ( (lv_param_1_0= ruleParam ) )
                    // InternalInterparameterDependenciesLanguage.g:447:5: (lv_param_1_0= ruleParam )
                    {
                    // InternalInterparameterDependenciesLanguage.g:447:5: (lv_param_1_0= ruleParam )
                    // InternalInterparameterDependenciesLanguage.g:448:6: lv_param_1_0= ruleParam
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getParamParamParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_param_1_0=ruleParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"param",
                    							lv_param_1_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Param");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:467:3: ( ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:467:3: ( ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) ) )
                    // InternalInterparameterDependenciesLanguage.g:468:4: ( (lv_not_2_0= ruleNot ) )? ( (lv_param_3_0= ruleParamAssignment ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:468:4: ( (lv_not_2_0= ruleNot ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==29) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:469:5: (lv_not_2_0= ruleNot )
                            {
                            // InternalInterparameterDependenciesLanguage.g:469:5: (lv_not_2_0= ruleNot )
                            // InternalInterparameterDependenciesLanguage.g:470:6: lv_not_2_0= ruleNot
                            {

                            						newCompositeNode(grammarAccess.getAtomicAccess().getNotNotParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_not_2_0=ruleNot();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAtomicRule());
                            						}
                            						set(
                            							current,
                            							"not",
                            							lv_not_2_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Not");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalInterparameterDependenciesLanguage.g:487:4: ( (lv_param_3_0= ruleParamAssignment ) )
                    // InternalInterparameterDependenciesLanguage.g:488:5: (lv_param_3_0= ruleParamAssignment )
                    {
                    // InternalInterparameterDependenciesLanguage.g:488:5: (lv_param_3_0= ruleParamAssignment )
                    // InternalInterparameterDependenciesLanguage.g:489:6: lv_param_3_0= ruleParamAssignment
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getParamParamAssignmentParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_param_3_0=ruleParamAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"param",
                    							lv_param_3_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ParamAssignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:508:3: this_ArithmeticDependency_4= ruleArithmeticDependency
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getArithmeticDependencyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticDependency_4=ruleArithmeticDependency();

                    state._fsp--;


                    			current = this_ArithmeticDependency_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleParam"
    // InternalInterparameterDependenciesLanguage.g:520:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:520:46: (iv_ruleParam= ruleParam EOF )
            // InternalInterparameterDependenciesLanguage.g:521:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalInterparameterDependenciesLanguage.g:527:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:533:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalInterparameterDependenciesLanguage.g:534:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalInterparameterDependenciesLanguage.g:534:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInterparameterDependenciesLanguage.g:535:3: (lv_name_0_0= RULE_ID )
            {
            // InternalInterparameterDependenciesLanguage.g:535:3: (lv_name_0_0= RULE_ID )
            // InternalInterparameterDependenciesLanguage.g:536:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParamRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleParamAssignment"
    // InternalInterparameterDependenciesLanguage.g:555:1: entryRuleParamAssignment returns [EObject current=null] : iv_ruleParamAssignment= ruleParamAssignment EOF ;
    public final EObject entryRuleParamAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAssignment = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:555:56: (iv_ruleParamAssignment= ruleParamAssignment EOF )
            // InternalInterparameterDependenciesLanguage.g:556:2: iv_ruleParamAssignment= ruleParamAssignment EOF
            {
             newCompositeNode(grammarAccess.getParamAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamAssignment=ruleParamAssignment();

            state._fsp--;

             current =iv_ruleParamAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamAssignment"


    // $ANTLR start "ruleParamAssignment"
    // InternalInterparameterDependenciesLanguage.g:562:1: ruleParamAssignment returns [EObject current=null] : (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleParamAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_paramValues_2_0=null;
        Token otherlv_3=null;
        Token lv_paramValues_4_0=null;
        EObject this_Param_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:568:2: ( (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* ) )
            // InternalInterparameterDependenciesLanguage.g:569:2: (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* )
            {
            // InternalInterparameterDependenciesLanguage.g:569:2: (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* )
            // InternalInterparameterDependenciesLanguage.g:570:3: this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )*
            {

            			newCompositeNode(grammarAccess.getParamAssignmentAccess().getParamParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Param_0=ruleParam();

            state._fsp--;


            			current = this_Param_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalInterparameterDependenciesLanguage.g:582:3: ( (lv_paramValues_2_0= RULE_STRING ) )
            // InternalInterparameterDependenciesLanguage.g:583:4: (lv_paramValues_2_0= RULE_STRING )
            {
            // InternalInterparameterDependenciesLanguage.g:583:4: (lv_paramValues_2_0= RULE_STRING )
            // InternalInterparameterDependenciesLanguage.g:584:5: lv_paramValues_2_0= RULE_STRING
            {
            lv_paramValues_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_paramValues_2_0, grammarAccess.getParamAssignmentAccess().getParamValuesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamAssignmentRule());
            					}
            					addWithLastConsumed(
            						current,
            						"paramValues",
            						lv_paramValues_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:600:3: (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:601:4: otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_12); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParamAssignmentAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:605:4: ( (lv_paramValues_4_0= RULE_STRING ) )
            	    // InternalInterparameterDependenciesLanguage.g:606:5: (lv_paramValues_4_0= RULE_STRING )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:606:5: (lv_paramValues_4_0= RULE_STRING )
            	    // InternalInterparameterDependenciesLanguage.g:607:6: lv_paramValues_4_0= RULE_STRING
            	    {
            	    lv_paramValues_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    						newLeafNode(lv_paramValues_4_0, grammarAccess.getParamAssignmentAccess().getParamValuesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamAssignmentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"paramValues",
            	    							lv_paramValues_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamAssignment"


    // $ANTLR start "entryRuleClause"
    // InternalInterparameterDependenciesLanguage.g:628:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:628:47: (iv_ruleClause= ruleClause EOF )
            // InternalInterparameterDependenciesLanguage.g:629:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalInterparameterDependenciesLanguage.g:635:1: ruleClause returns [EObject current=null] : ( ( ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_firstElement_0_0 = null;

        EObject lv_clauseContinuation_1_0 = null;

        AntlrDatatypeRuleToken lv_not_2_0 = null;

        EObject lv_firstElement_4_1 = null;

        EObject lv_firstElement_4_2 = null;

        EObject lv_clauseContinuation_5_0 = null;

        EObject lv_clauseContinuation2_7_0 = null;

        EObject lv_firstElement_8_0 = null;

        EObject lv_clauseContinuation_9_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:641:2: ( ( ( ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) ) )
            // InternalInterparameterDependenciesLanguage.g:642:2: ( ( ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) )
            {
            // InternalInterparameterDependenciesLanguage.g:642:2: ( ( ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt14=2;
                    }
                    break;
                case 24:
                case 25:
                case 26:
                case 27:
                    {
                    alt14=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:643:3: ( ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:643:3: ( ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) )
                    // InternalInterparameterDependenciesLanguage.g:644:4: ( (lv_firstElement_0_0= ruleAtomic ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:644:4: ( (lv_firstElement_0_0= ruleAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:645:5: (lv_firstElement_0_0= ruleAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:645:5: (lv_firstElement_0_0= ruleAtomic )
                    // InternalInterparameterDependenciesLanguage.g:646:6: lv_firstElement_0_0= ruleAtomic
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getFirstElementAtomicParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_firstElement_0_0=ruleAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_0_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Atomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:663:4: ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:664:5: (lv_clauseContinuation_1_0= ruleClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:664:5: (lv_clauseContinuation_1_0= ruleClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:665:6: lv_clauseContinuation_1_0= ruleClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getClauseContinuationClauseContinuationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_clauseContinuation_1_0=ruleClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"clauseContinuation",
                    							lv_clauseContinuation_1_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:684:3: ( ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:684:3: ( ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:685:4: ( (lv_not_2_0= ruleNot ) )? otherlv_3= '(' ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )?
                    {
                    // InternalInterparameterDependenciesLanguage.g:685:4: ( (lv_not_2_0= ruleNot ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==29) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:686:5: (lv_not_2_0= ruleNot )
                            {
                            // InternalInterparameterDependenciesLanguage.g:686:5: (lv_not_2_0= ruleNot )
                            // InternalInterparameterDependenciesLanguage.g:687:6: lv_not_2_0= ruleNot
                            {

                            						newCompositeNode(grammarAccess.getClauseAccess().getNotNotParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_15);
                            lv_not_2_0=ruleNot();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClauseRule());
                            						}
                            						set(
                            							current,
                            							"not",
                            							lv_not_2_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Not");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInterparameterDependenciesLanguage.g:708:4: ( ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) ) )
                    // InternalInterparameterDependenciesLanguage.g:709:5: ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:709:5: ( (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency ) )
                    // InternalInterparameterDependenciesLanguage.g:710:6: (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency )
                    {
                    // InternalInterparameterDependenciesLanguage.g:710:6: (lv_firstElement_4_1= ruleAtomic | lv_firstElement_4_2= rulePredefinedDependency )
                    int alt11=2;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==RULE_ID) ) {
                            alt11=1;
                        }
                        else if ( ((LA11_1>=24 && LA11_1<=27)) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        alt11=1;
                        }
                        break;
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:711:7: lv_firstElement_4_1= ruleAtomic
                            {

                            							newCompositeNode(grammarAccess.getClauseAccess().getFirstElementAtomicParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_firstElement_4_1=ruleAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClauseRule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_4_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Atomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:727:7: lv_firstElement_4_2= rulePredefinedDependency
                            {

                            							newCompositeNode(grammarAccess.getClauseAccess().getFirstElementPredefinedDependencyParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_14);
                            lv_firstElement_4_2=rulePredefinedDependency();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClauseRule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_4_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:745:4: ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:746:5: (lv_clauseContinuation_5_0= ruleClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:746:5: (lv_clauseContinuation_5_0= ruleClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:747:6: lv_clauseContinuation_5_0= ruleClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getClauseContinuationClauseContinuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_clauseContinuation_5_0=ruleClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"clauseContinuation",
                    							lv_clauseContinuation_5_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getRightParenthesisKeyword_1_4());
                    			
                    // InternalInterparameterDependenciesLanguage.g:768:4: ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=30 && LA12_0<=31)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:769:5: (lv_clauseContinuation2_7_0= ruleClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:769:5: (lv_clauseContinuation2_7_0= ruleClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:770:6: lv_clauseContinuation2_7_0= ruleClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getClauseAccess().getClauseContinuation2ClauseContinuationParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_clauseContinuation2_7_0=ruleClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClauseRule());
                            						}
                            						set(
                            							current,
                            							"clauseContinuation2",
                            							lv_clauseContinuation2_7_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ClauseContinuation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:789:3: ( ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:789:3: ( ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:790:4: ( (lv_firstElement_8_0= rulePredefinedDependency ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )?
                    {
                    // InternalInterparameterDependenciesLanguage.g:790:4: ( (lv_firstElement_8_0= rulePredefinedDependency ) )
                    // InternalInterparameterDependenciesLanguage.g:791:5: (lv_firstElement_8_0= rulePredefinedDependency )
                    {
                    // InternalInterparameterDependenciesLanguage.g:791:5: (lv_firstElement_8_0= rulePredefinedDependency )
                    // InternalInterparameterDependenciesLanguage.g:792:6: lv_firstElement_8_0= rulePredefinedDependency
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getFirstElementPredefinedDependencyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_firstElement_8_0=rulePredefinedDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_8_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:809:4: ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=30 && LA13_0<=31)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:810:5: (lv_clauseContinuation_9_0= ruleClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:810:5: (lv_clauseContinuation_9_0= ruleClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:811:6: lv_clauseContinuation_9_0= ruleClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getClauseAccess().getClauseContinuationClauseContinuationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_clauseContinuation_9_0=ruleClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClauseRule());
                            						}
                            						set(
                            							current,
                            							"clauseContinuation",
                            							lv_clauseContinuation_9_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ClauseContinuation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:833:1: entryRuleClauseContinuation returns [EObject current=null] : iv_ruleClauseContinuation= ruleClauseContinuation EOF ;
    public final EObject entryRuleClauseContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClauseContinuation = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:833:59: (iv_ruleClauseContinuation= ruleClauseContinuation EOF )
            // InternalInterparameterDependenciesLanguage.g:834:2: iv_ruleClauseContinuation= ruleClauseContinuation EOF
            {
             newCompositeNode(grammarAccess.getClauseContinuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClauseContinuation=ruleClauseContinuation();

            state._fsp--;

             current =iv_ruleClauseContinuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClauseContinuation"


    // $ANTLR start "ruleClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:840:1: ruleClauseContinuation returns [EObject current=null] : ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePredicate ) ) ) ;
    public final EObject ruleClauseContinuation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_logicalOp_0_0 = null;

        EObject lv_additionalElements_1_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:846:2: ( ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePredicate ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:847:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePredicate ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:847:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePredicate ) ) )
            // InternalInterparameterDependenciesLanguage.g:848:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePredicate ) )
            {
            // InternalInterparameterDependenciesLanguage.g:848:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) )
            // InternalInterparameterDependenciesLanguage.g:849:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            {
            // InternalInterparameterDependenciesLanguage.g:849:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            // InternalInterparameterDependenciesLanguage.g:850:5: lv_logicalOp_0_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getClauseContinuationAccess().getLogicalOpLogicalOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_logicalOp_0_0=ruleLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
            					}
            					set(
            						current,
            						"logicalOp",
            						lv_logicalOp_0_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.LogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:867:3: ( (lv_additionalElements_1_0= rulePredicate ) )
            // InternalInterparameterDependenciesLanguage.g:868:4: (lv_additionalElements_1_0= rulePredicate )
            {
            // InternalInterparameterDependenciesLanguage.g:868:4: (lv_additionalElements_1_0= rulePredicate )
            // InternalInterparameterDependenciesLanguage.g:869:5: lv_additionalElements_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getClauseContinuationAccess().getAdditionalElementsPredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_additionalElements_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
            					}
            					set(
            						current,
            						"additionalElements",
            						lv_additionalElements_1_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClauseContinuation"


    // $ANTLR start "entryRulePredefinedDependency"
    // InternalInterparameterDependenciesLanguage.g:890:1: entryRulePredefinedDependency returns [EObject current=null] : iv_rulePredefinedDependency= rulePredefinedDependency EOF ;
    public final EObject entryRulePredefinedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:890:61: (iv_rulePredefinedDependency= rulePredefinedDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:891:2: iv_rulePredefinedDependency= rulePredefinedDependency EOF
            {
             newCompositeNode(grammarAccess.getPredefinedDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredefinedDependency=rulePredefinedDependency();

            state._fsp--;

             current =iv_rulePredefinedDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredefinedDependency"


    // $ANTLR start "rulePredefinedDependency"
    // InternalInterparameterDependenciesLanguage.g:897:1: rulePredefinedDependency returns [EObject current=null] : ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( (lv_predefDepClauses_3_0= rulePositivePredicate ) ) (otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) ) )+ otherlv_6= ')' ) ;
    public final EObject rulePredefinedDependency() throws RecognitionException {
        EObject current = null;

        Token lv_predefDepType_1_1=null;
        Token lv_predefDepType_1_2=null;
        Token lv_predefDepType_1_3=null;
        Token lv_predefDepType_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_not_0_0 = null;

        EObject lv_predefDepClauses_3_0 = null;

        EObject lv_predefDepClauses_5_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:903:2: ( ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( (lv_predefDepClauses_3_0= rulePositivePredicate ) ) (otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) ) )+ otherlv_6= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:904:2: ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( (lv_predefDepClauses_3_0= rulePositivePredicate ) ) (otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) ) )+ otherlv_6= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:904:2: ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( (lv_predefDepClauses_3_0= rulePositivePredicate ) ) (otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) ) )+ otherlv_6= ')' )
            // InternalInterparameterDependenciesLanguage.g:905:3: ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( (lv_predefDepClauses_3_0= rulePositivePredicate ) ) (otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) ) )+ otherlv_6= ')'
            {
            // InternalInterparameterDependenciesLanguage.g:905:3: ( (lv_not_0_0= ruleNot ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:906:4: (lv_not_0_0= ruleNot )
                    {
                    // InternalInterparameterDependenciesLanguage.g:906:4: (lv_not_0_0= ruleNot )
                    // InternalInterparameterDependenciesLanguage.g:907:5: lv_not_0_0= ruleNot
                    {

                    					newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getNotNotParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_not_0_0=ruleNot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
                    					}
                    					set(
                    						current,
                    						"not",
                    						lv_not_0_0,
                    						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Not");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalInterparameterDependenciesLanguage.g:924:3: ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) )
            // InternalInterparameterDependenciesLanguage.g:925:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:925:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            // InternalInterparameterDependenciesLanguage.g:926:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            {
            // InternalInterparameterDependenciesLanguage.g:926:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            case 27:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:927:6: lv_predefDepType_1_1= 'Or'
                    {
                    lv_predefDepType_1_1=(Token)match(input,24,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_1_1, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeOrKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:938:6: lv_predefDepType_1_2= 'OnlyOne'
                    {
                    lv_predefDepType_1_2=(Token)match(input,25,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_1_2, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeOnlyOneKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:949:6: lv_predefDepType_1_3= 'AllOrNone'
                    {
                    lv_predefDepType_1_3=(Token)match(input,26,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_1_3, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeAllOrNoneKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalInterparameterDependenciesLanguage.g:960:6: lv_predefDepType_1_4= 'ZeroOrOne'
                    {
                    lv_predefDepType_1_4=(Token)match(input,27,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_1_4, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeZeroOrOneKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPredefinedDependencyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalInterparameterDependenciesLanguage.g:977:3: ( (lv_predefDepClauses_3_0= rulePositivePredicate ) )
            // InternalInterparameterDependenciesLanguage.g:978:4: (lv_predefDepClauses_3_0= rulePositivePredicate )
            {
            // InternalInterparameterDependenciesLanguage.g:978:4: (lv_predefDepClauses_3_0= rulePositivePredicate )
            // InternalInterparameterDependenciesLanguage.g:979:5: lv_predefDepClauses_3_0= rulePositivePredicate
            {

            					newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositivePredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_predefDepClauses_3_0=rulePositivePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            					}
            					add(
            						current,
            						"predefDepClauses",
            						lv_predefDepClauses_3_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:996:3: (otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:997:4: otherlv_4= ',' ( (lv_predefDepClauses_5_0= rulePositivePredicate ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPredefinedDependencyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:1001:4: ( (lv_predefDepClauses_5_0= rulePositivePredicate ) )
            	    // InternalInterparameterDependenciesLanguage.g:1002:5: (lv_predefDepClauses_5_0= rulePositivePredicate )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1002:5: (lv_predefDepClauses_5_0= rulePositivePredicate )
            	    // InternalInterparameterDependenciesLanguage.g:1003:6: lv_predefDepClauses_5_0= rulePositivePredicate
            	    {

            	    						newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositivePredicateParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_predefDepClauses_5_0=rulePositivePredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"predefDepClauses",
            	    							lv_predefDepClauses_5_0,
            	    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPredefinedDependencyAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefinedDependency"


    // $ANTLR start "entryRulePositivePredicate"
    // InternalInterparameterDependenciesLanguage.g:1029:1: entryRulePositivePredicate returns [EObject current=null] : iv_rulePositivePredicate= rulePositivePredicate EOF ;
    public final EObject entryRulePositivePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositivePredicate = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1029:58: (iv_rulePositivePredicate= rulePositivePredicate EOF )
            // InternalInterparameterDependenciesLanguage.g:1030:2: iv_rulePositivePredicate= rulePositivePredicate EOF
            {
             newCompositeNode(grammarAccess.getPositivePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositivePredicate=rulePositivePredicate();

            state._fsp--;

             current =iv_rulePositivePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositivePredicate"


    // $ANTLR start "rulePositivePredicate"
    // InternalInterparameterDependenciesLanguage.g:1036:1: rulePositivePredicate returns [EObject current=null] : (this_PositiveAtomic_0= rulePositiveAtomic | this_PositiveClause_1= rulePositiveClause ) ;
    public final EObject rulePositivePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_PositiveAtomic_0 = null;

        EObject this_PositiveClause_1 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1042:2: ( (this_PositiveAtomic_0= rulePositiveAtomic | this_PositiveClause_1= rulePositiveClause ) )
            // InternalInterparameterDependenciesLanguage.g:1043:2: (this_PositiveAtomic_0= rulePositiveAtomic | this_PositiveClause_1= rulePositiveClause )
            {
            // InternalInterparameterDependenciesLanguage.g:1043:2: (this_PositiveAtomic_0= rulePositiveAtomic | this_PositiveClause_1= rulePositiveClause )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1044:3: this_PositiveAtomic_0= rulePositiveAtomic
                    {

                    			newCompositeNode(grammarAccess.getPositivePredicateAccess().getPositiveAtomicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PositiveAtomic_0=rulePositiveAtomic();

                    state._fsp--;


                    			current = this_PositiveAtomic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1053:3: this_PositiveClause_1= rulePositiveClause
                    {

                    			newCompositeNode(grammarAccess.getPositivePredicateAccess().getPositiveClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PositiveClause_1=rulePositiveClause();

                    state._fsp--;


                    			current = this_PositiveClause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositivePredicate"


    // $ANTLR start "entryRulePositiveAtomic"
    // InternalInterparameterDependenciesLanguage.g:1065:1: entryRulePositiveAtomic returns [EObject current=null] : iv_rulePositiveAtomic= rulePositiveAtomic EOF ;
    public final EObject entryRulePositiveAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveAtomic = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1065:55: (iv_rulePositiveAtomic= rulePositiveAtomic EOF )
            // InternalInterparameterDependenciesLanguage.g:1066:2: iv_rulePositiveAtomic= rulePositiveAtomic EOF
            {
             newCompositeNode(grammarAccess.getPositiveAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveAtomic=rulePositiveAtomic();

            state._fsp--;

             current =iv_rulePositiveAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositiveAtomic"


    // $ANTLR start "rulePositiveAtomic"
    // InternalInterparameterDependenciesLanguage.g:1072:1: rulePositiveAtomic returns [EObject current=null] : ( ( (lv_param_0_0= ruleParam ) ) | ( (lv_param_1_0= ruleParamAssignment ) ) | this_ArithmeticDependency_2= ruleArithmeticDependency ) ;
    public final EObject rulePositiveAtomic() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_param_1_0 = null;

        EObject this_ArithmeticDependency_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1078:2: ( ( ( (lv_param_0_0= ruleParam ) ) | ( (lv_param_1_0= ruleParamAssignment ) ) | this_ArithmeticDependency_2= ruleArithmeticDependency ) )
            // InternalInterparameterDependenciesLanguage.g:1079:2: ( ( (lv_param_0_0= ruleParam ) ) | ( (lv_param_1_0= ruleParamAssignment ) ) | this_ArithmeticDependency_2= ruleArithmeticDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:1079:2: ( ( (lv_param_0_0= ruleParam ) ) | ( (lv_param_1_0= ruleParamAssignment ) ) | this_ArithmeticDependency_2= ruleArithmeticDependency )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                    {
                    alt19=3;
                    }
                    break;
                case 17:
                    {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_ID) ) {
                        alt19=3;
                    }
                    else if ( (LA19_3==RULE_STRING) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 23:
                case 28:
                case 30:
                case 31:
                    {
                    alt19=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1080:3: ( (lv_param_0_0= ruleParam ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1080:3: ( (lv_param_0_0= ruleParam ) )
                    // InternalInterparameterDependenciesLanguage.g:1081:4: (lv_param_0_0= ruleParam )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1081:4: (lv_param_0_0= ruleParam )
                    // InternalInterparameterDependenciesLanguage.g:1082:5: lv_param_0_0= ruleParam
                    {

                    					newCompositeNode(grammarAccess.getPositiveAtomicAccess().getParamParamParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_param_0_0=ruleParam();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositiveAtomicRule());
                    					}
                    					set(
                    						current,
                    						"param",
                    						lv_param_0_0,
                    						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Param");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1100:3: ( (lv_param_1_0= ruleParamAssignment ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1100:3: ( (lv_param_1_0= ruleParamAssignment ) )
                    // InternalInterparameterDependenciesLanguage.g:1101:4: (lv_param_1_0= ruleParamAssignment )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1101:4: (lv_param_1_0= ruleParamAssignment )
                    // InternalInterparameterDependenciesLanguage.g:1102:5: lv_param_1_0= ruleParamAssignment
                    {

                    					newCompositeNode(grammarAccess.getPositiveAtomicAccess().getParamParamAssignmentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_param_1_0=ruleParamAssignment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositiveAtomicRule());
                    					}
                    					set(
                    						current,
                    						"param",
                    						lv_param_1_0,
                    						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ParamAssignment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:1120:3: this_ArithmeticDependency_2= ruleArithmeticDependency
                    {

                    			newCompositeNode(grammarAccess.getPositiveAtomicAccess().getArithmeticDependencyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticDependency_2=ruleArithmeticDependency();

                    state._fsp--;


                    			current = this_ArithmeticDependency_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositiveAtomic"


    // $ANTLR start "entryRulePositiveClause"
    // InternalInterparameterDependenciesLanguage.g:1132:1: entryRulePositiveClause returns [EObject current=null] : iv_rulePositiveClause= rulePositiveClause EOF ;
    public final EObject entryRulePositiveClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClause = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1132:55: (iv_rulePositiveClause= rulePositiveClause EOF )
            // InternalInterparameterDependenciesLanguage.g:1133:2: iv_rulePositiveClause= rulePositiveClause EOF
            {
             newCompositeNode(grammarAccess.getPositiveClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveClause=rulePositiveClause();

            state._fsp--;

             current =iv_rulePositiveClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositiveClause"


    // $ANTLR start "rulePositiveClause"
    // InternalInterparameterDependenciesLanguage.g:1139:1: rulePositiveClause returns [EObject current=null] : ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | ( ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) ) ;
    public final EObject rulePositiveClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_firstElement_0_0 = null;

        EObject lv_clauseContinuation_1_0 = null;

        EObject lv_firstElement_3_1 = null;

        EObject lv_firstElement_3_2 = null;

        EObject lv_clauseContinuation_4_0 = null;

        EObject lv_clauseContinuation2_6_0 = null;

        EObject lv_firstElement_7_0 = null;

        EObject lv_clauseContinuation_8_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1145:2: ( ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | ( ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) ) )
            // InternalInterparameterDependenciesLanguage.g:1146:2: ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | ( ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1146:2: ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | ( ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case 22:
                {
                alt23=2;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1147:3: ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1147:3: ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1148:4: ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1148:4: ( (lv_firstElement_0_0= rulePositiveAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:1149:5: (lv_firstElement_0_0= rulePositiveAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1149:5: (lv_firstElement_0_0= rulePositiveAtomic )
                    // InternalInterparameterDependenciesLanguage.g:1150:6: lv_firstElement_0_0= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getFirstElementPositiveAtomicParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_firstElement_0_0=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_0_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1167:4: ( (lv_clauseContinuation_1_0= rulePositiveClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1168:5: (lv_clauseContinuation_1_0= rulePositiveClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1168:5: (lv_clauseContinuation_1_0= rulePositiveClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1169:6: lv_clauseContinuation_1_0= rulePositiveClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getClauseContinuationPositiveClauseContinuationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_clauseContinuation_1_0=rulePositiveClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"clauseContinuation",
                    							lv_clauseContinuation_1_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1188:3: (otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1188:3: (otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1189:4: otherlv_2= '(' ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getPositiveClauseAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1193:4: ( ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1194:5: ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1194:5: ( (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency ) )
                    // InternalInterparameterDependenciesLanguage.g:1195:6: (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1195:6: (lv_firstElement_3_1= rulePositiveAtomic | lv_firstElement_3_2= rulePositivePredefinedDependency )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    else if ( ((LA20_0>=24 && LA20_0<=27)) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1196:7: lv_firstElement_3_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getFirstElementPositiveAtomicParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_firstElement_3_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_3_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:1212:7: lv_firstElement_3_2= rulePositivePredefinedDependency
                            {

                            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getFirstElementPositivePredefinedDependencyParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FOLLOW_14);
                            lv_firstElement_3_2=rulePositivePredefinedDependency();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_3_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredefinedDependency");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1230:4: ( (lv_clauseContinuation_4_0= rulePositiveClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1231:5: (lv_clauseContinuation_4_0= rulePositiveClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1231:5: (lv_clauseContinuation_4_0= rulePositiveClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1232:6: lv_clauseContinuation_4_0= rulePositiveClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getClauseContinuationPositiveClauseContinuationParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_clauseContinuation_4_0=rulePositiveClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"clauseContinuation",
                    							lv_clauseContinuation_4_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getPositiveClauseAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1253:4: ( (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=30 && LA21_0<=31)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1254:5: (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1254:5: (lv_clauseContinuation2_6_0= rulePositiveClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1255:6: lv_clauseContinuation2_6_0= rulePositiveClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getPositiveClauseAccess().getClauseContinuation2PositiveClauseContinuationParserRuleCall_1_4_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_clauseContinuation2_6_0=rulePositiveClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            						}
                            						set(
                            							current,
                            							"clauseContinuation2",
                            							lv_clauseContinuation2_6_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:1274:3: ( ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1274:3: ( ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1275:4: ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) ) ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )?
                    {
                    // InternalInterparameterDependenciesLanguage.g:1275:4: ( (lv_firstElement_7_0= rulePositivePredefinedDependency ) )
                    // InternalInterparameterDependenciesLanguage.g:1276:5: (lv_firstElement_7_0= rulePositivePredefinedDependency )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1276:5: (lv_firstElement_7_0= rulePositivePredefinedDependency )
                    // InternalInterparameterDependenciesLanguage.g:1277:6: lv_firstElement_7_0= rulePositivePredefinedDependency
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getFirstElementPositivePredefinedDependencyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_firstElement_7_0=rulePositivePredefinedDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_7_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredefinedDependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1294:4: ( (lv_clauseContinuation_8_0= rulePositiveClauseContinuation ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=30 && LA22_0<=31)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1295:5: (lv_clauseContinuation_8_0= rulePositiveClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1295:5: (lv_clauseContinuation_8_0= rulePositiveClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1296:6: lv_clauseContinuation_8_0= rulePositiveClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getPositiveClauseAccess().getClauseContinuationPositiveClauseContinuationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_clauseContinuation_8_0=rulePositiveClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            						}
                            						set(
                            							current,
                            							"clauseContinuation",
                            							lv_clauseContinuation_8_0,
                            							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositiveClause"


    // $ANTLR start "entryRulePositiveClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:1318:1: entryRulePositiveClauseContinuation returns [EObject current=null] : iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF ;
    public final EObject entryRulePositiveClauseContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClauseContinuation = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1318:67: (iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF )
            // InternalInterparameterDependenciesLanguage.g:1319:2: iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF
            {
             newCompositeNode(grammarAccess.getPositiveClauseContinuationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveClauseContinuation=rulePositiveClauseContinuation();

            state._fsp--;

             current =iv_rulePositiveClauseContinuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositiveClauseContinuation"


    // $ANTLR start "rulePositiveClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:1325:1: rulePositiveClauseContinuation returns [EObject current=null] : ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePositivePredicate ) ) ) ;
    public final EObject rulePositiveClauseContinuation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_logicalOp_0_0 = null;

        EObject lv_additionalElements_1_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1331:2: ( ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePositivePredicate ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:1332:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePositivePredicate ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1332:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePositivePredicate ) ) )
            // InternalInterparameterDependenciesLanguage.g:1333:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( (lv_additionalElements_1_0= rulePositivePredicate ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1333:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) )
            // InternalInterparameterDependenciesLanguage.g:1334:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            {
            // InternalInterparameterDependenciesLanguage.g:1334:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            // InternalInterparameterDependenciesLanguage.g:1335:5: lv_logicalOp_0_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getPositiveClauseContinuationAccess().getLogicalOpLogicalOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_logicalOp_0_0=ruleLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositiveClauseContinuationRule());
            					}
            					set(
            						current,
            						"logicalOp",
            						lv_logicalOp_0_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.LogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:1352:3: ( (lv_additionalElements_1_0= rulePositivePredicate ) )
            // InternalInterparameterDependenciesLanguage.g:1353:4: (lv_additionalElements_1_0= rulePositivePredicate )
            {
            // InternalInterparameterDependenciesLanguage.g:1353:4: (lv_additionalElements_1_0= rulePositivePredicate )
            // InternalInterparameterDependenciesLanguage.g:1354:5: lv_additionalElements_1_0= rulePositivePredicate
            {

            					newCompositeNode(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsPositivePredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_additionalElements_1_0=rulePositivePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositiveClauseContinuationRule());
            					}
            					set(
            						current,
            						"additionalElements",
            						lv_additionalElements_1_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositiveClauseContinuation"


    // $ANTLR start "entryRulePositivePredefinedDependency"
    // InternalInterparameterDependenciesLanguage.g:1375:1: entryRulePositivePredefinedDependency returns [EObject current=null] : iv_rulePositivePredefinedDependency= rulePositivePredefinedDependency EOF ;
    public final EObject entryRulePositivePredefinedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositivePredefinedDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1375:69: (iv_rulePositivePredefinedDependency= rulePositivePredefinedDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:1376:2: iv_rulePositivePredefinedDependency= rulePositivePredefinedDependency EOF
            {
             newCompositeNode(grammarAccess.getPositivePredefinedDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositivePredefinedDependency=rulePositivePredefinedDependency();

            state._fsp--;

             current =iv_rulePositivePredefinedDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositivePredefinedDependency"


    // $ANTLR start "rulePositivePredefinedDependency"
    // InternalInterparameterDependenciesLanguage.g:1382:1: rulePositivePredefinedDependency returns [EObject current=null] : ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( (lv_predefDepClauses_2_0= rulePositivePredicate ) ) (otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) ) )+ otherlv_5= ')' ) ;
    public final EObject rulePositivePredefinedDependency() throws RecognitionException {
        EObject current = null;

        Token lv_predefDepType_0_1=null;
        Token lv_predefDepType_0_2=null;
        Token lv_predefDepType_0_3=null;
        Token lv_predefDepType_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_predefDepClauses_2_0 = null;

        EObject lv_predefDepClauses_4_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1388:2: ( ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( (lv_predefDepClauses_2_0= rulePositivePredicate ) ) (otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) ) )+ otherlv_5= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:1389:2: ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( (lv_predefDepClauses_2_0= rulePositivePredicate ) ) (otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) ) )+ otherlv_5= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:1389:2: ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( (lv_predefDepClauses_2_0= rulePositivePredicate ) ) (otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) ) )+ otherlv_5= ')' )
            // InternalInterparameterDependenciesLanguage.g:1390:3: ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( (lv_predefDepClauses_2_0= rulePositivePredicate ) ) (otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) ) )+ otherlv_5= ')'
            {
            // InternalInterparameterDependenciesLanguage.g:1390:3: ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) )
            // InternalInterparameterDependenciesLanguage.g:1391:4: ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1391:4: ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) )
            // InternalInterparameterDependenciesLanguage.g:1392:5: (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' )
            {
            // InternalInterparameterDependenciesLanguage.g:1392:5: (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt24=1;
                }
                break;
            case 25:
                {
                alt24=2;
                }
                break;
            case 26:
                {
                alt24=3;
                }
                break;
            case 27:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1393:6: lv_predefDepType_0_1= 'Or'
                    {
                    lv_predefDepType_0_1=(Token)match(input,24,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_0_1, grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepTypeOrKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPositivePredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1404:6: lv_predefDepType_0_2= 'OnlyOne'
                    {
                    lv_predefDepType_0_2=(Token)match(input,25,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_0_2, grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepTypeOnlyOneKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPositivePredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:1415:6: lv_predefDepType_0_3= 'AllOrNone'
                    {
                    lv_predefDepType_0_3=(Token)match(input,26,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_0_3, grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepTypeAllOrNoneKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPositivePredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalInterparameterDependenciesLanguage.g:1426:6: lv_predefDepType_0_4= 'ZeroOrOne'
                    {
                    lv_predefDepType_0_4=(Token)match(input,27,FOLLOW_15); 

                    						newLeafNode(lv_predefDepType_0_4, grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepTypeZeroOrOneKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPositivePredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPositivePredefinedDependencyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalInterparameterDependenciesLanguage.g:1443:3: ( (lv_predefDepClauses_2_0= rulePositivePredicate ) )
            // InternalInterparameterDependenciesLanguage.g:1444:4: (lv_predefDepClauses_2_0= rulePositivePredicate )
            {
            // InternalInterparameterDependenciesLanguage.g:1444:4: (lv_predefDepClauses_2_0= rulePositivePredicate )
            // InternalInterparameterDependenciesLanguage.g:1445:5: lv_predefDepClauses_2_0= rulePositivePredicate
            {

            					newCompositeNode(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesPositivePredicateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_predefDepClauses_2_0=rulePositivePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositivePredefinedDependencyRule());
            					}
            					add(
            						current,
            						"predefDepClauses",
            						lv_predefDepClauses_2_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:1462:3: (otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:1463:4: otherlv_3= ',' ( (lv_predefDepClauses_4_0= rulePositivePredicate ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPositivePredefinedDependencyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:1467:4: ( (lv_predefDepClauses_4_0= rulePositivePredicate ) )
            	    // InternalInterparameterDependenciesLanguage.g:1468:5: (lv_predefDepClauses_4_0= rulePositivePredicate )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1468:5: (lv_predefDepClauses_4_0= rulePositivePredicate )
            	    // InternalInterparameterDependenciesLanguage.g:1469:6: lv_predefDepClauses_4_0= rulePositivePredicate
            	    {

            	    						newCompositeNode(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesPositivePredicateParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_predefDepClauses_4_0=rulePositivePredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPositivePredefinedDependencyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"predefDepClauses",
            	    							lv_predefDepClauses_4_0,
            	    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPositivePredefinedDependencyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositivePredefinedDependency"


    // $ANTLR start "entryRuleNot"
    // InternalInterparameterDependenciesLanguage.g:1495:1: entryRuleNot returns [String current=null] : iv_ruleNot= ruleNot EOF ;
    public final String entryRuleNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNot = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1495:43: (iv_ruleNot= ruleNot EOF )
            // InternalInterparameterDependenciesLanguage.g:1496:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalInterparameterDependenciesLanguage.g:1502:1: ruleNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1508:2: (kw= 'NOT' )
            // InternalInterparameterDependenciesLanguage.g:1509:2: kw= 'NOT'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNotAccess().getNOTKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalInterparameterDependenciesLanguage.g:1517:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1517:55: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalInterparameterDependenciesLanguage.g:1518:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOperator=ruleLogicalOperator();

            state._fsp--;

             current =iv_ruleLogicalOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalInterparameterDependenciesLanguage.g:1524:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1530:2: ( (kw= 'AND' | kw= 'OR' ) )
            // InternalInterparameterDependenciesLanguage.g:1531:2: (kw= 'AND' | kw= 'OR' )
            {
            // InternalInterparameterDependenciesLanguage.g:1531:2: (kw= 'AND' | kw= 'OR' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            else if ( (LA26_0==31) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1532:3: kw= 'AND'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getANDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1538:3: kw= 'OR'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getORKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOperator"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\2\uffff\1\6\1\uffff\1\6\10\uffff\2\6\1\uffff\1\6";
    static final String dfa_3s = "\2\5\1\14\1\uffff\1\14\1\5\1\uffff\5\5\1\6\2\14\1\6\1\14";
    static final String dfa_4s = "\1\35\1\33\1\37\1\uffff\1\37\1\6\1\uffff\5\5\1\6\2\37\1\6\1\37";
    static final String dfa_5s = "\3\uffff\1\2\2\uffff\1\1\12\uffff";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\20\uffff\1\3\1\uffff\4\3\1\uffff\1\1",
            "\1\4\20\uffff\1\3\1\uffff\4\3",
            "\1\6\1\7\1\10\1\11\1\12\1\5\1\13\1\uffff\1\6\2\uffff\1\6\6\uffff\2\3",
            "",
            "\1\6\4\uffff\1\14\2\uffff\1\6\2\uffff\1\6\6\uffff\2\3",
            "\1\15\1\16",
            "",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\16",
            "\1\6\7\uffff\1\6\2\uffff\1\6\6\uffff\2\3",
            "\1\6\7\uffff\1\6\1\17\1\uffff\1\6\6\uffff\2\3",
            "\1\20",
            "\1\6\7\uffff\1\6\1\17\1\uffff\1\6\6\uffff\2\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "389:2: (this_Atomic_0= ruleAtomic | this_Clause_1= ruleClause )";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\uffff\1\11\10\uffff\2\11\1\uffff\1\11";
    static final String dfa_10s = "\1\5\1\15\1\uffff\6\5\1\uffff\1\27\1\25\1\6\1\25";
    static final String dfa_11s = "\1\33\1\37\1\uffff\4\5\1\6\1\5\1\uffff\2\37\1\6\1\37";
    static final String dfa_12s = "\2\uffff\1\2\6\uffff\1\1\4\uffff";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\20\uffff\1\2\1\uffff\4\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\11\4\uffff\1\11\1\uffff\2\2",
            "",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12\1\13",
            "\1\12",
            "",
            "\1\11\4\uffff\1\11\1\uffff\2\2",
            "\1\14\1\uffff\1\11\4\uffff\1\11\1\uffff\2\2",
            "\1\15",
            "\1\14\1\uffff\1\11\4\uffff\1\11\1\uffff\2\2"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1043:2: (this_PositiveAtomic_0= rulePositiveAtomic | this_PositiveClause_1= rulePositiveClause )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000002F080022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000EF480020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000EF080020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000002F400020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010800000L});

}