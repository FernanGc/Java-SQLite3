package App_Controller;

public class Sector {

    private int id_sector;
    private String nSector;

    public Sector() {
        id_sector = 0;
        nSector = "";
    }

    /**
     * @return the id_sector
     */
    public int getId_sector() {
        return id_sector;
    }

    /**
     * @param id_sector the id_sector to set
     */
    public void setId_sector(int id_sector) {
        this.id_sector = id_sector;
    }

    /**
     * @return the nSector
     */
    public String getnSector() {
        return nSector;
    }

    /**
     * @param nSector the nSector to set
     */
    public void setnSector(String nSector) {
        this.nSector = nSector;
    }

} // Fin de la clase sector

