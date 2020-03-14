import org.antlr.v4.runtime.*;

public class CustomErrorStrategy extends DefaultErrorStrategy {

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

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) throws RecognitionException {
        String msg = "No se ha podido elegir entre las distintas alternativas";
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

}
