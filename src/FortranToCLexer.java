// Generated from FortranToC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FortranToCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "IDENT", 
			"NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENT", "S", "NUM_INT_CONST_B", 
			"NUM_INT_CONST_O", "NUM_INT_CONST_H", "ALPHA", "DIGIT", "PUNCTUATION", 
			"SCAPES", "SIGNS"
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


	    ConstTranslator ct = new ConstTranslator();
	    HeaderTranslator hdt = new HeaderTranslator();
	    ImplementationsTranslator imt = new ImplementationsTranslator();


	public FortranToCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FortranToC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0209\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0172\n"+
		"\62\f\62\16\62\u0175\13\62\3\63\5\63\u0178\n\63\3\63\6\63\u017b\n\63\r"+
		"\63\16\63\u017c\3\64\5\64\u0180\n\64\3\64\6\64\u0183\n\64\r\64\16\64\u0184"+
		"\3\64\3\64\6\64\u0189\n\64\r\64\16\64\u018a\5\64\u018d\n\64\3\64\3\64"+
		"\5\64\u0191\n\64\3\64\5\64\u0194\n\64\3\64\6\64\u0197\n\64\r\64\16\64"+
		"\u0198\3\65\3\65\6\65\u019d\n\65\r\65\16\65\u019e\3\65\6\65\u01a2\n\65"+
		"\r\65\16\65\u01a3\3\65\3\65\3\65\3\65\7\65\u01aa\n\65\f\65\16\65\u01ad"+
		"\13\65\3\65\3\65\3\65\6\65\u01b2\n\65\r\65\16\65\u01b3\3\65\6\65\u01b7"+
		"\n\65\r\65\16\65\u01b8\3\65\3\65\3\65\3\65\7\65\u01bf\n\65\f\65\16\65"+
		"\u01c2\13\65\3\65\5\65\u01c5\n\65\3\65\3\65\3\65\5\65\u01ca\n\65\6\65"+
		"\u01cc\n\65\r\65\16\65\u01cd\3\66\3\66\3\66\3\66\3\66\6\66\u01d5\n\66"+
		"\r\66\16\66\u01d6\3\66\3\66\3\67\6\67\u01dc\n\67\r\67\16\67\u01dd\3\67"+
		"\3\67\38\38\38\38\68\u01e6\n8\r8\168\u01e7\38\38\39\39\39\39\69\u01f0"+
		"\n9\r9\169\u01f1\39\39\3:\3:\3:\3:\6:\u01fa\n:\r:\16:\u01fb\3:\3:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u\2w\2y\2{\2}\2\3\2\13\4\2GGgg\3\2\62"+
		"\63\3\2\629\4\2\62;CH\4\2C\\c|\3\2\62;\5\2..\60\60<=\5\2\13\f\16\17\""+
		"\"\t\2\13\f\16\17..\60\60\62=C\\c|\2\u0228\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\3\177\3\2\2\2\5\u0087\3\2\2\2\7\u0089\3\2\2\2\t\u008d\3\2\2\2"+
		"\13\u0097\3\2\2\2\r\u0099\3\2\2\2\17\u00a3\3\2\2\2\21\u00a6\3\2\2\2\23"+
		"\u00a8\3\2\2\2\25\u00b0\3\2\2\2\27\u00b5\3\2\2\2\31\u00bf\3\2\2\2\33\u00c1"+
		"\3\2\2\2\35\u00c3\3\2\2\2\37\u00ce\3\2\2\2!\u00d5\3\2\2\2#\u00d8\3\2\2"+
		"\2%\u00dc\3\2\2\2\'\u00e2\3\2\2\2)\u00eb\3\2\2\2+\u00ee\3\2\2\2-\u00f3"+
		"\3\2\2\2/\u00f9\3\2\2\2\61\u00fe\3\2\2\2\63\u0101\3\2\2\2\65\u0107\3\2"+
		"\2\2\67\u010d\3\2\2\29\u0114\3\2\2\2;\u0119\3\2\2\2=\u0121\3\2\2\2?\u0123"+
		"\3\2\2\2A\u0125\3\2\2\2C\u0127\3\2\2\2E\u0129\3\2\2\2G\u012b\3\2\2\2I"+
		"\u0130\3\2\2\2K\u0135\3\2\2\2M\u013b\3\2\2\2O\u0141\3\2\2\2Q\u0148\3\2"+
		"\2\2S\u014e\3\2\2\2U\u0155\3\2\2\2W\u015d\3\2\2\2Y\u015f\3\2\2\2[\u0161"+
		"\3\2\2\2]\u0164\3\2\2\2_\u0167\3\2\2\2a\u016a\3\2\2\2c\u016d\3\2\2\2e"+
		"\u0177\3\2\2\2g\u017f\3\2\2\2i\u01cb\3\2\2\2k\u01cf\3\2\2\2m\u01db\3\2"+
		"\2\2o\u01e1\3\2\2\2q\u01eb\3\2\2\2s\u01f5\3\2\2\2u\u01ff\3\2\2\2w\u0201"+
		"\3\2\2\2y\u0203\3\2\2\2{\u0205\3\2\2\2}\u0207\3\2\2\2\177\u0080\7R\2\2"+
		"\u0080\u0081\7T\2\2\u0081\u0082\7Q\2\2\u0082\u0083\7I\2\2\u0083\u0084"+
		"\7T\2\2\u0084\u0085\7C\2\2\u0085\u0086\7O\2\2\u0086\4\3\2\2\2\u0087\u0088"+
		"\7=\2\2\u0088\6\3\2\2\2\u0089\u008a\7G\2\2\u008a\u008b\7P\2\2\u008b\u008c"+
		"\7F\2\2\u008c\b\3\2\2\2\u008d\u008e\7K\2\2\u008e\u008f\7P\2\2\u008f\u0090"+
		"\7V\2\2\u0090\u0091\7G\2\2\u0091\u0092\7T\2\2\u0092\u0093\7H\2\2\u0093"+
		"\u0094\7C\2\2\u0094\u0095\7E\2\2\u0095\u0096\7G\2\2\u0096\n\3\2\2\2\u0097"+
		"\u0098\7.\2\2\u0098\f\3\2\2\2\u0099\u009a\7R\2\2\u009a\u009b\7C\2\2\u009b"+
		"\u009c\7T\2\2\u009c\u009d\7C\2\2\u009d\u009e\7O\2\2\u009e\u009f\7G\2\2"+
		"\u009f\u00a0\7V\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7T\2\2\u00a2\16\3\2"+
		"\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a5\7<\2\2\u00a5\20\3\2\2\2\u00a6\u00a7"+
		"\7?\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7P\2\2\u00aa\u00ab"+
		"\7V\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7I\2\2\u00ad\u00ae\7G\2\2\u00ae"+
		"\u00af\7T\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7T\2\2\u00b1\u00b2\7G\2\2\u00b2"+
		"\u00b3\7C\2\2\u00b3\u00b4\7N\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7E\2\2\u00b6"+
		"\u00b7\7J\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7C\2\2"+
		"\u00ba\u00bb\7E\2\2\u00bb\u00bc\7V\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be"+
		"\7T\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0\32\3\2\2\2\u00c1\u00c2"+
		"\7+\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7W\2\2\u00c5\u00c6"+
		"\7D\2\2\u00c6\u00c7\7T\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7W\2\2\u00c9"+
		"\u00ca\7V\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7G\2\2"+
		"\u00cd\36\3\2\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1\7"+
		"V\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3\7P\2\2\u00d3\u00d4\7V\2\2\u00d4 "+
		"\3\2\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7P\2\2\u00d7\"\3\2\2\2\u00d8\u00d9"+
		"\7Q\2\2\u00d9\u00da\7W\2\2\u00da\u00db\7V\2\2\u00db$\3\2\2\2\u00dc\u00dd"+
		"\7K\2\2\u00dd\u00de\7P\2\2\u00de\u00df\7Q\2\2\u00df\u00e0\7W\2\2\u00e0"+
		"\u00e1\7V\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7H\2\2\u00e3\u00e4\7W\2\2\u00e4"+
		"\u00e5\7P\2\2\u00e5\u00e6\7E\2\2\u00e6\u00e7\7V\2\2\u00e7\u00e8\7K\2\2"+
		"\u00e8\u00e9\7Q\2\2\u00e9\u00ea\7P\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7K\2"+
		"\2\u00ec\u00ed\7H\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f0\7"+
		"J\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7P\2\2\u00f2,\3\2\2\2\u00f3\u00f4"+
		"\7G\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\7K\2\2\u00f7"+
		"\u00f8\7H\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7N\2\2\u00fb"+
		"\u00fc\7U\2\2\u00fc\u00fd\7G\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7F\2\2\u00ff"+
		"\u0100\7Q\2\2\u0100\62\3\2\2\2\u0101\u0102\7Y\2\2\u0102\u0103\7J\2\2\u0103"+
		"\u0104\7K\2\2\u0104\u0105\7N\2\2\u0105\u0106\7G\2\2\u0106\64\3\2\2\2\u0107"+
		"\u0108\7G\2\2\u0108\u0109\7P\2\2\u0109\u010a\7F\2\2\u010a\u010b\7F\2\2"+
		"\u010b\u010c\7Q\2\2\u010c\66\3\2\2\2\u010d\u010e\7U\2\2\u010e\u010f\7"+
		"G\2\2\u010f\u0110\7N\2\2\u0110\u0111\7G\2\2\u0111\u0112\7E\2\2\u0112\u0113"+
		"\7V\2\2\u01138\3\2\2\2\u0114\u0115\7E\2\2\u0115\u0116\7C\2\2\u0116\u0117"+
		"\7U\2\2\u0117\u0118\7G\2\2\u0118:\3\2\2\2\u0119\u011a\7F\2\2\u011a\u011b"+
		"\7G\2\2\u011b\u011c\7H\2\2\u011c\u011d\7C\2\2\u011d\u011e\7W\2\2\u011e"+
		"\u011f\7N\2\2\u011f\u0120\7V\2\2\u0120<\3\2\2\2\u0121\u0122\7<\2\2\u0122"+
		">\3\2\2\2\u0123\u0124\7-\2\2\u0124@\3\2\2\2\u0125\u0126\7/\2\2\u0126B"+
		"\3\2\2\2\u0127\u0128\7,\2\2\u0128D\3\2\2\2\u0129\u012a\7\61\2\2\u012a"+
		"F\3\2\2\2\u012b\u012c\7E\2\2\u012c\u012d\7C\2\2\u012d\u012e\7N\2\2\u012e"+
		"\u012f\7N\2\2\u012fH\3\2\2\2\u0130\u0131\7\60\2\2\u0131\u0132\7Q\2\2\u0132"+
		"\u0133\7T\2\2\u0133\u0134\7\60\2\2\u0134J\3\2\2\2\u0135\u0136\7\60\2\2"+
		"\u0136\u0137\7C\2\2\u0137\u0138\7P\2\2\u0138\u0139\7F\2\2\u0139\u013a"+
		"\7\60\2\2\u013aL\3\2\2\2\u013b\u013c\7\60\2\2\u013c\u013d\7G\2\2\u013d"+
		"\u013e\7S\2\2\u013e\u013f\7X\2\2\u013f\u0140\7\60\2\2\u0140N\3\2\2\2\u0141"+
		"\u0142\7\60\2\2\u0142\u0143\7P\2\2\u0143\u0144\7G\2\2\u0144\u0145\7S\2"+
		"\2\u0145\u0146\7X\2\2\u0146\u0147\7\60\2\2\u0147P\3\2\2\2\u0148\u0149"+
		"\7\60\2\2\u0149\u014a\7P\2\2\u014a\u014b\7Q\2\2\u014b\u014c\7V\2\2\u014c"+
		"\u014d\7\60\2\2\u014dR\3\2\2\2\u014e\u014f\7\60\2\2\u014f\u0150\7V\2\2"+
		"\u0150\u0151\7T\2\2\u0151\u0152\7W\2\2\u0152\u0153\7G\2\2\u0153\u0154"+
		"\7\60\2\2\u0154T\3\2\2\2\u0155\u0156\7\60\2\2\u0156\u0157\7H\2\2\u0157"+
		"\u0158\7C\2\2\u0158\u0159\7N\2\2\u0159\u015a\7U\2\2\u015a\u015b\7G\2\2"+
		"\u015b\u015c\7\60\2\2\u015cV\3\2\2\2\u015d\u015e\7>\2\2\u015eX\3\2\2\2"+
		"\u015f\u0160\7@\2\2\u0160Z\3\2\2\2\u0161\u0162\7>\2\2\u0162\u0163\7?\2"+
		"\2\u0163\\\3\2\2\2\u0164\u0165\7@\2\2\u0165\u0166\7?\2\2\u0166^\3\2\2"+
		"\2\u0167\u0168\7?\2\2\u0168\u0169\7?\2\2\u0169`\3\2\2\2\u016a\u016b\7"+
		"\61\2\2\u016b\u016c\7?\2\2\u016cb\3\2\2\2\u016d\u0173\5u;\2\u016e\u0172"+
		"\5u;\2\u016f\u0172\7a\2\2\u0170\u0172\5w<\2\u0171\u016e\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174d\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178"+
		"\7/\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u017b\5w<\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017df\3\2\2\2\u017e\u0180\7/\2\2\u017f\u017e\3"+
		"\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5w<\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0193\3\2\2\2\u0186\u0188\7\60\2\2\u0187\u0189\5w<\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\t\2\2\2\u018f\u0191\7/\2\2\u0190\u018f\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0194\7\60\2\2\u0193"+
		"\u018c\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197\5w"+
		"<\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199h\3\2\2\2\u019a\u01ab\7)\2\2\u019b\u019d\5u;\2\u019c"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01aa\3\2\2\2\u01a0\u01a2\5w<\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01aa\3\2\2\2\u01a5"+
		"\u01aa\7\"\2\2\u01a6\u01a7\7)\2\2\u01a7\u01aa\7)\2\2\u01a8\u01aa\7$\2"+
		"\2\u01a9\u019c\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6"+
		"\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01c5\7)"+
		"\2\2\u01af\u01c0\7$\2\2\u01b0\u01b2\5u;\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01bf\3\2\2\2\u01b5"+
		"\u01b7\5w<\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\u01bf\3\2\2\2\u01ba\u01bf\7\"\2\2\u01bb\u01bc"+
		"\7$\2\2\u01bc\u01bf\7$\2\2\u01bd\u01bf\7)\2\2\u01be\u01b1\3\2\2\2\u01be"+
		"\u01b6\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bd\3\2"+
		"\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\7$\2\2\u01c4\u019a\3\2"+
		"\2\2\u01c4\u01af\3\2\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c7\7\"\2\2\u01c7"+
		"\u01c8\7-\2\2\u01c8\u01ca\7\"\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cej\3\2\2\2\u01cf\u01d4\7#\2\2\u01d0"+
		"\u01d5\5u;\2\u01d1\u01d5\5w<\2\u01d2\u01d5\5y=\2\u01d3\u01d5\5}?\2\u01d4"+
		"\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\b\66\2\2\u01d9l\3\2\2\2\u01da\u01dc\5{>\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\b\67\2\2\u01e0n\3\2\2\2\u01e1\u01e2"+
		"\7d\2\2\u01e2\u01e3\7)\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\t\3\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7)\2\2\u01eap\3\2\2\2\u01eb\u01ec"+
		"\7q\2\2\u01ec\u01ed\7)\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01f0\t\4\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7)\2\2\u01f4r\3\2\2\2\u01f5\u01f6"+
		"\7|\2\2\u01f6\u01f7\7)\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\t\5\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7)\2\2\u01fet\3\2\2\2\u01ff\u0200"+
		"\t\6\2\2\u0200v\3\2\2\2\u0201\u0202\t\7\2\2\u0202x\3\2\2\2\u0203\u0204"+
		"\t\b\2\2\u0204z\3\2\2\2\u0205\u0206\t\t\2\2\u0206|\3\2\2\2\u0207\u0208"+
		"\n\n\2\2\u0208~\3\2\2\2\37\2\u0171\u0173\u0177\u017c\u017f\u0184\u018a"+
		"\u018c\u0190\u0193\u0198\u019e\u01a3\u01a9\u01ab\u01b3\u01b8\u01be\u01c0"+
		"\u01c4\u01c9\u01cd\u01d4\u01d6\u01dd\u01e7\u01f1\u01fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}