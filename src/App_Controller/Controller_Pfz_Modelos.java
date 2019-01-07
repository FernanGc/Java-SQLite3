package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Pfz_Modelos {
    
    public static ArrayList<Pfz_Modelos> obtenerModelosPfz() {
        
        Connection conn = Menu_Principal.conn;
        ArrayList<Pfz_Modelos> modelosPfz = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Modelos = "SELECT\n"
                            + " id_planta_modelo,\n"
                            + " nombre_modelo\n"
                        + "FROM\n"
                            + " pfz_modelo_planta_fuerza\n"
                        + "ORDER BY nombre_modelo;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Modelos);
            while (rs.next()) {
                Pfz_Modelos modelo = new Pfz_Modelos();
                modelo.setId_pfzModelo(rs.getInt("id_planta_modelo"));
                modelo.setPfzModelo(rs.getString("nombre_modelo"));
                modelosPfz.add(modelo);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Modelos Pfz: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return modelosPfz;
    } // Fin del método obtener
    
    public static void insertModelosPfz(String modeloPfz) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InModeloPfz = "INSERT INTO "
                                + "pfz_modelo_planta_fuerza (nombre_modelo) "
                             + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InModeloPfz);
            pstmt.setString(1, modeloPfz);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Modelos Pfz: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateModeloPfz(int id, String modeloPfz) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModeloR = "UPDATE pfz_modelo_planta_fuerza\n"
                            + "SET nombre_modelo = ?\n"
                            + "WHERE\n"
                            + " id_planta_modelo = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModeloR);
            pstmt.setString(1, modeloPfz);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Modelo Pfz: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteModeloPfz(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeModeloR = "DELETE\n"
                            + "FROM\n"
                                + " pfz_modelo_planta_fuerza\n"
                            + "WHERE\n"
                                + " id_planta_modelo = ?";
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
    } // Fin del metodo delete
} // Fin de la clase
