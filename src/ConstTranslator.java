import java.util.ArrayList;
import java.util.List;

public class ConstTranslator {
    private List<String> constants;

    public ConstTranslator() {
        this.constants = new ArrayList<>();
    }

    public void saveConst(String ident, String value) {
        String constant = "#defines " + ident + " " + value + ";";
        System.out.println(constant);
        this.constants.add(constant);
    }

}
