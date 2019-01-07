
package App_Buscador;

public class RadioBuscador {
    
    private int id_radio;
    private String estacion;
    private String direccion;
    private String radioMarca;
    private String radioModelo;
    private String radioGestor;
    private String radioIP;
    private int bandwidth;
    private String formato;
    private String radioTipo;
    private String config;
    
    public RadioBuscador(){
        id_radio = 0;
        estacion = "";
        direccion = "";
        radioMarca = "";
        radioModelo = "";
        radioGestor = "";
        radioIP = "";
        bandwidth = 0;
        formato = "";
        radioTipo = "";
        config = "";
    }

    public int getId_radio() {
        return id_radio;
    }

    public void setId_radio(int id_radio) {
        this.id_radio = id_radio;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRadioMarca() {
        return radioMarca;
    }

    public void setRadioMarca(String radioMarca) {
        this.radioMarca = radioMarca;
    }

    public String getRadioModelo() {
        return radioModelo;
    }

    public void setRadioModelo(String radioModelo) {
        this.radioModelo = radioModelo;
    }

    public String getRadioGestor() {
        return radioGestor;
    }

    public void setRadioGestor(String radioGestor) {
        this.radioGestor = radioGestor;
    }

    public String getRadioIP() {
        return radioIP;
    }

    public void setRadioIP(String radioIP) {
        this.radioIP = radioIP;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getRadioTipo() {
        return radioTipo;
    }

    public void setRadioTipo(String radioTipo) {
        this.radioTipo = radioTipo;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
    
    
} // Fin de la clase
