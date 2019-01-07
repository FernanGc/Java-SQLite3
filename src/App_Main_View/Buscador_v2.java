
package App_Main_View;
 
import App_Buscador.AntenaBuscador;
import static App_Buscador.Controller_Search_v2.buscarAtenas;
import static App_Buscador.Controller_Search_v2.buscarEstacion;
import static App_Buscador.Controller_Search_v2.buscarLineas;
import static App_Buscador.Controller_Search_v2.buscarMotogens;
import static App_Buscador.Controller_Search_v2.buscarPlantasF;
import static App_Buscador.Controller_Search_v2.buscarRadios;
import static App_Buscador.Controller_Search_v2.buscarTorre;
import App_Buscador.LineasBuscador;
import App_Buscador.MotoBuscador;
import App_Buscador.PlantasBuscador;
import App_Buscador.RadioBuscador;
import App_Buscador.Reporte;


import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Buscador_v2 extends javax.swing.JFrame {

    public Buscador_v2() {
        initComponents();
        jB_Export.setVisible(false);
        jB_Delete.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jText_Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jB_Go = new javax.swing.JButton();
        jB_Export = new javax.swing.JButton();
        jB_Delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_Long = new javax.swing.JLabel();
        jLabel_Est_Lat = new javax.swing.JLabel();
        jLabel_Est_CT = new javax.swing.JLabel();
        jLabel_Est_Sector = new javax.swing.JLabel();
        jLabel_Est_Zona = new javax.swing.JLabel();
        jLabel_n1 = new javax.swing.JLabel();
        jLabel_EstTipo = new javax.swing.JLabel();
        jLabel_Es_Responsable = new javax.swing.JLabel();
        jL_a = new javax.swing.JLabel();
        jLabel_Est_Extencion = new javax.swing.JLabel();
        jLabel_Est_Lat1 = new javax.swing.JLabel();
        jLabel_b = new javax.swing.JLabel();
        jL_a1 = new javax.swing.JLabel();
        jLabel_Est_Extencion1 = new javax.swing.JLabel();
        est_zona = new javax.swing.JTextField();
        est_nombre = new javax.swing.JTextField();
        est_tipo = new javax.swing.JTextField();
        est_longitud = new javax.swing.JTextField();
        est_latitud = new javax.swing.JTextField();
        est_domicilio = new javax.swing.JTextField();
        resp_nombre = new javax.swing.JTextField();
        resp_directo = new javax.swing.JTextField();
        resp_celular = new javax.swing.JTextField();
        est_centroT = new javax.swing.JTextField();
        est_sector = new javax.swing.JTextField();
        resp_email = new javax.swing.JTextField();
        resp_extencion = new javax.swing.JTextField();
        resp_telefono = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        torre_altura = new javax.swing.JTextField();
        torre_tipo = new javax.swing.JTextField();
        torre_estado = new javax.swing.JTextField();
        torre_ubicacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_Radios = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable_Antenas = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable_Lineas = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jT_PlantasPfz = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jT_MotoGens = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Buscador");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscador de Estaciones");

        jText_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_Search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jText_Search.setPreferredSize(new java.awt.Dimension(60, 30));
        jText_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_SearchKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 240));
        jLabel2.setText("Nombre de la Estación de Microondas:");

        jB_Go.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB_Go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/006-searcher.png"))); // NOI18N
        jB_Go.setText("Buscar");
        jB_Go.setToolTipText("");
        jB_Go.setBorder(null);
        jB_Go.setFocusable(false);
        jB_Go.setPreferredSize(new java.awt.Dimension(90, 30));
        jB_Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GoActionPerformed(evt);
            }
        });

        jB_Export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-download-button.png"))); // NOI18N
        jB_Export.setToolTipText("Descargar");
        jB_Export.setBorder(null);
        jB_Export.setFocusable(false);
        jB_Export.setPreferredSize(new java.awt.Dimension(30, 30));
        jB_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ExportActionPerformed(evt);
            }
        });

        jB_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-delete.png"))); // NOI18N
        jB_Delete.setToolTipText("Eliminar");
        jB_Delete.setBorder(null);
        jB_Delete.setFocusable(false);
        jB_Delete.setPreferredSize(new java.awt.Dimension(30, 30));
        jB_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_Go, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Export, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jB_Export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jText_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jB_Go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de la Estación:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 109, 240))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 230));

        jLabel_Long.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Long.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Long.setText("Longitud:");

        jLabel_Est_Lat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_Lat.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_Lat.setText("Latitud:");

        jLabel_Est_CT.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_CT.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_CT.setText("Centro de Trabajo:");

        jLabel_Est_Sector.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_Sector.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_Sector.setText("Sector:");

        jLabel_Est_Zona.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_Zona.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_Zona.setText("Zona:");
        jLabel_Est_Zona.setPreferredSize(new java.awt.Dimension(0, 16));

        jLabel_n1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_n1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_n1.setText("Nombre:");
        jLabel_n1.setPreferredSize(new java.awt.Dimension(0, 16));

        jLabel_EstTipo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_EstTipo.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_EstTipo.setText("Tipo:");
        jLabel_EstTipo.setPreferredSize(new java.awt.Dimension(0, 16));

        jLabel_Es_Responsable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Es_Responsable.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Es_Responsable.setText("Responsable:");

        jL_a.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_a.setForeground(new java.awt.Color(0, 109, 240));
        jL_a.setText("Directo:");

        jLabel_Est_Extencion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_Extencion.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_Extencion.setText("Telefono:");

        jLabel_Est_Lat1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_Lat1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_Lat1.setText("Domicilio:");

        jLabel_b.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_b.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_b.setText("Email:");

        jL_a1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_a1.setForeground(new java.awt.Color(0, 109, 240));
        jL_a1.setText("Celular:");

        jLabel_Est_Extencion1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel_Est_Extencion1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel_Est_Extencion1.setText("Extención:");

        est_zona.setEditable(false);
        est_zona.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_zona.setBorder(null);
        est_zona.setPreferredSize(new java.awt.Dimension(190, 16));

        est_nombre.setEditable(false);
        est_nombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_nombre.setBorder(null);
        est_nombre.setPreferredSize(new java.awt.Dimension(190, 16));

        est_tipo.setEditable(false);
        est_tipo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_tipo.setBorder(null);
        est_tipo.setPreferredSize(new java.awt.Dimension(190, 16));

        est_longitud.setEditable(false);
        est_longitud.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_longitud.setBorder(null);
        est_longitud.setPreferredSize(new java.awt.Dimension(190, 16));

        est_latitud.setEditable(false);
        est_latitud.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_latitud.setBorder(null);
        est_latitud.setPreferredSize(new java.awt.Dimension(190, 16));

        est_domicilio.setEditable(false);
        est_domicilio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_domicilio.setBorder(null);
        est_domicilio.setPreferredSize(new java.awt.Dimension(544, 16));

        resp_nombre.setEditable(false);
        resp_nombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        resp_nombre.setBorder(null);
        resp_nombre.setPreferredSize(new java.awt.Dimension(163, 16));

        resp_directo.setEditable(false);
        resp_directo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        resp_directo.setBorder(null);
        resp_directo.setPreferredSize(new java.awt.Dimension(163, 16));

        resp_celular.setEditable(false);
        resp_celular.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        resp_celular.setBorder(null);
        resp_celular.setPreferredSize(new java.awt.Dimension(163, 16));

        est_centroT.setEditable(false);
        est_centroT.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_centroT.setBorder(null);
        est_centroT.setPreferredSize(new java.awt.Dimension(217, 16));

        est_sector.setEditable(false);
        est_sector.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        est_sector.setBorder(null);
        est_sector.setPreferredSize(new java.awt.Dimension(217, 16));

        resp_email.setEditable(false);
        resp_email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        resp_email.setBorder(null);
        resp_email.setPreferredSize(new java.awt.Dimension(273, 16));

        resp_extencion.setEditable(false);
        resp_extencion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        resp_extencion.setBorder(null);
        resp_extencion.setPreferredSize(new java.awt.Dimension(273, 16));

        resp_telefono.setEditable(false);
        resp_telefono.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        resp_telefono.setBorder(null);
        resp_telefono.setPreferredSize(new java.awt.Dimension(273, 16));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_Est_Zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_EstTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Est_Lat1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jLabel_n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(est_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(est_zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(est_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Est_Sector, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Est_CT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(est_centroT, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(est_sector, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel_Est_Lat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_Long, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(est_longitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(est_latitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(est_domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jL_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Es_Responsable, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resp_directo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(resp_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Est_Extencion1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel_Est_Extencion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resp_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(resp_extencion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_a1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resp_celular, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(resp_email, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(est_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Est_Sector)
                            .addComponent(est_sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_Est_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(est_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_Est_CT)
                                .addComponent(est_centroT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Est_Lat)
                            .addComponent(est_latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Long)
                            .addComponent(est_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_EstTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(est_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Est_Lat1)
                    .addComponent(est_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Es_Responsable)
                        .addComponent(resp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Est_Extencion1)
                        .addComponent(resp_extencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_a1)
                        .addComponent(resp_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_a)
                        .addComponent(resp_directo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_b)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Est_Extencion)
                        .addComponent(resp_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Torre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 109, 240))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 230));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 109, 240));
        jLabel22.setText("Tipo:");

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 109, 240));
        jLabel34.setText("Altura:");

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 109, 240));
        jLabel35.setText("Estado:");

        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 109, 240));
        jLabel46.setText("Ubicacion:");

        torre_altura.setEditable(false);
        torre_altura.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        torre_altura.setBorder(null);

        torre_tipo.setEditable(false);
        torre_tipo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        torre_tipo.setBorder(null);

        torre_estado.setEditable(false);
        torre_estado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        torre_estado.setBorder(null);

        torre_ubicacion.setEditable(false);
        torre_ubicacion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        torre_ubicacion.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(torre_ubicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(torre_tipo)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(torre_altura, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(torre_estado))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(torre_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(torre_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(torre_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(torre_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jT_Radios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_Radios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Dirección", "Marca", "Modelo", "Gestor", "IP", "Bandwitdh", "Formato", "Tipo", "Configuración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Radios.setToolTipText("");
        jT_Radios.setColumnSelectionAllowed(true);
        jT_Radios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jT_Radios);
        jT_Radios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jT_Radios.getColumnModel().getColumnCount() > 0) {
            jT_Radios.getColumnModel().getColumn(0).setResizable(false);
            jT_Radios.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jTable_Antenas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable_Antenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Radio", "Marca", "Modelo", "Diametro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Antenas.setToolTipText("");
        jTable_Antenas.setColumnSelectionAllowed(true);
        jTable_Antenas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(jTable_Antenas);
        jTable_Antenas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable_Antenas.getColumnModel().getColumnCount() > 0) {
            jTable_Antenas.getColumnModel().getColumn(0).setResizable(false);
            jTable_Antenas.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jTable_Lineas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable_Lineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Radio", "Tipo de Linea", "Longitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Lineas.setToolTipText("");
        jTable_Lineas.setColumnSelectionAllowed(true);
        jTable_Lineas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane10.setViewportView(jTable_Lineas);
        jTable_Lineas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable_Lineas.getColumnModel().getColumnCount() > 0) {
            jTable_Lineas.getColumnModel().getColumn(0).setResizable(false);
            jTable_Lineas.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jT_PlantasPfz.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_PlantasPfz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "No. Serie", "Marca", "Modelo", "Capacidad", "Descropción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_PlantasPfz.setToolTipText("Plantas de Fuerza en la Estación");
        jT_PlantasPfz.setColumnSelectionAllowed(true);
        jT_PlantasPfz.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane11.setViewportView(jT_PlantasPfz);
        jT_PlantasPfz.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jT_PlantasPfz.getColumnModel().getColumnCount() > 0) {
            jT_PlantasPfz.getColumnModel().getColumn(0).setResizable(false);
            jT_PlantasPfz.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jT_MotoGens.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_MotoGens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "No. Serie", "Marca", "Modelo", "Capacidad", "Descropción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_MotoGens.setToolTipText("Motogeneradores en la Estación");
        jT_MotoGens.setColumnSelectionAllowed(true);
        jT_MotoGens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane13.setViewportView(jT_MotoGens);
        jT_MotoGens.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jT_MotoGens.getColumnModel().getColumnCount() > 0) {
            jT_MotoGens.getColumnModel().getColumn(0).setResizable(false);
            jT_MotoGens.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 109, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lineas de Transmición");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 109, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Motogeneradores");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 109, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Antenas");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 109, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Radios en la Estación");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 109, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Plantas de Fuerza");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane13))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_SearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = jText_Search.getText();
            if (text.isEmpty()) {
                jB_Export.setVisible(false);
                jText_Search.setText("");
                JOptionPane.showMessageDialog(null, "La estacion no existe o el campo esta vacio.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                listarInforEst(text);
                listarRadios(text);
                listarAntenas(text);
                listarLineas(text);
                listarPlantasFuerza(text);
                listarMotoGens(text);
            }     
        }
    }//GEN-LAST:event_jText_SearchKeyPressed

    private void jB_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ExportActionPerformed
        String nombreEstaL = est_nombre.getText();

        if (nombreEstaL.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existe informaciòn para exportar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Reporte rep = new Reporte();
            rep.descargarEstacionBuscador(nombreEstaL);
        }// Fin de else
    }//GEN-LAST:event_jB_ExportActionPerformed

    private void jB_GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GoActionPerformed
        String text = jText_Search.getText();
        if(text.isEmpty()){
            jB_Export.setVisible(false);
            jText_Search.setText("");
            JOptionPane.showMessageDialog(null, "La estacion no existe o el campo esta vacio.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            listarInforEst(text);
            listarRadios(text);
            listarAntenas(text);
            listarLineas(text);
            listarPlantasFuerza(text);
            listarMotoGens(text);
        }
    }//GEN-LAST:event_jB_GoActionPerformed

    private void jB_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteActionPerformed

    }//GEN-LAST:event_jB_DeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        Menu_Principal mainMenu = new Menu_Principal();
        mainMenu.setResizable(false);
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing
    
    
    private void listarInforEst(String word){
        String queryData[] = buscarEstacion(word);
        if (queryData == null) {
            JOptionPane.showMessageDialog(null, "La estacion: " + word + " no existe.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
            limpirCamposTorre();
        } else {
            listarTorre(word);
            jB_Export.setVisible(true);            
            est_nombre.setText(queryData[0]);
            est_tipo.setText(queryData[1]);
            est_latitud.setText(queryData[2]);
            est_longitud.setText(queryData[3]);
            est_domicilio.setText(queryData[4]);
            est_zona.setText(queryData[5]);
            est_sector.setText(queryData[6]);
            est_centroT.setText(queryData[7]);
            resp_nombre.setText(queryData[8] + queryData[9] + queryData[10]);
            resp_telefono.setText(queryData[11]);
            resp_celular.setText(queryData[12]);
            resp_directo.setText(queryData[13]);
            resp_extencion.setText(queryData[14]);
            resp_email.setText(queryData[15]);
        }// Fin de else
    }
    
    private void listarTorre(String word) {
        String queryData[] = buscarTorre(word);
        if (queryData == null) {
            limpirCamposTorre();
        } else {
            torre_tipo.setText(queryData[1]);
            torre_altura.setText(queryData[2]);
            torre_estado.setText(queryData[3]);
            torre_ubicacion.setText(queryData[4]);
        }// Fin de else
    }

    public void limpiarCampos(){
        est_nombre.setText("");
        est_zona.setText("");
        est_sector.setText("");
        est_centroT.setText("");
        est_tipo.setText("");
        est_latitud.setText("");
        est_longitud.setText("");
        est_domicilio.setText("");

        resp_nombre.setText("");
        resp_telefono.setText("");
        resp_celular.setText("");
        resp_directo.setText("");
        resp_extencion.setText("");
        resp_email.setText("");
    }
    
    public void limpirCamposTorre(){
        torre_tipo.setText("");
        torre_altura.setText("");
        torre_estado.setText("");
        torre_ubicacion.setText("");
    }
    
    public void listarRadios(String word) {
        DefaultTableModel tRadiosR = (DefaultTableModel) jT_Radios.getModel();
        tRadiosR.setRowCount(0);
        ArrayList<RadioBuscador> data = buscarRadios(word);
        Object[] row = new Object[10];
        int longitud = data.size();

        if (longitud == 0) {
            tRadiosR.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = i + 1;
                row[1] = data.get(i).getDireccion();
                row[2] = data.get(i).getRadioMarca();
                row[3] = data.get(i).getRadioModelo();
                row[4] = data.get(i).getRadioGestor();
                row[5] = data.get(i).getRadioIP();
                row[6] = data.get(i).getBandwidth() + " Mbps ";
                row[7] = data.get(i).getFormato();
                row[8] = data.get(i).getRadioTipo();
                row[9] = data.get(i).getConfig();
                tRadiosR.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_Radios.setModel(tRadiosR);
    } // Fin de listarR
    
    public void listarAntenas(String word) {
        DefaultTableModel tAntenas = (DefaultTableModel) jTable_Antenas.getModel();
        tAntenas.setRowCount(0);
        ArrayList<AntenaBuscador> data = buscarAtenas(word);
        Object[] row = new Object[5];
        int longitud = data.size();

        if (longitud == 0) {
            tAntenas.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = i + 1;
                row[1] = data.get(i).getDir();
                row[2] = data.get(i).getMarca();
                row[3] = data.get(i).getModelo();
                row[4] = data.get(i).getDiamtro() + " m ";
                tAntenas.addRow(row);
            } // Fin de for
        } // Fin de else
        jTable_Antenas.setModel(tAntenas);
    } // Fin de listarR

    public void listarLineas(String word) {
        /* Para el Frame principal*/
        DefaultTableModel tLineas = (DefaultTableModel) jTable_Lineas.getModel();
        tLineas.setRowCount(0);
        ArrayList<LineasBuscador> data1 = buscarLineas(word);
        Object[] row = new Object[4];
        int longitud = data1.size();
        if (longitud == 0) {
            tLineas.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = i + 1;
                row[1] = data1.get(i).getDir();
                row[2] = data1.get(i).getTipoL();
                row[3] = data1.get(i).getLongi() + " m ";
                tLineas.addRow(row);
            } // Fin de for
        } // Fin de else
        jTable_Lineas.setModel(tLineas);
    } // Fin de listarR
    
    public void listarPlantasFuerza(String word) {
        DefaultTableModel tPlantasF = (DefaultTableModel) jT_PlantasPfz.getModel();
        tPlantasF.setRowCount(0);
        ArrayList<PlantasBuscador> data = buscarPlantasF(word);
        Object[] row = new Object[7];
        int longitud = data.size();

        if (longitud == 0) {
            tPlantasF.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = i + 1;
                row[1] = data.get(i).getNumS();
                row[2] = data.get(i).getMarca();
                row[3] = data.get(i).getModelo();
                row[4] = data.get(i).getCapacidad() + " A ";
                row[5] = data.get(i).getDesc();
                tPlantasF.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_PlantasPfz.setModel(tPlantasF);
    } // Fin de listarR
    
    public void listarMotoGens(String word) {
        DefaultTableModel tMotoGens = (DefaultTableModel) jT_MotoGens.getModel();
        tMotoGens.setRowCount(0);
        ArrayList<MotoBuscador> data = buscarMotogens(word);
        Object[] row = new Object[6];
        int longitud = data.size();

        if (longitud == 0) {
            tMotoGens.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = i + 1;
                row[1] = data.get(i).getNumS();
                row[2] = data.get(i).getMarca();
                row[3] = data.get(i).getModelo();
                row[4] = data.get(i).getCapacidad() + " KW";
                row[5] = data.get(i).getDesc();
                tMotoGens.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_MotoGens.setModel(tMotoGens);
    } // Fin de listarR

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscador_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField est_centroT;
    private javax.swing.JTextField est_domicilio;
    private javax.swing.JTextField est_latitud;
    private javax.swing.JTextField est_longitud;
    private javax.swing.JTextField est_nombre;
    private javax.swing.JTextField est_sector;
    private javax.swing.JTextField est_tipo;
    private javax.swing.JTextField est_zona;
    private javax.swing.JButton jB_Delete;
    private javax.swing.JButton jB_Export;
    private javax.swing.JButton jB_Go;
    private javax.swing.JLabel jL_a;
    private javax.swing.JLabel jL_a1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Es_Responsable;
    private javax.swing.JLabel jLabel_EstTipo;
    private javax.swing.JLabel jLabel_Est_CT;
    private javax.swing.JLabel jLabel_Est_Extencion;
    private javax.swing.JLabel jLabel_Est_Extencion1;
    private javax.swing.JLabel jLabel_Est_Lat;
    private javax.swing.JLabel jLabel_Est_Lat1;
    private javax.swing.JLabel jLabel_Est_Sector;
    private javax.swing.JLabel jLabel_Est_Zona;
    private javax.swing.JLabel jLabel_Long;
    private javax.swing.JLabel jLabel_b;
    private javax.swing.JLabel jLabel_n1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jT_MotoGens;
    private javax.swing.JTable jT_PlantasPfz;
    private javax.swing.JTable jT_Radios;
    private javax.swing.JTable jTable_Antenas;
    private javax.swing.JTable jTable_Lineas;
    private javax.swing.JTextField jText_Search;
    private javax.swing.JTextField resp_celular;
    private javax.swing.JTextField resp_directo;
    private javax.swing.JTextField resp_email;
    private javax.swing.JTextField resp_extencion;
    private javax.swing.JTextField resp_nombre;
    private javax.swing.JTextField resp_telefono;
    private javax.swing.JTextField torre_altura;
    private javax.swing.JTextField torre_estado;
    private javax.swing.JTextField torre_tipo;
    private javax.swing.JTextField torre_ubicacion;
    // End of variables declaration//GEN-END:variables
}
