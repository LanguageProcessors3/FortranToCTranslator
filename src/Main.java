import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);

            // Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            FortranToCLexer analex = new FortranToCLexer(input);
            analex.removeErrorListeners();
            analex.addErrorListener(new CustomErrorListener());

            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);

            // Crear el objeto correspondiente al analizador sintáctico con sus datos
            // Synthesis synthesisHandler = new Synthesis();
            FortranToCParser anasint = new FortranToCParser(tokens);
            anasint.removeErrorListeners();
            anasint.setErrorHandler(new CustomErrorStrategy());
            anasint.addErrorListener(new CustomErrorListener());


            /* Si se quiere pasar al analizador algún objeto externo con el que trabajar,
            este deberá ser de una clase del mismo paqueteAquí se le llama "sintesis",
            pero puede ser cualquier nombre.
            HelloParser anasint = new HelloParser(tokens, new sintesis());*/
            /* Comenzar el análisis llamando al axioma de la gramáticaAtención,
            sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu gramática*/

            anasint.prg();

            // Para obtener un resumen
            // synthesisHandler.resume();
        } catch (org.antlr.v4.runtime.RecognitionException e) { //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) { //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) { //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}
