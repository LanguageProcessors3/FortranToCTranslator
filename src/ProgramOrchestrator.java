import java.util.ArrayList;
import java.util.IllegalFormatException;

public class ProgramOrchestrator {
    public static ArrayList<String> paramChecker = new ArrayList<>();

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
        boolean groupedParams = false;
        String tabs = "\t"; // Tabs are initialized to 1 in the beginning
        String savedType = "";

        for (String s: statements) {
            if (!s.contains("(") && s.startsWith("int")) {
                groupedParams = true;
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
                groupedParams = true;
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
                groupedParams = true;
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

                groupedParams = false;
                savedType = "";
            }
            if (s.startsWith("}") && s.endsWith("{")) {
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
            else if (savedType.startsWith("char")) {
                savedType = savedType.replace("'", "\"");
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
            else if (!groupedParams) System.out.println(tabs + s);
        }
    }

    public static void checkMethodIdentifiers(String firstIdent, String secondIdent, boolean function) {
        if (function) {
            if (!firstIdent.equals(secondIdent)) {
                System.err.println("El identificador de apertura de la funcion: " + firstIdent + " no coincide con su identificador de cierre: " + secondIdent);
                throw new IllegalStateException();
            }
        } else {
            if (!firstIdent.equals(secondIdent)) {
                System.err.println("El identificador de apertura de la subrutina: " + firstIdent + " no coincide con su identificador de cierre: " + secondIdent);
                throw new IllegalStateException();
            }
        }
    }

    public static ArrayList<String> getParamChecker() {
        return paramChecker;
    }

    public static void checkParam(String param) {
        String aux = paramChecker.remove(0);
        if (!aux.equals(param)) {
            System.err.println("El parametro: " + aux + " no coincide con su declaración: " + param);
            throw new IllegalStateException();
        }
    }

    public static void updateParamContext() {
        if (!paramChecker.isEmpty()) {
            paramChecker.clear();
            System.err.println("El numero de parametros no coincide");
            throw new IllegalStateException();
        }
    }

    public static void checkFunctionReturnIdent(String functionName, String returnIdent, String returnValueIdent, boolean isHeader) {
        if (isHeader) {
            if (!functionName.equals(returnIdent)) {
                System.err.println("El nombre de la funcion: " + functionName + " no coincide con su identificador de retorno: " + returnIdent);
                throw new IllegalStateException();
            }
        } else {
            if (!functionName.equals(returnIdent)) {
                System.err.println("El nombre de la funcion: " + functionName + " no coincide con su identificador de retorno: " + returnIdent);
                throw new IllegalStateException();
            }
            else if (!functionName.equals(returnValueIdent)) {
                System.err.println("El nombre de la funcion: " + functionName + " no coincide con con la asignacion de retorno: " + returnValueIdent);
                throw new IllegalStateException();
            }
        }
    }

}
