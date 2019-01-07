
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_TipoEst {
    
    public static ArrayList<TipoEst> obtenerTipoEst() {
        Connection conn = Menu_Principal.conn;
        ArrayList<TipoEst> tipoEst = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        
        String q_TipoEst = "SELECT\n"
                + "	id_tipo_est AS id,\n"
                + "	tipo_estacion AS tipo\n"
                + "FROM\n"
                + "	est_tipo\n"
                + "ORDER BY\n"
                + "	tipo_estacion ASC";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_TipoEst);

            while (rs.next()) {
                TipoEst tEst = new TipoEst();
                tEst.setId_tipo_est(rs.getInt("id"));
                tEst.setnTipo_est(rs.getString("tipo"));
                tipoEst.add(tEst);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
//            System.err.println("Error en la clase Controller_Tipo: " + e.getClass().getName() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return tipoEst;
    } // Fin del metodo
    
    public static void insertTipoEst(String nTipoEst) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InTipoEst = "INSERT INTO "
                                + "est_tipo (tipo_estacion)"
                            + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InTipoEst);
            pstmt.setString(1, nTipoEst);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT tipo_est: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertZona
    
    public static void updateTipoEst(int id, String tipoEst) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpZona = "UPDATE est_tipo\n"
                + "SET tipo_estacion = ?\n"
                + "WHERE\n"
                + "	id_tipo_est = ?";
        try {
            pstmt = conn.prepareStatement(q_UpZona);
            pstmt.setString(1, tipoEst);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE TipoEst: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo updateZona
    
    public static void deleteTipoEst(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeZona = "DELETE\n"
                + "FROM\n"
                + "	est_tipo\n"
                + "WHERE\n"
                + "	id_tipo_est = ?";
        try {
            pstmt = conn.prepareStatement(q_DeZona);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE TipoESt: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch

    } // Fin del metodo deleteZona
    
    
    
} // Fin de la clase
