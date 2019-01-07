
package App_Controller;


public class Tor_Estados {
    
    private int id_Estado;
    private String estado;
    
    public Tor_Estados(){
        id_Estado = 0;
        estado = "";
    }

    public int getId_Estado() {
        return id_Estado;
    }

    public void setId_Estado(int id_Estado) {
        this.id_Estado = id_Estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
