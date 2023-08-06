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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TRUE=17, 
		FALSE=18, INT=19, CONST=20, FLOAT=21, TIPO=22, ID=23, ID_LETTER=24, DIGITO=25, 
		MUL=26, DIV=27, ADD=28, SUB=29, OPERADOR=30, STRING=31, ESC=32, WS=33, 
		LINE_COMMENT=34, COMMENT=35;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_declar_funcao = 2, RULE_args_formal = 3, 
		RULE_bloco = 4, RULE_comando = 5, RULE_retorno = 6, RULE_parametro = 7, 
		RULE_var = 8, RULE_declaracao = 9, RULE_comando_atribuicao = 10, RULE_op_algebrico = 11, 
		RULE_ifElse = 12, RULE_while = 13, RULE_scanf = 14, RULE_print = 15, RULE_break = 16, 
		RULE_inst_funcao = 17, RULE_args_real = 18, RULE_exprRelacional = 19, 
		RULE_exprAlgebrica = 20, RULE_value = 21, RULE_num = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "declar_funcao", "args_formal", "bloco", "comando", "retorno", 
			"parametro", "var", "declaracao", "comando_atribuicao", "op_algebrico", 
			"ifElse", "while", "scanf", "print", "break", "inst_funcao", "args_real", 
			"exprRelacional", "exprAlgebrica", "value", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'end'", "'('", "')'", "','", "';'", "'return'", 
			"'var'", "'='", "'if'", "'else'", "'while'", "'scanf'", "'print'", "'break'", 
			"'true'", "'false'", null, "'const'", null, null, null, null, null, "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TRUE", "FALSE", "INT", "CONST", "FLOAT", 
			"TIPO", "ID", "ID_LETTER", "DIGITO", "MUL", "DIV", "ADD", "SUB", "OPERADOR", 
			"STRING", "ESC", "WS", "LINE_COMMENT", "COMMENT"
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

	public static class MainContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			match(T__0);
			setState(55);
			match(T__1);
			setState(56);
			bloco();
			setState(57);
			match(T__2);
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
		enterRule(_localctx, 4, RULE_declar_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(T__3);
			setState(61);
			args_formal();
			setState(62);
			match(T__4);
			setState(63);
			match(T__1);
			setState(64);
			match(TIPO);
			setState(65);
			bloco();
			setState(66);
			match(T__2);
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
		enterRule(_localctx, 6, RULE_args_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(68);
				parametro();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(69);
					match(T__5);
					setState(70);
					parametro();
					}
					}
					setState(75);
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
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(78);
				var();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(81);
				comando();
				}
				}
				setState(86);
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
		enterRule(_localctx, 10, RULE_comando);
		try {
			int _alt;
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						ifElse();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				while();
				}
				break;
			case T__7:
			case T__13:
			case T__14:
			case T__15:
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(93);
					print();
					}
					break;
				case 2:
					{
					setState(94);
					scanf();
					}
					break;
				case 3:
					{
					setState(95);
					comando_atribuicao();
					}
					break;
				case 4:
					{
					setState(96);
					inst_funcao();
					}
					break;
				case 5:
					{
					setState(97);
					break();
					}
					break;
				case 6:
					{
					setState(98);
					retorno();
					}
					break;
				}
				setState(101);
				match(T__6);
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

	public static class RetornoContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ExprAlgebricaContext> exprAlgebrica() {
			return getRuleContexts(ExprAlgebricaContext.class);
		}
		public ExprAlgebricaContext exprAlgebrica(int i) {
			return getRuleContext(ExprAlgebricaContext.class,i);
		}
		public List<ExprRelacionalContext> exprRelacional() {
			return getRuleContexts(ExprRelacionalContext.class);
		}
		public ExprRelacionalContext exprRelacional(int i) {
			return getRuleContext(ExprRelacionalContext.class,i);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__7);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << SUB) | (1L << STRING))) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(106);
					value();
					}
					break;
				case 2:
					{
					setState(107);
					exprAlgebrica();
					}
					break;
				case 3:
					{
					setState(108);
					exprRelacional();
					}
					break;
				}
				}
				setState(113);
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
		enterRule(_localctx, 14, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(TIPO);
			setState(115);
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
		enterRule(_localctx, 16, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			match(T__1);
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					declaracao();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaraConstanteContext extends DeclaracaoContext {
		public TerminalNode CONST() { return getToken(jauanParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(jauanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jauanParser.ID, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DeclaraConstanteContext(DeclaracaoContext ctx) { copyFrom(ctx); }
	}
	public static class DeclaraVariavelContext extends DeclaracaoContext {
		public List<TerminalNode> ID() { return getTokens(jauanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jauanParser.ID, i);
		}
		public TerminalNode TIPO() { return getToken(jauanParser.TIPO, 0); }
		public DeclaraVariavelContext(DeclaracaoContext ctx) { copyFrom(ctx); }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new DeclaraConstanteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(124);
					match(CONST);
					setState(125);
					match(ID);
					setState(126);
					match(T__9);
					setState(127);
					value();
					}
					break;
				case 2:
					{
					setState(128);
					match(CONST);
					setState(129);
					match(ID);
					setState(130);
					match(T__9);
					setState(131);
					value();
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(132);
						match(T__5);
						setState(133);
						match(ID);
						setState(134);
						match(T__9);
						setState(135);
						value();
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(143);
				match(T__6);
				}
				break;
			case ID:
				_localctx = new DeclaraVariavelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(ID);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(146);
					match(T__5);
					setState(147);
					match(ID);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__1);
				setState(154);
				match(TIPO);
				setState(155);
				match(T__6);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ID);
				setState(159);
				match(T__9);
				setState(160);
				op_algebrico(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				value();
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_op_algebrico, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				match(SUB);
				setState(166);
				op_algebrico(5);
				}
				break;
			case T__3:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__3);
				setState(168);
				op_algebrico(0);
				setState(169);
				match(T__4);
				}
				break;
			case INT:
			case FLOAT:
			case ID:
				{
				_localctx = new OperandoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(171);
					match(ID);
					}
					break;
				case INT:
				case FLOAT:
					{
					setState(172);
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
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
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
						setState(179);
						op_algebrico(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
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
						setState(182);
						op_algebrico(3);
						}
						break;
					}
					} 
				}
				setState(187);
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
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
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
		enterRule(_localctx, 24, RULE_ifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__10);
			setState(189);
			match(T__3);
			setState(190);
			exprRelacional();
			setState(191);
			match(T__4);
			setState(192);
			match(T__1);
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				comando();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << STRING))) != 0) );
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(198);
				match(T__11);
				setState(199);
				match(T__1);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					comando();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << STRING))) != 0) );
				}
			}

			setState(207);
			match(T__2);
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
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
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
		enterRule(_localctx, 26, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__12);
			setState(210);
			match(T__3);
			setState(211);
			exprRelacional();
			setState(212);
			match(T__4);
			setState(213);
			match(T__1);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				comando();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << STRING))) != 0) );
			setState(219);
			match(T__2);
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
		enterRule(_localctx, 28, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__13);
			setState(222);
			match(T__3);
			{
			setState(223);
			match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(224);
				match(T__5);
				setState(225);
				match(ID);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(231);
			match(T__4);
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
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__14);
			setState(234);
			match(T__3);
			setState(235);
			args_real();
			setState(236);
			match(T__4);
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
		enterRule(_localctx, 32, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__15);
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
			setState(240);
			match(ID);
			setState(241);
			match(T__3);
			setState(242);
			args_real();
			setState(243);
			match(T__4);
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
		public List<ExprAlgebricaContext> exprAlgebrica() {
			return getRuleContexts(ExprAlgebricaContext.class);
		}
		public ExprAlgebricaContext exprAlgebrica(int i) {
			return getRuleContext(ExprAlgebricaContext.class,i);
		}
		public List<ExprRelacionalContext> exprRelacional() {
			return getRuleContexts(ExprRelacionalContext.class);
		}
		public ExprRelacionalContext exprRelacional(int i) {
			return getRuleContext(ExprRelacionalContext.class,i);
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
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << SUB) | (1L << STRING))) != 0)) {
				{
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(245);
					exprAlgebrica();
					}
					break;
				case 2:
					{
					setState(246);
					exprRelacional();
					}
					break;
				case 3:
					{
					setState(247);
					value();
					}
					break;
				case 4:
					{
					setState(248);
					inst_funcao();
					}
					break;
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(251);
					match(T__5);
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(252);
						exprAlgebrica();
						}
						break;
					case 2:
						{
						setState(253);
						exprRelacional();
						}
						break;
					case 3:
						{
						setState(254);
						value();
						}
						break;
					case 4:
						{
						setState(255);
						inst_funcao();
						}
						break;
					}
					}
					}
					setState(262);
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

	public static class ExprRelacionalContext extends ParserRuleContext {
		public TerminalNode OPERADOR() { return getToken(jauanParser.OPERADOR, 0); }
		public List<TerminalNode> ID() { return getTokens(jauanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jauanParser.ID, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
	}

	public final ExprRelacionalContext exprRelacional() throws RecognitionException {
		ExprRelacionalContext _localctx = new ExprRelacionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(265);
				match(ID);
				}
				break;
			case 2:
				{
				setState(266);
				value();
				}
				break;
			}
			setState(269);
			match(OPERADOR);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(270);
				match(ID);
				}
				break;
			case 2:
				{
				setState(271);
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

	public static class ExprAlgebricaContext extends ParserRuleContext {
		public Op_algebricoContext op_algebrico() {
			return getRuleContext(Op_algebricoContext.class,0);
		}
		public ExprAlgebricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAlgebrica; }
	}

	public final ExprAlgebricaContext exprAlgebrica() throws RecognitionException {
		ExprAlgebricaContext _localctx = new ExprAlgebricaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprAlgebrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			op_algebrico(0);
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
		public TerminalNode TRUE() { return getToken(jauanParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(jauanParser.FALSE, 0); }
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
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				num();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(FALSE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
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
			setState(283);
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
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\5\5O\n\5\3\6\5\6"+
		"R\n\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\6\7[\n\7\r\7\16\7\\\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\7\bp\n\b\f"+
		"\b\16\bs\13\b\3\t\3\t\3\t\3\n\3\n\3\n\6\n{\n\n\r\n\16\n|\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16"+
		"\13\u008e\13\13\5\13\u0090\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u0097\n"+
		"\13\f\13\16\13\u009a\13\13\3\13\3\13\3\13\5\13\u009f\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b0\n\r\5"+
		"\r\u00b2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00c5\n\16\r\16\16\16\u00c6\3\16\3"+
		"\16\3\16\6\16\u00cc\n\16\r\16\16\16\u00cd\5\16\u00d0\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\6\17\u00da\n\17\r\17\16\17\u00db\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00fc\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0103\n"+
		"\24\7\24\u0105\n\24\f\24\16\24\u0108\13\24\5\24\u010a\n\24\3\25\3\25\5"+
		"\25\u010e\n\25\3\25\3\25\3\25\5\25\u0113\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u011c\n\27\3\30\3\30\3\30\2\3\30\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\34\35\3\2\36\37\4\2\25\25\27\27"+
		"\2\u0136\2\63\3\2\2\2\48\3\2\2\2\6=\3\2\2\2\bN\3\2\2\2\nQ\3\2\2\2\fi\3"+
		"\2\2\2\16k\3\2\2\2\20t\3\2\2\2\22w\3\2\2\2\24\u009e\3\2\2\2\26\u00a4\3"+
		"\2\2\2\30\u00b1\3\2\2\2\32\u00be\3\2\2\2\34\u00d3\3\2\2\2\36\u00df\3\2"+
		"\2\2 \u00eb\3\2\2\2\"\u00f0\3\2\2\2$\u00f2\3\2\2\2&\u0109\3\2\2\2(\u010d"+
		"\3\2\2\2*\u0114\3\2\2\2,\u011b\3\2\2\2.\u011d\3\2\2\2\60\62\5\6\4\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65"+
		"\63\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\289\7\3\2\29:\7\4\2\2:;\5\n\6\2;"+
		"<\7\5\2\2<\5\3\2\2\2=>\7\31\2\2>?\7\6\2\2?@\5\b\5\2@A\7\7\2\2AB\7\4\2"+
		"\2BC\7\30\2\2CD\5\n\6\2DE\7\5\2\2E\7\3\2\2\2FK\5\20\t\2GH\7\b\2\2HJ\5"+
		"\20\t\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF"+
		"\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PR\5\22\n\2QP\3\2\2\2QR\3\2\2\2RV\3\2\2\2"+
		"SU\5\f\7\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2"+
		"\2Y[\5\32\16\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]j\3\2\2\2^j"+
		"\5\34\17\2_f\5 \21\2`f\5\36\20\2af\5\26\f\2bf\5$\23\2cf\5\"\22\2df\5\16"+
		"\b\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2"+
		"\2\2gh\7\t\2\2hj\3\2\2\2iZ\3\2\2\2i^\3\2\2\2ie\3\2\2\2j\r\3\2\2\2kq\7"+
		"\n\2\2lp\5,\27\2mp\5*\26\2np\5(\25\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq\3\2\2\2tu\7\30\2\2uv\7\31\2\2"+
		"v\21\3\2\2\2wx\7\13\2\2xz\7\4\2\2y{\5\24\13\2zy\3\2\2\2{|\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\23\3\2\2\2~\177\7\26\2\2\177\u0080\7\31\2\2\u0080\u0081"+
		"\7\f\2\2\u0081\u0090\5,\27\2\u0082\u0083\7\26\2\2\u0083\u0084\7\31\2\2"+
		"\u0084\u0085\7\f\2\2\u0085\u008c\5,\27\2\u0086\u0087\7\b\2\2\u0087\u0088"+
		"\7\31\2\2\u0088\u0089\7\f\2\2\u0089\u008b\5,\27\2\u008a\u0086\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f~\3\2\2\2\u008f\u0082\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\t\2\2\u0092\u009f\3\2\2\2\u0093\u0098\7\31"+
		"\2\2\u0094\u0095\7\b\2\2\u0095\u0097\7\31\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\4\2\2\u009c\u009d\7\30\2\2\u009d"+
		"\u009f\7\t\2\2\u009e\u008f\3\2\2\2\u009e\u0093\3\2\2\2\u009f\25\3\2\2"+
		"\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a5\5\30\r\2\u00a3"+
		"\u00a5\5,\27\2\u00a4\u00a0\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2"+
		"\2\u00a6\u00a7\b\r\1\2\u00a7\u00a8\7\37\2\2\u00a8\u00b2\5\30\r\7\u00a9"+
		"\u00aa\7\6\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\7\2\2\u00ac\u00b2\3"+
		"\2\2\2\u00ad\u00b0\7\31\2\2\u00ae\u00b0\5.\30\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00a9\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00bb\3\2\2\2\u00b3\u00b4\f\5\2\2\u00b4"+
		"\u00b5\t\2\2\2\u00b5\u00ba\5\30\r\6\u00b6\u00b7\f\4\2\2\u00b7\u00b8\t"+
		"\3\2\2\u00b8\u00ba\5\30\r\5\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1"+
		"\5(\25\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\7\4\2\2\u00c3\u00c5\5\f\7\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00cf\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00cb\7\4\2\2\u00ca"+
		"\u00cc\5\f\7\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\5\2\2\u00d2\33\3\2\2"+
		"\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6\5(\25\2\u00d6"+
		"\u00d7\7\7\2\2\u00d7\u00d9\7\4\2\2\u00d8\u00da\5\f\7\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\5\2\2\u00de\35\3\2\2\2\u00df\u00e0\7\20\2"+
		"\2\u00e0\u00e1\7\6\2\2\u00e1\u00e6\7\31\2\2\u00e2\u00e3\7\b\2\2\u00e3"+
		"\u00e5\7\31\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7\7\2\2\u00ea\37\3\2\2\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed\7\6\2"+
		"\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\7\7\2\2\u00ef!\3\2\2\2\u00f0\u00f1"+
		"\7\22\2\2\u00f1#\3\2\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\7\6\2\2\u00f4"+
		"\u00f5\5&\24\2\u00f5\u00f6\7\7\2\2\u00f6%\3\2\2\2\u00f7\u00fc\5*\26\2"+
		"\u00f8\u00fc\5(\25\2\u00f9\u00fc\5,\27\2\u00fa\u00fc\5$\23\2\u00fb\u00f7"+
		"\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u0106\3\2\2\2\u00fd\u0102\7\b\2\2\u00fe\u0103\5*\26\2\u00ff\u0103\5("+
		"\25\2\u0100\u0103\5,\27\2\u0101\u0103\5$\23\2\u0102\u00fe\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u00fd\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u00fb\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\'\3\2\2\2\u010b\u010e\7\31\2\2\u010c\u010e"+
		"\5,\27\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0112\7 \2\2\u0110\u0113\7\31\2\2\u0111\u0113\5,\27\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0111\3\2\2\2\u0113)\3\2\2\2\u0114\u0115\5\30\r\2\u0115+\3"+
		"\2\2\2\u0116\u011c\5.\30\2\u0117\u011c\7\23\2\2\u0118\u011c\7\24\2\2\u0119"+
		"\u011c\7!\2\2\u011a\u011c\7\31\2\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2"+
		"\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"-\3\2\2\2\u011d\u011e\t\4\2\2\u011e/\3\2\2\2\"\63KNQV\\eioq|\u008c\u008f"+
		"\u0098\u009e\u00a4\u00af\u00b1\u00b9\u00bb\u00c6\u00cd\u00cf\u00db\u00e6"+
		"\u00fb\u0102\u0106\u0109\u010d\u0112\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}