//FEED-IT
//Constructores para la gestión de Errores Sintácticos.
package analizador_sintactico;

public class C_Errores {

    public String Descripcion;
    public int linea;
    public int columna;

    public C_Errores(String Descripcion){
        this.Descripcion = Descripcion;
    }
    
    public C_Errores(String Descripcion, int linea,int columna) {
        this.Descripcion = Descripcion;
        this.linea = linea;
        this.columna = columna;
    }

    public C_Errores() {
        this.Descripcion = "";
        this.linea = 0;
        this.columna = 0;
    }

    ///métodos get y set para la obtención del error y su ubicación en el editor.
        
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
    
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
