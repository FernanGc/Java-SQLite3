
package App_Controller;


public class TipoRadio {
    
    private int id_TipoR;
    private String tipoRadio;
    
    public TipoRadio(){
        id_TipoR = 0;
        tipoRadio = "";
    } // Fin constructor

    public int getId_TipoR() {
        return id_TipoR;
    }

    public void setId_TipoR(int id_TipoR) {
        this.id_TipoR = id_TipoR;
    }

    public String getTipoRadio() {
        return tipoRadio;
    }

    public void setTipoRadio(String tipoRadio) {
        this.tipoRadio = tipoRadio;
    }
} // Fin de la clase
