
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Radio {
    
    public static ArrayList<RadioRad> obtenerRadio() {
        Connection conn = Menu_Principal.conn;
        ArrayList<RadioRad> radios = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Radios = "SELECT\n"
                + "	rad_radio.id_radio AS idR,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	rad_radio.direccion AS dir,\n"
                + "	rad_marca_radio.marca AS marca,\n"
                + "	rad_modelo_radio.modelo AS modelo,\n"
                + "	rad_gestor_radio.nombre_gestor AS gestor,\n"
                + "	rad_radio.ip_radio AS ip,\n"
                + "	rad_radio.bandwidth AS bw,\n"
                + "	rad_radio.formato_bw AS formato,\n"
                + "	rad_tipo.tipo_radio AS tipo,\n"
                + "	rad_radio.config AS config\n"
                + "FROM\n"
                + "	rad_radio\n"
                + "INNER JOIN rad_tipo ON rad_radio.id_tipo_radio = rad_tipo.id_tipoRadio\n"
                + "INNER JOIN rad_modelo_radio ON rad_radio.id_modelo = rad_modelo_radio.id_mod_radio\n"
                + "INNER JOIN rad_marca_radio ON rad_radio.id_marca = rad_marca_radio.id_marca\n"
                + "INNER JOIN rad_gestor_radio ON rad_radio.id_gestor = rad_gestor_radio.id_gestor\n"
                + "INNER JOIN est_estacion ON rad_radio.id_estacion = est_estacion.id_estacion\n"
                + "ORDER BY est,dir ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Radios);
            while (rs.next()) {
                RadioRad radio = new RadioRad();
                radio.setId_radio(rs.getInt("idR"));
                radio.setEstacion(rs.getString("est"));
                radio.setDireccion(rs.getString("dir"));
                radio.setRadioMarca(rs.getString("marca"));
                radio.setRadioModelo(rs.getString("modelo"));
                radio.setRadioGestor(rs.getString("gestor"));
                radio.setRadioIP(rs.getString("ip"));
                radio.setBandwidth(rs.getInt("bw"));
                radio.setFormato(rs.getString("formato"));
                radio.setRadioTipo(rs.getString("tipo"));
                radio.setConfig(rs.getString("config"));
                radios.add(radio);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Radios Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return radios;
    } // Fin del método obtener
    
    public static void insertRadio(int idEst, String dir, int idMarca, 
            int idModelo, int idGestor, String ip, int bw, String formato, int idTipo, String config ) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InRadio = "INSERT INTO "
                + "rad_radio (id_estacion, direccion, id_marca, id_modelo, "
                + "id_gestor, ip_radio, bandwidth, formato_bw, id_tipo_radio, config) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InRadio);
            pstmt.setInt(1, idEst);
            pstmt.setString(2, dir);
            pstmt.setInt(3, idMarca);
            pstmt.setInt(4, idModelo);
            pstmt.setInt(5, idGestor);
            pstmt.setString(6, ip);
            pstmt.setInt(7, bw);
            pstmt.setString(8, formato);
            pstmt.setInt(9, idTipo);
            pstmt.setString(10, config);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateRadioR(int idRadio, int idEst, String dir, int idMarca, 
            int idModelo, int idGestor, String ip, int bw, String formato, int idTipo, String config) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpRadio = "UPDATE rad_radio\n"
                + "SET id_estacion = ?,\n"
                + " direccion = ?,\n"
                + " id_marca = ?,\n"
                + " id_modelo = ?,\n"
                + " id_gestor = ?,\n"
                + " ip_radio = ?,\n"
                + " bandwidth = ?,\n"
                + " formato_bw = ?,\n"
                + " id_tipo_radio = ?,\n"
                + " config = ?\n"
                + "WHERE\n"
                + "	id_radio = ?;";
        try {
            pstmt = conn.prepareStatement(q_UpRadio);
            pstmt.setInt(1, idEst);
            pstmt.setString(2, dir);
            pstmt.setInt(3, idMarca);
            pstmt.setInt(4, idModelo);
            pstmt.setInt(5, idGestor);
            pstmt.setString(6, ip);
            pstmt.setInt(7, bw);
            pstmt.setString(8, formato);
            pstmt.setInt(9, idTipo);
            pstmt.setString(10, config);
            pstmt.setInt(11, idRadio);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateMarcaR
    
    public static void deleteRadio(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeRadio = "DELETE\n"
                + "FROM\n"
                + " rad_radio\n"
                + "WHERE\n"
                + " id_radio = ?";
        try {
            pstmt = conn.prepareStatement(q_DeRadio);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
} // Fin de la clase