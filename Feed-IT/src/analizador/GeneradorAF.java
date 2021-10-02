package analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GeneradorAF {

    public static void main(String[] args) throws Exception {
        String lexer                         = "C:/analizador/src/analizador/Lexer.flex";
        String cup                           = "C:/analizador/src/analizador/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/analizador/src/analizador/Sintax.cup"};
        generar(lexer, cup, rutaS);
    }

    private static void generarLexer(String path) {
        File file = new File(path);
        JFlex.Main.generate(file);
    }
     public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:/analizador/src/analizador/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/analizador/sym.java"), 
                Paths.get("C:/analizador/src/analizador/sym.java")
        );
        Path rutaSin = Paths.get("C:/analizador/src/analizador/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/analizador/Sintax.java"), 
                Paths.get("C:/analizador/src/analizador/Sintax.java")
        );
    }
}
