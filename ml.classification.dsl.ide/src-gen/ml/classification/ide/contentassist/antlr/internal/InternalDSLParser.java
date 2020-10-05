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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_METRIC", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_SEP", "RULE_ALGO_NAME", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'use_metric'", "'use_column'", "'unuse_column'", "'predict_column'", "'use_strategy'", "'read'", "'use_algorithm'", "'print'", "'='", "'train_test'", "'cross_valid'"
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


    // $ANTLR start "entryRulePrimitive"
    // InternalDSL.g:103:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( rulePrimitive EOF )
            // InternalDSL.g:105:1: rulePrimitive EOF
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
    // InternalDSL.g:112:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__Primitive__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__Primitive__Alternatives )
            // InternalDSL.g:119:4: rule__Primitive__Alternatives
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


    // $ANTLR start "entryRuleUse_Metric"
    // InternalDSL.g:128:1: entryRuleUse_Metric : ruleUse_Metric EOF ;
    public final void entryRuleUse_Metric() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleUse_Metric EOF )
            // InternalDSL.g:130:1: ruleUse_Metric EOF
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
    // InternalDSL.g:137:1: ruleUse_Metric : ( ( rule__Use_Metric__Group__0 ) ) ;
    public final void ruleUse_Metric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Use_Metric__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__Use_Metric__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Use_Metric__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__Use_Metric__Group__0 )
            {
             before(grammarAccess.getUse_MetricAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__Use_Metric__Group__0 )
            // InternalDSL.g:144:4: rule__Use_Metric__Group__0
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
    // InternalDSL.g:153:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleColumn EOF )
            // InternalDSL.g:155:1: ruleColumn EOF
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
    // InternalDSL.g:162:1: ruleColumn : ( ( rule__Column__Alternatives ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__Column__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__Column__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__Column__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__Column__Alternatives )
            {
             before(grammarAccess.getColumnAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__Column__Alternatives )
            // InternalDSL.g:169:4: rule__Column__Alternatives
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
    // InternalDSL.g:178:1: entryRuleStrategy_choose : ruleStrategy_choose EOF ;
    public final void entryRuleStrategy_choose() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleStrategy_choose EOF )
            // InternalDSL.g:180:1: ruleStrategy_choose EOF
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
    // InternalDSL.g:187:1: ruleStrategy_choose : ( ( rule__Strategy_choose__Alternatives ) ) ;
    public final void ruleStrategy_choose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Strategy_choose__Alternatives ) ) )
            // InternalDSL.g:192:2: ( ( rule__Strategy_choose__Alternatives ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Strategy_choose__Alternatives ) )
            // InternalDSL.g:193:3: ( rule__Strategy_choose__Alternatives )
            {
             before(grammarAccess.getStrategy_chooseAccess().getAlternatives()); 
            // InternalDSL.g:194:3: ( rule__Strategy_choose__Alternatives )
            // InternalDSL.g:194:4: rule__Strategy_choose__Alternatives
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
    // InternalDSL.g:203:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleRead EOF )
            // InternalDSL.g:205:1: ruleRead EOF
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
    // InternalDSL.g:212:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Read__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Read__Group__0 )
            // InternalDSL.g:219:4: rule__Read__Group__0
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
    // InternalDSL.g:228:1: entryRuleAlgo_choose : ruleAlgo_choose EOF ;
    public final void entryRuleAlgo_choose() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleAlgo_choose EOF )
            // InternalDSL.g:230:1: ruleAlgo_choose EOF
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
    // InternalDSL.g:237:1: ruleAlgo_choose : ( ( rule__Algo_choose__Group__0 ) ) ;
    public final void ruleAlgo_choose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Algo_choose__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__Algo_choose__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Algo_choose__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__Algo_choose__Group__0 )
            {
             before(grammarAccess.getAlgo_chooseAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__Algo_choose__Group__0 )
            // InternalDSL.g:244:4: rule__Algo_choose__Group__0
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
    // InternalDSL.g:253:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( rulePrint EOF )
            // InternalDSL.g:255:1: rulePrint EOF
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
    // InternalDSL.g:262:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Print__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__Print__Group__0 )
            // InternalDSL.g:269:4: rule__Print__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleExpression EOF )
            // InternalDSL.g:280:1: ruleExpression EOF
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
    // InternalDSL.g:287:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalDSL.g:292:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Expression__Alternatives ) )
            // InternalDSL.g:293:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalDSL.g:294:3: ( rule__Expression__Alternatives )
            // InternalDSL.g:294:4: rule__Expression__Alternatives
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


    // $ANTLR start "entryRuleAssign"
    // InternalDSL.g:303:1: entryRuleAssign : ruleAssign EOF ;
    public final void entryRuleAssign() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleAssign EOF )
            // InternalDSL.g:305:1: ruleAssign EOF
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
    // InternalDSL.g:312:1: ruleAssign : ( ( rule__Assign__Alternatives ) ) ;
    public final void ruleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Assign__Alternatives ) ) )
            // InternalDSL.g:317:2: ( ( rule__Assign__Alternatives ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Assign__Alternatives ) )
            // InternalDSL.g:318:3: ( rule__Assign__Alternatives )
            {
             before(grammarAccess.getAssignAccess().getAlternatives()); 
            // InternalDSL.g:319:3: ( rule__Assign__Alternatives )
            // InternalDSL.g:319:4: rule__Assign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleConstant"
    // InternalDSL.g:328:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleConstant EOF )
            // InternalDSL.g:330:1: ruleConstant EOF
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
    // InternalDSL.g:337:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDSL.g:342:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Constant__Alternatives ) )
            // InternalDSL.g:343:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDSL.g:344:3: ( rule__Constant__Alternatives )
            // InternalDSL.g:344:4: rule__Constant__Alternatives
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalDSL.g:352:1: rule__Statement__Alternatives : ( ( ( rule__Statement__StatementAssignment_0 ) ) | ( ( rule__Statement__StatementAssignment_1 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:356:1: ( ( ( rule__Statement__StatementAssignment_0 ) ) | ( ( rule__Statement__StatementAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||LA1_0==RULE_ID) ) {
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
                    // InternalDSL.g:357:2: ( ( rule__Statement__StatementAssignment_0 ) )
                    {
                    // InternalDSL.g:357:2: ( ( rule__Statement__StatementAssignment_0 ) )
                    // InternalDSL.g:358:3: ( rule__Statement__StatementAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getStatementAssignment_0()); 
                    // InternalDSL.g:359:3: ( rule__Statement__StatementAssignment_0 )
                    // InternalDSL.g:359:4: rule__Statement__StatementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StatementAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getStatementAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:363:2: ( ( rule__Statement__StatementAssignment_1 ) )
                    {
                    // InternalDSL.g:363:2: ( ( rule__Statement__StatementAssignment_1 ) )
                    // InternalDSL.g:364:3: ( rule__Statement__StatementAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getStatementAssignment_1()); 
                    // InternalDSL.g:365:3: ( rule__Statement__StatementAssignment_1 )
                    // InternalDSL.g:365:4: rule__Statement__StatementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StatementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getStatementAssignment_1()); 

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


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalDSL.g:373:1: rule__Primitive__Alternatives : ( ( ( rule__Primitive__PrimitiveAssignment_0 ) ) | ( ( rule__Primitive__PrimitiveAssignment_1 ) ) | ( ( rule__Primitive__PrimitiveAssignment_2 ) ) | ( ( rule__Primitive__PrimitiveAssignment_3 ) ) | ( ( rule__Primitive__PrimitiveAssignment_4 ) ) | ( ( rule__Primitive__PrimitiveAssignment_5 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:377:1: ( ( ( rule__Primitive__PrimitiveAssignment_0 ) ) | ( ( rule__Primitive__PrimitiveAssignment_1 ) ) | ( ( rule__Primitive__PrimitiveAssignment_2 ) ) | ( ( rule__Primitive__PrimitiveAssignment_3 ) ) | ( ( rule__Primitive__PrimitiveAssignment_4 ) ) | ( ( rule__Primitive__PrimitiveAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:378:2: ( ( rule__Primitive__PrimitiveAssignment_0 ) )
                    {
                    // InternalDSL.g:378:2: ( ( rule__Primitive__PrimitiveAssignment_0 ) )
                    // InternalDSL.g:379:3: ( rule__Primitive__PrimitiveAssignment_0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_0()); 
                    // InternalDSL.g:380:3: ( rule__Primitive__PrimitiveAssignment_0 )
                    // InternalDSL.g:380:4: rule__Primitive__PrimitiveAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrimitiveAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:384:2: ( ( rule__Primitive__PrimitiveAssignment_1 ) )
                    {
                    // InternalDSL.g:384:2: ( ( rule__Primitive__PrimitiveAssignment_1 ) )
                    // InternalDSL.g:385:3: ( rule__Primitive__PrimitiveAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_1()); 
                    // InternalDSL.g:386:3: ( rule__Primitive__PrimitiveAssignment_1 )
                    // InternalDSL.g:386:4: rule__Primitive__PrimitiveAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrimitiveAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:390:2: ( ( rule__Primitive__PrimitiveAssignment_2 ) )
                    {
                    // InternalDSL.g:390:2: ( ( rule__Primitive__PrimitiveAssignment_2 ) )
                    // InternalDSL.g:391:3: ( rule__Primitive__PrimitiveAssignment_2 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_2()); 
                    // InternalDSL.g:392:3: ( rule__Primitive__PrimitiveAssignment_2 )
                    // InternalDSL.g:392:4: rule__Primitive__PrimitiveAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrimitiveAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:396:2: ( ( rule__Primitive__PrimitiveAssignment_3 ) )
                    {
                    // InternalDSL.g:396:2: ( ( rule__Primitive__PrimitiveAssignment_3 ) )
                    // InternalDSL.g:397:3: ( rule__Primitive__PrimitiveAssignment_3 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_3()); 
                    // InternalDSL.g:398:3: ( rule__Primitive__PrimitiveAssignment_3 )
                    // InternalDSL.g:398:4: rule__Primitive__PrimitiveAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrimitiveAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:402:2: ( ( rule__Primitive__PrimitiveAssignment_4 ) )
                    {
                    // InternalDSL.g:402:2: ( ( rule__Primitive__PrimitiveAssignment_4 ) )
                    // InternalDSL.g:403:3: ( rule__Primitive__PrimitiveAssignment_4 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_4()); 
                    // InternalDSL.g:404:3: ( rule__Primitive__PrimitiveAssignment_4 )
                    // InternalDSL.g:404:4: rule__Primitive__PrimitiveAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrimitiveAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:408:2: ( ( rule__Primitive__PrimitiveAssignment_5 ) )
                    {
                    // InternalDSL.g:408:2: ( ( rule__Primitive__PrimitiveAssignment_5 ) )
                    // InternalDSL.g:409:3: ( rule__Primitive__PrimitiveAssignment_5 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_5()); 
                    // InternalDSL.g:410:3: ( rule__Primitive__PrimitiveAssignment_5 )
                    // InternalDSL.g:410:4: rule__Primitive__PrimitiveAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__PrimitiveAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getPrimitiveAssignment_5()); 

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


    // $ANTLR start "rule__Column__Alternatives"
    // InternalDSL.g:418:1: rule__Column__Alternatives : ( ( ( rule__Column__Group_0__0 ) ) | ( ( rule__Column__Group_1__0 ) ) | ( ( rule__Column__Group_2__0 ) ) );
    public final void rule__Column__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:422:1: ( ( ( rule__Column__Group_0__0 ) ) | ( ( rule__Column__Group_1__0 ) ) | ( ( rule__Column__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:423:2: ( ( rule__Column__Group_0__0 ) )
                    {
                    // InternalDSL.g:423:2: ( ( rule__Column__Group_0__0 ) )
                    // InternalDSL.g:424:3: ( rule__Column__Group_0__0 )
                    {
                     before(grammarAccess.getColumnAccess().getGroup_0()); 
                    // InternalDSL.g:425:3: ( rule__Column__Group_0__0 )
                    // InternalDSL.g:425:4: rule__Column__Group_0__0
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
                    // InternalDSL.g:429:2: ( ( rule__Column__Group_1__0 ) )
                    {
                    // InternalDSL.g:429:2: ( ( rule__Column__Group_1__0 ) )
                    // InternalDSL.g:430:3: ( rule__Column__Group_1__0 )
                    {
                     before(grammarAccess.getColumnAccess().getGroup_1()); 
                    // InternalDSL.g:431:3: ( rule__Column__Group_1__0 )
                    // InternalDSL.g:431:4: rule__Column__Group_1__0
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
                    // InternalDSL.g:435:2: ( ( rule__Column__Group_2__0 ) )
                    {
                    // InternalDSL.g:435:2: ( ( rule__Column__Group_2__0 ) )
                    // InternalDSL.g:436:3: ( rule__Column__Group_2__0 )
                    {
                     before(grammarAccess.getColumnAccess().getGroup_2()); 
                    // InternalDSL.g:437:3: ( rule__Column__Group_2__0 )
                    // InternalDSL.g:437:4: rule__Column__Group_2__0
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
    // InternalDSL.g:445:1: rule__Strategy_choose__Alternatives : ( ( ( rule__Strategy_choose__Group_0__0 ) ) | ( ( rule__Strategy_choose__Group_1__0 ) ) );
    public final void rule__Strategy_choose__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:449:1: ( ( ( rule__Strategy_choose__Group_0__0 ) ) | ( ( rule__Strategy_choose__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:450:2: ( ( rule__Strategy_choose__Group_0__0 ) )
                    {
                    // InternalDSL.g:450:2: ( ( rule__Strategy_choose__Group_0__0 ) )
                    // InternalDSL.g:451:3: ( rule__Strategy_choose__Group_0__0 )
                    {
                     before(grammarAccess.getStrategy_chooseAccess().getGroup_0()); 
                    // InternalDSL.g:452:3: ( rule__Strategy_choose__Group_0__0 )
                    // InternalDSL.g:452:4: rule__Strategy_choose__Group_0__0
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
                    // InternalDSL.g:456:2: ( ( rule__Strategy_choose__Group_1__0 ) )
                    {
                    // InternalDSL.g:456:2: ( ( rule__Strategy_choose__Group_1__0 ) )
                    // InternalDSL.g:457:3: ( rule__Strategy_choose__Group_1__0 )
                    {
                     before(grammarAccess.getStrategy_chooseAccess().getGroup_1()); 
                    // InternalDSL.g:458:3: ( rule__Strategy_choose__Group_1__0 )
                    // InternalDSL.g:458:4: rule__Strategy_choose__Group_1__0
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalDSL.g:466:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__ExprAssignment_1 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:470:1: ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__ExprAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||LA5_2==15) ) {
                    alt5=1;
                }
                else if ( (LA5_2==24) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:471:2: ( ( rule__Expression__ExprAssignment_0 ) )
                    {
                    // InternalDSL.g:471:2: ( ( rule__Expression__ExprAssignment_0 ) )
                    // InternalDSL.g:472:3: ( rule__Expression__ExprAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getExprAssignment_0()); 
                    // InternalDSL.g:473:3: ( rule__Expression__ExprAssignment_0 )
                    // InternalDSL.g:473:4: rule__Expression__ExprAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ExprAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:477:2: ( ( rule__Expression__ExprAssignment_1 ) )
                    {
                    // InternalDSL.g:477:2: ( ( rule__Expression__ExprAssignment_1 ) )
                    // InternalDSL.g:478:3: ( rule__Expression__ExprAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getExprAssignment_1()); 
                    // InternalDSL.g:479:3: ( rule__Expression__ExprAssignment_1 )
                    // InternalDSL.g:479:4: rule__Expression__ExprAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ExprAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExprAssignment_1()); 

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


    // $ANTLR start "rule__Assign__Alternatives"
    // InternalDSL.g:487:1: rule__Assign__Alternatives : ( ( ( rule__Assign__Group_0__0 ) ) | ( ( rule__Assign__Group_1__0 ) ) );
    public final void rule__Assign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:1: ( ( ( rule__Assign__Group_0__0 ) ) | ( ( rule__Assign__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==24) ) {
                    int LA6_2 = input.LA(3);

                    if ( ((LA6_2>=16 && LA6_2<=23)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_2>=RULE_INT && LA6_2<=RULE_STRING)||LA6_2==RULE_ID) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
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
                    // InternalDSL.g:492:2: ( ( rule__Assign__Group_0__0 ) )
                    {
                    // InternalDSL.g:492:2: ( ( rule__Assign__Group_0__0 ) )
                    // InternalDSL.g:493:3: ( rule__Assign__Group_0__0 )
                    {
                     before(grammarAccess.getAssignAccess().getGroup_0()); 
                    // InternalDSL.g:494:3: ( rule__Assign__Group_0__0 )
                    // InternalDSL.g:494:4: rule__Assign__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assign__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:498:2: ( ( rule__Assign__Group_1__0 ) )
                    {
                    // InternalDSL.g:498:2: ( ( rule__Assign__Group_1__0 ) )
                    // InternalDSL.g:499:3: ( rule__Assign__Group_1__0 )
                    {
                     before(grammarAccess.getAssignAccess().getGroup_1()); 
                    // InternalDSL.g:500:3: ( rule__Assign__Group_1__0 )
                    // InternalDSL.g:500:4: rule__Assign__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assign__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Assign__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalDSL.g:508:1: rule__Constant__Alternatives : ( ( ( rule__Constant__ValIntAssignment_0 ) ) | ( ( rule__Constant__ValDoubleAssignment_1 ) ) | ( ( rule__Constant__ValStringAssignment_2 ) ) | ( ( rule__Constant__ValIDAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:512:1: ( ( ( rule__Constant__ValIntAssignment_0 ) ) | ( ( rule__Constant__ValDoubleAssignment_1 ) ) | ( ( rule__Constant__ValStringAssignment_2 ) ) | ( ( rule__Constant__ValIDAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:513:2: ( ( rule__Constant__ValIntAssignment_0 ) )
                    {
                    // InternalDSL.g:513:2: ( ( rule__Constant__ValIntAssignment_0 ) )
                    // InternalDSL.g:514:3: ( rule__Constant__ValIntAssignment_0 )
                    {
                     before(grammarAccess.getConstantAccess().getValIntAssignment_0()); 
                    // InternalDSL.g:515:3: ( rule__Constant__ValIntAssignment_0 )
                    // InternalDSL.g:515:4: rule__Constant__ValIntAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ValIntAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getValIntAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:519:2: ( ( rule__Constant__ValDoubleAssignment_1 ) )
                    {
                    // InternalDSL.g:519:2: ( ( rule__Constant__ValDoubleAssignment_1 ) )
                    // InternalDSL.g:520:3: ( rule__Constant__ValDoubleAssignment_1 )
                    {
                     before(grammarAccess.getConstantAccess().getValDoubleAssignment_1()); 
                    // InternalDSL.g:521:3: ( rule__Constant__ValDoubleAssignment_1 )
                    // InternalDSL.g:521:4: rule__Constant__ValDoubleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ValDoubleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getValDoubleAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:525:2: ( ( rule__Constant__ValStringAssignment_2 ) )
                    {
                    // InternalDSL.g:525:2: ( ( rule__Constant__ValStringAssignment_2 ) )
                    // InternalDSL.g:526:3: ( rule__Constant__ValStringAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getValStringAssignment_2()); 
                    // InternalDSL.g:527:3: ( rule__Constant__ValStringAssignment_2 )
                    // InternalDSL.g:527:4: rule__Constant__ValStringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ValStringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getValStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:531:2: ( ( rule__Constant__ValIDAssignment_3 ) )
                    {
                    // InternalDSL.g:531:2: ( ( rule__Constant__ValIDAssignment_3 ) )
                    // InternalDSL.g:532:3: ( rule__Constant__ValIDAssignment_3 )
                    {
                     before(grammarAccess.getConstantAccess().getValIDAssignment_3()); 
                    // InternalDSL.g:533:3: ( rule__Constant__ValIDAssignment_3 )
                    // InternalDSL.g:533:4: rule__Constant__ValIDAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ValIDAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getValIDAssignment_3()); 

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


    // $ANTLR start "rule__ML__Group__0"
    // InternalDSL.g:541:1: rule__ML__Group__0 : rule__ML__Group__0__Impl rule__ML__Group__1 ;
    public final void rule__ML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:545:1: ( rule__ML__Group__0__Impl rule__ML__Group__1 )
            // InternalDSL.g:546:2: rule__ML__Group__0__Impl rule__ML__Group__1
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
    // InternalDSL.g:553:1: rule__ML__Group__0__Impl : ( ( rule__ML__Group_0__0 )* ) ;
    public final void rule__ML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:557:1: ( ( ( rule__ML__Group_0__0 )* ) )
            // InternalDSL.g:558:1: ( ( rule__ML__Group_0__0 )* )
            {
            // InternalDSL.g:558:1: ( ( rule__ML__Group_0__0 )* )
            // InternalDSL.g:559:2: ( rule__ML__Group_0__0 )*
            {
             before(grammarAccess.getMLAccess().getGroup_0()); 
            // InternalDSL.g:560:2: ( rule__ML__Group_0__0 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:560:3: rule__ML__Group_0__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ML__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMLAccess().getGroup_0()); 

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
    // InternalDSL.g:568:1: rule__ML__Group__1 : rule__ML__Group__1__Impl ;
    public final void rule__ML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:572:1: ( rule__ML__Group__1__Impl )
            // InternalDSL.g:573:2: rule__ML__Group__1__Impl
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
    // InternalDSL.g:579:1: rule__ML__Group__1__Impl : ( ( rule__ML__StatementsAssignment_1 ) ) ;
    public final void rule__ML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:583:1: ( ( ( rule__ML__StatementsAssignment_1 ) ) )
            // InternalDSL.g:584:1: ( ( rule__ML__StatementsAssignment_1 ) )
            {
            // InternalDSL.g:584:1: ( ( rule__ML__StatementsAssignment_1 ) )
            // InternalDSL.g:585:2: ( rule__ML__StatementsAssignment_1 )
            {
             before(grammarAccess.getMLAccess().getStatementsAssignment_1()); 
            // InternalDSL.g:586:2: ( rule__ML__StatementsAssignment_1 )
            // InternalDSL.g:586:3: rule__ML__StatementsAssignment_1
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


    // $ANTLR start "rule__ML__Group_0__0"
    // InternalDSL.g:595:1: rule__ML__Group_0__0 : rule__ML__Group_0__0__Impl rule__ML__Group_0__1 ;
    public final void rule__ML__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:599:1: ( rule__ML__Group_0__0__Impl rule__ML__Group_0__1 )
            // InternalDSL.g:600:2: rule__ML__Group_0__0__Impl rule__ML__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ML__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML__Group_0__1();

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
    // $ANTLR end "rule__ML__Group_0__0"


    // $ANTLR start "rule__ML__Group_0__0__Impl"
    // InternalDSL.g:607:1: rule__ML__Group_0__0__Impl : ( ( rule__ML__StatementsAssignment_0_0 ) ) ;
    public final void rule__ML__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:611:1: ( ( ( rule__ML__StatementsAssignment_0_0 ) ) )
            // InternalDSL.g:612:1: ( ( rule__ML__StatementsAssignment_0_0 ) )
            {
            // InternalDSL.g:612:1: ( ( rule__ML__StatementsAssignment_0_0 ) )
            // InternalDSL.g:613:2: ( rule__ML__StatementsAssignment_0_0 )
            {
             before(grammarAccess.getMLAccess().getStatementsAssignment_0_0()); 
            // InternalDSL.g:614:2: ( rule__ML__StatementsAssignment_0_0 )
            // InternalDSL.g:614:3: rule__ML__StatementsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ML__StatementsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMLAccess().getStatementsAssignment_0_0()); 

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
    // $ANTLR end "rule__ML__Group_0__0__Impl"


    // $ANTLR start "rule__ML__Group_0__1"
    // InternalDSL.g:622:1: rule__ML__Group_0__1 : rule__ML__Group_0__1__Impl ;
    public final void rule__ML__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:626:1: ( rule__ML__Group_0__1__Impl )
            // InternalDSL.g:627:2: rule__ML__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ML__Group_0__1__Impl();

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
    // $ANTLR end "rule__ML__Group_0__1"


    // $ANTLR start "rule__ML__Group_0__1__Impl"
    // InternalDSL.g:633:1: rule__ML__Group_0__1__Impl : ( '\\n' ) ;
    public final void rule__ML__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:637:1: ( ( '\\n' ) )
            // InternalDSL.g:638:1: ( '\\n' )
            {
            // InternalDSL.g:638:1: ( '\\n' )
            // InternalDSL.g:639:2: '\\n'
            {
             before(grammarAccess.getMLAccess().getLineFeedKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMLAccess().getLineFeedKeyword_0_1()); 

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
    // $ANTLR end "rule__ML__Group_0__1__Impl"


    // $ANTLR start "rule__Use_Metric__Group__0"
    // InternalDSL.g:649:1: rule__Use_Metric__Group__0 : rule__Use_Metric__Group__0__Impl rule__Use_Metric__Group__1 ;
    public final void rule__Use_Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:653:1: ( rule__Use_Metric__Group__0__Impl rule__Use_Metric__Group__1 )
            // InternalDSL.g:654:2: rule__Use_Metric__Group__0__Impl rule__Use_Metric__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:661:1: rule__Use_Metric__Group__0__Impl : ( 'use_metric' ) ;
    public final void rule__Use_Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:665:1: ( ( 'use_metric' ) )
            // InternalDSL.g:666:1: ( 'use_metric' )
            {
            // InternalDSL.g:666:1: ( 'use_metric' )
            // InternalDSL.g:667:2: 'use_metric'
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
    // InternalDSL.g:676:1: rule__Use_Metric__Group__1 : rule__Use_Metric__Group__1__Impl ;
    public final void rule__Use_Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:680:1: ( rule__Use_Metric__Group__1__Impl )
            // InternalDSL.g:681:2: rule__Use_Metric__Group__1__Impl
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
    // InternalDSL.g:687:1: rule__Use_Metric__Group__1__Impl : ( ( rule__Use_Metric__MetricAssignment_1 ) ) ;
    public final void rule__Use_Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:1: ( ( ( rule__Use_Metric__MetricAssignment_1 ) ) )
            // InternalDSL.g:692:1: ( ( rule__Use_Metric__MetricAssignment_1 ) )
            {
            // InternalDSL.g:692:1: ( ( rule__Use_Metric__MetricAssignment_1 ) )
            // InternalDSL.g:693:2: ( rule__Use_Metric__MetricAssignment_1 )
            {
             before(grammarAccess.getUse_MetricAccess().getMetricAssignment_1()); 
            // InternalDSL.g:694:2: ( rule__Use_Metric__MetricAssignment_1 )
            // InternalDSL.g:694:3: rule__Use_Metric__MetricAssignment_1
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
    // InternalDSL.g:703:1: rule__Column__Group_0__0 : rule__Column__Group_0__0__Impl rule__Column__Group_0__1 ;
    public final void rule__Column__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:707:1: ( rule__Column__Group_0__0__Impl rule__Column__Group_0__1 )
            // InternalDSL.g:708:2: rule__Column__Group_0__0__Impl rule__Column__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:715:1: rule__Column__Group_0__0__Impl : ( 'use_column' ) ;
    public final void rule__Column__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:719:1: ( ( 'use_column' ) )
            // InternalDSL.g:720:1: ( 'use_column' )
            {
            // InternalDSL.g:720:1: ( 'use_column' )
            // InternalDSL.g:721:2: 'use_column'
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
    // InternalDSL.g:730:1: rule__Column__Group_0__1 : rule__Column__Group_0__1__Impl ;
    public final void rule__Column__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:734:1: ( rule__Column__Group_0__1__Impl )
            // InternalDSL.g:735:2: rule__Column__Group_0__1__Impl
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
    // InternalDSL.g:741:1: rule__Column__Group_0__1__Impl : ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) ) ;
    public final void rule__Column__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:745:1: ( ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) ) )
            // InternalDSL.g:746:1: ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) )
            {
            // InternalDSL.g:746:1: ( ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* ) )
            // InternalDSL.g:747:2: ( ( rule__Column__UseAssignment_0_1 ) ) ( ( rule__Column__UseAssignment_0_1 )* )
            {
            // InternalDSL.g:747:2: ( ( rule__Column__UseAssignment_0_1 ) )
            // InternalDSL.g:748:3: ( rule__Column__UseAssignment_0_1 )
            {
             before(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 
            // InternalDSL.g:749:3: ( rule__Column__UseAssignment_0_1 )
            // InternalDSL.g:749:4: rule__Column__UseAssignment_0_1
            {
            pushFollow(FOLLOW_8);
            rule__Column__UseAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 

            }

            // InternalDSL.g:752:2: ( ( rule__Column__UseAssignment_0_1 )* )
            // InternalDSL.g:753:3: ( rule__Column__UseAssignment_0_1 )*
            {
             before(grammarAccess.getColumnAccess().getUseAssignment_0_1()); 
            // InternalDSL.g:754:3: ( rule__Column__UseAssignment_0_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:754:4: rule__Column__UseAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Column__UseAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDSL.g:764:1: rule__Column__Group_1__0 : rule__Column__Group_1__0__Impl rule__Column__Group_1__1 ;
    public final void rule__Column__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:768:1: ( rule__Column__Group_1__0__Impl rule__Column__Group_1__1 )
            // InternalDSL.g:769:2: rule__Column__Group_1__0__Impl rule__Column__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:776:1: rule__Column__Group_1__0__Impl : ( 'unuse_column' ) ;
    public final void rule__Column__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:780:1: ( ( 'unuse_column' ) )
            // InternalDSL.g:781:1: ( 'unuse_column' )
            {
            // InternalDSL.g:781:1: ( 'unuse_column' )
            // InternalDSL.g:782:2: 'unuse_column'
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
    // InternalDSL.g:791:1: rule__Column__Group_1__1 : rule__Column__Group_1__1__Impl ;
    public final void rule__Column__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:795:1: ( rule__Column__Group_1__1__Impl )
            // InternalDSL.g:796:2: rule__Column__Group_1__1__Impl
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
    // InternalDSL.g:802:1: rule__Column__Group_1__1__Impl : ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) ) ;
    public final void rule__Column__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:806:1: ( ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) ) )
            // InternalDSL.g:807:1: ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) )
            {
            // InternalDSL.g:807:1: ( ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* ) )
            // InternalDSL.g:808:2: ( ( rule__Column__UnuseAssignment_1_1 ) ) ( ( rule__Column__UnuseAssignment_1_1 )* )
            {
            // InternalDSL.g:808:2: ( ( rule__Column__UnuseAssignment_1_1 ) )
            // InternalDSL.g:809:3: ( rule__Column__UnuseAssignment_1_1 )
            {
             before(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 
            // InternalDSL.g:810:3: ( rule__Column__UnuseAssignment_1_1 )
            // InternalDSL.g:810:4: rule__Column__UnuseAssignment_1_1
            {
            pushFollow(FOLLOW_8);
            rule__Column__UnuseAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 

            }

            // InternalDSL.g:813:2: ( ( rule__Column__UnuseAssignment_1_1 )* )
            // InternalDSL.g:814:3: ( rule__Column__UnuseAssignment_1_1 )*
            {
             before(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); 
            // InternalDSL.g:815:3: ( rule__Column__UnuseAssignment_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:815:4: rule__Column__UnuseAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Column__UnuseAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDSL.g:825:1: rule__Column__Group_2__0 : rule__Column__Group_2__0__Impl rule__Column__Group_2__1 ;
    public final void rule__Column__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:829:1: ( rule__Column__Group_2__0__Impl rule__Column__Group_2__1 )
            // InternalDSL.g:830:2: rule__Column__Group_2__0__Impl rule__Column__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:837:1: rule__Column__Group_2__0__Impl : ( 'predict_column' ) ;
    public final void rule__Column__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:841:1: ( ( 'predict_column' ) )
            // InternalDSL.g:842:1: ( 'predict_column' )
            {
            // InternalDSL.g:842:1: ( 'predict_column' )
            // InternalDSL.g:843:2: 'predict_column'
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
    // InternalDSL.g:852:1: rule__Column__Group_2__1 : rule__Column__Group_2__1__Impl ;
    public final void rule__Column__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:856:1: ( rule__Column__Group_2__1__Impl )
            // InternalDSL.g:857:2: rule__Column__Group_2__1__Impl
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
    // InternalDSL.g:863:1: rule__Column__Group_2__1__Impl : ( ( rule__Column__PredictAssignment_2_1 ) ) ;
    public final void rule__Column__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:867:1: ( ( ( rule__Column__PredictAssignment_2_1 ) ) )
            // InternalDSL.g:868:1: ( ( rule__Column__PredictAssignment_2_1 ) )
            {
            // InternalDSL.g:868:1: ( ( rule__Column__PredictAssignment_2_1 ) )
            // InternalDSL.g:869:2: ( rule__Column__PredictAssignment_2_1 )
            {
             before(grammarAccess.getColumnAccess().getPredictAssignment_2_1()); 
            // InternalDSL.g:870:2: ( rule__Column__PredictAssignment_2_1 )
            // InternalDSL.g:870:3: rule__Column__PredictAssignment_2_1
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
    // InternalDSL.g:879:1: rule__Strategy_choose__Group_0__0 : rule__Strategy_choose__Group_0__0__Impl rule__Strategy_choose__Group_0__1 ;
    public final void rule__Strategy_choose__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:883:1: ( rule__Strategy_choose__Group_0__0__Impl rule__Strategy_choose__Group_0__1 )
            // InternalDSL.g:884:2: rule__Strategy_choose__Group_0__0__Impl rule__Strategy_choose__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:891:1: rule__Strategy_choose__Group_0__0__Impl : ( 'use_strategy' ) ;
    public final void rule__Strategy_choose__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:895:1: ( ( 'use_strategy' ) )
            // InternalDSL.g:896:1: ( 'use_strategy' )
            {
            // InternalDSL.g:896:1: ( 'use_strategy' )
            // InternalDSL.g:897:2: 'use_strategy'
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
    // InternalDSL.g:906:1: rule__Strategy_choose__Group_0__1 : rule__Strategy_choose__Group_0__1__Impl rule__Strategy_choose__Group_0__2 ;
    public final void rule__Strategy_choose__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:910:1: ( rule__Strategy_choose__Group_0__1__Impl rule__Strategy_choose__Group_0__2 )
            // InternalDSL.g:911:2: rule__Strategy_choose__Group_0__1__Impl rule__Strategy_choose__Group_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:918:1: rule__Strategy_choose__Group_0__1__Impl : ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) ) ;
    public final void rule__Strategy_choose__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:922:1: ( ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) ) )
            // InternalDSL.g:923:1: ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) )
            {
            // InternalDSL.g:923:1: ( ( rule__Strategy_choose__StrategyAssignment_0_1 ) )
            // InternalDSL.g:924:2: ( rule__Strategy_choose__StrategyAssignment_0_1 )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_0_1()); 
            // InternalDSL.g:925:2: ( rule__Strategy_choose__StrategyAssignment_0_1 )
            // InternalDSL.g:925:3: rule__Strategy_choose__StrategyAssignment_0_1
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
    // InternalDSL.g:933:1: rule__Strategy_choose__Group_0__2 : rule__Strategy_choose__Group_0__2__Impl ;
    public final void rule__Strategy_choose__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:937:1: ( rule__Strategy_choose__Group_0__2__Impl )
            // InternalDSL.g:938:2: rule__Strategy_choose__Group_0__2__Impl
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
    // InternalDSL.g:944:1: rule__Strategy_choose__Group_0__2__Impl : ( ( rule__Strategy_choose__RatioAssignment_0_2 ) ) ;
    public final void rule__Strategy_choose__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:948:1: ( ( ( rule__Strategy_choose__RatioAssignment_0_2 ) ) )
            // InternalDSL.g:949:1: ( ( rule__Strategy_choose__RatioAssignment_0_2 ) )
            {
            // InternalDSL.g:949:1: ( ( rule__Strategy_choose__RatioAssignment_0_2 ) )
            // InternalDSL.g:950:2: ( rule__Strategy_choose__RatioAssignment_0_2 )
            {
             before(grammarAccess.getStrategy_chooseAccess().getRatioAssignment_0_2()); 
            // InternalDSL.g:951:2: ( rule__Strategy_choose__RatioAssignment_0_2 )
            // InternalDSL.g:951:3: rule__Strategy_choose__RatioAssignment_0_2
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
    // InternalDSL.g:960:1: rule__Strategy_choose__Group_1__0 : rule__Strategy_choose__Group_1__0__Impl rule__Strategy_choose__Group_1__1 ;
    public final void rule__Strategy_choose__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:964:1: ( rule__Strategy_choose__Group_1__0__Impl rule__Strategy_choose__Group_1__1 )
            // InternalDSL.g:965:2: rule__Strategy_choose__Group_1__0__Impl rule__Strategy_choose__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSL.g:972:1: rule__Strategy_choose__Group_1__0__Impl : ( 'use_strategy' ) ;
    public final void rule__Strategy_choose__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:976:1: ( ( 'use_strategy' ) )
            // InternalDSL.g:977:1: ( 'use_strategy' )
            {
            // InternalDSL.g:977:1: ( 'use_strategy' )
            // InternalDSL.g:978:2: 'use_strategy'
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
    // InternalDSL.g:987:1: rule__Strategy_choose__Group_1__1 : rule__Strategy_choose__Group_1__1__Impl rule__Strategy_choose__Group_1__2 ;
    public final void rule__Strategy_choose__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:991:1: ( rule__Strategy_choose__Group_1__1__Impl rule__Strategy_choose__Group_1__2 )
            // InternalDSL.g:992:2: rule__Strategy_choose__Group_1__1__Impl rule__Strategy_choose__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDSL.g:999:1: rule__Strategy_choose__Group_1__1__Impl : ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) ) ;
    public final void rule__Strategy_choose__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1003:1: ( ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) ) )
            // InternalDSL.g:1004:1: ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) )
            {
            // InternalDSL.g:1004:1: ( ( rule__Strategy_choose__StrategyAssignment_1_1 ) )
            // InternalDSL.g:1005:2: ( rule__Strategy_choose__StrategyAssignment_1_1 )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_1_1()); 
            // InternalDSL.g:1006:2: ( rule__Strategy_choose__StrategyAssignment_1_1 )
            // InternalDSL.g:1006:3: rule__Strategy_choose__StrategyAssignment_1_1
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
    // InternalDSL.g:1014:1: rule__Strategy_choose__Group_1__2 : rule__Strategy_choose__Group_1__2__Impl ;
    public final void rule__Strategy_choose__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1018:1: ( rule__Strategy_choose__Group_1__2__Impl )
            // InternalDSL.g:1019:2: rule__Strategy_choose__Group_1__2__Impl
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
    // InternalDSL.g:1025:1: rule__Strategy_choose__Group_1__2__Impl : ( ( rule__Strategy_choose__NbAssignment_1_2 )? ) ;
    public final void rule__Strategy_choose__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1029:1: ( ( ( rule__Strategy_choose__NbAssignment_1_2 )? ) )
            // InternalDSL.g:1030:1: ( ( rule__Strategy_choose__NbAssignment_1_2 )? )
            {
            // InternalDSL.g:1030:1: ( ( rule__Strategy_choose__NbAssignment_1_2 )? )
            // InternalDSL.g:1031:2: ( rule__Strategy_choose__NbAssignment_1_2 )?
            {
             before(grammarAccess.getStrategy_chooseAccess().getNbAssignment_1_2()); 
            // InternalDSL.g:1032:2: ( rule__Strategy_choose__NbAssignment_1_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1032:3: rule__Strategy_choose__NbAssignment_1_2
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
    // InternalDSL.g:1041:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1045:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalDSL.g:1046:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDSL.g:1053:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1057:1: ( ( 'read' ) )
            // InternalDSL.g:1058:1: ( 'read' )
            {
            // InternalDSL.g:1058:1: ( 'read' )
            // InternalDSL.g:1059:2: 'read'
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
    // InternalDSL.g:1068:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1072:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalDSL.g:1073:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSL.g:1080:1: rule__Read__Group__1__Impl : ( ( rule__Read__PathAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1084:1: ( ( ( rule__Read__PathAssignment_1 ) ) )
            // InternalDSL.g:1085:1: ( ( rule__Read__PathAssignment_1 ) )
            {
            // InternalDSL.g:1085:1: ( ( rule__Read__PathAssignment_1 ) )
            // InternalDSL.g:1086:2: ( rule__Read__PathAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getPathAssignment_1()); 
            // InternalDSL.g:1087:2: ( rule__Read__PathAssignment_1 )
            // InternalDSL.g:1087:3: rule__Read__PathAssignment_1
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
    // InternalDSL.g:1095:1: rule__Read__Group__2 : rule__Read__Group__2__Impl ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1099:1: ( rule__Read__Group__2__Impl )
            // InternalDSL.g:1100:2: rule__Read__Group__2__Impl
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
    // InternalDSL.g:1106:1: rule__Read__Group__2__Impl : ( ( rule__Read__SeparatorAssignment_2 )? ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1110:1: ( ( ( rule__Read__SeparatorAssignment_2 )? ) )
            // InternalDSL.g:1111:1: ( ( rule__Read__SeparatorAssignment_2 )? )
            {
            // InternalDSL.g:1111:1: ( ( rule__Read__SeparatorAssignment_2 )? )
            // InternalDSL.g:1112:2: ( rule__Read__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getReadAccess().getSeparatorAssignment_2()); 
            // InternalDSL.g:1113:2: ( rule__Read__SeparatorAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SEP) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1113:3: rule__Read__SeparatorAssignment_2
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
    // InternalDSL.g:1122:1: rule__Algo_choose__Group__0 : rule__Algo_choose__Group__0__Impl rule__Algo_choose__Group__1 ;
    public final void rule__Algo_choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1126:1: ( rule__Algo_choose__Group__0__Impl rule__Algo_choose__Group__1 )
            // InternalDSL.g:1127:2: rule__Algo_choose__Group__0__Impl rule__Algo_choose__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDSL.g:1134:1: rule__Algo_choose__Group__0__Impl : ( 'use_algorithm' ) ;
    public final void rule__Algo_choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1138:1: ( ( 'use_algorithm' ) )
            // InternalDSL.g:1139:1: ( 'use_algorithm' )
            {
            // InternalDSL.g:1139:1: ( 'use_algorithm' )
            // InternalDSL.g:1140:2: 'use_algorithm'
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
    // InternalDSL.g:1149:1: rule__Algo_choose__Group__1 : rule__Algo_choose__Group__1__Impl ;
    public final void rule__Algo_choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1153:1: ( rule__Algo_choose__Group__1__Impl )
            // InternalDSL.g:1154:2: rule__Algo_choose__Group__1__Impl
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
    // InternalDSL.g:1160:1: rule__Algo_choose__Group__1__Impl : ( ( rule__Algo_choose__AlgorithmAssignment_1 ) ) ;
    public final void rule__Algo_choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1164:1: ( ( ( rule__Algo_choose__AlgorithmAssignment_1 ) ) )
            // InternalDSL.g:1165:1: ( ( rule__Algo_choose__AlgorithmAssignment_1 ) )
            {
            // InternalDSL.g:1165:1: ( ( rule__Algo_choose__AlgorithmAssignment_1 ) )
            // InternalDSL.g:1166:2: ( rule__Algo_choose__AlgorithmAssignment_1 )
            {
             before(grammarAccess.getAlgo_chooseAccess().getAlgorithmAssignment_1()); 
            // InternalDSL.g:1167:2: ( rule__Algo_choose__AlgorithmAssignment_1 )
            // InternalDSL.g:1167:3: rule__Algo_choose__AlgorithmAssignment_1
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
    // InternalDSL.g:1176:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1180:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalDSL.g:1181:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSL.g:1188:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1192:1: ( ( 'print' ) )
            // InternalDSL.g:1193:1: ( 'print' )
            {
            // InternalDSL.g:1193:1: ( 'print' )
            // InternalDSL.g:1194:2: 'print'
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
    // InternalDSL.g:1203:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1207:1: ( rule__Print__Group__1__Impl )
            // InternalDSL.g:1208:2: rule__Print__Group__1__Impl
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
    // InternalDSL.g:1214:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1218:1: ( ( ( rule__Print__ValAssignment_1 ) ) )
            // InternalDSL.g:1219:1: ( ( rule__Print__ValAssignment_1 ) )
            {
            // InternalDSL.g:1219:1: ( ( rule__Print__ValAssignment_1 ) )
            // InternalDSL.g:1220:2: ( rule__Print__ValAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValAssignment_1()); 
            // InternalDSL.g:1221:2: ( rule__Print__ValAssignment_1 )
            // InternalDSL.g:1221:3: rule__Print__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getValAssignment_1()); 

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


    // $ANTLR start "rule__Assign__Group_0__0"
    // InternalDSL.g:1230:1: rule__Assign__Group_0__0 : rule__Assign__Group_0__0__Impl rule__Assign__Group_0__1 ;
    public final void rule__Assign__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1234:1: ( rule__Assign__Group_0__0__Impl rule__Assign__Group_0__1 )
            // InternalDSL.g:1235:2: rule__Assign__Group_0__0__Impl rule__Assign__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Assign__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assign__Group_0__1();

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
    // $ANTLR end "rule__Assign__Group_0__0"


    // $ANTLR start "rule__Assign__Group_0__0__Impl"
    // InternalDSL.g:1242:1: rule__Assign__Group_0__0__Impl : ( ( rule__Assign__VarnameAssignment_0_0 ) ) ;
    public final void rule__Assign__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1246:1: ( ( ( rule__Assign__VarnameAssignment_0_0 ) ) )
            // InternalDSL.g:1247:1: ( ( rule__Assign__VarnameAssignment_0_0 ) )
            {
            // InternalDSL.g:1247:1: ( ( rule__Assign__VarnameAssignment_0_0 ) )
            // InternalDSL.g:1248:2: ( rule__Assign__VarnameAssignment_0_0 )
            {
             before(grammarAccess.getAssignAccess().getVarnameAssignment_0_0()); 
            // InternalDSL.g:1249:2: ( rule__Assign__VarnameAssignment_0_0 )
            // InternalDSL.g:1249:3: rule__Assign__VarnameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assign__VarnameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getVarnameAssignment_0_0()); 

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
    // $ANTLR end "rule__Assign__Group_0__0__Impl"


    // $ANTLR start "rule__Assign__Group_0__1"
    // InternalDSL.g:1257:1: rule__Assign__Group_0__1 : rule__Assign__Group_0__1__Impl rule__Assign__Group_0__2 ;
    public final void rule__Assign__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1261:1: ( rule__Assign__Group_0__1__Impl rule__Assign__Group_0__2 )
            // InternalDSL.g:1262:2: rule__Assign__Group_0__1__Impl rule__Assign__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Assign__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assign__Group_0__2();

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
    // $ANTLR end "rule__Assign__Group_0__1"


    // $ANTLR start "rule__Assign__Group_0__1__Impl"
    // InternalDSL.g:1269:1: rule__Assign__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Assign__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1273:1: ( ( '=' ) )
            // InternalDSL.g:1274:1: ( '=' )
            {
            // InternalDSL.g:1274:1: ( '=' )
            // InternalDSL.g:1275:2: '='
            {
             before(grammarAccess.getAssignAccess().getEqualsSignKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssignAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Assign__Group_0__1__Impl"


    // $ANTLR start "rule__Assign__Group_0__2"
    // InternalDSL.g:1284:1: rule__Assign__Group_0__2 : rule__Assign__Group_0__2__Impl ;
    public final void rule__Assign__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1288:1: ( rule__Assign__Group_0__2__Impl )
            // InternalDSL.g:1289:2: rule__Assign__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assign__Group_0__2__Impl();

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
    // $ANTLR end "rule__Assign__Group_0__2"


    // $ANTLR start "rule__Assign__Group_0__2__Impl"
    // InternalDSL.g:1295:1: rule__Assign__Group_0__2__Impl : ( ( rule__Assign__ValAssignment_0_2 ) ) ;
    public final void rule__Assign__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1299:1: ( ( ( rule__Assign__ValAssignment_0_2 ) ) )
            // InternalDSL.g:1300:1: ( ( rule__Assign__ValAssignment_0_2 ) )
            {
            // InternalDSL.g:1300:1: ( ( rule__Assign__ValAssignment_0_2 ) )
            // InternalDSL.g:1301:2: ( rule__Assign__ValAssignment_0_2 )
            {
             before(grammarAccess.getAssignAccess().getValAssignment_0_2()); 
            // InternalDSL.g:1302:2: ( rule__Assign__ValAssignment_0_2 )
            // InternalDSL.g:1302:3: rule__Assign__ValAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Assign__ValAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getValAssignment_0_2()); 

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
    // $ANTLR end "rule__Assign__Group_0__2__Impl"


    // $ANTLR start "rule__Assign__Group_1__0"
    // InternalDSL.g:1311:1: rule__Assign__Group_1__0 : rule__Assign__Group_1__0__Impl rule__Assign__Group_1__1 ;
    public final void rule__Assign__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1315:1: ( rule__Assign__Group_1__0__Impl rule__Assign__Group_1__1 )
            // InternalDSL.g:1316:2: rule__Assign__Group_1__0__Impl rule__Assign__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Assign__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assign__Group_1__1();

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
    // $ANTLR end "rule__Assign__Group_1__0"


    // $ANTLR start "rule__Assign__Group_1__0__Impl"
    // InternalDSL.g:1323:1: rule__Assign__Group_1__0__Impl : ( ( rule__Assign__VarnameAssignment_1_0 ) ) ;
    public final void rule__Assign__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1327:1: ( ( ( rule__Assign__VarnameAssignment_1_0 ) ) )
            // InternalDSL.g:1328:1: ( ( rule__Assign__VarnameAssignment_1_0 ) )
            {
            // InternalDSL.g:1328:1: ( ( rule__Assign__VarnameAssignment_1_0 ) )
            // InternalDSL.g:1329:2: ( rule__Assign__VarnameAssignment_1_0 )
            {
             before(grammarAccess.getAssignAccess().getVarnameAssignment_1_0()); 
            // InternalDSL.g:1330:2: ( rule__Assign__VarnameAssignment_1_0 )
            // InternalDSL.g:1330:3: rule__Assign__VarnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Assign__VarnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getVarnameAssignment_1_0()); 

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
    // $ANTLR end "rule__Assign__Group_1__0__Impl"


    // $ANTLR start "rule__Assign__Group_1__1"
    // InternalDSL.g:1338:1: rule__Assign__Group_1__1 : rule__Assign__Group_1__1__Impl rule__Assign__Group_1__2 ;
    public final void rule__Assign__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1342:1: ( rule__Assign__Group_1__1__Impl rule__Assign__Group_1__2 )
            // InternalDSL.g:1343:2: rule__Assign__Group_1__1__Impl rule__Assign__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Assign__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assign__Group_1__2();

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
    // $ANTLR end "rule__Assign__Group_1__1"


    // $ANTLR start "rule__Assign__Group_1__1__Impl"
    // InternalDSL.g:1350:1: rule__Assign__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Assign__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1354:1: ( ( '=' ) )
            // InternalDSL.g:1355:1: ( '=' )
            {
            // InternalDSL.g:1355:1: ( '=' )
            // InternalDSL.g:1356:2: '='
            {
             before(grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Assign__Group_1__1__Impl"


    // $ANTLR start "rule__Assign__Group_1__2"
    // InternalDSL.g:1365:1: rule__Assign__Group_1__2 : rule__Assign__Group_1__2__Impl ;
    public final void rule__Assign__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1369:1: ( rule__Assign__Group_1__2__Impl )
            // InternalDSL.g:1370:2: rule__Assign__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assign__Group_1__2__Impl();

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
    // $ANTLR end "rule__Assign__Group_1__2"


    // $ANTLR start "rule__Assign__Group_1__2__Impl"
    // InternalDSL.g:1376:1: rule__Assign__Group_1__2__Impl : ( ( rule__Assign__ValAssignment_1_2 ) ) ;
    public final void rule__Assign__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1380:1: ( ( ( rule__Assign__ValAssignment_1_2 ) ) )
            // InternalDSL.g:1381:1: ( ( rule__Assign__ValAssignment_1_2 ) )
            {
            // InternalDSL.g:1381:1: ( ( rule__Assign__ValAssignment_1_2 ) )
            // InternalDSL.g:1382:2: ( rule__Assign__ValAssignment_1_2 )
            {
             before(grammarAccess.getAssignAccess().getValAssignment_1_2()); 
            // InternalDSL.g:1383:2: ( rule__Assign__ValAssignment_1_2 )
            // InternalDSL.g:1383:3: rule__Assign__ValAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Assign__ValAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getValAssignment_1_2()); 

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
    // $ANTLR end "rule__Assign__Group_1__2__Impl"


    // $ANTLR start "rule__ML__StatementsAssignment_0_0"
    // InternalDSL.g:1392:1: rule__ML__StatementsAssignment_0_0 : ( ruleStatement ) ;
    public final void rule__ML__StatementsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1396:1: ( ( ruleStatement ) )
            // InternalDSL.g:1397:2: ( ruleStatement )
            {
            // InternalDSL.g:1397:2: ( ruleStatement )
            // InternalDSL.g:1398:3: ruleStatement
            {
             before(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__ML__StatementsAssignment_0_0"


    // $ANTLR start "rule__ML__StatementsAssignment_1"
    // InternalDSL.g:1407:1: rule__ML__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__ML__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1411:1: ( ( ruleStatement ) )
            // InternalDSL.g:1412:2: ( ruleStatement )
            {
            // InternalDSL.g:1412:2: ( ruleStatement )
            // InternalDSL.g:1413:3: ruleStatement
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


    // $ANTLR start "rule__Statement__StatementAssignment_0"
    // InternalDSL.g:1422:1: rule__Statement__StatementAssignment_0 : ( ruleExpression ) ;
    public final void rule__Statement__StatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1426:1: ( ( ruleExpression ) )
            // InternalDSL.g:1427:2: ( ruleExpression )
            {
            // InternalDSL.g:1427:2: ( ruleExpression )
            // InternalDSL.g:1428:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getStatementExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement__StatementAssignment_0"


    // $ANTLR start "rule__Statement__StatementAssignment_1"
    // InternalDSL.g:1437:1: rule__Statement__StatementAssignment_1 : ( rulePrimitive ) ;
    public final void rule__Statement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1441:1: ( ( rulePrimitive ) )
            // InternalDSL.g:1442:2: ( rulePrimitive )
            {
            // InternalDSL.g:1442:2: ( rulePrimitive )
            // InternalDSL.g:1443:3: rulePrimitive
            {
             before(grammarAccess.getStatementAccess().getStatementPrimitiveParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementPrimitiveParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__StatementAssignment_1"


    // $ANTLR start "rule__Primitive__PrimitiveAssignment_0"
    // InternalDSL.g:1452:1: rule__Primitive__PrimitiveAssignment_0 : ( rulePrint ) ;
    public final void rule__Primitive__PrimitiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1456:1: ( ( rulePrint ) )
            // InternalDSL.g:1457:2: ( rulePrint )
            {
            // InternalDSL.g:1457:2: ( rulePrint )
            // InternalDSL.g:1458:3: rulePrint
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitivePrintParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrimitivePrintParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Primitive__PrimitiveAssignment_0"


    // $ANTLR start "rule__Primitive__PrimitiveAssignment_1"
    // InternalDSL.g:1467:1: rule__Primitive__PrimitiveAssignment_1 : ( ruleAlgo_choose ) ;
    public final void rule__Primitive__PrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1471:1: ( ( ruleAlgo_choose ) )
            // InternalDSL.g:1472:2: ( ruleAlgo_choose )
            {
            // InternalDSL.g:1472:2: ( ruleAlgo_choose )
            // InternalDSL.g:1473:3: ruleAlgo_choose
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveAlgo_chooseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgo_choose();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrimitiveAlgo_chooseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Primitive__PrimitiveAssignment_1"


    // $ANTLR start "rule__Primitive__PrimitiveAssignment_2"
    // InternalDSL.g:1482:1: rule__Primitive__PrimitiveAssignment_2 : ( ruleRead ) ;
    public final void rule__Primitive__PrimitiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1486:1: ( ( ruleRead ) )
            // InternalDSL.g:1487:2: ( ruleRead )
            {
            // InternalDSL.g:1487:2: ( ruleRead )
            // InternalDSL.g:1488:3: ruleRead
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveReadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrimitiveReadParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Primitive__PrimitiveAssignment_2"


    // $ANTLR start "rule__Primitive__PrimitiveAssignment_3"
    // InternalDSL.g:1497:1: rule__Primitive__PrimitiveAssignment_3 : ( ruleStrategy_choose ) ;
    public final void rule__Primitive__PrimitiveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1501:1: ( ( ruleStrategy_choose ) )
            // InternalDSL.g:1502:2: ( ruleStrategy_choose )
            {
            // InternalDSL.g:1502:2: ( ruleStrategy_choose )
            // InternalDSL.g:1503:3: ruleStrategy_choose
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveStrategy_chooseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategy_choose();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrimitiveStrategy_chooseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Primitive__PrimitiveAssignment_3"


    // $ANTLR start "rule__Primitive__PrimitiveAssignment_4"
    // InternalDSL.g:1512:1: rule__Primitive__PrimitiveAssignment_4 : ( ruleColumn ) ;
    public final void rule__Primitive__PrimitiveAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1516:1: ( ( ruleColumn ) )
            // InternalDSL.g:1517:2: ( ruleColumn )
            {
            // InternalDSL.g:1517:2: ( ruleColumn )
            // InternalDSL.g:1518:3: ruleColumn
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveColumnParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrimitiveColumnParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Primitive__PrimitiveAssignment_4"


    // $ANTLR start "rule__Primitive__PrimitiveAssignment_5"
    // InternalDSL.g:1527:1: rule__Primitive__PrimitiveAssignment_5 : ( ruleUse_Metric ) ;
    public final void rule__Primitive__PrimitiveAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1531:1: ( ( ruleUse_Metric ) )
            // InternalDSL.g:1532:2: ( ruleUse_Metric )
            {
            // InternalDSL.g:1532:2: ( ruleUse_Metric )
            // InternalDSL.g:1533:3: ruleUse_Metric
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveUse_MetricParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUse_Metric();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getPrimitiveUse_MetricParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Primitive__PrimitiveAssignment_5"


    // $ANTLR start "rule__Use_Metric__MetricAssignment_1"
    // InternalDSL.g:1542:1: rule__Use_Metric__MetricAssignment_1 : ( RULE_METRIC ) ;
    public final void rule__Use_Metric__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1546:1: ( ( RULE_METRIC ) )
            // InternalDSL.g:1547:2: ( RULE_METRIC )
            {
            // InternalDSL.g:1547:2: ( RULE_METRIC )
            // InternalDSL.g:1548:3: RULE_METRIC
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
    // InternalDSL.g:1557:1: rule__Column__UseAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Column__UseAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1561:1: ( ( RULE_INT ) )
            // InternalDSL.g:1562:2: ( RULE_INT )
            {
            // InternalDSL.g:1562:2: ( RULE_INT )
            // InternalDSL.g:1563:3: RULE_INT
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
    // InternalDSL.g:1572:1: rule__Column__UnuseAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Column__UnuseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1576:1: ( ( RULE_INT ) )
            // InternalDSL.g:1577:2: ( RULE_INT )
            {
            // InternalDSL.g:1577:2: ( RULE_INT )
            // InternalDSL.g:1578:3: RULE_INT
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
    // InternalDSL.g:1587:1: rule__Column__PredictAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Column__PredictAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1591:1: ( ( RULE_INT ) )
            // InternalDSL.g:1592:2: ( RULE_INT )
            {
            // InternalDSL.g:1592:2: ( RULE_INT )
            // InternalDSL.g:1593:3: RULE_INT
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
    // InternalDSL.g:1602:1: rule__Strategy_choose__StrategyAssignment_0_1 : ( ( 'train_test' ) ) ;
    public final void rule__Strategy_choose__StrategyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1606:1: ( ( ( 'train_test' ) ) )
            // InternalDSL.g:1607:2: ( ( 'train_test' ) )
            {
            // InternalDSL.g:1607:2: ( ( 'train_test' ) )
            // InternalDSL.g:1608:3: ( 'train_test' )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); 
            // InternalDSL.g:1609:3: ( 'train_test' )
            // InternalDSL.g:1610:4: 'train_test'
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:1621:1: rule__Strategy_choose__RatioAssignment_0_2 : ( RULE_DOUBLE ) ;
    public final void rule__Strategy_choose__RatioAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1625:1: ( ( RULE_DOUBLE ) )
            // InternalDSL.g:1626:2: ( RULE_DOUBLE )
            {
            // InternalDSL.g:1626:2: ( RULE_DOUBLE )
            // InternalDSL.g:1627:3: RULE_DOUBLE
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
    // InternalDSL.g:1636:1: rule__Strategy_choose__StrategyAssignment_1_1 : ( ( 'cross_valid' ) ) ;
    public final void rule__Strategy_choose__StrategyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1640:1: ( ( ( 'cross_valid' ) ) )
            // InternalDSL.g:1641:2: ( ( 'cross_valid' ) )
            {
            // InternalDSL.g:1641:2: ( ( 'cross_valid' ) )
            // InternalDSL.g:1642:3: ( 'cross_valid' )
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); 
            // InternalDSL.g:1643:3: ( 'cross_valid' )
            // InternalDSL.g:1644:4: 'cross_valid'
            {
             before(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:1655:1: rule__Strategy_choose__NbAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Strategy_choose__NbAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1659:1: ( ( RULE_INT ) )
            // InternalDSL.g:1660:2: ( RULE_INT )
            {
            // InternalDSL.g:1660:2: ( RULE_INT )
            // InternalDSL.g:1661:3: RULE_INT
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
    // InternalDSL.g:1670:1: rule__Read__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Read__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1674:1: ( ( RULE_STRING ) )
            // InternalDSL.g:1675:2: ( RULE_STRING )
            {
            // InternalDSL.g:1675:2: ( RULE_STRING )
            // InternalDSL.g:1676:3: RULE_STRING
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
    // InternalDSL.g:1685:1: rule__Read__SeparatorAssignment_2 : ( RULE_SEP ) ;
    public final void rule__Read__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1689:1: ( ( RULE_SEP ) )
            // InternalDSL.g:1690:2: ( RULE_SEP )
            {
            // InternalDSL.g:1690:2: ( RULE_SEP )
            // InternalDSL.g:1691:3: RULE_SEP
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
    // InternalDSL.g:1700:1: rule__Algo_choose__AlgorithmAssignment_1 : ( RULE_ALGO_NAME ) ;
    public final void rule__Algo_choose__AlgorithmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1704:1: ( ( RULE_ALGO_NAME ) )
            // InternalDSL.g:1705:2: ( RULE_ALGO_NAME )
            {
            // InternalDSL.g:1705:2: ( RULE_ALGO_NAME )
            // InternalDSL.g:1706:3: RULE_ALGO_NAME
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


    // $ANTLR start "rule__Print__ValAssignment_1"
    // InternalDSL.g:1715:1: rule__Print__ValAssignment_1 : ( ruleConstant ) ;
    public final void rule__Print__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1719:1: ( ( ruleConstant ) )
            // InternalDSL.g:1720:2: ( ruleConstant )
            {
            // InternalDSL.g:1720:2: ( ruleConstant )
            // InternalDSL.g:1721:3: ruleConstant
            {
             before(grammarAccess.getPrintAccess().getValConstantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getValConstantParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Print__ValAssignment_1"


    // $ANTLR start "rule__Expression__ExprAssignment_0"
    // InternalDSL.g:1730:1: rule__Expression__ExprAssignment_0 : ( ruleConstant ) ;
    public final void rule__Expression__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1734:1: ( ( ruleConstant ) )
            // InternalDSL.g:1735:2: ( ruleConstant )
            {
            // InternalDSL.g:1735:2: ( ruleConstant )
            // InternalDSL.g:1736:3: ruleConstant
            {
             before(grammarAccess.getExpressionAccess().getExprConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExprConstantParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__ExprAssignment_0"


    // $ANTLR start "rule__Expression__ExprAssignment_1"
    // InternalDSL.g:1745:1: rule__Expression__ExprAssignment_1 : ( ruleAssign ) ;
    public final void rule__Expression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1749:1: ( ( ruleAssign ) )
            // InternalDSL.g:1750:2: ( ruleAssign )
            {
            // InternalDSL.g:1750:2: ( ruleAssign )
            // InternalDSL.g:1751:3: ruleAssign
            {
             before(grammarAccess.getExpressionAccess().getExprAssignParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssign();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExprAssignParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__ExprAssignment_1"


    // $ANTLR start "rule__Assign__VarnameAssignment_0_0"
    // InternalDSL.g:1760:1: rule__Assign__VarnameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Assign__VarnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1764:1: ( ( RULE_ID ) )
            // InternalDSL.g:1765:2: ( RULE_ID )
            {
            // InternalDSL.g:1765:2: ( RULE_ID )
            // InternalDSL.g:1766:3: RULE_ID
            {
             before(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Assign__VarnameAssignment_0_0"


    // $ANTLR start "rule__Assign__ValAssignment_0_2"
    // InternalDSL.g:1775:1: rule__Assign__ValAssignment_0_2 : ( ruleConstant ) ;
    public final void rule__Assign__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1779:1: ( ( ruleConstant ) )
            // InternalDSL.g:1780:2: ( ruleConstant )
            {
            // InternalDSL.g:1780:2: ( ruleConstant )
            // InternalDSL.g:1781:3: ruleConstant
            {
             before(grammarAccess.getAssignAccess().getValConstantParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getAssignAccess().getValConstantParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Assign__ValAssignment_0_2"


    // $ANTLR start "rule__Assign__VarnameAssignment_1_0"
    // InternalDSL.g:1790:1: rule__Assign__VarnameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Assign__VarnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1794:1: ( ( RULE_ID ) )
            // InternalDSL.g:1795:2: ( RULE_ID )
            {
            // InternalDSL.g:1795:2: ( RULE_ID )
            // InternalDSL.g:1796:3: RULE_ID
            {
             before(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Assign__VarnameAssignment_1_0"


    // $ANTLR start "rule__Assign__ValAssignment_1_2"
    // InternalDSL.g:1805:1: rule__Assign__ValAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__Assign__ValAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1809:1: ( ( rulePrimitive ) )
            // InternalDSL.g:1810:2: ( rulePrimitive )
            {
            // InternalDSL.g:1810:2: ( rulePrimitive )
            // InternalDSL.g:1811:3: rulePrimitive
            {
             before(grammarAccess.getAssignAccess().getValPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getAssignAccess().getValPrimitiveParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Assign__ValAssignment_1_2"


    // $ANTLR start "rule__Constant__ValIntAssignment_0"
    // InternalDSL.g:1820:1: rule__Constant__ValIntAssignment_0 : ( RULE_INT ) ;
    public final void rule__Constant__ValIntAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1824:1: ( ( RULE_INT ) )
            // InternalDSL.g:1825:2: ( RULE_INT )
            {
            // InternalDSL.g:1825:2: ( RULE_INT )
            // InternalDSL.g:1826:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getValIntINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValIntINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Constant__ValIntAssignment_0"


    // $ANTLR start "rule__Constant__ValDoubleAssignment_1"
    // InternalDSL.g:1835:1: rule__Constant__ValDoubleAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__Constant__ValDoubleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1839:1: ( ( RULE_DOUBLE ) )
            // InternalDSL.g:1840:2: ( RULE_DOUBLE )
            {
            // InternalDSL.g:1840:2: ( RULE_DOUBLE )
            // InternalDSL.g:1841:3: RULE_DOUBLE
            {
             before(grammarAccess.getConstantAccess().getValDoubleDOUBLETerminalRuleCall_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValDoubleDOUBLETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constant__ValDoubleAssignment_1"


    // $ANTLR start "rule__Constant__ValStringAssignment_2"
    // InternalDSL.g:1850:1: rule__Constant__ValStringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Constant__ValStringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1854:1: ( ( RULE_STRING ) )
            // InternalDSL.g:1855:2: ( RULE_STRING )
            {
            // InternalDSL.g:1855:2: ( RULE_STRING )
            // InternalDSL.g:1856:3: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getValStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValStringSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Constant__ValStringAssignment_2"


    // $ANTLR start "rule__Constant__ValIDAssignment_3"
    // InternalDSL.g:1865:1: rule__Constant__ValIDAssignment_3 : ( RULE_ID ) ;
    public final void rule__Constant__ValIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1869:1: ( ( RULE_ID ) )
            // InternalDSL.g:1870:2: ( RULE_ID )
            {
            // InternalDSL.g:1870:2: ( RULE_ID )
            // InternalDSL.g:1871:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getValIDIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValIDIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constant__ValIDAssignment_3"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\76\uffff";
    static final String dfa_2s = "\1\uffff\4\16\13\uffff\7\16\1\uffff\4\16\10\uffff\17\16\1\uffff\12\16";
    static final String dfa_3s = "\1\5\4\17\1\5\1\11\1\7\1\31\3\5\1\4\2\uffff\1\5\5\17\1\10\1\5\1\6\2\5\2\17\1\5\1\11\1\7\1\31\3\5\1\4\7\17\2\5\5\17\1\10\1\6\3\5\5\17\2\5";
    static final String dfa_4s = "\1\27\3\17\1\30\1\12\1\11\1\7\1\32\3\5\1\4\2\uffff\1\27\7\17\1\6\4\17\1\12\1\11\1\7\1\32\3\5\1\4\17\17\1\6\12\17";
    static final String dfa_5s = "\15\uffff\1\1\1\2\57\uffff";
    static final String dfa_6s = "\76\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\2\uffff\1\4\5\uffff\1\14\1\11\1\12\1\13\1\10\1\7\1\6\1\5",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15\10\uffff\1\17",
            "\1\20\1\21\1\22\2\uffff\1\23",
            "\1\24",
            "\1\25",
            "\1\27\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "\1\44\1\45\1\46\2\uffff\1\47\5\uffff\1\43\1\40\1\41\1\42\1\37\1\36\1\35\1\34",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\50\6\uffff\1\15",
            "\1\51\11\uffff\1\15",
            "\1\52",
            "\1\53\11\uffff\1\15",
            "\1\54\11\uffff\1\15",
            "\1\15",
            "\1\15",
            "\1\55\1\56\1\57\2\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\53\11\uffff\1\15",
            "\1\54\11\uffff\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\71\6\uffff\1\15",
            "\1\72",
            "\1\73\11\uffff\1\15",
            "\1\74\11\uffff\1\15",
            "\1\75\11\uffff\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\74\11\uffff\1\15",
            "\1\75\11\uffff\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 560:2: ( rule__ML__Group_0__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000FF04E0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000FF04E2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000004E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}