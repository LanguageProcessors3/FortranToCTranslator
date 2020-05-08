import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeaderTranslator {
    private List<String> functions;
    private List<String> idents;
    private List<String> types;

    public HeaderTranslator() {
        this.functions = new ArrayList<>();
        this.idents = new ArrayList<>();
        this.types = new ArrayList<>();
    }

    public List<String> getFunctions() {
        return functions;
    }

    public List<String> getIdents() {
        return idents;
    }

    public List<String> getTypes() {
        return types;
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

    public void saveProcHeader(String name) {
        String fun = "void " + name + " " + parameters();
        System.out.println(fun);
        this.functions.add(fun);
        this.idents.clear();
        this.types.clear();
    }

    public void saveFuncHeader(String name) {
        String fun = returnType() + " " + name + " " + parameters();
        System.out.println(fun);
        this.functions.add(fun);
        this.idents.clear();
        this.types.clear();
    }

}
