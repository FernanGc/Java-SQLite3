package Main_Class;

import java.sql.*;

public class SQLite_Connection {

    Connection conn = null;
    
    public static Connection dbConector(){
        String driver = "jdbc:sqlite";
//        String database = "db/dbMicroondas.db"; 
        String database = "db/db_mo_final.db";
        String dbURL = driver + ":" + database;
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(dbURL);
            conn.setAutoCommit(false);
//            System.out.println("DB Open: OK - CLASS CONNECTION\n");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println("Fallo: CLASS CONNECTION");
            System.exit(0);
            return null;
        } // Fin de Try-Catch
    } // Fin del Mètodo
} // Fin de la clase
