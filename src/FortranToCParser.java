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

	    String variablesToString (ArrayList<Variable> v) {
	        String s = "";

	        for (int i = 0; i < v.size(); ++i) {
	            if (i != v.size() - 1) {
	                s += v.get(i).toString();
	                s = s.replace('*','&');
	                s += " , ";
	            }
	            else {
	                s += v.get(i).toString();
	                s = s.replace('*','&');
	            }
	        }

	        return s;
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
			 System.out.println("void main (void) {") ; 
			setState(90);
			sent();
			setState(91);
			sentlist();
			 System.out.println("}") ; 
			setState(93);
			match(T__2);
			setState(94);
			match(T__0);
			 statements.add("}") ; 
			setState(96);
			match(IDENT);
			setState(97);
			subproglist();
			  
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				dcl();
				setState(101);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__3);
				setState(107);
				cablist();
				setState(108);
				match(T__2);
				setState(109);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				decproc();
				setState(115);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				decfun();
				setState(118);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				decproc();
				setState(123);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				decfun();
				setState(126);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				sent();
				setState(132);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				tipo();
				setState(138);
				match(T__4);
				setState(139);
				match(T__5);
				setState(140);
				match(T__6);
				setState(141);
				((DclContext)_localctx).IDENT = match(IDENT);
				setState(142);
				match(T__7);
				setState(143);
				((DclContext)_localctx).simpvalue = simpvalue();
				 constants.add(new Constant((((DclContext)_localctx).IDENT!=null?((DclContext)_localctx).IDENT.getText():null), ((DclContext)_localctx).simpvalue.value)) ; 
				setState(145);
				ctelist();
				setState(146);
				match(T__1);
				setState(147);
				defcte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((DclContext)_localctx).tipo = tipo();
				setState(150);
				match(T__6);
				setState(151);
				varlist(((DclContext)_localctx).tipo.value, ((DclContext)_localctx).tipo.size);
				setState(152);
				match(T__1);
				setState(153);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				tipo();
				setState(158);
				match(T__4);
				setState(159);
				match(T__5);
				setState(160);
				match(T__6);
				setState(161);
				((DefcteContext)_localctx).IDENT = match(IDENT);
				setState(162);
				match(T__7);
				setState(163);
				((DefcteContext)_localctx).simpvalue = simpvalue();
				 constants.add(new Constant((((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null), ((DefcteContext)_localctx).simpvalue.value)) ; 
				setState(165);
				ctelist();
				setState(166);
				match(T__1);
				setState(167);
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__4);
				setState(173);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(174);
				match(T__7);
				setState(175);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				 constants.add(new Constant((((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null), ((CtelistContext)_localctx).simpvalue.value)) ; 
				setState(177);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null) ; 
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null) ; 
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) ; 
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null) ; 
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				 ((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null) ; 
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((DefvarContext)_localctx).tipo = tipo();
				setState(197);
				match(T__6);
				setState(198);
				varlist(((DefvarContext)_localctx).tipo.value, ((DefvarContext)_localctx).tipo.size);
				setState(199);
				match(T__1);
				setState(200);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__8);
				 ((TipoContext)_localctx).value =  "int" ; ((TipoContext)_localctx).size =  "" ; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__9);
				 ((TipoContext)_localctx).value =  "float" ; ((TipoContext)_localctx).size =  "" ; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__10);
				setState(210);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__11);
				setState(216);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(217);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((VarlistContext)_localctx).IDENT = match(IDENT);
				setState(223);
				((VarlistContext)_localctx).init = init();
				 statements.add(_localctx.type + " " + (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + _localctx.size + ((VarlistContext)_localctx).init.value + ";") ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((VarlistContext)_localctx).IDENT = match(IDENT);
				setState(227);
				((VarlistContext)_localctx).init = init();
				 statements.add(_localctx.type + " " + (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + _localctx.size + ((VarlistContext)_localctx).init.value + ";") ; 
				setState(229);
				match(T__4);
				setState(230);
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
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__7);
				setState(235);
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
		public Token id1;
		public Token id2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
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
			setState(241);
			match(T__13);
			setState(242);
			((DecprocContext)_localctx).id1 = match(IDENT);
			setState(243);
			formal_paramlist();
			setState(244);
			dec_s_paramlist();
			setState(245);
			match(T__2);
			setState(246);
			match(T__13);
			setState(247);
			((DecprocContext)_localctx).id2 = match(IDENT);
			 Header h = new Header("void", (((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null), (((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null));
			                                   h.setParameters(variables);
			                                   variables.clear();
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
			setState(255);
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
				setState(251);
				match(T__11);
				setState(252);
				nomparamlist();
				setState(253);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(IDENT);
				setState(259);
				match(T__4);
				setState(260);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(264);
				match(T__4);
				setState(265);
				match(T__14);
				setState(266);
				match(T__11);
				setState(267);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(268);
				match(T__12);
				setState(269);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(270);
				match(T__1);
				 variables.add(new Variable(((Dec_s_paramlistContext)_localctx).tipo.value, ((Dec_s_paramlistContext)_localctx).tipoparam.value + (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), ((Dec_s_paramlistContext)_localctx).tipo.size)); 
				setState(272);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__15);
				 ((TipoparamContext)_localctx).value =  ""; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__16);
				 ((TipoparamContext)_localctx).value =  "*"; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__17);
				 ((TipoparamContext)_localctx).value =  "*"; 
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
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
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
			setState(285);
			match(T__18);
			setState(286);
			((DecfunContext)_localctx).id1 = match(IDENT);
			setState(287);
			match(T__11);
			setState(288);
			nomparamlist();
			setState(289);
			match(T__12);
			setState(290);
			((DecfunContext)_localctx).tipo = tipo();
			setState(291);
			match(T__6);
			setState(292);
			((DecfunContext)_localctx).id2 = match(IDENT);
			setState(293);
			match(T__1);
			setState(294);
			dec_f_paramlist();
			 Header h = new Header(((DecfunContext)_localctx).tipo.value, (((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null), (((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null));
			                      h.setParameters(variables);
			                      variables.clear();
			                      headers.add(h);
			                    
			setState(296);
			match(T__2);
			setState(297);
			match(T__18);
			setState(298);
			match(IDENT);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(301);
				match(T__4);
				setState(302);
				match(T__14);
				setState(303);
				match(T__11);
				setState(304);
				match(T__15);
				setState(305);
				match(T__12);
				setState(306);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(307);
				match(T__1);
				 variables.add(new Variable(((Dec_f_paramlistContext)_localctx).tipo.value, (((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), ((Dec_f_paramlistContext)_localctx).tipo.size));
				setState(309);
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
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(315);
				match(T__7);
				setState(316);
				((SentContext)_localctx).exp = exp();
				setState(317);
				match(T__1);
				 statements.add((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).exp.value + ";") ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((SentContext)_localctx).proc_call = proc_call();
				setState(321);
				match(T__1);
				 statements.add(((SentContext)_localctx).proc_call.value) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(T__19);
				setState(325);
				match(T__11);
				setState(326);
				expcond(0);
				setState(327);
				match(T__12);
				setState(328);
				sent();
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
				expcond(0);
				setState(333);
				match(T__12);
				setState(334);
				match(T__20);
				setState(335);
				sentlist();
				setState(336);
				match(T__21);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(T__19);
				setState(339);
				match(T__11);
				setState(340);
				expcond(0);
				setState(341);
				match(T__12);
				setState(342);
				match(T__20);
				setState(343);
				sentlist();
				setState(344);
				match(T__22);
				setState(345);
				sentlist();
				setState(346);
				match(T__21);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				match(T__23);
				setState(349);
				match(T__24);
				setState(350);
				match(T__11);
				setState(351);
				expcond(0);
				setState(352);
				match(T__12);
				setState(353);
				sentlist();
				setState(354);
				match(T__25);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
				match(T__23);
				setState(357);
				match(IDENT);
				setState(358);
				match(T__7);
				setState(359);
				doval();
				setState(360);
				match(T__4);
				setState(361);
				doval();
				setState(362);
				match(T__4);
				setState(363);
				doval();
				setState(364);
				sentlist();
				setState(365);
				match(T__25);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(367);
				match(T__26);
				setState(368);
				match(T__27);
				setState(369);
				match(T__11);
				setState(370);
				exp();
				setState(371);
				match(T__12);
				setState(372);
				casos();
				setState(373);
				match(T__2);
				setState(374);
				match(T__26);
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
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((DovalContext)_localctx).value =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null) ; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__27);
				setState(385);
				match(T__11);
				setState(386);
				etiquetas();
				setState(387);
				match(T__12);
				setState(388);
				sentlist();
				 statements.add("break;") ; 
				setState(390);
				casos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T__27);
				setState(393);
				match(T__28);
				 statements.add("default :") ; 
				setState(395);
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
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				simpvalue();
				setState(400);
				listaetiqetas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				simpvalue();
				setState(403);
				match(T__29);
				setState(404);
				simpvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(T__29);
				setState(407);
				simpvalue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				simpvalue();
				setState(409);
				match(T__29);
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
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__4);
				setState(414);
				simpvalue();
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
			setState(418);
			((ExpContext)_localctx).factor = factor();
			setState(419);
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
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				((ExpAuxContext)_localctx).op = op();
				setState(423);
				((ExpAuxContext)_localctx).exp = exp();
				setState(424);
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
			setState(430);
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
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__30);
				 ((OparitContext)_localctx).value =  " + " ; 
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(T__31);
				 ((OparitContext)_localctx).value =  " - " ; 
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(T__32);
				 ((OparitContext)_localctx).value =  " * " ; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				((FactorContext)_localctx).simpvalue = simpvalue();
				 ((FactorContext)_localctx).value =  ((FactorContext)_localctx).simpvalue.value ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(T__11);
				setState(447);
				((FactorContext)_localctx).exp = exp();
				setState(448);
				match(T__12);
				 ((FactorContext)_localctx).value =  "(" + ((FactorContext)_localctx).exp.value + ")" ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(452);
				match(T__11);
				setState(453);
				((FactorContext)_localctx).exp = exp();
				setState(454);
				((FactorContext)_localctx).explist = explist();
				setState(455);
				match(T__12);
				 ((FactorContext)_localctx).value =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + "(" + ((FactorContext)_localctx).exp.value + ((FactorContext)_localctx).explist.value + ")" ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(IDENT);
				 ((FactorContext)_localctx).value =  "" ; 
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
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(T__4);
				setState(463);
				((ExplistContext)_localctx).exp = exp();
				setState(464);
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
			setState(470);
			match(T__34);
			setState(471);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(472);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();
			 ((Proc_callContext)_localctx).value =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + " ( " + ((Proc_callContext)_localctx).subpparamlist.value + " ) ;" ; 
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
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(T__11);
				setState(476);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(477);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(478);
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
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				codproc();
				setState(485);
				subproglist();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				codfun();
				setState(488);
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
			setState(493);
			match(T__13);
			setState(494);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			 variables.clear() ; 
			setState(496);
			formal_paramlist();
			setState(497);
			dec_s_paramlist();
			 statements.add("void " + (((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null) + " (" + variablesToString(variables) + ") {") ; 
			setState(499);
			dcllist();
			setState(500);
			sent();
			setState(501);
			sentlist();
			setState(502);
			match(T__2);
			setState(503);
			match(T__13);
			setState(504);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			 statements.add("}") ; 
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
			setState(507);
			match(T__18);
			setState(508);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(509);
			match(T__11);
			setState(510);
			nomparamlist();
			setState(511);
			match(T__12);
			setState(512);
			((CodfunContext)_localctx).tipo = tipo();
			setState(513);
			match(T__6);
			setState(514);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(515);
			match(T__1);
			 variables.clear() ; 
			setState(517);
			dec_f_paramlist();
			 statements.add(((CodfunContext)_localctx).tipo.value + " " + (((CodfunContext)_localctx).IDENT!=null?((CodfunContext)_localctx).IDENT.getText():null) + " (" + variablesToString(variables) + ") {") ; 
			setState(519);
			dcllist();
			setState(520);
			sent();
			setState(521);
			sentlist();
			setState(522);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(523);
			match(T__7);
			setState(524);
			((CodfunContext)_localctx).exp = exp();
			setState(525);
			match(T__1);
			 statements.add("return " + ((CodfunContext)_localctx).exp.value) ; 
			setState(527);
			match(T__2);
			setState(528);
			match(T__18);
			setState(529);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			 statements.add("}") ; 
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
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public List<ExpcondContext> expcond() {
			return getRuleContexts(ExpcondContext.class);
		}
		public ExpcondContext expcond(int i) {
			return getRuleContext(ExpcondContext.class,i);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
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
			setState(533);
			factorcond();
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpcondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expcond);
					setState(535);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(536);
					oplog();
					setState(537);
					expcond(3);
					}
					} 
				}
				setState(543);
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
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(T__35);
				 ((OplogContext)_localctx).value =  " || " ; 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(T__36);
				 ((OplogContext)_localctx).value =  " && " ; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				match(T__37);
				 ((OplogContext)_localctx).value =  " !^ " ; 
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
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
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				((FactorcondContext)_localctx).exp1 = exp();
				setState(555);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(556);
				((FactorcondContext)_localctx).exp2 = exp();
				 ((FactorcondContext)_localctx).value =  ((FactorcondContext)_localctx).exp1.value + ((FactorcondContext)_localctx).opcomp.value + ((FactorcondContext)_localctx).exp2.value ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				match(T__11);
				setState(560);
				((FactorcondContext)_localctx).expcond = expcond(0);
				setState(561);
				match(T__12);
				 ((FactorcondContext)_localctx).value =  "(" + ((FactorcondContext)_localctx).expcond.value + ")" ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				match(T__39);
				setState(565);
				((FactorcondContext)_localctx).factaux = factorcond();
				 ((FactorcondContext)_localctx).value =  "!" + ((FactorcondContext)_localctx).factaux.value ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				match(T__40);
				 ((FactorcondContext)_localctx).value =  " true " ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(570);
				match(T__41);
				 ((FactorcondContext)_localctx).value =  "false" ; 
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
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(T__42);
				 ((OpcompContext)_localctx).value =  " < " ; 
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(T__43);
				 ((OpcompContext)_localctx).value =  " > " ; 
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(T__44);
				 ((OpcompContext)_localctx).value =  " <= " ; 
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(T__45);
				 ((OpcompContext)_localctx).value =  " >= " ; 
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				match(T__46);
				 ((OpcompContext)_localctx).value =  " == " ; 
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 6);
				{
				setState(584);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u024f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3k\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\7\3\7\3\7\3"+
		"\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b7"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00c5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ce\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00eb\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00f2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0102\n\22\3\23\3\23\3\23\3\23"+
		"\5\23\u0108\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0116\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013b"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u017b\n\30\3\31\3\31\3\31\3\31"+
		"\5\31\u0181\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0190\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u019e\n\33\3\34\3\34\3\34\5\34\u01a3\n\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01af\n\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01bc\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u01cf\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01d7\n"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01e5\n$\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u01ee\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\7(\u021e\n(\f(\16(\u0221\13(\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\5)\u022b\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u023f\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+"+
		"\u024d\n+\3+\2\3N,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRT\2\2\2\u0264\2V\3\2\2\2\4j\3\2\2\2\6r\3\2\2\2"+
		"\bz\3\2\2\2\n\u0083\3\2\2\2\f\u0089\3\2\2\2\16\u009d\3\2\2\2\20\u00ac"+
		"\3\2\2\2\22\u00b6\3\2\2\2\24\u00c4\3\2\2\2\26\u00cd\3\2\2\2\30\u00d7\3"+
		"\2\2\2\32\u00de\3\2\2\2\34\u00ea\3\2\2\2\36\u00f1\3\2\2\2 \u00f3\3\2\2"+
		"\2\"\u0101\3\2\2\2$\u0107\3\2\2\2&\u0115\3\2\2\2(\u011d\3\2\2\2*\u011f"+
		"\3\2\2\2,\u013a\3\2\2\2.\u017a\3\2\2\2\60\u0180\3\2\2\2\62\u018f\3\2\2"+
		"\2\64\u019d\3\2\2\2\66\u01a2\3\2\2\28\u01a4\3\2\2\2:\u01ae\3\2\2\2<\u01b0"+
		"\3\2\2\2>\u01bb\3\2\2\2@\u01ce\3\2\2\2B\u01d6\3\2\2\2D\u01d8\3\2\2\2F"+
		"\u01e4\3\2\2\2H\u01ed\3\2\2\2J\u01ef\3\2\2\2L\u01fd\3\2\2\2N\u0216\3\2"+
		"\2\2P\u022a\3\2\2\2R\u023e\3\2\2\2T\u024c\3\2\2\2VW\7\3\2\2WX\7\63\2\2"+
		"XY\7\4\2\2YZ\5\4\3\2Z[\5\6\4\2[\\\b\2\1\2\\]\5.\30\2]^\5\f\7\2^_\b\2\1"+
		"\2_`\7\5\2\2`a\7\3\2\2ab\b\2\1\2bc\7\63\2\2cd\5H%\2de\b\2\1\2e\3\3\2\2"+
		"\2fg\5\16\b\2gh\5\4\3\2hk\3\2\2\2ik\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\5\3\2"+
		"\2\2lm\7\6\2\2mn\5\b\5\2no\7\5\2\2op\7\6\2\2ps\3\2\2\2qs\3\2\2\2rl\3\2"+
		"\2\2rq\3\2\2\2s\7\3\2\2\2tu\5 \21\2uv\5\n\6\2v{\3\2\2\2wx\5*\26\2xy\5"+
		"\n\6\2y{\3\2\2\2zt\3\2\2\2zw\3\2\2\2{\t\3\2\2\2|}\5 \21\2}~\5\n\6\2~\u0084"+
		"\3\2\2\2\177\u0080\5*\26\2\u0080\u0081\5\n\6\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083|\3\2\2\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\13\3\2\2\2\u0085\u0086\5.\30\2\u0086\u0087\5\f\7\2\u0087\u008a\3\2\2"+
		"\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0088\3\2\2\2\u008a\r"+
		"\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d\7\7\2\2\u008d\u008e\7\b\2\2"+
		"\u008e\u008f\7\t\2\2\u008f\u0090\7\63\2\2\u0090\u0091\7\n\2\2\u0091\u0092"+
		"\5\24\13\2\u0092\u0093\b\b\1\2\u0093\u0094\5\22\n\2\u0094\u0095\7\4\2"+
		"\2\u0095\u0096\5\20\t\2\u0096\u009e\3\2\2\2\u0097\u0098\5\30\r\2\u0098"+
		"\u0099\7\t\2\2\u0099\u009a\5\34\17\2\u009a\u009b\7\4\2\2\u009b\u009c\5"+
		"\26\f\2\u009c\u009e\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u0097\3\2\2\2\u009e"+
		"\17\3\2\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7\b\2"+
		"\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7\63\2\2\u00a4\u00a5\7\n\2\2\u00a5"+
		"\u00a6\5\24\13\2\u00a6\u00a7\b\t\1\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9"+
		"\7\4\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\3\2\2\2"+
		"\u00ac\u009f\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00af"+
		"\7\7\2\2\u00af\u00b0\7\63\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5\24\13"+
		"\2\u00b2\u00b3\b\n\1\2\u00b3\u00b4\5\22\n\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\23\3\2\2"+
		"\2\u00b8\u00b9\7\64\2\2\u00b9\u00c5\b\13\1\2\u00ba\u00bb\7\65\2\2\u00bb"+
		"\u00c5\b\13\1\2\u00bc\u00bd\7\66\2\2\u00bd\u00c5\b\13\1\2\u00be\u00bf"+
		"\79\2\2\u00bf\u00c5\b\13\1\2\u00c0\u00c1\7:\2\2\u00c1\u00c5\b\13\1\2\u00c2"+
		"\u00c3\7;\2\2\u00c3\u00c5\b\13\1\2\u00c4\u00b8\3\2\2\2\u00c4\u00ba\3\2"+
		"\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\t\2"+
		"\2\u00c8\u00c9\5\34\17\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\26\f\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d8\b\r\1\2\u00d1\u00d2"+
		"\7\f\2\2\u00d2\u00d8\b\r\1\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\5\32\16\2"+
		"\u00d5\u00d6\b\r\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d1"+
		"\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00da\7\16\2\2\u00da"+
		"\u00db\7\64\2\2\u00db\u00dc\7\17\2\2\u00dc\u00df\b\16\1\2\u00dd\u00df"+
		"\b\16\1\2\u00de\u00d9\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\33\3\2\2\2\u00e0"+
		"\u00e1\7\63\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\b\17\1\2\u00e3\u00eb"+
		"\3\2\2\2\u00e4\u00e5\7\63\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\b\17\1"+
		"\2\u00e7\u00e8\7\7\2\2\u00e8\u00e9\5\34\17\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e0\3\2\2\2\u00ea\u00e4\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00ed\7\n\2"+
		"\2\u00ed\u00ee\5\24\13\2\u00ee\u00ef\b\20\1\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00f2\b\20\1\2\u00f1\u00ec\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\37\3\2\2"+
		"\2\u00f3\u00f4\7\20\2\2\u00f4\u00f5\7\63\2\2\u00f5\u00f6\5\"\22\2\u00f6"+
		"\u00f7\5&\24\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\7"+
		"\63\2\2\u00fa\u00fb\b\21\1\2\u00fb!\3\2\2\2\u00fc\u0102\3\2\2\2\u00fd"+
		"\u00fe\7\16\2\2\u00fe\u00ff\5$\23\2\u00ff\u0100\7\17\2\2\u0100\u0102\3"+
		"\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0102#\3\2\2\2\u0103\u0108"+
		"\7\63\2\2\u0104\u0105\7\63\2\2\u0105\u0106\7\7\2\2\u0106\u0108\5$\23\2"+
		"\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0108%\3\2\2\2\u0109\u010a\5"+
		"\30\r\2\u010a\u010b\7\7\2\2\u010b\u010c\7\21\2\2\u010c\u010d\7\16\2\2"+
		"\u010d\u010e\5(\25\2\u010e\u010f\7\17\2\2\u010f\u0110\7\63\2\2\u0110\u0111"+
		"\7\4\2\2\u0111\u0112\b\24\1\2\u0112\u0113\5&\24\2\u0113\u0116\3\2\2\2"+
		"\u0114\u0116\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u0114\3\2\2\2\u0116\'\3"+
		"\2\2\2\u0117\u0118\7\22\2\2\u0118\u011e\b\25\1\2\u0119\u011a\7\23\2\2"+
		"\u011a\u011e\b\25\1\2\u011b\u011c\7\24\2\2\u011c\u011e\b\25\1\2\u011d"+
		"\u0117\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011b\3\2\2\2\u011e)\3\2\2\2"+
		"\u011f\u0120\7\25\2\2\u0120\u0121\7\63\2\2\u0121\u0122\7\16\2\2\u0122"+
		"\u0123\5$\23\2\u0123\u0124\7\17\2\2\u0124\u0125\5\30\r\2\u0125\u0126\7"+
		"\t\2\2\u0126\u0127\7\63\2\2\u0127\u0128\7\4\2\2\u0128\u0129\5,\27\2\u0129"+
		"\u012a\b\26\1\2\u012a\u012b\7\5\2\2\u012b\u012c\7\25\2\2\u012c\u012d\7"+
		"\63\2\2\u012d+\3\2\2\2\u012e\u012f\5\30\r\2\u012f\u0130\7\7\2\2\u0130"+
		"\u0131\7\21\2\2\u0131\u0132\7\16\2\2\u0132\u0133\7\22\2\2\u0133\u0134"+
		"\7\17\2\2\u0134\u0135\7\63\2\2\u0135\u0136\7\4\2\2\u0136\u0137\b\27\1"+
		"\2\u0137\u0138\5,\27\2\u0138\u013b\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u012e"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013b-\3\2\2\2\u013c\u013d\7\63\2\2\u013d"+
		"\u013e\7\n\2\2\u013e\u013f\58\35\2\u013f\u0140\7\4\2\2\u0140\u0141\b\30"+
		"\1\2\u0141\u017b\3\2\2\2\u0142\u0143\5D#\2\u0143\u0144\7\4\2\2\u0144\u0145"+
		"\b\30\1\2\u0145\u017b\3\2\2\2\u0146\u0147\7\26\2\2\u0147\u0148\7\16\2"+
		"\2\u0148\u0149\5N(\2\u0149\u014a\7\17\2\2\u014a\u014b\5.\30\2\u014b\u017b"+
		"\3\2\2\2\u014c\u014d\7\26\2\2\u014d\u014e\7\16\2\2\u014e\u014f\5N(\2\u014f"+
		"\u0150\7\17\2\2\u0150\u0151\7\27\2\2\u0151\u0152\5\f\7\2\u0152\u0153\7"+
		"\30\2\2\u0153\u017b\3\2\2\2\u0154\u0155\7\26\2\2\u0155\u0156\7\16\2\2"+
		"\u0156\u0157\5N(\2\u0157\u0158\7\17\2\2\u0158\u0159\7\27\2\2\u0159\u015a"+
		"\5\f\7\2\u015a\u015b\7\31\2\2\u015b\u015c\5\f\7\2\u015c\u015d\7\30\2\2"+
		"\u015d\u017b\3\2\2\2\u015e\u015f\7\32\2\2\u015f\u0160\7\33\2\2\u0160\u0161"+
		"\7\16\2\2\u0161\u0162\5N(\2\u0162\u0163\7\17\2\2\u0163\u0164\5\f\7\2\u0164"+
		"\u0165\7\34\2\2\u0165\u017b\3\2\2\2\u0166\u0167\7\32\2\2\u0167\u0168\7"+
		"\63\2\2\u0168\u0169\7\n\2\2\u0169\u016a\5\60\31\2\u016a\u016b\7\7\2\2"+
		"\u016b\u016c\5\60\31\2\u016c\u016d\7\7\2\2\u016d\u016e\5\60\31\2\u016e"+
		"\u016f\5\f\7\2\u016f\u0170\7\34\2\2\u0170\u017b\3\2\2\2\u0171\u0172\7"+
		"\35\2\2\u0172\u0173\7\36\2\2\u0173\u0174\7\16\2\2\u0174\u0175\58\35\2"+
		"\u0175\u0176\7\17\2\2\u0176\u0177\5\62\32\2\u0177\u0178\7\5\2\2\u0178"+
		"\u0179\7\35\2\2\u0179\u017b\3\2\2\2\u017a\u013c\3\2\2\2\u017a\u0142\3"+
		"\2\2\2\u017a\u0146\3\2\2\2\u017a\u014c\3\2\2\2\u017a\u0154\3\2\2\2\u017a"+
		"\u015e\3\2\2\2\u017a\u0166\3\2\2\2\u017a\u0171\3\2\2\2\u017b/\3\2\2\2"+
		"\u017c\u017d\7\64\2\2\u017d\u0181\b\31\1\2\u017e\u017f\7\63\2\2\u017f"+
		"\u0181\b\31\1\2\u0180\u017c\3\2\2\2\u0180\u017e\3\2\2\2\u0181\61\3\2\2"+
		"\2\u0182\u0183\7\36\2\2\u0183\u0184\7\16\2\2\u0184\u0185\5\64\33\2\u0185"+
		"\u0186\7\17\2\2\u0186\u0187\5\f\7\2\u0187\u0188\b\32\1\2\u0188\u0189\5"+
		"\62\32\2\u0189\u0190\3\2\2\2\u018a\u018b\7\36\2\2\u018b\u018c\7\37\2\2"+
		"\u018c\u018d\b\32\1\2\u018d\u0190\5\f\7\2\u018e\u0190\3\2\2\2\u018f\u0182"+
		"\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u018e\3\2\2\2\u0190\63\3\2\2\2\u0191"+
		"\u0192\5\24\13\2\u0192\u0193\5\66\34\2\u0193\u019e\3\2\2\2\u0194\u0195"+
		"\5\24\13\2\u0195\u0196\7 \2\2\u0196\u0197\5\24\13\2\u0197\u019e\3\2\2"+
		"\2\u0198\u0199\7 \2\2\u0199\u019e\5\24\13\2\u019a\u019b\5\24\13\2\u019b"+
		"\u019c\7 \2\2\u019c\u019e\3\2\2\2\u019d\u0191\3\2\2\2\u019d\u0194\3\2"+
		"\2\2\u019d\u0198\3\2\2\2\u019d\u019a\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a0"+
		"\7\7\2\2\u01a0\u01a3\5\24\13\2\u01a1\u01a3\3\2\2\2\u01a2\u019f\3\2\2\2"+
		"\u01a2\u01a1\3\2\2\2\u01a3\67\3\2\2\2\u01a4\u01a5\5@!\2\u01a5\u01a6\5"+
		":\36\2\u01a6\u01a7\b\35\1\2\u01a79\3\2\2\2\u01a8\u01a9\5<\37\2\u01a9\u01aa"+
		"\58\35\2\u01aa\u01ab\5:\36\2\u01ab\u01ac\b\36\1\2\u01ac\u01af\3\2\2\2"+
		"\u01ad\u01af\b\36\1\2\u01ae\u01a8\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af;\3"+
		"\2\2\2\u01b0\u01b1\5> \2\u01b1\u01b2\b\37\1\2\u01b2=\3\2\2\2\u01b3\u01b4"+
		"\7!\2\2\u01b4\u01bc\b \1\2\u01b5\u01b6\7\"\2\2\u01b6\u01bc\b \1\2\u01b7"+
		"\u01b8\7#\2\2\u01b8\u01bc\b \1\2\u01b9\u01ba\7$\2\2\u01ba\u01bc\b \1\2"+
		"\u01bb\u01b3\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc?\3\2\2\2\u01bd\u01be\5\24\13\2\u01be\u01bf\b!\1\2\u01bf"+
		"\u01cf\3\2\2\2\u01c0\u01c1\7\16\2\2\u01c1\u01c2\58\35\2\u01c2\u01c3\7"+
		"\17\2\2\u01c3\u01c4\b!\1\2\u01c4\u01cf\3\2\2\2\u01c5\u01c6\7\63\2\2\u01c6"+
		"\u01c7\7\16\2\2\u01c7\u01c8\58\35\2\u01c8\u01c9\5B\"\2\u01c9\u01ca\7\17"+
		"\2\2\u01ca\u01cb\b!\1\2\u01cb\u01cf\3\2\2\2\u01cc\u01cd\7\63\2\2\u01cd"+
		"\u01cf\b!\1\2\u01ce\u01bd\3\2\2\2\u01ce\u01c0\3\2\2\2\u01ce\u01c5\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cfA\3\2\2\2\u01d0\u01d1\7\7\2\2\u01d1\u01d2"+
		"\58\35\2\u01d2\u01d3\5B\"\2\u01d3\u01d4\b\"\1\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d7\b\"\1\2\u01d6\u01d0\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7C\3\2\2\2"+
		"\u01d8\u01d9\7%\2\2\u01d9\u01da\7\63\2\2\u01da\u01db\5F$\2\u01db\u01dc"+
		"\b#\1\2\u01dcE\3\2\2\2\u01dd\u01de\7\16\2\2\u01de\u01df\58\35\2\u01df"+
		"\u01e0\5B\"\2\u01e0\u01e1\7\17\2\2\u01e1\u01e2\b$\1\2\u01e2\u01e5\3\2"+
		"\2\2\u01e3\u01e5\b$\1\2\u01e4\u01dd\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"G\3\2\2\2\u01e6\u01e7\5J&\2\u01e7\u01e8\5H%\2\u01e8\u01ee\3\2\2\2\u01e9"+
		"\u01ea\5L\'\2\u01ea\u01eb\5H%\2\u01eb\u01ee\3\2\2\2\u01ec\u01ee\3\2\2"+
		"\2\u01ed\u01e6\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeI"+
		"\3\2\2\2\u01ef\u01f0\7\20\2\2\u01f0\u01f1\7\63\2\2\u01f1\u01f2\b&\1\2"+
		"\u01f2\u01f3\5\"\22\2\u01f3\u01f4\5&\24\2\u01f4\u01f5\b&\1\2\u01f5\u01f6"+
		"\5\4\3\2\u01f6\u01f7\5.\30\2\u01f7\u01f8\5\f\7\2\u01f8\u01f9\7\5\2\2\u01f9"+
		"\u01fa\7\20\2\2\u01fa\u01fb\7\63\2\2\u01fb\u01fc\b&\1\2\u01fcK\3\2\2\2"+
		"\u01fd\u01fe\7\25\2\2\u01fe\u01ff\7\63\2\2\u01ff\u0200\7\16\2\2\u0200"+
		"\u0201\5$\23\2\u0201\u0202\7\17\2\2\u0202\u0203\5\30\r\2\u0203\u0204\7"+
		"\t\2\2\u0204\u0205\7\63\2\2\u0205\u0206\7\4\2\2\u0206\u0207\b\'\1\2\u0207"+
		"\u0208\5,\27\2\u0208\u0209\b\'\1\2\u0209\u020a\5\4\3\2\u020a\u020b\5."+
		"\30\2\u020b\u020c\5\f\7\2\u020c\u020d\7\63\2\2\u020d\u020e\7\n\2\2\u020e"+
		"\u020f\58\35\2\u020f\u0210\7\4\2\2\u0210\u0211\b\'\1\2\u0211\u0212\7\5"+
		"\2\2\u0212\u0213\7\25\2\2\u0213\u0214\7\63\2\2\u0214\u0215\b\'\1\2\u0215"+
		"M\3\2\2\2\u0216\u0217\b(\1\2\u0217\u0218\5R*\2\u0218\u021f\3\2\2\2\u0219"+
		"\u021a\f\4\2\2\u021a\u021b\5P)\2\u021b\u021c\5N(\5\u021c\u021e\3\2\2\2"+
		"\u021d\u0219\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220O\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7&\2\2\u0223\u022b"+
		"\b)\1\2\u0224\u0225\7\'\2\2\u0225\u022b\b)\1\2\u0226\u0227\7(\2\2\u0227"+
		"\u022b\b)\1\2\u0228\u0229\7)\2\2\u0229\u022b\b)\1\2\u022a\u0222\3\2\2"+
		"\2\u022a\u0224\3\2\2\2\u022a\u0226\3\2\2\2\u022a\u0228\3\2\2\2\u022bQ"+
		"\3\2\2\2\u022c\u022d\58\35\2\u022d\u022e\5T+\2\u022e\u022f\58\35\2\u022f"+
		"\u0230\b*\1\2\u0230\u023f\3\2\2\2\u0231\u0232\7\16\2\2\u0232\u0233\5N"+
		"(\2\u0233\u0234\7\17\2\2\u0234\u0235\b*\1\2\u0235\u023f\3\2\2\2\u0236"+
		"\u0237\7*\2\2\u0237\u0238\5R*\2\u0238\u0239\b*\1\2\u0239\u023f\3\2\2\2"+
		"\u023a\u023b\7+\2\2\u023b\u023f\b*\1\2\u023c\u023d\7,\2\2\u023d\u023f"+
		"\b*\1\2\u023e\u022c\3\2\2\2\u023e\u0231\3\2\2\2\u023e\u0236\3\2\2\2\u023e"+
		"\u023a\3\2\2\2\u023e\u023c\3\2\2\2\u023fS\3\2\2\2\u0240\u0241\7-\2\2\u0241"+
		"\u024d\b+\1\2\u0242\u0243\7.\2\2\u0243\u024d\b+\1\2\u0244\u0245\7/\2\2"+
		"\u0245\u024d\b+\1\2\u0246\u0247\7\60\2\2\u0247\u024d\b+\1\2\u0248\u0249"+
		"\7\61\2\2\u0249\u024d\b+\1\2\u024a\u024b\7\62\2\2\u024b\u024d\b+\1\2\u024c"+
		"\u0240\3\2\2\2\u024c\u0242\3\2\2\2\u024c\u0244\3\2\2\2\u024c\u0246\3\2"+
		"\2\2\u024c\u0248\3\2\2\2\u024c\u024a\3\2\2\2\u024dU\3\2\2\2$jrz\u0083"+
		"\u0089\u009d\u00ac\u00b6\u00c4\u00cd\u00d7\u00de\u00ea\u00f1\u0101\u0107"+
		"\u0115\u011d\u013a\u017a\u0180\u018f\u019d\u01a2\u01ae\u01bb\u01ce\u01d6"+
		"\u01e4\u01ed\u021f\u022a\u023e\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}