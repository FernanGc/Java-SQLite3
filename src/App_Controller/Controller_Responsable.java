
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Responsable {
    
    public static ArrayList<Responsable> obtenerResponsables() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Responsable> resps = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        String q_Resp = "SELECT\n"
                + "	est_responsable.id_responsable AS id,\n"
                + "	est_responsable.nombre AS nombre,\n"
                + "	est_responsable.ap_paterno AS paterno,\n"
                + "	est_responsable.ap_materno AS materno,\n"
                + "	est_responsable.telefono AS tel,\n"
                + "	est_responsable.celular AS cel,\n"
                + "	est_responsable.directo AS dir,\n"
                + "	est_responsable.extencion AS ext,\n"
                + "	est_responsable.email AS email\n"
                + "FROM\n"
                + "	est_responsable\n"
                + "ORDER BY\n"
                + "	nombre ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Resp);
            while (rs.next()) {
                Responsable responsable = new Responsable();
                responsable.setId_resp(rs.getInt("id"));
                responsable.setNombre(rs.getString("nombre"));
                responsable.setaPaterno(rs.getString("paterno"));
                responsable.setaMaterno(rs.getString("materno"));
                responsable.setTelefono(rs.getString("tel"));
                responsable.setCelular(rs.getString("cel"));
                responsable.setDirecto(rs.getString("dir"));
                responsable.setExtencion(rs.getString("ext"));
                responsable.setEmail(rs.getString("email"));
                resps.add(responsable);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT responsable: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return resps;
    } // Fin del método insertar
    
    public static void insertResponsable(String nom, String aP, String aM, String tel, String cel, String dir, String ext, String email) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InResp = "INSERT INTO "
                + "est_responsable (nombre, ap_paterno, ap_materno, telefono, celular, directo, extencion, email)"
                + "VALUES (?,?,?,?,?,?,?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InResp);
            pstmt.setString(1, nom);
            pstmt.setString(2, aP);
            pstmt.setString(3, aM);
            pstmt.setString(4, tel);
            pstmt.setString(5, cel);
            pstmt.setString(6, dir);
            pstmt.setString(7, ext);
            pstmt.setString(8, email);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT responsable: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertResponsable
    
    public static void updateResponsable(int id, String nom, String apP, String apM, String tel, String cel, String dir, String ext, String email) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpResp = "UPDATE est_responsable\n"
                + "SET nombre = ?,\n"
                + " ap_paterno = ?,\n"
                + " ap_materno = ?,\n"
                + " telefono = ?,\n"
                + " celular = ?,\n"
                + " directo = ?,\n"
                + " extencion = ?,\n"
                + " email = ?\n"
                + "WHERE\n"
                + "	id_responsable = ?";
        try {
            pstmt = conn.prepareStatement(q_UpResp);
            pstmt.setString(1, nom);
            pstmt.setString(2, apP);
            pstmt.setString(3, apM);
            pstmt.setString(4, tel);
            pstmt.setString(5, cel);
            pstmt.setString(6, dir);
            pstmt.setString(7, ext);
            pstmt.setString(8, email);
            pstmt.setInt(9, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE responsables: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateZona
    
    public static void deleteResp(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeResp = "DELETE\n"
                + "FROM\n"
                + "	est_responsable\n"
                + "WHERE\n"
                + "	id_responsable = ?";
        try {
            pstmt = conn.prepareStatement(q_DeResp);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE responsable: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo deleteZona

} // Fin de la clase
