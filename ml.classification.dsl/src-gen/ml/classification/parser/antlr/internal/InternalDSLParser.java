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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_METRIC", "RULE_SEP", "RULE_ALGO_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'predict'", "'use_metric'", "'use_column'", "'unuse_column'", "'predict_column'", "'use_strategy'", "'train_test'", "'cross_valid'", "'read'", "'use_algorithm'", "'print'"
    };
    public static final int RULE_SEP=9;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ALGO_NAME=10;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_METRIC=8;
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
    // InternalDSL.g:71:1: ruleML returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_statements_1_0= ruleStatement ) ) ) ;
    public final EObject ruleML() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:77:2: ( ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_statements_1_0= ruleStatement ) ) ) )
            // InternalDSL.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_statements_1_0= ruleStatement ) ) )
            {
            // InternalDSL.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_statements_1_0= ruleStatement ) ) )
            // InternalDSL.g:79:3: ( (lv_statements_0_0= ruleStatement ) )* ( (lv_statements_1_0= ruleStatement ) )
            {
            // InternalDSL.g:79:3: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:80:4: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalDSL.g:80:4: (lv_statements_0_0= ruleStatement )
            	    // InternalDSL.g:81:5: lv_statements_0_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0());
            	    				
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDSL.g:98:3: ( (lv_statements_1_0= ruleStatement ) )
            // InternalDSL.g:99:4: (lv_statements_1_0= ruleStatement )
            {
            // InternalDSL.g:99:4: (lv_statements_1_0= ruleStatement )
            // InternalDSL.g:100:5: lv_statements_1_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statements_1_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_1_0,
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
    // InternalDSL.g:121:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDSL.g:121:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDSL.g:122:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalDSL.g:128:1: ruleStatement returns [EObject current=null] : ( ( (lv_assign_0_0= ruleAssign ) ) | ( (lv_primitive_1_0= rulePrimitive ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_assign_0_0 = null;

        EObject lv_primitive_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:134:2: ( ( ( (lv_assign_0_0= ruleAssign ) ) | ( (lv_primitive_1_0= rulePrimitive ) ) ) )
            // InternalDSL.g:135:2: ( ( (lv_assign_0_0= ruleAssign ) ) | ( (lv_primitive_1_0= rulePrimitive ) ) )
            {
            // InternalDSL.g:135:2: ( ( (lv_assign_0_0= ruleAssign ) ) | ( (lv_primitive_1_0= rulePrimitive ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=21)||(LA2_0>=24 && LA2_0<=26)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:136:3: ( (lv_assign_0_0= ruleAssign ) )
                    {
                    // InternalDSL.g:136:3: ( (lv_assign_0_0= ruleAssign ) )
                    // InternalDSL.g:137:4: (lv_assign_0_0= ruleAssign )
                    {
                    // InternalDSL.g:137:4: (lv_assign_0_0= ruleAssign )
                    // InternalDSL.g:138:5: lv_assign_0_0= ruleAssign
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getAssignAssignParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assign_0_0=ruleAssign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"assign",
                    						lv_assign_0_0,
                    						"ml.classification.DSL.Assign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:156:3: ( (lv_primitive_1_0= rulePrimitive ) )
                    {
                    // InternalDSL.g:156:3: ( (lv_primitive_1_0= rulePrimitive ) )
                    // InternalDSL.g:157:4: (lv_primitive_1_0= rulePrimitive )
                    {
                    // InternalDSL.g:157:4: (lv_primitive_1_0= rulePrimitive )
                    // InternalDSL.g:158:5: lv_primitive_1_0= rulePrimitive
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getPrimitivePrimitiveParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitive_1_0=rulePrimitive();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"primitive",
                    						lv_primitive_1_0,
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


    // $ANTLR start "entryRuleAssign"
    // InternalDSL.g:179:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalDSL.g:179:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalDSL.g:180:2: iv_ruleAssign= ruleAssign EOF
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
    // InternalDSL.g:186:1: ruleAssign returns [EObject current=null] : ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_assign_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_varname_0_0=null;
        Token otherlv_1=null;
        EObject lv_assign_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:192:2: ( ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_assign_value_2_0= ruleExpression ) ) ) )
            // InternalDSL.g:193:2: ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_assign_value_2_0= ruleExpression ) ) )
            {
            // InternalDSL.g:193:2: ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_assign_value_2_0= ruleExpression ) ) )
            // InternalDSL.g:194:3: ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_assign_value_2_0= ruleExpression ) )
            {
            // InternalDSL.g:194:3: ( (lv_varname_0_0= RULE_ID ) )
            // InternalDSL.g:195:4: (lv_varname_0_0= RULE_ID )
            {
            // InternalDSL.g:195:4: (lv_varname_0_0= RULE_ID )
            // InternalDSL.g:196:5: lv_varname_0_0= RULE_ID
            {
            lv_varname_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_varname_0_0, grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:216:3: ( (lv_assign_value_2_0= ruleExpression ) )
            // InternalDSL.g:217:4: (lv_assign_value_2_0= ruleExpression )
            {
            // InternalDSL.g:217:4: (lv_assign_value_2_0= ruleExpression )
            // InternalDSL.g:218:5: lv_assign_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignAccess().getAssign_valueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_assign_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignRule());
            					}
            					set(
            						current,
            						"assign_value",
            						lv_assign_value_2_0,
            						"ml.classification.DSL.Expression");
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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:239:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDSL.g:239:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDSL.g:240:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDSL.g:246:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_prim_0_0= rulePrimitive ) ) | ( (lv_expr_const_1_0= ruleConstant ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_prim_0_0 = null;

        AntlrDatatypeRuleToken lv_expr_const_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:252:2: ( ( ( (lv_expr_prim_0_0= rulePrimitive ) ) | ( (lv_expr_const_1_0= ruleConstant ) ) ) )
            // InternalDSL.g:253:2: ( ( (lv_expr_prim_0_0= rulePrimitive ) ) | ( (lv_expr_const_1_0= ruleConstant ) ) )
            {
            // InternalDSL.g:253:2: ( ( (lv_expr_prim_0_0= rulePrimitive ) ) | ( (lv_expr_const_1_0= ruleConstant ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=21)||(LA3_0>=24 && LA3_0<=26)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:254:3: ( (lv_expr_prim_0_0= rulePrimitive ) )
                    {
                    // InternalDSL.g:254:3: ( (lv_expr_prim_0_0= rulePrimitive ) )
                    // InternalDSL.g:255:4: (lv_expr_prim_0_0= rulePrimitive )
                    {
                    // InternalDSL.g:255:4: (lv_expr_prim_0_0= rulePrimitive )
                    // InternalDSL.g:256:5: lv_expr_prim_0_0= rulePrimitive
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getExpr_primPrimitiveParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr_prim_0_0=rulePrimitive();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"expr_prim",
                    						lv_expr_prim_0_0,
                    						"ml.classification.DSL.Primitive");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:274:3: ( (lv_expr_const_1_0= ruleConstant ) )
                    {
                    // InternalDSL.g:274:3: ( (lv_expr_const_1_0= ruleConstant ) )
                    // InternalDSL.g:275:4: (lv_expr_const_1_0= ruleConstant )
                    {
                    // InternalDSL.g:275:4: (lv_expr_const_1_0= ruleConstant )
                    // InternalDSL.g:276:5: lv_expr_const_1_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getExpr_constConstantParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr_const_1_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"expr_const",
                    						lv_expr_const_1_0,
                    						"ml.classification.DSL.Constant");
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


    // $ANTLR start "entryRulePrimitive"
    // InternalDSL.g:297:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDSL.g:297:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDSL.g:298:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalDSL.g:304:1: rulePrimitive returns [EObject current=null] : ( ( (lv_print_0_0= rulePrint ) ) | ( (lv_algo_choose_1_0= ruleAlgo_choose ) ) | ( (lv_read_2_0= ruleRead ) ) | ( (lv_strategy_choose_3_0= ruleStrategy_choose ) ) | ( (lv_column_4_0= ruleColumn ) ) | ( (lv_use_metric_5_0= ruleUse_Metric ) ) | ( (lv_predict_6_0= rulePredict ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject lv_print_0_0 = null;

        EObject lv_algo_choose_1_0 = null;

        EObject lv_read_2_0 = null;

        EObject lv_strategy_choose_3_0 = null;

        EObject lv_column_4_0 = null;

        EObject lv_use_metric_5_0 = null;

        AntlrDatatypeRuleToken lv_predict_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:310:2: ( ( ( (lv_print_0_0= rulePrint ) ) | ( (lv_algo_choose_1_0= ruleAlgo_choose ) ) | ( (lv_read_2_0= ruleRead ) ) | ( (lv_strategy_choose_3_0= ruleStrategy_choose ) ) | ( (lv_column_4_0= ruleColumn ) ) | ( (lv_use_metric_5_0= ruleUse_Metric ) ) | ( (lv_predict_6_0= rulePredict ) ) ) )
            // InternalDSL.g:311:2: ( ( (lv_print_0_0= rulePrint ) ) | ( (lv_algo_choose_1_0= ruleAlgo_choose ) ) | ( (lv_read_2_0= ruleRead ) ) | ( (lv_strategy_choose_3_0= ruleStrategy_choose ) ) | ( (lv_column_4_0= ruleColumn ) ) | ( (lv_use_metric_5_0= ruleUse_Metric ) ) | ( (lv_predict_6_0= rulePredict ) ) )
            {
            // InternalDSL.g:311:2: ( ( (lv_print_0_0= rulePrint ) ) | ( (lv_algo_choose_1_0= ruleAlgo_choose ) ) | ( (lv_read_2_0= ruleRead ) ) | ( (lv_strategy_choose_3_0= ruleStrategy_choose ) ) | ( (lv_column_4_0= ruleColumn ) ) | ( (lv_use_metric_5_0= ruleUse_Metric ) ) | ( (lv_predict_6_0= rulePredict ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 16:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:312:3: ( (lv_print_0_0= rulePrint ) )
                    {
                    // InternalDSL.g:312:3: ( (lv_print_0_0= rulePrint ) )
                    // InternalDSL.g:313:4: (lv_print_0_0= rulePrint )
                    {
                    // InternalDSL.g:313:4: (lv_print_0_0= rulePrint )
                    // InternalDSL.g:314:5: lv_print_0_0= rulePrint
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPrintPrintParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_print_0_0=rulePrint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_0_0,
                    						"ml.classification.DSL.Print");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:332:3: ( (lv_algo_choose_1_0= ruleAlgo_choose ) )
                    {
                    // InternalDSL.g:332:3: ( (lv_algo_choose_1_0= ruleAlgo_choose ) )
                    // InternalDSL.g:333:4: (lv_algo_choose_1_0= ruleAlgo_choose )
                    {
                    // InternalDSL.g:333:4: (lv_algo_choose_1_0= ruleAlgo_choose )
                    // InternalDSL.g:334:5: lv_algo_choose_1_0= ruleAlgo_choose
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getAlgo_chooseAlgo_chooseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_algo_choose_1_0=ruleAlgo_choose();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"algo_choose",
                    						lv_algo_choose_1_0,
                    						"ml.classification.DSL.Algo_choose");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:352:3: ( (lv_read_2_0= ruleRead ) )
                    {
                    // InternalDSL.g:352:3: ( (lv_read_2_0= ruleRead ) )
                    // InternalDSL.g:353:4: (lv_read_2_0= ruleRead )
                    {
                    // InternalDSL.g:353:4: (lv_read_2_0= ruleRead )
                    // InternalDSL.g:354:5: lv_read_2_0= ruleRead
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getReadReadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_read_2_0=ruleRead();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"read",
                    						lv_read_2_0,
                    						"ml.classification.DSL.Read");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:372:3: ( (lv_strategy_choose_3_0= ruleStrategy_choose ) )
                    {
                    // InternalDSL.g:372:3: ( (lv_strategy_choose_3_0= ruleStrategy_choose ) )
                    // InternalDSL.g:373:4: (lv_strategy_choose_3_0= ruleStrategy_choose )
                    {
                    // InternalDSL.g:373:4: (lv_strategy_choose_3_0= ruleStrategy_choose )
                    // InternalDSL.g:374:5: lv_strategy_choose_3_0= ruleStrategy_choose
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getStrategy_chooseStrategy_chooseParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_strategy_choose_3_0=ruleStrategy_choose();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"strategy_choose",
                    						lv_strategy_choose_3_0,
                    						"ml.classification.DSL.Strategy_choose");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:392:3: ( (lv_column_4_0= ruleColumn ) )
                    {
                    // InternalDSL.g:392:3: ( (lv_column_4_0= ruleColumn ) )
                    // InternalDSL.g:393:4: (lv_column_4_0= ruleColumn )
                    {
                    // InternalDSL.g:393:4: (lv_column_4_0= ruleColumn )
                    // InternalDSL.g:394:5: lv_column_4_0= ruleColumn
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getColumnColumnParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_column_4_0=ruleColumn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"column",
                    						lv_column_4_0,
                    						"ml.classification.DSL.Column");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:412:3: ( (lv_use_metric_5_0= ruleUse_Metric ) )
                    {
                    // InternalDSL.g:412:3: ( (lv_use_metric_5_0= ruleUse_Metric ) )
                    // InternalDSL.g:413:4: (lv_use_metric_5_0= ruleUse_Metric )
                    {
                    // InternalDSL.g:413:4: (lv_use_metric_5_0= ruleUse_Metric )
                    // InternalDSL.g:414:5: lv_use_metric_5_0= ruleUse_Metric
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getUse_metricUse_MetricParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_use_metric_5_0=ruleUse_Metric();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"use_metric",
                    						lv_use_metric_5_0,
                    						"ml.classification.DSL.Use_Metric");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:432:3: ( (lv_predict_6_0= rulePredict ) )
                    {
                    // InternalDSL.g:432:3: ( (lv_predict_6_0= rulePredict ) )
                    // InternalDSL.g:433:4: (lv_predict_6_0= rulePredict )
                    {
                    // InternalDSL.g:433:4: (lv_predict_6_0= rulePredict )
                    // InternalDSL.g:434:5: lv_predict_6_0= rulePredict
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveAccess().getPredictPredictParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_predict_6_0=rulePredict();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    					}
                    					set(
                    						current,
                    						"predict",
                    						lv_predict_6_0,
                    						"ml.classification.DSL.Predict");
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


    // $ANTLR start "entryRulePredict"
    // InternalDSL.g:455:1: entryRulePredict returns [String current=null] : iv_rulePredict= rulePredict EOF ;
    public final String entryRulePredict() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredict = null;


        try {
            // InternalDSL.g:455:47: (iv_rulePredict= rulePredict EOF )
            // InternalDSL.g:456:2: iv_rulePredict= rulePredict EOF
            {
             newCompositeNode(grammarAccess.getPredictRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredict=rulePredict();

            state._fsp--;

             current =iv_rulePredict.getText(); 
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
    // $ANTLR end "entryRulePredict"


    // $ANTLR start "rulePredict"
    // InternalDSL.g:462:1: rulePredict returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'predict' ;
    public final AntlrDatatypeRuleToken rulePredict() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDSL.g:468:2: (kw= 'predict' )
            // InternalDSL.g:469:2: kw= 'predict'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPredictAccess().getPredictKeyword());
            	

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
    // $ANTLR end "rulePredict"


    // $ANTLR start "entryRuleConstant"
    // InternalDSL.g:477:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalDSL.g:477:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalDSL.g:478:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
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
    // InternalDSL.g:484:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;
        Token this_STRING_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalDSL.g:490:2: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) )
            // InternalDSL.g:491:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
            {
            // InternalDSL.g:491:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:492:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getConstantAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:500:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:508:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:516:3: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_3);
                    		

                    			newLeafNode(this_ID_3, grammarAccess.getConstantAccess().getIDTerminalRuleCall_3());
                    		

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


    // $ANTLR start "entryRuleUse_Metric"
    // InternalDSL.g:527:1: entryRuleUse_Metric returns [EObject current=null] : iv_ruleUse_Metric= ruleUse_Metric EOF ;
    public final EObject entryRuleUse_Metric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUse_Metric = null;


        try {
            // InternalDSL.g:527:51: (iv_ruleUse_Metric= ruleUse_Metric EOF )
            // InternalDSL.g:528:2: iv_ruleUse_Metric= ruleUse_Metric EOF
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
    // InternalDSL.g:534:1: ruleUse_Metric returns [EObject current=null] : (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) ) ;
    public final EObject ruleUse_Metric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_metric_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:540:2: ( (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) ) )
            // InternalDSL.g:541:2: (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) )
            {
            // InternalDSL.g:541:2: (otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) ) )
            // InternalDSL.g:542:3: otherlv_0= 'use_metric' ( (lv_metric_1_0= RULE_METRIC ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUse_MetricAccess().getUse_metricKeyword_0());
            		
            // InternalDSL.g:546:3: ( (lv_metric_1_0= RULE_METRIC ) )
            // InternalDSL.g:547:4: (lv_metric_1_0= RULE_METRIC )
            {
            // InternalDSL.g:547:4: (lv_metric_1_0= RULE_METRIC )
            // InternalDSL.g:548:5: lv_metric_1_0= RULE_METRIC
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
    // InternalDSL.g:568:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDSL.g:568:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDSL.g:569:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalDSL.g:575:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) ) ;
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
            // InternalDSL.g:581:2: ( ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) ) )
            // InternalDSL.g:582:2: ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) )
            {
            // InternalDSL.g:582:2: ( (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ ) | (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ ) | (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:583:3: (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ )
                    {
                    // InternalDSL.g:583:3: (otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+ )
                    // InternalDSL.g:584:4: otherlv_0= 'use_column' ( (lv_use_1_0= RULE_INT ) )+
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getUse_columnKeyword_0_0());
                    			
                    // InternalDSL.g:588:4: ( (lv_use_1_0= RULE_INT ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDSL.g:589:5: (lv_use_1_0= RULE_INT )
                    	    {
                    	    // InternalDSL.g:589:5: (lv_use_1_0= RULE_INT )
                    	    // InternalDSL.g:590:6: lv_use_1_0= RULE_INT
                    	    {
                    	    lv_use_1_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:608:3: (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ )
                    {
                    // InternalDSL.g:608:3: (otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+ )
                    // InternalDSL.g:609:4: otherlv_2= 'unuse_column' ( (lv_unuse_3_0= RULE_INT ) )+
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getUnuse_columnKeyword_1_0());
                    			
                    // InternalDSL.g:613:4: ( (lv_unuse_3_0= RULE_INT ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_INT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDSL.g:614:5: (lv_unuse_3_0= RULE_INT )
                    	    {
                    	    // InternalDSL.g:614:5: (lv_unuse_3_0= RULE_INT )
                    	    // InternalDSL.g:615:6: lv_unuse_3_0= RULE_INT
                    	    {
                    	    lv_unuse_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:633:3: (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) )
                    {
                    // InternalDSL.g:633:3: (otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) ) )
                    // InternalDSL.g:634:4: otherlv_4= 'predict_column' ( (lv_predict_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getPredict_columnKeyword_2_0());
                    			
                    // InternalDSL.g:638:4: ( (lv_predict_5_0= RULE_INT ) )
                    // InternalDSL.g:639:5: (lv_predict_5_0= RULE_INT )
                    {
                    // InternalDSL.g:639:5: (lv_predict_5_0= RULE_INT )
                    // InternalDSL.g:640:6: lv_predict_5_0= RULE_INT
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
    // InternalDSL.g:661:1: entryRuleStrategy_choose returns [EObject current=null] : iv_ruleStrategy_choose= ruleStrategy_choose EOF ;
    public final EObject entryRuleStrategy_choose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy_choose = null;


        try {
            // InternalDSL.g:661:56: (iv_ruleStrategy_choose= ruleStrategy_choose EOF )
            // InternalDSL.g:662:2: iv_ruleStrategy_choose= ruleStrategy_choose EOF
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
    // InternalDSL.g:668:1: ruleStrategy_choose returns [EObject current=null] : ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) ) ;
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
            // InternalDSL.g:674:2: ( ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) ) )
            // InternalDSL.g:675:2: ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) )
            {
            // InternalDSL.g:675:2: ( (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) ) | (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=1;
                }
                else if ( (LA10_1==23) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

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
                    // InternalDSL.g:676:3: (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) )
                    {
                    // InternalDSL.g:676:3: (otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) ) )
                    // InternalDSL.g:677:4: otherlv_0= 'use_strategy' ( (lv_strategy_1_0= 'train_test' ) ) ( (lv_ratio_2_0= RULE_DOUBLE ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_0_0());
                    			
                    // InternalDSL.g:681:4: ( (lv_strategy_1_0= 'train_test' ) )
                    // InternalDSL.g:682:5: (lv_strategy_1_0= 'train_test' )
                    {
                    // InternalDSL.g:682:5: (lv_strategy_1_0= 'train_test' )
                    // InternalDSL.g:683:6: lv_strategy_1_0= 'train_test'
                    {
                    lv_strategy_1_0=(Token)match(input,22,FOLLOW_10); 

                    						newLeafNode(lv_strategy_1_0, grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategy_chooseRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_1_0, "train_test");
                    					

                    }


                    }

                    // InternalDSL.g:695:4: ( (lv_ratio_2_0= RULE_DOUBLE ) )
                    // InternalDSL.g:696:5: (lv_ratio_2_0= RULE_DOUBLE )
                    {
                    // InternalDSL.g:696:5: (lv_ratio_2_0= RULE_DOUBLE )
                    // InternalDSL.g:697:6: lv_ratio_2_0= RULE_DOUBLE
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
                    // InternalDSL.g:715:3: (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? )
                    {
                    // InternalDSL.g:715:3: (otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )? )
                    // InternalDSL.g:716:4: otherlv_3= 'use_strategy' ( (lv_strategy_4_0= 'cross_valid' ) ) ( (lv_nb_5_0= RULE_INT ) )?
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_1_0());
                    			
                    // InternalDSL.g:720:4: ( (lv_strategy_4_0= 'cross_valid' ) )
                    // InternalDSL.g:721:5: (lv_strategy_4_0= 'cross_valid' )
                    {
                    // InternalDSL.g:721:5: (lv_strategy_4_0= 'cross_valid' )
                    // InternalDSL.g:722:6: lv_strategy_4_0= 'cross_valid'
                    {
                    lv_strategy_4_0=(Token)match(input,23,FOLLOW_8); 

                    						newLeafNode(lv_strategy_4_0, grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStrategy_chooseRule());
                    						}
                    						setWithLastConsumed(current, "strategy", lv_strategy_4_0, "cross_valid");
                    					

                    }


                    }

                    // InternalDSL.g:734:4: ( (lv_nb_5_0= RULE_INT ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDSL.g:735:5: (lv_nb_5_0= RULE_INT )
                            {
                            // InternalDSL.g:735:5: (lv_nb_5_0= RULE_INT )
                            // InternalDSL.g:736:6: lv_nb_5_0= RULE_INT
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
    // InternalDSL.g:757:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalDSL.g:757:45: (iv_ruleRead= ruleRead EOF )
            // InternalDSL.g:758:2: iv_ruleRead= ruleRead EOF
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
    // InternalDSL.g:764:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token lv_separator_2_0=null;


        	enterRule();

        try {
            // InternalDSL.g:770:2: ( (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? ) )
            // InternalDSL.g:771:2: (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? )
            {
            // InternalDSL.g:771:2: (otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )? )
            // InternalDSL.g:772:3: otherlv_0= 'read' ( (lv_path_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_SEP ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            // InternalDSL.g:776:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalDSL.g:777:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalDSL.g:777:4: (lv_path_1_0= RULE_STRING )
            // InternalDSL.g:778:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalDSL.g:794:3: ( (lv_separator_2_0= RULE_SEP ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SEP) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:795:4: (lv_separator_2_0= RULE_SEP )
                    {
                    // InternalDSL.g:795:4: (lv_separator_2_0= RULE_SEP )
                    // InternalDSL.g:796:5: lv_separator_2_0= RULE_SEP
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
    // InternalDSL.g:816:1: entryRuleAlgo_choose returns [EObject current=null] : iv_ruleAlgo_choose= ruleAlgo_choose EOF ;
    public final EObject entryRuleAlgo_choose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgo_choose = null;


        try {
            // InternalDSL.g:816:52: (iv_ruleAlgo_choose= ruleAlgo_choose EOF )
            // InternalDSL.g:817:2: iv_ruleAlgo_choose= ruleAlgo_choose EOF
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
    // InternalDSL.g:823:1: ruleAlgo_choose returns [EObject current=null] : (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) ) ;
    public final EObject ruleAlgo_choose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_algorithm_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:829:2: ( (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) ) )
            // InternalDSL.g:830:2: (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) )
            {
            // InternalDSL.g:830:2: (otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) ) )
            // InternalDSL.g:831:3: otherlv_0= 'use_algorithm' ( (lv_algorithm_1_0= RULE_ALGO_NAME ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgo_chooseAccess().getUse_algorithmKeyword_0());
            		
            // InternalDSL.g:835:3: ( (lv_algorithm_1_0= RULE_ALGO_NAME ) )
            // InternalDSL.g:836:4: (lv_algorithm_1_0= RULE_ALGO_NAME )
            {
            // InternalDSL.g:836:4: (lv_algorithm_1_0= RULE_ALGO_NAME )
            // InternalDSL.g:837:5: lv_algorithm_1_0= RULE_ALGO_NAME
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
    // InternalDSL.g:857:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalDSL.g:857:46: (iv_rulePrint= rulePrint EOF )
            // InternalDSL.g:858:2: iv_rulePrint= rulePrint EOF
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
    // InternalDSL.g:864:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_print_1_0= ruleConstant ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_print_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:870:2: ( (otherlv_0= 'print' ( (lv_print_1_0= ruleConstant ) ) ) )
            // InternalDSL.g:871:2: (otherlv_0= 'print' ( (lv_print_1_0= ruleConstant ) ) )
            {
            // InternalDSL.g:871:2: (otherlv_0= 'print' ( (lv_print_1_0= ruleConstant ) ) )
            // InternalDSL.g:872:3: otherlv_0= 'print' ( (lv_print_1_0= ruleConstant ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalDSL.g:876:3: ( (lv_print_1_0= ruleConstant ) )
            // InternalDSL.g:877:4: (lv_print_1_0= ruleConstant )
            {
            // InternalDSL.g:877:4: (lv_print_1_0= ruleConstant )
            // InternalDSL.g:878:5: lv_print_1_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getPrintConstantParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_print_1_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"print",
            						lv_print_1_0,
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\71\uffff";
    static final String dfa_2s = "\12\uffff\1\30\1\uffff\6\30\1\uffff\5\30\12\uffff\16\30\1\uffff\10\30";
    static final String dfa_3s = "\1\4\1\17\1\4\1\12\1\7\1\26\3\5\1\10\10\4\1\6\5\4\2\uffff\1\4\1\12\1\7\1\26\3\5\1\10\16\4\1\6\10\4";
    static final String dfa_4s = "\1\32\1\17\1\7\1\12\1\7\1\27\3\5\1\10\10\32\1\6\5\32\2\uffff\1\7\1\12\1\7\1\27\3\5\1\10\16\32\1\6\10\32";
    static final String dfa_5s = "\30\uffff\1\2\1\1\37\uffff";
    static final String dfa_6s = "\71\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\13\uffff\1\12\1\11\1\6\1\7\1\10\1\5\2\uffff\1\4\1\3\1\2",
            "\1\13",
            "\1\17\1\14\1\15\1\16",
            "\1\20",
            "\1\21",
            "\1\22\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\46\1\43\1\44\1\45\10\uffff\1\42\1\41\1\36\1\37\1\40\1\35\2\uffff\1\34\1\33\1\32",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\4\uffff\1\47\6\uffff\6\31\2\uffff\3\31",
            "\1\50",
            "\1\31\1\51\12\uffff\6\31\2\uffff\3\31",
            "\1\31\1\24\12\uffff\6\31\2\uffff\3\31",
            "\1\31\1\25\12\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "",
            "",
            "\1\55\1\52\1\53\1\54",
            "\1\56",
            "\1\57",
            "\1\60\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\4\uffff\1\66\6\uffff\6\31\2\uffff\3\31",
            "\1\67",
            "\1\31\1\70\12\uffff\6\31\2\uffff\3\31",
            "\1\31\1\62\12\uffff\6\31\2\uffff\3\31",
            "\1\31\1\63\12\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31",
            "\1\31\13\uffff\6\31\2\uffff\3\31"
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
            return "()* loopback of 79:3: ( (lv_statements_0_0= ruleStatement ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000073F0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000073F00F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});

}