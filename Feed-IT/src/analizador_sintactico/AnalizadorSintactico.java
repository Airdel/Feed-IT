/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_sintactico;

import java.io.StringReader;
import java_cup.runtime.Symbol;

/**
 *
 * @author Enrique Miramontes
 */
public class AnalizadorSintactico {
    
    public String sintactico(String texto){
        Sintax s = new Sintax(new LexerCup(new StringReader(texto)));
        String r = "";
        try{
            s.parse();
            r = "ANALISIS SINTACTICO CORRECTO";
        }catch(Exception ex){
            Symbol sym = s.getS();
            r = "ERROR SINTACTICO. LINEA:   " + (sym.right + 1 )  + "  Texto:" + sym.value ;
        }
 
        return r;
    }//end sintactico
}//class
