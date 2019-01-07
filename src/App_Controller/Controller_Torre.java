
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controller_Torre {
    
    public static ArrayList<TorreSF> obtenerTorres() {
        Connection conn = Menu_Principal.conn;
        ArrayList<TorreSF> Torres = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Torres = "SELECT\n"
                + "	tor_torre.id_torre AS idT,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	tor_tipo_torre.tipo AS tipo,\n"
                + "	tor_torre.altura AS altura,\n"
                + "	tor_torre_estado.tipo_estado AS estado,\n"
                + "	tor_torre_ubicacion.tipo_u AS ubica\n"
                + "FROM\n"
                + "	tor_torre\n"
                + "INNER JOIN tor_tipo_torre ON tor_torre.id_tipo_torre = tor_tipo_torre.id_tipo_torre\n"
                + "INNER JOIN tor_torre_estado ON tor_torre.id_estado = tor_torre_estado.id_estado\n"
                + "INNER JOIN tor_torre_ubicacion ON tor_torre.id_tipo_ubica = tor_torre_ubicacion.id_ubica\n"
                + "INNER JOIN est_estacion ON tor_torre.id_estacion = est_estacion.id_estacion\n"
                + "ORDER BY est";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Torres);
            while (rs.next()) {
                TorreSF torre = new TorreSF();
                torre.setId_torre(rs.getInt("idT"));
                torre.setEstacion(rs.getString("est"));
                torre.setTipoTorre(rs.getString("tipo"));
                torre.setAltura(rs.getDouble("altura"));
                torre.setEstado(rs.getString("estado"));
                torre.setUbicacion(rs.getString("ubica"));
                Torres.add(torre);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Torre: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return Torres;
    } // Fin del método obtener
    
    public static ArrayList<Tor_Tipos> obtenerTiposT() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Tor_Tipos> tiposT = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_TiposT = "SELECT\n"
                + "	tor_tipo_torre.id_tipo_torre AS id,\n"
                + "	tor_tipo_torre.tipo AS tipo\n"
                + "FROM\n"
                + "	tor_tipo_torre\n"
                + "ORDER BY tipo";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_TiposT);
            while (rs.next()) {
                Tor_Tipos tipo = new Tor_Tipos();
                tipo.setId_tipoT(rs.getInt("id"));
                tipo.setTipoT(rs.getString("tipo"));
                tiposT.add(tipo);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Tipos: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return tiposT;
    } // Fin del método obtener
    
    public static ArrayList<Tor_Estados> obtenerEstadosT() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Tor_Estados> estadosT = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_TiposT = "SELECT\n"
                + "	tor_torre_estado.id_estado AS id,\n"
                + "	tor_torre_estado.tipo_estado AS estado\n"
                + "FROM\n"
                + "	tor_torre_estado\n"
                + "ORDER BY estado";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_TiposT);
            while (rs.next()) {
                Tor_Estados estado = new Tor_Estados();
                estado.setId_Estado(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estadosT.add(estado);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Estads: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return estadosT;
    } // Fin del método obtener
    
    public static ArrayList<Tor_Ubicacion> obtenerUbicacionesT() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Tor_Ubicacion> ubicacionesT = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_UbicacionesT = "SELECT\n"
                + "tor_torre_ubicacion.id_ubica AS id,\n"
                + "tor_torre_ubicacion.tipo_u AS ubica\n"
                + "FROM\n"
                + "tor_torre_ubicacion\n"
                + "ORDER BY  ubica";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_UbicacionesT);
            while (rs.next()) {
                Tor_Ubicacion ubica = new Tor_Ubicacion();
                ubica.setId_ubicacion(rs.getInt("id"));
                ubica.setUbicacion(rs.getString("ubica"));
                ubicacionesT.add(ubica);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Estads: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return ubicacionesT;
    } // Fin del método obtener

    public static void insertTorre(int idEst, int idTipoT, double altura, int idEstado, int idUbica) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InTorre = "INSERT INTO "
                + "tor_torre (id_estacion, id_tipo_torre, "
                + "altura, id_estado, id_tipo_ubica) "
                + "VALUES (?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(q_InTorre);
            pstmt.setInt(1, idEst);
            pstmt.setInt(2, idTipoT);
            pstmt.setDouble(3, altura);
            pstmt.setInt(4, idEstado);
            pstmt.setInt(5, idUbica);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Torres > " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateTorre(int id, int idEst, int idTipoT, double altura, int idEstado, int idUbica) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpTorre = "UPDATE tor_torre\n"
                + "SET id_estacion = ?,\n"
                + " id_tipo_torre = ?,\n"
                + " altura = ?,\n"
                + " id_estado = ?,\n"
                + " id_tipo_ubica = ?\n"
                + "WHERE\n"
                + "	id_torre = ?;";
        try {
            pstmt = conn.prepareStatement(q_UpTorre);
            pstmt.setInt(1, idEst);
            pstmt.setInt(2, idTipoT);
            pstmt.setDouble(3, altura);
            pstmt.setInt(4, idEstado);
            pstmt.setInt(5, idUbica);
            pstmt.setInt(6, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Modelo Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteTorre(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeTorre = "DELETE\n"
                + "FROM\n"
                + " tor_torre\n"
                + "WHERE\n"
                + " id_torre = ?";
        try {
            pstmt = conn.prepareStatement(q_DeTorre);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Torre: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
}
