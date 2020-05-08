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
        }
    }

    @Override
    public String toString() {
        return this.type + " " + this.name + this.length;
    }

}
