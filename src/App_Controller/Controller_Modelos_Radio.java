
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Modelos_Radio {
    
    public static ArrayList<ModelosRadio> obtenerModelosR() {
        Connection conn = Menu_Principal.conn;
        ArrayList<ModelosRadio> modelosR = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        
        String q_Modelos = "SELECT\n"
                                + " id_mod_radio,\n"
                                + " modelo,\n"
                                + " mux\n"
                            + "FROM\n"
                                + " rad_modelo_radio\n"
                            + "ORDER BY modelo;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Modelos);
            while (rs.next()) {
                ModelosRadio modelo = new ModelosRadio();
                modelo.setId_modelo(rs.getInt("id_mod_radio"));
                modelo.setModeloR(rs.getString("modelo"));
                modelo.setMux(rs.getString("mux"));
                modelosR.add(modelo);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Modelos Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return modelosR;
    } // Fin del método obtener
    
    public static void insertModeloR(String modeloR, String mux) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                            + "rad_modelo_radio (modelo, mux) "
                        + "VALUES (?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, modeloR);
            pstmt.setString(2, mux);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Modelos Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateModeloR(int id, String modeloR, String mux) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModeloR = "UPDATE rad_modelo_radio\n"
                          + "SET modelo = ?,\n"
                          + "mux = ?"
                          + "WHERE\n"
                          + " id_mod_radio = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModeloR);
            pstmt.setString(1, modeloR);
            pstmt.setString(2, mux);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Modelo Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateMarcaR
    
    public static void deleteModeloR(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeModeloR = "DELETE\n"
                + "FROM\n"
                + " rad_modelo_radio\n"
                + "WHERE\n"
                + " id_mod_radio = ?";
        try {
            pstmt = conn.prepareStatement(q_DeModeloR);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Modelo Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo deleteModelo
    
} // Fin de la clase
