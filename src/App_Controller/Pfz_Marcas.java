
package App_Controller;

public class Pfz_Marcas {
    private int id_pfzMarca;
    private String pfzMarca;
    
    public Pfz_Marcas(){
        id_pfzMarca = 0;
        pfzMarca = "";
    }

    public int getId_pfzMarca() {
        return id_pfzMarca;
    }

    public void setId_pfzMarca(int id_pfzMarca) {
        this.id_pfzMarca = id_pfzMarca;
    }

    public String getPfzMarca() {
        return pfzMarca;
    }

    public void setPfzMarca(String pfzMarca) {
        this.pfzMarca = pfzMarca;
    }

    
} // Fin de la clase
