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

}
