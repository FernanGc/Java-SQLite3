package App_Controller;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controller_Buscador {
    
    public Controller_Buscador(){
    }
    
    public static String[] BuscaEstacion(String word) {
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        String[] name = null;
        String querry
                = "SELECT\n"
                + "est_estacion.nombre_estacion AS est_estacion,\n"
                + "est_zona.descripcion AS est_zona,\n"
                + "est_sector.nombre_sector AS est_sector,\n"
                + "est_centro_trabajo.nombre_centro_t AS est_centro,\n"
                + "est_ubicacion.latitud AS est_latitud,\n"
                + "est_ubicacion.longitud AS est_longitud,\n"
                + "est_ubicacion.dom_conocido AS est_domicilio,\n"
                + "est_tipo.tipo_estacion AS est_tipo,\n"
                + "est_responsable.nombre AS resp_nombre,\n"
                + "est_responsable.ap_paterno AS resp_paterno,\n"
                + "est_responsable.ap_materno AS resp_materno,\n"
                + "est_responsable.telefono AS resp_telefono,\n"
                + "est_responsable.celular AS resp_celular,\n"
                + "est_responsable.directo AS resp_directo,\n"
                + "est_responsable.extencion AS resp_extencion,\n"
                + "est_responsable.email AS resp_email,\n"
                + "rad_marca_radio.marca AS rad_marca,\n"
                + "rad_modelo_radio.modelo AS rad_modelo,\n"
                + "rad_network.ip_radio AS rad_ip,\n"
                + "rad_network.bandwidth AS rad_band,\n"
                + "rad_network.formato_BW AS rad_formato,\n"
                + "rad_network.tipo AS rad_tipo,\n"
                + "rad_network.configuracion AS rad_config,\n"
                + "rad_gestor_radio.nombre_gestor AS rad_gestor,\n"
                + "ant_marca_antena.marca_ant AS ant_marca,\n"
                + "ant_modelo_antena.modelo_ant AS ant_modelo,\n"
                + "ant_antena.diametro AS ant_diametro,\n"
                + "tor_tipo_torre.tipo AS tor_tipo,\n"
                + "tor_torre.altura AS tor_altura,\n"
                + "tor_torre_estado.tipo_estado AS tor_estado,\n"
                + "tor_torre_ubicacion.tipo_u AS tor_ubicacion,\n"
                + "line_tipo_lineaTX.tipo_linea AS linea_tipo,\n"
                + "line_linea.longitd AS linea_longitud,\n"
                + "pfz_planta_fuerza.num_serie AS pfz_Serie,\n"
                + "pfz_marca_planta_fuerza.nombre_marca AS pfz_marca,\n"
                + "pfz_modelo_planta_fuerza.nombre_modelo AS pfz_modelo,\n"
                + "pfz_planta_fuerza.capacidad AS pfz_capacidad,\n"
                + "pfz_planta_fuerza.descripcion AS pfz_desc,\n"
                + "mg_motogenerador.num_serie AS moto_Serie,\n"
                + "mg_marca_mg.nombre_marca AS moto_marca,\n"
                + "mg_modelo_mg.nombre_modelo AS moto_modelo,\n"
                + "mg_motogenerador.capacidad AS moto_capacidad,\n"
                + "mg_motogenerador.descripcion AS moto_desc\n"
                + "FROM red_mo_buscador\n"
                + "INNER JOIN est_estacion ON red_mo_buscador.id_estacion = est_estacion.id_estacion\n"
                + "INNER JOIN est_zona ON est_estacion.id_zona = est_zona.id_zona\n"
                + "INNER JOIN est_sector ON est_estacion.id_sector = est_sector.id_sector\n"
                + "INNER JOIN est_centro_trabajo ON est_estacion.id_centro_trabajo = est_centro_trabajo.id_centro_t\n"
                + "INNER JOIN est_ubicacion ON est_estacion.id_ubicacion = est_ubicacion.id_ubicacion\n"
                + "INNER JOIN est_tipo ON est_estacion.id_tipo_est = est_tipo.id_tipo_est\n"
                + "INNER JOIN est_responsable ON est_estacion.id_responsable = est_responsable.id_responsable\n"
                + "INNER JOIN rad_radio ON red_mo_buscador.id_radio = rad_radio.id_radio\n"
                + "INNER JOIN rad_marca_radio ON rad_radio.id_marca = rad_marca_radio.id_marca\n"
                + "INNER JOIN rad_modelo_radio ON rad_radio.id_modelo = rad_modelo_radio.id_mod_radio\n"
                + "INNER JOIN rad_network ON rad_radio.id_network = rad_network.id_network\n"
                + "INNER JOIN rad_gestor_radio ON rad_radio.id_gestor = rad_gestor_radio.id_gestor\n"
                + "INNER JOIN ant_antena ON red_mo_buscador.id_antena = ant_antena.id_antena\n"
                + "INNER JOIN ant_marca_antena ON ant_antena.id_marca_ant = ant_marca_antena.id_marca_ant\n"
                + "INNER JOIN ant_modelo_antena ON ant_antena.id_modelo_ant = ant_modelo_antena.id_mod_ant\n"
                + "INNER JOIN tor_torre ON red_mo_buscador.id_torre = tor_torre.id_torre\n"
                + "INNER JOIN tor_tipo_torre ON tor_torre.id_tipo_torre = tor_tipo_torre.id_tipo_torre\n"
                + "INNER JOIN tor_torre_estado ON tor_torre.id_estado = tor_torre_estado.id_estado\n"
                + "INNER JOIN tor_torre_ubicacion ON tor_torre.id_tipo_ubica = tor_torre_ubicacion.id_ubica\n"
                + "INNER JOIN line_linea ON red_mo_buscador.id_linea = line_linea.id_linea_tx\n"
                + "INNER JOIN line_tipo_lineaTX ON line_linea.id_tipo_linea = line_tipo_lineaTX.id_tipo_linea\n"
                + "INNER JOIN pfz_planta_fuerza ON red_mo_buscador.id_planta_fza = pfz_planta_fuerza.id_planta_fuerza\n"
                + "INNER JOIN pfz_modelo_planta_fuerza ON pfz_planta_fuerza.id_modelo = pfz_modelo_planta_fuerza.id_planta_modelo\n"
                + "INNER JOIN pfz_marca_planta_fuerza ON pfz_planta_fuerza.id_marca = pfz_marca_planta_fuerza.id_planta_marca\n"
                + "INNER JOIN mg_motogenerador ON red_mo_buscador.id_motogenerador = mg_motogenerador.id_mg\n"
                + "INNER JOIN mg_marca_mg ON mg_motogenerador.id_marca = mg_marca_mg.id_mg_marca\n"
                + "INNER JOIN mg_modelo_mg ON mg_motogenerador.id_modelo = mg_modelo_mg.id_mg_modelo\n"
                + "WHERE nombre_estacion LIKE '%" + word + "%' LIMIT 1";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(querry);
            while (rs.next()) {
                name = new String[43];
                name[0] = rs.getString("est_estacion");
                name[1] = rs.getString("est_zona");
                name[2] = rs.getString("est_sector");
                name[3] = rs.getString("est_centro");
                name[4] = rs.getString("est_tipo");
                name[5] = rs.getString("est_latitud");
                name[6] = rs.getString("est_longitud");
                name[7] = rs.getString("est_domicilio");

                name[8] = rs.getString("resp_nombre");
                name[9] = rs.getString("resp_paterno");
                name[10] = rs.getString("resp_materno");
                name[11] = rs.getString("resp_telefono");
                name[12] = rs.getString("resp_celular");
                name[13] = rs.getString("resp_directo");
                name[14] = rs.getString("resp_extencion");
                name[15] = rs.getString("resp_email");

                name[16] = rs.getString("rad_marca");
                name[17] = rs.getString("rad_modelo");
                name[18] = rs.getString("rad_ip");
                name[19] = rs.getString("rad_band");
                name[20] = rs.getString("rad_formato");
                name[21] = rs.getString("rad_tipo");
                name[22] = rs.getString("rad_config");
                name[23] = rs.getString("rad_gestor");

                name[24] = rs.getString("ant_marca");
                name[25] = rs.getString("ant_modelo");
                name[26] = rs.getString("ant_diametro");

                name[27] = rs.getString("linea_tipo");
                name[28] = rs.getString("linea_longitud");

                name[29] = rs.getString("tor_tipo");
                name[30] = rs.getString("tor_altura");
                name[31] = rs.getString("tor_estado");
                name[32] = rs.getString("tor_ubicacion");
                
                name[33] = rs.getString("pfz_Serie");
                name[34] = rs.getString("pfz_marca");
                name[35] = rs.getString("pfz_modelo");
                name[36] = rs.getString("pfz_capacidad");
                name[37] = rs.getString("pfz_desc");
                
                name[38] = rs.getString("moto_Serie");
                name[39] = rs.getString("moto_marca");
                name[40] = rs.getString("moto_modelo");
                name[41] = rs.getString("moto_capacidad");
                name[42] = rs.getString("moto_desc");
                return name;
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println("Error en la clase Controller_Buscador");
//            System.exit(0);
        } // Fin de Try Catch
        return name;
    } // Fin del Método

    public static String[] est_Direcciones(String word) {
        Connection conn = Menu_Principal.conn;
        Statement stmt = null;
        ResultSet rs = null;
        
        Statement stmt2 = null;
        ResultSet rs2 = null;
        
        String direccion = null;
        String[] direcciones = null;
        int cont = 0;
        int arraySize = 0;

        String querry =
                "SELECT\n"
                    + "est_estacion.nombre_estacion AS est_estacion,\n"
                    + "est_direccion.direccion AS est_direccion\n" +
                "FROM est_direccion\n"
              + "INNER JOIN est_estacion ON est_direccion.estacion = est_estacion.id_estacion\n" +
                "WHERE est_estacion LIKE '%" + word + "%'";
        String numRows =
                "SELECT\n"
                    + "Count(est_direccion.direccion) AS numRows\n"
                + "FROM est_direccion\n"
                + "INNER JOIN est_estacion ON est_direccion.estacion = est_estacion.id_estacion\n"
                + "WHERE nombre_estacion LIKE '%" + word + "%'";
        
        try {
            
            stmt2 = conn.createStatement();
            rs2 = stmt2.executeQuery(numRows);
           
            stmt = conn.createStatement();
            rs = stmt.executeQuery(querry);
            
            arraySize = rs2.getInt("numRows");

            direcciones=new String[arraySize];
            while (rs.next()) {
                direcciones[cont] = rs.getString("est_direccion");
                cont++;
            }
            rs.close();
            stmt.close();
            rs2.close();
            stmt2.close();
            conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
        } // Fin de Try Catch
        return direcciones;
    } // Fin del método

    public void elimina_Estacion(String word) throws SQLException{
        Connection conn = Menu_Principal.conn;
        Statement stmt = conn.createStatement();
        
        String q_delete = 
                  "DELETE\n"
                + "FROM\n"
                + "	red_mo_buscador\n"
                + "WHERE\n"
                + "	red_mo_buscador.id_buscador IN (\n"
                + "		SELECT\n"
                + "			red_mo_buscador.id_buscador AS id_buscador\n"
                + "		FROM\n"
                + "			est_estacion\n"
                + "		INNER JOIN red_mo_buscador ON red_mo_buscador.id_estacion = est_estacion.id_estacion\n"
                + "		WHERE\n"
                + "			est_estacion.nombre_estacion LIKE '%" + word + "%'\n"
                + "	);";
        try {
            stmt.executeUpdate(q_delete);
            conn.commit();
            stmt.close();
            JOptionPane.showMessageDialog(null, "La estacion: " + word + " se elimino correctamente",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No existe informaciòn para eliminar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    } // Fin del metodo
} // Fin de la clase


