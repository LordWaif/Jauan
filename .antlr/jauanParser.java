// Generated from d:\Victor\Projetos\Jauan\jauan.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jauanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, TIPO=21, STRING=22, ESC=23, INT=24, FLOAT=25, 
		ID=26, ID_LETTER=27, DIGITO=28, MUL=29, DIV=30, ADD=31, SUB=32, OPERADOR=33, 
		WS=34, LINE_COMMENT=35, COMMENT=36;
	public static final int
		RULE_prog = 0, RULE_declar_funcao = 1, RULE_bloco = 2, RULE_retorno = 3, 
		RULE_args_formal = 4, RULE_parametro = 5, RULE_main = 6, RULE_var = 7, 
		RULE_declaracao = 8, RULE_comando = 9, RULE_comando_atribuicao = 10, RULE_break = 11, 
		RULE_op_algebrico = 12, RULE_ifElse = 13, RULE_while = 14, RULE_scanf = 15, 
		RULE_print = 16, RULE_inst_funcao = 17, RULE_args_real = 18, RULE_expr = 19, 
		RULE_expr1 = 20, RULE_value = 21, RULE_num = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declar_funcao", "bloco", "retorno", "args_formal", "parametro", 
			"main", "var", "declaracao", "comando", "comando_atribuicao", "break", 
			"op_algebrico", "ifElse", "while", "scanf", "print", "inst_funcao", "args_real", 
			"expr", "expr1", "value", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'end'", "'return'", "','", "'main'", "'var'", 
			"'const'", "'='", "';'", "'break'", "'if'", "'else'", "'while'", "'scanf'", 
			"'print'", "'!'", "'true'", "'false'", null, null, null, null, null, 
			null, null, null, "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "TIPO", "STRING", 
			"ESC", "INT", "FLOAT", "ID", "ID_LETTER", "DIGITO", "MUL", "DIV", "ADD", 
			"SUB", "OPERADOR", "WS", "LINE_COMMENT", "COMMENT"
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
	public String getGrammarFileName() { return "jauan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jauanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<Declar_funcaoContext> declar_funcao() {
			return getRuleContexts(Declar_funcaoContext.class);
		}
		public Declar_funcaoContext declar_funcao(int i) {
			return getRuleContext(Declar_funcaoContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(46);
				declar_funcao();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			main();
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

	public static class Declar_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jauanParser.ID, 0); }
		public Args_formalContext args_formal() {
			return getRuleContext(Args_formalContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(jauanParser.TIPO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Declar_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar_funcao; }
	}

	public final Declar_funcaoContext declar_funcao() throws RecognitionException {
		Declar_funcaoContext _localctx = new Declar_funcaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declar_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(55);
			match(T__0);
			setState(56);
			args_formal();
			setState(57);
			match(T__1);
			setState(58);
			match(T__2);
			setState(59);
			match(TIPO);
			setState(60);
			bloco();
			setState(61);
			match(T__3);
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

	public static class BlocoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(63);
				var();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(66);
				comando();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RetornoContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << SUB))) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(73);
					value();
					}
					break;
				case 2:
					{
					setState(74);
					expr();
					}
					break;
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Args_formalContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public Args_formalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_formal; }
	}

	public final Args_formalContext args_formal() throws RecognitionException {
		Args_formalContext _localctx = new Args_formalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(80);
				parametro();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(81);
					match(T__5);
					setState(82);
					parametro();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(jauanParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(jauanParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(TIPO);
			setState(91);
			match(ID);
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

	public static class MainContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			match(T__6);
			setState(94);
			match(T__2);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(95);
				var();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(98);
				comando();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__3);
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

	public static class VarContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			match(T__7);
			setState(107);
			match(T__2);
			setState(109); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108);
					declaracao();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(111); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(jauanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jauanParser.ID, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(jauanParser.TIPO, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(113);
				match(T__8);
				setState(114);
				match(ID);
				setState(115);
				match(T__9);
				setState(116);
				value();
				}
				break;
			case 2:
				{
				setState(117);
				match(ID);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(118);
					match(T__5);
					setState(119);
					match(ID);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(T__2);
				setState(126);
				match(TIPO);
				}
				break;
			case 3:
				{
				setState(127);
				match(ID);
				setState(128);
				match(T__9);
				setState(129);
				value();
				setState(130);
				match(T__2);
				setState(131);
				match(TIPO);
				}
				break;
			}
			setState(135);
			match(T__10);
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

	public static class ComandoContext extends ParserRuleContext {
		public List<IfElseContext> ifElse() {
			return getRuleContexts(IfElseContext.class);
		}
		public IfElseContext ifElse(int i) {
			return getRuleContext(IfElseContext.class,i);
		}
		public WhileContext while() {
			return getRuleContext(WhileContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanfContext scanf() {
			return getRuleContext(ScanfContext.class,0);
		}
		public Comando_atribuicaoContext comando_atribuicao() {
			return getRuleContext(Comando_atribuicaoContext.class,0);
		}
		public Inst_funcaoContext inst_funcao() {
			return getRuleContext(Inst_funcaoContext.class,0);
		}
		public BreakContext break() {
			return getRuleContext(BreakContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(137);
						ifElse();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				while();
				}
				break;
			case T__4:
			case T__11:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(143);
					print();
					}
					break;
				case 2:
					{
					setState(144);
					scanf();
					}
					break;
				case 3:
					{
					setState(145);
					comando_atribuicao();
					}
					break;
				case 4:
					{
					setState(146);
					inst_funcao();
					}
					break;
				case 5:
					{
					setState(147);
					break();
					}
					break;
				case 6:
					{
					setState(148);
					retorno();
					}
					break;
				}
				setState(151);
				match(T__10);
				}
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

	public static class Comando_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jauanParser.ID, 0); }
		public Op_algebricoContext op_algebrico() {
			return getRuleContext(Op_algebricoContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Comando_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_atribuicao; }
	}

	public final Comando_atribuicaoContext comando_atribuicao() throws RecognitionException {
		Comando_atribuicaoContext _localctx = new Comando_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(T__9);
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(157);
				op_algebrico(0);
				}
				break;
			case 2:
				{
				setState(158);
				value();
				}
				break;
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

	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
	}

	public final BreakContext break() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__11);
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

	public static class Op_algebricoContext extends ParserRuleContext {
		public Op_algebricoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_algebrico; }
	 
		public Op_algebricoContext() { }
		public void copyFrom(Op_algebricoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnarioContext extends Op_algebricoContext {
		public TerminalNode SUB() { return getToken(jauanParser.SUB, 0); }
		public Op_algebricoContext op_algebrico() {
			return getRuleContext(Op_algebricoContext.class,0);
		}
		public UnarioContext(Op_algebricoContext ctx) { copyFrom(ctx); }
	}
	public static class ParentesesContext extends Op_algebricoContext {
		public Op_algebricoContext op_algebrico() {
			return getRuleContext(Op_algebricoContext.class,0);
		}
		public ParentesesContext(Op_algebricoContext ctx) { copyFrom(ctx); }
	}
	public static class MultDivContext extends Op_algebricoContext {
		public Token op;
		public List<Op_algebricoContext> op_algebrico() {
			return getRuleContexts(Op_algebricoContext.class);
		}
		public Op_algebricoContext op_algebrico(int i) {
			return getRuleContext(Op_algebricoContext.class,i);
		}
		public TerminalNode MUL() { return getToken(jauanParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(jauanParser.DIV, 0); }
		public MultDivContext(Op_algebricoContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubContext extends Op_algebricoContext {
		public Token op;
		public List<Op_algebricoContext> op_algebrico() {
			return getRuleContexts(Op_algebricoContext.class);
		}
		public Op_algebricoContext op_algebrico(int i) {
			return getRuleContext(Op_algebricoContext.class,i);
		}
		public TerminalNode ADD() { return getToken(jauanParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(jauanParser.SUB, 0); }
		public AddSubContext(Op_algebricoContext ctx) { copyFrom(ctx); }
	}
	public static class OperandoContext extends Op_algebricoContext {
		public TerminalNode ID() { return getToken(jauanParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public OperandoContext(Op_algebricoContext ctx) { copyFrom(ctx); }
	}

	public final Op_algebricoContext op_algebrico() throws RecognitionException {
		return op_algebrico(0);
	}

	private Op_algebricoContext op_algebrico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_algebricoContext _localctx = new Op_algebricoContext(_ctx, _parentState);
		Op_algebricoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_op_algebrico, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				match(SUB);
				setState(165);
				op_algebrico(5);
				}
				break;
			case T__0:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(T__0);
				setState(167);
				op_algebrico(0);
				setState(168);
				match(T__1);
				}
				break;
			case INT:
			case FLOAT:
			case ID:
				{
				_localctx = new OperandoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(170);
					match(ID);
					}
					break;
				case INT:
				case FLOAT:
					{
					setState(171);
					num();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						op_algebrico(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						op_algebrico(3);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class IfElseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__12);
			setState(188);
			match(T__0);
			setState(189);
			expr();
			setState(190);
			match(T__1);
			setState(191);
			match(T__2);
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				comando();
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0) );
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(197);
				match(T__13);
				setState(198);
				match(T__2);
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					comando();
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0) );
				}
			}

			setState(206);
			match(T__3);
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

	public static class WhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__14);
			setState(209);
			match(T__0);
			setState(210);
			expr();
			setState(211);
			match(T__1);
			setState(212);
			match(T__2);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(213);
					comando();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(219);
					match(T__11);
					}
				}

				}
				break;
			}
			setState(224);
			match(T__3);
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

	public static class ScanfContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(jauanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jauanParser.ID, i);
		}
		public ScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf; }
	}

	public final ScanfContext scanf() throws RecognitionException {
		ScanfContext _localctx = new ScanfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__15);
			setState(227);
			match(T__0);
			{
			setState(228);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(229);
				match(T__5);
				setState(230);
				match(ID);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(236);
			match(T__1);
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

	public static class PrintContext extends ParserRuleContext {
		public Args_realContext args_real() {
			return getRuleContext(Args_realContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__16);
			setState(239);
			match(T__0);
			setState(240);
			args_real();
			setState(241);
			match(T__1);
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

	public static class Inst_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jauanParser.ID, 0); }
		public Args_realContext args_real() {
			return getRuleContext(Args_realContext.class,0);
		}
		public Inst_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_funcao; }
	}

	public final Inst_funcaoContext inst_funcao() throws RecognitionException {
		Inst_funcaoContext _localctx = new Inst_funcaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inst_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
			setState(244);
			match(T__0);
			setState(245);
			args_real();
			setState(246);
			match(T__1);
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

	public static class Args_realContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Inst_funcaoContext> inst_funcao() {
			return getRuleContexts(Inst_funcaoContext.class);
		}
		public Inst_funcaoContext inst_funcao(int i) {
			return getRuleContext(Inst_funcaoContext.class,i);
		}
		public Args_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_real; }
	}

	public final Args_realContext args_real() throws RecognitionException {
		Args_realContext _localctx = new Args_realContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << SUB))) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(248);
					expr();
					}
					break;
				case 2:
					{
					setState(249);
					value();
					}
					break;
				case 3:
					{
					setState(250);
					inst_funcao();
					}
					break;
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(253);
					match(T__5);
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(254);
						expr();
						}
						break;
					case 2:
						{
						setState(255);
						value();
						}
						break;
					case 3:
						{
						setState(256);
						inst_funcao();
						}
						break;
					}
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Op_algebricoContext op_algebrico() {
			return getRuleContext(Op_algebricoContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__0);
				setState(267);
				expr();
				setState(268);
				match(T__1);
				setState(269);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__17);
				setState(272);
				expr();
				setState(273);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				value();
				setState(276);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				op_algebrico(0);
				setState(279);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public TerminalNode OPERADOR() { return getToken(jauanParser.OPERADOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr1);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(OPERADOR);
				setState(284);
				expr();
				setState(285);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ValueContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode STRING() { return getToken(jauanParser.STRING, 0); }
		public TerminalNode ID() { return getToken(jauanParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				num();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T__19);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(ID);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(jauanParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(jauanParser.FLOAT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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
		case 12:
			return op_algebrico_sempred((Op_algebricoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op_algebrico_sempred(Op_algebricoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\5\4C\n\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13"+
		"\5\3\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\5\6[\n\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\5\bc\n\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\6\tp\n\t\r"+
		"\t\16\tq\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\13\6\13\u008d\n\13\r\13"+
		"\16\13\u008e\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\13\3"+
		"\13\5\13\u009c\n\13\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00af\n\16\5\16\u00b1\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00b9\n\16\f\16\16\16\u00bc\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\6\17\u00c4\n\17\r\17\16\17\u00c5\3\17\3\17\3"+
		"\17\6\17\u00cb\n\17\r\17\16\17\u00cc\5\17\u00cf\n\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00d9\n\20\f\20\16\20\u00dc\13\20\3\20\5"+
		"\20\u00df\n\20\5\20\u00e1\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00ea\n\21\f\21\16\21\u00ed\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00fe\n\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0104\n\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\5\24\u010b"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u011c\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0123\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u012a\n\27\3\30\3\30\3\30\2\3\32\31\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\37 \3\2!\"\3\2\32\33"+
		"\2\u0146\2\63\3\2\2\2\48\3\2\2\2\6B\3\2\2\2\bJ\3\2\2\2\nZ\3\2\2\2\f\\"+
		"\3\2\2\2\16_\3\2\2\2\20l\3\2\2\2\22\u0087\3\2\2\2\24\u009b\3\2\2\2\26"+
		"\u009d\3\2\2\2\30\u00a3\3\2\2\2\32\u00b0\3\2\2\2\34\u00bd\3\2\2\2\36\u00d2"+
		"\3\2\2\2 \u00e4\3\2\2\2\"\u00f0\3\2\2\2$\u00f5\3\2\2\2&\u010a\3\2\2\2"+
		"(\u011b\3\2\2\2*\u0122\3\2\2\2,\u0129\3\2\2\2.\u012b\3\2\2\2\60\62\5\4"+
		"\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2"+
		"\2\2\65\63\3\2\2\2\66\67\5\16\b\2\67\3\3\2\2\289\7\34\2\29:\7\3\2\2:;"+
		"\5\n\6\2;<\7\4\2\2<=\7\5\2\2=>\7\27\2\2>?\5\6\4\2?@\7\6\2\2@\5\3\2\2\2"+
		"AC\5\20\t\2BA\3\2\2\2BC\3\2\2\2CG\3\2\2\2DF\5\24\13\2ED\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3\2\2\2JO\7\7\2\2KN\5,\27\2LN\5"+
		"(\25\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO"+
		"\3\2\2\2RW\5\f\7\2ST\7\b\2\2TV\5\f\7\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2W"+
		"X\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\]\7\27"+
		"\2\2]^\7\34\2\2^\r\3\2\2\2_`\7\t\2\2`b\7\5\2\2ac\5\20\t\2ba\3\2\2\2bc"+
		"\3\2\2\2cg\3\2\2\2df\5\24\13\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jk\7\6\2\2k\17\3\2\2\2lm\7\n\2\2mo\7\5\2\2np\5\22"+
		"\n\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\21\3\2\2\2st\7\13\2\2tu"+
		"\7\34\2\2uv\7\f\2\2v\u0088\5,\27\2w|\7\34\2\2xy\7\b\2\2y{\7\34\2\2zx\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\5\2\2\u0080\u0088\7\27\2\2\u0081\u0082\7\34\2\2\u0082\u0083\7\f\2\2"+
		"\u0083\u0084\5,\27\2\u0084\u0085\7\5\2\2\u0085\u0086\7\27\2\2\u0086\u0088"+
		"\3\2\2\2\u0087s\3\2\2\2\u0087w\3\2\2\2\u0087\u0081\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\7\r\2\2\u008a\23\3\2\2\2\u008b\u008d\5\34\17\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u009c\3\2\2\2\u0090\u009c\5\36\20\2\u0091\u0098\5\"\22\2\u0092"+
		"\u0098\5 \21\2\u0093\u0098\5\26\f\2\u0094\u0098\5$\23\2\u0095\u0098\5"+
		"\30\r\2\u0096\u0098\5\b\5\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\r\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u008c\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u0097\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009e\7\34\2\2\u009e\u00a1\7\f\2\2\u009f\u00a2\5\32\16\2\u00a0"+
		"\u00a2\5,\27\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27\3\2\2"+
		"\2\u00a3\u00a4\7\16\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\b\16\1\2\u00a6\u00a7"+
		"\7\"\2\2\u00a7\u00b1\5\32\16\7\u00a8\u00a9\7\3\2\2\u00a9\u00aa\5\32\16"+
		"\2\u00aa\u00ab\7\4\2\2\u00ab\u00b1\3\2\2\2\u00ac\u00af\7\34\2\2\u00ad"+
		"\u00af\5.\30\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00ba\3\2\2\2\u00b2\u00b3\f\5\2\2\u00b3\u00b4\t\2\2\2\u00b4\u00b9\5\32"+
		"\16\6\u00b5\u00b6\f\4\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b9\5\32\16\5\u00b8"+
		"\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be"+
		"\7\17\2\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\7\4\2\2"+
		"\u00c1\u00c3\7\5\2\2\u00c2\u00c4\5\24\13\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ce\3\2\2\2\u00c7"+
		"\u00c8\7\20\2\2\u00c8\u00ca\7\5\2\2\u00c9\u00cb\5\24\13\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7\6\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\7\21\2\2\u00d3\u00d4"+
		"\7\3\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d6\7\4\2\2\u00d6\u00e0\7\5\2\2\u00d7"+
		"\u00d9\5\24\13\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\7\16\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3"+
		"\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\6\2\2\u00e3\37\3\2\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00e6\7\3\2"+
		"\2\u00e6\u00eb\7\34\2\2\u00e7\u00e8\7\b\2\2\u00e8\u00ea\7\34\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\4\2\2\u00ef"+
		"!\3\2\2\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\5&\24\2"+
		"\u00f3\u00f4\7\4\2\2\u00f4#\3\2\2\2\u00f5\u00f6\7\34\2\2\u00f6\u00f7\7"+
		"\3\2\2\u00f7\u00f8\5&\24\2\u00f8\u00f9\7\4\2\2\u00f9%\3\2\2\2\u00fa\u00fe"+
		"\5(\25\2\u00fb\u00fe\5,\27\2\u00fc\u00fe\5$\23\2\u00fd\u00fa\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0107\3\2\2\2\u00ff\u0103\7\b"+
		"\2\2\u0100\u0104\5(\25\2\u0101\u0104\5,\27\2\u0102\u0104\5$\23\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u00ff\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u00fd\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\'\3\2\2\2\u010c\u010d\7\3\2\2\u010d\u010e"+
		"\5(\25\2\u010e\u010f\7\4\2\2\u010f\u0110\5*\26\2\u0110\u011c\3\2\2\2\u0111"+
		"\u0112\7\24\2\2\u0112\u0113\5(\25\2\u0113\u0114\5*\26\2\u0114\u011c\3"+
		"\2\2\2\u0115\u0116\5,\27\2\u0116\u0117\5*\26\2\u0117\u011c\3\2\2\2\u0118"+
		"\u0119\5\32\16\2\u0119\u011a\5*\26\2\u011a\u011c\3\2\2\2\u011b\u010c\3"+
		"\2\2\2\u011b\u0111\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c"+
		")\3\2\2\2\u011d\u011e\7#\2\2\u011e\u011f\5(\25\2\u011f\u0120\5*\26\2\u0120"+
		"\u0123\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123+\3\2\2\2\u0124\u012a\5.\30\2\u0125\u012a\7\25\2\2\u0126\u012a"+
		"\7\26\2\2\u0127\u012a\7\30\2\2\u0128\u012a\7\34\2\2\u0129\u0124\3\2\2"+
		"\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128"+
		"\3\2\2\2\u012a-\3\2\2\2\u012b\u012c\t\4\2\2\u012c/\3\2\2\2$\63BGMOWZb"+
		"gq|\u0087\u008e\u0097\u009b\u00a1\u00ae\u00b0\u00b8\u00ba\u00c5\u00cc"+
		"\u00ce\u00da\u00de\u00e0\u00eb\u00fd\u0103\u0107\u010a\u011b\u0122\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}