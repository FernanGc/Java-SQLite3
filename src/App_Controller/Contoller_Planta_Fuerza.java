
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Contoller_Planta_Fuerza {
    
    public static ArrayList<Pfz_Planta_Fuerza> obtenerPlantasF() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Pfz_Planta_Fuerza> plantasF = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_PlantazF = "SELECT\n"
                + "     pfz_planta_fuerza.id_planta_fuerza AS id_planta,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	pfz_planta_fuerza.num_serie AS numS,\n"
                + "	pfz_marca_planta_fuerza.nombre_marca AS marca,\n"
                + "	pfz_modelo_planta_fuerza.nombre_modelo AS modelo,\n"
                + "	pfz_planta_fuerza.capacidad AS capacidad,\n"
                + "	pfz_planta_fuerza.descripcion AS desc\n"
                + "FROM\n"
                + "	pfz_planta_fuerza\n"
                + "INNER JOIN pfz_modelo_planta_fuerza ON pfz_planta_fuerza.id_modelo = pfz_modelo_planta_fuerza.id_planta_modelo\n"
                + "INNER JOIN pfz_marca_planta_fuerza ON pfz_planta_fuerza.id_marca = pfz_marca_planta_fuerza.id_planta_marca\n"
                + "INNER JOIN est_estacion ON pfz_planta_fuerza.id_estacion = est_estacion.id_estacion\n"
                + "ORDER BY est";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_PlantazF);
            while (rs.next()) {
                Pfz_Planta_Fuerza planta = new Pfz_Planta_Fuerza();
                planta.setIdPfz(rs.getInt("id_planta"));
                planta.setEst(rs.getString("est"));
                planta.setNumS(rs.getString("numS"));
                planta.setMarca(rs.getString("marca"));
                planta.setModelo(rs.getString("modelo"));
                planta.setCapacidad(rs.getInt("capacidad"));
                planta.setDesc(rs.getString("desc"));
                plantasF.add(planta);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Plantaz F: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return plantasF;
    } // Fin del método obtener
    
    public static void insertPlanta(int idEst, String numS, int capacidad, String desc, int idMarca, int idModelo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InPlantaF = "INSERT INTO "
                                + "pfz_planta_fuerza (id_estacion, num_serie, capacidad, descripcion, "
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

    public static void updatePlantaF(int idRadio, int idEst, String numS, 
            int capacidad, String desc, int idMarca, int idModelo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpPlanta = "UPDATE pfz_planta_fuerza\n"
                + "SET id_estacion = ?,\n"
                + " num_serie = ?,\n"
                + " capacidad = ?,\n"
                + " descripcion = ?,\n"
                + " id_marca = ?,\n"
                + " id_modelo = ?\n"
                + "WHERE\n"
                + "	id_planta_fuerza = ?;";
        try {
            pstmt = conn.prepareStatement(q_UpPlanta);
            pstmt.setInt(1, idEst);
            pstmt.setString(2, numS);
            pstmt.setInt(3, capacidad);
            pstmt.setString(4, desc);
            pstmt.setInt(5, idMarca);
            pstmt.setInt(6, idModelo);
            pstmt.setInt(7, idRadio);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Planta F: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updatePlanta
    
    
    public static void deletePlanta(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DePlanta = "DELETE\n"
                        + "FROM\n"
                            + " pfz_planta_fuerza\n"
                        + "WHERE\n"
                            + " id_planta_fuerza = ?";
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


} // Fin de la clase
