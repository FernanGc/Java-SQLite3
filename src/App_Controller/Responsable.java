
package App_Controller;


public class Responsable {
    
    private int id_resp;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String telefono;
    private String celular;
    private String directo;
    private String extencion;
    private String email;
    
    public Responsable(){
          id_resp = 0;
          nombre = "";
          aPaterno = "";
          aMaterno = "";
          telefono = "";
          celular = "";
          directo = "";
          extencion = "";
          email = "";
    } // Fin del constructor

    public int getId_resp() {
        return id_resp;
    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDirecto() {
        return directo;
    }

    public void setDirecto(String directo) {
        this.directo = directo;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
} // Fin de la clase
