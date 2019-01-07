
package App_Controller;


public class ModelosRadio {

    private int id_modelo;
    private String modeloR;
    private String mux;
    
    public ModelosRadio(){
        id_modelo = 0;
        modeloR = "";
    } // Fin de contructor

    /**
     * @return the id_modelo
     */
    public int getId_modelo() {
        return id_modelo;
    }

    /**
     * @param id_modelo the id_modelo to set
     */
    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    /**
     * @return the modeloR
     */
    public String getModeloR() {
        return modeloR;
    }

    /**
     * @param modeloR the modeloR to set
     */
    public void setModeloR(String modeloR) {
        this.modeloR = modeloR;
    }
    
    /**
     * @return the mux
     */
    public String getMux() {
        return mux;
    }

    /**
     * @param mux the mux to set
     */
    public void setMux(String mux) {
        this.mux = mux;
    }

} // Fin de la clase
