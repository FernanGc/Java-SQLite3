
package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Controller_Estaditica {
    
    public static ArrayList<Estadistica_SG> getRadiosEstadistica() {
        Connection conn = Menu_Principal.conn;
        ArrayList<Estadistica_SG> rEstadistica = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_Rtotales = "SELECT DISTINCT\n"
                            + "	rad_modelo_radio.modelo AS Modelos,\n"
                            + "	count(*) AS Totales\n"
                            + "FROM\n"
                            + "	rad_radio\n"
                            + "INNER JOIN rad_modelo_radio ON rad_radio.id_modelo = rad_modelo_radio.id_mod_radio\n"
                            + "GROUP BY\n"
                            + "	Modelos";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Rtotales);
            while (rs.next()) {
                Estadistica_SG restt = new Estadistica_SG();
                restt.setModelos(rs.getString("Modelos"));
                restt.setTotales(rs.getInt("Totales"));
                rEstadistica.add(restt);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return rEstadistica;
    } // Fin del método obtener
    
    public static ArrayList<Estadistica2_SG> tEstSuper(){
        Connection conn = Menu_Principal.conn;
        ArrayList<Estadistica2_SG> rEstTT = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_EstTT = "SELECT DISTINCT\n"
                + "est_tipo.tipo_estacion AS tipo,\n"
                + "count(*) AS total\n"
                + "FROM\n"
                + "est_estacion\n"
                + "INNER JOIN est_tipo ON est_estacion.id_tipo_est = est_tipo.id_tipo_est\n"
                + "GROUP BY tipo";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_EstTT);
            while (rs.next()) {
                Estadistica2_SG restt = new Estadistica2_SG();
                restt.setTipoEst(rs.getString("tipo"));
                restt.setTotal(rs.getInt("total"));
                rEstTT.add(restt);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return rEstTT;
    }
    
    public static int zona(){
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        ResultSet rs = null;
        
        int total = 0;
        String q_TotalZonas = "SELECT\n"
                            + "	count(*) AS NoZonas\n"
                            + "FROM\n"
                            + "	est_zona";
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_TotalZonas);
            while (rs.next()) {
              total = rs.getInt("NoZonas");
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return total;
    } 
    
    public static int sectores() {
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        ResultSet rs = null;

        int total = 0;
        String qTotal = "SELECT\n" +
                            "count(*) AS Totalx\n" +
                        "FROM\n" +
                            "est_sector";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qTotal);
            while (rs.next()) {
                total = rs.getInt("Totalx");
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return total;
    }
    
    public static int centrsT() {
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        ResultSet rs = null;

        int total = 0;
        String qTotal = "SELECT\n"
                + "	count(*) AS Totalx\n"
                + "FROM\n"
                + "	est_centro_trabajo";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qTotal);
            while (rs.next()) {
                total = rs.getInt("Totalx");
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return total;
    }
    
    public static int responsablesE() {
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        ResultSet rs = null;

        int total = 0;
        String qTotal = "SELECT\n"
                            + "count(*) AS Totalx\n"
                        + "FROM\n"
                            + "est_responsable";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qTotal);
            while (rs.next()) {
                total = rs.getInt("Totalx");
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return total;
    }
    
    public static int estacionesT() {
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        ResultSet rs = null;

        int total = 0;
        String qTotal = "SELECT\n"
                + "count(*) AS Totalx\n"
                + "FROM\n"
                + "est_estacion";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qTotal);
            while (rs.next()) {
                total = rs.getInt("Totalx");
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return total;
    }
    
} // Fin de la clase
