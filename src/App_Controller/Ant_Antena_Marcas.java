
package App_Controller;


public class Ant_Antena_Marcas {
    
    private int id_Marcas;
    private String marcas;
    
    public Ant_Antena_Marcas(){
        id_Marcas = 0;
        marcas = "";
    } // Fin del metodo

    public int getId_Marcas() {
        return id_Marcas;
    }

    public void setId_Marcas(int id_Marcas) {
        this.id_Marcas = id_Marcas;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }
} // Fin de la clase
