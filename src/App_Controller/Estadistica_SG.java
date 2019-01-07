
package App_Controller;


public class Estadistica_SG {
    
    private String modelos;
    private int totales;
    
    public Estadistica_SG(){
        modelos = "";
        totales = 0;
    } // Fin del metodo

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public int getTotales() {
        return totales;
    }

    public void setTotales(int totales) {
        this.totales = totales;
    }
} // Fin de la clase
