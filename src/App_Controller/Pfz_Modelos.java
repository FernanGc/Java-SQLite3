
package App_Controller;

public class Pfz_Modelos {
    
    private int id_pfzModelo;
    private String pfzModelo;
    
    public Pfz_Modelos(){
        id_pfzModelo = 0;
        pfzModelo = "";
    } 

    public int getId_pfzModelo() {
        return id_pfzModelo;
    }

    public void setId_pfzModelo(int id_pfzModelo) {
        this.id_pfzModelo = id_pfzModelo;
    }

    public String getPfzModelo() {
        return pfzModelo;
    }

    public void setPfzModelo(String pfzModelo) {
        this.pfzModelo = pfzModelo;
    }
    
} // Fin de la clase
