/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_sintactico;

//importacion de librerias a utilizar
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Equipo 5 FeedIT
 */
public class Generador {
    

    public static void main(String[] args) throws IOException, Exception {
        String path = "C:\\Feed-IT\\Feed-IT\\src\\analizador_sintactico\\LexerCup.flex";
        String[] rutaS = {"-parser","Sintax","C:\\Feed-IT\\Feed-IT\\src\\analizador_sintactico\\Sintax.cup"};
        generar(path,rutaS);
    }//main
    
    public static void generar(String path, String[] rutaS ) throws IOException, Exception{
        File file  = new File(path);
        JFlex.Main.generate(file);
        java_cup.Main.main(rutaS);
         
        Path rutaSym = Paths.get("C:\\Feed-IT\\Feed-IT\\src\\analizador_sintactico\\sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);   
        }
        Files.move(
            Paths.get("C:\\Feed-IT\\Feed-IT\\sym.java"),
            Paths.get("C:\\Feed-IT\\Feed-IT\\src\\analizador_sintactico\\sym.java")
        );
         
        
        Path rutaSin = Paths.get("C:\\Feed-IT\\Feed-IT\\src\\analizador_sintactico\\Sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);   
        }
        Files.move(
            Paths.get("C:\\Feed-IT\\Feed-IT\\Sintax.java"),
            Paths.get("C:\\Feed-IT\\Feed-IT\\src\\analizador_sintactico\\Sintax.java")
        );
    }//generarLexer
    
}//class Generador