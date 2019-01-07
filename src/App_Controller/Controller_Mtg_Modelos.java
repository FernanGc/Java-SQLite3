
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Mtg_Modelos {
    
    public static ArrayList<Mtg_Modelos> obtenerModelosMtg() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Mtg_Modelos> mtg_Modelos = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Modelos = "SELECT\n"
                            + " id_mg_modelo,\n"
                            + " nombre_modelo\n"
                        + "FROM\n"
                            + " mg_modelo_mg\n"
                        + "ORDER BY nombre_modelo;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Modelos);
            while (rs.next()) {
                Mtg_Modelos modelo = new Mtg_Modelos();
                modelo.setId_mtgModelo(rs.getInt("id_mg_modelo"));
                modelo.setMtgModelo(rs.getString("nombre_modelo"));
                mtg_Modelos.add(modelo);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT MotoGen Marcas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return mtg_Modelos;
    } // Fin del método obtener

    public static void insertModelosMtg(String modeloMtg) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InMtg = "INSERT INTO "
                            + "mg_modelo_mg (nombre_modelo) "
                        + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InMtg);
            pstmt.setString(1, modeloMtg);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT de Mtg: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca

    public static void updateModelosMtg(int id, String modeloMtg) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModeloR = "UPDATE mg_modelo_mg\n"
                            + "SET nombre_modelo = ?\n"
                            + "WHERE\n"
                            + " id_mg_modelo = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModeloR);
            pstmt.setString(1, modeloMtg);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Pfz: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update

    public static void deleteModelosMtg(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarcaMtg = "DELETE\n"
                + "FROM\n"
                + " mg_modelo_mg\n"
                + "WHERE\n"
                + " id_mg_modelo = ?";
        try {
            pstmt = conn.prepareStatement(q_DeMarcaMtg);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Marca: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
} // Fin de la clase
