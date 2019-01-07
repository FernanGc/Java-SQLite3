
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Sector {
    
    public static ArrayList<Sector> obtenerSectores(){
        Connection conn = Menu_Principal.conn;
        ArrayList<Sector> sectores = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        String q_Sectores = "SELECT\n"
                                + "id_sector AS id,\n"
                                + "nombre_sector AS nSector\n"
                            + "FROM\n"
                                + "est_sector\n"
                            + "ORDER BY nSector";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Sectores);
            
            while (rs.next()){
                Sector sector = new Sector();
                sector.setId_sector(rs.getInt("id"));
                sector.setnSector(rs.getString("nSector"));
                sectores.add(sector);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Error en la clase Controller_Sector: " + e.getClass().getName() + ": " + e.getMessage());
        }
        return sectores;
    } // Fin del metodo
    
    public static void insertSector(String nSector) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InSector = "INSERT INTO "
                            + "est_sector (nombre_sector)"
                        + "VALUES (?)";
        try {
            pstmt = conn.prepareStatement(q_InSector);
            pstmt.setString(1, nSector);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT C_Sector: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertZona
    
    public static void updateSector(int id, String nSector) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpSector = "UPDATE est_sector\n"
                        + "SET nombre_sector = ?\n"
                        + "WHERE\n"
                        + "id_sector = ?";
        try {
            pstmt = conn.prepareStatement(q_UpSector);
            pstmt.setString(1, nSector);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE sectores: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateSector
    
    public static void deleteSector(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeSector = "DELETE\n"
                + "FROM\n"
                + "	est_sector\n"
                + "WHERE\n"
                + "	id_sector = ?";
        try {
            pstmt = conn.prepareStatement(q_DeSector);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE sectores: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo deleteZona
} // Fin de la clase Sector
