package ml.classification.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ml.classification.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_METRIC", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_SEP", "RULE_ALGO_NAME", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'use_metric'", "'use_column'", "'unuse_column'", "'predict_column'", "'use_strategy'", "'train_test'", "'cross_valid'", "'read'", "'use_algorithm'", "'print'", "'='"
    };
    public static final int RULE_SEP=8;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ALGO_NAME=9;
    public static final int EOF=-1;
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_METRIC=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ML";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleML"
    // InternalDSL.g:64:1: entryRuleML returns [EObject current=null] : iv_ruleML= ruleML EOF ;
    public final EObject entryRuleML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleML = null;


        try {
            // InternalDSL.g:64:43: (iv_ruleML= ruleML EOF )
            // InternalDSL.g:65:2: iv_ruleML= ruleML EOF
            {
             newCompositeNode(grammarAccess.getMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleML=ruleML();

            state._fsp--;

             current =iv_ruleML; 
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
    // $ANTLR end "entryRuleML"


    // $ANTLR start "ruleML"
    // InternalDSL.g:71:1: ruleML returns [EObject current=null] : ( ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )* ( (lv_statements_2_0= ruleStatement ) ) ) ;
    public final EObject ruleML() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:77:2: ( ( ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )* ( (lv_statements_2_0= ruleStatement ) ) ) )
            // InternalDSL.g:78:2: ( ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )* ( (lv_statements_2_0= ruleStatement ) ) )
            {
            // InternalDSL.g:78:2: ( ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )* ( (lv_statements_2_0= ruleStatement ) ) )
            // InternalDSL.g:79:3: ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )* ( (lv_statements_2_0= ruleStatement ) )
            {
            // InternalDSL.g:79:3: ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:80:4: ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n'
            	    {
            	    // InternalDSL.g:80:4: ( (lv_statements_0_0= ruleStatement ) )
            	    // InternalDSL.g:81:5: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalDSL.g:81:5: (lv_statements_0_0= ruleStatement )
            	    // InternalDSL.g:82:6: lv_statements_0_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_0_0,
            	    							"ml.classification.DSL.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMLAccess().getLineFeedKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDSL.g:104:3: ( (lv_statements_2_0= ruleStatement ) )
            // InternalDSL.g:105:4: (lv_statements_2_0= ruleStatement )
            {
            // InternalDSL.g:105:4: (lv_statements_2_0= ruleStatement )
            // InternalDSL.g:106:5: lv_statements_2_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statements_2_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_2_0,
            						"ml.classification.DSL.Statement");
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
    // $ANTLR end "ruleML"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:127:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:127:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:128:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDSL.g:134:1: ruleStatement returns [EObject current=null] : ( ( (lv_statement_0_0= ruleExpression ) ) | ( (lv_statement_1_0= rulePrimitive ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:140:2: ( ( ( (lv_statement_0_0= ruleExpression ) ) | ( (lv_statement_1_0= rulePrimitive ) ) ) )
            // InternalDSL.g:141:2: ( ( (lv_statement_0_0= ruleExpression ) ) | ( (lv_statement_1_0= rulePrimitive ) ) )
            {
            // InternalDSL.g:141:2: ( ( (lv_statement_0_0= ruleExpression ) ) | ( (lv_statement_1_0= rulePrimitive ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=20)||(LA2_0>=23 && LA2_0<=25)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:142:3: ( (lv_statement_0_0= ruleExpression ) )
                    {
                    // InternalDSL.g:142:3: ( (lv_statement_0_0= ruleExpression ) )
                    // InternalDSL.g:143:4: (lv_statement_0_0= ruleExpression )
                    {
                    // InternalDSL.g:143:4: (lv_statement_0_0= ruleExpression )
                    // InternalDSL.g:144:5: lv_statement_0_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getStatementExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_0,
                    						"ml.classification.DSL.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:162:3: ( (lv_statement_1_0= rulePrimitive ) )
                    {
                    // InternalDSL.g:162:3: ( (lv_statement_1_0= rulePrimitive ) )
                    // InternalDSL.g:163:4: (lv_statement_1_0= rulePrimitive )
                    {
                    // InternalDSL.g:163:4: (lv_statement_1_0= rulePrimitive )
                    // InternalDSL.g:164:5: lv_statement_1_0= rulePrimitive
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getStatementPrimitiveParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_1_0=rulePrimitive();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_1_0,
                    						"ml.classification.DSL.Primitive");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrimitive"
    // InternalDSL.g:185:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDSL.g:185:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDSL.g:186:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalDSL.g:192:1: rulePrimitive returns [EObject current=null] : ( ( (lv_primitive_0_0= rulePrint ) ) | ( (lv_primitive_1_0= ruleAlgo_choose ) ) | ( (lv_primitive_2_0= ruleRead ) ) | ( (lv_primitive_3_0= ruleStrategy_choose ) ) | ( (lv_primitive_4_0= ruleColumn ) ) | ( (lv_primitive_5_0= ruleUse_Metric ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject lv_primitive_0_0 = null;

        EObject lv_primitive_1_0 = null;

        EObject lv_primitive_2_0 = null;

        EObject lv_primitive_3_0 = null;

        EObject lv_primitive_4_0 = null;

        EObject lv_primitive_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:198:2: ( ( ( (lv_primitive_0_0= rulePrint ) ) | ( (lv_primitive_1_0= ruleAlgo_choose ) ) | ( (lv_primitive_2_0= ruleRead ) ) | ( (lv_primitive_3_0= ruleStrategy_choose ) ) | ( (lv_primitive_4_0= ruleColumn ) ) | ( (lv_primitive_5_0= ruleUse_Metric ) ) ) )
            // InternalDSL.g:199:2: ( ( (lv_primitive_0_0= rulePrint ) ) | ( (lv_primitive_1_0= ruleAlgo_choose ) ) | ( (lv_primitive_2_0= ruleRead ) ) | ( (lv_primitive_3_0= ruleStrategy_choose ) ) | ( (lv_primitive_4_0= ruleColumn ) ) | ( (lv_primitive_5_0= ruleUse_Metric ) ) )
            {
            // InternalDSL.g:199:2: ( ( (lv_primitive_0_0= rulePrint ) ) | ( (lv_primitive_1_0= ruleAlgo_choose ) ) | ( (lv_primitive_2_0= ruleRead ) ) | ( (lv_primitive_3_0= ruleStrategy_choose ) ) | ( (lv_primitive_4_0= ruleColumn ) ) | ( (lv_primitive_5_0= ruleUse_Metric ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:200:3: ( (lv_primitive_0_0= rulePrint ) )
                    {
                    // InternalDSL.g:200:3: ( (lv_primitive_0_0= rulePrint ) )
                    // InternalDSL.g:201:4: (lv_primitive_0_0= rulePrint )
                    {
                    // InternalDSL.g:201:4: (lv_primitive_0_0= rulePrint )
                    // InternalDSL.g:202:5: lv_primitive_0_0= rulePrint
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitivePrintParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_0_0=rulePrint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_0_0,
                    						"ml.classification.DSL.Print");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:220:3: ( (lv_primitive_1_0= ruleAlgo_choose ) )
                    {
                    // InternalDSL.g:220:3: ( (lv_primitive_1_0= ruleAlgo_choose ) )
                    // InternalDSL.g:221:4: (lv_primitive_1_0= ruleAlgo_choose )
                    {
                    // InternalDSL.g:221:4: (lv_primitive_1_0= ruleAlgo_choose )
                    // InternalDSL.g:222:5: lv_primitive_1_0= ruleAlgo_choose
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitiveAlgo_chooseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_1_0=ruleAlgo_choose();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_1_0,
                    						"ml.classification.DSL.Algo_choose");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:240:3: ( (lv_primitive_2_0= ruleRead ) )
                    {
                    // InternalDSL.g:240:3: ( (lv_primitive_2_0= ruleRead ) )
                    // InternalDSL.g:241:4: (lv_primitive_2_0= ruleRead )
                    {
                    // InternalDSL.g:241:4: (lv_primitive_2_0= ruleRead )
                    // InternalDSL.g:242:5: lv_primitive_2_0= ruleRead
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitiveReadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_2_0=ruleRead();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_2_0,
                    						"ml.classification.DSL.Read");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:260:3: ( (lv_primitive_3_0= ruleStrategy_choose ) )
                    {
                    // InternalDSL.g:260:3: ( (lv_primitive_3_0= ruleStrategy_choose ) )
                    // InternalDSL.g:261:4: (lv_primitive_3_0= ruleStrategy_choose )
                    {
                    // InternalDSL.g:261:4: (lv_primitive_3_0= ruleStrategy_choose )
                    // InternalDSL.g:262:5: lv_primitive_3_0= ruleStrategy_choose
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitiveStrategy_chooseParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_3_0=ruleStrategy_choose();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_3_0,
                    						"ml.classification.DSL.Strategy_choose");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:280:3: ( (lv_primitive_4_0= ruleColumn ) )
                    {
                    // InternalDSL.g:280:3: ( (lv_primitive_4_0= ruleColumn ) )
                    // InternalDSL.g:281:4: (lv_primitive_4_0= ruleColumn )
                    {
                    // InternalDSL.g:281:4: (lv_primitive_4_0= ruleColumn )
                    // InternalDSL.g:282:5: lv_primitive_4_0= ruleColumn
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitiveColumnParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_4_0=ruleColumn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_4_0,
                    						"ml.classification.DSL.Column");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:300:3: ( (lv_primitive_5_0= ruleUse_Metric ) )
                    {
                    // InternalDSL.g:300:3: ( (lv_primitive_5_0= ruleUse_Metric ) )
                    // InternalDSL.g:301:4: (lv_primitive_5_0= ruleUse_Metric )
                    {
                    // InternalDSL.g:301:4: (lv_primitive_5_0= ruleUse_Metric )
                    // InternalDSL.g:302:5: lv_primitive_5_0= ruleUse_Metric
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrimitiveUse_MetricParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_5_0=ruleUse_Metric();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_5_0,
                    						"ml.classification.DSL.Use_Metric");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleUse_Metric"
    // InternalDSL.g:323:1: entryRuleUse_Metric returns [EObject current=null] : iv_ruleUse_Metric= ruleUse_Metric EOF ;
    public final EObject entryRuleUse_Metric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUse_Metric = null;


        try {
            // InternalDSL.g:323:51: (iv_ruleUse_Metric= ruleUse_Metric EOF )
            // InternalDSL.g:324:2: iv_ruleUse_Metric= ruleUse_Metric EOF
            {
             newCompositeNode(grammarAccess.getUse_MetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUse_Metric=ruleUse_Metric();

            state._fsp--;

             current =iv_ruleUse_Metric; 
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
    // $ANTLR end "entryRuleUse_Metric"


    // $ANTLR start "ruleUse_Metric"
    // InternalDSL.g:330:1: ruleUse_Metric returns [EObject current=null] : (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) ) ;
    public final EObject ruleUse_Metric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_metric_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:336:2: ( (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) ) )
            // InternalDSL.g:337:2: (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) )
            {
            // InternalDSL.g:337:2: (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) )
            // InternalDSL.g:338:3: otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUse_MetricAccess().getUse_metricKeyword_0());
            		
            // InternalDSL.g:342:3: ( (lv_metric_1_0= RULE_METRIC ) )
            // InternalDSL.g:343:4: (lv_metric_1_0= RULE_METRIC )
            {
            // InternalDSL.g:343:4: (lv_metric_1_0= RULE_METRIC )
            // InternalDSL.g:344:5: lv_metric_1_0= RULE_METRIC
            {
            lv_metric_1_0=(Token)match(input,RULE_METRIC,FOLLOW_2); 

            					newLeafNode(lv_metric_1_0, grammarAccess.getUse_MetricAccess().getMetricMETRICTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUse_MetricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"metric",
            						lv_metric_1_0,
            						"ml.classification.DSL.METRIC");
            				

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
    // $ANTLR end "ruleUse_Metric"


    // $ANTLR start "entryRuleColumn"
    // InternalDSL.g:364:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDSL.g:364:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDSL.g:365:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDSL.g:371:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_use_1_0=null;
        Token otherlv_2=null;
        Token lv_unuse_3_0=null;
        Token otherlv_4=null;
        Token lv_predict_5_0=null;


        	enterRule();

        try {
            // InternalDSL.g:377:2: ( ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) ) )
            // InternalDSL.g:378:2: ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) )
            {
            // InternalDSL.g:378:2: ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDSL.g:379:3: (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ )
                    {
                    // InternalDSL.g:379:3: (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ )
                    // InternalDSL.g:380:4: otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getUse_columnKeyword_0_0());
                    			
                    // InternalDSL.g:384:4: ( (lv_use_1_0= RULE_INT ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_INT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDSL.g:385:5: (lv_use_1_0= RULE_INT )
                    	    {
                    	    // InternalDSL.g:385:5: (lv_use_1_0= RULE_INT )
                    	    // InternalDSL.g:386:6: lv_use_1_0= RULE_INT
                    	    {
                    	    lv_use_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    	    						newLeafNode(lv_use_1_0, grammarAccess.getColumnAccess().getUseINTTerminalRuleCall_0_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getColumnRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"use",
                    	    							lv_use_1_0,
                    	    							"org.eclipse.xtext.common.Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:404:3: (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ )
                    {
                    // InternalDSL.g:404:3: (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ )
                    // InternalDSL.g:405:4: otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getUnuse_columnKeyword_1_0());
                    			
                    // InternalDSL.g:409:4: ( (lv_unuse_3_0= RULE_INT ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDSL.g:410:5: (lv_unuse_3_0= RULE_INT )
                    	    {
                    	    // InternalDSL.g:410:5: (lv_unuse_3_0= RULE_INT )
                    	    // InternalDSL.g:411:6: lv_unuse_3_0= RULE_INT
                    	    {
                    	    lv_unuse_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    	    						newLeafNode(lv_unuse_3_0, grammarAccess.getColumnAccess().getUnuseINTTerminalRuleCall_1_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getColumnRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"unuse",
                    	    							lv_unuse_3_0,
                    	    							"org.eclipse.xtext.common.Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:429:3: (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) )
                    {
                    // InternalDSL.g:429:3: (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) )
                    // InternalDSL.g:430:4: otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getPredict_columnKeyword_2_0());
                    			
                    // InternalDSL.g:434:4: ( (lv_predict_5_0= RULE_INT ) )
                    // InternalDSL.g:435:5: (lv_predict_5_0= RULE_INT )
                    {
                    // InternalDSL.g:435:5: (lv_predict_5_0= RULE_INT )
                    // InternalDSL.g:436:6: lv_predict_5_0= RULE_INT
                    {
                    lv_predict_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_predict_5_0, grammarAccess.getColumnAccess().getPredictINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"predict",
                    							lv_predict_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleStrategy_choose"
    // InternalDSL.g:457:1: entryRuleStrategy_choose returns [EObject current=null] : iv_ruleStrategy_choose= ruleStrategy_choose EOF ;
    public final EObject entryRuleStrategy_choose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy_choose = null;


        try {
            // InternalDSL.g:457:56: (iv_ruleStrategy_choose= ruleStrategy_choose EOF )
            // InternalDSL.g:458:2: iv_ruleStrategy_choose= ruleStrategy_choose EOF
            {
             newCompositeNode(grammarAccess.getStrategy_chooseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy_choose=ruleStrategy_choose();

            state._fsp--;

             current =iv_ruleStrategy_choose; 
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
    // $ANTLR end "entryRuleStrategy_choose"


    // $ANTLR start "ruleStrategy_choose"
    // InternalDSL.g:464:1: ruleStrategy_choose returns [EObject current=null] : ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) ) ;
    public final EObject ruleStrategy_choose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_strategy_1_0=null;
        Token lv_ratio_2_0=null;
        Token otherlv_3=null;
        Token lv_strategy_4_0=null;
        Token lv_nb_5_0=null;


        	enterRule();

        try {
            // InternalDSL.g:470:2: ( ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) ) )
            // InternalDSL.g:471:2: ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) )
            {
            // InternalDSL.g:471:2: ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==21) ) {
                    alt8=1;
                }
                else if ( (LA8_1==22) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

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
                    // InternalDSL.g:472:3: (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) )
                    {
                    // InternalDSL.g:472:3: (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) )
                    // InternalDSL.g:473:4: otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_0_0());
                    			
                    // InternalDSL.g:477:4: ( (lv_strategy_1_0= 'train_test' ) )
                    // InternalDSL.g:478:5: (lv_strategy_1_0= 'train_test' )
                    {
                    // InternalDSL.g:478:5: (lv_strategy_1_0= 'train_test' )
                    // InternalDSL.g:479:6: lv_strategy_1_0= 'train_test'
                    {
                    lv_strategy_1_0=(Token)match(input,21,FOLLOW_9); 

                    						newLeafNode(lv_strategy_1_0, grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategy_chooseRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_1_0, "train_test");
                    					

                    }


                    }

                    // InternalDSL.g:491:4: ( (lv_ratio_2_0= RULE_DOUBLE ) )
                    // InternalDSL.g:492:5: (lv_ratio_2_0= RULE_DOUBLE )
                    {
                    // InternalDSL.g:492:5: (lv_ratio_2_0= RULE_DOUBLE )
                    // InternalDSL.g:493:6: lv_ratio_2_0= RULE_DOUBLE
                    {
                    lv_ratio_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_ratio_2_0, grammarAccess.getStrategy_chooseAccess().getRatioDOUBLETerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategy_chooseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ratio",
                    							lv_ratio_2_0,
                    							"ml.classification.DSL.DOUBLE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:511:3: (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? )
                    {
                    // InternalDSL.g:511:3: (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? )
                    // InternalDSL.g:512:4: otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_1_0());
                    			
                    // InternalDSL.g:516:4: ( (lv_strategy_4_0= 'cross_valid' ) )
                    // InternalDSL.g:517:5: (lv_strategy_4_0= 'cross_valid' )
                    {
                    // InternalDSL.g:517:5: (lv_strategy_4_0= 'cross_valid' )
                    // InternalDSL.g:518:6: lv_strategy_4_0= 'cross_valid'
                    {
                    lv_strategy_4_0=(Token)match(input,22,FOLLOW_7); 

                    						newLeafNode(lv_strategy_4_0, grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategy_chooseRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_4_0, "cross_valid");
                    					

                    }


                    }

                    // InternalDSL.g:530:4: ( (lv_nb_5_0= RULE_INT ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDSL.g:531:5: (lv_nb_5_0= RULE_INT )
                            {
                            // InternalDSL.g:531:5: (lv_nb_5_0= RULE_INT )
                            // InternalDSL.g:532:6: lv_nb_5_0= RULE_INT
                            {
                            lv_nb_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            						newLeafNode(lv_nb_5_0, grammarAccess.getStrategy_chooseAccess().getNbINTTerminalRuleCall_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getStrategy_chooseRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"nb",
                            							lv_nb_5_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

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
    // $ANTLR end "ruleStrategy_choose"


    // $ANTLR start "entryRuleRead"
    // InternalDSL.g:553:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalDSL.g:553:45: (iv_ruleRead= ruleRead EOF )
            // InternalDSL.g:554:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalDSL.g:560:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token lv_separator_2_0=null;


        	enterRule();

        try {
            // InternalDSL.g:566:2: ( (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? ) )
            // InternalDSL.g:567:2: (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? )
            {
            // InternalDSL.g:567:2: (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? )
            // InternalDSL.g:568:3: otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            // InternalDSL.g:572:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalDSL.g:573:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalDSL.g:573:4: (lv_path_1_0= RULE_STRING )
            // InternalDSL.g:574:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_path_1_0, grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDSL.g:590:3: ( (lv_separator_2_0= RULE_SEP ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SEP) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:591:4: (lv_separator_2_0= RULE_SEP )
                    {
                    // InternalDSL.g:591:4: (lv_separator_2_0= RULE_SEP )
                    // InternalDSL.g:592:5: lv_separator_2_0= RULE_SEP
                    {
                    lv_separator_2_0=(Token)match(input,RULE_SEP,FOLLOW_2); 

                    					newLeafNode(lv_separator_2_0, grammarAccess.getReadAccess().getSeparatorSEPTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReadRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"separator",
                    						lv_separator_2_0,
                    						"ml.classification.DSL.SEP");
                    				

                    }


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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleAlgo_choose"
    // InternalDSL.g:612:1: entryRuleAlgo_choose returns [EObject current=null] : iv_ruleAlgo_choose= ruleAlgo_choose EOF ;
    public final EObject entryRuleAlgo_choose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgo_choose = null;


        try {
            // InternalDSL.g:612:52: (iv_ruleAlgo_choose= ruleAlgo_choose EOF )
            // InternalDSL.g:613:2: iv_ruleAlgo_choose= ruleAlgo_choose EOF
            {
             newCompositeNode(grammarAccess.getAlgo_chooseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgo_choose=ruleAlgo_choose();

            state._fsp--;

             current =iv_ruleAlgo_choose; 
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
    // $ANTLR end "entryRuleAlgo_choose"


    // $ANTLR start "ruleAlgo_choose"
    // InternalDSL.g:619:1: ruleAlgo_choose returns [EObject current=null] : (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) ) ;
    public final EObject ruleAlgo_choose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_algorithm_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:625:2: ( (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) ) )
            // InternalDSL.g:626:2: (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) )
            {
            // InternalDSL.g:626:2: (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) )
            // InternalDSL.g:627:3: otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgo_chooseAccess().getUse_algorithmKeyword_0());
            		
            // InternalDSL.g:631:3: ( (lv_algorithm_1_0= RULE_ALGO_NAME ) )
            // InternalDSL.g:632:4: (lv_algorithm_1_0= RULE_ALGO_NAME )
            {
            // InternalDSL.g:632:4: (lv_algorithm_1_0= RULE_ALGO_NAME )
            // InternalDSL.g:633:5: lv_algorithm_1_0= RULE_ALGO_NAME
            {
            lv_algorithm_1_0=(Token)match(input,RULE_ALGO_NAME,FOLLOW_2); 

            					newLeafNode(lv_algorithm_1_0, grammarAccess.getAlgo_chooseAccess().getAlgorithmALGO_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgo_chooseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"algorithm",
            						lv_algorithm_1_0,
            						"ml.classification.DSL.ALGO_NAME");
            				

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
    // $ANTLR end "ruleAlgo_choose"


    // $ANTLR start "entryRulePrint"
    // InternalDSL.g:653:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalDSL.g:653:46: (iv_rulePrint= rulePrint EOF )
            // InternalDSL.g:654:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalDSL.g:660:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_val_1_0= ruleConstant ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:666:2: ( (otherlv_0= 'print' ( (lv_val_1_0= ruleConstant ) ) ) )
            // InternalDSL.g:667:2: (otherlv_0= 'print' ( (lv_val_1_0= ruleConstant ) ) )
            {
            // InternalDSL.g:667:2: (otherlv_0= 'print' ( (lv_val_1_0= ruleConstant ) ) )
            // InternalDSL.g:668:3: otherlv_0= 'print' ( (lv_val_1_0= ruleConstant ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalDSL.g:672:3: ( (lv_val_1_0= ruleConstant ) )
            // InternalDSL.g:673:4: (lv_val_1_0= ruleConstant )
            {
            // InternalDSL.g:673:4: (lv_val_1_0= ruleConstant )
            // InternalDSL.g:674:5: lv_val_1_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getValConstantParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"ml.classification.DSL.Constant");
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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:695:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDSL.g:695:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDSL.g:696:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDSL.g:702:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleConstant ) ) | ( (lv_expr_1_0= ruleAssign ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:708:2: ( ( ( (lv_expr_0_0= ruleConstant ) ) | ( (lv_expr_1_0= ruleAssign ) ) ) )
            // InternalDSL.g:709:2: ( ( (lv_expr_0_0= ruleConstant ) ) | ( (lv_expr_1_0= ruleAssign ) ) )
            {
            // InternalDSL.g:709:2: ( ( (lv_expr_0_0= ruleConstant ) ) | ( (lv_expr_1_0= ruleAssign ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==26) ) {
                    alt10=2;
                }
                else if ( (LA10_2==EOF||LA10_2==15) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:710:3: ( (lv_expr_0_0= ruleConstant ) )
                    {
                    // InternalDSL.g:710:3: ( (lv_expr_0_0= ruleConstant ) )
                    // InternalDSL.g:711:4: (lv_expr_0_0= ruleConstant )
                    {
                    // InternalDSL.g:711:4: (lv_expr_0_0= ruleConstant )
                    // InternalDSL.g:712:5: lv_expr_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getExprConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"expr",
                    						lv_expr_0_0,
                    						"ml.classification.DSL.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:730:3: ( (lv_expr_1_0= ruleAssign ) )
                    {
                    // InternalDSL.g:730:3: ( (lv_expr_1_0= ruleAssign ) )
                    // InternalDSL.g:731:4: (lv_expr_1_0= ruleAssign )
                    {
                    // InternalDSL.g:731:4: (lv_expr_1_0= ruleAssign )
                    // InternalDSL.g:732:5: lv_expr_1_0= ruleAssign
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getExprAssignParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr_1_0=ruleAssign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"expr",
                    						lv_expr_1_0,
                    						"ml.classification.DSL.Assign");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssign"
    // InternalDSL.g:753:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalDSL.g:753:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalDSL.g:754:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalDSL.g:760:1: ruleAssign returns [EObject current=null] : ( ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) ) ) | ( ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_varname_0_0=null;
        Token otherlv_1=null;
        Token lv_varname_3_0=null;
        Token otherlv_4=null;
        EObject lv_val_2_0 = null;

        EObject lv_val_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:766:2: ( ( ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) ) ) | ( ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) ) ) ) )
            // InternalDSL.g:767:2: ( ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) ) ) | ( ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) ) ) )
            {
            // InternalDSL.g:767:2: ( ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) ) ) | ( ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=RULE_INT && LA11_2<=RULE_STRING)||LA11_2==RULE_ID) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_2>=16 && LA11_2<=20)||(LA11_2>=23 && LA11_2<=25)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:768:3: ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) ) )
                    {
                    // InternalDSL.g:768:3: ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) ) )
                    // InternalDSL.g:769:4: ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleConstant ) )
                    {
                    // InternalDSL.g:769:4: ( (lv_varname_0_0= RULE_ID ) )
                    // InternalDSL.g:770:5: (lv_varname_0_0= RULE_ID )
                    {
                    // InternalDSL.g:770:5: (lv_varname_0_0= RULE_ID )
                    // InternalDSL.g:771:6: lv_varname_0_0= RULE_ID
                    {
                    lv_varname_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_varname_0_0, grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varname",
                    							lv_varname_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalDSL.g:791:4: ( (lv_val_2_0= ruleConstant ) )
                    // InternalDSL.g:792:5: (lv_val_2_0= ruleConstant )
                    {
                    // InternalDSL.g:792:5: (lv_val_2_0= ruleConstant )
                    // InternalDSL.g:793:6: lv_val_2_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getAssignAccess().getValConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_2_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"ml.classification.DSL.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:812:3: ( ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) ) )
                    {
                    // InternalDSL.g:812:3: ( ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) ) )
                    // InternalDSL.g:813:4: ( (lv_varname_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_val_5_0= rulePrimitive ) )
                    {
                    // InternalDSL.g:813:4: ( (lv_varname_3_0= RULE_ID ) )
                    // InternalDSL.g:814:5: (lv_varname_3_0= RULE_ID )
                    {
                    // InternalDSL.g:814:5: (lv_varname_3_0= RULE_ID )
                    // InternalDSL.g:815:6: lv_varname_3_0= RULE_ID
                    {
                    lv_varname_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_varname_3_0, grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varname",
                    							lv_varname_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalDSL.g:835:4: ( (lv_val_5_0= rulePrimitive ) )
                    // InternalDSL.g:836:5: (lv_val_5_0= rulePrimitive )
                    {
                    // InternalDSL.g:836:5: (lv_val_5_0= rulePrimitive )
                    // InternalDSL.g:837:6: lv_val_5_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getAssignAccess().getValPrimitiveParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_val_5_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"ml.classification.DSL.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleConstant"
    // InternalDSL.g:859:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDSL.g:859:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDSL.g:860:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDSL.g:866:1: ruleConstant returns [EObject current=null] : ( ( (lv_valInt_0_0= RULE_INT ) ) | ( (lv_valDouble_1_0= RULE_DOUBLE ) ) | ( (lv_valString_2_0= RULE_STRING ) ) | ( (lv_valID_3_0= RULE_ID ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_valInt_0_0=null;
        Token lv_valDouble_1_0=null;
        Token lv_valString_2_0=null;
        Token lv_valID_3_0=null;


        	enterRule();

        try {
            // InternalDSL.g:872:2: ( ( ( (lv_valInt_0_0= RULE_INT ) ) | ( (lv_valDouble_1_0= RULE_DOUBLE ) ) | ( (lv_valString_2_0= RULE_STRING ) ) | ( (lv_valID_3_0= RULE_ID ) ) ) )
            // InternalDSL.g:873:2: ( ( (lv_valInt_0_0= RULE_INT ) ) | ( (lv_valDouble_1_0= RULE_DOUBLE ) ) | ( (lv_valString_2_0= RULE_STRING ) ) | ( (lv_valID_3_0= RULE_ID ) ) )
            {
            // InternalDSL.g:873:2: ( ( (lv_valInt_0_0= RULE_INT ) ) | ( (lv_valDouble_1_0= RULE_DOUBLE ) ) | ( (lv_valString_2_0= RULE_STRING ) ) | ( (lv_valID_3_0= RULE_ID ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDSL.g:874:3: ( (lv_valInt_0_0= RULE_INT ) )
                    {
                    // InternalDSL.g:874:3: ( (lv_valInt_0_0= RULE_INT ) )
                    // InternalDSL.g:875:4: (lv_valInt_0_0= RULE_INT )
                    {
                    // InternalDSL.g:875:4: (lv_valInt_0_0= RULE_INT )
                    // InternalDSL.g:876:5: lv_valInt_0_0= RULE_INT
                    {
                    lv_valInt_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valInt_0_0, grammarAccess.getConstantAccess().getValIntINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valInt",
                    						lv_valInt_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:893:3: ( (lv_valDouble_1_0= RULE_DOUBLE ) )
                    {
                    // InternalDSL.g:893:3: ( (lv_valDouble_1_0= RULE_DOUBLE ) )
                    // InternalDSL.g:894:4: (lv_valDouble_1_0= RULE_DOUBLE )
                    {
                    // InternalDSL.g:894:4: (lv_valDouble_1_0= RULE_DOUBLE )
                    // InternalDSL.g:895:5: lv_valDouble_1_0= RULE_DOUBLE
                    {
                    lv_valDouble_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_valDouble_1_0, grammarAccess.getConstantAccess().getValDoubleDOUBLETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valDouble",
                    						lv_valDouble_1_0,
                    						"ml.classification.DSL.DOUBLE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:912:3: ( (lv_valString_2_0= RULE_STRING ) )
                    {
                    // InternalDSL.g:912:3: ( (lv_valString_2_0= RULE_STRING ) )
                    // InternalDSL.g:913:4: (lv_valString_2_0= RULE_STRING )
                    {
                    // InternalDSL.g:913:4: (lv_valString_2_0= RULE_STRING )
                    // InternalDSL.g:914:5: lv_valString_2_0= RULE_STRING
                    {
                    lv_valString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_valString_2_0, grammarAccess.getConstantAccess().getValStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valString",
                    						lv_valString_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:931:3: ( (lv_valID_3_0= RULE_ID ) )
                    {
                    // InternalDSL.g:931:3: ( (lv_valID_3_0= RULE_ID ) )
                    // InternalDSL.g:932:4: (lv_valID_3_0= RULE_ID )
                    {
                    // InternalDSL.g:932:4: (lv_valID_3_0= RULE_ID )
                    // InternalDSL.g:933:5: lv_valID_3_0= RULE_ID
                    {
                    lv_valID_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_valID_3_0, grammarAccess.getConstantAccess().getValIDIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valID",
                    						lv_valID_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleConstant"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\72\uffff";
    static final String dfa_2s = "\1\uffff\4\16\13\uffff\6\16\1\uffff\11\16\10\uffff\11\16\1\uffff\10\16";
    static final String dfa_3s = "\1\5\4\17\1\5\1\11\1\7\1\25\3\5\1\4\2\uffff\1\5\5\17\1\10\1\6\3\5\6\17\1\5\1\11\1\7\1\25\3\5\1\4\10\17\1\10\1\6\3\5\5\17";
    static final String dfa_4s = "\1\31\3\17\1\32\1\12\1\11\1\7\1\26\3\5\1\4\2\uffff\1\31\6\17\1\6\11\17\1\12\1\11\1\7\1\26\3\5\1\4\11\17\1\6\10\17";
    static final String dfa_5s = "\15\uffff\1\1\1\2\53\uffff";
    static final String dfa_6s = "\72\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\2\uffff\1\4\5\uffff\1\14\1\11\1\12\1\13\1\10\2\uffff\1\7\1\6\1\5",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15\12\uffff\1\17",
            "\1\20\1\21\1\22\2\uffff\1\23",
            "\1\24",
            "\1\25",
            "\1\26\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "\1\34\1\35\1\36\2\uffff\1\37\5\uffff\1\47\1\44\1\45\1\46\1\43\2\uffff\1\42\1\41\1\40",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\50\6\uffff\1\15",
            "\1\51",
            "\1\52\11\uffff\1\15",
            "\1\30\11\uffff\1\15",
            "\1\31\11\uffff\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\53\1\54\1\55\2\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\67\6\uffff\1\15",
            "\1\70",
            "\1\71\11\uffff\1\15",
            "\1\63\11\uffff\1\15",
            "\1\64\11\uffff\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 79:3: ( ( (lv_statements_0_0= ruleStatement ) ) otherlv_1= '\\n' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000039F04E0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000004E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}