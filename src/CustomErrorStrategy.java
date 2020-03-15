import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class CustomErrorStrategy extends DefaultErrorStrategy {

    // Recover Methods
    @Override
    public void recover(Parser recognizer, RecognitionException e) throws RuntimeException {
        throw new RuntimeException(e);
    }

    @Override
    public void sync(Parser recognizer) throws RecognitionException { }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new RuntimeException(new InputMismatchException(recognizer));
    }

    // Error Handling Methods
    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) throws RecognitionException {
        String msg = "No se ha podido elegir entre las distintas alternativas";
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "Se encontró: " + this.getTokenErrorDisplay(e.getOffendingToken()) + ", pero se esperaba: " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se encontró: " + tokenName + ", pero se esperaba: " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, null);
        }
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se esperaba encontrar: " + expecting.toString(recognizer.getVocabulary()) + " en " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

}
