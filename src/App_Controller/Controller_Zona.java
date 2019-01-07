package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Zona {

    public static ArrayList<Zona> obtenerZonas() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Zona> zonas = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        String q_Zona = "SELECT\n"
                + "	id_zona AS id, n_clave AS clave,\n"
                + "	descripcion AS descz\n"
                + "FROM\n"
                + "	est_zona\n"
                + "ORDER BY clave";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Zona);
            while (rs.next()) {
                Zona zona = new Zona();
                zona.setIdZona(rs.getInt("id"));
                zona.setClaveZona(rs.getString("clave"));
                zona.setNombreZona(rs.getString("descz"));
                zonas.add(zona);
            } // Fin de while
            rs.close();
            stmt.close();
            conn.commit();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT zonas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return zonas;
    } // Fin del método insertar
    
    public static void insertZona(String clave, String desc){
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;
        
        String q_InZona = "INSERT INTO "
                            + "est_zona (n_clave, descripcion)"
                        + "VALUES (?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, clave);
            pstmt.setString(2, desc);
            pstmt.executeUpdate();
            conn.commit();
//           JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT zonas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertZona
    
    public static void updateZona(int id, String clave, String desc) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;
        
        String q_UpZona = "UPDATE est_zona\n"
                + "SET n_clave = ?,\n"
                + " descripcion = ?\n"
                + "WHERE\n"
                + "	id_zona = ?";
        try {
            pstmt = conn.prepareStatement(q_UpZona);
            pstmt.setString(1, clave);
            pstmt.setString(2, desc);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE zonas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateZona
    
    public static void deleteZona(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;
        
        String q_DeZona = "DELETE\n"
                + "FROM\n"
                + "	est_zona\n"
                + "WHERE\n"
                + "	id_zona = ?";
        try {
            pstmt = conn.prepareStatement(q_DeZona);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE zonas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    
    } // Fin del metodo deleteZona
    
} // Fin de la clase

