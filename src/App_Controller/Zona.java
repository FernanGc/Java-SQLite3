
package App_Controller;


public class Zona {

    private int id_zona;
    private String clave_zona;
    private String nombre_zona;

    public Zona() {
        id_zona = 0;
        clave_zona = "";
        nombre_zona = "";
    } // Fin constructor
    
    public int getIdZona(){
        return id_zona;
    }
    
    public void setIdZona(int id){
        this.id_zona = id;
    }

    public String getClaveZona() {
        return clave_zona;
    }

    public void setClaveZona(String cz) {
        this.clave_zona = cz;
    }

    public String getNombreZona() {
        return nombre_zona;
    }

    public void setNombreZona(String nz) {
        this.nombre_zona = nz;
    }
    
} // Fin de la clase

