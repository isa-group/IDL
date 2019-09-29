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
    // InternalInterparameterDependenciesLanguage.g:382:1: rulePredicate returns [EObject current=null] : (this_Clause_0= ruleClause | this_Atomic_1= ruleAtomic ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_Clause_0 = null;

        EObject this_Atomic_1 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:388:2: ( (this_Clause_0= ruleClause | this_Atomic_1= ruleAtomic ) )
            // InternalInterparameterDependenciesLanguage.g:389:2: (this_Clause_0= ruleClause | this_Atomic_1= ruleAtomic )
            {
            // InternalInterparameterDependenciesLanguage.g:389:2: (this_Clause_0= ruleClause | this_Atomic_1= ruleAtomic )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:390:3: this_Clause_0= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getClauseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_0=ruleClause();

                    state._fsp--;


                    			current = this_Clause_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:399:3: this_Atomic_1= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_1=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_1;
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
    // InternalInterparameterDependenciesLanguage.g:418:1: ruleAtomic returns [EObject current=null] : ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_not_0_0 = null;

        EObject lv_param_1_0 = null;

        AntlrDatatypeRuleToken lv_not_2_0 = null;

        EObject lv_paramAssignment_3_0 = null;

        EObject this_ArithmeticDependency_4 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:424:2: ( ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency ) )
            // InternalInterparameterDependenciesLanguage.g:425:2: ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:425:2: ( ( ( (lv_not_0_0= ruleNot ) )? ( (lv_param_1_0= ruleParam ) ) ) | ( ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) ) ) | this_ArithmeticDependency_4= ruleArithmeticDependency )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==EOF||LA8_3==12||LA8_3==20||LA8_3==23||(LA8_3>=30 && LA8_3<=31)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==17) ) {
                        alt8=2;
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
                case 17:
                    {
                    int LA8_6 = input.LA(3);

                    if ( (LA8_6==RULE_ID) ) {
                        alt8=3;
                    }
                    else if ( (LA8_6==RULE_STRING) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 6, input);

                        throw nvae;
                    }
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
                    // InternalInterparameterDependenciesLanguage.g:467:3: ( ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:467:3: ( ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) ) )
                    // InternalInterparameterDependenciesLanguage.g:468:4: ( (lv_not_2_0= ruleNot ) )? ( (lv_paramAssignment_3_0= ruleParamAssignment ) )
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

                    // InternalInterparameterDependenciesLanguage.g:487:4: ( (lv_paramAssignment_3_0= ruleParamAssignment ) )
                    // InternalInterparameterDependenciesLanguage.g:488:5: (lv_paramAssignment_3_0= ruleParamAssignment )
                    {
                    // InternalInterparameterDependenciesLanguage.g:488:5: (lv_paramAssignment_3_0= ruleParamAssignment )
                    // InternalInterparameterDependenciesLanguage.g:489:6: lv_paramAssignment_3_0= ruleParamAssignment
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getParamAssignmentParamAssignmentParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_paramAssignment_3_0=ruleParamAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"paramAssignment",
                    							lv_paramAssignment_3_0,
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
                case 24:
                case 25:
                case 26:
                case 27:
                    {
                    alt14=3;
                    }
                    break;
                case 22:
                    {
                    alt14=2;
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

                        if ( ((LA11_1>=24 && LA11_1<=27)) ) {
                            alt11=2;
                        }
                        else if ( (LA11_1==RULE_ID) ) {
                            alt11=1;
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
    // InternalInterparameterDependenciesLanguage.g:840:1: ruleClauseContinuation returns [EObject current=null] : ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) ) ) ) ;
    public final EObject ruleClauseContinuation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_logicalOp_0_0 = null;

        EObject lv_additionalElements_1_1 = null;

        EObject lv_additionalElements_1_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:846:2: ( ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:847:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:847:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:848:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) ) )
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

            // InternalInterparameterDependenciesLanguage.g:867:3: ( ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) ) )
            // InternalInterparameterDependenciesLanguage.g:868:4: ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) )
            {
            // InternalInterparameterDependenciesLanguage.g:868:4: ( (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause ) )
            // InternalInterparameterDependenciesLanguage.g:869:5: (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause )
            {
            // InternalInterparameterDependenciesLanguage.g:869:5: (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:870:6: lv_additionalElements_1_1= ruleAtomic
                    {

                    						newCompositeNode(grammarAccess.getClauseContinuationAccess().getAdditionalElementsAtomicParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_1=ruleAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_1,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Atomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:886:6: lv_additionalElements_1_2= ruleClause
                    {

                    						newCompositeNode(grammarAccess.getClauseContinuationAccess().getAdditionalElementsClauseParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_2=ruleClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Clause");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // InternalInterparameterDependenciesLanguage.g:908:1: entryRulePredefinedDependency returns [EObject current=null] : iv_rulePredefinedDependency= rulePredefinedDependency EOF ;
    public final EObject entryRulePredefinedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:908:61: (iv_rulePredefinedDependency= rulePredefinedDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:909:2: iv_rulePredefinedDependency= rulePredefinedDependency EOF
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
    // InternalInterparameterDependenciesLanguage.g:915:1: rulePredefinedDependency returns [EObject current=null] : ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) ) )+ otherlv_6= ')' ) ;
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

        EObject lv_predefDepClauses_3_1 = null;

        EObject lv_predefDepClauses_3_2 = null;

        EObject lv_predefDepClauses_5_1 = null;

        EObject lv_predefDepClauses_5_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:921:2: ( ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) ) )+ otherlv_6= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:922:2: ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) ) )+ otherlv_6= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:922:2: ( ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) ) )+ otherlv_6= ')' )
            // InternalInterparameterDependenciesLanguage.g:923:3: ( (lv_not_0_0= ruleNot ) )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) ) )+ otherlv_6= ')'
            {
            // InternalInterparameterDependenciesLanguage.g:923:3: ( (lv_not_0_0= ruleNot ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:924:4: (lv_not_0_0= ruleNot )
                    {
                    // InternalInterparameterDependenciesLanguage.g:924:4: (lv_not_0_0= ruleNot )
                    // InternalInterparameterDependenciesLanguage.g:925:5: lv_not_0_0= ruleNot
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

            // InternalInterparameterDependenciesLanguage.g:942:3: ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) )
            // InternalInterparameterDependenciesLanguage.g:943:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:943:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            // InternalInterparameterDependenciesLanguage.g:944:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            {
            // InternalInterparameterDependenciesLanguage.g:944:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt17=1;
                }
                break;
            case 25:
                {
                alt17=2;
                }
                break;
            case 26:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:945:6: lv_predefDepType_1_1= 'Or'
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
                    // InternalInterparameterDependenciesLanguage.g:956:6: lv_predefDepType_1_2= 'OnlyOne'
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
                    // InternalInterparameterDependenciesLanguage.g:967:6: lv_predefDepType_1_3= 'AllOrNone'
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
                    // InternalInterparameterDependenciesLanguage.g:978:6: lv_predefDepType_1_4= 'ZeroOrOne'
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
            		
            // InternalInterparameterDependenciesLanguage.g:995:3: ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) ) )
            // InternalInterparameterDependenciesLanguage.g:996:4: ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) )
            {
            // InternalInterparameterDependenciesLanguage.g:996:4: ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause ) )
            // InternalInterparameterDependenciesLanguage.g:997:5: (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause )
            {
            // InternalInterparameterDependenciesLanguage.g:997:5: (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:998:6: lv_predefDepClauses_3_1= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveAtomicParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_predefDepClauses_3_1=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_3_1,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1014:6: lv_predefDepClauses_3_2= rulePositiveClause
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveClauseParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_21);
                    lv_predefDepClauses_3_2=rulePositiveClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_3_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalInterparameterDependenciesLanguage.g:1032:3: (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:1033:4: otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPredefinedDependencyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:1037:4: ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) ) )
            	    // InternalInterparameterDependenciesLanguage.g:1038:5: ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1038:5: ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause ) )
            	    // InternalInterparameterDependenciesLanguage.g:1039:6: (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1039:6: (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause )
            	    int alt19=2;
            	    alt19 = dfa19.predict(input);
            	    switch (alt19) {
            	        case 1 :
            	            // InternalInterparameterDependenciesLanguage.g:1040:7: lv_predefDepClauses_5_1= rulePositiveAtomic
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveAtomicParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_22);
            	            lv_predefDepClauses_5_1=rulePositiveAtomic();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_5_1,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalInterparameterDependenciesLanguage.g:1056:7: lv_predefDepClauses_5_2= rulePositiveClause
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveClauseParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_22);
            	            lv_predefDepClauses_5_2=rulePositiveClause();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_5_2,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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


    // $ANTLR start "entryRulePositiveAtomic"
    // InternalInterparameterDependenciesLanguage.g:1083:1: entryRulePositiveAtomic returns [EObject current=null] : iv_rulePositiveAtomic= rulePositiveAtomic EOF ;
    public final EObject entryRulePositiveAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveAtomic = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1083:55: (iv_rulePositiveAtomic= rulePositiveAtomic EOF )
            // InternalInterparameterDependenciesLanguage.g:1084:2: iv_rulePositiveAtomic= rulePositiveAtomic EOF
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
    // InternalInterparameterDependenciesLanguage.g:1090:1: rulePositiveAtomic returns [EObject current=null] : (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency ) ;
    public final EObject rulePositiveAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_Param_0 = null;

        EObject this_ParamAssignment_1 = null;

        EObject this_ArithmeticDependency_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1096:2: ( (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency ) )
            // InternalInterparameterDependenciesLanguage.g:1097:2: (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:1097:2: (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==RULE_STRING) ) {
                        alt21=2;
                    }
                    else if ( (LA21_2==RULE_ID) ) {
                        alt21=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

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
                    alt21=1;
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                    {
                    alt21=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1098:3: this_Param_0= ruleParam
                    {

                    			newCompositeNode(grammarAccess.getPositiveAtomicAccess().getParamParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Param_0=ruleParam();

                    state._fsp--;


                    			current = this_Param_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1107:3: this_ParamAssignment_1= ruleParamAssignment
                    {

                    			newCompositeNode(grammarAccess.getPositiveAtomicAccess().getParamAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParamAssignment_1=ruleParamAssignment();

                    state._fsp--;


                    			current = this_ParamAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:1116:3: this_ArithmeticDependency_2= ruleArithmeticDependency
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


    // $ANTLR start "entryRulePositiveClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:1128:1: entryRulePositiveClauseContinuation returns [EObject current=null] : iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF ;
    public final EObject entryRulePositiveClauseContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClauseContinuation = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1128:67: (iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF )
            // InternalInterparameterDependenciesLanguage.g:1129:2: iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF
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
    // InternalInterparameterDependenciesLanguage.g:1135:1: rulePositiveClauseContinuation returns [EObject current=null] : ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) ) ) ) ;
    public final EObject rulePositiveClauseContinuation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_logicalOp_0_0 = null;

        EObject lv_additionalElements_1_1 = null;

        EObject lv_additionalElements_1_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1141:2: ( ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:1142:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1142:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:1143:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1143:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) )
            // InternalInterparameterDependenciesLanguage.g:1144:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            {
            // InternalInterparameterDependenciesLanguage.g:1144:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            // InternalInterparameterDependenciesLanguage.g:1145:5: lv_logicalOp_0_0= ruleLogicalOperator
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

            // InternalInterparameterDependenciesLanguage.g:1162:3: ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) ) )
            // InternalInterparameterDependenciesLanguage.g:1163:4: ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1163:4: ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause ) )
            // InternalInterparameterDependenciesLanguage.g:1164:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause )
            {
            // InternalInterparameterDependenciesLanguage.g:1164:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1165:6: lv_additionalElements_1_1= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsPositiveAtomicParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_1=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_1,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1181:6: lv_additionalElements_1_2= rulePositiveClause
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsPositiveClauseParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_2=rulePositiveClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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


    // $ANTLR start "entryRulePositiveClause"
    // InternalInterparameterDependenciesLanguage.g:1203:1: entryRulePositiveClause returns [EObject current=null] : iv_rulePositiveClause= rulePositiveClause EOF ;
    public final EObject entryRulePositiveClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClause = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1203:55: (iv_rulePositiveClause= rulePositiveClause EOF )
            // InternalInterparameterDependenciesLanguage.g:1204:2: iv_rulePositiveClause= rulePositiveClause EOF
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
    // InternalInterparameterDependenciesLanguage.g:1210:1: rulePositiveClause returns [EObject current=null] : ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | (this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) ) ;
    public final EObject rulePositiveClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_positiveFirstElement_0_0 = null;

        EObject lv_positiveClauseContinuation_1_0 = null;

        EObject lv_positiveFirstElement_3_1 = null;

        EObject lv_positiveFirstElement_3_2 = null;

        EObject lv_positiveClauseContinuation_4_0 = null;

        EObject lv_positiveClauseContinuation2_6_0 = null;

        EObject this_PositivePredefinedDependency_7 = null;

        EObject lv_positiveClauseContinuation_8_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1216:2: ( ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | (this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) ) )
            // InternalInterparameterDependenciesLanguage.g:1217:2: ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | (this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1217:2: ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | (otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )? ) | (this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )? ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt26=1;
                }
                break;
            case 22:
                {
                alt26=2;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1218:3: ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1218:3: ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1219:4: ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1219:4: ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:1220:5: (lv_positiveFirstElement_0_0= rulePositiveAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1220:5: (lv_positiveFirstElement_0_0= rulePositiveAtomic )
                    // InternalInterparameterDependenciesLanguage.g:1221:6: lv_positiveFirstElement_0_0= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveFirstElementPositiveAtomicParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_positiveFirstElement_0_0=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"positiveFirstElement",
                    							lv_positiveFirstElement_0_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1238:4: ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1239:5: (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1239:5: (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1240:6: lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClauseContinuationPositiveClauseContinuationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_positiveClauseContinuation_1_0=rulePositiveClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"positiveClauseContinuation",
                    							lv_positiveClauseContinuation_1_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1259:3: (otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1259:3: (otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1260:4: otherlv_2= '(' ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) ) ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) ) otherlv_5= ')' ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )?
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getPositiveClauseAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1264:4: ( ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1265:5: ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1265:5: ( (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency ) )
                    // InternalInterparameterDependenciesLanguage.g:1266:6: (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1266:6: (lv_positiveFirstElement_3_1= rulePositiveAtomic | lv_positiveFirstElement_3_2= rulePositivePredefinedDependency )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_0>=24 && LA23_0<=27)) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1267:7: lv_positiveFirstElement_3_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveFirstElementPositiveAtomicParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_positiveFirstElement_3_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            							}
                            							set(
                            								current,
                            								"positiveFirstElement",
                            								lv_positiveFirstElement_3_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:1283:7: lv_positiveFirstElement_3_2= rulePositivePredefinedDependency
                            {

                            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveFirstElementPositivePredefinedDependencyParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FOLLOW_14);
                            lv_positiveFirstElement_3_2=rulePositivePredefinedDependency();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            							}
                            							set(
                            								current,
                            								"positiveFirstElement",
                            								lv_positiveFirstElement_3_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositivePredefinedDependency");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1301:4: ( (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1302:5: (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1302:5: (lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1303:6: lv_positiveClauseContinuation_4_0= rulePositiveClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClauseContinuationPositiveClauseContinuationParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_positiveClauseContinuation_4_0=rulePositiveClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                    						}
                    						set(
                    							current,
                    							"positiveClauseContinuation",
                    							lv_positiveClauseContinuation_4_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getPositiveClauseAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1324:4: ( (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=30 && LA24_0<=31)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1325:5: (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1325:5: (lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1326:6: lv_positiveClauseContinuation2_6_0= rulePositiveClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClauseContinuation2PositiveClauseContinuationParserRuleCall_1_4_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_positiveClauseContinuation2_6_0=rulePositiveClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            						}
                            						set(
                            							current,
                            							"positiveClauseContinuation2",
                            							lv_positiveClauseContinuation2_6_0,
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
                    // InternalInterparameterDependenciesLanguage.g:1345:3: (this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1345:3: (this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1346:4: this_PositivePredefinedDependency_7= rulePositivePredefinedDependency ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )?
                    {

                    				newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositivePredefinedDependencyParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_18);
                    this_PositivePredefinedDependency_7=rulePositivePredefinedDependency();

                    state._fsp--;


                    				current = this_PositivePredefinedDependency_7;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalInterparameterDependenciesLanguage.g:1354:4: ( (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=30 && LA25_0<=31)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1355:5: (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1355:5: (lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1356:6: lv_positiveClauseContinuation_8_0= rulePositiveClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClauseContinuationPositiveClauseContinuationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_positiveClauseContinuation_8_0=rulePositiveClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
                            						}
                            						set(
                            							current,
                            							"positiveClauseContinuation",
                            							lv_positiveClauseContinuation_8_0,
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


    // $ANTLR start "entryRulePositivePredefinedDependency"
    // InternalInterparameterDependenciesLanguage.g:1378:1: entryRulePositivePredefinedDependency returns [EObject current=null] : iv_rulePositivePredefinedDependency= rulePositivePredefinedDependency EOF ;
    public final EObject entryRulePositivePredefinedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositivePredefinedDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1378:69: (iv_rulePositivePredefinedDependency= rulePositivePredefinedDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:1379:2: iv_rulePositivePredefinedDependency= rulePositivePredefinedDependency EOF
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
    // InternalInterparameterDependenciesLanguage.g:1385:1: rulePositivePredefinedDependency returns [EObject current=null] : ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) ) ) (otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) ) )+ otherlv_5= ')' ) ;
    public final EObject rulePositivePredefinedDependency() throws RecognitionException {
        EObject current = null;

        Token lv_predefDepType_0_1=null;
        Token lv_predefDepType_0_2=null;
        Token lv_predefDepType_0_3=null;
        Token lv_predefDepType_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_predefDepClauses_2_1 = null;

        EObject lv_predefDepClauses_2_2 = null;

        EObject lv_predefDepClauses_4_1 = null;

        EObject lv_predefDepClauses_4_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1391:2: ( ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) ) ) (otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) ) )+ otherlv_5= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:1392:2: ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) ) ) (otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) ) )+ otherlv_5= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:1392:2: ( ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) ) ) (otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) ) )+ otherlv_5= ')' )
            // InternalInterparameterDependenciesLanguage.g:1393:3: ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) ) otherlv_1= '(' ( ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) ) ) (otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) ) )+ otherlv_5= ')'
            {
            // InternalInterparameterDependenciesLanguage.g:1393:3: ( ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) ) )
            // InternalInterparameterDependenciesLanguage.g:1394:4: ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1394:4: ( (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' ) )
            // InternalInterparameterDependenciesLanguage.g:1395:5: (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' )
            {
            // InternalInterparameterDependenciesLanguage.g:1395:5: (lv_predefDepType_0_1= 'Or' | lv_predefDepType_0_2= 'OnlyOne' | lv_predefDepType_0_3= 'AllOrNone' | lv_predefDepType_0_4= 'ZeroOrOne' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt27=1;
                }
                break;
            case 25:
                {
                alt27=2;
                }
                break;
            case 26:
                {
                alt27=3;
                }
                break;
            case 27:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1396:6: lv_predefDepType_0_1= 'Or'
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
                    // InternalInterparameterDependenciesLanguage.g:1407:6: lv_predefDepType_0_2= 'OnlyOne'
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
                    // InternalInterparameterDependenciesLanguage.g:1418:6: lv_predefDepType_0_3= 'AllOrNone'
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
                    // InternalInterparameterDependenciesLanguage.g:1429:6: lv_predefDepType_0_4= 'ZeroOrOne'
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
            		
            // InternalInterparameterDependenciesLanguage.g:1446:3: ( ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) ) )
            // InternalInterparameterDependenciesLanguage.g:1447:4: ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1447:4: ( (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause ) )
            // InternalInterparameterDependenciesLanguage.g:1448:5: (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause )
            {
            // InternalInterparameterDependenciesLanguage.g:1448:5: (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1449:6: lv_predefDepClauses_2_1= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesPositiveAtomicParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_predefDepClauses_2_1=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositivePredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_2_1,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1465:6: lv_predefDepClauses_2_2= rulePositiveClause
                    {

                    						newCompositeNode(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesPositiveClauseParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_21);
                    lv_predefDepClauses_2_2=rulePositiveClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositivePredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_2_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalInterparameterDependenciesLanguage.g:1483:3: (otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:1484:4: otherlv_3= ',' ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPositivePredefinedDependencyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:1488:4: ( ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) ) )
            	    // InternalInterparameterDependenciesLanguage.g:1489:5: ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1489:5: ( (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause ) )
            	    // InternalInterparameterDependenciesLanguage.g:1490:6: (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1490:6: (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause )
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // InternalInterparameterDependenciesLanguage.g:1491:7: lv_predefDepClauses_4_1= rulePositiveAtomic
            	            {

            	            							newCompositeNode(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesPositiveAtomicParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_22);
            	            lv_predefDepClauses_4_1=rulePositiveAtomic();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPositivePredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_4_1,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalInterparameterDependenciesLanguage.g:1507:7: lv_predefDepClauses_4_2= rulePositiveClause
            	            {

            	            							newCompositeNode(grammarAccess.getPositivePredefinedDependencyAccess().getPredefDepClausesPositiveClauseParserRuleCall_3_1_0_1());
            	            						
            	            pushFollow(FOLLOW_22);
            	            lv_predefDepClauses_4_2=rulePositiveClause();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPositivePredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_4_2,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // InternalInterparameterDependenciesLanguage.g:1534:1: entryRuleNot returns [String current=null] : iv_ruleNot= ruleNot EOF ;
    public final String entryRuleNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNot = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1534:43: (iv_ruleNot= ruleNot EOF )
            // InternalInterparameterDependenciesLanguage.g:1535:2: iv_ruleNot= ruleNot EOF
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
    // InternalInterparameterDependenciesLanguage.g:1541:1: ruleNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1547:2: (kw= 'NOT' )
            // InternalInterparameterDependenciesLanguage.g:1548:2: kw= 'NOT'
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
    // InternalInterparameterDependenciesLanguage.g:1556:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1556:55: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalInterparameterDependenciesLanguage.g:1557:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalInterparameterDependenciesLanguage.g:1563:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1569:2: ( (kw= 'AND' | kw= 'OR' ) )
            // InternalInterparameterDependenciesLanguage.g:1570:2: (kw= 'AND' | kw= 'OR' )
            {
            // InternalInterparameterDependenciesLanguage.g:1570:2: (kw= 'AND' | kw= 'OR' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            else if ( (LA31_0==31) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1571:3: kw= 'AND'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getANDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1577:3: kw= 'OR'
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
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\2\uffff\1\13\1\uffff\1\13\10\uffff\2\13\1\uffff\1\13";
    static final String dfa_3s = "\2\5\1\14\1\uffff\1\14\6\5\1\uffff\1\6\2\14\1\6\1\14";
    static final String dfa_4s = "\1\35\1\33\1\37\1\uffff\1\37\4\5\1\6\1\5\1\uffff\1\6\2\37\1\6\1\37";
    static final String dfa_5s = "\3\uffff\1\1\7\uffff\1\2\5\uffff";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\20\uffff\1\3\1\uffff\4\3\1\uffff\1\1",
            "\1\4\20\uffff\1\3\1\uffff\4\3",
            "\1\13\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\13\11\uffff\2\3",
            "",
            "\1\13\4\uffff\1\14\2\uffff\1\13\11\uffff\2\3",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15\1\16",
            "\1\15",
            "",
            "\1\16",
            "\1\13\7\uffff\1\13\11\uffff\2\3",
            "\1\13\7\uffff\1\13\1\17\10\uffff\2\3",
            "\1\20",
            "\1\13\7\uffff\1\13\1\17\10\uffff\2\3"
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
            return "389:2: (this_Clause_0= ruleClause | this_Atomic_1= ruleAtomic )";
        }
    }
    static final String dfa_8s = "\1\35\1\33\1\37\1\uffff\1\37\1\6\5\5\1\uffff\1\6\2\37\1\6\1\37";
    static final String dfa_9s = "\3\uffff\1\2\7\uffff\1\1\5\uffff";
    static final String[] dfa_10s = {
            "\1\2\20\uffff\1\3\1\uffff\4\3\1\uffff\1\1",
            "\1\4\20\uffff\1\3\1\uffff\4\3",
            "\1\13\1\6\1\7\1\10\1\11\1\5\1\12\1\uffff\1\13\2\uffff\1\13\6\uffff\2\3",
            "",
            "\1\13\4\uffff\1\14\2\uffff\1\13\2\uffff\1\13\6\uffff\2\3",
            "\1\15\1\16",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            "\1\16",
            "\1\13\7\uffff\1\13\2\uffff\1\13\6\uffff\2\3",
            "\1\13\7\uffff\1\13\1\17\1\uffff\1\13\6\uffff\2\3",
            "\1\20",
            "\1\13\7\uffff\1\13\1\17\1\uffff\1\13\6\uffff\2\3"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "869:5: (lv_additionalElements_1_1= ruleAtomic | lv_additionalElements_1_2= ruleClause )";
        }
    }
    static final String dfa_11s = "\16\uffff";
    static final String dfa_12s = "\1\5\1\15\1\uffff\6\5\1\uffff\1\25\1\34\1\6\1\25";
    static final String dfa_13s = "\1\33\1\37\1\uffff\1\6\5\5\1\uffff\2\37\1\6\1\37";
    static final String dfa_14s = "\2\uffff\1\2\6\uffff\1\1\4\uffff";
    static final String dfa_15s = "\16\uffff}>";
    static final String[] dfa_16s = {
            "\1\1\20\uffff\1\2\1\uffff\4\2",
            "\1\4\1\5\1\6\1\7\1\3\1\10\11\uffff\1\11\1\uffff\2\2",
            "",
            "\1\13\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "\1\14\6\uffff\1\11\1\uffff\2\2",
            "\1\11\1\uffff\2\2",
            "\1\15",
            "\1\14\6\uffff\1\11\1\uffff\2\2"
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_12;
            this.max = dfa_13;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "997:5: (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause )";
        }
    }
    static final String dfa_17s = "\1\5\1\15\2\uffff\6\5\1\27\1\25\1\6\1\25";
    static final String dfa_18s = "\1\33\1\37\2\uffff\1\6\5\5\2\37\1\6\1\37";
    static final String dfa_19s = "\2\uffff\1\2\1\1\12\uffff";
    static final String[] dfa_20s = {
            "\1\1\20\uffff\1\2\1\uffff\4\2",
            "\1\5\1\6\1\7\1\10\1\4\1\11\4\uffff\1\3\4\uffff\1\3\1\uffff\2\2",
            "",
            "",
            "\1\12\1\13",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\3\4\uffff\1\3\1\uffff\2\2",
            "\1\14\1\uffff\1\3\4\uffff\1\3\1\uffff\2\2",
            "\1\15",
            "\1\14\1\uffff\1\3\4\uffff\1\3\1\uffff\2\2"
    };
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_15;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1039:6: (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause )";
        }
    }
    static final String dfa_21s = "\1\uffff\1\11\10\uffff\2\11\1\uffff\1\11";
    static final String dfa_22s = "\1\5\1\15\1\uffff\6\5\1\uffff\1\27\1\25\1\6\1\25";
    static final String[] dfa_23s = {
            "\1\1\20\uffff\1\2\1\uffff\4\2",
            "\1\4\1\5\1\6\1\7\1\3\1\10\4\uffff\1\11\4\uffff\1\11\1\uffff\2\2",
            "",
            "\1\12\1\13",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "",
            "\1\11\4\uffff\1\11\1\uffff\2\2",
            "\1\14\1\uffff\1\11\4\uffff\1\11\1\uffff\2\2",
            "\1\15",
            "\1\14\1\uffff\1\11\4\uffff\1\11\1\uffff\2\2"
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_11;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_13;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1164:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause )";
        }
    }
    static final String dfa_24s = "\1\5\1\15\1\uffff\6\5\1\uffff\1\34\1\25\1\6\1\25";
    static final String dfa_25s = "\1\33\1\37\1\uffff\4\5\1\6\1\5\1\uffff\2\37\1\6\1\37";
    static final String[] dfa_26s = {
            "\1\1\20\uffff\1\2\1\uffff\4\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\11\uffff\1\11\1\uffff\2\2",
            "",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12\1\13",
            "\1\12",
            "",
            "\1\11\1\uffff\2\2",
            "\1\14\6\uffff\1\11\1\uffff\2\2",
            "\1\15",
            "\1\14\6\uffff\1\11\1\uffff\2\2"
    };
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1448:5: (lv_predefDepClauses_2_1= rulePositiveAtomic | lv_predefDepClauses_2_2= rulePositiveClause )";
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_15;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1490:6: (lv_predefDepClauses_4_1= rulePositiveAtomic | lv_predefDepClauses_4_2= rulePositiveClause )";
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