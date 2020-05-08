import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImplementationsTranslator {
    private List<String> implementations;
    private List<String> idents;
    private List<String> types;
    private List<String> factors;
    private String function;

    public ImplementationsTranslator() {
        this.implementations = new ArrayList<>();
        this.idents = new ArrayList<>();
        this.types = new ArrayList<>();
        this.factors = new ArrayList<>();
    }

    public List<String> getIdents() {
        return idents;
    }

    public List<String> getTypes() {
        return types;
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

    private String parameters() {
        if (!this.types.isEmpty() && !this.idents.isEmpty()) {
            Collections.reverse(this.idents);
            String params = "( ";
            int size = this.idents.size();

            for (int i = 0; i < size; ++i) {
                String type = this.types.get(i);
                String ident = this.idents.get(i);

                if (type.contains("[")) {
                    int bracket = type.indexOf("[");
                    if (i != size - 1)
                        params += type.substring(0, bracket) + " " + ident + "[]" + ", ";
                    else
                        params += type.substring(0, bracket) + " " + ident + "[]" + " );";
                } else {
                    if (i != size - 1)
                        params += type + " " + ident + ", ";
                    else
                        params += type + " " + ident + " );";
                }
            }
            return params;
        }
        return "( void );";
    }

    private String returnType() {
        return this.types.remove(0);
    }

    public void saveProcHeadImplementation(String name) {
        this.function = "void" + " " + name + " " + parameters().substring(0, parameters().length() - 1) + " {\n";
        System.out.println(function); // Debug
        this.idents.clear();
        this.types.clear();
    }

    public void saveFuncHeadImplementation(String name) {
        this.function = returnType() + " " + name + " " + parameters().substring(0, parameters().length() - 1) + " {\n";
        System.out.println(function); // Debug
        this.idents.clear();
        this.types.clear();
    }

    public void saveSubprogram(String name) {
        this.function += "\t" + name + "(" + factors() + ");" + " \n";
        System.out.println("\t" + name + "(" + factors() + ");" + " \n"); // Debug
        this.factors.clear();
    }

    public void saveFuncImplementation(boolean isFunction, String name) {
        if (isFunction) {
            this.function += "\t" + "return" + " " + name + "\n}\n";
            System.out.println("\t" + "return" + " " + name + "\n}\n"); // Debug
        }
        else {
            this.function += "}\n";
            System.out.println("}\n"); // Debug
        }
        this.implementations.add(function);
    }

}
