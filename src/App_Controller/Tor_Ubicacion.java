
package App_Controller;

public class Tor_Ubicacion {
    private int id_ubicacion;
    private String ubicacion;
    
    public Tor_Ubicacion(){
        id_ubicacion = 0;
        ubicacion = "";
    }

    public int getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
