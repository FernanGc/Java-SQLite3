
package App_Controller;

public class Mtg_Marcas {
    
    private int id_mtgMarca;
    private String mtgMarca;

    public Mtg_Marcas(){
        id_mtgMarca = 0;
        mtgMarca = "";
    }

    public int getId_mtgMarca() {
        return id_mtgMarca;
    }

    public void setId_mtgMarca(int id_mtgMarca) {
        this.id_mtgMarca = id_mtgMarca;
    }

    public String getMtgMarca() {
        return mtgMarca;
    }

    public void setMtgMarca(String mtgMarca) {
        this.mtgMarca = mtgMarca;
    }
    
}
