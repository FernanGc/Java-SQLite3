
package App_Buscador;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller_Search_v2 {
    
    public static String[] buscarEstacion(String word) {
        Connection conn = Menu_Principal.conn;
        String[] datos = null;
        Statement stmt = null;
        ResultSet rs = null;
        String q_Estacion = "SELECT\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	est_tipo.tipo_estacion AS tipo,\n"
                + "	est_estacion.latitud AS lat,\n"
                + "	est_estacion.longitud AS lon,\n"
                + "	est_estacion.dom_conocido AS dom,\n"
                + "	est_zona.descripcion AS zona,\n"
                + "	est_sector.nombre_sector AS sector,\n"
                + "	est_centro_trabajo.nombre_centro_t AS centro,\n"
                + "	est_responsable.nombre AS nombre,\n"
                + "	est_responsable.ap_paterno AS aP,\n"
                + "	est_responsable.ap_materno AS aM,\n"
                + "	est_responsable.telefono AS tel,\n"
                + "	est_responsable.celular AS cel,\n"
                + "	est_responsable.directo AS dir,\n"
                + "	est_responsable.extencion AS ext,\n"
                + "	est_responsable.email AS email\n"
                + "FROM\n"
                + "	est_estacion\n"
                + "INNER JOIN est_zona ON est_estacion.id_zona = est_zona.id_zona\n"
                + "INNER JOIN est_sector ON est_estacion.id_sector = est_sector.id_sector\n"
                + "INNER JOIN est_centro_trabajo ON est_estacion.id_centro_trabajo = est_centro_trabajo.id_centro_t\n"
                + "INNER JOIN est_responsable ON est_estacion.id_responsable = est_responsable.id_responsable\n"
                + "INNER JOIN est_tipo ON est_estacion.id_tipo_est = est_tipo.id_tipo_est\n"
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' LIMIT 1";       
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Estacion);
            while (rs.next()) {
                datos = new String[16];
                datos[0] = rs.getString("est");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("lat");
                datos[3] = rs.getString("lon");
                datos[4] = rs.getString("dom");
                datos[5] = rs.getString("zona");
                datos[6] = rs.getString("sector");
                datos[7] = rs.getString("centro");
                datos[8] = rs.getString("nombre");
                datos[9] = rs.getString("aP");
                datos[10] = rs.getString("aM");
                datos[11] = rs.getString("tel");
                datos[12] = rs.getString("cel");
                datos[13] = rs.getString("dir");
                datos[14] = rs.getString("ext");
                datos[15] = rs.getString("email");
                return datos;
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } // Fin de catch
        return datos;
    } // Fin del método obener estaciones
    
    public static String[] buscarTorre(String word) {
        Connection conn = Menu_Principal.conn;
        String[] datos = null;
        Statement stmt = null;
        ResultSet rs = null;
        String q_Torre = "SELECT\n"
                + "est_estacion.nombre_estacion AS est,\n"
                + "tor_tipo_torre.tipo AS tipo,\n"
                + "tor_torre.altura AS altura,\n"
                + "tor_torre_estado.tipo_estado AS estado,\n"
                + "tor_torre_ubicacion.tipo_u AS ubica\n"
                + "FROM\n"
                + "tor_torre\n"
                + "INNER JOIN tor_tipo_torre ON tor_torre.id_tipo_torre = tor_tipo_torre.id_tipo_torre\n"
                + "INNER JOIN tor_torre_estado ON tor_torre.id_estado = tor_torre_estado.id_estado\n"
                + "INNER JOIN tor_torre_ubicacion ON tor_torre.id_tipo_ubica = tor_torre_ubicacion.id_ubica\n"
                + "INNER JOIN est_estacion ON tor_torre.id_estacion = est_estacion.id_estacion\n"                
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' LIMIT 1";
//        System.out.println(q_Torre);
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Torre);
            while (rs.next()) {
                datos = new String[6];
                datos[0] = rs.getString("est");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("altura");
                datos[3] = rs.getString("estado");
                datos[4] = rs.getString("ubica");
                return datos;
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Fallo SELECT Torre: " + e.getClass().getName() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } // Fin de catch
        return datos;
    } // Fin del método obener estaciones
    
    public static ArrayList<RadioBuscador> buscarRadios(String word) {
        Connection conn = Menu_Principal.conn;
        ArrayList<RadioBuscador> radios = new ArrayList<>();
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
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' \n"
                + "ORDER BY est ";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Radios);
            while (rs.next()) {
                RadioBuscador radio = new RadioBuscador();
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
    
    public static ArrayList<AntenaBuscador> buscarAtenas(String word) {
        Connection conn = Menu_Principal.conn;
        ArrayList<AntenaBuscador> antenas = new ArrayList<>();
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
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' \n"
                + "ORDER BY est ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Antenas);
            while (rs.next()) {
                AntenaBuscador antena = new AntenaBuscador();
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
        } // Fin de catch
        return antenas;
    } // Fin del método obtener LineasBuscador
    
    public static ArrayList<LineasBuscador> buscarLineas(String word) {
        Connection conn = Menu_Principal.conn;
        ArrayList<LineasBuscador> lineas = new ArrayList<>();
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
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' \n"
                + "ORDER BY est ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_Lineas);
            while (rs.next()) {
                LineasBuscador linea = new LineasBuscador();
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
        } // Fin de catch
        return lineas;
    } // Fin del método obtener
    
    public static ArrayList<PlantasBuscador> buscarPlantasF(String word) {
        Connection conn = Menu_Principal.conn;
        ArrayList<PlantasBuscador> plantasF = new ArrayList<>();
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
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' \n"
                + "ORDER BY est ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_PlantazF);
            while (rs.next()) {
                PlantasBuscador planta = new PlantasBuscador();
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
    
    public static ArrayList<MotoBuscador> buscarMotogens(String word) {
        Connection conn = Menu_Principal.conn;
        ArrayList<MotoBuscador> motogens = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;

        String q_PlantazF = "SELECT\n"
                + "	mg_motogenerador.id_mg AS idMoto,\n"
                + "	est_estacion.nombre_estacion AS est,\n"
                + "	mg_motogenerador.num_serie AS numS,\n"
                + "	mg_motogenerador.capacidad AS capacidad,\n"
                + "	mg_motogenerador.descripcion AS des,\n"
                + "	mg_marca_mg.nombre_marca AS marca,\n"
                + "	mg_modelo_mg.nombre_modelo AS modelo\n"
                + "FROM\n"
                + "	mg_motogenerador\n"
                + "INNER JOIN mg_modelo_mg ON mg_motogenerador.id_modelo = mg_modelo_mg.id_mg_modelo\n"
                + "INNER JOIN mg_marca_mg ON mg_motogenerador.id_marca = mg_marca_mg.id_mg_marca\n"
                + "INNER JOIN est_estacion ON mg_motogenerador.id_estacion = est_estacion.id_estacion\n"
                + "WHERE\n"
                + "	est_estacion.nombre_estacion LIKE '%" + word + "%' \n"
                + "ORDER BY est ";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(q_PlantazF);
            while (rs.next()) {
                MotoBuscador motogen = new MotoBuscador();
                motogen.setIdMtg(rs.getInt("idMoto"));
                motogen.setEst(rs.getString("est"));
                motogen.setNumS(rs.getString("numS"));
                motogen.setMarca(rs.getString("marca"));
                motogen.setModelo(rs.getString("modelo"));
                motogen.setCapacidad(rs.getInt("capacidad"));
                motogen.setDesc(rs.getString("des"));
                motogens.add(motogen);
            } // Fin de while
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la operación.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.err.println("Fallo SELECT Plantaz F: " + e.getClass().getName() + ": " + e.getMessage());
        } // Fin de catch
        return motogens;
    } // Fin del método obtener
    
    
} // Fin de la clase
