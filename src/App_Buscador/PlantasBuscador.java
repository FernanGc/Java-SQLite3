
package App_Buscador;


public class PlantasBuscador {
    
    private int idPfz;
    private String est;
    private String numS;
    private String marca;
    private String modelo;
    private int capacidad;
    private String desc;
    
    public PlantasBuscador(){
        idPfz = 0;
        est = "";
        numS = "";
        marca = "";
        modelo = "";
        capacidad = 0;
        desc = "";
    }

    public int getIdPfz() {
        return idPfz;
    }

    public void setIdPfz(int idPfz) {
        this.idPfz = idPfz;
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
