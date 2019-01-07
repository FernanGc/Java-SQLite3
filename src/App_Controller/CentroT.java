package App_Controller;

public class CentroT {
    
    private int id_cent;
    private String nCentro;
    
    public CentroT(){
        id_cent = 0;
        nCentro = "";
    } // Fin de la clase

    /**
     * @return the id_cent
     */
    public int getId_cent() {
        return id_cent;
    }

    /**
     * @param id_cent the id_cent to set
     */
    public void setId_cent(int id_cent) {
        this.id_cent = id_cent;
    }

    /**
     * @return the nCentro
     */
    public String getnCentro() {
        return nCentro;
    }

    /**
     * @param nCentro the nCentro to set
     */
    public void setnCentro(String nCentro) {
        this.nCentro = nCentro;
    }
   
} // Fin de la clase
