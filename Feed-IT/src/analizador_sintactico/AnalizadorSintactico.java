/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_sintactico;

import java.io.StringReader;
import java_cup.runtime.Symbol;
import interfaces.FeedIT;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Enrique Miramontes
 */
public class AnalizadorSintactico {
     FeedIT er = new FeedIT();
    private boolean hayErrores() {
       
        if(er.errores.size()>0){
            return true;
        }
        return false;
    }
    private String getCountErroresString() {
        if (er.errores.size() > 1 || er.errores.size() < 1) {
            return er.errores.size() + " Errores";
        } else {
            return er.errores.size() + " Error";
        }
    }
    
    public void imprimirErrores(){
            Collections.sort(er.errores, new Comparator<Errores>() {
            @Override
            public int compare(Errores p1, Errores p2) {
                return (new Integer(p1.getLinea()).compareTo(p2.getLinea()));
            }
        });
        er.txtLog.setText(er.txtLog.getText() + "Lista de Errores encoantrados:\n\tb");
        for (int i = 0; i < er.errores.size(); i++) {
           er.txtLog.setText(er.txtLog.getText() + "\n" + er.errores.get(i).getDescripcion() + "\n");
        }    
    }
    
    public String sintactico(String texto){
        FeedIT.errores.clear();
        FeedIT.Producciones.clear();
        Sintax s = new Sintax(new LexerCup(new StringReader(texto)));
        String r = "";
        try{
            s.parse();
            r = "\\>ANALISIS SINTACTICO FINALIZADO";
        }catch(Exception ex){
            Symbol sym = s.getS();
            FeedIT ft = new FeedIT();
            ft.txtLog.setForeground(Color.red);
            if(sym!=null){
               r = "\nERROR SINTACTICO. LINEA:   " + (sym.right + 1 )  + "  Texto:" + sym.value ; 
            } else{
                Logger.getLogger(FeedIT.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
 
        return r;
    }//end sintactico
}//class