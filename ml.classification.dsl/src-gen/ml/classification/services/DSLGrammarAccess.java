/*
 * generated by Xtext 2.23.0
 */
package ml.classification.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.ML");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStatementsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStatementsStatementParserRuleCall_0_0 = (RuleCall)cStatementsAssignment_0.eContents().get(0);
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_1_0 = (RuleCall)cStatementsAssignment_1.eContents().get(0);
		
		//// concrete and abstract syntax
		//ML:
		//	statements+=Statement* statements+=Statement;
		@Override public ParserRule getRule() { return rule; }
		
		//statements+=Statement* statements+=Statement
		public Group getGroup() { return cGroup; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_0() { return cStatementsAssignment_0; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0_0() { return cStatementsStatementParserRuleCall_0_0; }
		
		//statements+=Statement
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0() { return cStatementsStatementParserRuleCall_1_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cStatementAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cStatementExpressionParserRuleCall_0_0 = (RuleCall)cStatementAssignment_0.eContents().get(0);
		private final Assignment cStatementAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStatementPrimitiveParserRuleCall_1_0 = (RuleCall)cStatementAssignment_1.eContents().get(0);
		
		//Statement:
		//	statement=Expression | statement=Primitive;
		@Override public ParserRule getRule() { return rule; }
		
		//statement=Expression | statement=Primitive
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//statement=Expression
		public Assignment getStatementAssignment_0() { return cStatementAssignment_0; }
		
		//Expression
		public RuleCall getStatementExpressionParserRuleCall_0_0() { return cStatementExpressionParserRuleCall_0_0; }
		
		//statement=Primitive
		public Assignment getStatementAssignment_1() { return cStatementAssignment_1; }
		
		//Primitive
		public RuleCall getStatementPrimitiveParserRuleCall_1_0() { return cStatementPrimitiveParserRuleCall_1_0; }
	}
	public class PrimitiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Primitive");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPrimitiveAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cPrimitivePrintParserRuleCall_0_0 = (RuleCall)cPrimitiveAssignment_0.eContents().get(0);
		private final Assignment cPrimitiveAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cPrimitiveAlgo_chooseParserRuleCall_1_0 = (RuleCall)cPrimitiveAssignment_1.eContents().get(0);
		private final Assignment cPrimitiveAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cPrimitiveReadParserRuleCall_2_0 = (RuleCall)cPrimitiveAssignment_2.eContents().get(0);
		private final Assignment cPrimitiveAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cPrimitiveStrategy_chooseParserRuleCall_3_0 = (RuleCall)cPrimitiveAssignment_3.eContents().get(0);
		private final Assignment cPrimitiveAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cPrimitiveColumnParserRuleCall_4_0 = (RuleCall)cPrimitiveAssignment_4.eContents().get(0);
		private final Assignment cPrimitiveAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cPrimitiveUse_MetricParserRuleCall_5_0 = (RuleCall)cPrimitiveAssignment_5.eContents().get(0);
		
		//Primitive:
		//	primitive=Print | primitive=Algo_choose | primitive=Read | primitive=Strategy_choose | primitive=Column |
		//	primitive=Use_Metric;
		@Override public ParserRule getRule() { return rule; }
		
		//primitive=Print | primitive=Algo_choose | primitive=Read | primitive=Strategy_choose | primitive=Column |
		//primitive=Use_Metric
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//primitive=Print
		public Assignment getPrimitiveAssignment_0() { return cPrimitiveAssignment_0; }
		
		//Print
		public RuleCall getPrimitivePrintParserRuleCall_0_0() { return cPrimitivePrintParserRuleCall_0_0; }
		
		//primitive=Algo_choose
		public Assignment getPrimitiveAssignment_1() { return cPrimitiveAssignment_1; }
		
		//Algo_choose
		public RuleCall getPrimitiveAlgo_chooseParserRuleCall_1_0() { return cPrimitiveAlgo_chooseParserRuleCall_1_0; }
		
		//primitive=Read
		public Assignment getPrimitiveAssignment_2() { return cPrimitiveAssignment_2; }
		
		//Read
		public RuleCall getPrimitiveReadParserRuleCall_2_0() { return cPrimitiveReadParserRuleCall_2_0; }
		
		//primitive=Strategy_choose
		public Assignment getPrimitiveAssignment_3() { return cPrimitiveAssignment_3; }
		
		//Strategy_choose
		public RuleCall getPrimitiveStrategy_chooseParserRuleCall_3_0() { return cPrimitiveStrategy_chooseParserRuleCall_3_0; }
		
		//primitive=Column
		public Assignment getPrimitiveAssignment_4() { return cPrimitiveAssignment_4; }
		
		//Column
		public RuleCall getPrimitiveColumnParserRuleCall_4_0() { return cPrimitiveColumnParserRuleCall_4_0; }
		
		//primitive=Use_Metric
		public Assignment getPrimitiveAssignment_5() { return cPrimitiveAssignment_5; }
		
		//Use_Metric
		public RuleCall getPrimitiveUse_MetricParserRuleCall_5_0() { return cPrimitiveUse_MetricParserRuleCall_5_0; }
	}
	public class Use_MetricElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Use_Metric");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUse_metricKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMetricAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMetricMETRICTerminalRuleCall_1_0 = (RuleCall)cMetricAssignment_1.eContents().get(0);
		
		//Use_Metric:
		//	"use_metric" metric=METRIC;
		@Override public ParserRule getRule() { return rule; }
		
		//"use_metric" metric=METRIC
		public Group getGroup() { return cGroup; }
		
		//"use_metric"
		public Keyword getUse_metricKeyword_0() { return cUse_metricKeyword_0; }
		
		//metric=METRIC
		public Assignment getMetricAssignment_1() { return cMetricAssignment_1; }
		
		//METRIC
		public RuleCall getMetricMETRICTerminalRuleCall_1_0() { return cMetricMETRICTerminalRuleCall_1_0; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Column");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cUse_columnKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cUseAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cUseINTTerminalRuleCall_0_1_0 = (RuleCall)cUseAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cUnuse_columnKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cUnuseAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cUnuseINTTerminalRuleCall_1_1_0 = (RuleCall)cUnuseAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cPredict_columnKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPredictAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPredictINTTerminalRuleCall_2_1_0 = (RuleCall)cPredictAssignment_2_1.eContents().get(0);
		
		//Column:
		//	"use_column" use+=INT+ |
		//	"unuse_column" unuse+=INT+ |
		//	"predict_column" predict=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//"use_column" use+=INT+ | "unuse_column" unuse+=INT+ | "predict_column" predict=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"use_column" use+=INT+
		public Group getGroup_0() { return cGroup_0; }
		
		//"use_column"
		public Keyword getUse_columnKeyword_0_0() { return cUse_columnKeyword_0_0; }
		
		//use+=INT+
		public Assignment getUseAssignment_0_1() { return cUseAssignment_0_1; }
		
		//INT
		public RuleCall getUseINTTerminalRuleCall_0_1_0() { return cUseINTTerminalRuleCall_0_1_0; }
		
		//"unuse_column" unuse+=INT+
		public Group getGroup_1() { return cGroup_1; }
		
		//"unuse_column"
		public Keyword getUnuse_columnKeyword_1_0() { return cUnuse_columnKeyword_1_0; }
		
		//unuse+=INT+
		public Assignment getUnuseAssignment_1_1() { return cUnuseAssignment_1_1; }
		
		//INT
		public RuleCall getUnuseINTTerminalRuleCall_1_1_0() { return cUnuseINTTerminalRuleCall_1_1_0; }
		
		//"predict_column" predict=INT
		public Group getGroup_2() { return cGroup_2; }
		
		//"predict_column"
		public Keyword getPredict_columnKeyword_2_0() { return cPredict_columnKeyword_2_0; }
		
		//predict=INT
		public Assignment getPredictAssignment_2_1() { return cPredictAssignment_2_1; }
		
		//INT
		public RuleCall getPredictINTTerminalRuleCall_2_1_0() { return cPredictINTTerminalRuleCall_2_1_0; }
	}
	public class Strategy_chooseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Strategy_choose");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cUse_strategyKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cStrategyAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cStrategyTrain_testKeyword_0_1_0 = (Keyword)cStrategyAssignment_0_1.eContents().get(0);
		private final Assignment cRatioAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cRatioDOUBLETerminalRuleCall_0_2_0 = (RuleCall)cRatioAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cUse_strategyKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cStrategyAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cStrategyCross_validKeyword_1_1_0 = (Keyword)cStrategyAssignment_1_1.eContents().get(0);
		private final Assignment cNbAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cNbINTTerminalRuleCall_1_2_0 = (RuleCall)cNbAssignment_1_2.eContents().get(0);
		
		//Strategy_choose:
		//	"use_strategy" strategy="train_test" ratio=DOUBLE |
		//	"use_strategy" strategy="cross_valid" nb=INT?;
		@Override public ParserRule getRule() { return rule; }
		
		//"use_strategy" strategy="train_test" ratio=DOUBLE | "use_strategy" strategy="cross_valid" nb=INT?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"use_strategy" strategy="train_test" ratio=DOUBLE
		public Group getGroup_0() { return cGroup_0; }
		
		//"use_strategy"
		public Keyword getUse_strategyKeyword_0_0() { return cUse_strategyKeyword_0_0; }
		
		//strategy="train_test"
		public Assignment getStrategyAssignment_0_1() { return cStrategyAssignment_0_1; }
		
		//"train_test"
		public Keyword getStrategyTrain_testKeyword_0_1_0() { return cStrategyTrain_testKeyword_0_1_0; }
		
		//ratio=DOUBLE
		public Assignment getRatioAssignment_0_2() { return cRatioAssignment_0_2; }
		
		//DOUBLE
		public RuleCall getRatioDOUBLETerminalRuleCall_0_2_0() { return cRatioDOUBLETerminalRuleCall_0_2_0; }
		
		//"use_strategy" strategy="cross_valid" nb=INT?
		public Group getGroup_1() { return cGroup_1; }
		
		//"use_strategy"
		public Keyword getUse_strategyKeyword_1_0() { return cUse_strategyKeyword_1_0; }
		
		//strategy="cross_valid"
		public Assignment getStrategyAssignment_1_1() { return cStrategyAssignment_1_1; }
		
		//"cross_valid"
		public Keyword getStrategyCross_validKeyword_1_1_0() { return cStrategyCross_validKeyword_1_1_0; }
		
		//nb=INT?
		public Assignment getNbAssignment_1_2() { return cNbAssignment_1_2; }
		
		//INT
		public RuleCall getNbINTTerminalRuleCall_1_2_0() { return cNbINTTerminalRuleCall_1_2_0; }
	}
	public class ReadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Read");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathSTRINGTerminalRuleCall_1_0 = (RuleCall)cPathAssignment_1.eContents().get(0);
		private final Assignment cSeparatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSeparatorSEPTerminalRuleCall_2_0 = (RuleCall)cSeparatorAssignment_2.eContents().get(0);
		
		//Read:
		//	"read" path=STRING separator=SEP?;
		@Override public ParserRule getRule() { return rule; }
		
		//"read" path=STRING separator=SEP?
		public Group getGroup() { return cGroup; }
		
		//"read"
		public Keyword getReadKeyword_0() { return cReadKeyword_0; }
		
		//path=STRING
		public Assignment getPathAssignment_1() { return cPathAssignment_1; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_1_0() { return cPathSTRINGTerminalRuleCall_1_0; }
		
		//separator=SEP?
		public Assignment getSeparatorAssignment_2() { return cSeparatorAssignment_2; }
		
		//SEP
		public RuleCall getSeparatorSEPTerminalRuleCall_2_0() { return cSeparatorSEPTerminalRuleCall_2_0; }
	}
	public class Algo_chooseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Algo_choose");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUse_algorithmKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAlgorithmAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAlgorithmALGO_NAMETerminalRuleCall_1_0 = (RuleCall)cAlgorithmAssignment_1.eContents().get(0);
		
		//Algo_choose:
		//	"use_algorithm" algorithm=ALGO_NAME;
		@Override public ParserRule getRule() { return rule; }
		
		//"use_algorithm" algorithm=ALGO_NAME
		public Group getGroup() { return cGroup; }
		
		//"use_algorithm"
		public Keyword getUse_algorithmKeyword_0() { return cUse_algorithmKeyword_0; }
		
		//algorithm=ALGO_NAME
		public Assignment getAlgorithmAssignment_1() { return cAlgorithmAssignment_1; }
		
		//ALGO_NAME
		public RuleCall getAlgorithmALGO_NAMETerminalRuleCall_1_0() { return cAlgorithmALGO_NAMETerminalRuleCall_1_0; }
	}
	public class PrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Print");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValConstantParserRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//Print:
		//	"print" val=Constant;
		@Override public ParserRule getRule() { return rule; }
		
		//"print" val=Constant
		public Group getGroup() { return cGroup; }
		
		//"print"
		public Keyword getPrintKeyword_0() { return cPrintKeyword_0; }
		
		//val=Constant
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//Constant
		public RuleCall getValConstantParserRuleCall_1_0() { return cValConstantParserRuleCall_1_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cExprAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cExprConstantParserRuleCall_0_0 = (RuleCall)cExprAssignment_0.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cExprAssignParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		
		//Expression:
		//	expr=Constant | expr=Assign;
		@Override public ParserRule getRule() { return rule; }
		
		//expr=Constant | expr=Assign
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//expr=Constant
		public Assignment getExprAssignment_0() { return cExprAssignment_0; }
		
		//Constant
		public RuleCall getExprConstantParserRuleCall_0_0() { return cExprConstantParserRuleCall_0_0; }
		
		//expr=Assign
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }
		
		//Assign
		public RuleCall getExprAssignParserRuleCall_1_0() { return cExprAssignParserRuleCall_1_0; }
	}
	public class AssignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Assign");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cVarnameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cVarnameIDTerminalRuleCall_0_0_0 = (RuleCall)cVarnameAssignment_0_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValConstantParserRuleCall_0_2_0 = (RuleCall)cValAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cVarnameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cVarnameIDTerminalRuleCall_1_0_0 = (RuleCall)cVarnameAssignment_1_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cValAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cValPrimitiveParserRuleCall_1_2_0 = (RuleCall)cValAssignment_1_2.eContents().get(0);
		
		//Assign:
		//	varname=ID "=" val=Constant | varname=ID "=" val=Primitive;
		@Override public ParserRule getRule() { return rule; }
		
		//varname=ID "=" val=Constant | varname=ID "=" val=Primitive
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//varname=ID "=" val=Constant
		public Group getGroup_0() { return cGroup_0; }
		
		//varname=ID
		public Assignment getVarnameAssignment_0_0() { return cVarnameAssignment_0_0; }
		
		//ID
		public RuleCall getVarnameIDTerminalRuleCall_0_0_0() { return cVarnameIDTerminalRuleCall_0_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_0_1() { return cEqualsSignKeyword_0_1; }
		
		//val=Constant
		public Assignment getValAssignment_0_2() { return cValAssignment_0_2; }
		
		//Constant
		public RuleCall getValConstantParserRuleCall_0_2_0() { return cValConstantParserRuleCall_0_2_0; }
		
		//varname=ID "=" val=Primitive
		public Group getGroup_1() { return cGroup_1; }
		
		//varname=ID
		public Assignment getVarnameAssignment_1_0() { return cVarnameAssignment_1_0; }
		
		//ID
		public RuleCall getVarnameIDTerminalRuleCall_1_0_0() { return cVarnameIDTerminalRuleCall_1_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }
		
		//val=Primitive
		public Assignment getValAssignment_1_2() { return cValAssignment_1_2; }
		
		//Primitive
		public RuleCall getValPrimitiveParserRuleCall_1_2_0() { return cValPrimitiveParserRuleCall_1_2_0; }
	}
	public class ConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.Constant");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValIntAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValIntINTTerminalRuleCall_0_0 = (RuleCall)cValIntAssignment_0.eContents().get(0);
		private final Assignment cValDoubleAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValDoubleDOUBLETerminalRuleCall_1_0 = (RuleCall)cValDoubleAssignment_1.eContents().get(0);
		private final Assignment cValStringAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cValStringSTRINGTerminalRuleCall_2_0 = (RuleCall)cValStringAssignment_2.eContents().get(0);
		private final Assignment cValIDAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cValIDIDTerminalRuleCall_3_0 = (RuleCall)cValIDAssignment_3.eContents().get(0);
		
		//Constant:
		//	valInt=INT | valDouble=DOUBLE | valString=STRING | valID=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//valInt=INT | valDouble=DOUBLE | valString=STRING | valID=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//valInt=INT
		public Assignment getValIntAssignment_0() { return cValIntAssignment_0; }
		
		//INT
		public RuleCall getValIntINTTerminalRuleCall_0_0() { return cValIntINTTerminalRuleCall_0_0; }
		
		//valDouble=DOUBLE
		public Assignment getValDoubleAssignment_1() { return cValDoubleAssignment_1; }
		
		//DOUBLE
		public RuleCall getValDoubleDOUBLETerminalRuleCall_1_0() { return cValDoubleDOUBLETerminalRuleCall_1_0; }
		
		//valString=STRING
		public Assignment getValStringAssignment_2() { return cValStringAssignment_2; }
		
		//STRING
		public RuleCall getValStringSTRINGTerminalRuleCall_2_0() { return cValStringSTRINGTerminalRuleCall_2_0; }
		
		//valID=ID
		public Assignment getValIDAssignment_3() { return cValIDAssignment_3; }
		
		//ID
		public RuleCall getValIDIDTerminalRuleCall_3_0() { return cValIDIDTerminalRuleCall_3_0; }
	}
	
	
	private final MLElements pML;
	private final StatementElements pStatement;
	private final PrimitiveElements pPrimitive;
	private final Use_MetricElements pUse_Metric;
	private final TerminalRule tMETRIC;
	private final ColumnElements pColumn;
	private final Strategy_chooseElements pStrategy_choose;
	private final ReadElements pRead;
	private final TerminalRule tSEP;
	private final Algo_chooseElements pAlgo_choose;
	private final TerminalRule tALGO_NAME;
	private final PrintElements pPrint;
	private final ExpressionElements pExpression;
	private final AssignElements pAssign;
	private final ConstantElements pConstant;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pML = new MLElements();
		this.pStatement = new StatementElements();
		this.pPrimitive = new PrimitiveElements();
		this.pUse_Metric = new Use_MetricElements();
		this.tMETRIC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.METRIC");
		this.pColumn = new ColumnElements();
		this.pStrategy_choose = new Strategy_chooseElements();
		this.pRead = new ReadElements();
		this.tSEP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.SEP");
		this.pAlgo_choose = new Algo_chooseElements();
		this.tALGO_NAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.ALGO_NAME");
		this.pPrint = new PrintElements();
		this.pExpression = new ExpressionElements();
		this.pAssign = new AssignElements();
		this.pConstant = new ConstantElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ml.classification.DSL.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ml.classification.DSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// concrete and abstract syntax
	//ML:
	//	statements+=Statement* statements+=Statement;
	public MLElements getMLAccess() {
		return pML;
	}
	
	public ParserRule getMLRule() {
		return getMLAccess().getRule();
	}
	
	//Statement:
	//	statement=Expression | statement=Primitive;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Primitive:
	//	primitive=Print | primitive=Algo_choose | primitive=Read | primitive=Strategy_choose | primitive=Column |
	//	primitive=Use_Metric;
	public PrimitiveElements getPrimitiveAccess() {
		return pPrimitive;
	}
	
	public ParserRule getPrimitiveRule() {
		return getPrimitiveAccess().getRule();
	}
	
	//Use_Metric:
	//	"use_metric" metric=METRIC;
	public Use_MetricElements getUse_MetricAccess() {
		return pUse_Metric;
	}
	
	public ParserRule getUse_MetricRule() {
		return getUse_MetricAccess().getRule();
	}
	
	//terminal METRIC:
	//	"accuracy" |
	//	"recall" |
	//	"f1";
	public TerminalRule getMETRICRule() {
		return tMETRIC;
	}
	
	//Column:
	//	"use_column" use+=INT+ |
	//	"unuse_column" unuse+=INT+ |
	//	"predict_column" predict=INT;
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//Strategy_choose:
	//	"use_strategy" strategy="train_test" ratio=DOUBLE |
	//	"use_strategy" strategy="cross_valid" nb=INT?;
	public Strategy_chooseElements getStrategy_chooseAccess() {
		return pStrategy_choose;
	}
	
	public ParserRule getStrategy_chooseRule() {
		return getStrategy_chooseAccess().getRule();
	}
	
	//Read:
	//	"read" path=STRING separator=SEP?;
	public ReadElements getReadAccess() {
		return pRead;
	}
	
	public ParserRule getReadRule() {
		return getReadAccess().getRule();
	}
	
	//terminal SEP:
	//	";" | ",";
	public TerminalRule getSEPRule() {
		return tSEP;
	}
	
	//Algo_choose:
	//	"use_algorithm" algorithm=ALGO_NAME;
	public Algo_chooseElements getAlgo_chooseAccess() {
		return pAlgo_choose;
	}
	
	public ParserRule getAlgo_chooseRule() {
		return getAlgo_chooseAccess().getRule();
	}
	
	//terminal ALGO_NAME:
	//	"tree" |
	//	"svm";
	public TerminalRule getALGO_NAMERule() {
		return tALGO_NAME;
	}
	
	//Print:
	//	"print" val=Constant;
	public PrintElements getPrintAccess() {
		return pPrint;
	}
	
	public ParserRule getPrintRule() {
		return getPrintAccess().getRule();
	}
	
	//Expression:
	//	expr=Constant | expr=Assign;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Assign:
	//	varname=ID "=" val=Constant | varname=ID "=" val=Primitive;
	public AssignElements getAssignAccess() {
		return pAssign;
	}
	
	public ParserRule getAssignRule() {
		return getAssignAccess().getRule();
	}
	
	//Constant:
	//	valInt=INT | valDouble=DOUBLE | valString=STRING | valID=ID;
	public ConstantElements getConstantAccess() {
		return pConstant;
	}
	
	public ParserRule getConstantRule() {
		return getConstantAccess().getRule();
	}
	
	//terminal DOUBLE:
	//	INT "." INT;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
