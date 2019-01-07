
package App_Controller;

public class TipoEst {
    private int id_tipo_est;
    private String nTipo_est;
    
    public TipoEst(){
        id_tipo_est = 0;
        nTipo_est = "";
    } // Fin del constructor

    public int getId_tipo_est() {
        return id_tipo_est;
    }

    public void setId_tipo_est(int id_tipo_est) {
        this.id_tipo_est = id_tipo_est;
    }

    public String getnTipo_est() {
        return nTipo_est;
    }

    public void setnTipo_est(String nTipo_est) {
        this.nTipo_est = nTipo_est;
    }
} // Fin de la clase
