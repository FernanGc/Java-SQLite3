
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Gestores_Radio {
    
    public static ArrayList<GestoresRadio> obtenerGestoresR() {
        Connection conn = Menu_Principal.conn;
        ArrayList<GestoresRadio> gestoresR = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Gestores = "SELECT\n"
                + "	rad_gestor_radio.id_gestor AS id,\n"
                + "	rad_gestor_radio.nombre_gestor AS gestor\n"
                + "FROM\n"
                + "	rad_gestor_radio\n"
                + "ORDER BY\n"
                + "	nombre_gestor";
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Gestores);
            while (rs.next()) {
                GestoresRadio gestor = new GestoresRadio();
                gestor.setId_gestor(rs.getInt("id"));
                gestor.setGestor(rs.getString("gestor"));
                gestoresR.add(gestor);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Gestores Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return gestoresR;
    } // Fin del método obtener
    
    public static void insertGestorR(String gestorR) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InGestor = "INSERT INTO "
                + "rad_gestor_radio (nombre_gestor) "
                + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InGestor);
            pstmt.setString(1, gestorR);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Gestores Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insert
    
    public static void updateGestorR(int id, String gestorR) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpGestorR = "UPDATE rad_gestor_radio\n"
                + "SET nombre_gestor = ?\n"
                + "WHERE\n"
                + " id_gestor = ?";
        try {
            pstmt = conn.prepareStatement(q_UpGestorR);
            pstmt.setString(1, gestorR);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Gestor Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateMarcaR
    
    public static void deleteGestorR(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeGestorR = "DELETE\n"
                + "FROM\n"
                + " rad_gestor_radio\n"
                + "WHERE\n"
                + " id_gestor = ?";
        try {
            pstmt = conn.prepareStatement(q_DeGestorR);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Gestor Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo deleteGestor
    
} // Fin de la clase
