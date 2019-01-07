
package App_Controller;

public class Estadistica2_SG {
    
    private String tipoEst;
    private int total;
    
    public Estadistica2_SG(){
        tipoEst = "";
        total = 0;
    }

    public String getTipoEst() {
        return tipoEst;
    }

    public void setTipoEst(String tipoEst) {
        this.tipoEst = tipoEst;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
