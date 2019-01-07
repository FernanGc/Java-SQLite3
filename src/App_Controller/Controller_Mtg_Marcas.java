
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Mtg_Marcas {
    
    public static ArrayList<Mtg_Marcas> obtenerMarcasMtg() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Mtg_Marcas> mtg_Marcas = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Modelos = "SELECT\n"
                            + " id_mg_marca,\n"
                            + " nombre_marca\n"
                        + "FROM\n"
                            + " mg_marca_mg\n"
                        + "ORDER BY nombre_marca;";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Modelos);
            while (rs.next()) {
                Mtg_Marcas marca = new Mtg_Marcas();
                marca.setId_mtgMarca(rs.getInt("id_mg_marca"));
                marca.setMtgMarca(rs.getString("nombre_marca"));
                mtg_Marcas.add(marca);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT MotoGen Marcas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return mtg_Marcas;
    } // Fin del método obtener
    
    public static void insertMarcaMtg(String marcaMtg) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InMtg = "INSERT INTO "
                            + "mg_marca_mg (nombre_marca) "
                        + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InMtg);
            pstmt.setString(1, marcaMtg);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE); 
//            System.err.println("Fallo INSERT Marcas de Mtg: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    
    public static void updateMarcasMtg(int id, String macaMtg) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModeloR = "UPDATE mg_marca_mg\n"
                            + "SET nombre_marca = ?\n"
                            + "WHERE\n"
                                + " id_mg_marca = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModeloR);
            pstmt.setString(1, macaMtg);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE  Marca Pfz: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteMarcaMtg(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarcaMtg = "DELETE\n"
                            + "FROM\n"
                                + " mg_marca_mg\n"
                            + "WHERE\n"
                                + " id_mg_marca = ?";
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
