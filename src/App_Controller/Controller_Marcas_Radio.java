
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Marcas_Radio {
    
    public static ArrayList<MarcasRadio> obtenerMarcasR() {
        Connection conn = Menu_Principal.conn;
        ArrayList<MarcasRadio> marcasR = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        String q_Marcas = "SELECT\n"
                + "	id_marca,\n"
                + "	marca\n"
                + "FROM\n"
                + "	rad_marca_radio\n"
                + "ORDER BY marca;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Marcas);
            while (rs.next()) {
                MarcasRadio marca = new MarcasRadio();
                marca.setId_marcaR(rs.getInt("id_marca"));
                marca.setMarcaR(rs.getString("marca"));
                marcasR.add(marca);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Marcas Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return marcasR;
    } // Fin del método insertar
    
    public static void insertMarcaR(String marcaR) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                + "rad_marca_radio (marca)"
                + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, marcaR);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Marcas Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateMarcaR(int id, String marcaR) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpMarcaR = "UPDATE rad_marca_radio\n"
                + "SET marca = ?\n"
                + "WHERE\n"
                + "	id_marca = ?";
        try {
            pstmt = conn.prepareStatement(q_UpMarcaR);
            pstmt.setString(1, marcaR);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Marca Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateMarcaR
    
    public static void deleteMarcaR(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarcaR = "DELETE\n"
                + "FROM\n"
                + "	rad_marca_radio\n"
                + "WHERE\n"
                + "	id_marca = ?";
        try {
            pstmt = conn.prepareStatement(q_DeMarcaR);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Marca Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch

    } // Fin del metodo deleteZona
      
} // Fin de la clase
