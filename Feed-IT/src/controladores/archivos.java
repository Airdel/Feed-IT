package controladores;

import javax.swing.JOptionPane;
import interfaces.Editor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
public class archivos {

    public archivos(){

    }
    private File archivo;
    private boolean guardar;
    private boolean guardarComo;
    private boolean mostrar;
    


    public Boolean nuevoArchivo(){
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea guardar el archivo actual?", "Atención!", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);

        //opción guardar-----------------
        if (resp == 0){
            guardarComo = true;
        }

        //Opción no guardar----------------
        if (resp == 1){
            guardarComo = false;
            
        }
        
        return guardarComo;
    } 
    public void guardarComo(){
        Editor manejador_txt = new Editor();
        Editor manejador_popup = new Editor();
        
        try {
            JFileChooser file = new JFileChooser();
            if (file.showSaveDialog(manejador_popup) == JFileChooser.APPROVE_OPTION) {
                archivo = file.getSelectedFile();
                if (archivo != null) {
                    FileWriter save = new FileWriter(archivo.getAbsolutePath() + ".fit");
                    String nombre = archivo.getName();
                    manejador_txt.setTitle(nombre);
                   // System.out.println(manejador_txt.txtEditor.getText());
                   // save.write(manejador_txt.txtEditor.getText());
                    save.close();
                    guardarComo = false;
                    manejador_txt.txt_notificaciones.setText("Se ha guardado un archivo");
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}