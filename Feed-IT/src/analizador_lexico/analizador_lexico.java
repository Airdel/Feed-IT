
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
/**
 * Enrique & Darien.
 * @author FEED-IT
 */
public class analizador_lexico {

    public String lexico(String path, String text){
       String r = "";
       File file = new File(path);
       try{
           PrintWriter write = new PrintWriter(file);
           write.print(text);
           System.out.println("Obtencion de datos del editor");
           write.close();
           Reader read = new BufferedReader(new FileReader(file));
           Lexer lexer = new Lexer(read);
           
           while(true){
               Tokens tokens = lexer.yylex();
               if(tokens == null){
                 System.out.println("Escritura en el Log"+ r );
                 return r;
               }//if
               
               switch(tokens){
                   case ERROR: 
                       r += "Error Lexico, Simbolo no definido \n";
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
                       r += lexer.lexeme + " Palabra reservada FeedIt: " + tokens + "\n";
                       break;
                   case Identificador:
                   case Numero:
                   case Flotante:
                   case Texto:    
                       r += lexer.lexeme + " Es un: " + tokens + "\n"; 
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
