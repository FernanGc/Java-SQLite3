
package App_Controller;


public class Ant_Antena_Modelos {
    
    private int idModelo;
    private String modelo;
    
    public Ant_Antena_Modelos(){
        idModelo = 0;
        modelo = "";
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
