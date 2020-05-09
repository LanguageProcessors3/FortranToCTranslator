// Generated from FortranToC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FortranToCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, IDENT=49, NUM_INT_CONST=50, NUM_REAL_CONST=51, 
		STRING_CONST=52, COMMENT=53, S=54, NUM_INT_CONST_B=55, NUM_INT_CONST_O=56, 
		NUM_INT_CONST_H=57;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_cabecera = 2, RULE_cablist = 3, RULE_decsubprog = 4, 
		RULE_sentlist = 5, RULE_dcl = 6, RULE_defcte = 7, RULE_ctelist = 8, RULE_simpvalue = 9, 
		RULE_defvar = 10, RULE_tipo = 11, RULE_charlength = 12, RULE_varlist = 13, 
		RULE_init = 14, RULE_decproc = 15, RULE_formal_paramlist = 16, RULE_nomparamlist = 17, 
		RULE_dec_s_paramlist = 18, RULE_tipoparam = 19, RULE_decfun = 20, RULE_dec_f_paramlist = 21, 
		RULE_sent = 22, RULE_doval = 23, RULE_casos = 24, RULE_etiquetas = 25, 
		RULE_listaetiqetas = 26, RULE_exp = 27, RULE_expAux = 28, RULE_op = 29, 
		RULE_oparit = 30, RULE_factor = 31, RULE_explist = 32, RULE_proc_call = 33, 
		RULE_subpparamlist = 34, RULE_subproglist = 35, RULE_codproc = 36, RULE_codfun = 37, 
		RULE_expcond = 38, RULE_oplog = 39, RULE_factorcond = 40, RULE_opcomp = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "dcl", 
			"defcte", "ctelist", "simpvalue", "defvar", "tipo", "charlength", "varlist", 
			"init", "decproc", "formal_paramlist", "nomparamlist", "dec_s_paramlist", 
			"tipoparam", "decfun", "dec_f_paramlist", "sent", "doval", "casos", "etiquetas", 
			"listaetiqetas", "exp", "expAux", "op", "oparit", "factor", "explist", 
			"proc_call", "subpparamlist", "subproglist", "codproc", "codfun", "expcond", 
			"oplog", "factorcond", "opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'END'", "'INTERFACE'", "','", "'PARAMETER'", 
			"'::'", "'='", "'INTEGER'", "'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", 
			"'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", "'IF'", "'THEN'", 
			"'ENDIF'", "'ELSE'", "'DO'", "'WHILE'", "'ENDDO'", "'SELECT'", "'CASE'", 
			"'DEFAULT'", "':'", "'+'", "'-'", "'*'", "'/'", "'CALL'", "'.OR.'", "'.AND.'", 
			"'.EQV.'", "'.NEQV.'", "'.NOT.'", "'.TRUE.'", "'.FALSE.'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENT", 
			"S", "NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H"
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
	public String getGrammarFileName() { return "FortranToC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    ArrayList<Constant> constants = new ArrayList<>();
	    ArrayList<Header> headers = new ArrayList<>();
	    ArrayList<Variable> variables = new ArrayList<>();
	    ArrayList<String> statements = new ArrayList<>();

	    public String variablesToString (ArrayList<Variable> v) {
	        String s = "";

	        for (int i = 0; i < v.size(); ++i) {
	            if (i != v.size() - 1) {
	                s += v.get(i).parameterFormat();
	                s = s.replace('*','&');
	                s += " , ";
	            }
	            else {
	                s += v.get(i).parameterFormat();
	                s = s.replace('*','&');
	            }
	        }

	        if (s.isEmpty()) s = "void";

	        return s;
	    }

	    public void printprg () {
	        for (Constant c : constants)
	            c.printConst();

	        System.out.println();

	        for (Header h : headers)
	            h.printHeader();

	        System.out.println();

	        System.out.println("void main(void) {");

	        printStatements();
	    }

	    public void printStatements () {
	        boolean hasCase = false;
	        String tabs = "\t";

	        for (String s: statements) {

	            if (s.startsWith("default") || s.startsWith("case")) {
	                if (!hasCase) {
	                    System.out.println(tabs + s);
	                    tabs += "\t";
	                    hasCase = true;
	                } else System.out.println(tabs + s);
	            }

	            else if (s.startsWith("break")) {
	                tabs = tabs.substring(0, tabs.length() - 1);
	                System.out.println(tabs + "\t" + s);
	                hasCase = false;
	            }

	            else if (s.contains("{") && s.contains("}")) {
	                tabs = tabs.substring(0, tabs.length() - 1);
	                System.out.println(tabs + s);
	                tabs += "\t";
	            }

	            else if (s.contains("{")) {
	                System.out.println(tabs + s);
	                tabs += "\t";
	            }

	            else if (s.contains("}")) {
	                if (hasCase) {
	                    tabs = tabs.substring(0, tabs.length() - 1);
	                    hasCase = false;
	                }
	                tabs = tabs.substring(0, tabs.length() - 1);
	                System.out.println(tabs + s);
	            }

	            else System.out.println(tabs + s);
	        }
	    }


	public FortranToCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			match(IDENT);
			setState(86);
			match(T__1);
			setState(87);
			dcllist();
			setState(88);
			cabecera();
			setState(89);
			sent();
			setState(90);
			sentlist();
			setState(91);
			match(T__2);
			setState(92);
			match(T__0);
			 statements.add("}\n") ; 
			setState(94);
			match(IDENT);
			setState(95);
			subproglist();
			 printprg() ; 
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

	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDcllist(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				dcl();
				setState(99);
				dcllist();
				}
				break;
			case T__3:
			case T__19:
			case T__23:
			case T__26:
			case T__34:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CabeceraContext extends ParserRuleContext {
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__3);
				setState(105);
				cablist();
				setState(106);
				match(T__2);
				setState(107);
				match(T__3);
				}
				break;
			case T__19:
			case T__23:
			case T__26:
			case T__34:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CablistContext extends ParserRuleContext {
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCablist(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cablist);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				decproc();
				setState(113);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				decfun();
				setState(116);
				decsubprog();
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

	public static class DecsubprogContext extends ParserRuleContext {
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDecsubprog(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decsubprog);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				decproc();
				setState(121);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				decfun();
				setState(124);
				decsubprog();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				sent();
				setState(130);
				sentlist();
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

	public static class DclContext extends ParserRuleContext {
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dcl);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				tipo();
				setState(136);
				match(T__4);
				setState(137);
				match(T__5);
				setState(138);
				match(T__6);
				setState(139);
				((DclContext)_localctx).IDENT = match(IDENT);
				setState(140);
				match(T__7);
				setState(141);
				((DclContext)_localctx).simpvalue = simpvalue();
				 constants.add(new Constant((((DclContext)_localctx).IDENT!=null?((DclContext)_localctx).IDENT.getText():null), ((DclContext)_localctx).simpvalue.value)) ; 
				setState(143);
				ctelist();
				setState(144);
				match(T__1);
				setState(145);
				defcte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				((DclContext)_localctx).tipo = tipo();
				setState(148);
				match(T__6);
				setState(149);
				varlist(((DclContext)_localctx).tipo.value, ((DclContext)_localctx).tipo.size);
				setState(150);
				match(T__1);
				setState(151);
				defvar();
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

	public static class DefcteContext extends ParserRuleContext {
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDefcte(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defcte);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				tipo();
				setState(156);
				match(T__4);
				setState(157);
				match(T__5);
				setState(158);
				match(T__6);
				setState(159);
				((DefcteContext)_localctx).IDENT = match(IDENT);
				setState(160);
				match(T__7);
				setState(161);
				((DefcteContext)_localctx).simpvalue = simpvalue();
				 constants.add(new Constant((((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null), ((DefcteContext)_localctx).simpvalue.value)) ; 
				setState(163);
				ctelist();
				setState(164);
				match(T__1);
				setState(165);
				defcte();
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

	public static class CtelistContext extends ParserRuleContext {
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCtelist(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctelist);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__4);
				setState(171);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(172);
				match(T__7);
				setState(173);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				 constants.add(new Constant((((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null), ((CtelistContext)_localctx).simpvalue.value)) ; 
				setState(175);
				ctelist();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SimpvalueContext extends ParserRuleContext {
		public String value;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(FortranToCParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(FortranToCParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(FortranToCParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(FortranToCParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(FortranToCParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(FortranToCParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSimpvalue(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpvalue);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null) ; 
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null) ; 
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) ; 
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null) ; 
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null) ; 
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null) ; 
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

	public static class DefvarContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDefvar(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defvar);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((DefvarContext)_localctx).tipo = tipo();
				setState(195);
				match(T__6);
				setState(196);
				varlist(((DefvarContext)_localctx).tipo.value, ((DefvarContext)_localctx).tipo.size);
				setState(197);
				match(T__1);
				setState(198);
				defvar();
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

	public static class TipoContext extends ParserRuleContext {
		public String value;
		public String size;
		public CharlengthContext charlength;
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__8);
				 ((TipoContext)_localctx).value =  "int" ; ((TipoContext)_localctx).size =  "" ; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__9);
				 ((TipoContext)_localctx).value =  "float" ; ((TipoContext)_localctx).size =  "" ; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__10);
				setState(208);
				((TipoContext)_localctx).charlength = charlength();
				 ((TipoContext)_localctx).value =  "char" ; ((TipoContext)_localctx).size =  ((TipoContext)_localctx).charlength.num_const ; 
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

	public static class CharlengthContext extends ParserRuleContext {
		public String num_const;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(FortranToCParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCharlength(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_charlength);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__11);
				setState(214);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(215);
				match(T__12);
				 ((CharlengthContext)_localctx).num_const =  "[" + (((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null) + "]" ; 
				}
				break;
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				 ((CharlengthContext)_localctx).num_const =  "" ; 
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

	public static class VarlistContext extends ParserRuleContext {
		public String type;
		public String size;
		public Token IDENT;
		public InitContext init;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String type, String size) {
			super(parent, invokingState);
			this.type = type;
			this.size = size;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist(String type,String size) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), type, size);
		enterRule(_localctx, 26, RULE_varlist);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((VarlistContext)_localctx).IDENT = match(IDENT);
				setState(221);
				((VarlistContext)_localctx).init = init();
				 statements.add(_localctx.type + " " + (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + _localctx.size + ((VarlistContext)_localctx).init.value + ";") ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((VarlistContext)_localctx).IDENT = match(IDENT);
				setState(225);
				((VarlistContext)_localctx).init = init();
				 statements.add(_localctx.type + " " + (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + _localctx.size + ((VarlistContext)_localctx).init.value + ";") ; 
				setState(227);
				match(T__4);
				setState(228);
				varlist(_localctx.type, _localctx.size);
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

	public static class InitContext extends ParserRuleContext {
		public String value;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_init);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__7);
				setState(233);
				((InitContext)_localctx).simpvalue = simpvalue();
				 ((InitContext)_localctx).value =  " = " + ((InitContext)_localctx).simpvalue.value ; 
				}
				break;
			case T__1:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				 ((InitContext)_localctx).value =  "" ; 
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

	public static class DecprocContext extends ParserRuleContext {
		public Token IDENT;
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDecproc(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__13);
			setState(240);
			((DecprocContext)_localctx).IDENT = match(IDENT);
			setState(241);
			formal_paramlist();
			setState(242);
			dec_s_paramlist();
			setState(243);
			match(T__2);
			setState(244);
			match(T__13);
			setState(245);
			((DecprocContext)_localctx).IDENT = match(IDENT);
			 Header h = new Header("void", (((DecprocContext)_localctx).IDENT!=null?((DecprocContext)_localctx).IDENT.getText():null));
			                               h.setParameters(variables);
			                               variables = new ArrayList<>();
			                               headers.add(h);
			                             
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

	public static class Formal_paramlistContext extends ParserRuleContext {
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFormal_paramlist(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formal_paramlist);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__23:
			case T__26:
			case T__34:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__11);
				setState(250);
				nomparamlist();
				setState(251);
				match(T__12);
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

	public static class NomparamlistContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitNomparamlist(this);
		}
	}

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nomparamlist);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(IDENT);
				setState(257);
				match(T__4);
				setState(258);
				nomparamlist();
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

	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoparamContext tipoparam;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDec_s_paramlist(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dec_s_paramlist);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(262);
				match(T__4);
				setState(263);
				match(T__14);
				setState(264);
				match(T__11);
				setState(265);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(266);
				match(T__12);
				setState(267);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(268);
				match(T__1);
				 variables.add(new Variable(((Dec_s_paramlistContext)_localctx).tipo.value, ((Dec_s_paramlistContext)_localctx).tipoparam.value + (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), ((Dec_s_paramlistContext)_localctx).tipo.size)); 
				setState(270);
				dec_s_paramlist();
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

	public static class TipoparamContext extends ParserRuleContext {
		public String value;
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitTipoparam(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipoparam);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__15);
				 ((TipoparamContext)_localctx).value =  ""; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__16);
				 ((TipoparamContext)_localctx).value =  "* "; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(T__17);
				 ((TipoparamContext)_localctx).value =  "* "; 
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

	public static class DecfunContext extends ParserRuleContext {
		public Token IDENT;
		public TipoContext tipo;
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDecfun(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__18);
			setState(284);
			((DecfunContext)_localctx).IDENT = match(IDENT);
			setState(285);
			match(T__11);
			setState(286);
			nomparamlist();
			setState(287);
			match(T__12);
			setState(288);
			((DecfunContext)_localctx).tipo = tipo();
			setState(289);
			match(T__6);
			setState(290);
			((DecfunContext)_localctx).IDENT = match(IDENT);
			setState(291);
			match(T__1);
			setState(292);
			dec_f_paramlist();
			 Header h = new Header(((DecfunContext)_localctx).tipo.value, (((DecfunContext)_localctx).IDENT!=null?((DecfunContext)_localctx).IDENT.getText():null));
			                      h.setParameters(variables);
			                      variables = new ArrayList<>();
			                      headers.add(h);
			                    
			setState(294);
			match(T__2);
			setState(295);
			match(T__18);
			setState(296);
			((DecfunContext)_localctx).IDENT = match(IDENT);
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

	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDec_f_paramlist(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dec_f_paramlist);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(299);
				match(T__4);
				setState(300);
				match(T__14);
				setState(301);
				match(T__11);
				setState(302);
				match(T__15);
				setState(303);
				match(T__12);
				setState(304);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(305);
				match(T__1);
				 variables.add(new Variable(((Dec_f_paramlistContext)_localctx).tipo.value, (((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), ((Dec_f_paramlistContext)_localctx).tipo.size));
				setState(307);
				dec_f_paramlist();
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

	public static class SentContext extends ParserRuleContext {
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public DovalContext doval1;
		public DovalContext doval2;
		public DovalContext doval3;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public List<SentlistContext> sentlist() {
			return getRuleContexts(SentlistContext.class);
		}
		public SentlistContext sentlist(int i) {
			return getRuleContext(SentlistContext.class,i);
		}
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(313);
				match(T__7);
				setState(314);
				((SentContext)_localctx).exp = exp();
				setState(315);
				match(T__1);
				 statements.add((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).exp.value + ";") ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((SentContext)_localctx).proc_call = proc_call();
				setState(319);
				match(T__1);
				 statements.add(((SentContext)_localctx).proc_call.value) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(T__19);
				setState(323);
				match(T__11);
				setState(324);
				((SentContext)_localctx).expcond = expcond(0);
				 statements.add("if (" + ((SentContext)_localctx).expcond.value + ") {") ; 
				setState(326);
				match(T__12);
				setState(327);
				sent();
				 statements.add("}") ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(T__19);
				setState(331);
				match(T__11);
				setState(332);
				((SentContext)_localctx).expcond = expcond(0);
				 statements.add("if (" + ((SentContext)_localctx).expcond.value + ") {") ; 
				setState(334);
				match(T__12);
				setState(335);
				match(T__20);
				setState(336);
				sentlist();
				setState(337);
				match(T__21);
				 statements.add("}") ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(T__19);
				setState(341);
				match(T__11);
				setState(342);
				((SentContext)_localctx).expcond = expcond(0);
				 statements.add("if (" + ((SentContext)_localctx).expcond.value + ") {") ; 
				setState(344);
				match(T__12);
				setState(345);
				match(T__20);
				setState(346);
				sentlist();
				 statements.add("} else {") ; 
				setState(348);
				match(T__22);
				setState(349);
				sentlist();
				setState(350);
				match(T__21);
				 statements.add("}") ; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(353);
				match(T__23);
				setState(354);
				match(T__24);
				setState(355);
				match(T__11);
				setState(356);
				((SentContext)_localctx).expcond = expcond(0);
				setState(357);
				match(T__12);
				 statements.add("while (" + ((SentContext)_localctx).expcond.value + ") {") ; 
				setState(359);
				sentlist();
				setState(360);
				match(T__25);
				 statements.add("}") ; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(T__23);
				setState(364);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(365);
				match(T__7);
				setState(366);
				((SentContext)_localctx).doval1 = doval();
				setState(367);
				match(T__4);
				setState(368);
				((SentContext)_localctx).doval2 = doval();
				setState(369);
				match(T__4);
				setState(370);
				((SentContext)_localctx).doval3 = doval();
				 statements.add("for (" + (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).doval1.value + "; "
				                                                                      + (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " != " + ((SentContext)_localctx).doval2.value + "; " + (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = "
				                                                                      + (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " + " + ((SentContext)_localctx).doval3.value + ") {") ; 
				setState(372);
				sentlist();
				setState(373);
				match(T__25);
				 statements.add("}") ; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
				match(T__26);
				setState(377);
				match(T__27);
				setState(378);
				match(T__11);
				setState(379);
				((SentContext)_localctx).exp = exp();
				setState(380);
				match(T__12);
				 statements.add("switch (" + ((SentContext)_localctx).exp.value + ") {") ; 
				setState(382);
				casos();
				setState(383);
				match(T__2);
				setState(384);
				match(T__26);
				 statements.add("}") ; 
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

	public static class DovalContext extends ParserRuleContext {
		public String value;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(FortranToCParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDoval(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doval);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((DovalContext)_localctx).value =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null) ; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				((DovalContext)_localctx).IDENT = match(IDENT);
				 ((DovalContext)_localctx).value =  (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null) ; 
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

	public static class CasosContext extends ParserRuleContext {
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_casos);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(T__27);
				setState(396);
				match(T__11);
				setState(397);
				etiquetas();
				setState(398);
				match(T__12);
				setState(399);
				sentlist();
				 statements.add("break;") ; 
				setState(401);
				casos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(T__27);
				setState(404);
				match(T__28);
				 statements.add("default:") ; 
				setState(406);
				sentlist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class EtiquetasContext extends ParserRuleContext {
		public SimpvalueContext simpvalue;
		public SimpvalueContext simp1;
		public SimpvalueContext simp2;
		public List<SimpvalueContext> simpvalue() {
			return getRuleContexts(SimpvalueContext.class);
		}
		public SimpvalueContext simpvalue(int i) {
			return getRuleContext(SimpvalueContext.class,i);
		}
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitEtiquetas(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_etiquetas);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(411);
				listaetiqetas();
				 statements.add("case " + ((EtiquetasContext)_localctx).simpvalue.value + ":"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				((EtiquetasContext)_localctx).simp1 = simpvalue();
				setState(415);
				match(T__29);
				setState(416);
				((EtiquetasContext)_localctx).simp2 = simpvalue();
				 statements.add("case " + ((EtiquetasContext)_localctx).simp1.value + " to " + ((EtiquetasContext)_localctx).simp2.value + ":") ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(T__29);
				setState(420);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				 statements.add("case < " + ((EtiquetasContext)_localctx).simpvalue.value + ":") ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(424);
				match(T__29);
				 statements.add("case > " + ((EtiquetasContext)_localctx).simpvalue.value + ":") ; 
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

	public static class ListaetiqetasContext extends ParserRuleContext {
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiqetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterListaetiqetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitListaetiqetas(this);
		}
	}

	public final ListaetiqetasContext listaetiqetas() throws RecognitionException {
		ListaetiqetasContext _localctx = new ListaetiqetasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listaetiqetas);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(T__4);
				setState(430);
				((ListaetiqetasContext)_localctx).simpvalue = simpvalue();
				 statements.add("case " + ((ListaetiqetasContext)_localctx).simpvalue.value + ":") ; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpContext extends ParserRuleContext {
		public String value;
		public FactorContext factor;
		public ExpAuxContext expAux;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			((ExpContext)_localctx).factor = factor();
			setState(437);
			((ExpContext)_localctx).expAux = expAux();
			 ((ExpContext)_localctx).value =  ((ExpContext)_localctx).factor.value + ((ExpContext)_localctx).expAux.value ; 
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

	public static class ExpAuxContext extends ParserRuleContext {
		public String value;
		public OpContext op;
		public ExpContext exp;
		public ExpAuxContext expAuxaux;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public ExpAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExpAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExpAux(this);
		}
	}

	public final ExpAuxContext expAux() throws RecognitionException {
		ExpAuxContext _localctx = new ExpAuxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expAux);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				((ExpAuxContext)_localctx).op = op();
				setState(441);
				((ExpAuxContext)_localctx).exp = exp();
				setState(442);
				((ExpAuxContext)_localctx).expAuxaux = expAux();
				 ((ExpAuxContext)_localctx).value =  ((ExpAuxContext)_localctx).op.value + ((ExpAuxContext)_localctx).exp.value + ((ExpAuxContext)_localctx).expAuxaux.value ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExpAuxContext)_localctx).value =  "" ; 
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

	public static class OpContext extends ParserRuleContext {
		public String value;
		public OparitContext oparit;
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			((OpContext)_localctx).oparit = oparit();
			 ((OpContext)_localctx).value =  ((OpContext)_localctx).oparit.value ; 
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

	public static class OparitContext extends ParserRuleContext {
		public String value;
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOparit(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oparit);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(T__30);
				 ((OparitContext)_localctx).value =  " + " ; 
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(T__31);
				 ((OparitContext)_localctx).value =  " - " ; 
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				match(T__32);
				 ((OparitContext)_localctx).value =  " * " ; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				match(T__33);
				 ((OparitContext)_localctx).value =  " / " ; 
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

	public static class FactorContext extends ParserRuleContext {
		public String value;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENT;
		public ExplistContext explist;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				((FactorContext)_localctx).simpvalue = simpvalue();
				 ((FactorContext)_localctx).value =  ((FactorContext)_localctx).simpvalue.value ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(T__11);
				setState(465);
				((FactorContext)_localctx).exp = exp();
				setState(466);
				match(T__12);
				 ((FactorContext)_localctx).value =  "(" + ((FactorContext)_localctx).exp.value + ")" ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(470);
				match(T__11);
				setState(471);
				((FactorContext)_localctx).exp = exp();
				setState(472);
				((FactorContext)_localctx).explist = explist();
				setState(473);
				match(T__12);
				 ((FactorContext)_localctx).value =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + "(" + ((FactorContext)_localctx).exp.value + ((FactorContext)_localctx).explist.value + ")" ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				((FactorContext)_localctx).IDENT = match(IDENT);
				 ((FactorContext)_localctx).value =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) ; 
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

	public static class ExplistContext extends ParserRuleContext {
		public String value;
		public ExpContext exp;
		public ExplistContext explistaux;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_explist);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(T__4);
				setState(481);
				((ExplistContext)_localctx).exp = exp();
				setState(482);
				((ExplistContext)_localctx).explistaux = explist();
				 ((ExplistContext)_localctx).value =  "," + ((ExplistContext)_localctx).exp.value + ((ExplistContext)_localctx).explistaux.value ; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExplistContext)_localctx).value =  "" ; 
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

	public static class Proc_callContext extends ParserRuleContext {
		public String value;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitProc_call(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__34);
			setState(489);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(490);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();
			 ((Proc_callContext)_localctx).value =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + "(" + ((Proc_callContext)_localctx).subpparamlist.value + ");" ; 
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

	public static class SubpparamlistContext extends ParserRuleContext {
		public String value;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSubpparamlist(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subpparamlist);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T__11);
				setState(494);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(495);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(496);
				match(T__12);
				 ((SubpparamlistContext)_localctx).value =  ((SubpparamlistContext)_localctx).exp.value + ((SubpparamlistContext)_localctx).explist.value ; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((SubpparamlistContext)_localctx).value =  "" ; 
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

	public static class SubproglistContext extends ParserRuleContext {
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSubproglist(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subproglist);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				codproc();
				setState(503);
				subproglist();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				codfun();
				setState(506);
				subproglist();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class CodprocContext extends ParserRuleContext {
		public Token IDENT;
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCodproc(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__13);
			setState(512);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			 variables = new ArrayList<>() ; 
			setState(514);
			formal_paramlist();
			setState(515);
			dec_s_paramlist();
			 statements.add("void " + (((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null) + "(" + variablesToString(variables) + ") {") ; 
			setState(517);
			dcllist();
			setState(518);
			sent();
			setState(519);
			sentlist();
			setState(520);
			match(T__2);
			setState(521);
			match(T__13);
			setState(522);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			 statements.add("}\n") ; 
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

	public static class CodfunContext extends ParserRuleContext {
		public Token IDENT;
		public TipoContext tipo;
		public ExpContext exp;
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCodfun(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__18);
			setState(526);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(527);
			match(T__11);
			setState(528);
			nomparamlist();
			setState(529);
			match(T__12);
			setState(530);
			((CodfunContext)_localctx).tipo = tipo();
			setState(531);
			match(T__6);
			setState(532);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(533);
			match(T__1);
			 variables = new ArrayList<>() ; 
			setState(535);
			dec_f_paramlist();
			 statements.add(((CodfunContext)_localctx).tipo.value + " " + (((CodfunContext)_localctx).IDENT!=null?((CodfunContext)_localctx).IDENT.getText():null) + "(" + variablesToString(variables) + ") {") ; 
			setState(537);
			dcllist();
			setState(538);
			sent();
			setState(539);
			sentlist();
			setState(540);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(541);
			match(T__7);
			setState(542);
			((CodfunContext)_localctx).exp = exp();
			setState(543);
			match(T__1);
			 statements.add("return " + ((CodfunContext)_localctx).exp.value + ";") ; 
			setState(545);
			match(T__2);
			setState(546);
			match(T__18);
			setState(547);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			 statements.add("}\n") ; 
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

	public static class ExpcondContext extends ParserRuleContext {
		public String value;
		public ExpcondContext expcond1;
		public FactorcondContext factorcond;
		public OplogContext oplog;
		public ExpcondContext expcond2;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public List<ExpcondContext> expcond() {
			return getRuleContexts(ExpcondContext.class);
		}
		public ExpcondContext expcond(int i) {
			return getRuleContext(ExpcondContext.class,i);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		return expcond(0);
	}

	private ExpcondContext expcond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpcondContext _localctx = new ExpcondContext(_ctx, _parentState);
		ExpcondContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expcond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(551);
			((ExpcondContext)_localctx).factorcond = factorcond();
			 ((ExpcondContext)_localctx).value =  ((ExpcondContext)_localctx).factorcond.value ; 
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpcondContext(_parentctx, _parentState);
					_localctx.expcond1 = _prevctx;
					_localctx.expcond1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expcond);
					setState(554);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(555);
					((ExpcondContext)_localctx).oplog = oplog();
					setState(556);
					((ExpcondContext)_localctx).expcond2 = expcond(3);
					 ((ExpcondContext)_localctx).value =  ((ExpcondContext)_localctx).expcond1.value + ((ExpcondContext)_localctx).oplog.value + ((ExpcondContext)_localctx).expcond2.value ; 
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class OplogContext extends ParserRuleContext {
		public String value;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_oplog);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(T__35);
				 ((OplogContext)_localctx).value =  " || " ; 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(T__36);
				 ((OplogContext)_localctx).value =  " && " ; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				match(T__37);
				 ((OplogContext)_localctx).value =  " !^ " ; 
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				match(T__38);
				 ((OplogContext)_localctx).value =  " ^ " ; 
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

	public static class FactorcondContext extends ParserRuleContext {
		public String value;
		public ExpContext exp1;
		public OpcompContext opcomp;
		public ExpContext exp2;
		public ExpcondContext expcond;
		public FactorcondContext factaux;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factorcond);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				((FactorcondContext)_localctx).exp1 = exp();
				setState(575);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(576);
				((FactorcondContext)_localctx).exp2 = exp();
				 ((FactorcondContext)_localctx).value =  ((FactorcondContext)_localctx).exp1.value + ((FactorcondContext)_localctx).opcomp.value + ((FactorcondContext)_localctx).exp2.value ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(T__11);
				setState(580);
				((FactorcondContext)_localctx).expcond = expcond(0);
				setState(581);
				match(T__12);
				 ((FactorcondContext)_localctx).value =  "(" + ((FactorcondContext)_localctx).expcond.value + ")" ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(T__39);
				setState(585);
				((FactorcondContext)_localctx).factaux = factorcond();
				 ((FactorcondContext)_localctx).value =  "!" + ((FactorcondContext)_localctx).factaux.value ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				match(T__40);
				 ((FactorcondContext)_localctx).value =  "1" ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(590);
				match(T__41);
				 ((FactorcondContext)_localctx).value =  "0" ; 
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

	public static class OpcompContext extends ParserRuleContext {
		public String value;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opcomp);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(T__42);
				 ((OpcompContext)_localctx).value =  " < " ; 
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(T__43);
				 ((OpcompContext)_localctx).value =  " > " ; 
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				match(T__44);
				 ((OpcompContext)_localctx).value =  " <= " ; 
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				match(T__45);
				 ((OpcompContext)_localctx).value =  " >= " ; 
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 5);
				{
				setState(602);
				match(T__46);
				 ((OpcompContext)_localctx).value =  " == " ; 
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				match(T__47);
				 ((OpcompContext)_localctx).value =  " != " ; 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return expcond_sempred((ExpcondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expcond_sempred(ExpcondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0263\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\5\7\u0088"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00ab\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b5\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c3\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00d6\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00f0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0100\n\22\3\23\3\23\3\23\3\23\5\23\u0106"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0114\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011c\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0139\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0186\n\30\3\31\3\31\3\31\3\31\5\31\u018c"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u019b\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ae\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01b5\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01c1\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ce\n \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01e1\n!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u01e9\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01f7"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0200\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\7"+
		"(\u0232\n(\f(\16(\u0235\13(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u023f\n)\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0253\n*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0261\n+\3+\2\3N,\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\2\2\u0278\2V"+
		"\3\2\2\2\4h\3\2\2\2\6p\3\2\2\2\bx\3\2\2\2\n\u0081\3\2\2\2\f\u0087\3\2"+
		"\2\2\16\u009b\3\2\2\2\20\u00aa\3\2\2\2\22\u00b4\3\2\2\2\24\u00c2\3\2\2"+
		"\2\26\u00cb\3\2\2\2\30\u00d5\3\2\2\2\32\u00dc\3\2\2\2\34\u00e8\3\2\2\2"+
		"\36\u00ef\3\2\2\2 \u00f1\3\2\2\2\"\u00ff\3\2\2\2$\u0105\3\2\2\2&\u0113"+
		"\3\2\2\2(\u011b\3\2\2\2*\u011d\3\2\2\2,\u0138\3\2\2\2.\u0185\3\2\2\2\60"+
		"\u018b\3\2\2\2\62\u019a\3\2\2\2\64\u01ad\3\2\2\2\66\u01b4\3\2\2\28\u01b6"+
		"\3\2\2\2:\u01c0\3\2\2\2<\u01c2\3\2\2\2>\u01cd\3\2\2\2@\u01e0\3\2\2\2B"+
		"\u01e8\3\2\2\2D\u01ea\3\2\2\2F\u01f6\3\2\2\2H\u01ff\3\2\2\2J\u0201\3\2"+
		"\2\2L\u020f\3\2\2\2N\u0228\3\2\2\2P\u023e\3\2\2\2R\u0252\3\2\2\2T\u0260"+
		"\3\2\2\2VW\7\3\2\2WX\7\63\2\2XY\7\4\2\2YZ\5\4\3\2Z[\5\6\4\2[\\\5.\30\2"+
		"\\]\5\f\7\2]^\7\5\2\2^_\7\3\2\2_`\b\2\1\2`a\7\63\2\2ab\5H%\2bc\b\2\1\2"+
		"c\3\3\2\2\2de\5\16\b\2ef\5\4\3\2fi\3\2\2\2gi\3\2\2\2hd\3\2\2\2hg\3\2\2"+
		"\2i\5\3\2\2\2jk\7\6\2\2kl\5\b\5\2lm\7\5\2\2mn\7\6\2\2nq\3\2\2\2oq\3\2"+
		"\2\2pj\3\2\2\2po\3\2\2\2q\7\3\2\2\2rs\5 \21\2st\5\n\6\2ty\3\2\2\2uv\5"+
		"*\26\2vw\5\n\6\2wy\3\2\2\2xr\3\2\2\2xu\3\2\2\2y\t\3\2\2\2z{\5 \21\2{|"+
		"\5\n\6\2|\u0082\3\2\2\2}~\5*\26\2~\177\5\n\6\2\177\u0082\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081z\3\2\2\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\13\3\2\2\2\u0083\u0084\5.\30\2\u0084\u0085\5\f\7\2\u0085\u0088\3\2\2"+
		"\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0086\3\2\2\2\u0088\r"+
		"\3\2\2\2\u0089\u008a\5\30\r\2\u008a\u008b\7\7\2\2\u008b\u008c\7\b\2\2"+
		"\u008c\u008d\7\t\2\2\u008d\u008e\7\63\2\2\u008e\u008f\7\n\2\2\u008f\u0090"+
		"\5\24\13\2\u0090\u0091\b\b\1\2\u0091\u0092\5\22\n\2\u0092\u0093\7\4\2"+
		"\2\u0093\u0094\5\20\t\2\u0094\u009c\3\2\2\2\u0095\u0096\5\30\r\2\u0096"+
		"\u0097\7\t\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\4\2\2\u0099\u009a\5"+
		"\26\f\2\u009a\u009c\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u0095\3\2\2\2\u009c"+
		"\17\3\2\2\2\u009d\u009e\5\30\r\2\u009e\u009f\7\7\2\2\u009f\u00a0\7\b\2"+
		"\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\7\63\2\2\u00a2\u00a3\7\n\2\2\u00a3"+
		"\u00a4\5\24\13\2\u00a4\u00a5\b\t\1\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7"+
		"\7\4\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\3\2\2\2"+
		"\u00aa\u009d\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00ad"+
		"\7\7\2\2\u00ad\u00ae\7\63\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\24\13"+
		"\2\u00b0\u00b1\b\n\1\2\u00b1\u00b2\5\22\n\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\23\3\2\2"+
		"\2\u00b6\u00b7\7\64\2\2\u00b7\u00c3\b\13\1\2\u00b8\u00b9\7\65\2\2\u00b9"+
		"\u00c3\b\13\1\2\u00ba\u00bb\7\66\2\2\u00bb\u00c3\b\13\1\2\u00bc\u00bd"+
		"\79\2\2\u00bd\u00c3\b\13\1\2\u00be\u00bf\7:\2\2\u00bf\u00c3\b\13\1\2\u00c0"+
		"\u00c1\7;\2\2\u00c1\u00c3\b\13\1\2\u00c2\u00b6\3\2\2\2\u00c2\u00b8\3\2"+
		"\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7\t\2"+
		"\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\5\26\f\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00d6\b\r\1\2\u00cf\u00d0"+
		"\7\f\2\2\u00d0\u00d6\b\r\1\2\u00d1\u00d2\7\r\2\2\u00d2\u00d3\5\32\16\2"+
		"\u00d3\u00d4\b\r\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00cf"+
		"\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\7\16\2\2\u00d8"+
		"\u00d9\7\64\2\2\u00d9\u00da\7\17\2\2\u00da\u00dd\b\16\1\2\u00db\u00dd"+
		"\b\16\1\2\u00dc\u00d7\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\33\3\2\2\2\u00de"+
		"\u00df\7\63\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\b\17\1\2\u00e1\u00e9"+
		"\3\2\2\2\u00e2\u00e3\7\63\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\b\17\1"+
		"\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00de\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e9\35\3\2\2\2\u00ea\u00eb\7\n\2"+
		"\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\b\20\1\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00f0\b\20\1\2\u00ef\u00ea\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\37\3\2\2"+
		"\2\u00f1\u00f2\7\20\2\2\u00f2\u00f3\7\63\2\2\u00f3\u00f4\5\"\22\2\u00f4"+
		"\u00f5\5&\24\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8\7"+
		"\63\2\2\u00f8\u00f9\b\21\1\2\u00f9!\3\2\2\2\u00fa\u0100\3\2\2\2\u00fb"+
		"\u00fc\7\16\2\2\u00fc\u00fd\5$\23\2\u00fd\u00fe\7\17\2\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100#\3\2\2\2\u0101\u0106"+
		"\7\63\2\2\u0102\u0103\7\63\2\2\u0103\u0104\7\7\2\2\u0104\u0106\5$\23\2"+
		"\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0106%\3\2\2\2\u0107\u0108\5"+
		"\30\r\2\u0108\u0109\7\7\2\2\u0109\u010a\7\21\2\2\u010a\u010b\7\16\2\2"+
		"\u010b\u010c\5(\25\2\u010c\u010d\7\17\2\2\u010d\u010e\7\63\2\2\u010e\u010f"+
		"\7\4\2\2\u010f\u0110\b\24\1\2\u0110\u0111\5&\24\2\u0111\u0114\3\2\2\2"+
		"\u0112\u0114\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u0112\3\2\2\2\u0114\'\3"+
		"\2\2\2\u0115\u0116\7\22\2\2\u0116\u011c\b\25\1\2\u0117\u0118\7\23\2\2"+
		"\u0118\u011c\b\25\1\2\u0119\u011a\7\24\2\2\u011a\u011c\b\25\1\2\u011b"+
		"\u0115\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0119\3\2\2\2\u011c)\3\2\2\2"+
		"\u011d\u011e\7\25\2\2\u011e\u011f\7\63\2\2\u011f\u0120\7\16\2\2\u0120"+
		"\u0121\5$\23\2\u0121\u0122\7\17\2\2\u0122\u0123\5\30\r\2\u0123\u0124\7"+
		"\t\2\2\u0124\u0125\7\63\2\2\u0125\u0126\7\4\2\2\u0126\u0127\5,\27\2\u0127"+
		"\u0128\b\26\1\2\u0128\u0129\7\5\2\2\u0129\u012a\7\25\2\2\u012a\u012b\7"+
		"\63\2\2\u012b+\3\2\2\2\u012c\u012d\5\30\r\2\u012d\u012e\7\7\2\2\u012e"+
		"\u012f\7\21\2\2\u012f\u0130\7\16\2\2\u0130\u0131\7\22\2\2\u0131\u0132"+
		"\7\17\2\2\u0132\u0133\7\63\2\2\u0133\u0134\7\4\2\2\u0134\u0135\b\27\1"+
		"\2\u0135\u0136\5,\27\2\u0136\u0139\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u012c"+
		"\3\2\2\2\u0138\u0137\3\2\2\2\u0139-\3\2\2\2\u013a\u013b\7\63\2\2\u013b"+
		"\u013c\7\n\2\2\u013c\u013d\58\35\2\u013d\u013e\7\4\2\2\u013e\u013f\b\30"+
		"\1\2\u013f\u0186\3\2\2\2\u0140\u0141\5D#\2\u0141\u0142\7\4\2\2\u0142\u0143"+
		"\b\30\1\2\u0143\u0186\3\2\2\2\u0144\u0145\7\26\2\2\u0145\u0146\7\16\2"+
		"\2\u0146\u0147\5N(\2\u0147\u0148\b\30\1\2\u0148\u0149\7\17\2\2\u0149\u014a"+
		"\5.\30\2\u014a\u014b\b\30\1\2\u014b\u0186\3\2\2\2\u014c\u014d\7\26\2\2"+
		"\u014d\u014e\7\16\2\2\u014e\u014f\5N(\2\u014f\u0150\b\30\1\2\u0150\u0151"+
		"\7\17\2\2\u0151\u0152\7\27\2\2\u0152\u0153\5\f\7\2\u0153\u0154\7\30\2"+
		"\2\u0154\u0155\b\30\1\2\u0155\u0186\3\2\2\2\u0156\u0157\7\26\2\2\u0157"+
		"\u0158\7\16\2\2\u0158\u0159\5N(\2\u0159\u015a\b\30\1\2\u015a\u015b\7\17"+
		"\2\2\u015b\u015c\7\27\2\2\u015c\u015d\5\f\7\2\u015d\u015e\b\30\1\2\u015e"+
		"\u015f\7\31\2\2\u015f\u0160\5\f\7\2\u0160\u0161\7\30\2\2\u0161\u0162\b"+
		"\30\1\2\u0162\u0186\3\2\2\2\u0163\u0164\7\32\2\2\u0164\u0165\7\33\2\2"+
		"\u0165\u0166\7\16\2\2\u0166\u0167\5N(\2\u0167\u0168\7\17\2\2\u0168\u0169"+
		"\b\30\1\2\u0169\u016a\5\f\7\2\u016a\u016b\7\34\2\2\u016b\u016c\b\30\1"+
		"\2\u016c\u0186\3\2\2\2\u016d\u016e\7\32\2\2\u016e\u016f\7\63\2\2\u016f"+
		"\u0170\7\n\2\2\u0170\u0171\5\60\31\2\u0171\u0172\7\7\2\2\u0172\u0173\5"+
		"\60\31\2\u0173\u0174\7\7\2\2\u0174\u0175\5\60\31\2\u0175\u0176\b\30\1"+
		"\2\u0176\u0177\5\f\7\2\u0177\u0178\7\34\2\2\u0178\u0179\b\30\1\2\u0179"+
		"\u0186\3\2\2\2\u017a\u017b\7\35\2\2\u017b\u017c\7\36\2\2\u017c\u017d\7"+
		"\16\2\2\u017d\u017e\58\35\2\u017e\u017f\7\17\2\2\u017f\u0180\b\30\1\2"+
		"\u0180\u0181\5\62\32\2\u0181\u0182\7\5\2\2\u0182\u0183\7\35\2\2\u0183"+
		"\u0184\b\30\1\2\u0184\u0186\3\2\2\2\u0185\u013a\3\2\2\2\u0185\u0140\3"+
		"\2\2\2\u0185\u0144\3\2\2\2\u0185\u014c\3\2\2\2\u0185\u0156\3\2\2\2\u0185"+
		"\u0163\3\2\2\2\u0185\u016d\3\2\2\2\u0185\u017a\3\2\2\2\u0186/\3\2\2\2"+
		"\u0187\u0188\7\64\2\2\u0188\u018c\b\31\1\2\u0189\u018a\7\63\2\2\u018a"+
		"\u018c\b\31\1\2\u018b\u0187\3\2\2\2\u018b\u0189\3\2\2\2\u018c\61\3\2\2"+
		"\2\u018d\u018e\7\36\2\2\u018e\u018f\7\16\2\2\u018f\u0190\5\64\33\2\u0190"+
		"\u0191\7\17\2\2\u0191\u0192\5\f\7\2\u0192\u0193\b\32\1\2\u0193\u0194\5"+
		"\62\32\2\u0194\u019b\3\2\2\2\u0195\u0196\7\36\2\2\u0196\u0197\7\37\2\2"+
		"\u0197\u0198\b\32\1\2\u0198\u019b\5\f\7\2\u0199\u019b\3\2\2\2\u019a\u018d"+
		"\3\2\2\2\u019a\u0195\3\2\2\2\u019a\u0199\3\2\2\2\u019b\63\3\2\2\2\u019c"+
		"\u019d\5\24\13\2\u019d\u019e\5\66\34\2\u019e\u019f\b\33\1\2\u019f\u01ae"+
		"\3\2\2\2\u01a0\u01a1\5\24\13\2\u01a1\u01a2\7 \2\2\u01a2\u01a3\5\24\13"+
		"\2\u01a3\u01a4\b\33\1\2\u01a4\u01ae\3\2\2\2\u01a5\u01a6\7 \2\2\u01a6\u01a7"+
		"\5\24\13\2\u01a7\u01a8\b\33\1\2\u01a8\u01ae\3\2\2\2\u01a9\u01aa\5\24\13"+
		"\2\u01aa\u01ab\7 \2\2\u01ab\u01ac\b\33\1\2\u01ac\u01ae\3\2\2\2\u01ad\u019c"+
		"\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae"+
		"\65\3\2\2\2\u01af\u01b0\7\7\2\2\u01b0\u01b1\5\24\13\2\u01b1\u01b2\b\34"+
		"\1\2\u01b2\u01b5\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\67\3\2\2\2\u01b6\u01b7\5@!\2\u01b7\u01b8\5:\36\2"+
		"\u01b8\u01b9\b\35\1\2\u01b99\3\2\2\2\u01ba\u01bb\5<\37\2\u01bb\u01bc\5"+
		"8\35\2\u01bc\u01bd\5:\36\2\u01bd\u01be\b\36\1\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01c1\b\36\1\2\u01c0\u01ba\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1;\3\2\2\2"+
		"\u01c2\u01c3\5> \2\u01c3\u01c4\b\37\1\2\u01c4=\3\2\2\2\u01c5\u01c6\7!"+
		"\2\2\u01c6\u01ce\b \1\2\u01c7\u01c8\7\"\2\2\u01c8\u01ce\b \1\2\u01c9\u01ca"+
		"\7#\2\2\u01ca\u01ce\b \1\2\u01cb\u01cc\7$\2\2\u01cc\u01ce\b \1\2\u01cd"+
		"\u01c5\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce?\3\2\2\2\u01cf\u01d0\5\24\13\2\u01d0\u01d1\b!\1\2\u01d1\u01e1"+
		"\3\2\2\2\u01d2\u01d3\7\16\2\2\u01d3\u01d4\58\35\2\u01d4\u01d5\7\17\2\2"+
		"\u01d5\u01d6\b!\1\2\u01d6\u01e1\3\2\2\2\u01d7\u01d8\7\63\2\2\u01d8\u01d9"+
		"\7\16\2\2\u01d9\u01da\58\35\2\u01da\u01db\5B\"\2\u01db\u01dc\7\17\2\2"+
		"\u01dc\u01dd\b!\1\2\u01dd\u01e1\3\2\2\2\u01de\u01df\7\63\2\2\u01df\u01e1"+
		"\b!\1\2\u01e0\u01cf\3\2\2\2\u01e0\u01d2\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1A\3\2\2\2\u01e2\u01e3\7\7\2\2\u01e3\u01e4\58\35\2"+
		"\u01e4\u01e5\5B\"\2\u01e5\u01e6\b\"\1\2\u01e6\u01e9\3\2\2\2\u01e7\u01e9"+
		"\b\"\1\2\u01e8\u01e2\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9C\3\2\2\2\u01ea"+
		"\u01eb\7%\2\2\u01eb\u01ec\7\63\2\2\u01ec\u01ed\5F$\2\u01ed\u01ee\b#\1"+
		"\2\u01eeE\3\2\2\2\u01ef\u01f0\7\16\2\2\u01f0\u01f1\58\35\2\u01f1\u01f2"+
		"\5B\"\2\u01f2\u01f3\7\17\2\2\u01f3\u01f4\b$\1\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f7\b$\1\2\u01f6\u01ef\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7G\3\2\2\2\u01f8"+
		"\u01f9\5J&\2\u01f9\u01fa\5H%\2\u01fa\u0200\3\2\2\2\u01fb\u01fc\5L\'\2"+
		"\u01fc\u01fd\5H%\2\u01fd\u0200\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f8"+
		"\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200I\3\2\2\2\u0201"+
		"\u0202\7\20\2\2\u0202\u0203\7\63\2\2\u0203\u0204\b&\1\2\u0204\u0205\5"+
		"\"\22\2\u0205\u0206\5&\24\2\u0206\u0207\b&\1\2\u0207\u0208\5\4\3\2\u0208"+
		"\u0209\5.\30\2\u0209\u020a\5\f\7\2\u020a\u020b\7\5\2\2\u020b\u020c\7\20"+
		"\2\2\u020c\u020d\7\63\2\2\u020d\u020e\b&\1\2\u020eK\3\2\2\2\u020f\u0210"+
		"\7\25\2\2\u0210\u0211\7\63\2\2\u0211\u0212\7\16\2\2\u0212\u0213\5$\23"+
		"\2\u0213\u0214\7\17\2\2\u0214\u0215\5\30\r\2\u0215\u0216\7\t\2\2\u0216"+
		"\u0217\7\63\2\2\u0217\u0218\7\4\2\2\u0218\u0219\b\'\1\2\u0219\u021a\5"+
		",\27\2\u021a\u021b\b\'\1\2\u021b\u021c\5\4\3\2\u021c\u021d\5.\30\2\u021d"+
		"\u021e\5\f\7\2\u021e\u021f\7\63\2\2\u021f\u0220\7\n\2\2\u0220\u0221\5"+
		"8\35\2\u0221\u0222\7\4\2\2\u0222\u0223\b\'\1\2\u0223\u0224\7\5\2\2\u0224"+
		"\u0225\7\25\2\2\u0225\u0226\7\63\2\2\u0226\u0227\b\'\1\2\u0227M\3\2\2"+
		"\2\u0228\u0229\b(\1\2\u0229\u022a\5R*\2\u022a\u022b\b(\1\2\u022b\u0233"+
		"\3\2\2\2\u022c\u022d\f\4\2\2\u022d\u022e\5P)\2\u022e\u022f\5N(\5\u022f"+
		"\u0230\b(\1\2\u0230\u0232\3\2\2\2\u0231\u022c\3\2\2\2\u0232\u0235\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234O\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0236\u0237\7&\2\2\u0237\u023f\b)\1\2\u0238\u0239\7\'\2\2\u0239"+
		"\u023f\b)\1\2\u023a\u023b\7(\2\2\u023b\u023f\b)\1\2\u023c\u023d\7)\2\2"+
		"\u023d\u023f\b)\1\2\u023e\u0236\3\2\2\2\u023e\u0238\3\2\2\2\u023e\u023a"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023fQ\3\2\2\2\u0240\u0241\58\35\2\u0241"+
		"\u0242\5T+\2\u0242\u0243\58\35\2\u0243\u0244\b*\1\2\u0244\u0253\3\2\2"+
		"\2\u0245\u0246\7\16\2\2\u0246\u0247\5N(\2\u0247\u0248\7\17\2\2\u0248\u0249"+
		"\b*\1\2\u0249\u0253\3\2\2\2\u024a\u024b\7*\2\2\u024b\u024c\5R*\2\u024c"+
		"\u024d\b*\1\2\u024d\u0253\3\2\2\2\u024e\u024f\7+\2\2\u024f\u0253\b*\1"+
		"\2\u0250\u0251\7,\2\2\u0251\u0253\b*\1\2\u0252\u0240\3\2\2\2\u0252\u0245"+
		"\3\2\2\2\u0252\u024a\3\2\2\2\u0252\u024e\3\2\2\2\u0252\u0250\3\2\2\2\u0253"+
		"S\3\2\2\2\u0254\u0255\7-\2\2\u0255\u0261\b+\1\2\u0256\u0257\7.\2\2\u0257"+
		"\u0261\b+\1\2\u0258\u0259\7/\2\2\u0259\u0261\b+\1\2\u025a\u025b\7\60\2"+
		"\2\u025b\u0261\b+\1\2\u025c\u025d\7\61\2\2\u025d\u0261\b+\1\2\u025e\u025f"+
		"\7\62\2\2\u025f\u0261\b+\1\2\u0260\u0254\3\2\2\2\u0260\u0256\3\2\2\2\u0260"+
		"\u0258\3\2\2\2\u0260\u025a\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0261U\3\2\2\2$hpx\u0081\u0087\u009b\u00aa\u00b4\u00c2\u00cb\u00d5"+
		"\u00dc\u00e8\u00ef\u00ff\u0105\u0113\u011b\u0138\u0185\u018b\u019a\u01ad"+
		"\u01b4\u01c0\u01cd\u01e0\u01e8\u01f6\u01ff\u0233\u023e\u0252\u0260";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}