
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Pfz_Marcas {
    public static ArrayList<Pfz_Marcas> obtenerMarcasPfz() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Pfz_Marcas> pfz_Marcas = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        
        String q_Modelos = "SELECT\n"
                                + " id_planta_marca,\n"
                                + " nombre_marca\n"
                            + "FROM\n"
                                + " pfz_marca_planta_fuerza\n"
                            + "ORDER BY nombre_marca;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Modelos);
            while (rs.next()) {
                Pfz_Marcas marca = new Pfz_Marcas();
                marca.setId_pfzMarca(rs.getInt("id_planta_marca"));
                marca.setPfzMarca(rs.getString("nombre_marca"));
                pfz_Marcas.add(marca);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Plnata Marcas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return pfz_Marcas;
    } // Fin del método obtener
    
    public static void insertMarcaPfz(String marcaPfz) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                + "pfz_marca_planta_fuerza (nombre_marca) "
                + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, marcaPfz);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Marcas de Planta: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateMarcasPfz(int id, String macaPfz) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModeloR = "UPDATE pfz_marca_planta_fuerza\n"
                + "SET nombre_marca = ?\n"
                + "WHERE\n"
                + " id_planta_marca = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModeloR);
            pstmt.setString(1, macaPfz);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE  Marca Pfz: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteMarcaPfz(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarcaPfz = "DELETE\n"
                + "FROM\n"
                + " pfz_marca_planta_fuerza\n"
                + "WHERE\n"
                + " id_planta_marca = ?";
        try {
            pstmt = conn.prepareStatement(q_DeMarcaPfz);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Marca Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
        
        
        
        
} // Fin de la clase
