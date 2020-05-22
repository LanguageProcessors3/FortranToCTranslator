import java.util.ArrayList;

public class ProgramOrchestrator {

    public static void printFullProgram(ArrayList<Constant> constants, ArrayList<Header> headers, ArrayList<String> statements) {
        // Función que dados los arrays de constantes, cabeceras y declaraciones, los recorre y utiliza los
        // métodos específicos de cada clase para mostrarlos por pantalla
        for (Constant c : constants)
            c.printConst();

        System.out.println();

        for (Header h : headers)
            h.printHeader();

        System.out.println();

        System.out.println("void main(void) {");

        printStatements(statements); // Función auxiliar para controlar la tabulación propia de las instrucciones
    }

    private static void printStatements(ArrayList<String> statements) {
        boolean __case__ = false; // Variable booleana que controla si estamos tabulando una estructura switch case o no
        String tabs = "\t"; // Se inicializan las tabulaciones a 1

        for (String s: statements) {
            if (s.startsWith("}") && s.endsWith("{")) {
                tabs = tabs.substring(0, tabs.length() - 1); // Se quita la última tabulación del acarreo global
                System.out.println(tabs + s);
                tabs += "\t";
            }
            else if (s.endsWith("{")) {
                System.out.println(tabs + s);
                tabs += "\t";
            }
            else if (s.startsWith("}")) {
                if (__case__) {
                    __case__ = false; // Si estabamos en un switch case se cierra y se quita una tabulación adicional
                    tabs = tabs.substring(0, tabs.length() - 1);
                }
                tabs = tabs.substring(0, tabs.length() - 1); // Se quita la última tabulación del acarreo global
                System.out.println(tabs + s);
            }
            else if (s.startsWith("default") || s.startsWith("case")) {
                s = s.replace("'","\"");
                if (!__case__) {
                    __case__ = true;
                    System.out.println(tabs + s);
                    tabs += "\t";
                } else { // Si hay otro case seguido se imprime sin la tabulación y luego se vuelve a añadir
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
            else if (s.contains("'") || s.contains("\"")) { // Caso para dar formato a los string en C y digitos opcionales
                char checkString = s.charAt(s.indexOf("=") + 2);
                boolean checkCase = s.contains("case");

                if ((checkString != '"') && (checkString != '\'') && (!checkCase)) {
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
