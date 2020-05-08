import java.util.ArrayList;
import java.util.List;

public class SentTranslator {
    private List<String> factors;
    private List<String> operations;

    public SentTranslator() {
        this.factors = new ArrayList<>();
        this.operations = new ArrayList<>();
    }

    public List<String> getFactors() { return factors; }

    private String factors() {
        String parameters = "";
        for (int i = 0; i < factors.size(); ++i) {
            if (i != factors.size() - 1)
                parameters += factors.get(i) + " , ";
            else
                parameters += factors.get(i);
        }
        return parameters;
    }

    public void saveCall(String name) {
        String call = "\t" + name + "(" + factors() + ");" ;
        System.out.println(call); // Debug
        this.operations.add(call);
        this.factors.clear();
    }
}
