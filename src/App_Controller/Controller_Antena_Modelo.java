
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Antena_Modelo {

    public static ArrayList<Ant_Antena_Modelos> obtenerModelos() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Ant_Antena_Modelos> modelos = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Modelos = "SELECT\n"
                            + "	ant_modelo_antena.id_mod_ant AS id,\n"
                            + "	ant_modelo_antena.modelo_ant AS modelo\n"
                        + "FROM\n"
                         + "	ant_modelo_antena\n"
                        + "ORDER BY modelo ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Modelos);
            while (rs.next()) {
                Ant_Antena_Modelos modelo = new Ant_Antena_Modelos();
                modelo.setIdModelo(rs.getInt("id"));
                modelo.setModelo(rs.getString("modelo"));
                modelos.add(modelo);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Plnata Marcas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return modelos;
    } // Fin del método obtener
    
    public static void insertModelo(String modelo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                            + "ant_modelo_antena (modelo_ant) "
                        + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, modelo);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Marcas de Planta: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateModelos(int id, String modelo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModelo = "UPDATE ant_modelo_antena\n"
                            + "SET modelo_ant = ?\n"
                            + "WHERE\n"
                            + " id_mod_ant = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModelo);
            pstmt.setString(1, modelo);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteModelo(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarcaPfz = "DELETE\n"
                            + "FROM\n"
                                + " ant_modelo_antena\n"
                            + "WHERE\n"
                                + " id_mod_ant = ?";
        try {
            pstmt = conn.prepareStatement(q_DeMarcaPfz);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
    
}
