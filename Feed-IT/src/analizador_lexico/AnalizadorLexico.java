
package analizador_lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.Editor;
import java.io.FileWriter;
/**
 * Enrique & Darien.
 * @author FEED-IT
 */
public class AnalizadorLexico{

    public String lexico(String path, String text){
       String r = "";
       if(path.equals("")){
           path = "C:\\Feed-IT\\archivos\\sinGuardar.fic";
           try{
               FileWriter save = new FileWriter(path);
               save.write(text);
               save.close();
           }catch (IOException ex){
               System.out.print(ex.getMessage());
           }
           
       }
       File file = new File(path);
       try{
           
           Reader read = new BufferedReader(new FileReader(file));
           Lexer lexer = new Lexer(read);
           
           while(true){
               Tokens tokens = lexer.yylex();
               if(tokens == null){
                 return r;
               }//if
               
               switch(tokens){
                   case ERROR: 
                       r += "ERROR LEXICO, SIMBOLO NO RECONOCIDO \n";
                       break;
                   case Int:
                   case Float:
                   case String:
                   case Double:
                   case Null:
                   case Humedad:
                   case Fagua:
                   case Fcomer:
                   case Peso:
                   case FPremio:
                   case Fmasaje:
                   case Fluz:
                   case Fjuguete:
                   case Candil:
                   case Class:
                   case When:
                   case If:
                   case Else:
                   case ForEach:
                   case Do:
                   case Const:
                   case  Fun:
                   case  Loop:
                   case  And:
                   case  Or:
                   case  Not:
                   case  True:
                   case  False:
                   case  While: 
                   case Time: 
                   case Main:
                       r += "PALABRA RESERVADA DE FEEDIT: " + lexer.lexeme + "\n";
                       break;
                   case Identificador:
                   case Numero:
                   case Flotante:
                   case Texto:    
                       r +=" ES UN: " + tokens + "\n"; 
                       break;
                   default:
                       r += "Token: " + tokens + "\n";
                       break;
               }//switch
               
           }//While
           
       }catch(FileNotFoundException e){} catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }//catch
       return r;
    }
}
