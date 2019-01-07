
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Estacion {
    
    public static ArrayList<Estacion_Est> obtenerEstaciones() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Estacion_Est> estaciones = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        String q_Estacion = "SELECT\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "     est_tipo.tipo_estacion AS tipo,\n"
                + "	est_estacion.latitud AS lat,\n"
                + "	est_estacion.longitud AS lon,\n"
                + "	est_estacion.dom_conocido AS dom,\n"
                + "	est_estacion.id_estacion AS id_est,\n"
                + "	est_zona.descripcion AS clave,\n"
                + "	est_sector.nombre_sector AS sector,\n"
                + "	est_centro_trabajo.nombre_centro_t AS centro,\n"
                + "	est_responsable.nombre AS nombre,\n"
                + "	est_responsable.ap_paterno AS aP,\n"
                + "	est_responsable.ap_materno AS aM\n"
                + "FROM\n"
                + "	est_estacion\n"
                + "INNER JOIN est_zona ON est_estacion.id_zona = est_zona.id_zona\n"
                + "INNER JOIN est_sector ON est_estacion.id_sector = est_sector.id_sector\n"
                + "INNER JOIN est_centro_trabajo ON est_estacion.id_centro_trabajo = est_centro_trabajo.id_centro_t\n"
                + "INNER JOIN est_responsable ON est_estacion.id_responsable = est_responsable.id_responsable\n"
                + "INNER JOIN est_tipo ON est_estacion.id_tipo_est = est_tipo.id_tipo_est\n"
                + "ORDER BY est";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Estacion);
            while (rs.next()) {
                Estacion_Est est = new Estacion_Est();
                est.setId_est(rs.getInt("id_est"));
                est.setEst_nombre(rs.getString("est"));
                est.setEst_tipo(rs.getString("tipo"));
                est.setLatitud(rs.getString("lat"));
                est.setLongitud(rs.getString("lon"));
                est.setDom_con(rs.getString("dom"));
                est.setZona(rs.getString("clave"));
                est.setSector(rs.getString("sector"));
                est.setCentro(rs.getString("centro"));
                est.setNombre(rs.getString("nombre"));
                est.setAp_Paterno(rs.getString("aP"));
                est.setAp_Materno(rs.getString("aM"));
                estaciones.add(est);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT estaciones: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return estaciones;
    } // Fin del método obener estaciones
    
    public static void insertEstacion(String nombre, String lat, String lon, String dom,
            int id_zona, int id_sector, int id_centro, int id_resp, int id_tipo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO est_estacion (nombre_estacion, latitud, longitud, dom_conocido, id_zona, id_sector,"
                + "id_centro_trabajo, id_responsable, id_tipo_est) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, nombre);
            pstmt.setString(2, lat);
            pstmt.setString(3, lon);
            pstmt.setString(4, dom);
            pstmt.setInt(5, id_zona);
            pstmt.setInt(6, id_sector);
            pstmt.setInt(7, id_centro);
            pstmt.setInt(8, id_resp);
            pstmt.setInt(9, id_tipo);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT zonas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertZona
    
    public static void updateEstacion(int id, String est, String lat, String lon, String dom,
            int id_zona, int id_sector, int id_centro, int id_resp, int id_tipo) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpEstacion = "UPDATE est_estacion\n"
                + "SET nombre_estacion = ?,\n"
                + " latitud = ?,\n"
                + " longitud = ?,\n"
                + " dom_conocido = ?,\n"
                + " id_zona = ?,\n"
                + " id_sector = ?,\n"
                + " id_centro_trabajo = ?,\n"
                + " id_responsable = ?,\n"
                + " id_tipo_est = ?\n"
                + "WHERE\n"
                + "	id_estacion = ?";
        try {
            
            pstmt = conn.prepareStatement(q_UpEstacion);
            pstmt.setString(1, est);
            pstmt.setString(2, lat);
            pstmt.setString(3, lon);
            pstmt.setString(4, dom);
            pstmt.setInt(5, id_zona);
            pstmt.setInt(6, id_sector);
            pstmt.setInt(7, id_centro);
            pstmt.setInt(8, id_resp);
            pstmt.setInt(9, id_tipo);
            pstmt.setInt(10, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE estaciones: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateZona
    
    public static void deleteEstacion(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeEst = "DELETE\n"
                + "FROM\n"
                + "	est_estacion\n"
                + "WHERE\n"
                + "	id_estacion = ?";
        try {
            pstmt = conn.prepareStatement(q_DeEst);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Estacion: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo deleteEstacion
    
} // Fin de la clase
























//There are three points you should check:
//
//    are all resources like PreparedStatement, ResultSet etc. closed before issuing the next statements? 
//    Also close the Connection properly at the end.
//
//    What is your autocommit status? Check it on Connection with getAutoCommit(). If it is false, 
//    you must issue a Connection.commit() by hand. This is a setting which varies between databases is is most often omitted by error.
//
//    Check the setup of the database itself: sqlite is an embedded database and sometimes these have 
//    strange configuration defaults for easy startup or unit-testing. For example: "start me in memory only" 
//or "truncate all table at startup". Don't laugh, I have seen things like that! Check the Documentation for that.

