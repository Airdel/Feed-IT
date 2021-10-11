/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

//importacion de librerias a utilizar
import java.io.File;

/**
 *
 * @author Equipo 5 FeedIT
 */
public class Generador {
    
    public static void main(String[] args) {
        String path = "C:\\Feed-IT\\Feed-IT\\src\\analizador_lexico\\Lexer.flex";
        generarLexer(path);
    }//main
    
    public static void generarLexer(String path){
        File file  = new File(path);
        JFlex.Main.generate(file);
    }//generarLexer
    
}//class Generador
