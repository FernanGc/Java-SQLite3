
package App_Controller;

public class Mtg_Motogenerador {
    
    private int idMtg;
    private String est;
    private String numS;
    private String marca;
    private String modelo;
    private int capacidad;
    private String desc;

    public Mtg_Motogenerador() {
        idMtg = 0;
        est = "";
        numS = "";
        marca = "";
        modelo = "";
        capacidad = 0;
        desc = "";
    }

    public int getIdMtg() {
        return idMtg;
    }

    public void setIdMtg(int idMtg) {
        this.idMtg = idMtg;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getNumS() {
        return numS;
    }

    public void setNumS(String numS) {
        this.numS = numS;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
