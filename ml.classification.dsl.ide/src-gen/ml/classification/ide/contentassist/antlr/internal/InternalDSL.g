/*
 * generated by Xtext 2.23.0
 */
grammar InternalDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package ml.classification.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleML
entryRuleML
:
{ before(grammarAccess.getMLRule()); }
	 ruleML
{ after(grammarAccess.getMLRule()); } 
	 EOF 
;

// Rule ML
ruleML 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMLAccess().getGroup()); }
		(rule__ML__Group__0)
		{ after(grammarAccess.getMLAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssign
entryRuleAssign
:
{ before(grammarAccess.getAssignRule()); }
	 ruleAssign
{ after(grammarAccess.getAssignRule()); } 
	 EOF 
;

// Rule Assign
ruleAssign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignAccess().getGroup()); }
		(rule__Assign__Group__0)
		{ after(grammarAccess.getAssignAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimitive
entryRulePrimitive
:
{ before(grammarAccess.getPrimitiveRule()); }
	 rulePrimitive
{ after(grammarAccess.getPrimitiveRule()); } 
	 EOF 
;

// Rule Primitive
rulePrimitive 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimitiveAccess().getAlternatives()); }
		(rule__Primitive__Alternatives)
		{ after(grammarAccess.getPrimitiveAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePredict
entryRulePredict
:
{ before(grammarAccess.getPredictRule()); }
	 rulePredict
{ after(grammarAccess.getPredictRule()); } 
	 EOF 
;

// Rule Predict
rulePredict 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPredictAccess().getPredictKeyword()); }
		'predict'
		{ after(grammarAccess.getPredictAccess().getPredictKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstant
entryRuleConstant
:
{ before(grammarAccess.getConstantRule()); }
	 ruleConstant
{ after(grammarAccess.getConstantRule()); } 
	 EOF 
;

// Rule Constant
ruleConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstantAccess().getAlternatives()); }
		(rule__Constant__Alternatives)
		{ after(grammarAccess.getConstantAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUse_Metric
entryRuleUse_Metric
:
{ before(grammarAccess.getUse_MetricRule()); }
	 ruleUse_Metric
{ after(grammarAccess.getUse_MetricRule()); } 
	 EOF 
;

// Rule Use_Metric
ruleUse_Metric 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUse_MetricAccess().getGroup()); }
		(rule__Use_Metric__Group__0)
		{ after(grammarAccess.getUse_MetricAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleColumn
entryRuleColumn
:
{ before(grammarAccess.getColumnRule()); }
	 ruleColumn
{ after(grammarAccess.getColumnRule()); } 
	 EOF 
;

// Rule Column
ruleColumn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getColumnAccess().getAlternatives()); }
		(rule__Column__Alternatives)
		{ after(grammarAccess.getColumnAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStrategy_choose
entryRuleStrategy_choose
:
{ before(grammarAccess.getStrategy_chooseRule()); }
	 ruleStrategy_choose
{ after(grammarAccess.getStrategy_chooseRule()); } 
	 EOF 
;

// Rule Strategy_choose
ruleStrategy_choose 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getAlternatives()); }
		(rule__Strategy_choose__Alternatives)
		{ after(grammarAccess.getStrategy_chooseAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRead
entryRuleRead
:
{ before(grammarAccess.getReadRule()); }
	 ruleRead
{ after(grammarAccess.getReadRule()); } 
	 EOF 
;

// Rule Read
ruleRead 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReadAccess().getGroup()); }
		(rule__Read__Group__0)
		{ after(grammarAccess.getReadAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAlgo_choose
entryRuleAlgo_choose
:
{ before(grammarAccess.getAlgo_chooseRule()); }
	 ruleAlgo_choose
{ after(grammarAccess.getAlgo_chooseRule()); } 
	 EOF 
;

// Rule Algo_choose
ruleAlgo_choose 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlgo_chooseAccess().getGroup()); }
		(rule__Algo_choose__Group__0)
		{ after(grammarAccess.getAlgo_chooseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrint
entryRulePrint
:
{ before(grammarAccess.getPrintRule()); }
	 rulePrint
{ after(grammarAccess.getPrintRule()); } 
	 EOF 
;

// Rule Print
rulePrint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrintAccess().getGroup()); }
		(rule__Print__Group__0)
		{ after(grammarAccess.getPrintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getAssignAssignment_0()); }
		(rule__Statement__AssignAssignment_0)
		{ after(grammarAccess.getStatementAccess().getAssignAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getPrimitiveAssignment_1()); }
		(rule__Statement__PrimitiveAssignment_1)
		{ after(grammarAccess.getStatementAccess().getPrimitiveAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpr_primAssignment_0()); }
		(rule__Expression__Expr_primAssignment_0)
		{ after(grammarAccess.getExpressionAccess().getExpr_primAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getExpr_constAssignment_1()); }
		(rule__Expression__Expr_constAssignment_1)
		{ after(grammarAccess.getExpressionAccess().getExpr_constAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getPrintAssignment_0()); }
		(rule__Primitive__PrintAssignment_0)
		{ after(grammarAccess.getPrimitiveAccess().getPrintAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getAlgo_chooseAssignment_1()); }
		(rule__Primitive__Algo_chooseAssignment_1)
		{ after(grammarAccess.getPrimitiveAccess().getAlgo_chooseAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getReadAssignment_2()); }
		(rule__Primitive__ReadAssignment_2)
		{ after(grammarAccess.getPrimitiveAccess().getReadAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getStrategy_chooseAssignment_3()); }
		(rule__Primitive__Strategy_chooseAssignment_3)
		{ after(grammarAccess.getPrimitiveAccess().getStrategy_chooseAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getColumnAssignment_4()); }
		(rule__Primitive__ColumnAssignment_4)
		{ after(grammarAccess.getPrimitiveAccess().getColumnAssignment_4()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getUse_metricAssignment_5()); }
		(rule__Primitive__Use_metricAssignment_5)
		{ after(grammarAccess.getPrimitiveAccess().getUse_metricAssignment_5()); }
	)
	|
	(
		{ before(grammarAccess.getPrimitiveAccess().getPredictAssignment_6()); }
		(rule__Primitive__PredictAssignment_6)
		{ after(grammarAccess.getPrimitiveAccess().getPredictAssignment_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstantAccess().getINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getConstantAccess().getINTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_1()); }
		RULE_DOUBLE
		{ after(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_2()); }
		RULE_STRING
		{ after(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getConstantAccess().getIDTerminalRuleCall_3()); }
		RULE_ID
		{ after(grammarAccess.getConstantAccess().getIDTerminalRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getGroup_0()); }
		(rule__Column__Group_0__0)
		{ after(grammarAccess.getColumnAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getColumnAccess().getGroup_1()); }
		(rule__Column__Group_1__0)
		{ after(grammarAccess.getColumnAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getColumnAccess().getGroup_2()); }
		(rule__Column__Group_2__0)
		{ after(grammarAccess.getColumnAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getGroup_0()); }
		(rule__Strategy_choose__Group_0__0)
		{ after(grammarAccess.getStrategy_chooseAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getGroup_1()); }
		(rule__Strategy_choose__Group_1__0)
		{ after(grammarAccess.getStrategy_chooseAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ML__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ML__Group__0__Impl
	rule__ML__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ML__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMLAccess().getStatementsAssignment_0()); }
	(rule__ML__StatementsAssignment_0)*
	{ after(grammarAccess.getMLAccess().getStatementsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ML__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ML__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ML__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMLAccess().getStatementsAssignment_1()); }
	(rule__ML__StatementsAssignment_1)
	{ after(grammarAccess.getMLAccess().getStatementsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Assign__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assign__Group__0__Impl
	rule__Assign__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignAccess().getVarnameAssignment_0()); }
	(rule__Assign__VarnameAssignment_0)
	{ after(grammarAccess.getAssignAccess().getVarnameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assign__Group__1__Impl
	rule__Assign__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getAssignAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assign__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignAccess().getAssign_valueAssignment_2()); }
	(rule__Assign__Assign_valueAssignment_2)
	{ after(grammarAccess.getAssignAccess().getAssign_valueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Use_Metric__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Use_Metric__Group__0__Impl
	rule__Use_Metric__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Use_Metric__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUse_MetricAccess().getUse_metricKeyword_0()); }
	'use_metric'
	{ after(grammarAccess.getUse_MetricAccess().getUse_metricKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Use_Metric__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Use_Metric__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Use_Metric__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUse_MetricAccess().getMetricAssignment_1()); }
	(rule__Use_Metric__MetricAssignment_1)
	{ after(grammarAccess.getUse_MetricAccess().getMetricAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Column__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_0__0__Impl
	rule__Column__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getUse_columnKeyword_0_0()); }
	'use_column'
	{ after(grammarAccess.getColumnAccess().getUse_columnKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getColumnAccess().getUseAssignment_0_1()); }
		(rule__Column__UseAssignment_0_1)
		{ after(grammarAccess.getColumnAccess().getUseAssignment_0_1()); }
	)
	(
		{ before(grammarAccess.getColumnAccess().getUseAssignment_0_1()); }
		(rule__Column__UseAssignment_0_1)*
		{ after(grammarAccess.getColumnAccess().getUseAssignment_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Column__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_1__0__Impl
	rule__Column__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getUnuse_columnKeyword_1_0()); }
	'unuse_column'
	{ after(grammarAccess.getColumnAccess().getUnuse_columnKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); }
		(rule__Column__UnuseAssignment_1_1)
		{ after(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); }
		(rule__Column__UnuseAssignment_1_1)*
		{ after(grammarAccess.getColumnAccess().getUnuseAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Column__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_2__0__Impl
	rule__Column__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getPredict_columnKeyword_2_0()); }
	'predict_column'
	{ after(grammarAccess.getColumnAccess().getPredict_columnKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getPredictAssignment_2_1()); }
	(rule__Column__PredictAssignment_2_1)
	{ after(grammarAccess.getColumnAccess().getPredictAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy_choose__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy_choose__Group_0__0__Impl
	rule__Strategy_choose__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_0_0()); }
	'use_strategy'
	{ after(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy_choose__Group_0__1__Impl
	rule__Strategy_choose__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_0_1()); }
	(rule__Strategy_choose__StrategyAssignment_0_1)
	{ after(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy_choose__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategy_chooseAccess().getRatioAssignment_0_2()); }
	(rule__Strategy_choose__RatioAssignment_0_2)
	{ after(grammarAccess.getStrategy_chooseAccess().getRatioAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy_choose__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy_choose__Group_1__0__Impl
	rule__Strategy_choose__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_1_0()); }
	'use_strategy'
	{ after(grammarAccess.getStrategy_chooseAccess().getUse_strategyKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy_choose__Group_1__1__Impl
	rule__Strategy_choose__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_1_1()); }
	(rule__Strategy_choose__StrategyAssignment_1_1)
	{ after(grammarAccess.getStrategy_chooseAccess().getStrategyAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy_choose__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategy_chooseAccess().getNbAssignment_1_2()); }
	(rule__Strategy_choose__NbAssignment_1_2)?
	{ after(grammarAccess.getStrategy_chooseAccess().getNbAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Read__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Read__Group__0__Impl
	rule__Read__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadAccess().getReadKeyword_0()); }
	'read'
	{ after(grammarAccess.getReadAccess().getReadKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Read__Group__1__Impl
	rule__Read__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadAccess().getPathAssignment_1()); }
	(rule__Read__PathAssignment_1)
	{ after(grammarAccess.getReadAccess().getPathAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Read__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadAccess().getSeparatorAssignment_2()); }
	(rule__Read__SeparatorAssignment_2)?
	{ after(grammarAccess.getReadAccess().getSeparatorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Algo_choose__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Algo_choose__Group__0__Impl
	rule__Algo_choose__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Algo_choose__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlgo_chooseAccess().getUse_algorithmKeyword_0()); }
	'use_algorithm'
	{ after(grammarAccess.getAlgo_chooseAccess().getUse_algorithmKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algo_choose__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Algo_choose__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Algo_choose__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlgo_chooseAccess().getAlgorithmAssignment_1()); }
	(rule__Algo_choose__AlgorithmAssignment_1)
	{ after(grammarAccess.getAlgo_chooseAccess().getAlgorithmAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Print__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Print__Group__0__Impl
	rule__Print__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Print__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintAccess().getPrintKeyword_0()); }
	'print'
	{ after(grammarAccess.getPrintAccess().getPrintKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Print__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Print__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Print__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintAccess().getPrintAssignment_1()); }
	(rule__Print__PrintAssignment_1)
	{ after(grammarAccess.getPrintAccess().getPrintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ML__StatementsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0()); }
		ruleStatement
		{ after(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ML__StatementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_1_0()); }
		ruleStatement
		{ after(grammarAccess.getMLAccess().getStatementsStatementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__AssignAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getAssignAssignParserRuleCall_0_0()); }
		ruleAssign
		{ after(grammarAccess.getStatementAccess().getAssignAssignParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__PrimitiveAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getPrimitivePrimitiveParserRuleCall_1_0()); }
		rulePrimitive
		{ after(grammarAccess.getStatementAccess().getPrimitivePrimitiveParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__VarnameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAssignAccess().getVarnameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assign__Assign_valueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignAccess().getAssign_valueExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getAssignAccess().getAssign_valueExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Expr_primAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpr_primPrimitiveParserRuleCall_0_0()); }
		rulePrimitive
		{ after(grammarAccess.getExpressionAccess().getExpr_primPrimitiveParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Expr_constAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpr_constConstantParserRuleCall_1_0()); }
		ruleConstant
		{ after(grammarAccess.getExpressionAccess().getExpr_constConstantParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__PrintAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getPrintPrintParserRuleCall_0_0()); }
		rulePrint
		{ after(grammarAccess.getPrimitiveAccess().getPrintPrintParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Algo_chooseAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getAlgo_chooseAlgo_chooseParserRuleCall_1_0()); }
		ruleAlgo_choose
		{ after(grammarAccess.getPrimitiveAccess().getAlgo_chooseAlgo_chooseParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__ReadAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getReadReadParserRuleCall_2_0()); }
		ruleRead
		{ after(grammarAccess.getPrimitiveAccess().getReadReadParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Strategy_chooseAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getStrategy_chooseStrategy_chooseParserRuleCall_3_0()); }
		ruleStrategy_choose
		{ after(grammarAccess.getPrimitiveAccess().getStrategy_chooseStrategy_chooseParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__ColumnAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getColumnColumnParserRuleCall_4_0()); }
		ruleColumn
		{ after(grammarAccess.getPrimitiveAccess().getColumnColumnParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__Use_metricAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getUse_metricUse_MetricParserRuleCall_5_0()); }
		ruleUse_Metric
		{ after(grammarAccess.getPrimitiveAccess().getUse_metricUse_MetricParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primitive__PredictAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveAccess().getPredictPredictParserRuleCall_6_0()); }
		rulePredict
		{ after(grammarAccess.getPrimitiveAccess().getPredictPredictParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Use_Metric__MetricAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUse_MetricAccess().getMetricMETRICTerminalRuleCall_1_0()); }
		RULE_METRIC
		{ after(grammarAccess.getUse_MetricAccess().getMetricMETRICTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__UseAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getUseINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getColumnAccess().getUseINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__UnuseAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getUnuseINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getColumnAccess().getUnuseINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__PredictAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getPredictINTTerminalRuleCall_2_1_0()); }
		RULE_INT
		{ after(grammarAccess.getColumnAccess().getPredictINTTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__StrategyAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); }
		(
			{ before(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); }
			'train_test'
			{ after(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); }
		)
		{ after(grammarAccess.getStrategy_chooseAccess().getStrategyTrain_testKeyword_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__RatioAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getRatioDOUBLETerminalRuleCall_0_2_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getStrategy_chooseAccess().getRatioDOUBLETerminalRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__StrategyAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); }
			'cross_valid'
			{ after(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getStrategy_chooseAccess().getStrategyCross_validKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy_choose__NbAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategy_chooseAccess().getNbINTTerminalRuleCall_1_2_0()); }
		RULE_INT
		{ after(grammarAccess.getStrategy_chooseAccess().getNbINTTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__PathAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Read__SeparatorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReadAccess().getSeparatorSEPTerminalRuleCall_2_0()); }
		RULE_SEP
		{ after(grammarAccess.getReadAccess().getSeparatorSEPTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algo_choose__AlgorithmAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlgo_chooseAccess().getAlgorithmALGO_NAMETerminalRuleCall_1_0()); }
		RULE_ALGO_NAME
		{ after(grammarAccess.getAlgo_chooseAccess().getAlgorithmALGO_NAMETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Print__PrintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrintAccess().getPrintConstantParserRuleCall_1_0()); }
		ruleConstant
		{ after(grammarAccess.getPrintAccess().getPrintConstantParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_METRIC : ('accuracy'|'recall'|'f1');

RULE_SEP : (';'|',');

RULE_ALGO_NAME : ('tree'|'svm');

RULE_DOUBLE : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
