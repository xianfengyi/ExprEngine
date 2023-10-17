// Generated from /Users/bytedance/Project/pioneeryi/ExprEngine/src/main/resources/antlr/ExprEngine.g4 by ANTLR 4.13.1
package gen.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprEngineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		AND=10, CASE=11, DECIMAL_LITERAL=12, DIV=13, DOT=14, ELSE=15, END=16, 
		FALSE=17, LIKE=18, MINUS=19, MUL=20, NOT=21, OR=22, PLUS=23, STRING_LITERAL=24, 
		THEN=25, TRUE=26, WHEN=27, IDENTIFIER=28;
	public static final int
		RULE_expression = 0, RULE_predicate = 1, RULE_expressionAtom = 2, RULE_logicalOperator = 3, 
		RULE_comparisonOperator = 4, RULE_caseWhen = 5, RULE_caseItem = 6, RULE_constant = 7, 
		RULE_stringLiteral = 8, RULE_floatLiteral = 9, RULE_decimalLiteral = 10, 
		RULE_booleanLiteral = 11, RULE_param = 12, RULE_paramIdentifier = 13, 
		RULE_mathPmOperator = 14, RULE_mathMdOperator = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "predicate", "expressionAtom", "logicalOperator", "comparisonOperator", 
			"caseWhen", "caseItem", "constant", "stringLiteral", "floatLiteral", 
			"decimalLiteral", "booleanLiteral", "param", "paramIdentifier", "mathPmOperator", 
			"mathMdOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'&'", "'|'", "'='", "'>'", "'<'", "'!'", "'$$'", 
			null, null, null, "'/'", "'.'", null, null, null, null, "'-'", "'*'", 
			null, null, "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "AND", "CASE", 
			"DECIMAL_LITERAL", "DIV", "DOT", "ELSE", "END", "FALSE", "LIKE", "MINUS", 
			"MUL", "NOT", "OR", "PLUS", "STRING_LITERAL", "THEN", "TRUE", "WHEN", 
			"IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExprEngine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprEngineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			predicate(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAtomPredicateContext extends PredicateContext {
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public ExprAtomPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterExprAtomPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitExprAtomPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitExprAtomPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonPredicateContext extends PredicateContext {
		public PredicateContext left;
		public PredicateContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public ComparisonPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterComparisonPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitComparisonPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitComparisonPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalPredicateContext extends PredicateContext {
		public PredicateContext left;
		public PredicateContext right;
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public LogicalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterLogicalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitLogicalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitLogicalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikePredicateContext extends PredicateContext {
		public Token notOperator;
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(ExprEngineParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(ExprEngineParser.NOT, 0); }
		public LikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitLikePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new LikePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				expressionAtom(0);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(36);
					((LikePredicateContext)_localctx).notOperator = match(NOT);
					}
				}

				setState(39);
				match(LIKE);
				setState(40);
				expressionAtom(0);
				}
				break;
			case 2:
				{
				_localctx = new ExprAtomPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				expressionAtom(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalPredicateContext(new PredicateContext(_parentctx, _parentState));
						((LogicalPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						logicalOperator();
						setState(47);
						((LogicalPredicateContext)_localctx).right = predicate(5);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonPredicateContext(new PredicateContext(_parentctx, _parentState));
						((ComparisonPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						comparisonOperator();
						setState(51);
						((ComparisonPredicateContext)_localctx).right = predicate(4);
						}
						break;
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
	 
		public ExpressionAtomContext() { }
		public void copyFrom(ExpressionAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketExprAtomContext extends ExpressionAtomContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExprAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterBracketExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitBracketExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitBracketExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamExprAtomContext extends ExpressionAtomContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamExprAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterParamExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitParamExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitParamExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathMDExprAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public MathMdOperatorContext mathMdOperator() {
			return getRuleContext(MathMdOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public MathMDExprAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterMathMDExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitMathMDExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitMathMDExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExprAtomContext extends ExpressionAtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterConstantExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitConstantExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitConstantExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseWhenExprAtomContext extends ExpressionAtomContext {
		public CaseWhenContext caseWhen() {
			return getRuleContext(CaseWhenContext.class,0);
		}
		public CaseWhenExprAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterCaseWhenExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitCaseWhenExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitCaseWhenExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathPMExprAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public MathPmOperatorContext mathPmOperator() {
			return getRuleContext(MathPmOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public MathPMExprAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterMathPMExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitMathPMExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitMathPMExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		return expressionAtom(0);
	}

	private ExpressionAtomContext expressionAtom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, _parentState);
		ExpressionAtomContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressionAtom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case FALSE:
			case MINUS:
			case STRING_LITERAL:
			case TRUE:
			case IDENTIFIER:
				{
				_localctx = new ConstantExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(59);
				constant();
				}
				break;
			case T__8:
				{
				_localctx = new ParamExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				param();
				}
				break;
			case CASE:
				{
				_localctx = new CaseWhenExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				caseWhen();
				}
				break;
			case T__0:
				{
				_localctx = new BracketExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(T__0);
				setState(63);
				expression();
				setState(64);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MathMDExprAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathMDExprAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						mathMdOperator();
						setState(70);
						((MathMDExprAtomContext)_localctx).right = expressionAtom(3);
						}
						break;
					case 2:
						{
						_localctx = new MathPMExprAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathPMExprAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(72);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(73);
						mathPmOperator();
						setState(74);
						((MathPMExprAtomContext)_localctx).right = expressionAtom(2);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ExprEngineParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprEngineParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logicalOperator);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(AND);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__2);
				setState(83);
				match(T__2);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(OR);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__3);
				setState(86);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparisonOperator);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(T__6);
				setState(93);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__5);
				setState(95);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(T__6);
				setState(97);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(T__7);
				setState(99);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				match(T__6);
				setState(101);
				match(T__4);
				setState(102);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseWhenContext extends ParserRuleContext {
		public ExpressionAtomContext elseArg;
		public TerminalNode CASE() { return getToken(ExprEngineParser.CASE, 0); }
		public TerminalNode END() { return getToken(ExprEngineParser.END, 0); }
		public List<CaseItemContext> caseItem() {
			return getRuleContexts(CaseItemContext.class);
		}
		public CaseItemContext caseItem(int i) {
			return getRuleContext(CaseItemContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExprEngineParser.ELSE, 0); }
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CASE);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				caseItem();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(111);
				match(ELSE);
				setState(112);
				((CaseWhenContext)_localctx).elseArg = expressionAtom(0);
				}
			}

			setState(115);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseItemContext extends ParserRuleContext {
		public PredicateContext condition;
		public ExpressionAtomContext consequent;
		public TerminalNode WHEN() { return getToken(ExprEngineParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(ExprEngineParser.THEN, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public CaseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterCaseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitCaseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitCaseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseItemContext caseItem() throws RecognitionException {
		CaseItemContext _localctx = new CaseItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHEN);
			setState(118);
			((CaseItemContext)_localctx).condition = predicate(0);
			setState(119);
			match(THEN);
			setState(120);
			((CaseItemContext)_localctx).consequent = expressionAtom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ExprEngineParser.MINUS, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprEngineParser.IDENTIFIER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(MINUS);
				setState(126);
				decimalLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				booleanLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ExprEngineParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ExprEngineParser.STRING_LITERAL, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringLiteral);
		try {
			int _alt;
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(131);
				match(STRING_LITERAL);
				}
				setState(133); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(132);
						match(STRING_LITERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(135); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends ParserRuleContext {
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ExprEngineParser.DOT, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			decimalLiteral();
			setState(141);
			match(DOT);
			setState(142);
			decimalLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ExprEngineParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ExprEngineParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprEngineParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public ParamIdentifierContext name;
		public ParamIdentifierContext paramIdentifier() {
			return getRuleContext(ParamIdentifierContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__8);
			setState(149);
			((ParamContext)_localctx).name = paramIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprEngineParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprEngineParser.IDENTIFIER, i);
		}
		public ParamIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterParamIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitParamIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitParamIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamIdentifierContext paramIdentifier() throws RecognitionException {
		ParamIdentifierContext _localctx = new ParamIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFIER);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					matchWildcard();
					setState(153);
					match(IDENTIFIER);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathPmOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ExprEngineParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExprEngineParser.MINUS, 0); }
		public MathPmOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathPmOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterMathPmOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitMathPmOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitMathPmOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathPmOperatorContext mathPmOperator() throws RecognitionException {
		MathPmOperatorContext _localctx = new MathPmOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mathPmOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathMdOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ExprEngineParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprEngineParser.DIV, 0); }
		public MathMdOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathMdOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).enterMathMdOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprEngineListener ) ((ExprEngineListener)listener).exitMathMdOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprEngineVisitor ) return ((ExprEngineVisitor<? extends T>)visitor).visitMathMdOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathMdOperatorContext mathMdOperator() throws RecognitionException {
		MathMdOperatorContext _localctx = new MathMdOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mathMdOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MUL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		case 2:
			return expressionAtom_sempred((ExpressionAtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionAtom_sempred(ExpressionAtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001"+
		"\f\u00019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002M\b\u0002\n\u0002\f\u0002P\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003X\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0004\u0005l\b\u0005\u000b\u0005\f\u0005m\u0001\u0005"+
		"\u0001\u0005\u0003\u0005r\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0082\b\u0007\u0001\b\u0001\b\u0004\b\u0086\b\b\u000b\b\f\b\u0087\u0001"+
		"\b\u0003\b\u008b\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u009b\b\r\n\r\f\r\u009e\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0000\u0002\u0002\u0004\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0003"+
		"\u0002\u0000\u0011\u0011\u001a\u001a\u0002\u0000\u0013\u0013\u0017\u0017"+
		"\u0002\u0000\r\r\u0014\u0014\u00b0\u0000 \u0001\u0000\u0000\u0000\u0002"+
		"+\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000"+
		"\fu\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010"+
		"\u008a\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014"+
		"\u0090\u0001\u0000\u0000\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018"+
		"\u0094\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c"+
		"\u009f\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000 !\u0003"+
		"\u0002\u0001\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0006\u0001\uffff"+
		"\uffff\u0000#%\u0003\u0004\u0002\u0000$&\u0005\u0015\u0000\u0000%$\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0005\u0012\u0000\u0000()\u0003\u0004\u0002\u0000),\u0001\u0000\u0000"+
		"\u0000*,\u0003\u0004\u0002\u0000+\"\u0001\u0000\u0000\u0000+*\u0001\u0000"+
		"\u0000\u0000,7\u0001\u0000\u0000\u0000-.\n\u0004\u0000\u0000./\u0003\u0006"+
		"\u0003\u0000/0\u0003\u0002\u0001\u000506\u0001\u0000\u0000\u000012\n\u0003"+
		"\u0000\u000023\u0003\b\u0004\u000034\u0003\u0002\u0001\u000446\u0001\u0000"+
		"\u0000\u00005-\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u0003\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0006\u0002"+
		"\uffff\uffff\u0000;C\u0003\u000e\u0007\u0000<C\u0003\u0018\f\u0000=C\u0003"+
		"\n\u0005\u0000>?\u0005\u0001\u0000\u0000?@\u0003\u0000\u0000\u0000@A\u0005"+
		"\u0002\u0000\u0000AC\u0001\u0000\u0000\u0000B:\u0001\u0000\u0000\u0000"+
		"B<\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000"+
		"\u0000CN\u0001\u0000\u0000\u0000DE\n\u0002\u0000\u0000EF\u0003\u001e\u000f"+
		"\u0000FG\u0003\u0004\u0002\u0003GM\u0001\u0000\u0000\u0000HI\n\u0001\u0000"+
		"\u0000IJ\u0003\u001c\u000e\u0000JK\u0003\u0004\u0002\u0002KM\u0001\u0000"+
		"\u0000\u0000LD\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000MP\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"O\u0005\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QX\u0005\n\u0000"+
		"\u0000RS\u0005\u0003\u0000\u0000SX\u0005\u0003\u0000\u0000TX\u0005\u0016"+
		"\u0000\u0000UV\u0005\u0004\u0000\u0000VX\u0005\u0004\u0000\u0000WQ\u0001"+
		"\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000X\u0007\u0001\u0000\u0000\u0000Yh\u0005\u0005"+
		"\u0000\u0000Zh\u0005\u0006\u0000\u0000[h\u0005\u0007\u0000\u0000\\]\u0005"+
		"\u0007\u0000\u0000]h\u0005\u0005\u0000\u0000^_\u0005\u0006\u0000\u0000"+
		"_h\u0005\u0005\u0000\u0000`a\u0005\u0007\u0000\u0000ah\u0005\u0006\u0000"+
		"\u0000bc\u0005\b\u0000\u0000ch\u0005\u0005\u0000\u0000de\u0005\u0007\u0000"+
		"\u0000ef\u0005\u0005\u0000\u0000fh\u0005\u0006\u0000\u0000gY\u0001\u0000"+
		"\u0000\u0000gZ\u0001\u0000\u0000\u0000g[\u0001\u0000\u0000\u0000g\\\u0001"+
		"\u0000\u0000\u0000g^\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000"+
		"gb\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000"+
		"\u0000ik\u0005\u000b\u0000\u0000jl\u0003\f\u0006\u0000kj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nq\u0001\u0000\u0000\u0000op\u0005\u000f\u0000\u0000pr\u0003"+
		"\u0004\u0002\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0005\u0010\u0000\u0000t\u000b\u0001\u0000"+
		"\u0000\u0000uv\u0005\u001b\u0000\u0000vw\u0003\u0002\u0001\u0000wx\u0005"+
		"\u0019\u0000\u0000xy\u0003\u0004\u0002\u0000y\r\u0001\u0000\u0000\u0000"+
		"z\u0082\u0003\u0010\b\u0000{\u0082\u0003\u0014\n\u0000|\u0082\u0003\u0012"+
		"\t\u0000}~\u0005\u0013\u0000\u0000~\u0082\u0003\u0014\n\u0000\u007f\u0082"+
		"\u0003\u0016\u000b\u0000\u0080\u0082\u0005\u001c\u0000\u0000\u0081z\u0001"+
		"\u0000\u0000\u0000\u0081{\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000"+
		"\u0000\u0081}\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0005\u0018\u0000\u0000\u0084\u0086\u0005\u0018\u0000\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u008b\u0005\u0018\u0000\u0000"+
		"\u008a\u0083\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u0011\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000\u008d"+
		"\u008e\u0005\u000e\u0000\u0000\u008e\u008f\u0003\u0014\n\u0000\u008f\u0013"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0015\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0007\u0000\u0000\u0000\u0093\u0017\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\t\u0000\u0000\u0095\u0096\u0003\u001a"+
		"\r\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u009c\u0005\u001c\u0000"+
		"\u0000\u0098\u0099\t\u0000\u0000\u0000\u0099\u009b\u0005\u001c\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0\u001d\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0007\u0002\u0000\u0000\u00a2\u001f\u0001\u0000\u0000\u0000"+
		"\u000f%+57BLNWgmq\u0081\u0087\u008a\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}