// Generated from c:\Users\bibil\Dropbox\PC\Documents\Jauan\jauan.g4 by ANTLR 4.9.2
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
		TRUE=18, FALSE=19, INT=20, CONST=21, FLOAT=22, TIPO=23, ID_L=24, DIGITO=25, 
		MUL=26, DIV=27, ADD=28, SUB=29, OPERADOR=30, STRING=31, ESC=32, WS=33, 
		LINE_COMMENT=34, COMMENT=35;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_declar_funcao = 2, RULE_args_formal = 3, 
		RULE_bloco = 4, RULE_comando = 5, RULE_retorno = 6, RULE_parametro = 7, 
		RULE_var = 8, RULE_declaracao = 9, RULE_comando_atribuicao = 10, RULE_op_algebrico = 11, 
		RULE_ifElse = 12, RULE_else = 13, RULE_while = 14, RULE_scanf = 15, RULE_print = 16, 
		RULE_break = 17, RULE_inst_funcao = 18, RULE_args_real = 19, RULE_exprRelacionalBinaria = 20, 
		RULE_op_relacional = 21, RULE_exprRelacionalUnaria = 22, RULE_exprAlgebrica = 23, 
		RULE_value = 24, RULE_num = 25, RULE_id = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "declar_funcao", "args_formal", "bloco", "comando", "retorno", 
			"parametro", "var", "declaracao", "comando_atribuicao", "op_algebrico", 
			"ifElse", "else", "while", "scanf", "print", "break", "inst_funcao", 
			"args_real", "exprRelacionalBinaria", "op_relacional", "exprRelacionalUnaria", 
			"exprAlgebrica", "value", "num", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'end'", "'('", "')'", "','", "';'", "'return'", 
			"'var'", "'='", "'if'", "'else'", "'while'", "'scanf'", "'print'", "'break'", 
			"'!'", "'true'", "'false'", null, "'const'", null, null, null, null, 
			"'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TRUE", "FALSE", "INT", "CONST", 
			"FLOAT", "TIPO", "ID_L", "DIGITO", "MUL", "DIV", "ADD", "SUB", "OPERADOR", 
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID_L) {
				{
				{
				setState(54);
				declar_funcao();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(62);
			match(T__0);
			setState(63);
			match(T__1);
			setState(64);
			bloco();
			setState(65);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(67);
			id();
			setState(68);
			match(T__3);
			setState(69);
			args_formal();
			setState(70);
			match(T__4);
			setState(71);
			match(T__1);
			setState(72);
			match(TIPO);
			setState(73);
			bloco();
			setState(74);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(76);
				parametro();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(77);
					match(T__5);
					setState(78);
					parametro();
					}
					}
					setState(83);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(86);
				var();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0)) {
				{
				{
				setState(89);
				comando();
				}
				}
				setState(94);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(95);
						ifElse();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				while();
				}
				break;
			case T__7:
			case T__13:
			case T__14:
			case T__15:
			case ID_L:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(101);
					print();
					}
					break;
				case 2:
					{
					setState(102);
					scanf();
					}
					break;
				case 3:
					{
					setState(103);
					comando_atribuicao();
					}
					break;
				case 4:
					{
					setState(104);
					inst_funcao();
					}
					break;
				case 5:
					{
					setState(105);
					break();
					}
					break;
				case 6:
					{
					setState(106);
					retorno();
					}
					break;
				}
				setState(109);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ExprAlgebricaContext> exprAlgebrica() {
			return getRuleContexts(ExprAlgebricaContext.class);
		}
		public ExprAlgebricaContext exprAlgebrica(int i) {
			return getRuleContext(ExprAlgebricaContext.class,i);
		}
		public List<ExprRelacionalBinariaContext> exprRelacionalBinaria() {
			return getRuleContexts(ExprRelacionalBinariaContext.class);
		}
		public ExprRelacionalBinariaContext exprRelacionalBinaria(int i) {
			return getRuleContext(ExprRelacionalBinariaContext.class,i);
		}
		public List<ExprRelacionalUnariaContext> exprRelacionalUnaria() {
			return getRuleContexts(ExprRelacionalUnariaContext.class);
		}
		public ExprRelacionalUnariaContext exprRelacionalUnaria(int i) {
			return getRuleContext(ExprRelacionalUnariaContext.class,i);
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
			setState(113);
			match(T__7);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID_L) | (1L << SUB) | (1L << STRING))) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(114);
					value();
					}
					break;
				case 2:
					{
					setState(115);
					id();
					}
					break;
				case 3:
					{
					setState(116);
					exprAlgebrica();
					}
					break;
				case 4:
					{
					setState(117);
					exprRelacionalBinaria();
					}
					break;
				case 5:
					{
					setState(118);
					exprRelacionalUnaria();
					}
					break;
				}
				}
				setState(123);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(124);
			match(TIPO);
			setState(125);
			id();
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
			setState(127);
			match(T__8);
			setState(128);
			match(T__1);
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(129);
					declaracao();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
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
		public List<TerminalNode> ID_L() { return getTokens(jauanParser.ID_L); }
		public TerminalNode ID_L(int i) {
			return getToken(jauanParser.ID_L, i);
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
		public List<TerminalNode> ID_L() { return getTokens(jauanParser.ID_L); }
		public TerminalNode ID_L(int i) {
			return getToken(jauanParser.ID_L, i);
		}
		public TerminalNode TIPO() { return getToken(jauanParser.TIPO, 0); }
		public DeclaraVariavelContext(DeclaracaoContext ctx) { copyFrom(ctx); }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new DeclaraConstanteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(CONST);
				setState(135);
				match(ID_L);
				setState(136);
				match(T__9);
				setState(137);
				value();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(138);
					match(T__5);
					setState(139);
					match(ID_L);
					setState(140);
					match(T__9);
					setState(141);
					value();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__6);
				}
				break;
			case ID_L:
				_localctx = new DeclaraVariavelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID_L);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(150);
					match(T__5);
					setState(151);
					match(ID_L);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__1);
				setState(158);
				match(TIPO);
				setState(159);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Op_algebricoContext op_algebrico() {
			return getRuleContext(Op_algebricoContext.class,0);
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
			setState(162);
			id();
			setState(163);
			match(T__9);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(164);
				id();
				}
				break;
			case 2:
				{
				setState(165);
				value();
				}
				break;
			case 3:
				{
				setState(166);
				op_algebrico(0);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				match(SUB);
				setState(171);
				op_algebrico(5);
				}
				break;
			case T__3:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__3);
				setState(173);
				op_algebrico(0);
				setState(174);
				match(T__4);
				}
				break;
			case INT:
			case FLOAT:
			case ID_L:
				{
				_localctx = new OperandoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID_L:
					{
					setState(176);
					id();
					}
					break;
				case INT:
				case FLOAT:
					{
					setState(177);
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
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
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
						setState(184);
						op_algebrico(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
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
						setState(187);
						op_algebrico(3);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public ExprRelacionalBinariaContext exprRelacionalBinaria() {
			return getRuleContext(ExprRelacionalBinariaContext.class,0);
		}
		public ExprRelacionalUnariaContext exprRelacionalUnaria() {
			return getRuleContext(ExprRelacionalUnariaContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ElseContext else() {
			return getRuleContext(ElseContext.class,0);
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
			setState(193);
			match(T__10);
			setState(194);
			match(T__3);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(195);
				exprRelacionalBinaria();
				}
				break;
			case 2:
				{
				setState(196);
				exprRelacionalUnaria();
				}
				break;
			}
			setState(199);
			match(T__4);
			setState(200);
			match(T__1);
			{
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				comando();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0) );
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(206);
				else();
				}
			}

			setState(209);
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

	public static class ElseContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__11);
			setState(212);
			match(T__1);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				comando();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0) );
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
		public ExprRelacionalBinariaContext exprRelacionalBinaria() {
			return getRuleContext(ExprRelacionalBinariaContext.class,0);
		}
		public ExprRelacionalUnariaContext exprRelacionalUnaria() {
			return getRuleContext(ExprRelacionalUnariaContext.class,0);
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
			setState(218);
			match(T__12);
			setState(219);
			match(T__3);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(220);
				exprRelacionalBinaria();
				}
				break;
			case 2:
				{
				setState(221);
				exprRelacionalUnaria();
				}
				break;
			}
			setState(224);
			match(T__4);
			setState(225);
			match(T__1);
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				comando();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0) );
			setState(231);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			setState(233);
			match(T__13);
			setState(234);
			match(T__3);
			{
			setState(235);
			id();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(236);
				match(T__5);
				setState(237);
				id();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
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
			setState(245);
			match(T__14);
			setState(246);
			match(T__3);
			setState(247);
			args_real();
			setState(248);
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
		enterRule(_localctx, 34, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_inst_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			id();
			setState(253);
			match(T__3);
			setState(254);
			args_real();
			setState(255);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
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
		public List<ExprRelacionalBinariaContext> exprRelacionalBinaria() {
			return getRuleContexts(ExprRelacionalBinariaContext.class);
		}
		public ExprRelacionalBinariaContext exprRelacionalBinaria(int i) {
			return getRuleContext(ExprRelacionalBinariaContext.class,i);
		}
		public List<ExprRelacionalUnariaContext> exprRelacionalUnaria() {
			return getRuleContexts(ExprRelacionalUnariaContext.class);
		}
		public ExprRelacionalUnariaContext exprRelacionalUnaria(int i) {
			return getRuleContext(ExprRelacionalUnariaContext.class,i);
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
		enterRule(_localctx, 38, RULE_args_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID_L) | (1L << SUB) | (1L << STRING))) != 0)) {
				{
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(257);
					id();
					}
					break;
				case 2:
					{
					setState(258);
					value();
					}
					break;
				case 3:
					{
					setState(259);
					exprAlgebrica();
					}
					break;
				case 4:
					{
					setState(260);
					exprRelacionalBinaria();
					}
					break;
				case 5:
					{
					setState(261);
					exprRelacionalUnaria();
					}
					break;
				case 6:
					{
					setState(262);
					inst_funcao();
					}
					break;
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(265);
					match(T__5);
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(266);
						id();
						}
						break;
					case 2:
						{
						setState(267);
						value();
						}
						break;
					case 3:
						{
						setState(268);
						exprAlgebrica();
						}
						break;
					case 4:
						{
						setState(269);
						exprRelacionalBinaria();
						}
						break;
					case 5:
						{
						setState(270);
						exprRelacionalUnaria();
						}
						break;
					case 6:
						{
						setState(271);
						inst_funcao();
						}
						break;
					}
					}
					}
					setState(278);
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

	public static class ExprRelacionalBinariaContext extends ParserRuleContext {
		public List<Op_relacionalContext> op_relacional() {
			return getRuleContexts(Op_relacionalContext.class);
		}
		public Op_relacionalContext op_relacional(int i) {
			return getRuleContext(Op_relacionalContext.class,i);
		}
		public TerminalNode OPERADOR() { return getToken(jauanParser.OPERADOR, 0); }
		public ExprRelacionalBinariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacionalBinaria; }
	}

	public final ExprRelacionalBinariaContext exprRelacionalBinaria() throws RecognitionException {
		ExprRelacionalBinariaContext _localctx = new ExprRelacionalBinariaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprRelacionalBinaria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(281);
			op_relacional();
			setState(282);
			match(OPERADOR);
			setState(283);
			op_relacional();
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprRelacionalUnariaContext exprRelacionalUnaria() {
			return getRuleContext(ExprRelacionalUnariaContext.class,0);
		}
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_L:
				{
				setState(285);
				id();
				}
				break;
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(286);
				value();
				}
				break;
			case T__16:
				{
				setState(287);
				exprRelacionalUnaria();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprRelacionalUnariaContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprRelacionalUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacionalUnaria; }
	}

	public final ExprRelacionalUnariaContext exprRelacionalUnaria() throws RecognitionException {
		ExprRelacionalUnariaContext _localctx = new ExprRelacionalUnariaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprRelacionalUnaria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(290);
			match(T__16);
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_L:
				{
				setState(291);
				id();
				}
				break;
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(292);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 46, RULE_exprAlgebrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				num();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(FALSE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(STRING);
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
		enterRule(_localctx, 50, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_L() { return getToken(jauanParser.ID_L, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ID_L);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5R"+
		"\n\5\f\5\16\5U\13\5\5\5W\n\5\3\6\5\6Z\n\6\3\6\7\6]\n\6\f\6\16\6`\13\6"+
		"\3\7\6\7c\n\7\r\7\16\7d\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\5"+
		"\7r\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\6\n\u0085\n\n\r\n\16\n\u0086\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0091\n\13\f\13\16\13\u0094\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\13\3\13\3\13\5\13\u00a3"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00b5\n\r\5\r\u00b7\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bf\n"+
		"\r\f\r\16\r\u00c2\13\r\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16\3"+
		"\16\6\16\u00cd\n\16\r\16\16\16\u00ce\3\16\5\16\u00d2\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\6\17\u00d9\n\17\r\17\16\17\u00da\3\20\3\20\3\20\3\20\5\20"+
		"\u00e1\n\20\3\20\3\20\3\20\6\20\u00e6\n\20\r\20\16\20\u00e7\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u00f1\n\21\f\21\16\21\u00f4\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u010a\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0113\n\25\7\25\u0115\n\25\f\25\16\25\u0118\13\25\5\25\u011a"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0123\n\27\3\30\3\30\3\30"+
		"\5\30\u0128\n\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0130\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\2\3\30\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\5\3\2\34\35\3\2\36\37\4\2\26\26\30\30\2\u0150\2;"+
		"\3\2\2\2\4@\3\2\2\2\6E\3\2\2\2\bV\3\2\2\2\nY\3\2\2\2\fq\3\2\2\2\16s\3"+
		"\2\2\2\20~\3\2\2\2\22\u0081\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2"+
		"\30\u00b6\3\2\2\2\32\u00c3\3\2\2\2\34\u00d5\3\2\2\2\36\u00dc\3\2\2\2 "+
		"\u00eb\3\2\2\2\"\u00f7\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0119\3"+
		"\2\2\2*\u011b\3\2\2\2,\u0122\3\2\2\2.\u0124\3\2\2\2\60\u0129\3\2\2\2\62"+
		"\u012f\3\2\2\2\64\u0131\3\2\2\2\66\u0133\3\2\2\28:\5\6\4\298\3\2\2\2:"+
		"=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5\4\3\2?\3\3\2\2\2"+
		"@A\7\3\2\2AB\7\4\2\2BC\5\n\6\2CD\7\5\2\2D\5\3\2\2\2EF\5\66\34\2FG\7\6"+
		"\2\2GH\5\b\5\2HI\7\7\2\2IJ\7\4\2\2JK\7\31\2\2KL\5\n\6\2LM\7\5\2\2M\7\3"+
		"\2\2\2NS\5\20\t\2OP\7\b\2\2PR\5\20\t\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2S"+
		"T\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XZ\5\22\n"+
		"\2YX\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[]\5\f\7\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_\13\3\2\2\2`^\3\2\2\2ac\5\32\16\2ba\3\2\2\2cd\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2er\3\2\2\2fr\5\36\20\2gn\5\"\22\2hn\5 \21\2in\5\26"+
		"\f\2jn\5&\24\2kn\5$\23\2ln\5\16\b\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2mj\3"+
		"\2\2\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2op\7\t\2\2pr\3\2\2\2qb\3\2\2\2qf\3"+
		"\2\2\2qm\3\2\2\2r\r\3\2\2\2s{\7\n\2\2tz\5\62\32\2uz\5\66\34\2vz\5\60\31"+
		"\2wz\5*\26\2xz\5.\30\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}{\3\2\2\2~\177\7\31\2\2\177"+
		"\u0080\5\66\34\2\u0080\21\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0084\7\4"+
		"\2\2\u0083\u0085\5\24\13\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u0089\7\27\2"+
		"\2\u0089\u008a\7\32\2\2\u008a\u008b\7\f\2\2\u008b\u0092\5\62\32\2\u008c"+
		"\u008d\7\b\2\2\u008d\u008e\7\32\2\2\u008e\u008f\7\f\2\2\u008f\u0091\5"+
		"\62\32\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\t"+
		"\2\2\u0096\u00a3\3\2\2\2\u0097\u009c\7\32\2\2\u0098\u0099\7\b\2\2\u0099"+
		"\u009b\7\32\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\4\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a3\7\t\2\2\u00a2\u0088\3"+
		"\2\2\2\u00a2\u0097\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\5\66\34\2\u00a5"+
		"\u00a9\7\f\2\2\u00a6\u00aa\5\66\34\2\u00a7\u00aa\5\62\32\2\u00a8\u00aa"+
		"\5\30\r\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\27\3\2\2\2\u00ab\u00ac\b\r\1\2\u00ac\u00ad\7\37\2\2\u00ad\u00b7"+
		"\5\30\r\7\u00ae\u00af\7\6\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\7\2\2"+
		"\u00b1\u00b7\3\2\2\2\u00b2\u00b5\5\66\34\2\u00b3\u00b5\5\64\33\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ab\3\2"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00c0\3\2\2\2\u00b8"+
		"\u00b9\f\5\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00bf\5\30\r\6\u00bb\u00bc\f"+
		"\4\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00bf\5\30\r\5\u00be\u00b8\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\31\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c7"+
		"\7\6\2\2\u00c5\u00c8\5*\26\2\u00c6\u00c8\5.\30\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cc\7\4"+
		"\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2\5\34"+
		"\17\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7\5\2\2\u00d4\33\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d8\7\4\2"+
		"\2\u00d7\u00d9\5\f\7\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\35\3\2\2\2\u00dc\u00dd\7\17\2\2\u00dd"+
		"\u00e0\7\6\2\2\u00de\u00e1\5*\26\2\u00df\u00e1\5.\30\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\7\2\2\u00e3"+
		"\u00e5\7\4\2\2\u00e4\u00e6\5\f\7\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\7\5\2\2\u00ea\37\3\2\2\2\u00eb\u00ec\7\20\2\2\u00ec\u00ed\7\6\2"+
		"\2\u00ed\u00f2\5\66\34\2\u00ee\u00ef\7\b\2\2\u00ef\u00f1\5\66\34\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\7\2\2\u00f6"+
		"!\3\2\2\2\u00f7\u00f8\7\21\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fa\5(\25\2"+
		"\u00fa\u00fb\7\7\2\2\u00fb#\3\2\2\2\u00fc\u00fd\7\22\2\2\u00fd%\3\2\2"+
		"\2\u00fe\u00ff\5\66\34\2\u00ff\u0100\7\6\2\2\u0100\u0101\5(\25\2\u0101"+
		"\u0102\7\7\2\2\u0102\'\3\2\2\2\u0103\u010a\5\66\34\2\u0104\u010a\5\62"+
		"\32\2\u0105\u010a\5\60\31\2\u0106\u010a\5*\26\2\u0107\u010a\5.\30\2\u0108"+
		"\u010a\5&\24\2\u0109\u0103\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0105\3\2"+
		"\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u0116\3\2\2\2\u010b\u0112\7\b\2\2\u010c\u0113\5\66\34\2\u010d\u0113\5"+
		"\62\32\2\u010e\u0113\5\60\31\2\u010f\u0113\5*\26\2\u0110\u0113\5.\30\2"+
		"\u0111\u0113\5&\24\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010e"+
		"\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u010b\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u0109\3\2\2\2\u0119\u011a\3\2\2\2\u011a)\3\2\2\2\u011b\u011c\5,\27\2"+
		"\u011c\u011d\7 \2\2\u011d\u011e\5,\27\2\u011e+\3\2\2\2\u011f\u0123\5\66"+
		"\34\2\u0120\u0123\5\62\32\2\u0121\u0123\5.\30\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123-\3\2\2\2\u0124\u0127\7\23\2\2"+
		"\u0125\u0128\5\66\34\2\u0126\u0128\5\62\32\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128/\3\2\2\2\u0129\u012a\5\30\r\2\u012a\61\3\2\2\2\u012b"+
		"\u0130\5\64\33\2\u012c\u0130\7\24\2\2\u012d\u0130\7\25\2\2\u012e\u0130"+
		"\7!\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\63\3\2\2\2\u0131\u0132\t\4\2\2\u0132\65\3\2\2\2\u0133"+
		"\u0134\7\32\2\2\u0134\67\3\2\2\2#;SVY^dmqy{\u0086\u0092\u009c\u00a2\u00a9"+
		"\u00b4\u00b6\u00be\u00c0\u00c7\u00ce\u00d1\u00da\u00e0\u00e7\u00f2\u0109"+
		"\u0112\u0116\u0119\u0122\u0127\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}