
package App_Controller;


public class Tor_Tipos {
    
    private int id_tipoT;
    private String tipoT;
    
    public Tor_Tipos(){
        id_tipoT = 0;
        tipoT = "";
    } 

    public int getId_tipoT() {
        return id_tipoT;
    }

    public void setId_tipoT(int id_tipoT) {
        this.id_tipoT = id_tipoT;
    }

    public String getTipoT() {
        return tipoT;
    }

    public void setTipoT(String tipoT) {
        this.tipoT = tipoT;
    }
}
