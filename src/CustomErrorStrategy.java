import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNState;
import org.antlr.v4.runtime.misc.IntervalSet;

public class CustomErrorStrategy extends DefaultErrorStrategy {

    // Recover Methods
    @Override
    public void recover(Parser recognizer, RecognitionException except) {
        throw except;
    }

    // Redefinition of the sync and recover in line methods at Default Error Strategy for recovering from detected errors
    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        Token matchedToken = this.singleTokenDeletion(recognizer);
        if (matchedToken != null) {
            recognizer.consume();
            return matchedToken;
        } else if (this.singleTokenInsertion(recognizer))
            return this.getMissingSymbol(recognizer);
        else {
            InputMismatchException except;
            if (this.nextTokensContext == null)
                except = new InputMismatchException(recognizer);
            else
                except = new InputMismatchException(recognizer, this.nextTokensState, this.nextTokensContext);
            throw except;
        }
    }

    @Override
    public void sync(Parser recognizer) throws RecognitionException {
        ATNState state = recognizer.getInterpreter().atn.states.get(recognizer.getState());

        if (!this.inErrorRecoveryMode(recognizer)) {
            TokenStream tokens = recognizer.getInputStream();
            int la1 = tokens.LA(1);
            IntervalSet nextTokens = recognizer.getATN().nextTokens(state);
            if (nextTokens.contains(la1)) {
                this.nextTokensContext = null;
                this.nextTokensState = -1;
            } else if (nextTokens.contains(-2)) {
                if (this.nextTokensContext == null) {
                    this.nextTokensContext = recognizer.getContext();
                    this.nextTokensState = recognizer.getState();
                }
            } else {
                if (state.getStateType() == 10) {
                    if (this.singleTokenDeletion(recognizer) != null) return;
                    throw new InputMismatchException(recognizer);
                } else if (state.getStateType() == 11) {
                    this.reportUnwantedToken(recognizer);
                    IntervalSet expected = recognizer.getExpectedTokens();
                    IntervalSet stateInfo = expected.or(this.getErrorRecoverySet(recognizer));
                    this.consumeUntil(recognizer, stateInfo);
                }
            }
        }
    }


    // Error Notification Handling Methods
    @Override
    public void reportNoViableAlternative(Parser recognizer, NoViableAltException e) throws RecognitionException {
        String msg = "No se ha podido elegir entre las distintas alternativas";
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "Se encontró: " + this.getTokenErrorDisplay(e.getOffendingToken()) + ", pero se esperaba: " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se esperaba encontrar: " + expecting.toString(recognizer.getVocabulary()) + " pero se encontró: " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, null);
        }
    }

    @Override
    public void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se encontró: " + tokenName + ", pero se esperaba: " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, null);
        }
    }
}
