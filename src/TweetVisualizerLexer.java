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
public class TweetVisualizerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HASHTAG=1, USERNAME=2, LINK=3, TWEETWORD=4, S=5, P=6, END=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HASHTAG", "USERNAME", "LINK", "TWEETWORD", "S", "P", "END", "ALPHA", 
			"DIGIT", "PUNCTUATION", "SCAPES", "SIGNS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'#FIN@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HASHTAG", "USERNAME", "LINK", "TWEETWORD", "S", "P", "END"
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


	    int wordCounter = 0;

	    String fullHTMLTweet;
	    String tweet = "";
	    String tweetWords = "";
	    boolean limitExceed = false;

	    String headerHTML = new String("<!DOCTYPE html>\n" +
	    "<html>\n" +
	    "<head>\n" +
	    "<title>Twitter format</title>\n" +
	    "<style>\n" +
	    ".usr {color:rgb(19,189,72);}\n" +
	    ".link {color:rgb(55,40,244);}\n" +
	    ".hashtag {color:rgb(107,103,189);}\n" +
	    ".auth-title {color:rgb(0,0,0);font-weight:bold;}\n" +
	    ".auth-usr {color:rgb(147,145,147);}\n" +
	    ".sobrante {color:rgb(255,0,0);}\n" +
	    "</style>\n" +
	    "</head>\n" +
	    "<body>\n" +
	    "<p>");

	    String footerHTML = new String("</p></body></html>");
	    String surplusSpanClose = new String("</span>");

	    public void manageSurplus () {
	        if (wordCounter >= 140) {
	            limitExceed = true;
	            String spanOpening = new String("<span class=\"sobrante\">");
	            surplusSpanClose += footerHTML;
	            footerHTML = surplusSpanClose;
	            String surplus = tweetWords.substring(140);
	            int last = tweet.lastIndexOf(surplus);
	            String aux = tweet.substring(0,last);
	            aux += (spanOpening + surplus);
	            tweet = aux;
	        }
	    }


	public TweetVisualizerLexer(CharStream input) {
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
		case 0:
			HASHTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			USERNAME_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			LINK_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TWEETWORD_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			S_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			P_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void HASHTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			                                    if (!limitExceed) {
			                                        tweetWords += getText();
			                                        tweet += ("<span class=\"hashtag\">" + getText() + "</span>");
			                                        wordCounter += getText().length();
			                                        manageSurplus();
			                                    }
			                                    else tweet += getText();
			                               
			break;
		}
	}
	private void USERNAME_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			                                            if (!limitExceed) {
			                                                tweetWords += getText();
			                                                tweet += ("<span class=\"usr\">" + getText() + "</span>");
			                                                wordCounter += getText().length();
			                                                manageSurplus();
			                                            }
			                                            else tweet += getText();
			                                        
			break;
		}
	}
	private void LINK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			                                                                    if (!limitExceed) {
			                                                                        tweetWords += getText();
			                                                                        tweet += ("<span class=\"link\">" + getText() + "</span>");
			                                                                        wordCounter += getText().length();
			                                                                        manageSurplus();
			                                                                    }
			                                                                    else tweet += getText();
			                                                                
			break;
		}
	}
	private void TWEETWORD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			                                          if (!limitExceed) {
			                                              tweetWords += getText();
			                                              tweet += getText();
			                                              wordCounter += getText().length();
			                                              manageSurplus();
			                                          }
			                                          else tweet += getText();
			                                      
			break;
		}
	}
	private void S_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			                if (!limitExceed) {
			                    tweetWords += getText();
			                    tweet += getText();
			                    wordCounter += getText().length();
			                    manageSurplus();
			                }
			                else tweet += getText();
			             
			break;
		}
	}
	private void P_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			                        if (!limitExceed) {
			                            tweetWords += getText();
			                            tweet += getText();
			                            wordCounter += getText().length();
			                            manageSurplus();
			                        }
			                        else tweet += getText();
			                  
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			                    headerHTML += tweet;
			                    fullHTMLTweet = headerHTML + footerHTML;
			                    System.out.println(fullHTMLTweet);
			                
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3\3\3\3\3"+
		"\3\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3\4\5\4E\n\4\3\4\6\4"+
		"H\n\4\r\4\16\4I\3\4\3\4\6\4N\n\4\r\4\16\4O\3\4\3\4\3\5\3\5\3\5\6\5W\n"+
		"\5\r\5\16\5X\3\5\3\5\3\6\6\6^\n\6\r\6\16\6_\3\6\3\6\3\7\6\7e\n\7\r\7\16"+
		"\7f\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27"+
		"\2\31\2\3\2\7\4\2C\\c|\3\2\62;\5\2..\60\60<=\5\2\13\f\16\17\"\"\13\2\13"+
		"\f\17\17\"\"%%..\60\60\62=B\\c|\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\33\3\2\2\2"+
		"\5$\3\2\2\2\7=\3\2\2\2\tV\3\2\2\2\13]\3\2\2\2\rd\3\2\2\2\17j\3\2\2\2\21"+
		"r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33\36\7%\2\2"+
		"\34\37\5\21\t\2\35\37\5\23\n\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2"+
		" \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\b\2\2\2#\4\3\2\2\2$(\7B\2\2%)\5\21"+
		"\t\2&)\5\23\n\2\')\5\31\r\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*"+
		"(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\b\3\3\2-\6\3\2\2\2./\7j\2\2/\60\7v\2\2"+
		"\60\61\7v\2\2\61\62\7r\2\2\62\63\7<\2\2\63\64\7\61\2\2\64>\7\61\2\2\65"+
		"\66\7j\2\2\66\67\7v\2\2\678\7v\2\289\7r\2\29:\7u\2\2:;\7<\2\2;<\7\61\2"+
		"\2<>\7\61\2\2=.\3\2\2\2=\65\3\2\2\2>D\3\2\2\2?@\7y\2\2@A\7y\2\2AB\7y\2"+
		"\2BE\7\60\2\2CE\5\21\t\2D?\3\2\2\2DC\3\2\2\2EG\3\2\2\2FH\5\21\t\2GF\3"+
		"\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7\60\2\2LN\5\21\t\2M"+
		"L\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\4\4\2R\b\3\2\2\2"+
		"SW\5\21\t\2TW\5\31\r\2UW\5\23\n\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WX\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\5\5\2[\n\3\2\2\2\\^\5\27\f\2]\\"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\6\6\2b\f\3\2\2\2"+
		"ce\5\25\13\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\7\7"+
		"\2i\16\3\2\2\2jk\7%\2\2kl\7H\2\2lm\7K\2\2mn\7P\2\2no\7B\2\2op\3\2\2\2"+
		"pq\b\b\b\2q\20\3\2\2\2rs\t\2\2\2s\22\3\2\2\2tu\t\3\2\2u\24\3\2\2\2vw\t"+
		"\4\2\2w\26\3\2\2\2xy\t\5\2\2y\30\3\2\2\2z{\n\6\2\2{\32\3\2\2\2\17\2\36"+
		" (*=DIOVX_f\t\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}