
package App_Controller;


public class Mtg_Modelos {
    
    private int id_mtgModelo;
    private String mtgModelo;
    
    public void Mtg_Modelos(){
        setId_mtgModelo(0);
        setMtgModelo("");
    }

    public int getId_mtgModelo() {
        return id_mtgModelo;
    }

    public void setId_mtgModelo(int id_mtgModelo) {
        this.id_mtgModelo = id_mtgModelo;
    }

    public String getMtgModelo() {
        return mtgModelo;
    }

    public void setMtgModelo(String mtgModelo) {
        this.mtgModelo = mtgModelo;
    }
}
