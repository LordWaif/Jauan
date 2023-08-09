// Generated from c:\Users\marce\OneDrive\Área de Trabalho\Jauan\jauan.g4 by ANTLR 4.9.2
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
		RULE_ifElse = 12, RULE_while = 13, RULE_scanf = 14, RULE_print = 15, RULE_break = 16, 
		RULE_inst_funcao = 17, RULE_args_real = 18, RULE_exprRelacionalBinaria = 19, 
		RULE_op_relacional = 20, RULE_exprRelacionalUnaria = 21, RULE_exprAlgebrica = 22, 
		RULE_value = 23, RULE_num = 24, RULE_id = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "declar_funcao", "args_formal", "bloco", "comando", "retorno", 
			"parametro", "var", "declaracao", "comando_atribuicao", "op_algebrico", 
			"ifElse", "while", "scanf", "print", "break", "inst_funcao", "args_real", 
			"exprRelacionalBinaria", "op_relacional", "exprRelacionalUnaria", "exprAlgebrica", 
			"value", "num", "id"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID_L) {
				{
				{
				setState(52);
				declar_funcao();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
			setState(60);
			match(T__0);
			setState(61);
			match(T__1);
			setState(62);
			bloco();
			setState(63);
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
			setState(65);
			id();
			setState(66);
			match(T__3);
			setState(67);
			args_formal();
			setState(68);
			match(T__4);
			setState(69);
			match(T__1);
			setState(70);
			match(TIPO);
			setState(71);
			bloco();
			setState(72);
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(74);
				parametro();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(75);
					match(T__5);
					setState(76);
					parametro();
					}
					}
					setState(81);
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(84);
				var();
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0)) {
				{
				{
				setState(87);
				comando();
				}
				}
				setState(92);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(93);
						ifElse();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(96); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(99);
					print();
					}
					break;
				case 2:
					{
					setState(100);
					scanf();
					}
					break;
				case 3:
					{
					setState(101);
					comando_atribuicao();
					}
					break;
				case 4:
					{
					setState(102);
					inst_funcao();
					}
					break;
				case 5:
					{
					setState(103);
					break();
					}
					break;
				case 6:
					{
					setState(104);
					retorno();
					}
					break;
				}
				setState(107);
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
			setState(111);
			match(T__7);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID_L) | (1L << SUB) | (1L << STRING))) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(112);
					value();
					}
					break;
				case 2:
					{
					setState(113);
					id();
					}
					break;
				case 3:
					{
					setState(114);
					exprAlgebrica();
					}
					break;
				case 4:
					{
					setState(115);
					exprRelacionalBinaria();
					}
					break;
				case 5:
					{
					setState(116);
					exprRelacionalUnaria();
					}
					break;
				}
				}
				setState(121);
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
			setState(122);
			match(TIPO);
			setState(123);
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
			setState(125);
			match(T__8);
			setState(126);
			match(T__1);
			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					declaracao();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new DeclaraConstanteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(CONST);
				setState(133);
				match(ID_L);
				setState(134);
				match(T__9);
				setState(135);
				value();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(136);
					match(T__5);
					setState(137);
					match(ID_L);
					setState(138);
					match(T__9);
					setState(139);
					value();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__6);
				}
				break;
			case ID_L:
				_localctx = new DeclaraVariavelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(ID_L);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(148);
					match(T__5);
					setState(149);
					match(ID_L);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__1);
				setState(156);
				match(TIPO);
				setState(157);
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
			setState(160);
			id();
			setState(161);
			match(T__9);
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(162);
				id();
				}
				break;
			case 2:
				{
				setState(163);
				value();
				}
				break;
			case 3:
				{
				setState(164);
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(SUB);
				setState(169);
				op_algebrico(5);
				}
				break;
			case T__3:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__3);
				setState(171);
				op_algebrico(0);
				setState(172);
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
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID_L:
					{
					setState(174);
					id();
					}
					break;
				case INT:
				case FLOAT:
					{
					setState(175);
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
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
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
						setState(182);
						op_algebrico(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new Op_algebricoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_op_algebrico);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
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
						setState(185);
						op_algebrico(3);
						}
						break;
					}
					} 
				}
				setState(190);
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
			setState(191);
			match(T__10);
			setState(192);
			match(T__3);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(193);
				exprRelacionalBinaria();
				}
				break;
			case 2:
				{
				setState(194);
				exprRelacionalUnaria();
				}
				break;
			}
			setState(197);
			match(T__4);
			setState(198);
			match(T__1);
			{
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0) );
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(204);
				match(T__11);
				setState(205);
				match(T__1);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					comando();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0) );
				}
			}

			setState(213);
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
		enterRule(_localctx, 26, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__12);
			setState(216);
			match(T__3);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(217);
				exprRelacionalBinaria();
				}
				break;
			case 2:
				{
				setState(218);
				exprRelacionalUnaria();
				}
				break;
			}
			setState(221);
			match(T__4);
			setState(222);
			match(T__1);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				comando();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID_L))) != 0) );
			setState(228);
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
		enterRule(_localctx, 28, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__13);
			setState(231);
			match(T__3);
			{
			setState(232);
			id();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(233);
				match(T__5);
				setState(234);
				id();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(240);
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
			setState(242);
			match(T__14);
			setState(243);
			match(T__3);
			setState(244);
			args_real();
			setState(245);
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
			setState(247);
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
		enterRule(_localctx, 34, RULE_inst_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			id();
			setState(250);
			match(T__3);
			setState(251);
			args_real();
			setState(252);
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
		enterRule(_localctx, 36, RULE_args_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << FLOAT) | (1L << ID_L) | (1L << SUB) | (1L << STRING))) != 0)) {
				{
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(254);
					id();
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
					exprAlgebrica();
					}
					break;
				case 4:
					{
					setState(257);
					exprRelacionalBinaria();
					}
					break;
				case 5:
					{
					setState(258);
					exprRelacionalUnaria();
					}
					break;
				case 6:
					{
					setState(259);
					inst_funcao();
					}
					break;
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(262);
					match(T__5);
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(263);
						id();
						}
						break;
					case 2:
						{
						setState(264);
						value();
						}
						break;
					case 3:
						{
						setState(265);
						exprAlgebrica();
						}
						break;
					case 4:
						{
						setState(266);
						exprRelacionalBinaria();
						}
						break;
					case 5:
						{
						setState(267);
						exprRelacionalUnaria();
						}
						break;
					case 6:
						{
						setState(268);
						inst_funcao();
						}
						break;
					}
					}
					}
					setState(275);
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
		enterRule(_localctx, 38, RULE_exprRelacionalBinaria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(278);
			op_relacional();
			setState(279);
			match(OPERADOR);
			setState(280);
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
		enterRule(_localctx, 40, RULE_op_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_L:
				{
				setState(282);
				id();
				}
				break;
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(283);
				value();
				}
				break;
			case T__16:
				{
				setState(284);
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
		enterRule(_localctx, 42, RULE_exprRelacionalUnaria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			match(T__16);
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_L:
				{
				setState(288);
				id();
				}
				break;
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(289);
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
		enterRule(_localctx, 44, RULE_exprAlgebrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				num();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(FALSE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
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
		enterRule(_localctx, 48, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 50, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5P\n\5\f\5\16"+
		"\5S\13\5\5\5U\n\5\3\6\5\6X\n\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\6\7a\n"+
		"\7\r\7\16\7b\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\5\7p\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\t\3\t\3\t\3\n\3\n\3\n\6"+
		"\n\u0083\n\n\r\n\16\n\u0084\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u008f\n\13\f\13\16\13\u0092\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u0099"+
		"\n\13\f\13\16\13\u009c\13\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b3"+
		"\n\r\5\r\u00b5\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bd\n\r\f\r\16\r\u00c0"+
		"\13\r\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\16\3\16\3\16\6\16\u00cb\n"+
		"\16\r\16\16\16\u00cc\3\16\3\16\3\16\6\16\u00d2\n\16\r\16\16\16\u00d3\5"+
		"\16\u00d6\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00de\n\17\3\17\3\17"+
		"\3\17\6\17\u00e3\n\17\r\17\16\17\u00e4\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0107\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0110\n\24"+
		"\7\24\u0112\n\24\f\24\16\24\u0115\13\24\5\24\u0117\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u0120\n\26\3\27\3\27\3\27\5\27\u0125\n\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\5\31\u012d\n\31\3\32\3\32\3\33\3\33\3\33"+
		"\2\3\30\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2"+
		"\5\3\2\34\35\3\2\36\37\4\2\26\26\30\30\2\u014e\29\3\2\2\2\4>\3\2\2\2\6"+
		"C\3\2\2\2\bT\3\2\2\2\nW\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20|\3\2\2\2\22"+
		"\177\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00b4\3\2\2\2\32\u00c1"+
		"\3\2\2\2\34\u00d9\3\2\2\2\36\u00e8\3\2\2\2 \u00f4\3\2\2\2\"\u00f9\3\2"+
		"\2\2$\u00fb\3\2\2\2&\u0116\3\2\2\2(\u0118\3\2\2\2*\u011f\3\2\2\2,\u0121"+
		"\3\2\2\2.\u0126\3\2\2\2\60\u012c\3\2\2\2\62\u012e\3\2\2\2\64\u0130\3\2"+
		"\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2"+
		"\2;9\3\2\2\2<=\5\4\3\2=\3\3\2\2\2>?\7\3\2\2?@\7\4\2\2@A\5\n\6\2AB\7\5"+
		"\2\2B\5\3\2\2\2CD\5\64\33\2DE\7\6\2\2EF\5\b\5\2FG\7\7\2\2GH\7\4\2\2HI"+
		"\7\31\2\2IJ\5\n\6\2JK\7\5\2\2K\7\3\2\2\2LQ\5\20\t\2MN\7\b\2\2NP\5\20\t"+
		"\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2"+
		"\2TU\3\2\2\2U\t\3\2\2\2VX\5\22\n\2WV\3\2\2\2WX\3\2\2\2X\\\3\2\2\2Y[\5"+
		"\f\7\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2"+
		"\2_a\5\32\16\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cp\3\2\2\2dp\5\34"+
		"\17\2el\5 \21\2fl\5\36\20\2gl\5\26\f\2hl\5$\23\2il\5\"\22\2jl\5\16\b\2"+
		"ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2"+
		"mn\7\t\2\2np\3\2\2\2o`\3\2\2\2od\3\2\2\2ok\3\2\2\2p\r\3\2\2\2qy\7\n\2"+
		"\2rx\5\60\31\2sx\5\64\33\2tx\5.\30\2ux\5(\25\2vx\5,\27\2wr\3\2\2\2ws\3"+
		"\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17"+
		"\3\2\2\2{y\3\2\2\2|}\7\31\2\2}~\5\64\33\2~\21\3\2\2\2\177\u0080\7\13\2"+
		"\2\u0080\u0082\7\4\2\2\u0081\u0083\5\24\13\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2"+
		"\2\u0086\u0087\7\27\2\2\u0087\u0088\7\32\2\2\u0088\u0089\7\f\2\2\u0089"+
		"\u0090\5\60\31\2\u008a\u008b\7\b\2\2\u008b\u008c\7\32\2\2\u008c\u008d"+
		"\7\f\2\2\u008d\u008f\5\60\31\2\u008e\u008a\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u00a1\3\2\2\2\u0095\u009a\7\32\2\2"+
		"\u0096\u0097\7\b\2\2\u0097\u0099\7\32\2\2\u0098\u0096\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\4\2\2\u009e\u009f\7\31\2\2\u009f\u00a1\7"+
		"\t\2\2\u00a0\u0086\3\2\2\2\u00a0\u0095\3\2\2\2\u00a1\25\3\2\2\2\u00a2"+
		"\u00a3\5\64\33\2\u00a3\u00a7\7\f\2\2\u00a4\u00a8\5\64\33\2\u00a5\u00a8"+
		"\5\60\31\2\u00a6\u00a8\5\30\r\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\b\r\1\2\u00aa\u00ab"+
		"\7\37\2\2\u00ab\u00b5\5\30\r\7\u00ac\u00ad\7\6\2\2\u00ad\u00ae\5\30\r"+
		"\2\u00ae\u00af\7\7\2\2\u00af\u00b5\3\2\2\2\u00b0\u00b3\5\64\33\2\u00b1"+
		"\u00b3\5\62\32\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00be\3\2\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00bd\5\30"+
		"\r\6\u00b9\u00ba\f\4\2\2\u00ba\u00bb\t\3\2\2\u00bb\u00bd\5\30\r\5\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7\r\2\2\u00c2\u00c5\7\6\2\2\u00c3\u00c6\5(\25\2\u00c4\u00c6\5,\27\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\7"+
		"\2\2\u00c8\u00ca\7\4\2\2\u00c9\u00cb\5\f\7\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d5\3\2"+
		"\2\2\u00ce\u00cf\7\16\2\2\u00cf\u00d1\7\4\2\2\u00d0\u00d2\5\f\7\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\7\5\2\2\u00d8\33\3\2\2\2\u00d9\u00da\7\17\2"+
		"\2\u00da\u00dd\7\6\2\2\u00db\u00de\5(\25\2\u00dc\u00de\5,\27\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\7\2\2\u00e0"+
		"\u00e2\7\4\2\2\u00e1\u00e3\5\f\7\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\7\5\2\2\u00e7\35\3\2\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00ea\7\6\2"+
		"\2\u00ea\u00ef\5\64\33\2\u00eb\u00ec\7\b\2\2\u00ec\u00ee\5\64\33\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3"+
		"\37\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5&\24"+
		"\2\u00f7\u00f8\7\7\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7\22\2\2\u00fa#\3\2"+
		"\2\2\u00fb\u00fc\5\64\33\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\5&\24\2\u00fe"+
		"\u00ff\7\7\2\2\u00ff%\3\2\2\2\u0100\u0107\5\64\33\2\u0101\u0107\5\60\31"+
		"\2\u0102\u0107\5.\30\2\u0103\u0107\5(\25\2\u0104\u0107\5,\27\2\u0105\u0107"+
		"\5$\23\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0113\3\2"+
		"\2\2\u0108\u010f\7\b\2\2\u0109\u0110\5\64\33\2\u010a\u0110\5\60\31\2\u010b"+
		"\u0110\5.\30\2\u010c\u0110\5(\25\2\u010d\u0110\5,\27\2\u010e\u0110\5$"+
		"\23\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u0108\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0106\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\'\3\2\2\2\u0118\u0119\5*\26\2\u0119\u011a"+
		"\7 \2\2\u011a\u011b\5*\26\2\u011b)\3\2\2\2\u011c\u0120\5\64\33\2\u011d"+
		"\u0120\5\60\31\2\u011e\u0120\5,\27\2\u011f\u011c\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u011f\u011e\3\2\2\2\u0120+\3\2\2\2\u0121\u0124\7\23\2\2\u0122\u0125"+
		"\5\64\33\2\u0123\u0125\5\60\31\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2"+
		"\2\u0125-\3\2\2\2\u0126\u0127\5\30\r\2\u0127/\3\2\2\2\u0128\u012d\5\62"+
		"\32\2\u0129\u012d\7\24\2\2\u012a\u012d\7\25\2\2\u012b\u012d\7!\2\2\u012c"+
		"\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d\61\3\2\2\2\u012e\u012f\t\4\2\2\u012f\63\3\2\2\2\u0130\u0131"+
		"\7\32\2\2\u0131\65\3\2\2\2#9QTW\\bkowy\u0084\u0090\u009a\u00a0\u00a7\u00b2"+
		"\u00b4\u00bc\u00be\u00c5\u00cc\u00d3\u00d5\u00dd\u00e4\u00ef\u0106\u010f"+
		"\u0113\u0116\u011f\u0124\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}