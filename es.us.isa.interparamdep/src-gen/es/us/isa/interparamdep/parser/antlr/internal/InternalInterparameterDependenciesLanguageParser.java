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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'IF'", "'THEN'", "'('", "')'", "'Or'", "'OnlyOne'", "'AllOrNone'", "'ZeroOrOne'", "','", "'NOT'", "'AND'", "'OR'", "'|'"
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

                if ( (LA1_0==RULE_ID||LA1_0==19||(LA1_0>=23 && LA1_0<=26)||LA1_0==28) ) {
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
    // InternalInterparameterDependenciesLanguage.g:107:1: ruleDependency returns [EObject current=null] : ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_NL_2=null;
        EObject lv_dep_0_1 = null;

        EObject lv_dep_0_2 = null;

        EObject lv_dep_0_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:113:2: ( ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? ) )
            // InternalInterparameterDependenciesLanguage.g:114:2: ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? )
            {
            // InternalInterparameterDependenciesLanguage.g:114:2: ( ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )? )
            // InternalInterparameterDependenciesLanguage.g:115:3: ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) ) ) otherlv_1= ';' (this_NL_2= RULE_NL )?
            {
            // InternalInterparameterDependenciesLanguage.g:115:3: ( ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) ) )
            // InternalInterparameterDependenciesLanguage.g:116:4: ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) )
            {
            // InternalInterparameterDependenciesLanguage.g:116:4: ( (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 ) )
            // InternalInterparameterDependenciesLanguage.g:117:5: (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 )
            {
            // InternalInterparameterDependenciesLanguage.g:117:5: (lv_dep_0_1= ruleArithmeticDependency | lv_dep_0_2= ruleConditionalDependency | lv_dep_0_3= rulePredefinedDependency2 )
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
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
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
                    // InternalInterparameterDependenciesLanguage.g:150:6: lv_dep_0_3= rulePredefinedDependency2
                    {

                    						newCompositeNode(grammarAccess.getDependencyAccess().getDepPredefinedDependency2ParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_4);
                    lv_dep_0_3=rulePredefinedDependency2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependencyRule());
                    						}
                    						set(
                    							current,
                    							"dep",
                    							lv_dep_0_3,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency2");
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
    // InternalInterparameterDependenciesLanguage.g:317:1: ruleConditionalDependency returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate2 ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate2 ) ) ) ;
    public final EObject ruleConditionalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_consequence_3_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:323:2: ( (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate2 ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate2 ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:324:2: (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate2 ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate2 ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:324:2: (otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate2 ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate2 ) ) )
            // InternalInterparameterDependenciesLanguage.g:325:3: otherlv_0= 'IF' ( (lv_condition_1_0= rulePredicate2 ) ) otherlv_2= 'THEN' ( (lv_consequence_3_0= rulePredicate2 ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalDependencyAccess().getIFKeyword_0());
            		
            // InternalInterparameterDependenciesLanguage.g:329:3: ( (lv_condition_1_0= rulePredicate2 ) )
            // InternalInterparameterDependenciesLanguage.g:330:4: (lv_condition_1_0= rulePredicate2 )
            {
            // InternalInterparameterDependenciesLanguage.g:330:4: (lv_condition_1_0= rulePredicate2 )
            // InternalInterparameterDependenciesLanguage.g:331:5: lv_condition_1_0= rulePredicate2
            {

            					newCompositeNode(grammarAccess.getConditionalDependencyAccess().getConditionPredicate2ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_1_0=rulePredicate2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Predicate2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalDependencyAccess().getTHENKeyword_2());
            		
            // InternalInterparameterDependenciesLanguage.g:352:3: ( (lv_consequence_3_0= rulePredicate2 ) )
            // InternalInterparameterDependenciesLanguage.g:353:4: (lv_consequence_3_0= rulePredicate2 )
            {
            // InternalInterparameterDependenciesLanguage.g:353:4: (lv_consequence_3_0= rulePredicate2 )
            // InternalInterparameterDependenciesLanguage.g:354:5: lv_consequence_3_0= rulePredicate2
            {

            					newCompositeNode(grammarAccess.getConditionalDependencyAccess().getConsequencePredicate2ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_consequence_3_0=rulePredicate2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
            					}
            					set(
            						current,
            						"consequence",
            						lv_consequence_3_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Predicate2");
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


    // $ANTLR start "entryRulePredicate2"
    // InternalInterparameterDependenciesLanguage.g:375:1: entryRulePredicate2 returns [EObject current=null] : iv_rulePredicate2= rulePredicate2 EOF ;
    public final EObject entryRulePredicate2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate2 = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:375:51: (iv_rulePredicate2= rulePredicate2 EOF )
            // InternalInterparameterDependenciesLanguage.g:376:2: iv_rulePredicate2= rulePredicate2 EOF
            {
             newCompositeNode(grammarAccess.getPredicate2Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate2=rulePredicate2();

            state._fsp--;

             current =iv_rulePredicate2; 
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
    // $ANTLR end "entryRulePredicate2"


    // $ANTLR start "rulePredicate2"
    // InternalInterparameterDependenciesLanguage.g:382:1: rulePredicate2 returns [EObject current=null] : (this_Clause3_0= ruleClause3 | this_PositiveAtomic_1= rulePositiveAtomic | this_NegativeAtomic_2= ruleNegativeAtomic ) ;
    public final EObject rulePredicate2() throws RecognitionException {
        EObject current = null;

        EObject this_Clause3_0 = null;

        EObject this_PositiveAtomic_1 = null;

        EObject this_NegativeAtomic_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:388:2: ( (this_Clause3_0= ruleClause3 | this_PositiveAtomic_1= rulePositiveAtomic | this_NegativeAtomic_2= ruleNegativeAtomic ) )
            // InternalInterparameterDependenciesLanguage.g:389:2: (this_Clause3_0= ruleClause3 | this_PositiveAtomic_1= rulePositiveAtomic | this_NegativeAtomic_2= ruleNegativeAtomic )
            {
            // InternalInterparameterDependenciesLanguage.g:389:2: (this_Clause3_0= ruleClause3 | this_PositiveAtomic_1= rulePositiveAtomic | this_NegativeAtomic_2= ruleNegativeAtomic )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:390:3: this_Clause3_0= ruleClause3
                    {

                    			newCompositeNode(grammarAccess.getPredicate2Access().getClause3ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause3_0=ruleClause3();

                    state._fsp--;


                    			current = this_Clause3_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:399:3: this_PositiveAtomic_1= rulePositiveAtomic
                    {

                    			newCompositeNode(grammarAccess.getPredicate2Access().getPositiveAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PositiveAtomic_1=rulePositiveAtomic();

                    state._fsp--;


                    			current = this_PositiveAtomic_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:408:3: this_NegativeAtomic_2= ruleNegativeAtomic
                    {

                    			newCompositeNode(grammarAccess.getPredicate2Access().getNegativeAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegativeAtomic_2=ruleNegativeAtomic();

                    state._fsp--;


                    			current = this_NegativeAtomic_2;
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
    // $ANTLR end "rulePredicate2"


    // $ANTLR start "entryRuleClause"
    // InternalInterparameterDependenciesLanguage.g:420:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:420:47: (iv_ruleClause= ruleClause EOF )
            // InternalInterparameterDependenciesLanguage.g:421:2: iv_ruleClause= ruleClause EOF
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
    // InternalInterparameterDependenciesLanguage.g:427:1: ruleClause returns [EObject current=null] : ( ( ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )* ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')' ) | this_PredefinedDependency_9= rulePredefinedDependency ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_atomicElements_0_1 = null;

        EObject lv_atomicElements_0_2 = null;

        EObject lv_atomicElements_2_1 = null;

        EObject lv_atomicElements_2_2 = null;

        EObject lv_clauses_5_0 = null;

        EObject lv_clauses_7_0 = null;

        EObject this_PredefinedDependency_9 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:433:2: ( ( ( ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )* ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')' ) | this_PredefinedDependency_9= rulePredefinedDependency ) )
            // InternalInterparameterDependenciesLanguage.g:434:2: ( ( ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )* ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')' ) | this_PredefinedDependency_9= rulePredefinedDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:434:2: ( ( ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )* ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')' ) | this_PredefinedDependency_9= rulePredefinedDependency )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt11=3;
                    }
                    break;
                case 21:
                    {
                    alt11=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:435:3: ( ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )* )
                    {
                    // InternalInterparameterDependenciesLanguage.g:435:3: ( ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )* )
                    // InternalInterparameterDependenciesLanguage.g:436:4: ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) ) ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )*
                    {
                    // InternalInterparameterDependenciesLanguage.g:436:4: ( ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) ) )
                    // InternalInterparameterDependenciesLanguage.g:437:5: ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:437:5: ( (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:438:6: (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:438:6: (lv_atomicElements_0_1= rulePositiveAtomic | lv_atomicElements_0_2= ruleNegativeAtomic )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==28) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:439:7: lv_atomicElements_0_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClauseAccess().getAtomicElementsPositiveAtomicParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_atomicElements_0_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClauseRule());
                            							}
                            							add(
                            								current,
                            								"atomicElements",
                            								lv_atomicElements_0_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:455:7: lv_atomicElements_0_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClauseAccess().getAtomicElementsNegativeAtomicParserRuleCall_0_0_0_1());
                            						
                            pushFollow(FOLLOW_10);
                            lv_atomicElements_0_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClauseRule());
                            							}
                            							add(
                            								current,
                            								"atomicElements",
                            								lv_atomicElements_0_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:473:4: ( ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==29) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==RULE_ID) ) {
                                alt8=1;
                            }
                            else if ( (LA8_2==28) ) {
                                int LA8_5 = input.LA(3);

                                if ( (LA8_5==RULE_ID) ) {
                                    alt8=1;
                                }


                            }


                        }
                        else if ( (LA8_0==30) ) {
                            int LA8_3 = input.LA(2);

                            if ( (LA8_3==RULE_ID) ) {
                                alt8=1;
                            }
                            else if ( (LA8_3==28) ) {
                                int LA8_5 = input.LA(3);

                                if ( (LA8_5==RULE_ID) ) {
                                    alt8=1;
                                }


                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalInterparameterDependenciesLanguage.g:474:5: ruleLogicalOperator ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getClauseAccess().getLogicalOperatorParserRuleCall_0_1_0());
                    	    				
                    	    pushFollow(FOLLOW_11);
                    	    ruleLogicalOperator();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalInterparameterDependenciesLanguage.g:481:5: ( ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) ) )
                    	    // InternalInterparameterDependenciesLanguage.g:482:6: ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) )
                    	    {
                    	    // InternalInterparameterDependenciesLanguage.g:482:6: ( (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic ) )
                    	    // InternalInterparameterDependenciesLanguage.g:483:7: (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic )
                    	    {
                    	    // InternalInterparameterDependenciesLanguage.g:483:7: (lv_atomicElements_2_1= rulePositiveAtomic | lv_atomicElements_2_2= ruleNegativeAtomic )
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==RULE_ID) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==28) ) {
                    	        alt7=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 7, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalInterparameterDependenciesLanguage.g:484:8: lv_atomicElements_2_1= rulePositiveAtomic
                    	            {

                    	            								newCompositeNode(grammarAccess.getClauseAccess().getAtomicElementsPositiveAtomicParserRuleCall_0_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_10);
                    	            lv_atomicElements_2_1=rulePositiveAtomic();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getClauseRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"atomicElements",
                    	            									lv_atomicElements_2_1,
                    	            									"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalInterparameterDependenciesLanguage.g:500:8: lv_atomicElements_2_2= ruleNegativeAtomic
                    	            {

                    	            								newCompositeNode(grammarAccess.getClauseAccess().getAtomicElementsNegativeAtomicParserRuleCall_0_1_1_0_1());
                    	            							
                    	            pushFollow(FOLLOW_10);
                    	            lv_atomicElements_2_2=ruleNegativeAtomic();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getClauseRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"atomicElements",
                    	            									lv_atomicElements_2_2,
                    	            									"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:521:3: ( ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')' )
                    {
                    // InternalInterparameterDependenciesLanguage.g:521:3: ( ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')' )
                    // InternalInterparameterDependenciesLanguage.g:522:4: ( ruleNot )? otherlv_4= '(' ( (lv_clauses_5_0= ruleClause ) ) ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )* otherlv_8= ')'
                    {
                    // InternalInterparameterDependenciesLanguage.g:522:4: ( ruleNot )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==28) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:523:5: ruleNot
                            {

                            					newCompositeNode(grammarAccess.getClauseAccess().getNotParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_12);
                            ruleNot();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInterparameterDependenciesLanguage.g:535:4: ( (lv_clauses_5_0= ruleClause ) )
                    // InternalInterparameterDependenciesLanguage.g:536:5: (lv_clauses_5_0= ruleClause )
                    {
                    // InternalInterparameterDependenciesLanguage.g:536:5: (lv_clauses_5_0= ruleClause )
                    // InternalInterparameterDependenciesLanguage.g:537:6: lv_clauses_5_0= ruleClause
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getClausesClauseParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_clauses_5_0=ruleClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						add(
                    							current,
                    							"clauses",
                    							lv_clauses_5_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Clause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:554:4: ( ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=29 && LA10_0<=30)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalInterparameterDependenciesLanguage.g:555:5: ruleLogicalOperator ( (lv_clauses_7_0= ruleClause ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getClauseAccess().getLogicalOperatorParserRuleCall_1_3_0());
                    	    				
                    	    pushFollow(FOLLOW_13);
                    	    ruleLogicalOperator();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalInterparameterDependenciesLanguage.g:562:5: ( (lv_clauses_7_0= ruleClause ) )
                    	    // InternalInterparameterDependenciesLanguage.g:563:6: (lv_clauses_7_0= ruleClause )
                    	    {
                    	    // InternalInterparameterDependenciesLanguage.g:563:6: (lv_clauses_7_0= ruleClause )
                    	    // InternalInterparameterDependenciesLanguage.g:564:7: lv_clauses_7_0= ruleClause
                    	    {

                    	    							newCompositeNode(grammarAccess.getClauseAccess().getClausesClauseParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_clauses_7_0=ruleClause();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClauseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clauses",
                    	    								lv_clauses_7_0,
                    	    								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Clause");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getClauseAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:588:3: this_PredefinedDependency_9= rulePredefinedDependency
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getPredefinedDependencyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredefinedDependency_9=rulePredefinedDependency();

                    state._fsp--;


                    			current = this_PredefinedDependency_9;
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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleClause2"
    // InternalInterparameterDependenciesLanguage.g:600:1: entryRuleClause2 returns [EObject current=null] : iv_ruleClause2= ruleClause2 EOF ;
    public final EObject entryRuleClause2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause2 = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:600:48: (iv_ruleClause2= ruleClause2 EOF )
            // InternalInterparameterDependenciesLanguage.g:601:2: iv_ruleClause2= ruleClause2 EOF
            {
             newCompositeNode(grammarAccess.getClause2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause2=ruleClause2();

            state._fsp--;

             current =iv_ruleClause2; 
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
    // $ANTLR end "entryRuleClause2"


    // $ANTLR start "ruleClause2"
    // InternalInterparameterDependenciesLanguage.g:607:1: ruleClause2 returns [EObject current=null] : ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleClause2() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_firstElement_0_1 = null;

        EObject lv_firstElement_0_2 = null;

        AntlrDatatypeRuleToken lv_logicalOp_1_0 = null;

        EObject lv_additionalElements_2_1 = null;

        EObject lv_additionalElements_2_2 = null;

        EObject lv_additionalElements_2_3 = null;

        EObject lv_firstElement_5_1 = null;

        EObject lv_firstElement_5_2 = null;

        AntlrDatatypeRuleToken lv_logicalOp_6_0 = null;

        EObject lv_additionalElements_7_1 = null;

        EObject lv_additionalElements_7_2 = null;

        EObject lv_additionalElements_7_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:613:2: ( ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')' ) ) )
            // InternalInterparameterDependenciesLanguage.g:614:2: ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:614:2: ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')' ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID) ) {
                    alt17=1;
                }
                else if ( (LA17_2==21) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:615:3: ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:615:3: ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) ) )
                    // InternalInterparameterDependenciesLanguage.g:616:4: ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:616:4: ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) )
                    // InternalInterparameterDependenciesLanguage.g:617:5: ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:617:5: ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:618:6: (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:618:6: (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==28) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:619:7: lv_firstElement_0_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getFirstElementPositiveAtomicParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_0_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_0_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:635:7: lv_firstElement_0_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getFirstElementNegativeAtomicParserRuleCall_0_0_0_1());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_0_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_0_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:653:4: ( (lv_logicalOp_1_0= ruleLogicalOperator ) )
                    // InternalInterparameterDependenciesLanguage.g:654:5: (lv_logicalOp_1_0= ruleLogicalOperator )
                    {
                    // InternalInterparameterDependenciesLanguage.g:654:5: (lv_logicalOp_1_0= ruleLogicalOperator )
                    // InternalInterparameterDependenciesLanguage.g:655:6: lv_logicalOp_1_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getClause2Access().getLogicalOpLogicalOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_logicalOp_1_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClause2Rule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_1_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:672:4: ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) ) )
                    // InternalInterparameterDependenciesLanguage.g:673:5: ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:673:5: ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 ) )
                    // InternalInterparameterDependenciesLanguage.g:674:6: (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:674:6: (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 )
                    int alt13=3;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:675:7: lv_additionalElements_2_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getAdditionalElementsPositiveAtomicParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_additionalElements_2_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_2_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:691:7: lv_additionalElements_2_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getAdditionalElementsNegativeAtomicParserRuleCall_0_2_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_additionalElements_2_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_2_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalInterparameterDependenciesLanguage.g:707:7: lv_additionalElements_2_3= ruleClause2
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getAdditionalElementsClause2ParserRuleCall_0_2_0_2());
                            						
                            pushFollow(FOLLOW_2);
                            lv_additionalElements_2_3=ruleClause2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_2_3,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Clause2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:727:3: ( ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')' )
                    {
                    // InternalInterparameterDependenciesLanguage.g:727:3: ( ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')' )
                    // InternalInterparameterDependenciesLanguage.g:728:4: ( ruleNot )? otherlv_4= '(' ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) ) otherlv_8= ')'
                    {
                    // InternalInterparameterDependenciesLanguage.g:728:4: ( ruleNot )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:729:5: ruleNot
                            {

                            					newCompositeNode(grammarAccess.getClause2Access().getNotParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_12);
                            ruleNot();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getClause2Access().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInterparameterDependenciesLanguage.g:741:4: ( ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) ) )
                    // InternalInterparameterDependenciesLanguage.g:742:5: ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:742:5: ( (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:743:6: (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:743:6: (lv_firstElement_5_1= rulePositiveAtomic | lv_firstElement_5_2= ruleNegativeAtomic )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==28) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:744:7: lv_firstElement_5_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getFirstElementPositiveAtomicParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_5_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_5_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:760:7: lv_firstElement_5_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getFirstElementNegativeAtomicParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_5_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_5_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:778:4: ( (lv_logicalOp_6_0= ruleLogicalOperator ) )
                    // InternalInterparameterDependenciesLanguage.g:779:5: (lv_logicalOp_6_0= ruleLogicalOperator )
                    {
                    // InternalInterparameterDependenciesLanguage.g:779:5: (lv_logicalOp_6_0= ruleLogicalOperator )
                    // InternalInterparameterDependenciesLanguage.g:780:6: lv_logicalOp_6_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getClause2Access().getLogicalOpLogicalOperatorParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_logicalOp_6_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClause2Rule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_6_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:797:4: ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) ) )
                    // InternalInterparameterDependenciesLanguage.g:798:5: ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:798:5: ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 ) )
                    // InternalInterparameterDependenciesLanguage.g:799:6: (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:799:6: (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:800:7: lv_additionalElements_7_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getAdditionalElementsPositiveAtomicParserRuleCall_1_4_0_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_additionalElements_7_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_7_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:816:7: lv_additionalElements_7_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getAdditionalElementsNegativeAtomicParserRuleCall_1_4_0_1());
                            						
                            pushFollow(FOLLOW_17);
                            lv_additionalElements_7_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_7_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalInterparameterDependenciesLanguage.g:832:7: lv_additionalElements_7_3= ruleClause2
                            {

                            							newCompositeNode(grammarAccess.getClause2Access().getAdditionalElementsClause2ParserRuleCall_1_4_0_2());
                            						
                            pushFollow(FOLLOW_17);
                            lv_additionalElements_7_3=ruleClause2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_7_3,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Clause2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getClause2Access().getRightParenthesisKeyword_1_5());
                    			

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
    // $ANTLR end "ruleClause2"


    // $ANTLR start "entryRuleClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:859:1: entryRuleClauseContinuation returns [EObject current=null] : iv_ruleClauseContinuation= ruleClauseContinuation EOF ;
    public final EObject entryRuleClauseContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClauseContinuation = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:859:59: (iv_ruleClauseContinuation= ruleClauseContinuation EOF )
            // InternalInterparameterDependenciesLanguage.g:860:2: iv_ruleClauseContinuation= ruleClauseContinuation EOF
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
    // InternalInterparameterDependenciesLanguage.g:866:1: ruleClauseContinuation returns [EObject current=null] : ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) ) ) ) ;
    public final EObject ruleClauseContinuation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_logicalOp_0_0 = null;

        EObject lv_additionalElements_1_1 = null;

        EObject lv_additionalElements_1_2 = null;

        EObject lv_additionalElements_1_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:872:2: ( ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:873:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:873:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:874:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:874:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) )
            // InternalInterparameterDependenciesLanguage.g:875:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            {
            // InternalInterparameterDependenciesLanguage.g:875:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            // InternalInterparameterDependenciesLanguage.g:876:5: lv_logicalOp_0_0= ruleLogicalOperator
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

            // InternalInterparameterDependenciesLanguage.g:893:3: ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) ) )
            // InternalInterparameterDependenciesLanguage.g:894:4: ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) )
            {
            // InternalInterparameterDependenciesLanguage.g:894:4: ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 ) )
            // InternalInterparameterDependenciesLanguage.g:895:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 )
            {
            // InternalInterparameterDependenciesLanguage.g:895:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:896:6: lv_additionalElements_1_1= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getClauseContinuationAccess().getAdditionalElementsPositiveAtomicParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_1=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
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
                    // InternalInterparameterDependenciesLanguage.g:912:6: lv_additionalElements_1_2= ruleNegativeAtomic
                    {

                    						newCompositeNode(grammarAccess.getClauseContinuationAccess().getAdditionalElementsNegativeAtomicParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_2=ruleNegativeAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:928:6: lv_additionalElements_1_3= ruleClause3
                    {

                    						newCompositeNode(grammarAccess.getClauseContinuationAccess().getAdditionalElementsClause3ParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_3=ruleClause3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_3,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.Clause3");
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


    // $ANTLR start "entryRuleClause3"
    // InternalInterparameterDependenciesLanguage.g:950:1: entryRuleClause3 returns [EObject current=null] : iv_ruleClause3= ruleClause3 EOF ;
    public final EObject entryRuleClause3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause3 = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:950:48: (iv_ruleClause3= ruleClause3 EOF )
            // InternalInterparameterDependenciesLanguage.g:951:2: iv_ruleClause3= ruleClause3 EOF
            {
             newCompositeNode(grammarAccess.getClause3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause3=ruleClause3();

            state._fsp--;

             current =iv_ruleClause3; 
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
    // $ANTLR end "entryRuleClause3"


    // $ANTLR start "ruleClause3"
    // InternalInterparameterDependenciesLanguage.g:957:1: ruleClause3 returns [EObject current=null] : ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) ) ;
    public final EObject ruleClause3() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_firstElement_0_1 = null;

        EObject lv_firstElement_0_2 = null;

        EObject lv_clauseContinuation_1_0 = null;

        EObject lv_firstElement_4_1 = null;

        EObject lv_firstElement_4_2 = null;

        EObject lv_firstElement_4_3 = null;

        EObject lv_clauseContinuation_5_0 = null;

        EObject lv_clauseContinuation2_7_0 = null;

        EObject lv_firstElement_8_0 = null;

        EObject lv_clauseContinuation_9_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:963:2: ( ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) ) )
            // InternalInterparameterDependenciesLanguage.g:964:2: ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) )
            {
            // InternalInterparameterDependenciesLanguage.g:964:2: ( ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? ) | ( ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt24=1;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt24=3;
                    }
                    break;
                case 21:
                    {
                    alt24=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt24=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                alt24=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:965:3: ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:965:3: ( ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) ) )
                    // InternalInterparameterDependenciesLanguage.g:966:4: ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) ) ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:966:4: ( ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) ) )
                    // InternalInterparameterDependenciesLanguage.g:967:5: ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:967:5: ( (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:968:6: (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:968:6: (lv_firstElement_0_1= rulePositiveAtomic | lv_firstElement_0_2= ruleNegativeAtomic )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==28) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:969:7: lv_firstElement_0_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause3Access().getFirstElementPositiveAtomicParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_0_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause3Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_0_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:985:7: lv_firstElement_0_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause3Access().getFirstElementNegativeAtomicParserRuleCall_0_0_0_1());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_0_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause3Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_0_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1003:4: ( (lv_clauseContinuation_1_0= ruleClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1004:5: (lv_clauseContinuation_1_0= ruleClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1004:5: (lv_clauseContinuation_1_0= ruleClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1005:6: lv_clauseContinuation_1_0= ruleClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getClause3Access().getClauseContinuationClauseContinuationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_clauseContinuation_1_0=ruleClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClause3Rule());
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
                    // InternalInterparameterDependenciesLanguage.g:1024:3: ( ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1024:3: ( ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1025:4: ( ruleNot )? otherlv_3= '(' ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) ) ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) ) otherlv_6= ')' ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )?
                    {
                    // InternalInterparameterDependenciesLanguage.g:1025:4: ( ruleNot )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1026:5: ruleNot
                            {

                            					newCompositeNode(grammarAccess.getClause3Access().getNotParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_12);
                            ruleNot();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getClause3Access().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1038:4: ( ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1039:5: ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1039:5: ( (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 ) )
                    // InternalInterparameterDependenciesLanguage.g:1040:6: (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1040:6: (lv_firstElement_4_1= rulePositiveAtomic | lv_firstElement_4_2= ruleNegativeAtomic | lv_firstElement_4_3= rulePredefinedDependency2 )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt21=1;
                        }
                        break;
                    case 28:
                        {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==RULE_ID) ) {
                            alt21=2;
                        }
                        else if ( ((LA21_2>=23 && LA21_2<=26)) ) {
                            alt21=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1041:7: lv_firstElement_4_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause3Access().getFirstElementPositiveAtomicParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_4_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause3Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_4_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:1057:7: lv_firstElement_4_2= ruleNegativeAtomic
                            {

                            							newCompositeNode(grammarAccess.getClause3Access().getFirstElementNegativeAtomicParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_4_2=ruleNegativeAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause3Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_4_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.NegativeAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalInterparameterDependenciesLanguage.g:1073:7: lv_firstElement_4_3= rulePredefinedDependency2
                            {

                            							newCompositeNode(grammarAccess.getClause3Access().getFirstElementPredefinedDependency2ParserRuleCall_1_2_0_2());
                            						
                            pushFollow(FOLLOW_15);
                            lv_firstElement_4_3=rulePredefinedDependency2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClause3Rule());
                            							}
                            							set(
                            								current,
                            								"firstElement",
                            								lv_firstElement_4_3,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1091:4: ( (lv_clauseContinuation_5_0= ruleClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1092:5: (lv_clauseContinuation_5_0= ruleClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1092:5: (lv_clauseContinuation_5_0= ruleClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1093:6: lv_clauseContinuation_5_0= ruleClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getClause3Access().getClauseContinuationClauseContinuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_clauseContinuation_5_0=ruleClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClause3Rule());
                    						}
                    						set(
                    							current,
                    							"clauseContinuation",
                    							lv_clauseContinuation_5_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.ClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getClause3Access().getRightParenthesisKeyword_1_4());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1114:4: ( (lv_clauseContinuation2_7_0= ruleClauseContinuation ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=29 && LA22_0<=30)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1115:5: (lv_clauseContinuation2_7_0= ruleClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1115:5: (lv_clauseContinuation2_7_0= ruleClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1116:6: lv_clauseContinuation2_7_0= ruleClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getClause3Access().getClauseContinuation2ClauseContinuationParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_clauseContinuation2_7_0=ruleClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClause3Rule());
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
                    // InternalInterparameterDependenciesLanguage.g:1135:3: ( ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1135:3: ( ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1136:4: ( (lv_firstElement_8_0= rulePredefinedDependency2 ) ) ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )?
                    {
                    // InternalInterparameterDependenciesLanguage.g:1136:4: ( (lv_firstElement_8_0= rulePredefinedDependency2 ) )
                    // InternalInterparameterDependenciesLanguage.g:1137:5: (lv_firstElement_8_0= rulePredefinedDependency2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1137:5: (lv_firstElement_8_0= rulePredefinedDependency2 )
                    // InternalInterparameterDependenciesLanguage.g:1138:6: lv_firstElement_8_0= rulePredefinedDependency2
                    {

                    						newCompositeNode(grammarAccess.getClause3Access().getFirstElementPredefinedDependency2ParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_firstElement_8_0=rulePredefinedDependency2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClause3Rule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_8_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1155:4: ( (lv_clauseContinuation_9_0= ruleClauseContinuation ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=29 && LA23_0<=30)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1156:5: (lv_clauseContinuation_9_0= ruleClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1156:5: (lv_clauseContinuation_9_0= ruleClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1157:6: lv_clauseContinuation_9_0= ruleClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getClause3Access().getClauseContinuationClauseContinuationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_clauseContinuation_9_0=ruleClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClause3Rule());
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
    // $ANTLR end "ruleClause3"


    // $ANTLR start "entryRulePositiveClauseContinuation"
    // InternalInterparameterDependenciesLanguage.g:1179:1: entryRulePositiveClauseContinuation returns [EObject current=null] : iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF ;
    public final EObject entryRulePositiveClauseContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClauseContinuation = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1179:67: (iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF )
            // InternalInterparameterDependenciesLanguage.g:1180:2: iv_rulePositiveClauseContinuation= rulePositiveClauseContinuation EOF
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
    // InternalInterparameterDependenciesLanguage.g:1186:1: rulePositiveClauseContinuation returns [EObject current=null] : ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) ) ) ) ;
    public final EObject rulePositiveClauseContinuation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_logicalOp_0_0 = null;

        EObject lv_additionalElements_1_1 = null;

        EObject lv_additionalElements_1_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1192:2: ( ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:1193:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1193:2: ( ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) ) ) )
            // InternalInterparameterDependenciesLanguage.g:1194:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1194:3: ( (lv_logicalOp_0_0= ruleLogicalOperator ) )
            // InternalInterparameterDependenciesLanguage.g:1195:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            {
            // InternalInterparameterDependenciesLanguage.g:1195:4: (lv_logicalOp_0_0= ruleLogicalOperator )
            // InternalInterparameterDependenciesLanguage.g:1196:5: lv_logicalOp_0_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getPositiveClauseContinuationAccess().getLogicalOpLogicalOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalInterparameterDependenciesLanguage.g:1213:3: ( ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) ) )
            // InternalInterparameterDependenciesLanguage.g:1214:4: ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1214:4: ( (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 ) )
            // InternalInterparameterDependenciesLanguage.g:1215:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 )
            {
            // InternalInterparameterDependenciesLanguage.g:1215:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1216:6: lv_additionalElements_1_1= rulePositiveAtomic
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
                    // InternalInterparameterDependenciesLanguage.g:1232:6: lv_additionalElements_1_2= rulePositiveClause3
                    {

                    						newCompositeNode(grammarAccess.getPositiveClauseContinuationAccess().getAdditionalElementsPositiveClause3ParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additionalElements_1_2=rulePositiveClause3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClauseContinuationRule());
                    						}
                    						set(
                    							current,
                    							"additionalElements",
                    							lv_additionalElements_1_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause3");
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


    // $ANTLR start "entryRulePositiveClause3"
    // InternalInterparameterDependenciesLanguage.g:1254:1: entryRulePositiveClause3 returns [EObject current=null] : iv_rulePositiveClause3= rulePositiveClause3 EOF ;
    public final EObject entryRulePositiveClause3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClause3 = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1254:56: (iv_rulePositiveClause3= rulePositiveClause3 EOF )
            // InternalInterparameterDependenciesLanguage.g:1255:2: iv_rulePositiveClause3= rulePositiveClause3 EOF
            {
             newCompositeNode(grammarAccess.getPositiveClause3Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveClause3=rulePositiveClause3();

            state._fsp--;

             current =iv_rulePositiveClause3; 
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
    // $ANTLR end "entryRulePositiveClause3"


    // $ANTLR start "rulePositiveClause3"
    // InternalInterparameterDependenciesLanguage.g:1261:1: rulePositiveClause3 returns [EObject current=null] : ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )? ) | (this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )? ) ) ;
    public final EObject rulePositiveClause3() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_positiveFirstElement_0_0 = null;

        EObject lv_positiveClauseContinuation_1_0 = null;

        EObject lv_positiveFirstElement_4_1 = null;

        EObject lv_positiveFirstElement_4_2 = null;

        EObject lv_positiveClauseContinuation_5_0 = null;

        EObject lv_positiveClauseContinuation2_7_0 = null;

        EObject this_PredefinedDependency2_8 = null;

        EObject lv_positiveClauseContinuation_9_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1267:2: ( ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )? ) | (this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )? ) ) )
            // InternalInterparameterDependenciesLanguage.g:1268:2: ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )? ) | (this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )? ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1268:2: ( ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) ) | ( ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )? ) | (this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )? ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt30=1;
                }
                break;
            case 28:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==21) ) {
                    alt30=2;
                }
                else if ( ((LA30_2>=23 && LA30_2<=26)) ) {
                    alt30=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt30=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1269:3: ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1269:3: ( ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1270:4: ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) ) ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1270:4: ( (lv_positiveFirstElement_0_0= rulePositiveAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:1271:5: (lv_positiveFirstElement_0_0= rulePositiveAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1271:5: (lv_positiveFirstElement_0_0= rulePositiveAtomic )
                    // InternalInterparameterDependenciesLanguage.g:1272:6: lv_positiveFirstElement_0_0= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveFirstElementPositiveAtomicParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_positiveFirstElement_0_0=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
                    						}
                    						set(
                    							current,
                    							"positiveFirstElement",
                    							lv_positiveFirstElement_0_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1289:4: ( (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1290:5: (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1290:5: (lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1291:6: lv_positiveClauseContinuation_1_0= rulePositiveClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveClauseContinuationPositiveClauseContinuationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_positiveClauseContinuation_1_0=rulePositiveClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
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
                    // InternalInterparameterDependenciesLanguage.g:1310:3: ( ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1310:3: ( ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1311:4: ( ruleNot )? otherlv_3= '(' ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) ) ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) ) otherlv_6= ')' ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )?
                    {
                    // InternalInterparameterDependenciesLanguage.g:1311:4: ( ruleNot )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==28) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1312:5: ruleNot
                            {

                            					newCompositeNode(grammarAccess.getPositiveClause3Access().getNotParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_12);
                            ruleNot();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getPositiveClause3Access().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1324:4: ( ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1325:5: ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1325:5: ( (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 ) )
                    // InternalInterparameterDependenciesLanguage.g:1326:6: (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1326:6: (lv_positiveFirstElement_4_1= rulePositiveAtomic | lv_positiveFirstElement_4_2= rulePredefinedDependency2 )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_0>=23 && LA27_0<=26)||LA27_0==28) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1327:7: lv_positiveFirstElement_4_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveFirstElementPositiveAtomicParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_positiveFirstElement_4_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
                            							}
                            							set(
                            								current,
                            								"positiveFirstElement",
                            								lv_positiveFirstElement_4_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:1343:7: lv_positiveFirstElement_4_2= rulePredefinedDependency2
                            {

                            							newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveFirstElementPredefinedDependency2ParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_15);
                            lv_positiveFirstElement_4_2=rulePredefinedDependency2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
                            							}
                            							set(
                            								current,
                            								"positiveFirstElement",
                            								lv_positiveFirstElement_4_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1361:4: ( (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation ) )
                    // InternalInterparameterDependenciesLanguage.g:1362:5: (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1362:5: (lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation )
                    // InternalInterparameterDependenciesLanguage.g:1363:6: lv_positiveClauseContinuation_5_0= rulePositiveClauseContinuation
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveClauseContinuationPositiveClauseContinuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_positiveClauseContinuation_5_0=rulePositiveClauseContinuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
                    						}
                    						set(
                    							current,
                    							"positiveClauseContinuation",
                    							lv_positiveClauseContinuation_5_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClauseContinuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getPositiveClause3Access().getRightParenthesisKeyword_1_4());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1384:4: ( (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=29 && LA28_0<=30)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1385:5: (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1385:5: (lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1386:6: lv_positiveClauseContinuation2_7_0= rulePositiveClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveClauseContinuation2PositiveClauseContinuationParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_positiveClauseContinuation2_7_0=rulePositiveClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
                            						}
                            						set(
                            							current,
                            							"positiveClauseContinuation2",
                            							lv_positiveClauseContinuation2_7_0,
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
                    // InternalInterparameterDependenciesLanguage.g:1405:3: (this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )? )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1405:3: (this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )? )
                    // InternalInterparameterDependenciesLanguage.g:1406:4: this_PredefinedDependency2_8= rulePredefinedDependency2 ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )?
                    {

                    				newCompositeNode(grammarAccess.getPositiveClause3Access().getPredefinedDependency2ParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_PredefinedDependency2_8=rulePredefinedDependency2();

                    state._fsp--;


                    				current = this_PredefinedDependency2_8;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalInterparameterDependenciesLanguage.g:1414:4: ( (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=29 && LA29_0<=30)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1415:5: (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation )
                            {
                            // InternalInterparameterDependenciesLanguage.g:1415:5: (lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation )
                            // InternalInterparameterDependenciesLanguage.g:1416:6: lv_positiveClauseContinuation_9_0= rulePositiveClauseContinuation
                            {

                            						newCompositeNode(grammarAccess.getPositiveClause3Access().getPositiveClauseContinuationPositiveClauseContinuationParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_positiveClauseContinuation_9_0=rulePositiveClauseContinuation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPositiveClause3Rule());
                            						}
                            						set(
                            							current,
                            							"positiveClauseContinuation",
                            							lv_positiveClauseContinuation_9_0,
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
    // $ANTLR end "rulePositiveClause3"


    // $ANTLR start "entryRulePredefinedDependency2"
    // InternalInterparameterDependenciesLanguage.g:1438:1: entryRulePredefinedDependency2 returns [EObject current=null] : iv_rulePredefinedDependency2= rulePredefinedDependency2 EOF ;
    public final EObject entryRulePredefinedDependency2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedDependency2 = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1438:62: (iv_rulePredefinedDependency2= rulePredefinedDependency2 EOF )
            // InternalInterparameterDependenciesLanguage.g:1439:2: iv_rulePredefinedDependency2= rulePredefinedDependency2 EOF
            {
             newCompositeNode(grammarAccess.getPredefinedDependency2Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredefinedDependency2=rulePredefinedDependency2();

            state._fsp--;

             current =iv_rulePredefinedDependency2; 
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
    // $ANTLR end "entryRulePredefinedDependency2"


    // $ANTLR start "rulePredefinedDependency2"
    // InternalInterparameterDependenciesLanguage.g:1445:1: rulePredefinedDependency2 returns [EObject current=null] : ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) ) )+ otherlv_6= ')' ) ;
    public final EObject rulePredefinedDependency2() throws RecognitionException {
        EObject current = null;

        Token lv_predefDepType_1_1=null;
        Token lv_predefDepType_1_2=null;
        Token lv_predefDepType_1_3=null;
        Token lv_predefDepType_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_predefDepClauses_3_1 = null;

        EObject lv_predefDepClauses_3_2 = null;

        EObject lv_predefDepClauses_5_1 = null;

        EObject lv_predefDepClauses_5_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1451:2: ( ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) ) )+ otherlv_6= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:1452:2: ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) ) )+ otherlv_6= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:1452:2: ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) ) )+ otherlv_6= ')' )
            // InternalInterparameterDependenciesLanguage.g:1453:3: ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) ) )+ otherlv_6= ')'
            {
            // InternalInterparameterDependenciesLanguage.g:1453:3: ( ruleNot )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1454:4: ruleNot
                    {

                    				newCompositeNode(grammarAccess.getPredefinedDependency2Access().getNotParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_19);
                    ruleNot();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalInterparameterDependenciesLanguage.g:1462:3: ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) )
            // InternalInterparameterDependenciesLanguage.g:1463:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1463:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            // InternalInterparameterDependenciesLanguage.g:1464:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            {
            // InternalInterparameterDependenciesLanguage.g:1464:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt32=1;
                }
                break;
            case 24:
                {
                alt32=2;
                }
                break;
            case 25:
                {
                alt32=3;
                }
                break;
            case 26:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1465:6: lv_predefDepType_1_1= 'Or'
                    {
                    lv_predefDepType_1_1=(Token)match(input,23,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_1, grammarAccess.getPredefinedDependency2Access().getPredefDepTypeOrKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependency2Rule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1476:6: lv_predefDepType_1_2= 'OnlyOne'
                    {
                    lv_predefDepType_1_2=(Token)match(input,24,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_2, grammarAccess.getPredefinedDependency2Access().getPredefDepTypeOnlyOneKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependency2Rule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:1487:6: lv_predefDepType_1_3= 'AllOrNone'
                    {
                    lv_predefDepType_1_3=(Token)match(input,25,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_3, grammarAccess.getPredefinedDependency2Access().getPredefDepTypeAllOrNoneKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependency2Rule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalInterparameterDependenciesLanguage.g:1498:6: lv_predefDepType_1_4= 'ZeroOrOne'
                    {
                    lv_predefDepType_1_4=(Token)match(input,26,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_4, grammarAccess.getPredefinedDependency2Access().getPredefDepTypeZeroOrOneKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependency2Rule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPredefinedDependency2Access().getLeftParenthesisKeyword_2());
            		
            // InternalInterparameterDependenciesLanguage.g:1515:3: ( ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) ) )
            // InternalInterparameterDependenciesLanguage.g:1516:4: ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1516:4: ( (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 ) )
            // InternalInterparameterDependenciesLanguage.g:1517:5: (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 )
            {
            // InternalInterparameterDependenciesLanguage.g:1517:5: (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1518:6: lv_predefDepClauses_3_1= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependency2Access().getPredefDepClausesPositiveAtomicParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_predefDepClauses_3_1=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependency2Rule());
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
                    // InternalInterparameterDependenciesLanguage.g:1534:6: lv_predefDepClauses_3_2= rulePositiveClause3
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependency2Access().getPredefDepClausesPositiveClause3ParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_20);
                    lv_predefDepClauses_3_2=rulePositiveClause3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependency2Rule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_3_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause3");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalInterparameterDependenciesLanguage.g:1552:3: (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:1553:4: otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPredefinedDependency2Access().getCommaKeyword_4_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:1557:4: ( ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) ) )
            	    // InternalInterparameterDependenciesLanguage.g:1558:5: ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1558:5: ( (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 ) )
            	    // InternalInterparameterDependenciesLanguage.g:1559:6: (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1559:6: (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 )
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // InternalInterparameterDependenciesLanguage.g:1560:7: lv_predefDepClauses_5_1= rulePositiveAtomic
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependency2Access().getPredefDepClausesPositiveAtomicParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_21);
            	            lv_predefDepClauses_5_1=rulePositiveAtomic();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependency2Rule());
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
            	            // InternalInterparameterDependenciesLanguage.g:1576:7: lv_predefDepClauses_5_2= rulePositiveClause3
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependency2Access().getPredefDepClausesPositiveClause3ParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_21);
            	            lv_predefDepClauses_5_2=rulePositiveClause3();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependency2Rule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_5_2,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause3");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPredefinedDependency2Access().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "rulePredefinedDependency2"


    // $ANTLR start "entryRulePositiveClause2"
    // InternalInterparameterDependenciesLanguage.g:1603:1: entryRulePositiveClause2 returns [EObject current=null] : iv_rulePositiveClause2= rulePositiveClause2 EOF ;
    public final EObject entryRulePositiveClause2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClause2 = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1603:56: (iv_rulePositiveClause2= rulePositiveClause2 EOF )
            // InternalInterparameterDependenciesLanguage.g:1604:2: iv_rulePositiveClause2= rulePositiveClause2 EOF
            {
             newCompositeNode(grammarAccess.getPositiveClause2Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveClause2=rulePositiveClause2();

            state._fsp--;

             current =iv_rulePositiveClause2; 
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
    // $ANTLR end "entryRulePositiveClause2"


    // $ANTLR start "rulePositiveClause2"
    // InternalInterparameterDependenciesLanguage.g:1610:1: rulePositiveClause2 returns [EObject current=null] : ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')' ) ) ;
    public final EObject rulePositiveClause2() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_firstElement_0_0 = null;

        AntlrDatatypeRuleToken lv_logicalOp_1_0 = null;

        EObject lv_additionalElements_2_1 = null;

        EObject lv_additionalElements_2_2 = null;

        EObject lv_firstElement_5_0 = null;

        AntlrDatatypeRuleToken lv_logicalOp_6_0 = null;

        EObject lv_additionalElements_7_1 = null;

        EObject lv_additionalElements_7_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1616:2: ( ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')' ) ) )
            // InternalInterparameterDependenciesLanguage.g:1617:2: ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1617:2: ( ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) ) ) | ( ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==21||LA39_0==28) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1618:3: ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1618:3: ( ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1619:4: ( (lv_firstElement_0_0= rulePositiveAtomic ) ) ( (lv_logicalOp_1_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1619:4: ( (lv_firstElement_0_0= rulePositiveAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:1620:5: (lv_firstElement_0_0= rulePositiveAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1620:5: (lv_firstElement_0_0= rulePositiveAtomic )
                    // InternalInterparameterDependenciesLanguage.g:1621:6: lv_firstElement_0_0= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause2Access().getFirstElementPositiveAtomicParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_firstElement_0_0=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_0_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1638:4: ( (lv_logicalOp_1_0= ruleLogicalOperator ) )
                    // InternalInterparameterDependenciesLanguage.g:1639:5: (lv_logicalOp_1_0= ruleLogicalOperator )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1639:5: (lv_logicalOp_1_0= ruleLogicalOperator )
                    // InternalInterparameterDependenciesLanguage.g:1640:6: lv_logicalOp_1_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause2Access().getLogicalOpLogicalOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_logicalOp_1_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_1_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1657:4: ( ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1658:5: ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1658:5: ( (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 ) )
                    // InternalInterparameterDependenciesLanguage.g:1659:6: (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1659:6: (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 )
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1660:7: lv_additionalElements_2_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getPositiveClause2Access().getAdditionalElementsPositiveAtomicParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_additionalElements_2_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_2_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:1676:7: lv_additionalElements_2_2= rulePositiveClause2
                            {

                            							newCompositeNode(grammarAccess.getPositiveClause2Access().getAdditionalElementsPositiveClause2ParserRuleCall_0_2_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_additionalElements_2_2=rulePositiveClause2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_2_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1696:3: ( ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')' )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1696:3: ( ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')' )
                    // InternalInterparameterDependenciesLanguage.g:1697:4: ( ruleNot )? otherlv_4= '(' ( (lv_firstElement_5_0= rulePositiveAtomic ) ) ( (lv_logicalOp_6_0= ruleLogicalOperator ) ) ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) ) otherlv_8= ')'
                    {
                    // InternalInterparameterDependenciesLanguage.g:1697:4: ( ruleNot )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==28) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1698:5: ruleNot
                            {

                            					newCompositeNode(grammarAccess.getPositiveClause2Access().getNotParserRuleCall_1_0());
                            				
                            pushFollow(FOLLOW_12);
                            ruleNot();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPositiveClause2Access().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalInterparameterDependenciesLanguage.g:1710:4: ( (lv_firstElement_5_0= rulePositiveAtomic ) )
                    // InternalInterparameterDependenciesLanguage.g:1711:5: (lv_firstElement_5_0= rulePositiveAtomic )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1711:5: (lv_firstElement_5_0= rulePositiveAtomic )
                    // InternalInterparameterDependenciesLanguage.g:1712:6: lv_firstElement_5_0= rulePositiveAtomic
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause2Access().getFirstElementPositiveAtomicParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_firstElement_5_0=rulePositiveAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                    						}
                    						set(
                    							current,
                    							"firstElement",
                    							lv_firstElement_5_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1729:4: ( (lv_logicalOp_6_0= ruleLogicalOperator ) )
                    // InternalInterparameterDependenciesLanguage.g:1730:5: (lv_logicalOp_6_0= ruleLogicalOperator )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1730:5: (lv_logicalOp_6_0= ruleLogicalOperator )
                    // InternalInterparameterDependenciesLanguage.g:1731:6: lv_logicalOp_6_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getPositiveClause2Access().getLogicalOpLogicalOperatorParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_logicalOp_6_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                    						}
                    						set(
                    							current,
                    							"logicalOp",
                    							lv_logicalOp_6_0,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalInterparameterDependenciesLanguage.g:1748:4: ( ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) ) )
                    // InternalInterparameterDependenciesLanguage.g:1749:5: ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1749:5: ( (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 ) )
                    // InternalInterparameterDependenciesLanguage.g:1750:6: (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1750:6: (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 )
                    int alt38=2;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // InternalInterparameterDependenciesLanguage.g:1751:7: lv_additionalElements_7_1= rulePositiveAtomic
                            {

                            							newCompositeNode(grammarAccess.getPositiveClause2Access().getAdditionalElementsPositiveAtomicParserRuleCall_1_4_0_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_additionalElements_7_1=rulePositiveAtomic();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_7_1,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalInterparameterDependenciesLanguage.g:1767:7: lv_additionalElements_7_2= rulePositiveClause2
                            {

                            							newCompositeNode(grammarAccess.getPositiveClause2Access().getAdditionalElementsPositiveClause2ParserRuleCall_1_4_0_1());
                            						
                            pushFollow(FOLLOW_17);
                            lv_additionalElements_7_2=rulePositiveClause2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPositiveClause2Rule());
                            							}
                            							set(
                            								current,
                            								"additionalElements",
                            								lv_additionalElements_7_2,
                            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getPositiveClause2Access().getRightParenthesisKeyword_1_5());
                    			

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
    // $ANTLR end "rulePositiveClause2"


    // $ANTLR start "entryRuleNegativeAtomic"
    // InternalInterparameterDependenciesLanguage.g:1794:1: entryRuleNegativeAtomic returns [EObject current=null] : iv_ruleNegativeAtomic= ruleNegativeAtomic EOF ;
    public final EObject entryRuleNegativeAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeAtomic = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1794:55: (iv_ruleNegativeAtomic= ruleNegativeAtomic EOF )
            // InternalInterparameterDependenciesLanguage.g:1795:2: iv_ruleNegativeAtomic= ruleNegativeAtomic EOF
            {
             newCompositeNode(grammarAccess.getNegativeAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegativeAtomic=ruleNegativeAtomic();

            state._fsp--;

             current =iv_ruleNegativeAtomic; 
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
    // $ANTLR end "entryRuleNegativeAtomic"


    // $ANTLR start "ruleNegativeAtomic"
    // InternalInterparameterDependenciesLanguage.g:1801:1: ruleNegativeAtomic returns [EObject current=null] : ( ( ruleNot this_Param_1= ruleParam ) | ( ruleNot this_ParamAssignment_3= ruleParamAssignment ) ) ;
    public final EObject ruleNegativeAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_Param_1 = null;

        EObject this_ParamAssignment_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1807:2: ( ( ( ruleNot this_Param_1= ruleParam ) | ( ruleNot this_ParamAssignment_3= ruleParamAssignment ) ) )
            // InternalInterparameterDependenciesLanguage.g:1808:2: ( ( ruleNot this_Param_1= ruleParam ) | ( ruleNot this_ParamAssignment_3= ruleParamAssignment ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1808:2: ( ( ruleNot this_Param_1= ruleParam ) | ( ruleNot this_ParamAssignment_3= ruleParamAssignment ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_ID) ) {
                    int LA40_2 = input.LA(3);

                    if ( (LA40_2==17) ) {
                        alt40=2;
                    }
                    else if ( (LA40_2==EOF||LA40_2==12||LA40_2==20||LA40_2==22||(LA40_2>=29 && LA40_2<=30)) ) {
                        alt40=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1809:3: ( ruleNot this_Param_1= ruleParam )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1809:3: ( ruleNot this_Param_1= ruleParam )
                    // InternalInterparameterDependenciesLanguage.g:1810:4: ruleNot this_Param_1= ruleParam
                    {

                    				newCompositeNode(grammarAccess.getNegativeAtomicAccess().getNotParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    ruleNot();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getNegativeAtomicAccess().getParamParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Param_1=ruleParam();

                    state._fsp--;


                    				current = this_Param_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1827:3: ( ruleNot this_ParamAssignment_3= ruleParamAssignment )
                    {
                    // InternalInterparameterDependenciesLanguage.g:1827:3: ( ruleNot this_ParamAssignment_3= ruleParamAssignment )
                    // InternalInterparameterDependenciesLanguage.g:1828:4: ruleNot this_ParamAssignment_3= ruleParamAssignment
                    {

                    				newCompositeNode(grammarAccess.getNegativeAtomicAccess().getNotParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_7);
                    ruleNot();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getNegativeAtomicAccess().getParamAssignmentParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ParamAssignment_3=ruleParamAssignment();

                    state._fsp--;


                    				current = this_ParamAssignment_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleNegativeAtomic"


    // $ANTLR start "entryRuleNot"
    // InternalInterparameterDependenciesLanguage.g:1848:1: entryRuleNot returns [String current=null] : iv_ruleNot= ruleNot EOF ;
    public final String entryRuleNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNot = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1848:43: (iv_ruleNot= ruleNot EOF )
            // InternalInterparameterDependenciesLanguage.g:1849:2: iv_ruleNot= ruleNot EOF
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
    // InternalInterparameterDependenciesLanguage.g:1855:1: ruleNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NOT' ;
    public final AntlrDatatypeRuleToken ruleNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1861:2: (kw= 'NOT' )
            // InternalInterparameterDependenciesLanguage.g:1862:2: kw= 'NOT'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalInterparameterDependenciesLanguage.g:1870:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1870:55: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalInterparameterDependenciesLanguage.g:1871:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalInterparameterDependenciesLanguage.g:1877:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1883:2: ( (kw= 'AND' | kw= 'OR' ) )
            // InternalInterparameterDependenciesLanguage.g:1884:2: (kw= 'AND' | kw= 'OR' )
            {
            // InternalInterparameterDependenciesLanguage.g:1884:2: (kw= 'AND' | kw= 'OR' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            else if ( (LA41_0==30) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:1885:3: kw= 'AND'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getANDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:1891:3: kw= 'OR'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParam"
    // InternalInterparameterDependenciesLanguage.g:1900:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1900:46: (iv_ruleParam= ruleParam EOF )
            // InternalInterparameterDependenciesLanguage.g:1901:2: iv_ruleParam= ruleParam EOF
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
    // InternalInterparameterDependenciesLanguage.g:1907:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1913:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalInterparameterDependenciesLanguage.g:1914:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalInterparameterDependenciesLanguage.g:1914:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalInterparameterDependenciesLanguage.g:1915:3: (lv_name_0_0= RULE_ID )
            {
            // InternalInterparameterDependenciesLanguage.g:1915:3: (lv_name_0_0= RULE_ID )
            // InternalInterparameterDependenciesLanguage.g:1916:4: lv_name_0_0= RULE_ID
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
    // InternalInterparameterDependenciesLanguage.g:1935:1: entryRuleParamAssignment returns [EObject current=null] : iv_ruleParamAssignment= ruleParamAssignment EOF ;
    public final EObject entryRuleParamAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAssignment = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:1935:56: (iv_ruleParamAssignment= ruleParamAssignment EOF )
            // InternalInterparameterDependenciesLanguage.g:1936:2: iv_ruleParamAssignment= ruleParamAssignment EOF
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
    // InternalInterparameterDependenciesLanguage.g:1942:1: ruleParamAssignment returns [EObject current=null] : (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleParamAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_paramValues_2_0=null;
        Token otherlv_3=null;
        Token lv_paramValues_4_0=null;
        EObject this_Param_0 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:1948:2: ( (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* ) )
            // InternalInterparameterDependenciesLanguage.g:1949:2: (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* )
            {
            // InternalInterparameterDependenciesLanguage.g:1949:2: (this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )* )
            // InternalInterparameterDependenciesLanguage.g:1950:3: this_Param_0= ruleParam otherlv_1= '=' ( (lv_paramValues_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )*
            {

            			newCompositeNode(grammarAccess.getParamAssignmentAccess().getParamParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Param_0=ruleParam();

            state._fsp--;


            			current = this_Param_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalInterparameterDependenciesLanguage.g:1962:3: ( (lv_paramValues_2_0= RULE_STRING ) )
            // InternalInterparameterDependenciesLanguage.g:1963:4: (lv_paramValues_2_0= RULE_STRING )
            {
            // InternalInterparameterDependenciesLanguage.g:1963:4: (lv_paramValues_2_0= RULE_STRING )
            // InternalInterparameterDependenciesLanguage.g:1964:5: lv_paramValues_2_0= RULE_STRING
            {
            lv_paramValues_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalInterparameterDependenciesLanguage.g:1980:3: (otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==31) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:1981:4: otherlv_3= '|' ( (lv_paramValues_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_23); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParamAssignmentAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:1985:4: ( (lv_paramValues_4_0= RULE_STRING ) )
            	    // InternalInterparameterDependenciesLanguage.g:1986:5: (lv_paramValues_4_0= RULE_STRING )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:1986:5: (lv_paramValues_4_0= RULE_STRING )
            	    // InternalInterparameterDependenciesLanguage.g:1987:6: lv_paramValues_4_0= RULE_STRING
            	    {
            	    lv_paramValues_4_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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
            	    break loop42;
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


    // $ANTLR start "entryRulePositiveClause"
    // InternalInterparameterDependenciesLanguage.g:2008:1: entryRulePositiveClause returns [EObject current=null] : iv_rulePositiveClause= rulePositiveClause EOF ;
    public final EObject entryRulePositiveClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveClause = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:2008:55: (iv_rulePositiveClause= rulePositiveClause EOF )
            // InternalInterparameterDependenciesLanguage.g:2009:2: iv_rulePositiveClause= rulePositiveClause EOF
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
    // InternalInterparameterDependenciesLanguage.g:2015:1: rulePositiveClause returns [EObject current=null] : ( ( (lv_positiveClauses_0_0= rulePositiveAtomic ) ) ( ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) ) )* ) ;
    public final EObject rulePositiveClause() throws RecognitionException {
        EObject current = null;

        EObject lv_positiveClauses_0_0 = null;

        EObject lv_positiveClauses_2_1 = null;

        EObject lv_positiveClauses_2_2 = null;

        EObject lv_positiveClauses_2_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:2021:2: ( ( ( (lv_positiveClauses_0_0= rulePositiveAtomic ) ) ( ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) ) )* ) )
            // InternalInterparameterDependenciesLanguage.g:2022:2: ( ( (lv_positiveClauses_0_0= rulePositiveAtomic ) ) ( ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) ) )* )
            {
            // InternalInterparameterDependenciesLanguage.g:2022:2: ( ( (lv_positiveClauses_0_0= rulePositiveAtomic ) ) ( ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) ) )* )
            // InternalInterparameterDependenciesLanguage.g:2023:3: ( (lv_positiveClauses_0_0= rulePositiveAtomic ) ) ( ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) ) )*
            {
            // InternalInterparameterDependenciesLanguage.g:2023:3: ( (lv_positiveClauses_0_0= rulePositiveAtomic ) )
            // InternalInterparameterDependenciesLanguage.g:2024:4: (lv_positiveClauses_0_0= rulePositiveAtomic )
            {
            // InternalInterparameterDependenciesLanguage.g:2024:4: (lv_positiveClauses_0_0= rulePositiveAtomic )
            // InternalInterparameterDependenciesLanguage.g:2025:5: lv_positiveClauses_0_0= rulePositiveAtomic
            {

            					newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClausesPositiveAtomicParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_positiveClauses_0_0=rulePositiveAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
            					}
            					add(
            						current,
            						"positiveClauses",
            						lv_positiveClauses_0_0,
            						"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveAtomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInterparameterDependenciesLanguage.g:2042:3: ( ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==29) ) {
                    alt44=1;
                }
                else if ( (LA44_0==30) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:2043:4: ruleLogicalOperator ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) )
            	    {

            	    				newCompositeNode(grammarAccess.getPositiveClauseAccess().getLogicalOperatorParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleLogicalOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:2050:4: ( ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) ) )
            	    // InternalInterparameterDependenciesLanguage.g:2051:5: ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:2051:5: ( (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency ) )
            	    // InternalInterparameterDependenciesLanguage.g:2052:6: (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:2052:6: (lv_positiveClauses_2_1= rulePositiveClause | lv_positiveClauses_2_2= rulePositiveFullClause | lv_positiveClauses_2_3= rulePredefinedDependency )
            	    int alt43=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case 23:
            	    case 24:
            	    case 25:
            	    case 26:
            	    case 28:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // InternalInterparameterDependenciesLanguage.g:2053:7: lv_positiveClauses_2_1= rulePositiveClause
            	            {

            	            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClausesPositiveClauseParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_10);
            	            lv_positiveClauses_2_1=rulePositiveClause();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
            	            							}
            	            							add(
            	            								current,
            	            								"positiveClauses",
            	            								lv_positiveClauses_2_1,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalInterparameterDependenciesLanguage.g:2069:7: lv_positiveClauses_2_2= rulePositiveFullClause
            	            {

            	            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClausesPositiveFullClauseParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_10);
            	            lv_positiveClauses_2_2=rulePositiveFullClause();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
            	            							}
            	            							add(
            	            								current,
            	            								"positiveClauses",
            	            								lv_positiveClauses_2_2,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveFullClause");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalInterparameterDependenciesLanguage.g:2085:7: lv_positiveClauses_2_3= rulePredefinedDependency
            	            {

            	            							newCompositeNode(grammarAccess.getPositiveClauseAccess().getPositiveClausesPredefinedDependencyParserRuleCall_1_1_0_2());
            	            						
            	            pushFollow(FOLLOW_10);
            	            lv_positiveClauses_2_3=rulePredefinedDependency();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPositiveClauseRule());
            	            							}
            	            							add(
            	            								current,
            	            								"positiveClauses",
            	            								lv_positiveClauses_2_3,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "rulePositiveClause"


    // $ANTLR start "entryRulePositiveFullClause"
    // InternalInterparameterDependenciesLanguage.g:2108:1: entryRulePositiveFullClause returns [EObject current=null] : iv_rulePositiveFullClause= rulePositiveFullClause EOF ;
    public final EObject entryRulePositiveFullClause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveFullClause = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:2108:59: (iv_rulePositiveFullClause= rulePositiveFullClause EOF )
            // InternalInterparameterDependenciesLanguage.g:2109:2: iv_rulePositiveFullClause= rulePositiveFullClause EOF
            {
             newCompositeNode(grammarAccess.getPositiveFullClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveFullClause=rulePositiveFullClause();

            state._fsp--;

             current =iv_rulePositiveFullClause; 
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
    // $ANTLR end "entryRulePositiveFullClause"


    // $ANTLR start "rulePositiveFullClause"
    // InternalInterparameterDependenciesLanguage.g:2115:1: rulePositiveFullClause returns [EObject current=null] : (otherlv_0= '(' this_PositiveClause_1= rulePositiveClause otherlv_2= ')' ) ;
    public final EObject rulePositiveFullClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PositiveClause_1 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:2121:2: ( (otherlv_0= '(' this_PositiveClause_1= rulePositiveClause otherlv_2= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:2122:2: (otherlv_0= '(' this_PositiveClause_1= rulePositiveClause otherlv_2= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:2122:2: (otherlv_0= '(' this_PositiveClause_1= rulePositiveClause otherlv_2= ')' )
            // InternalInterparameterDependenciesLanguage.g:2123:3: otherlv_0= '(' this_PositiveClause_1= rulePositiveClause otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPositiveFullClauseAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPositiveFullClauseAccess().getPositiveClauseParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_PositiveClause_1=rulePositiveClause();

            state._fsp--;


            			current = this_PositiveClause_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPositiveFullClauseAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulePositiveFullClause"


    // $ANTLR start "entryRulePositiveAtomic"
    // InternalInterparameterDependenciesLanguage.g:2143:1: entryRulePositiveAtomic returns [EObject current=null] : iv_rulePositiveAtomic= rulePositiveAtomic EOF ;
    public final EObject entryRulePositiveAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveAtomic = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:2143:55: (iv_rulePositiveAtomic= rulePositiveAtomic EOF )
            // InternalInterparameterDependenciesLanguage.g:2144:2: iv_rulePositiveAtomic= rulePositiveAtomic EOF
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
    // InternalInterparameterDependenciesLanguage.g:2150:1: rulePositiveAtomic returns [EObject current=null] : (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency ) ;
    public final EObject rulePositiveAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_Param_0 = null;

        EObject this_ParamAssignment_1 = null;

        EObject this_ArithmeticDependency_2 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:2156:2: ( (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency ) )
            // InternalInterparameterDependenciesLanguage.g:2157:2: (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:2157:2: (this_Param_0= ruleParam | this_ParamAssignment_1= ruleParamAssignment | this_ArithmeticDependency_2= ruleArithmeticDependency )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 12:
                case 20:
                case 22:
                case 27:
                case 29:
                case 30:
                    {
                    alt45=1;
                    }
                    break;
                case 17:
                    {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==RULE_STRING) ) {
                        alt45=2;
                    }
                    else if ( (LA45_3==RULE_ID) ) {
                        alt45=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                    {
                    alt45=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:2158:3: this_Param_0= ruleParam
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
                    // InternalInterparameterDependenciesLanguage.g:2167:3: this_ParamAssignment_1= ruleParamAssignment
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
                    // InternalInterparameterDependenciesLanguage.g:2176:3: this_ArithmeticDependency_2= ruleArithmeticDependency
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


    // $ANTLR start "entryRulePredefinedDependency"
    // InternalInterparameterDependenciesLanguage.g:2188:1: entryRulePredefinedDependency returns [EObject current=null] : iv_rulePredefinedDependency= rulePredefinedDependency EOF ;
    public final EObject entryRulePredefinedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedDependency = null;


        try {
            // InternalInterparameterDependenciesLanguage.g:2188:61: (iv_rulePredefinedDependency= rulePredefinedDependency EOF )
            // InternalInterparameterDependenciesLanguage.g:2189:2: iv_rulePredefinedDependency= rulePredefinedDependency EOF
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
    // InternalInterparameterDependenciesLanguage.g:2195:1: rulePredefinedDependency returns [EObject current=null] : ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) ) )+ otherlv_6= ')' ) ;
    public final EObject rulePredefinedDependency() throws RecognitionException {
        EObject current = null;

        Token lv_predefDepType_1_1=null;
        Token lv_predefDepType_1_2=null;
        Token lv_predefDepType_1_3=null;
        Token lv_predefDepType_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_predefDepClauses_3_1 = null;

        EObject lv_predefDepClauses_3_2 = null;

        EObject lv_predefDepClauses_3_3 = null;

        EObject lv_predefDepClauses_5_1 = null;

        EObject lv_predefDepClauses_5_2 = null;

        EObject lv_predefDepClauses_5_3 = null;



        	enterRule();

        try {
            // InternalInterparameterDependenciesLanguage.g:2201:2: ( ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) ) )+ otherlv_6= ')' ) )
            // InternalInterparameterDependenciesLanguage.g:2202:2: ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) ) )+ otherlv_6= ')' )
            {
            // InternalInterparameterDependenciesLanguage.g:2202:2: ( ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) ) )+ otherlv_6= ')' )
            // InternalInterparameterDependenciesLanguage.g:2203:3: ( ruleNot )? ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) ) otherlv_2= '(' ( ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) ) ) (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) ) )+ otherlv_6= ')'
            {
            // InternalInterparameterDependenciesLanguage.g:2203:3: ( ruleNot )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:2204:4: ruleNot
                    {

                    				newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getNotParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_19);
                    ruleNot();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalInterparameterDependenciesLanguage.g:2212:3: ( ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) ) )
            // InternalInterparameterDependenciesLanguage.g:2213:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            {
            // InternalInterparameterDependenciesLanguage.g:2213:4: ( (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' ) )
            // InternalInterparameterDependenciesLanguage.g:2214:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            {
            // InternalInterparameterDependenciesLanguage.g:2214:5: (lv_predefDepType_1_1= 'Or' | lv_predefDepType_1_2= 'OnlyOne' | lv_predefDepType_1_3= 'AllOrNone' | lv_predefDepType_1_4= 'ZeroOrOne' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt47=1;
                }
                break;
            case 24:
                {
                alt47=2;
                }
                break;
            case 25:
                {
                alt47=3;
                }
                break;
            case 26:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:2215:6: lv_predefDepType_1_1= 'Or'
                    {
                    lv_predefDepType_1_1=(Token)match(input,23,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_1, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeOrKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:2226:6: lv_predefDepType_1_2= 'OnlyOne'
                    {
                    lv_predefDepType_1_2=(Token)match(input,24,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_2, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeOnlyOneKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:2237:6: lv_predefDepType_1_3= 'AllOrNone'
                    {
                    lv_predefDepType_1_3=(Token)match(input,25,FOLLOW_12); 

                    						newLeafNode(lv_predefDepType_1_3, grammarAccess.getPredefinedDependencyAccess().getPredefDepTypeAllOrNoneKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						setWithLastConsumed(current, "predefDepType", lv_predefDepType_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalInterparameterDependenciesLanguage.g:2248:6: lv_predefDepType_1_4= 'ZeroOrOne'
                    {
                    lv_predefDepType_1_4=(Token)match(input,26,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPredefinedDependencyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalInterparameterDependenciesLanguage.g:2265:3: ( ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) ) )
            // InternalInterparameterDependenciesLanguage.g:2266:4: ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) )
            {
            // InternalInterparameterDependenciesLanguage.g:2266:4: ( (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency ) )
            // InternalInterparameterDependenciesLanguage.g:2267:5: (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency )
            {
            // InternalInterparameterDependenciesLanguage.g:2267:5: (lv_predefDepClauses_3_1= rulePositiveClause | lv_predefDepClauses_3_2= rulePositiveFullClause | lv_predefDepClauses_3_3= rulePredefinedDependency )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt48=1;
                }
                break;
            case 21:
                {
                alt48=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalInterparameterDependenciesLanguage.g:2268:6: lv_predefDepClauses_3_1= rulePositiveClause
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveClauseParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_predefDepClauses_3_1=rulePositiveClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_3_1,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalInterparameterDependenciesLanguage.g:2284:6: lv_predefDepClauses_3_2= rulePositiveFullClause
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveFullClauseParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_20);
                    lv_predefDepClauses_3_2=rulePositiveFullClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_3_2,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveFullClause");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalInterparameterDependenciesLanguage.g:2300:6: lv_predefDepClauses_3_3= rulePredefinedDependency
                    {

                    						newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPredefinedDependencyParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_20);
                    lv_predefDepClauses_3_3=rulePredefinedDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
                    						}
                    						add(
                    							current,
                    							"predefDepClauses",
                    							lv_predefDepClauses_3_3,
                    							"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalInterparameterDependenciesLanguage.g:2318:3: (otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalInterparameterDependenciesLanguage.g:2319:4: otherlv_4= ',' ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPredefinedDependencyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInterparameterDependenciesLanguage.g:2323:4: ( ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) ) )
            	    // InternalInterparameterDependenciesLanguage.g:2324:5: ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:2324:5: ( (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency ) )
            	    // InternalInterparameterDependenciesLanguage.g:2325:6: (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency )
            	    {
            	    // InternalInterparameterDependenciesLanguage.g:2325:6: (lv_predefDepClauses_5_1= rulePositiveClause | lv_predefDepClauses_5_2= rulePositiveFullClause | lv_predefDepClauses_5_3= rulePredefinedDependency )
            	    int alt49=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case 23:
            	    case 24:
            	    case 25:
            	    case 26:
            	    case 28:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // InternalInterparameterDependenciesLanguage.g:2326:7: lv_predefDepClauses_5_1= rulePositiveClause
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveClauseParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_21);
            	            lv_predefDepClauses_5_1=rulePositiveClause();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_5_1,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveClause");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalInterparameterDependenciesLanguage.g:2342:7: lv_predefDepClauses_5_2= rulePositiveFullClause
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPositiveFullClauseParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_21);
            	            lv_predefDepClauses_5_2=rulePositiveFullClause();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_5_2,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PositiveFullClause");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalInterparameterDependenciesLanguage.g:2358:7: lv_predefDepClauses_5_3= rulePredefinedDependency
            	            {

            	            							newCompositeNode(grammarAccess.getPredefinedDependencyAccess().getPredefDepClausesPredefinedDependencyParserRuleCall_4_1_0_2());
            	            						
            	            pushFollow(FOLLOW_21);
            	            lv_predefDepClauses_5_3=rulePredefinedDependency();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPredefinedDependencyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"predefDepClauses",
            	            								lv_predefDepClauses_5_3,
            	            								"es.us.isa.interparamdep.InterparameterDependenciesLanguage.PredefinedDependency");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\uffff\1\12\11\uffff\1\17\2\12\3\uffff\1\17\1\12\1\uffff\1\17";
    static final String dfa_3s = "\1\5\1\14\1\5\1\uffff\6\5\1\uffff\3\14\1\6\1\uffff\1\6\2\14\1\6\1\14";
    static final String dfa_4s = "\1\34\1\36\1\32\1\uffff\4\5\1\6\1\5\1\uffff\2\36\1\37\1\6\1\uffff\1\6\2\37\1\6\1\37";
    static final String dfa_5s = "\3\uffff\1\1\6\uffff\1\2\4\uffff\1\3\5\uffff";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\17\uffff\1\3\1\uffff\4\3\1\uffff\1\2",
            "\1\12\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\10\uffff\2\3",
            "\1\13\17\uffff\1\3\1\uffff\4\3",
            "",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14\1\15",
            "\1\14",
            "",
            "\1\17\4\uffff\1\16\2\uffff\1\17\10\uffff\2\3",
            "\1\12\7\uffff\1\12\10\uffff\2\3",
            "\1\12\7\uffff\1\12\10\uffff\2\3\1\20",
            "\1\21",
            "",
            "\1\22",
            "\1\17\7\uffff\1\17\10\uffff\2\3\1\23",
            "\1\12\7\uffff\1\12\10\uffff\2\3\1\20",
            "\1\24",
            "\1\17\7\uffff\1\17\10\uffff\2\3\1\23"
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
            return "389:2: (this_Clause3_0= ruleClause3 | this_PositiveAtomic_1= rulePositiveAtomic | this_NegativeAtomic_2= ruleNegativeAtomic )";
        }
    }
    static final String dfa_8s = "\1\5\1\15\1\5\1\uffff\6\5\1\uffff\1\21\2\26\1\6\1\uffff\1\6\2\26\1\6\1\26";
    static final String dfa_9s = "\1\34\1\36\1\25\1\uffff\1\6\5\5\1\uffff\1\36\1\37\1\36\1\6\1\uffff\1\6\2\37\1\6\1\37";
    static final String dfa_10s = "\3\uffff\1\3\6\uffff\1\1\4\uffff\1\2\5\uffff";
    static final String[] dfa_11s = {
            "\1\1\17\uffff\1\3\6\uffff\1\2",
            "\1\5\1\6\1\7\1\10\1\4\1\11\3\uffff\1\12\6\uffff\2\3",
            "\1\13\17\uffff\1\3",
            "",
            "\1\15\1\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            "\1\16\4\uffff\1\17\6\uffff\2\3",
            "\1\12\6\uffff\2\3\1\20",
            "\1\12\6\uffff\2\3",
            "\1\21",
            "",
            "\1\22",
            "\1\17\6\uffff\2\3\1\23",
            "\1\12\6\uffff\2\3\1\20",
            "\1\24",
            "\1\17\6\uffff\2\3\1\23"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "674:6: (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= ruleNegativeAtomic | lv_additionalElements_2_3= ruleClause2 )";
        }
    }
    static final String dfa_12s = "\1\34\1\36\1\25\1\uffff\4\5\1\6\1\5\1\uffff\2\36\1\37\1\6\1\uffff\1\6\2\37\1\6\1\37";
    static final String[] dfa_13s = {
            "\1\1\17\uffff\1\3\6\uffff\1\2",
            "\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\12\6\uffff\2\3",
            "\1\13\17\uffff\1\3",
            "",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14\1\15",
            "\1\14",
            "",
            "\1\16\4\uffff\1\17\6\uffff\2\3",
            "\1\12\6\uffff\2\3",
            "\1\12\6\uffff\2\3\1\20",
            "\1\21",
            "",
            "\1\22",
            "\1\17\6\uffff\2\3\1\23",
            "\1\12\6\uffff\2\3\1\20",
            "\1\24",
            "\1\17\6\uffff\2\3\1\23"
    };
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_12;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "799:6: (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= ruleNegativeAtomic | lv_additionalElements_7_3= ruleClause2 )";
        }
    }
    static final String dfa_14s = "\1\34\1\36\1\32\1\uffff\1\6\5\5\1\uffff\1\36\1\37\1\36\1\6\1\uffff\1\6\2\37\1\6\1\37";
    static final String[] dfa_15s = {
            "\1\1\17\uffff\1\3\1\uffff\4\3\1\uffff\1\2",
            "\1\12\1\5\1\6\1\7\1\10\1\4\1\11\1\uffff\1\12\1\uffff\1\12\6\uffff\2\3",
            "\1\13\17\uffff\1\3\1\uffff\4\3",
            "",
            "\1\15\1\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "",
            "\1\17\4\uffff\1\16\2\uffff\1\17\1\uffff\1\17\6\uffff\2\3",
            "\1\12\7\uffff\1\12\1\uffff\1\12\6\uffff\2\3\1\20",
            "\1\12\7\uffff\1\12\1\uffff\1\12\6\uffff\2\3",
            "\1\21",
            "",
            "\1\22",
            "\1\17\7\uffff\1\17\1\uffff\1\17\6\uffff\2\3\1\23",
            "\1\12\7\uffff\1\12\1\uffff\1\12\6\uffff\2\3\1\20",
            "\1\24",
            "\1\17\7\uffff\1\17\1\uffff\1\17\6\uffff\2\3\1\23"
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_14;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "895:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= ruleNegativeAtomic | lv_additionalElements_1_3= ruleClause3 )";
        }
    }
    static final String dfa_16s = "\16\uffff";
    static final String dfa_17s = "\1\uffff\1\11\10\uffff\2\11\1\uffff\1\11";
    static final String dfa_18s = "\1\5\1\15\1\uffff\6\5\1\uffff\2\26\1\6\1\26";
    static final String dfa_19s = "\1\34\1\36\1\uffff\1\6\5\5\1\uffff\1\37\1\36\1\6\1\37";
    static final String dfa_20s = "\2\uffff\1\2\6\uffff\1\1\4\uffff";
    static final String dfa_21s = "\16\uffff}>";
    static final String[] dfa_22s = {
            "\1\1\17\uffff\1\2\1\uffff\4\2\1\uffff\1\2",
            "\1\4\1\5\1\6\1\7\1\3\1\10\3\uffff\1\11\4\uffff\1\11\1\uffff\2\2",
            "",
            "\1\13\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "\1\11\4\uffff\1\11\1\uffff\2\2\1\14",
            "\1\11\4\uffff\1\11\1\uffff\2\2",
            "\1\15",
            "\1\11\4\uffff\1\11\1\uffff\2\2\1\14"
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_16;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1215:5: (lv_additionalElements_1_1= rulePositiveAtomic | lv_additionalElements_1_2= rulePositiveClause3 )";
        }
    }
    static final String dfa_23s = "\1\5\1\15\1\uffff\6\5\1\uffff\2\33\1\6\1\33";
    static final String[] dfa_24s = {
            "\1\1\17\uffff\1\2\1\uffff\4\2\1\uffff\1\2",
            "\1\4\1\5\1\6\1\7\1\3\1\10\10\uffff\1\11\1\uffff\2\2",
            "",
            "\1\13\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "\1\11\1\uffff\2\2\1\14",
            "\1\11\1\uffff\2\2",
            "\1\15",
            "\1\11\1\uffff\2\2\1\14"
    };
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_23;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1517:5: (lv_predefDepClauses_3_1= rulePositiveAtomic | lv_predefDepClauses_3_2= rulePositiveClause3 )";
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1559:6: (lv_predefDepClauses_5_1= rulePositiveAtomic | lv_predefDepClauses_5_2= rulePositiveClause3 )";
        }
    }
    static final String dfa_25s = "\1\34\1\36\1\uffff\4\5\1\6\1\5\1\uffff\1\36\1\37\1\6\1\37";
    static final String[] dfa_26s = {
            "\1\1\17\uffff\1\2\6\uffff\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\11\6\uffff\2\2",
            "",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12\1\13",
            "\1\12",
            "",
            "\1\11\6\uffff\2\2",
            "\1\11\6\uffff\2\2\1\14",
            "\1\15",
            "\1\11\6\uffff\2\2\1\14"
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_16;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_25;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1659:6: (lv_additionalElements_2_1= rulePositiveAtomic | lv_additionalElements_2_2= rulePositiveClause2 )";
        }
    }
    static final String[] dfa_27s = {
            "\1\1\17\uffff\1\2\6\uffff\1\2",
            "\1\4\1\5\1\6\1\7\1\3\1\10\3\uffff\1\11\6\uffff\2\2",
            "",
            "\1\13\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "\1\11\6\uffff\2\2\1\14",
            "\1\11\6\uffff\2\2",
            "\1\15",
            "\1\11\6\uffff\2\2\1\14"
    };
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1750:6: (lv_additionalElements_7_1= rulePositiveAtomic | lv_additionalElements_7_2= rulePositiveClause2 )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000017880022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000077A80020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000017A00020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000060400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010200020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000077880020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});

}