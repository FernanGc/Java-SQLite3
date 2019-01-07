
package App_Controller;

public class Tipos_Lineas {
    
    private int idLinea;
    private String Linea;
    
    public Tipos_Lineas(){
        idLinea = 0;
        Linea = "";
    }// Fin del constructor

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }
    
    
} // Fin de la clase
