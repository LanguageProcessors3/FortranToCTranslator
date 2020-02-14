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
		IDENT=1, NUM_INT_CONST=2, NUM_REAL_CONST=3, STRING_CONST=4, COMMENT=5, 
		S=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENT", 
			"S", "ALPHA", "DIGIT", "PUNCTUATION", "SCAPES", "SIGNS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENT", 
			"S"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1));
			System.out.println(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\5\3$\n\3\3\3"+
		"\6\3\'\n\3\r\3\16\3(\3\4\5\4,\n\4\3\4\6\4/\n\4\r\4\16\4\60\3\4\3\4\6\4"+
		"\65\n\4\r\4\16\4\66\5\49\n\4\3\4\3\4\5\4=\n\4\3\4\5\4@\n\4\3\4\6\4C\n"+
		"\4\r\4\16\4D\3\5\3\5\3\5\3\5\3\5\6\5L\n\5\r\5\16\5M\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\6\5W\n\5\r\5\16\5X\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\6\6h\n\6\r\6\16\6i\3\6\3\6\3\7\6\7o\n\7\r\7\16\7p\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\2\23\2\25\2\27\2\3\2\b\4\2GGgg\4\2C\\c|\3\2\62;\5\2..\60"+
		"\60<=\5\2\13\f\16\17\"\"\t\2\13\f\16\17..\60\60\62=C\\c|\2\u0093\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3"+
		"\31\3\2\2\2\5#\3\2\2\2\7+\3\2\2\2\t\\\3\2\2\2\13b\3\2\2\2\rn\3\2\2\2\17"+
		"t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31\37\5\17\b"+
		"\2\32\36\5\17\b\2\33\36\7a\2\2\34\36\5\21\t\2\35\32\3\2\2\2\35\33\3\2"+
		"\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \4\3\2\2\2!\37"+
		"\3\2\2\2\"$\7/\2\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'\5\21\t\2&%\3\2\2"+
		"\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\6\3\2\2\2*,\7/\2\2+*\3\2\2\2+,\3\2"+
		"\2\2,.\3\2\2\2-/\5\21\t\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61?\3\2\2\2\62\64\7\60\2\2\63\65\5\21\t\2\64\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\62\3\2\2\289\3\2\2\29:\3"+
		"\2\2\2:<\t\2\2\2;=\7/\2\2<;\3\2\2\2<=\3\2\2\2=@\3\2\2\2>@\7\60\2\2?8\3"+
		"\2\2\2?>\3\2\2\2@B\3\2\2\2AC\5\21\t\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE"+
		"\3\2\2\2E\b\3\2\2\2FK\7$\2\2GL\5\17\b\2HL\5\21\t\2IL\5\23\n\2JL\5\27\f"+
		"\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NO\3\2\2\2OP\7$\2\2P]\3\2\2\2QV\7)\2\2RW\5\17\b\2SW\5\21\t\2TW\5\23"+
		"\n\2UW\5\27\f\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7)\2\2[]\3\2\2\2\\F\3\2\2\2\\Q\3\2\2\2]^"+
		"\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\5\2\2a\n\3\2\2\2bg\7#\2\2"+
		"ch\5\17\b\2dh\5\21\t\2eh\5\23\n\2fh\5\27\f\2gc\3\2\2\2gd\3\2\2\2ge\3\2"+
		"\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\6\3\2l\f\3"+
		"\2\2\2mo\5\25\13\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2r"+
		"s\b\7\3\2s\16\3\2\2\2tu\t\3\2\2u\20\3\2\2\2vw\t\4\2\2w\22\3\2\2\2xy\t"+
		"\5\2\2y\24\3\2\2\2z{\t\6\2\2{\26\3\2\2\2|}\n\7\2\2}\30\3\2\2\2\27\2\35"+
		"\37#(+\60\668<?DKMVX\\^gip\4\3\5\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}