//Generador de archivos de análisis sintáctico
package analizador_sintactico;

import java.io.File;

public class Generador {
    public static void main(String[] args) {
        String path1 = "src\\analizador_sintactico\\Lexer.flex";
        String path2 = "src\\analizador_sintactico\\Lexer.cup";
        String[] pathS = {"-parser", "Sintax", "src\\analizador_sintactico\\Sintax.cup"};
        generarLexer(path1, path2, pathS);
    }

    public static void generarLexer(String path1, String path2, String [] pathS) {
        
        if(Files.exists(path1)){
            Files.delete(path1);
        }
        File archivo = new File(path1);
        JFlex.Main.generate(archivo);

        if(Files.exists(path2)){
            Files.delete(path2);
        }
        archivo = new File(path2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(pathS);        
    }
}
