
package App_Controller;


public class Estacion_Est {
    
    private int id_est;
    private String est_nombre;
    private String est_tipo;
    private String latitud;
    private String longitud;
    private String dom_con;
    private String zona;
    private String sector;
    private String centro;
    private String nombre;
    private String ap_Paterno;
    private String ap_Materno;
    

    
    public Estacion_Est(){
        id_est = 0;
        est_nombre = "";
        est_tipo = "";
        latitud = "";
        longitud = "";
        dom_con = "";
        zona = "";
        sector = "";
        centro = "";
        nombre = "";
        ap_Paterno = "";
        ap_Materno = "";
    } // Fin del constructor

    public int getId_est() {
        return id_est;
    }

    public void setId_est(int id_est) {
        this.id_est = id_est;
    }

    public String getEst_nombre() {
        return est_nombre;
    }

    public void setEst_nombre(String est_nombre) {
        this.est_nombre = est_nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getDom_con() {
        return dom_con;
    }

    public void setDom_con(String dom_con) {
        this.dom_con = dom_con;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_Paterno() {
        return ap_Paterno;
    }

    public void setAp_Paterno(String ap_Paterno) {
        this.ap_Paterno = ap_Paterno;
    }

    public String getAp_Materno() {
        return ap_Materno;
    }

    public void setAp_Materno(String ap_Materno) {
        this.ap_Materno = ap_Materno;
    }

    public String getEst_tipo() {
        return est_tipo;
    }

    public void setEst_tipo(String est_tipo) {
        this.est_tipo = est_tipo;
    }



}