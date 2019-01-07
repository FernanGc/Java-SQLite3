
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Motogenerador {
    
    public static ArrayList<Mtg_Motogenerador> obtenerMotogens() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Mtg_Motogenerador> motogens = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_PlantazF = "SELECT\n"
                + "	mg_motogenerador.id_mg AS idMoto,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	mg_motogenerador.num_serie AS numS,\n"
                + "	mg_motogenerador.capacidad AS capacidad,\n"
                + "	mg_motogenerador.descripcion AS des,\n"
                + "	mg_marca_mg.nombre_marca AS marca,\n"
                + "	mg_modelo_mg.nombre_modelo AS modelo\n"
                + "FROM\n"
                + "	mg_motogenerador\n"
                + "INNER JOIN mg_modelo_mg ON mg_motogenerador.id_modelo = mg_modelo_mg.id_mg_modelo\n"
                + "INNER JOIN mg_marca_mg ON mg_motogenerador.id_marca = mg_marca_mg.id_mg_marca\n"
                + "INNER JOIN est_estacion ON mg_motogenerador.id_estacion = est_estacion.id_estacion\n"
                + "ORDER BY est";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_PlantazF);
            while (rs.next()) {
                Mtg_Motogenerador motogen = new Mtg_Motogenerador();
                motogen.setIdMtg(rs.getInt("idMoto"));
                motogen.setEst(rs.getString("est"));
                motogen.setNumS(rs.getString("numS"));
                motogen.setMarca(rs.getString("marca"));
                motogen.setModelo(rs.getString("modelo"));
                motogen.setCapacidad(rs.getInt("capacidad"));
                motogen.setDesc(rs.getString("des"));
                motogens.add(motogen);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Plantaz F: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return motogens;
    } // Fin del método obtener
    
    public static void insertModelo(int idEst, String numS, int capacidad, String desc, int idMarca, int idModelo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InPlantaF = "INSERT INTO "
                                + "mg_motogenerador (id_estacion, num_serie, capacidad, descripcion, "
                                + "id_marca, id_modelo)\n"
                            + "VALUES (?,?,?,?,?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InPlantaF);
            pstmt.setInt(1, idEst);
            pstmt.setString(2, numS);
            pstmt.setInt(3, capacidad);
            pstmt.setString(4, desc);
            pstmt.setInt(5, idMarca);
            pstmt.setInt(6, idModelo);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    
    public static void updateMotogen(int idMoto, int idEst, String numS,
            int capacidad, String desc, int idMarca, int idModelo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpMotoGen = "UPDATE mg_motogenerador\n"
                            + "SET id_estacion = ?,\n"
                            + " num_serie = ?,\n"
                            + " capacidad = ?,\n"
                            + " descripcion = ?,\n"
                            + " id_marca = ?,\n"
                            + " id_modelo = ?\n"
                            + "WHERE\n"
                            + "	id_mg = ?;";
        try {
            pstmt = conn.prepareStatement(q_UpMotoGen);
            pstmt.setInt(1, idEst);
            pstmt.setString(2, numS);
            pstmt.setInt(3, capacidad);
            pstmt.setString(4, desc);
            pstmt.setInt(5, idMarca);
            pstmt.setInt(6, idModelo);
            pstmt.setInt(7, idMoto);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE MotoGen: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updatePlanta
    
    public static void deleteMotoGen(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DePlanta = "DELETE\n"
                            + "FROM\n"
                            + " mg_motogenerador\n"
                            + "WHERE\n"
                            + " id_mg = ?";
        try {
            pstmt = conn.prepareStatement(q_DePlanta);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Planta: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
    
    
}
