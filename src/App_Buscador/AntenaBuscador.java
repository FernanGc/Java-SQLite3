
package App_Buscador;

public class AntenaBuscador {
    private int id_antena;
    private String est;
    private String dir;
    private String marca;
    private String modelo;
    private double diamtro;
    
    public AntenaBuscador(){
        id_antena = 0;
        est = "";
        dir = "";
        marca = "";
        modelo = "";
        diamtro = 0.0;
    }

    public int getId_antena() {
        return id_antena;
    }

    public void setId_antena(int id_antena) {
        this.id_antena = id_antena;
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

    public double getDiamtro() {
        return diamtro;
    }

    public void setDiamtro(double diamtro) {
        this.diamtro = diamtro;
    }
}
