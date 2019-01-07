
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Lineas {
    
    public static ArrayList<Tipos_Lineas> obtenerMarcasLinea() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Tipos_Lineas> lineasT = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_LineasT = "SELECT\n"
                + "	line_tipo_lineaTX.id_tipo_linea AS id,\n"
                + "	line_tipo_lineaTX.tipo_linea AS linea\n"
                + "FROM\n"
                + "	line_tipo_lineaTX\n"
                + "ORDER BY\n"
                + "	linea";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_LineasT);
            while (rs.next()) {
                Tipos_Lineas linea = new Tipos_Lineas();
                linea.setIdLinea(rs.getInt("id"));
                linea.setLinea(rs.getString("linea"));
                lineasT.add(linea);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT Plnata Marcas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return lineasT;
    } // Fin del método obtener
    
    
    public static void insertMarcaLinea(String marca) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                            + "	line_tipo_lineaTX (tipo_linea)\n "
                        + "VALUES (?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setString(1, marca);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println("Fallo INSERT :" + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    public static void updateMarcasLinea(int id, String marca) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpModeloR = "UPDATE line_tipo_lineaTX\n"
                            + "SET tipo_linea = ?\n"
                            + "WHERE\n"
                            + " id_tipo_linea = ?";
        try {
            pstmt = conn.prepareStatement(q_UpModeloR);
            pstmt.setString(1, marca);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println("Fallo UPDATE: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    public static void deleteMarca(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeMarcaPfz = "DELETE\n"
                            + "FROM\n"
                            + " line_tipo_lineaTX\n"
                            + "WHERE\n"
                            + " id_tipo_linea = ?";
        try {
            pstmt = conn.prepareStatement(q_DeMarcaPfz);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println("Fallo DELETE Marca Radio: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
    
    
    
    
} // Fin de la clase
