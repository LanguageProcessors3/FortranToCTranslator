import java.util.ArrayList;

public class ProgramOrchestrator {

    public static void printFullProgram(ArrayList<Constant> constants, ArrayList<Header> headers, ArrayList<String> statements) {
        // This is a function that with given constant, headers and statements arrays, iterates through them
        // and prints them using their proper class printing methods
        for (Constant c : constants)
            c.printConst();

        System.out.println();

        for (Header h : headers)
            h.printHeader();

        System.out.println();

        System.out.println("void main(void) {");

        printStatements(statements); // Auxiliary function to control tabulations and checking the statements structure
    }

    private static void printStatements(ArrayList<String> statements) {

        boolean __case__ = false; // Boolean variable that controls whereas we are tabulating a switch case or not
        String tabs = "\t"; // Tabs are initialized to 1 in the beginning
        String savedType = "";

        for (String s: statements) {
            if (!s.contains("(") && s.startsWith("int")) {
                if (savedType.startsWith("int")) savedType += s.substring(4, s.length() - 1) + ", ";
                else if (savedType.isEmpty()) savedType = "int " + s.substring(4, s.length() - 1) + ", ";
                else {
                    savedType = savedType.substring(0, savedType.length() - 2);
                    savedType += ";";
                    System.out.println(tabs + savedType);

                    savedType = "int " + s.substring(4, s.length() - 1) + ", ";
                }
            }
            else if (!s.contains("(") && s.startsWith("float")) {
                if (savedType.startsWith("float")) savedType += s.substring(6, s.length() - 1) + ", ";
                else if (savedType.isEmpty()) savedType = "float " + s.substring(6, s.length() - 1) + ", ";
                else {
                    savedType = savedType.substring(0, savedType.length() - 2);
                    savedType += ";";
                    System.out.println(tabs + savedType);

                    savedType = "float " + s.substring(6, s.length() - 1) + ", ";
                }
            }
            else if (!s.contains("(") && s.startsWith("char")) {
                if (savedType.startsWith("char")) savedType += s.substring(5, s.length() - 1) + ", ";
                else if (savedType.isEmpty()) savedType = "char " + s.substring(5, s.length() - 1) + ", ";
                else {
                    savedType = savedType.substring(0, savedType.length() - 2);
                    savedType += ";";
                    System.out.println(tabs + savedType);

                    savedType = "char " + s.substring(5, s.length() - 1) + ", ";
                }
            }
            else if (!savedType.isEmpty()) {
                savedType = savedType.substring(0, savedType.length() - 2);
                savedType += ";";
                System.out.println(tabs + savedType);

                savedType = "";
            }
            else if (s.startsWith("}") && s.endsWith("{")) {
                tabs = tabs.substring(0, tabs.length() - 1); // Last tabulation is removed from the global carry
                System.out.println(tabs + s);
                tabs += "\t";
            }
            else if (s.endsWith("{")) {
                System.out.println(tabs + s);
                tabs += "\t";
            }
            else if (s.startsWith("}")) {
                if (__case__) {
                    __case__ = false; // If the checking is in a switch case, close it and remove a tabulation carry
                    tabs = tabs.substring(0, tabs.length() - 1);
                }
                tabs = tabs.substring(0, tabs.length() - 1); // Last tabulation is removed from the global carry
                System.out.println(tabs + s);
            }
            else if (s.startsWith("default") || s.startsWith("case")) {
                s = s.replace("'","\"");
                if (!__case__) {
                    __case__ = true;
                    System.out.println(tabs + s);
                    tabs += "\t";
                } else { // If there are more than one consecutive cases, just prints them without the tabulation
                    tabs = tabs.substring(0, tabs.length() - 1);
                    System.out.println(tabs + s);
                    tabs += "\t";
                }
            }
            else if (s.startsWith("break")) {
                System.out.println(tabs + s);
                tabs = tabs.substring(0, tabs.length() - 1);
                __case__ = false;
            }
            else if (s.contains("'") || s.contains("\"")) { // Condition to check if the statement contains a string
                char checkString = s.charAt(s.indexOf("=") + 2);
                boolean checkCase = s.contains("case");

                if ((checkString != '"') && (checkString != '\'') && (!checkCase) && !s.contains("(")) {
                    String lvalue = s.substring(0, s.indexOf("=") + 2);
                    String rvalue = s.substring(s.indexOf("=") + 2);
                    rvalue = rvalue.replace("'", "");
                    rvalue = rvalue.replace("b", "0b");
                    rvalue = rvalue.replace("o", "0o");
                    rvalue = rvalue.replace("z","0x");
                    System.out.println(tabs + lvalue + rvalue);
                } else if (!checkCase) {
                    boolean openString = false;
                    boolean nextDelete = false;
                    String sfinal = "";
                    String charToadd;
                    char opening = ' ';

                    for (int i = 0; i < s.length(); ++i) {
                        if (!nextDelete) {
                            char c = s.charAt(i);
                            charToadd = Character.toString(c);

                            if (!openString) {
                                if (c == '"' || c == '\'') {
                                    openString = true;
                                    if (c == '"') opening = '"';
                                    else opening = '\'';
                                    charToadd = "\"";
                                }
                            } else {
                                if (c == opening) {
                                    openString = false;
                                    if (c == s.charAt(i + 1)) {
                                        if (c == '"') charToadd = "\\\"";
                                        else charToadd = "'";
                                        openString = true;
                                        nextDelete = true;
                                    }
                                    else if (c == '\'') charToadd = "\"";
                                }
                                else if (c == '"') charToadd = "\\\"";
                            }
                            sfinal += charToadd;
                        }
                        else nextDelete = false;
                    }
                    System.out.println(tabs + sfinal);
                }
            }
            else System.out.println(tabs + s);
        }
    }
}
