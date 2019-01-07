
package App_Controller;


public class GestoresRadio {
    
    private int id_gestor;
    private String gestor;
    
    public GestoresRadio(){
        id_gestor = 0;
        gestor = "";
    }

    public int getId_gestor() {
        return id_gestor;
    }

    public void setId_gestor(int id_gestor) {
        this.id_gestor = id_gestor;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

} // Fin de la clase
