import java.util.ArrayList;
import java.util.List;

public class Header {
    private String returnType;
    private String name;
    private List<Variable> parameters;

    public Header(String type, String name) {
        this.returnType = type;
        this.name = name;
        this.parameters = new ArrayList<>();
    }

    public List<Variable> getParameters() {
        return this.parameters;
    }

    public void setParameters(ArrayList<Variable> params) {
        this.parameters = params;
    }

    public void printHeader() {
        String header = this.returnType + " " + this.name + " ( ";
        if (this.parameters.isEmpty())
            header += "void );";
        else {
            for (int i = 0; i < this.parameters.size(); ++i) {
                if (i != this.parameters.size() - 1)
                    header += this.parameters.get(i).toString() + " , ";
                else
                    header += this.parameters.get(i).toString() + " );";
            }
        }
        System.out.println(header);
    }

}
