package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_CentroT {

    public static ArrayList<CentroT> obtenerCentros() {
        Connection conn = Menu_Principal.conn;
        ArrayList<CentroT> centros = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        String q_Centros = "SELECT\n"
                + "est_centro_trabajo.id_centro_t AS id,\n"
                + "est_centro_trabajo.nombre_centro_t AS nCentro\n"
                + "FROM\n"
                + "est_centro_trabajo\n"
                + "ORDER BY\n"
                + "est_centro_trabajo.nombre_centro_t ASC";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Centros);
            while (rs.next()) {
                CentroT centro = new CentroT();
                centro.setId_cent(rs.getInt("id"));
                centro.setnCentro(rs.getString("nCentro"));
                centros.add(centro);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
//            System.err.println("Error en la clase Controller_CentroT: " + e.getClass().getName() + ": " + e.getMessage());
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return centros;
    } // Fin del metodo
    
    public static void insertCentro(String nCentro) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InCentro = "INSERT INTO\n"
                                + "est_centro_trabajo(nombre_centro_t)\n"
                          + "VALUES (?)";
        try {
            pstmt = conn.prepareStatement(q_InCentro);
            pstmt.setString(1, nCentro);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
//            System.err.println("Fallo INSERT centro: " + e.getClass().getName() + ": " + e.getMessage());
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } // Fin de try...catch  
    } // Fin del metodo insertCentro
    
    public static void updateCentro(int id, String nCentro) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpZona = "UPDATE est_centro_trabajo\n"
                        + "SET nombre_centro_t = ?\n"
                        + "WHERE\n"
                        + "id_centro_t = ?";
        try {
            pstmt = conn.prepareStatement(q_UpZona);
            pstmt.setString(1, nCentro);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
//            System.err.println("Fallo UPDATE zonas: " + e.getClass().getName() + ": " + e.getMessage());
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } // Fin de try...catch
    } // Fin del metodo updateCentro
    
    public static void deleteCentro(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeCentro = "DELETE\n"
                        + "FROM\n"
                            + "est_centro_trabajo\n"
                        + "WHERE\n"
                            + "id_centro_t = ?";
        try {
            pstmt = conn.prepareStatement(q_DeCentro);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
//            System.err.println("Fallo DELETE centro: " + e.getClass().getName() + ": " + e.getMessage());
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } // Fin de try...catch

    } // Fin del metodo deleteZona
    
    
    
    
} // Fin de la clase
