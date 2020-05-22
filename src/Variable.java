import java.util.ArrayList;

public class Variable {
    private String type;
    private String name;
    private String length;

    public Variable(String type, String name, String length) {
        this.name = name;
        this.type = type;
        if (!length.isEmpty()) {
            this.length = length;
            this.name += "[]";
        } else this.length = "";
    }

    @Override
    public String toString() {
        return this.type + " " + this.name + this.length;
    }

    public String parameterFormat() {
        return this.type + " " + this.name;
    }

    public static String formParameters(ArrayList<Variable> v) {
        String s = "";

        for (int i = 0; i < v.size(); ++i) {
            if (i != v.size() - 1) {
                s += v.get(i).parameterFormat();
                s = s.replace('*','&');
                s += ", ";
            }
            else {
                s += v.get(i).parameterFormat();
                s = s.replace('*','&');
            }
        }

        if (s.isEmpty()) s = "void";

        return s;
    }

}
