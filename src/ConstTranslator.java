public class ConstTranslator {
    private String constValue;

    public ConstTranslator() {
        // TODO code HERE
    }

    public void printConst(String ident) {
        System.out.println("#defines " + ident + " " + this.constValue + ";");
    }

    public String getConstValue() {
        return constValue;
    }

    public void setConstValue(String constValue) {
        System.out.println(constValue);
        this.constValue = constValue;
    }

}
