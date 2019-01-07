
package App_Controller;

public class TorreSF {
    
    private int id_torre;
    private String estacion;
    private String tipoTorre;
    private double altura;
    private String estado;
    private String ubicacion;
    
    public TorreSF(){
        id_torre = 0;
        estacion = "";
        tipoTorre = "";
        altura = 0.0;
        estado = "";
        ubicacion = "Sin informaciòn";
    } // Fin del constructor

    public int getId_torre() {
        return id_torre;
    }

    public void setId_torre(int id_torre) {
        this.id_torre = id_torre;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
} // Fin de la clase
