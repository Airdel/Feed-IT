/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador_sintactico;
import java.io.File;
/**
 *
 * @author darie
 */
public class GeneradorAF {
    
    public static void generarLexer(String path1, String path2, String [] pathS) {
        File archivo = new File(path1);
        JFlex.Main.generate(archivo);
        archivo = new File(path2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(pathS);        
    }

    public static void main(String[] args){
        String path1 = "src\\analizador_sintactico\\Lexer.flex";
        String path2 = "src\\analizador_sintactico\\Lexer.cup";
        String[] pathS = {"-parser", "Sintax", "src\\analizador_sintactico\\Sintax.cup"};
        generarLexer(path1, path2, pathS);
    }
    
}
