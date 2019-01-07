
package App_Controller;


public class MarcasRadio {
    
    private int id_marcaR;
    private String marcaR;
    
    
    public MarcasRadio(){
        id_marcaR = 0;
        marcaR = "";
    } // Fin del constructor

    /**
     * @return the id_marcaR
     */
    public int getId_marcaR() {
        return id_marcaR;
    }

    /**
     * @param id_marcaR the id_marcaR to set
     */
    public void setId_marcaR(int id_marcaR) {
        this.id_marcaR = id_marcaR;
    }

    /**
     * @return the marcaR
     */
    public String getMarcaR() {
        return marcaR;
    }

    /**
     * @param marcaR the marcaR to set
     */
    public void setMarcaR(String marcaR) {
        this.marcaR = marcaR;
    }

} // Fin de la clase
