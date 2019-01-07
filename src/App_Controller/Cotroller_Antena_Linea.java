
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cotroller_Antena_Linea {
    
    public static ArrayList<Antena_SG> obtenerAntenas() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Antena_SG> antenas = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Antenas = "SELECT\n"
                + "	ant_antena.id_antena AS id,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	rad_radio.direccion AS dir,\n"
                + "	ant_marca_antena.marca_ant AS marcca,\n"
                + "	ant_modelo_antena.modelo_ant AS modelo,\n"
                + "	ant_antena.diametro AS diam\n"
                + "FROM\n"
                + "	ant_antena\n"
                + "INNER JOIN ant_marca_antena ON ant_antena.id_marca_ant = ant_marca_antena.id_marca_ant\n"
                + "INNER JOIN ant_modelo_antena ON ant_antena.id_modelo_ant = ant_modelo_antena.id_mod_ant\n"
                + "INNER JOIN rad_radio ON ant_antena.id_radio = rad_radio.id_radio\n"
                + "INNER JOIN est_estacion ON rad_radio.id_estacion = est_estacion.id_estacion\n"
                + "ORDER BY est, dir";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Antenas);
            while (rs.next()) {
                Antena_SG antena = new Antena_SG();
                antena.setId_antena(rs.getInt("id"));
                antena.setEst(rs.getString("est"));
                antena.setDir(rs.getString("dir"));
                antena.setMarca(rs.getString("marcca"));
                antena.setModelo(rs.getString("modelo"));
                antena.setDiamtro(rs.getDouble("diam"));
                antenas.add(antena);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Antenas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return antenas;
    } // Fin del método obtener
    
    public static ArrayList<Linea_SG> obtenerLineas() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Linea_SG> lineas = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Lineas = "SELECT\n"
                + "	line_linea.id_linea_tx AS id,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	rad_radio.direccion AS dir,\n"
                + "	line_tipo_lineaTX.tipo_linea AS tipo,\n"
                + "	line_linea.longitd AS lon\n"
                + "FROM\n"
                + "	line_linea\n"
                + "INNER JOIN line_tipo_lineaTX ON line_linea.id_tipo_linea = line_tipo_lineaTX.id_tipo_linea\n"
                + "INNER JOIN rad_radio ON line_linea.id_radio = rad_radio.id_radio\n"
                + "INNER JOIN est_estacion ON rad_radio.id_estacion = est_estacion.id_estacion\n"
                + "ORDER BY est, dir";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Lineas);
            while (rs.next()) {
                Linea_SG linea = new Linea_SG();
                linea.setId_linea(rs.getInt("id"));
                linea.setEst(rs.getString("est"));
                linea.setDir(rs.getString("dir"));
                linea.setTipoL(rs.getString("tipo"));
                linea.setLongi(rs.getDouble("lon"));
                lineas.add(linea);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Antenas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return lineas;
    } // Fin del método obtener

    /* Insertar Antenas */
    public static void insertAntena(int idRadio, int idMarca, int idModelo, double diametro ) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                            + "ant_antena (id_radio,id_marca_ant,id_modelo_ant,diametro) "
                        + "VALUES (?,?,?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setInt(1, idRadio);
            pstmt.setInt(2, idMarca);
            pstmt.setInt(3, idModelo);
            pstmt.setDouble(4, diametro);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Antenas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    /* Insertar Lineas */
    public static void insertLineas(int idRadio, int idTipoL, double longitud) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_InZona = "INSERT INTO "
                            + "line_linea (id_radio, id_tipo_linea, longitd) "
                        + "VALUES (?,?,?) ";
        try {
            pstmt = conn.prepareStatement(q_InZona);
            pstmt.setInt(1, idRadio);
            pstmt.setInt(2, idTipoL);
            pstmt.setDouble(3, longitud);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo INSERT Lineas: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch  
    } // Fin del metodo insertMarca
    
    /*Update Antena*/
    public static void updateAntena(int idAnt, int idRadio, int idMarca,
            int idModelo, double diametro) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpAnena = "UPDATE ant_antena\n" +
                           "SET id_radio = ?,\n" +
                            " id_marca_ant = ?,\n" +
                            " id_modelo_ant = ?,\n" +
                            " diametro = ?\n" +
                           "WHERE\n" +
                            "	id_antena = ?;";
        try {
            pstmt = conn.prepareStatement(q_UpAnena);
            pstmt.setInt(1, idRadio);
            pstmt.setInt(2, idMarca);
            pstmt.setInt(3, idModelo);
            pstmt.setDouble(4, diametro);
            pstmt.setInt(5, idAnt);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Antna: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    /*Update Linea*/
    public static void updateLinea(int idLinea, int idRadio, int idTipoL, double longi) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_UpLinea = "UPDATE line_linea\n" +
                            "SET id_radio = ?,\n" +
                            " id_tipo_linea = ?,\n" +
                            " longitd = ?\n" +
                            "WHERE\n" +
                            "	id_linea_tx = ?";
        try {
            pstmt = conn.prepareStatement(q_UpLinea);
            pstmt.setInt(1, idRadio);
            pstmt.setInt(2, idTipoL);
            pstmt.setDouble(3, longi);
            pstmt.setInt(4, idLinea);
            pstmt.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo UPDATE Linea: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo update
    
    /*Delete Antena*/
    public static void deleteAntena(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeAntena = "DELETE\n"
                            + "FROM\n"
                            + " ant_antena\n"
                            + "WHERE\n"
                            + " id_antena = ?";
        try {
            pstmt = conn.prepareStatement(q_DeAntena);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Antena: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    } // Fin del metodo delete
    
    /*Delete Linea*/
    public static void deleteLinea(int id) {
        Connection conn = Menu_Principal.conn;
        PreparedStatement pstmt = null;

        String q_DeLinea = "DELETE\n"
                            + "FROM\n"
                            + " line_linea\n"
                            + "WHERE\n"
                            + " id_linea_tx = ?";
        try {
            pstmt = conn.prepareStatement(q_DeLinea);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
//            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo DELETE Linea: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de try...catch
    }

}
