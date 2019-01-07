
package App_Controller;


public class Linea_SG {
    private int id_linea;
    private String est;
    private String dir;
    private String tipoL;
    private double longi;
    
    public Linea_SG(){
        id_linea = 0;
        est = "";
        dir = "";
        tipoL = "";
        longi = 0.0;
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTipoL() {
        return tipoL;
    }

    public void setTipoL(String tipoL) {
        this.tipoL = tipoL;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }
}
