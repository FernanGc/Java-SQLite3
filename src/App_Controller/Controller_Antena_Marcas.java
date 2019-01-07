
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Antena_Marcas {

    public static ArrayList<Ant_Antena_Marcas> obtenerMarcas() {
            Connection conn = Menu_Principal.conn;
            ArrayList<Ant_Antena_Marcas> pfz_Marcas = new ArrayList<>();
            Statement stmt = null;
            ResultSet rs = null;

            String q_Marcas = "SELECT\n"
                        + "	ant_marca_antena.id_marca_ant AS id,\n"
                        + "	ant_marca_antena.marca_ant AS marca\n"
                            + "FROM\n"
                        + "	ant_marca_antena\n"
                            + "ORDER BY\n"
                        + "	marca";
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(q_Marcas);
                while (rs.next()) {
                    Ant_Antena_Marcas marca = new Ant_Antena_Marcas();
                    marca.setId_Marcas(rs.getInt("id"));
                    marca.setMarcas(rs.getString("marca"));
                    pfz_Marcas.add(marca);
                } // Fin de while
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//                System.err.println("Fallo SELECT Plnata: " + e.getClass().getName() + ": " + e.getMessage());
            } // Fin de catch
            return pfz_Marcas;
    } // Fin del método obtener
        
    public static void insertMarca(String marca) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InMarca = "INSERT INTO "
                            + "ant_marca_antena (marca_ant) "
                        + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InMarca);
            pstmt.setString(1, marca);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateMarcas(int id, String marca) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpMarca= "UPDATE ant_marca_antena\n"
                            + "SET marca_ant = ?\n"
                            + "WHERE\n"
                            + " id_marca_ant = ?";
        try {
            pstmt = conn.prepareStatement(q_UpMarca);
            pstmt.setString(1, marca);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE  Marca: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteMarca(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarca= "DELETE\n"
                + "FROM\n"
                + " ant_marca_antena\n"
                + "WHERE\n"
                + " id_marca_ant = ?";
        try {
            pstmt = conn.prepareStatement(q_DeMarca);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Marca Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
   
}// Fin de la clase
