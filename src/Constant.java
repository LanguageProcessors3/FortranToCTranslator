public class Constant {
    private String name;
    private String value;

    public Constant(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void printConst() {
        System.out.println("#define " + this.name + " " + this.value);
    }

}
