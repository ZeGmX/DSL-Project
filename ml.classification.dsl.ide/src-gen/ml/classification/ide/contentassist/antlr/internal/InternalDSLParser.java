package ml.classification.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ml.classification.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_METRIC", "RULE_SEP", "RULE_ALGO_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'use_metric'", "'use_column'", "'unuse_column'", "'predict_column'", "'use_strategy'", "'read'", "'use_algorithm'", "'print'", "'train_test'", "'cross_valid'"
    };
    public static final int RULE_SEP=9;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ALGO_NAME=10;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleML"
    // InternalDSL.g:53:1: entryRuleML : ruleML EOF ;
    public final void entryRuleML() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleML EOF )
            // InternalDSL.g:55:1: ruleML EOF
            {
             before(grammarAccess.getMLRule()); 
            pushFollow(FOLLOW_1);
            ruleML();

            state._fsp--;

             after(grammarAccess.getMLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleML"


    // $ANTLR start "ruleML"
    // InternalDSL.g:62:1: ruleML : ( ( rule__ML__Group__0 ) ) ;
    public final void ruleML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__ML__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__ML__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__ML__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__ML__Group__0 )
            {
             before(grammarAccess.getMLAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__ML__Group__0 )
            // InternalDSL.g:69:4: rule__ML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleML"


    // $ANTLR start "entryRuleStatement"
    // InternalDSL.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleStatement EOF )
            // InternalDSL.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDSL.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalDSL.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalDSL.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalDSL.g:94:3: ( rule__Statement__Alternatives )
            // InternalDSL.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssign"
    // InternalDSL.g:103:1: entryRuleAssign : ruleAssign EOF ;
    public final void entryRuleAssign() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleAssign EOF )
            // InternalDSL.g:105:1: ruleAssign EOF
            {
             before(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_1);
            ruleAssign();

            state._fsp--;

             after(grammarAccess.getAssignRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalDSL.g:112:1: ruleAssign : ( ( rule__Assign__Group__0 ) ) ;
    public final void ruleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__Assign__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__Assign__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__Assign__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__Assign__Group__0 )
            {
             before(grammarAccess.getAssignAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__Assign__Group__0 )
            // InternalDSL.g:119:4: rule__Assign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleExpression EOF )
            // InternalDSL.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDSL.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalDSL.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalDSL.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalDSL.g:144:3: ( rule__Expression__Alternatives )
            // InternalDSL.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimitive"
    // InternalDSL.g:153:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( rulePrimitive EOF )
            // InternalDSL.g:155:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalDSL.g:162:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__Primitive__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__Primitive__Alternatives )
            // InternalDSL.g:169:4: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleConstant"
    // InternalDSL.g:178:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleConstant EOF )
            // InternalDSL.g:180:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDSL.g:187:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDSL.g:192:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Constant__Alternatives ) )
            // InternalDSL.g:193:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDSL.g:194:3: ( rule__Constant__Alternatives )
            // InternalDSL.g:194:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleUse_Metric"
    // InternalDSL.g:203:1: entryRuleUse_Metric : ruleUse_Metric EOF ;
    public final void entryRuleUse_Metric() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleUse_Metric EOF )
            // InternalDSL.g:205:1: ruleUse_Metric EOF
            {
             before(grammarAccess.getUse_MetricRule()); 
            pushFollow(FOLLOW_1);
            ruleUse_Metric();

            state._fsp--;

             after(grammarAccess.getUse_MetricRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUse_Metric"


    // $ANTLR start "ruleUse_Metric"
    // InternalDSL.g:212:1: ruleUse_Metric : ( ( rule__Use_Metric__Group__0 ) ) ;
    public final void ruleUse_Metric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Use_Metric__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Use_Metric__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Use_Metric__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Use_Metric__Group__0 )
            {
             before(grammarAccess.getUse_MetricAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Use_Metric__Group__0 )
            // InternalDSL.g:219:4: rule__Use_Metric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Use_Metric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUse_MetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUse_Metric"


    // $ANTLR start "entryRuleColumn"
    // InternalDSL.g:228:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleColumn EOF )
            // InternalDSL.g:230:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDSL.g:237:1: ruleColumn : ( ( rule__Column__Alternatives ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Column__Alternatives ) ) )
            // InternalDSL.g:242:2: ( ( rule__Column__Alternatives ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Column__Alternatives ) )
            // InternalDSL.g:243:3: ( rule__Column__Alternatives )
            {
             before(grammarAccess.getColumnAccess().getAlternatives()); 
            // InternalDSL.g:244:3: ( rule__Column__Alternatives )
            // InternalDSL.g:244:4: rule__Column__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Column__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleStrategy_choose"
    // InternalDSL.g:253:1: entryRuleStrategy_choose : ruleStrategy_choose EOF ;
    public final void entryRuleStrategy_choose() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleStrategy_choose EOF )
            // InternalDSL.g:255:1: ruleStrategy_choose EOF
            {
             before(grammarAccess.getStrategy_chooseRule()); 
            pushFollow(FOLLOW_1);
            ruleStrategy_choose();

            state._fsp--;

             after(grammarAccess.getStrategy_chooseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrategy_choose"


    // $ANTLR start "ruleStrategy_choose"
    // InternalDSL.g:262:1: ruleStrategy_choose : ( ( rule__Strategy_choose__Alternatives ) ) ;
    public final void ruleStrategy_choose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Strategy_choose__Alternatives ) ) )
            // InternalDSL.g:267:2: ( ( rule__Strategy_choose__Alternatives ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Strategy_choose__Alternatives ) )
            // InternalDSL.g:268:3: ( rule__Strategy_choose__Alternatives )
            {
             before(grammarAccess.getStrategy_chooseAccess().getAlternatives()); 
            // InternalDSL.g:269:3: ( rule__Strategy_choose__Alternatives )
            // InternalDSL.g:269:4: rule__Strategy_choose__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategy_chooseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategy_choose"


    // $ANTLR start "entryRuleRead"
    // InternalDSL.g:278:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleRead EOF )
            // InternalDSL.g:280:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalDSL.g:287:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Read__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Read__Group__0 )
            // InternalDSL.g:294:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleAlgo_choose"
    // InternalDSL.g:303:1: entryRuleAlgo_choose : ruleAlgo_choose EOF ;
    public final void entryRuleAlgo_choose() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleAlgo_choose EOF )
            // InternalDSL.g:305:1: ruleAlgo_choose EOF
            {
             before(grammarAccess.getAlgo_chooseRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgo_choose();

            state._fsp--;

             after(grammarAccess.getAlgo_chooseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgo_choose"


    // $ANTLR start "ruleAlgo_choose"
    // InternalDSL.g:312:1: ruleAlgo_choose : ( ( rule__Algo_choose__Group__0 ) ) ;
    public final void ruleAlgo_choose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Algo_choose__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__Algo_choose__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Algo_choose__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__Algo_choose__Group__0 )
            {
             before(grammarAccess.getAlgo_chooseAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__Algo_choose__Group__0 )
            // InternalDSL.g:319:4: rule__Algo_choose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algo_choose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgo_chooseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgo_choose"


    // $ANTLR start "entryRulePrint"
    // InternalDSL.g:328:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( rulePrint EOF )
            // InternalDSL.g:330:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalDSL.g:337:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Print__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__Print__Group__0 )
            // InternalDSL.g:344:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalDSL.g:352:1: rule__Statement__Alternatives : ( ( ( rule__Statement__AssignAssignment_0 ) ) | ( ( rule__Statement__PrimitiveAssignment_1 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:356:1: ( ( ( rule__Statement__AssignAssignment_0 ) ) | ( ( rule__Statement__PrimitiveAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=23)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:357:2: ( ( rule__Statement__AssignAssignment_0 ) )
                    {
                    // InternalDSL.g:357:2: ( ( rule__Statement__AssignAssignment_0 ) )
                    // InternalDSL.g:358:3: ( rule__Statement__AssignAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getAssignAssignment_0()); 
                    // InternalDSL.g:359:3: ( rule__Statement__AssignAssignment_0 )
                    // InternalDSL.g:359:4: rule__Statement__AssignAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__AssignAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getAssignAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:363:2: ( ( rule__Statement__PrimitiveAssignment_1 ) )
                    {
                    // InternalDSL.g:363:2: ( ( rule__Statement__PrimitiveAssignment_1 ) )
                    // InternalDSL.g:364:3: ( rule__Statement__PrimitiveAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getPrimitiveAssignment_1()); 
                    // InternalDSL.g:365:3: ( rule__Statement__PrimitiveAssignment_1 )
                    // InternalDSL.g:365:4: rule__Statement__PrimitiveAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__PrimitiveAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getPrimitiveAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalDSL.g:373:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Expr_primAssignment_0 ) ) | ( ( rule__Expression__Expr_constAssignment_1 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:377:1: ( ( ( rule__Expression__Expr_primAssignment_0 ) ) | ( ( rule__Expression__Expr_constAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=16 && LA2_0<=23)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:378:2: ( ( rule__Expression__Expr_primAssignment_0 ) )
                    {
                    // InternalDSL.g:378:2: ( ( rule__Expression__Expr_primAssignment_0 ) )
                    // InternalDSL.g:379:3: ( rule__Expression__Expr_primAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getExpr_primAssignment_0()); 
                    // InternalDSL.g:380:3: ( rule__Expression__Expr_primAssignment_0 )
                    // InternalDSL.g:380:4: rule__Expression__Expr_primAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Expr_primAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExpr_primAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:384:2: ( ( rule__Expression__Expr_constAssignment_1 ) )
                    {
                    // InternalDSL.g:384:2: ( ( rule__Expression__Expr_constAssignment_1 ) )
                    // InternalDSL.g:385:3: ( rule__Expression__Expr_constAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getExpr_constAssignment_1()); 
                    // InternalDSL.g:386:3: ( rule__Expression__Expr_constAssignment_1 )
                    // InternalDSL.g:386:4: rule__Expression__Expr_constAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Expr_constAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExpr_constAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalDSL.g:394:1: rule__Primitive__Alternatives : ( ( ( rule__Primitive__PrintAssignment_0 ) ) | ( ( rule__Primitive__Algo_chooseAssignment_1 ) ) | ( ( rule__Primitive__ReadAssignment_2 ) ) | ( ( rule__Primitive__Strategy_chooseAssignment_3 ) ) | ( ( rule__Primitive__ColumnAssignment_4 ) ) | ( ( rule__Primitive__Use_metricAssignment_5 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:398:1: ( ( ( rule__Primitive__PrintAssignment_0 ) ) | ( ( rule__Primitive__Algo_chooseAssignment_1 ) ) | ( ( rule__Primitive__ReadAssignment_2 ) ) | ( ( rule__Primitive__Strategy_chooseAssignment_3 ) ) | ( ( rule__Primitive__ColumnAssignment_4 ) ) | ( ( rule__Primitive__Use_metricAssignment_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 21:
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
                    // InternalDSL.g:399:2: ( ( rule__Primitive__PrintAssignment_0 ) )
                    {
                    // InternalDSL.g:399:2: ( ( rule__Primitive__PrintAssignment_0 ) )
                    // InternalDSL.g:400:3: ( rule__Primitive__PrintAssignment_0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrintAssignment_0()); 
                    // InternalDSL.g:401:3: ( rule__Primitive__PrintAssignment_0 )
                    // InternalDSL.g:401:4: rule__Primitive__PrintAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrintAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrintAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:405:2: ( ( rule__Primitive__Algo_chooseAssignment_1 ) )
                    {
                    // InternalDSL.g:405:2: ( ( rule__Primitive__Algo_chooseAssignment_1 ) )
                    // InternalDSL.g:406:3: ( rule__Primitive__Algo_chooseAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getAlgo_chooseAssignment_1()); 
                    // InternalDSL.g:407:3: ( rule__Primitive__Algo_chooseAssignment_1 )
                    // InternalDSL.g:407:4: rule__Primitive__Algo_chooseAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Algo_chooseAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getAlgo_chooseAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:411:2: ( ( rule__Primitive__ReadAssignment_2 ) )
                    {
                    // InternalDSL.g:411:2: ( ( rule__Primitive__ReadAssignment_2 ) )
                    // InternalDSL.g:412:3: ( rule__Primitive__ReadAssignment_2 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getReadAssignment_2()); 
                    // InternalDSL.g:413:3: ( rule__Primitive__ReadAssignment_2 )
                    // InternalDSL.g:413:4: rule__Primitive__ReadAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__ReadAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getReadAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:417:2: ( ( rule__Primitive__Strategy_chooseAssignment_3 ) )
                    {
                    // InternalDSL.g:417:2: ( ( rule__Primitive__Strategy_chooseAssignment_3 ) )
                    // InternalDSL.g:418:3: ( rule__Primitive__Strategy_chooseAssignment_3 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getStrategy_chooseAssignment_3()); 
                    // InternalDSL.g:419:3: ( rule__Primitive__Strategy_chooseAssignment_3 )
                    // InternalDSL.g:419:4: rule__Primitive__Strategy_chooseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Strategy_chooseAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getStrategy_chooseAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:423:2: ( ( rule__Primitive__ColumnAssignment_4 ) )
                    {
                    // InternalDSL.g:423:2: ( ( rule__Primitive__ColumnAssignment_4 ) )
                    // InternalDSL.g:424:3: ( rule__Primitive__ColumnAssignment_4 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getColumnAssignment_4()); 
                    // InternalDSL.g:425:3: ( rule__Primitive__ColumnAssignment_4 )
                    // InternalDSL.g:425:4: rule__Primitive__ColumnAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__ColumnAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getColumnAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:429:2: ( ( rule__Primitive__Use_metricAssignment_5 ) )
                    {
                    // InternalDSL.g:429:2: ( ( rule__Primitive__Use_metricAssignment_5 ) )
                    // InternalDSL.g:430:3: ( rule__Primitive__Use_metricAssignment_5 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getUse_metricAssignment_5()); 
                    // InternalDSL.g:431:3: ( rule__Primitive__Use_metricAssignment_5 )
                    // InternalDSL.g:431:4: rule__Primitive__Use_metricAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Use_metricAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getUse_metricAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalDSL.g:439:1: rule__Constant__Alternatives : ( ( RULE_INT ) | ( RULE_DOUBLE ) | ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:443:1: ( ( RULE_INT ) | ( RULE_DOUBLE ) | ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:444:2: ( RULE_INT )
                    {
                    // InternalDSL.g:444:2: ( RULE_INT )
                    // InternalDSL.g:445:3: RULE_INT
                    {
                     before(grammarAccess.getConstantAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:450:2: ( RULE_DOUBLE )
                    {
                    // InternalDSL.g:450:2: ( RULE_DOUBLE )
                    // InternalDSL.g:451:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:456:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:456:2: ( RULE_STRING )
                    // InternalDSL.g:457:3: RULE_STRING
                    {
                     before(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:462:2: ( RULE_ID )
                    {
                    // InternalDSL.g:462:2: ( RULE_ID )
                    // InternalDSL.g:463:3: RULE_ID
                    {
                     before(grammarAccess.getConstantAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Column__Alternatives"
    // InternalDSL.g:472:1: rule__Column__Alternatives : ( ( ( rule__Column__Group_0__0 ) ) | ( ( rule__Column__Group_1__0 ) ) | ( ( rule__Column__Group_2__0 ) ) );
    public final void rule__Column__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:476:1: ( ( ( rule__Column__Group_0__0 ) ) | ( ( rule__Column__Group_1__0 ) ) | ( ( rule__Column__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:477:2: ( ( rule__Column__Group_0__0 ) )
                    {
                    // InternalDSL.g:477:2: ( ( rule__Column__Group_0__0 ) )
                    // InternalDSL.g:478:3: ( rule__Column__Group_0__0 )
                    {
                     before(grammarAccess.getColumnAccess().getGroup_0()); 
                    // InternalDSL.g:479:3: ( rule__Column__Group_0__0 )
                    // InternalDSL.g:479:4: rule__Column__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:483:2: ( ( rule__Column__Group_1__0 ) )
                    {
                    // InternalDSL.g:483:2: ( ( rule__Column__Group_1__0 ) )
                    // InternalDSL.g:484:3: ( rule__Column__Group_1__0 )
                    {
                     before(grammarAccess.getColumnAccess().getGroup_1()); 
                    // InternalDSL.g:485:3: ( rule__Column__Group_1__0 )
                    // InternalDSL.g:485:4: rule__Column__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:489:2: ( ( rule__Column__Group_2__0 ) )
                    {
                    // InternalDSL.g:489:2: ( ( rule__Column__Group_2__0 ) )
                    // InternalDSL.g:490:3: ( rule__Column__Group_2__0 )
                    {
                     before(grammarAccess.getColumnAccess().getGroup_2()); 
                    // InternalDSL.g:491:3: ( rule__Column__Group_2__0 )
                    // InternalDSL.g:491:4: rule__Column__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Alternatives"


    // $ANTLR start "rule__Strategy_choose__Alternatives"
    // InternalDSL.g:499:1: rule__Strategy_choose__Alternatives : ( ( ( rule__Strategy_choose__Group_0__0 ) ) | ( ( rule__Strategy_choose__Group_1__0 ) ) );
    public final void rule__Strategy_choose__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:503:1: ( ( ( rule__Strategy_choose__Group_0__0 ) ) | ( ( rule__Strategy_choose__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==24) ) {
                    alt6=1;
                }
                else if ( (LA6_1==25) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:504:2: ( ( rule__Strategy_choose__Group_0__0 ) )
                    {
                    // InternalDSL.g:504:2: ( ( rule__Strategy_choose__Group_0__0 ) )
                    // InternalDSL.g:505:3: ( rule__Strategy_choose__Group_0__0 )
                    {
                     before(grammarAccess.getStrategy_chooseAccess().getGroup_0()); 
                    // InternalDSL.g:506:3: ( rule__Strategy_choose__Group_0__0 )
                    // InternalDSL.g:506:4: rule__Strategy_choose__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategy_choose__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStrategy_chooseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:510:2: ( ( rule__Strategy_choose__Group_1__0 ) )
                    {
                    // InternalDSL.g:510:2: ( ( rule__Strategy_choose__Group_1__0 ) )
                    // InternalDSL.g:511:3: ( rule__Strategy_choose__Group_1__0 )
                    {
                     before(grammarAccess.getStrategy_chooseAccess().getGroup_1()); 
                    // InternalDSL.g:512:3: ( rule__Strategy_choose__Group_1__0 )
                    // InternalDSL.g:512:4: rule__Strategy_choose__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategy_choose__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStrategy_chooseAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Alternatives"


    // $ANTLR start "rule__ML__Group__0"
    // InternalDSL.g:520:1: rule__ML__Group__0 : rule__ML__Group__0__Impl rule__ML__Group__1 ;
    public final void rule__ML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:524:1: ( rule__ML__Group__0__Impl rule__ML__Group__1 )
            // InternalDSL.g:525:2: rule__ML__Group__0__Impl rule__ML__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ML__Group__0"


    // $ANTLR start "rule__ML__Group__0__Impl"
    // InternalDSL.g:532:1: rule__ML__Group__0__Impl : ( ( rule__ML__StatementsAssignment_0 )* ) ;
    public final void rule__ML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:536:1: ( ( ( rule__ML__StatementsAssignment_0 )* ) )
            // InternalDSL.g:537:1: ( ( rule__ML__StatementsAssignment_0 )* )
            {
            // InternalDSL.g:537:1: ( ( rule__ML__StatementsAssignment_0 )* )
            // InternalDSL.g:538:2: ( rule__ML__StatementsAssignment_0 )*
            {
             before(grammarAccess.getMLAccess().getStatementsAssignment_0()); 
            // InternalDSL.g:539:2: ( rule__ML__StatementsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:539:3: rule__ML__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ML__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMLAccess().getStatementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ML__Group__0__Impl"


    // $ANTLR start "rule__ML__Group__1"
    // InternalDSL.g:547:1: rule__ML__Group__1 : rule__ML__Group__1__Impl ;
    public final void rule__ML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:551:1: ( rule__ML__Group__1__Impl )
            // InternalDSL.g:552:2: rule__ML__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ML__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ML__Group__1"


    // $ANTLR start "rule__ML__Group__1__Impl"
    // InternalDSL.g:558:1: rule__ML__Group__1__Impl : ( ( rule__ML__StatementsAssignment_1 ) ) ;
    public final void rule__ML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:562:1: ( ( ( rule__ML__StatementsAssignment_1 ) ) )
            // InternalDSL.g:563:1: ( ( rule__ML__StatementsAssignment_1 ) )
            {
            // InternalDSL.g:563:1: ( ( rule__ML__StatementsAssignment_1 ) )
            // InternalDSL.g:564:2: ( rule__ML__StatementsAssignment_1 )
            {
             before(grammarAccess.getMLAccess().getStatementsAssignment_1()); 
            // InternalDSL.g:565:2: ( rule__ML__StatementsAssignment_1 )
            // InternalDSL.g:565:3: rule__ML__StatementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ML__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMLAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ML__Group__1__Impl"


    // $ANTLR start "rule__Assign__Group__0"
    // InternalDSL.g:574:1: rule__Assign__Group__0 : rule__Assign__Group__0__Impl rule__Assign__Group__1 ;
    public final void rule__Assign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:578:1: ( rule__Assign__Group__0__Impl rule__Assign__Group__1 )
            // InternalDSL.g:579:2: rule__Assign__Group__0__Impl rule__Assign__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Assign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assign__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__0"


    // $ANTLR start "rule__Assign__Group__0__Impl"
    // InternalDSL.g:586:1: rule__Assign__Group__0__Impl : ( ( rule__Assign__VarnameAssignment_0 ) ) ;
    public final void rule__Assign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:590:1: ( ( ( rule__Assign__VarnameAssignment_0 ) ) )
            // InternalDSL.g:591:1: ( ( rule__Assign__VarnameAssignment_0 ) )
            {
            // InternalDSL.g:591:1: ( ( rule__Assign__VarnameAssignment_0 ) )
            // InternalDSL.g:592:2: ( rule__Assign__VarnameAssignment_0 )
            {
             before(grammarAccess.getAssignAccess().getVarnameAssignment_0()); 
            // InternalDSL.g:593:2: ( rule__Assign__VarnameAssignment_0 )
            // InternalDSL.g:593:3: rule__Assign__VarnameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assign__VarnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getVarnameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__0__Impl"


    // $ANTLR start "rule__Assign__Group__1"
    // InternalDSL.g:601:1: rule__Assign__Group__1 : rule__Assign__Group__1__Impl rule__Assign__Group__2 ;
    public final void rule__Assign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:605:1: ( rule__Assign__Group__1__Impl rule__Assign__Group__2 )
            // InternalDSL.g:606:2: rule__Assign__Group__1__Impl rule__Assign__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Assign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assign__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__1"


    // $ANTLR start "rule__Assign__Group__1__Impl"
    // InternalDSL.g:613:1: rule__Assign__Group__1__Impl : ( '=' ) ;
    public final void rule__Assign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:617:1: ( ( '=' ) )
            // InternalDSL.g:618:1: ( '=' )
            {
            // InternalDSL.g:618:1: ( '=' )
            // InternalDSL.g:619:2: '='
            {
             before(grammarAccess.getAssignAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAssignAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__1__Impl"


    // $ANTLR start "rule__Assign__Group__2"
    // InternalDSL.g:628:1: rule__Assign__Group__2 : rule__Assign__Group__2__Impl ;
    public final void rule__Assign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:632:1: ( rule__Assign__Group__2__Impl )
            // InternalDSL.g:633:2: rule__Assign__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assign__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__2"


    // $ANTLR start "rule__Assign__Group__2__Impl"
    // InternalDSL.g:639:1: rule__Assign__Group__2__Impl : ( ( rule__Assign__Assign_valueAssignment_2 ) ) ;
    public final void rule__Assign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:643:1: ( ( ( rule__Assign__Assign_valueAssignment_2 ) ) )
            // InternalDSL.g:644:1: ( ( rule__Assign__Assign_valueAssignment_2 ) )
            {
            // InternalDSL.g:644:1: ( ( rule__Assign__Assign_valueAssignment_2 ) )
            // InternalDSL.g:645:2: ( rule__Assign__Assign_valueAssignment_2 )
            {
             before(grammarAccess.getAssignAccess().getAssign_valueAssignment_2()); 
            // InternalDSL.g:646:2: ( rule__Assign__Assign_valueAssignment_2 )
            // InternalDSL.g:646:3: rule__Assign__Assign_valueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assign__Assign_valueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getAssign_valueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__2__Impl"


    // $ANTLR start "rule__Use_Metric__Group__0"
    // InternalDSL.g:655:1: rule__Use_Metric__Group__0 : rule__Use_Metric__Group__0__Impl rule__Use_Metric__Group__1 ;
    public final void rule__Use_Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:659:1: ( rule__Use_Metric__Group__0__Impl rule__Use_Metric__Group__1 )
            // InternalDSL.g:660:2: rule__Use_Metric__Group__0__Impl rule__Use_Metric__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Use_Metric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Use_Metric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use_Metric__Group__0"


    // $ANTLR start "rule__Use_Metric__Group__0__Impl"
    // InternalDSL.g:667:1: rule__Use_Metric__Group__0__Impl : ( 'use_metric' ) ;
    public final void rule__Use_Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:671:1: ( ( 'use_metric' ) )
            // InternalDSL.g:672:1: ( 'use_metric' )
            {
            // InternalDSL.g:672:1: ( 'use_metric' )
            // InternalDSL.g:673:2: 'use_metric'
            {
             before(grammarAccess.getUse_MetricAccess().getUse_metricKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUse_MetricAccess().getUse_metricKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use_Metric__Group__0__Impl"


    // $ANTLR start "rule__Use_Metric__Group__1"
    // InternalDSL.g:682:1: rule__Use_Metric__Group__1 : rule__Use_Metric__Group__1__Impl ;
    public final void rule__Use_Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:686:1: ( rule__Use_Metric__Group__1__Impl )
            // InternalDSL.g:687:2: rule__Use_Metric__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Use_Metric__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use_Metric__Group__1"


    // $ANTLR start "rule__Use_Metric__Group__1__Impl"
    // InternalDSL.g:693:1: rule__Use_Metric__Group__1__Impl : ( ( rule__Use_Metric__MetricAssignment_1 ) ) ;
    public final void rule__Use_Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:697:1: ( ( ( rule__Use_Metric__MetricAssignment_1 ) ) )
            // InternalDSL.g:698:1: ( ( rule__Use_Metric__MetricAssignment_1 ) )
            {
            // InternalDSL.g:698:1: ( ( rule__Use_Metric__MetricAssignment_1 ) )
            // InternalDSL.g:699:2: ( rule__Use_Metric__MetricAssignment_1 )
            {
             before(grammarAccess.getUse_MetricAccess().getMetricAssignment_1()); 
            // InternalDSL.g:700:2: ( rule__Use_Metric__MetricAssignment_1 )
            // InternalDSL.g:700:3: rule__Use_Metric__MetricAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Use_Metric__MetricAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUse_MetricAccess().getMetricAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use_Metric__Group__1__Impl"


    // $ANTLR start "rule__Column__Group_0__0"
    // InternalDSL.g:709:1: rule__Column__Group_0__0 : rule__Column__Group_0__0__Impl rule__Column__Group_0__1 ;
    public final void rule__Column__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:713:1: ( rule__Column__Group_0__0__Impl rule__Column__Group_0__1 )
            // InternalDSL.g:714:2: rule__Column__Group_0__0__Impl rule__Column__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_0__0"


    // $ANTLR start "rule__Column__Group_0__0__Impl"
    // InternalDSL.g:721:1: rule__Column__Group_0__0__Impl : ( 'use_column' ) ;
    public final void rule__Column__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:725:1: ( ( 'use_column' ) )
            // InternalDSL.g:726:1: ( 'use_column' )
            {
            // InternalDSL.g:726:1: ( 'use_column' )
            // InternalDSL.g:727:2: 'use_column'
            {
             before(grammarAccess.getColumnAccess().getUse_columnKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getUse_columnKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_0__0__Impl"


    // $ANTLR start "rule__Column__Group_0__1"
    // InternalDSL.g:736:1: rule__Column__Group_0__1 : rule__Column__Group_0__1__Impl ;
    public final void rule__Column__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:740:1: ( rule__Column__Group_0__1__Impl )
            // InternalDSL.g:741:2: rule__Column__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_0__1"


    // $ANTLR start "rule__Column__Group_0__1__Impl"
    // InternalDSL.g:747:1: rule__Column__Group_0__1__Impl : ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) ) ;
    public final void rule__Column__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:751:1: ( ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) ) )
            // InternalDSL.g:752:1: ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) )
            {
            // InternalDSL.g:752:1: ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) )
            // InternalDSL.g:753:2: ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* )
            {
            // InternalDSL.g:753:2: ( ( rule__Column__UseAssignment_0_1 ) )
            // InternalDSL.g:754:3: ( rule__Column__UseAssignment_0_1 )
            {
             before(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 
            // InternalDSL.g:755:3: ( rule__Column__UseAssignment_0_1 )
            // InternalDSL.g:755:4: rule__Column__UseAssignment_0_1
            {
            pushFollow(FOLLOW_9);
            rule__Column__UseAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 

            }

            // InternalDSL.g:758:2: ( ( rule__Column__UseAssignment_0_1 )* )
            // InternalDSL.g:759:3: ( rule__Column__UseAssignment_0_1 )*
            {
             before(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 
            // InternalDSL.g:760:3: ( rule__Column__UseAssignment_0_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:760:4: rule__Column__UseAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Column__UseAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_0__1__Impl"


    // $ANTLR start "rule__Column__Group_1__0"
    // InternalDSL.g:770:1: rule__Column__Group_1__0 : rule__Column__Group_1__0__Impl rule__Column__Group_1__1 ;
    public final void rule__Column__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:774:1: ( rule__Column__Group_1__0__Impl rule__Column__Group_1__1 )
            // InternalDSL.g:775:2: rule__Column__Group_1__0__Impl rule__Column__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_1__0"


    // $ANTLR start "rule__Column__Group_1__0__Impl"
    // InternalDSL.g:782:1: rule__Column__Group_1__0__Impl : ( 'unuse_column' ) ;
    public final void rule__Column__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:786:1: ( ( 'unuse_column' ) )
            // InternalDSL.g:787:1: ( 'unuse_column' )
            {
            // InternalDSL.g:787:1: ( 'unuse_column' )
            // InternalDSL.g:788:2: 'unuse_column'
            {
             before(grammarAccess.getColumnAccess().getUnuse_columnKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getUnuse_columnKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_1__0__Impl"


    // $ANTLR start "rule__Column__Group_1__1"
    // InternalDSL.g:797:1: rule__Column__Group_1__1 : rule__Column__Group_1__1__Impl ;
    public final void rule__Column__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:801:1: ( rule__Column__Group_1__1__Impl )
            // InternalDSL.g:802:2: rule__Column__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_1__1"


    // $ANTLR start "rule__Column__Group_1__1__Impl"
    // InternalDSL.g:808:1: rule__Column__Group_1__1__Impl : ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) ) ;
    public final void rule__Column__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:812:1: ( ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) ) )
            // InternalDSL.g:813:1: ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) )
            {
            // InternalDSL.g:813:1: ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) )
            // InternalDSL.g:814:2: ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* )
            {
            // InternalDSL.g:814:2: ( ( rule__Column__UnuseAssignment_1_1 ) )
            // InternalDSL.g:815:3: ( rule__Column__UnuseAssignment_1_1 )
            {
             before(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 
            // InternalDSL.g:816:3: ( rule__Column__UnuseAssignment_1_1 )
            // InternalDSL.g:816:4: rule__Column__UnuseAssignment_1_1
            {
            pushFollow(FOLLOW_9);
            rule__Column__UnuseAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 

            }

            // InternalDSL.g:819:2: ( ( rule__Column__UnuseAssignment_1_1 )* )
            // InternalDSL.g:820:3: ( rule__Column__UnuseAssignment_1_1 )*
            {
             before(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 
            // InternalDSL.g:821:3: ( rule__Column__UnuseAssignment_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:821:4: rule__Column__UnuseAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Column__UnuseAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_1__1__Impl"


    // $ANTLR start "rule__Column__Group_2__0"
    // InternalDSL.g:831:1: rule__Column__Group_2__0 : rule__Column__Group_2__0__Impl rule__Column__Group_2__1 ;
    public final void rule__Column__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:835:1: ( rule__Column__Group_2__0__Impl rule__Column__Group_2__1 )
            // InternalDSL.g:836:2: rule__Column__Group_2__0__Impl rule__Column__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__0"


    // $ANTLR start "rule__Column__Group_2__0__Impl"
    // InternalDSL.g:843:1: rule__Column__Group_2__0__Impl : ( 'predict_column' ) ;
    public final void rule__Column__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:847:1: ( ( 'predict_column' ) )
            // InternalDSL.g:848:1: ( 'predict_column' )
            {
            // InternalDSL.g:848:1: ( 'predict_column' )
            // InternalDSL.g:849:2: 'predict_column'
            {
             before(grammarAccess.getColumnAccess().getPredict_columnKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getPredict_columnKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__0__Impl"


    // $ANTLR start "rule__Column__Group_2__1"
    // InternalDSL.g:858:1: rule__Column__Group_2__1 : rule__Column__Group_2__1__Impl ;
    public final void rule__Column__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:862:1: ( rule__Column__Group_2__1__Impl )
            // InternalDSL.g:863:2: rule__Column__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__1"


    // $ANTLR start "rule__Column__Group_2__1__Impl"
    // InternalDSL.g:869:1: rule__Column__Group_2__1__Impl : ( ( rule__Column__PredictAssignment_2_1 ) ) ;
    public final void rule__Column__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:873:1: ( ( ( rule__Column__PredictAssignment_2_1 ) ) )
            // InternalDSL.g:874:1: ( ( rule__Column__PredictAssignment_2_1 ) )
            {
            // InternalDSL.g:874:1: ( ( rule__Column__PredictAssignment_2_1 ) )
            // InternalDSL.g:875:2: ( rule__Column__PredictAssignment_2_1 )
            {
             before(grammarAccess.getColumnAccess().getPredictAssignment_2_1()); 
            // InternalDSL.g:876:2: ( rule__Column__PredictAssignment_2_1 )
            // InternalDSL.g:876:3: rule__Column__PredictAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__PredictAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getPredictAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__1__Impl"


    // $ANTLR start "rule__Strategy_choose__Group_0__0"
    // InternalDSL.g:885:1: rule__Strategy_choose__Group_0__0 : rule__Strategy_choose__Group_0__0__Impl rule__Strategy_choose__Group_0__1 ;
    public final void rule__Strategy_choose__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:889:1: ( rule__Strategy_choose__Group_0__0__Impl rule__Strategy_choose__Group_0__1 )
            // InternalDSL.g:890:2: rule__Strategy_choose__Group_0__0__Impl rule__Strategy_choose__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Strategy_choose__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_0__0"


    // $ANTLR start "rule__Strategy_choose__Group_0__0__Impl"
    // InternalDSL.g:897:1: rule__Strategy_choose__Group_0__0__Impl : ( 'use_strategy' ) ;
    public final void rule__Strategy_choose__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:901:1: ( ( 'use_strategy' ) )
            // InternalDSL.g:902:1: ( 'use_strategy' )
            {
            // InternalDSL.g:902:1: ( 'use_strategy' )
            // InternalDSL.g:903:2: 'use_strategy'
            {
             before(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_0__0__Impl"


    // $ANTLR start "rule__Strategy_choose__Group_0__1"
    // InternalDSL.g:912:1: rule__Strategy_choose__Group_0__1 : rule__Strategy_choose__Group_0__1__Impl rule__Strategy_choose__Group_0__2 ;
    public final void rule__Strategy_choose__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:916:1: ( rule__Strategy_choose__Group_0__1__Impl rule__Strategy_choose__Group_0__2 )
            // InternalDSL.g:917:2: rule__Strategy_choose__Group_0__1__Impl rule__Strategy_choose__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__Strategy_choose__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_0__1"


    // $ANTLR start "rule__Strategy_choose__Group_0__1__Impl"
    // InternalDSL.g:924:1: rule__Strategy_choose__Group_0__1__Impl : ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) ) ;
    public final void rule__Strategy_choose__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:928:1: ( ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) ) )
            // InternalDSL.g:929:1: ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) )
            {
            // InternalDSL.g:929:1: ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) )
            // InternalDSL.g:930:2: ( rule__Strategy_choose__StrategyAssignment_0_1 )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_0_1()); 
            // InternalDSL.g:931:2: ( rule__Strategy_choose__StrategyAssignment_0_1 )
            // InternalDSL.g:931:3: rule__Strategy_choose__StrategyAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Strategy_choose__StrategyAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_0__1__Impl"


    // $ANTLR start "rule__Strategy_choose__Group_0__2"
    // InternalDSL.g:939:1: rule__Strategy_choose__Group_0__2 : rule__Strategy_choose__Group_0__2__Impl ;
    public final void rule__Strategy_choose__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:943:1: ( rule__Strategy_choose__Group_0__2__Impl )
            // InternalDSL.g:944:2: rule__Strategy_choose__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_0__2"


    // $ANTLR start "rule__Strategy_choose__Group_0__2__Impl"
    // InternalDSL.g:950:1: rule__Strategy_choose__Group_0__2__Impl : ( ( rule__Strategy_choose__RatioAssignment_0_2 ) ) ;
    public final void rule__Strategy_choose__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:954:1: ( ( ( rule__Strategy_choose__RatioAssignment_0_2 ) ) )
            // InternalDSL.g:955:1: ( ( rule__Strategy_choose__RatioAssignment_0_2 ) )
            {
            // InternalDSL.g:955:1: ( ( rule__Strategy_choose__RatioAssignment_0_2 ) )
            // InternalDSL.g:956:2: ( rule__Strategy_choose__RatioAssignment_0_2 )
            {
             before(grammarAccess.getStrategy_chooseAccess().getRatioAssignment_0_2()); 
            // InternalDSL.g:957:2: ( rule__Strategy_choose__RatioAssignment_0_2 )
            // InternalDSL.g:957:3: rule__Strategy_choose__RatioAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Strategy_choose__RatioAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStrategy_chooseAccess().getRatioAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_0__2__Impl"


    // $ANTLR start "rule__Strategy_choose__Group_1__0"
    // InternalDSL.g:966:1: rule__Strategy_choose__Group_1__0 : rule__Strategy_choose__Group_1__0__Impl rule__Strategy_choose__Group_1__1 ;
    public final void rule__Strategy_choose__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:970:1: ( rule__Strategy_choose__Group_1__0__Impl rule__Strategy_choose__Group_1__1 )
            // InternalDSL.g:971:2: rule__Strategy_choose__Group_1__0__Impl rule__Strategy_choose__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Strategy_choose__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_1__0"


    // $ANTLR start "rule__Strategy_choose__Group_1__0__Impl"
    // InternalDSL.g:978:1: rule__Strategy_choose__Group_1__0__Impl : ( 'use_strategy' ) ;
    public final void rule__Strategy_choose__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:982:1: ( ( 'use_strategy' ) )
            // InternalDSL.g:983:1: ( 'use_strategy' )
            {
            // InternalDSL.g:983:1: ( 'use_strategy' )
            // InternalDSL.g:984:2: 'use_strategy'
            {
             before(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_1__0__Impl"


    // $ANTLR start "rule__Strategy_choose__Group_1__1"
    // InternalDSL.g:993:1: rule__Strategy_choose__Group_1__1 : rule__Strategy_choose__Group_1__1__Impl rule__Strategy_choose__Group_1__2 ;
    public final void rule__Strategy_choose__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:997:1: ( rule__Strategy_choose__Group_1__1__Impl rule__Strategy_choose__Group_1__2 )
            // InternalDSL.g:998:2: rule__Strategy_choose__Group_1__1__Impl rule__Strategy_choose__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Strategy_choose__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_1__1"


    // $ANTLR start "rule__Strategy_choose__Group_1__1__Impl"
    // InternalDSL.g:1005:1: rule__Strategy_choose__Group_1__1__Impl : ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) ) ;
    public final void rule__Strategy_choose__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1009:1: ( ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) ) )
            // InternalDSL.g:1010:1: ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) )
            {
            // InternalDSL.g:1010:1: ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) )
            // InternalDSL.g:1011:2: ( rule__Strategy_choose__StrategyAssignment_1_1 )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_1_1()); 
            // InternalDSL.g:1012:2: ( rule__Strategy_choose__StrategyAssignment_1_1 )
            // InternalDSL.g:1012:3: rule__Strategy_choose__StrategyAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Strategy_choose__StrategyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_1__1__Impl"


    // $ANTLR start "rule__Strategy_choose__Group_1__2"
    // InternalDSL.g:1020:1: rule__Strategy_choose__Group_1__2 : rule__Strategy_choose__Group_1__2__Impl ;
    public final void rule__Strategy_choose__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1024:1: ( rule__Strategy_choose__Group_1__2__Impl )
            // InternalDSL.g:1025:2: rule__Strategy_choose__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Strategy_choose__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_1__2"


    // $ANTLR start "rule__Strategy_choose__Group_1__2__Impl"
    // InternalDSL.g:1031:1: rule__Strategy_choose__Group_1__2__Impl : ( ( rule__Strategy_choose__NbAssignment_1_2 )? ) ;
    public final void rule__Strategy_choose__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1035:1: ( ( ( rule__Strategy_choose__NbAssignment_1_2 )? ) )
            // InternalDSL.g:1036:1: ( ( rule__Strategy_choose__NbAssignment_1_2 )? )
            {
            // InternalDSL.g:1036:1: ( ( rule__Strategy_choose__NbAssignment_1_2 )? )
            // InternalDSL.g:1037:2: ( rule__Strategy_choose__NbAssignment_1_2 )?
            {
             before(grammarAccess.getStrategy_chooseAccess().getNbAssignment_1_2()); 
            // InternalDSL.g:1038:2: ( rule__Strategy_choose__NbAssignment_1_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1038:3: rule__Strategy_choose__NbAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategy_choose__NbAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStrategy_chooseAccess().getNbAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__Group_1__2__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalDSL.g:1047:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1051:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalDSL.g:1052:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalDSL.g:1059:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1063:1: ( ( 'read' ) )
            // InternalDSL.g:1064:1: ( 'read' )
            {
            // InternalDSL.g:1064:1: ( 'read' )
            // InternalDSL.g:1065:2: 'read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalDSL.g:1074:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1078:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalDSL.g:1079:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalDSL.g:1086:1: rule__Read__Group__1__Impl : ( ( rule__Read__PathAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1090:1: ( ( ( rule__Read__PathAssignment_1 ) ) )
            // InternalDSL.g:1091:1: ( ( rule__Read__PathAssignment_1 ) )
            {
            // InternalDSL.g:1091:1: ( ( rule__Read__PathAssignment_1 ) )
            // InternalDSL.g:1092:2: ( rule__Read__PathAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getPathAssignment_1()); 
            // InternalDSL.g:1093:2: ( rule__Read__PathAssignment_1 )
            // InternalDSL.g:1093:3: rule__Read__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalDSL.g:1101:1: rule__Read__Group__2 : rule__Read__Group__2__Impl ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1105:1: ( rule__Read__Group__2__Impl )
            // InternalDSL.g:1106:2: rule__Read__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalDSL.g:1112:1: rule__Read__Group__2__Impl : ( ( rule__Read__SeparatorAssignment_2 )? ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1116:1: ( ( ( rule__Read__SeparatorAssignment_2 )? ) )
            // InternalDSL.g:1117:1: ( ( rule__Read__SeparatorAssignment_2 )? )
            {
            // InternalDSL.g:1117:1: ( ( rule__Read__SeparatorAssignment_2 )? )
            // InternalDSL.g:1118:2: ( rule__Read__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getReadAccess().getSeparatorAssignment_2()); 
            // InternalDSL.g:1119:2: ( rule__Read__SeparatorAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SEP) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1119:3: rule__Read__SeparatorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Read__SeparatorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReadAccess().getSeparatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Algo_choose__Group__0"
    // InternalDSL.g:1128:1: rule__Algo_choose__Group__0 : rule__Algo_choose__Group__0__Impl rule__Algo_choose__Group__1 ;
    public final void rule__Algo_choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1132:1: ( rule__Algo_choose__Group__0__Impl rule__Algo_choose__Group__1 )
            // InternalDSL.g:1133:2: rule__Algo_choose__Group__0__Impl rule__Algo_choose__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Algo_choose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo_choose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo_choose__Group__0"


    // $ANTLR start "rule__Algo_choose__Group__0__Impl"
    // InternalDSL.g:1140:1: rule__Algo_choose__Group__0__Impl : ( 'use_algorithm' ) ;
    public final void rule__Algo_choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1144:1: ( ( 'use_algorithm' ) )
            // InternalDSL.g:1145:1: ( 'use_algorithm' )
            {
            // InternalDSL.g:1145:1: ( 'use_algorithm' )
            // InternalDSL.g:1146:2: 'use_algorithm'
            {
             before(grammarAccess.getAlgo_chooseAccess().getUse_algorithmKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlgo_chooseAccess().getUse_algorithmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo_choose__Group__0__Impl"


    // $ANTLR start "rule__Algo_choose__Group__1"
    // InternalDSL.g:1155:1: rule__Algo_choose__Group__1 : rule__Algo_choose__Group__1__Impl ;
    public final void rule__Algo_choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1159:1: ( rule__Algo_choose__Group__1__Impl )
            // InternalDSL.g:1160:2: rule__Algo_choose__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algo_choose__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo_choose__Group__1"


    // $ANTLR start "rule__Algo_choose__Group__1__Impl"
    // InternalDSL.g:1166:1: rule__Algo_choose__Group__1__Impl : ( ( rule__Algo_choose__AlgorithmAssignment_1 ) ) ;
    public final void rule__Algo_choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1170:1: ( ( ( rule__Algo_choose__AlgorithmAssignment_1 ) ) )
            // InternalDSL.g:1171:1: ( ( rule__Algo_choose__AlgorithmAssignment_1 ) )
            {
            // InternalDSL.g:1171:1: ( ( rule__Algo_choose__AlgorithmAssignment_1 ) )
            // InternalDSL.g:1172:2: ( rule__Algo_choose__AlgorithmAssignment_1 )
            {
             before(grammarAccess.getAlgo_chooseAccess().getAlgorithmAssignment_1()); 
            // InternalDSL.g:1173:2: ( rule__Algo_choose__AlgorithmAssignment_1 )
            // InternalDSL.g:1173:3: rule__Algo_choose__AlgorithmAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Algo_choose__AlgorithmAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgo_chooseAccess().getAlgorithmAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo_choose__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalDSL.g:1182:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1186:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalDSL.g:1187:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalDSL.g:1194:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1198:1: ( ( 'print' ) )
            // InternalDSL.g:1199:1: ( 'print' )
            {
            // InternalDSL.g:1199:1: ( 'print' )
            // InternalDSL.g:1200:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalDSL.g:1209:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1213:1: ( rule__Print__Group__1__Impl )
            // InternalDSL.g:1214:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalDSL.g:1220:1: rule__Print__Group__1__Impl : ( ( rule__Print__PrintAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1224:1: ( ( ( rule__Print__PrintAssignment_1 ) ) )
            // InternalDSL.g:1225:1: ( ( rule__Print__PrintAssignment_1 ) )
            {
            // InternalDSL.g:1225:1: ( ( rule__Print__PrintAssignment_1 ) )
            // InternalDSL.g:1226:2: ( rule__Print__PrintAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getPrintAssignment_1()); 
            // InternalDSL.g:1227:2: ( rule__Print__PrintAssignment_1 )
            // InternalDSL.g:1227:3: rule__Print__PrintAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__PrintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getPrintAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__ML__StatementsAssignment_0"
    // InternalDSL.g:1236:1: rule__ML__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__ML__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1240:1: ( ( ruleStatement ) )
            // InternalDSL.g:1241:2: ( ruleStatement )
            {
            // InternalDSL.g:1241:2: ( ruleStatement )
            // InternalDSL.g:1242:3: ruleStatement
            {
             before(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ML__StatementsAssignment_0"


    // $ANTLR start "rule__ML__StatementsAssignment_1"
    // InternalDSL.g:1251:1: rule__ML__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__ML__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1255:1: ( ( ruleStatement ) )
            // InternalDSL.g:1256:2: ( ruleStatement )
            {
            // InternalDSL.g:1256:2: ( ruleStatement )
            // InternalDSL.g:1257:3: ruleStatement
            {
             before(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ML__StatementsAssignment_1"


    // $ANTLR start "rule__Statement__AssignAssignment_0"
    // InternalDSL.g:1266:1: rule__Statement__AssignAssignment_0 : ( ruleAssign ) ;
    public final void rule__Statement__AssignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1270:1: ( ( ruleAssign ) )
            // InternalDSL.g:1271:2: ( ruleAssign )
            {
            // InternalDSL.g:1271:2: ( ruleAssign )
            // InternalDSL.g:1272:3: ruleAssign
            {
             before(grammarAccess.getStatementAccess().getAssignAssignParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssign();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getAssignAssignParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__AssignAssignment_0"


    // $ANTLR start "rule__Statement__PrimitiveAssignment_1"
    // InternalDSL.g:1281:1: rule__Statement__PrimitiveAssignment_1 : ( rulePrimitive ) ;
    public final void rule__Statement__PrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1285:1: ( ( rulePrimitive ) )
            // InternalDSL.g:1286:2: ( rulePrimitive )
            {
            // InternalDSL.g:1286:2: ( rulePrimitive )
            // InternalDSL.g:1287:3: rulePrimitive
            {
             before(grammarAccess.getStatementAccess().getPrimitivePrimitiveParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getPrimitivePrimitiveParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__PrimitiveAssignment_1"


    // $ANTLR start "rule__Assign__VarnameAssignment_0"
    // InternalDSL.g:1296:1: rule__Assign__VarnameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assign__VarnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1300:1: ( ( RULE_ID ) )
            // InternalDSL.g:1301:2: ( RULE_ID )
            {
            // InternalDSL.g:1301:2: ( RULE_ID )
            // InternalDSL.g:1302:3: RULE_ID
            {
             before(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__VarnameAssignment_0"


    // $ANTLR start "rule__Assign__Assign_valueAssignment_2"
    // InternalDSL.g:1311:1: rule__Assign__Assign_valueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assign__Assign_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1315:1: ( ( ruleExpression ) )
            // InternalDSL.g:1316:2: ( ruleExpression )
            {
            // InternalDSL.g:1316:2: ( ruleExpression )
            // InternalDSL.g:1317:3: ruleExpression
            {
             before(grammarAccess.getAssignAccess().getAssign_valueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignAccess().getAssign_valueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Assign_valueAssignment_2"


    // $ANTLR start "rule__Expression__Expr_primAssignment_0"
    // InternalDSL.g:1326:1: rule__Expression__Expr_primAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Expression__Expr_primAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1330:1: ( ( rulePrimitive ) )
            // InternalDSL.g:1331:2: ( rulePrimitive )
            {
            // InternalDSL.g:1331:2: ( rulePrimitive )
            // InternalDSL.g:1332:3: rulePrimitive
            {
             before(grammarAccess.getExpressionAccess().getExpr_primPrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpr_primPrimitiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Expr_primAssignment_0"


    // $ANTLR start "rule__Expression__Expr_constAssignment_1"
    // InternalDSL.g:1341:1: rule__Expression__Expr_constAssignment_1 : ( ruleConstant ) ;
    public final void rule__Expression__Expr_constAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1345:1: ( ( ruleConstant ) )
            // InternalDSL.g:1346:2: ( ruleConstant )
            {
            // InternalDSL.g:1346:2: ( ruleConstant )
            // InternalDSL.g:1347:3: ruleConstant
            {
             before(grammarAccess.getExpressionAccess().getExpr_constConstantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpr_constConstantParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Expr_constAssignment_1"


    // $ANTLR start "rule__Primitive__PrintAssignment_0"
    // InternalDSL.g:1356:1: rule__Primitive__PrintAssignment_0 : ( rulePrint ) ;
    public final void rule__Primitive__PrintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1360:1: ( ( rulePrint ) )
            // InternalDSL.g:1361:2: ( rulePrint )
            {
            // InternalDSL.g:1361:2: ( rulePrint )
            // InternalDSL.g:1362:3: rulePrint
            {
             before(grammarAccess.getPrimitiveAccess().getPrintPrintParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrintPrintParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__PrintAssignment_0"


    // $ANTLR start "rule__Primitive__Algo_chooseAssignment_1"
    // InternalDSL.g:1371:1: rule__Primitive__Algo_chooseAssignment_1 : ( ruleAlgo_choose ) ;
    public final void rule__Primitive__Algo_chooseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1375:1: ( ( ruleAlgo_choose ) )
            // InternalDSL.g:1376:2: ( ruleAlgo_choose )
            {
            // InternalDSL.g:1376:2: ( ruleAlgo_choose )
            // InternalDSL.g:1377:3: ruleAlgo_choose
            {
             before(grammarAccess.getPrimitiveAccess().getAlgo_chooseAlgo_chooseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgo_choose();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getAlgo_chooseAlgo_chooseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Algo_chooseAssignment_1"


    // $ANTLR start "rule__Primitive__ReadAssignment_2"
    // InternalDSL.g:1386:1: rule__Primitive__ReadAssignment_2 : ( ruleRead ) ;
    public final void rule__Primitive__ReadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1390:1: ( ( ruleRead ) )
            // InternalDSL.g:1391:2: ( ruleRead )
            {
            // InternalDSL.g:1391:2: ( ruleRead )
            // InternalDSL.g:1392:3: ruleRead
            {
             before(grammarAccess.getPrimitiveAccess().getReadReadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getReadReadParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__ReadAssignment_2"


    // $ANTLR start "rule__Primitive__Strategy_chooseAssignment_3"
    // InternalDSL.g:1401:1: rule__Primitive__Strategy_chooseAssignment_3 : ( ruleStrategy_choose ) ;
    public final void rule__Primitive__Strategy_chooseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1405:1: ( ( ruleStrategy_choose ) )
            // InternalDSL.g:1406:2: ( ruleStrategy_choose )
            {
            // InternalDSL.g:1406:2: ( ruleStrategy_choose )
            // InternalDSL.g:1407:3: ruleStrategy_choose
            {
             before(grammarAccess.getPrimitiveAccess().getStrategy_chooseStrategy_chooseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategy_choose();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getStrategy_chooseStrategy_chooseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Strategy_chooseAssignment_3"


    // $ANTLR start "rule__Primitive__ColumnAssignment_4"
    // InternalDSL.g:1416:1: rule__Primitive__ColumnAssignment_4 : ( ruleColumn ) ;
    public final void rule__Primitive__ColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1420:1: ( ( ruleColumn ) )
            // InternalDSL.g:1421:2: ( ruleColumn )
            {
            // InternalDSL.g:1421:2: ( ruleColumn )
            // InternalDSL.g:1422:3: ruleColumn
            {
             before(grammarAccess.getPrimitiveAccess().getColumnColumnParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getColumnColumnParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__ColumnAssignment_4"


    // $ANTLR start "rule__Primitive__Use_metricAssignment_5"
    // InternalDSL.g:1431:1: rule__Primitive__Use_metricAssignment_5 : ( ruleUse_Metric ) ;
    public final void rule__Primitive__Use_metricAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1435:1: ( ( ruleUse_Metric ) )
            // InternalDSL.g:1436:2: ( ruleUse_Metric )
            {
            // InternalDSL.g:1436:2: ( ruleUse_Metric )
            // InternalDSL.g:1437:3: ruleUse_Metric
            {
             before(grammarAccess.getPrimitiveAccess().getUse_metricUse_MetricParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUse_Metric();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getUse_metricUse_MetricParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Use_metricAssignment_5"


    // $ANTLR start "rule__Use_Metric__MetricAssignment_1"
    // InternalDSL.g:1446:1: rule__Use_Metric__MetricAssignment_1 : ( RULE_METRIC ) ;
    public final void rule__Use_Metric__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1450:1: ( ( RULE_METRIC ) )
            // InternalDSL.g:1451:2: ( RULE_METRIC )
            {
            // InternalDSL.g:1451:2: ( RULE_METRIC )
            // InternalDSL.g:1452:3: RULE_METRIC
            {
             before(grammarAccess.getUse_MetricAccess().getMetricMETRICTerminalRuleCall_1_0()); 
            match(input,RULE_METRIC,FOLLOW_2); 
             after(grammarAccess.getUse_MetricAccess().getMetricMETRICTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use_Metric__MetricAssignment_1"


    // $ANTLR start "rule__Column__UseAssignment_0_1"
    // InternalDSL.g:1461:1: rule__Column__UseAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Column__UseAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1465:1: ( ( RULE_INT ) )
            // InternalDSL.g:1466:2: ( RULE_INT )
            {
            // InternalDSL.g:1466:2: ( RULE_INT )
            // InternalDSL.g:1467:3: RULE_INT
            {
             before(grammarAccess.getColumnAccess().getUseINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getUseINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__UseAssignment_0_1"


    // $ANTLR start "rule__Column__UnuseAssignment_1_1"
    // InternalDSL.g:1476:1: rule__Column__UnuseAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Column__UnuseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1480:1: ( ( RULE_INT ) )
            // InternalDSL.g:1481:2: ( RULE_INT )
            {
            // InternalDSL.g:1481:2: ( RULE_INT )
            // InternalDSL.g:1482:3: RULE_INT
            {
             before(grammarAccess.getColumnAccess().getUnuseINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getUnuseINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__UnuseAssignment_1_1"


    // $ANTLR start "rule__Column__PredictAssignment_2_1"
    // InternalDSL.g:1491:1: rule__Column__PredictAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Column__PredictAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1495:1: ( ( RULE_INT ) )
            // InternalDSL.g:1496:2: ( RULE_INT )
            {
            // InternalDSL.g:1496:2: ( RULE_INT )
            // InternalDSL.g:1497:3: RULE_INT
            {
             before(grammarAccess.getColumnAccess().getPredictINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getPredictINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__PredictAssignment_2_1"


    // $ANTLR start "rule__Strategy_choose__StrategyAssignment_0_1"
    // InternalDSL.g:1506:1: rule__Strategy_choose__StrategyAssignment_0_1 : ( ( 'train_test' ) ) ;
    public final void rule__Strategy_choose__StrategyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1510:1: ( ( ( 'train_test' ) ) )
            // InternalDSL.g:1511:2: ( ( 'train_test' ) )
            {
            // InternalDSL.g:1511:2: ( ( 'train_test' ) )
            // InternalDSL.g:1512:3: ( 'train_test' )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); 
            // InternalDSL.g:1513:3: ( 'train_test' )
            // InternalDSL.g:1514:4: 'train_test'
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); 

            }

             after(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__StrategyAssignment_0_1"


    // $ANTLR start "rule__Strategy_choose__RatioAssignment_0_2"
    // InternalDSL.g:1525:1: rule__Strategy_choose__RatioAssignment_0_2 : ( RULE_DOUBLE ) ;
    public final void rule__Strategy_choose__RatioAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1529:1: ( ( RULE_DOUBLE ) )
            // InternalDSL.g:1530:2: ( RULE_DOUBLE )
            {
            // InternalDSL.g:1530:2: ( RULE_DOUBLE )
            // InternalDSL.g:1531:3: RULE_DOUBLE
            {
             before(grammarAccess.getStrategy_chooseAccess().getRatioDOUBLETerminalRuleCall_0_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getStrategy_chooseAccess().getRatioDOUBLETerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__RatioAssignment_0_2"


    // $ANTLR start "rule__Strategy_choose__StrategyAssignment_1_1"
    // InternalDSL.g:1540:1: rule__Strategy_choose__StrategyAssignment_1_1 : ( ( 'cross_valid' ) ) ;
    public final void rule__Strategy_choose__StrategyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1544:1: ( ( ( 'cross_valid' ) ) )
            // InternalDSL.g:1545:2: ( ( 'cross_valid' ) )
            {
            // InternalDSL.g:1545:2: ( ( 'cross_valid' ) )
            // InternalDSL.g:1546:3: ( 'cross_valid' )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); 
            // InternalDSL.g:1547:3: ( 'cross_valid' )
            // InternalDSL.g:1548:4: 'cross_valid'
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); 

            }

             after(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__StrategyAssignment_1_1"


    // $ANTLR start "rule__Strategy_choose__NbAssignment_1_2"
    // InternalDSL.g:1559:1: rule__Strategy_choose__NbAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Strategy_choose__NbAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1563:1: ( ( RULE_INT ) )
            // InternalDSL.g:1564:2: ( RULE_INT )
            {
            // InternalDSL.g:1564:2: ( RULE_INT )
            // InternalDSL.g:1565:3: RULE_INT
            {
             before(grammarAccess.getStrategy_chooseAccess().getNbINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStrategy_chooseAccess().getNbINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy_choose__NbAssignment_1_2"


    // $ANTLR start "rule__Read__PathAssignment_1"
    // InternalDSL.g:1574:1: rule__Read__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Read__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1578:1: ( ( RULE_STRING ) )
            // InternalDSL.g:1579:2: ( RULE_STRING )
            {
            // InternalDSL.g:1579:2: ( RULE_STRING )
            // InternalDSL.g:1580:3: RULE_STRING
            {
             before(grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__PathAssignment_1"


    // $ANTLR start "rule__Read__SeparatorAssignment_2"
    // InternalDSL.g:1589:1: rule__Read__SeparatorAssignment_2 : ( RULE_SEP ) ;
    public final void rule__Read__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1593:1: ( ( RULE_SEP ) )
            // InternalDSL.g:1594:2: ( RULE_SEP )
            {
            // InternalDSL.g:1594:2: ( RULE_SEP )
            // InternalDSL.g:1595:3: RULE_SEP
            {
             before(grammarAccess.getReadAccess().getSeparatorSEPTerminalRuleCall_2_0()); 
            match(input,RULE_SEP,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getSeparatorSEPTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__SeparatorAssignment_2"


    // $ANTLR start "rule__Algo_choose__AlgorithmAssignment_1"
    // InternalDSL.g:1604:1: rule__Algo_choose__AlgorithmAssignment_1 : ( RULE_ALGO_NAME ) ;
    public final void rule__Algo_choose__AlgorithmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1608:1: ( ( RULE_ALGO_NAME ) )
            // InternalDSL.g:1609:2: ( RULE_ALGO_NAME )
            {
            // InternalDSL.g:1609:2: ( RULE_ALGO_NAME )
            // InternalDSL.g:1610:3: RULE_ALGO_NAME
            {
             before(grammarAccess.getAlgo_chooseAccess().getAlgorithmALGO_NAMETerminalRuleCall_1_0()); 
            match(input,RULE_ALGO_NAME,FOLLOW_2); 
             after(grammarAccess.getAlgo_chooseAccess().getAlgorithmALGO_NAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo_choose__AlgorithmAssignment_1"


    // $ANTLR start "rule__Print__PrintAssignment_1"
    // InternalDSL.g:1619:1: rule__Print__PrintAssignment_1 : ( ruleConstant ) ;
    public final void rule__Print__PrintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1623:1: ( ( ruleConstant ) )
            // InternalDSL.g:1624:2: ( ruleConstant )
            {
            // InternalDSL.g:1624:2: ( ruleConstant )
            // InternalDSL.g:1625:3: ruleConstant
            {
             before(grammarAccess.getPrintAccess().getPrintConstantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getPrintConstantParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__PrintAssignment_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\73\uffff";
    static final String dfa_2s = "\13\uffff\6\44\1\uffff\5\44\10\uffff\4\44\2\uffff\14\44\1\uffff\11\44";
    static final String dfa_3s = "\1\7\1\17\1\4\1\12\1\6\1\30\3\4\1\10\1\4\6\7\1\5\3\4\2\7\1\4\1\12\1\6\1\30\3\4\1\10\4\7\2\uffff\3\7\2\4\6\7\1\4\1\5\2\4\5\7\2\4";
    static final String dfa_4s = "\1\27\1\17\1\7\1\12\1\6\1\31\3\4\1\10\7\27\1\5\5\27\1\7\1\12\1\6\1\31\3\4\1\10\4\27\2\uffff\14\27\1\5\11\27";
    static final String dfa_5s = "\43\uffff\1\1\1\2\26\uffff";
    static final String dfa_6s = "\73\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\11\1\6\1\7\1\10\1\5\1\4\1\3\1\2",
            "\1\12",
            "\1\13\1\14\1\15\1\16",
            "\1\17",
            "\1\20",
            "\1\21\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\37\1\40\1\41\1\42\10\uffff\1\36\1\33\1\34\1\35\1\32\1\31\1\30\1\27",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\1\uffff\1\45\6\uffff\10\43",
            "\1\46",
            "\1\47\2\uffff\1\43\10\uffff\10\43",
            "\1\50\2\uffff\1\43\10\uffff\10\43",
            "\1\51\2\uffff\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\52\1\53\1\54\1\55",
            "\1\56",
            "\1\57",
            "\1\61\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "",
            "",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\50\2\uffff\1\43\10\uffff\10\43",
            "\1\51\2\uffff\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\1\uffff\1\66\6\uffff\10\43",
            "\1\67\2\uffff\1\43\10\uffff\10\43",
            "\1\70",
            "\1\71\2\uffff\1\43\10\uffff\10\43",
            "\1\72\2\uffff\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\43\10\uffff\10\43",
            "\1\71\2\uffff\1\43\10\uffff\10\43",
            "\1\72\2\uffff\1\43\10\uffff\10\43"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 539:2: ( rule__ML__StatementsAssignment_0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000FF0080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000FF0082L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000FF00F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});

}