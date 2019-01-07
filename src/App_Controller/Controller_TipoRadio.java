
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_TipoRadio {
    
    public static ArrayList<TipoRadio> obtenerTiposR() {
        Connection conn = Menu_Principal.conn;
        ArrayList<TipoRadio> tiposR = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_TiposR = "SELECT\n"
                + "	rad_tipo.id_tipoRadio,\n"
                + "	rad_tipo.tipo_radio\n"
                + "FROM\n"
                + "	rad_tipo\n"
                + "ORDER BY\n"
                + "	tipo_radio;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_TiposR);
            while (rs.next()) {
                TipoRadio tipo = new TipoRadio();
                tipo.setId_TipoR(rs.getInt("id_tipoRadio"));
                tipo.setTipoRadio(rs.getString("tipo_radio"));
                tiposR.add(tipo);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Tipos Radio Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return tiposR;
    } // Fin del método obtener
    
    public static void insertTipoR(String tipoR) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InTipo = "INSERT INTO "
                + "rad_tipo (tipo_radio) "
                + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InTipo);
            pstmt.setString(1, tipoR);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Tipos de Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insert
    
    public static void updateTipoR(int id, String tipoR) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpTipoR = "UPDATE rad_tipo\n"
                          + "SET tipo_radio = ?\n"
                          + "WHERE\n"
                          + " id_tipoRadio = ?";
        try {
            pstmt = conn.prepareStatement(q_UpTipoR);
            pstmt.setString(1, tipoR);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Tipo Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateMarcaR
    
    public static void deleteTipoR(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeTipoR = "DELETE\n"
                + "FROM\n"
                + " rad_tipo\n"
                + "WHERE\n"
                + " id_tipoRadio = ?";
        try {
            pstmt = conn.prepareStatement(q_DeTipoR);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Tipo Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete

} // Fin de la clase
