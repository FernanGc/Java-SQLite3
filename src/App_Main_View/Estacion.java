package App_Main_View;

import App_Controller.CentroT;
import static App_Controller.Controller_CentroT.obtenerCentros;
import static App_Controller.Controller_Estacion.deleteEstacion;
import static App_Controller.Controller_Estacion.insertEstacion;
import static App_Controller.Controller_Estacion.obtenerEstaciones;
import static App_Controller.Controller_Estacion.updateEstacion;
import static App_Controller.Controller_Responsable.obtenerResponsables;
import static App_Controller.Controller_Sector.obtenerSectores;
import static App_Controller.Controller_TipoEst.obtenerTipoEst;
import static App_Controller.Controller_Zona.obtenerZonas;
import App_Controller.Estacion_Est;
import App_Controller.Responsable;
import App_Controller.Sector;
import App_Controller.TipoEst;
import App_Controller.Zona;
import App_Internal_View.Est_Centro_Trabajo;
import App_Internal_View.Est_Responsable;
import App_Internal_View.Est_Sector;
import App_Internal_View.Est_Tipo_Estacon;
import App_Internal_View.Est_Zona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estacion extends javax.swing.JFrame {

    public Estacion() {
        initComponents();
        mostrarEstaciones();
        mostrarZonasCombo();
        mostrarSectorCombo();
        mostrarCentroCombo();
        mostrarTipoEstCombo();
        mostrarResponsablesCombo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_datosEstacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        est_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_Zona = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        combo_est_sector = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combo_est_centro = new javax.swing.JComboBox<>();
        Add_New_Zone = new javax.swing.JButton();
        Est_Sector = new javax.swing.JButton();
        Est_Cent_Trab = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        est_latitud = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        est_longitud = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        est_domicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Nuevo_Resp = new javax.swing.JButton();
        combo_est_resp = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        combo_est_tipo = new javax.swing.JComboBox<>();
        Tipo_Est = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        est_guardar = new javax.swing.JButton();
        est_editar = new javax.swing.JButton();
        est_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estacion de Microondas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jT_datosEstacion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_datosEstacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estación", "Zona", "Sector", "Centro de Trabajo", "Latitud", "Longitud", "Tipo", "Responsable", "Domicilio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_datosEstacion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_datosEstacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_datosEstacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_datosEstacion);
        jT_datosEstacion.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jT_datosEstacion.getColumnModel().getColumnCount() > 0) {
            jT_datosEstacion.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estación de Microondas");

        est_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        est_nombre.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 240));
        jLabel2.setText("Nombre Estacion:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 109, 240));
        jLabel3.setText("Zona:");

        combo_Zona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        combo_Zona.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 109, 240));
        jLabel4.setText("Sector:");

        combo_est_sector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        combo_est_sector.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 109, 240));
        jLabel5.setText("Centro de Trabajo");

        combo_est_centro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        combo_est_centro.setPreferredSize(new java.awt.Dimension(0, 30));

        Add_New_Zone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Add_New_Zone.setToolTipText("Nuevo Elemento");
        Add_New_Zone.setBorder(null);
        Add_New_Zone.setMaximumSize(new java.awt.Dimension(30, 30));
        Add_New_Zone.setMinimumSize(new java.awt.Dimension(30, 30));
        Add_New_Zone.setPreferredSize(new java.awt.Dimension(30, 30));
        Add_New_Zone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_New_ZoneActionPerformed(evt);
            }
        });

        Est_Sector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Est_Sector.setToolTipText("Nuevo Elemento");
        Est_Sector.setBorder(null);
        Est_Sector.setMaximumSize(new java.awt.Dimension(30, 30));
        Est_Sector.setMinimumSize(new java.awt.Dimension(30, 30));
        Est_Sector.setPreferredSize(new java.awt.Dimension(30, 30));
        Est_Sector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Est_SectorActionPerformed(evt);
            }
        });

        Est_Cent_Trab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Est_Cent_Trab.setToolTipText("Nuevo Elemento");
        Est_Cent_Trab.setBorder(null);
        Est_Cent_Trab.setMaximumSize(new java.awt.Dimension(30, 30));
        Est_Cent_Trab.setMinimumSize(new java.awt.Dimension(30, 30));
        Est_Cent_Trab.setPreferredSize(new java.awt.Dimension(30, 30));
        Est_Cent_Trab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Est_Cent_TrabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_Zona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_est_sector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(combo_est_centro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(est_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_New_Zone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Est_Sector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Est_Cent_Trab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(est_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_New_Zone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Est_Sector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_est_sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Est_Cent_Trab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_est_centro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 109, 240));
        jLabel6.setText("Latitud:");

        est_latitud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        est_latitud.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 109, 240));
        jLabel7.setText("Longitud");

        est_longitud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        est_longitud.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 109, 240));
        jLabel8.setText("Domicilio Conocido:");

        est_domicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        est_domicilio.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 109, 240));
        jLabel9.setText("Responsable:");

        Nuevo_Resp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Nuevo_Resp.setToolTipText("Nuevo Elemento");
        Nuevo_Resp.setBorder(null);
        Nuevo_Resp.setPreferredSize(new java.awt.Dimension(30, 30));
        Nuevo_Resp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_RespActionPerformed(evt);
            }
        });

        combo_est_resp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        combo_est_resp.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 109, 240));
        jLabel30.setText("Tipo de Estacion");

        combo_est_tipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        combo_est_tipo.setPreferredSize(new java.awt.Dimension(0, 30));

        Tipo_Est.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Tipo_Est.setToolTipText("Nuevo Elemento");
        Tipo_Est.setBorder(null);
        Tipo_Est.setPreferredSize(new java.awt.Dimension(30, 30));
        Tipo_Est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_EstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(est_domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(est_latitud, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(est_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_est_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_est_resp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tipo_Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nuevo_Resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(115, 115, 115))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(est_latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(est_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(est_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_est_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo_Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_est_resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuevo_Resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        est_guardar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        est_guardar.setText("Guardar");
        est_guardar.setBorder(null);
        est_guardar.setPreferredSize(new java.awt.Dimension(75, 30));
        est_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                est_guardarActionPerformed(evt);
            }
        });

        est_editar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        est_editar.setText("Actualizar");
        est_editar.setBorder(null);
        est_editar.setPreferredSize(new java.awt.Dimension(75, 30));
        est_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                est_editarActionPerformed(evt);
            }
        });

        est_borrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        est_borrar.setText("Eliminar");
        est_borrar.setBorder(null);
        est_borrar.setPreferredSize(new java.awt.Dimension(75, 30));
        est_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                est_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(est_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(est_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(est_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(est_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(est_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(est_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_New_ZoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_New_ZoneActionPerformed
        dispose();
        Est_Zona estZone = new Est_Zona();
        estZone.setVisible(true);
        estZone.setResizable(false);
        estZone.setLocationRelativeTo(null);
    }//GEN-LAST:event_Add_New_ZoneActionPerformed

    private void Est_SectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Est_SectorActionPerformed
        dispose();
        Est_Sector estSector = new Est_Sector();
        estSector.setVisible(true);
        estSector.setResizable(false);
        estSector.setLocationRelativeTo(null);
    }//GEN-LAST:event_Est_SectorActionPerformed

    private void Est_Cent_TrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Est_Cent_TrabActionPerformed
        dispose();
        Est_Centro_Trabajo EstCT = new  Est_Centro_Trabajo();
        EstCT.setVisible(true);
        EstCT.setResizable(false);
        EstCT.setLocationRelativeTo(null);
    }//GEN-LAST:event_Est_Cent_TrabActionPerformed

    private void Nuevo_RespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_RespActionPerformed
        dispose();
        Est_Responsable NewResp = new Est_Responsable();
        NewResp.setVisible(true);
        NewResp.setResizable(false);
        NewResp.setLocationRelativeTo(null);
    }//GEN-LAST:event_Nuevo_RespActionPerformed

    private void Tipo_EstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_EstActionPerformed
        dispose();
        Est_Tipo_Estacon TipoEst = new Est_Tipo_Estacon();
        TipoEst.setVisible(true);
        TipoEst.setResizable(false);
        TipoEst.setLocationRelativeTo(null);
    }//GEN-LAST:event_Tipo_EstActionPerformed

    private void est_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_est_guardarActionPerformed
        String est = est_nombre.getText();
        String lat = est_latitud.getText();
        String lon = est_longitud.getText();
        String dom = est_domicilio.getText();
       
        if(est.isEmpty() || lat.isEmpty() || lon.isEmpty() || dom.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios", "Información", JOptionPane.ERROR_MESSAGE);
        } else {

            ArrayList<Zona> data1 = obtenerZonas();
            ArrayList<Sector> data2 = obtenerSectores();
            ArrayList<CentroT> data3 = obtenerCentros();
            ArrayList<TipoEst> data4 = obtenerTipoEst();
            ArrayList<Responsable> data5 = obtenerResponsables();
            
            int idZona = data1.get(combo_Zona.getSelectedIndex()).getIdZona();
            int idSector = data2.get(combo_est_sector.getSelectedIndex()).getId_sector();
            int idCentro = data3.get(combo_est_centro.getSelectedIndex()).getId_cent();
            int idTipoEst = data4.get(combo_est_tipo.getSelectedIndex()).getId_tipo_est();
            int idRespo = data5.get(combo_est_resp.getSelectedIndex()).getId_resp();

            insertEstacion(est, lat, lon, dom, idZona, idSector, idCentro,idRespo,idTipoEst);
            
            est_nombre.setText("");
            est_latitud.setText("");
            est_longitud.setText("");
            est_domicilio.setText("");
            mostrarEstaciones();
        }
    }//GEN-LAST:event_est_guardarActionPerformed

    private void jT_datosEstacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_datosEstacionMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jT_datosEstacion.getSelectedRow();


            est_nombre.setText(jT_datosEstacion.getModel().getValueAt(row, 0).toString());
            combo_Zona.setSelectedItem(jT_datosEstacion.getModel().getValueAt(row, 1));
            combo_est_sector.setSelectedItem(jT_datosEstacion.getModel().getValueAt(row, 2));
            combo_est_centro.setSelectedItem(jT_datosEstacion.getModel().getValueAt(row, 3));
            est_latitud.setText(jT_datosEstacion.getModel().getValueAt(row, 4).toString());
            est_longitud.setText(jT_datosEstacion.getModel().getValueAt(row, 5).toString());
            combo_est_tipo.setSelectedItem(jT_datosEstacion.getModel().getValueAt(row, 6));
            combo_est_resp.setSelectedItem(jT_datosEstacion.getModel().getValueAt(row, 7));
            est_domicilio.setText(jT_datosEstacion.getModel().getValueAt(row, 8).toString());  
            est_guardar.setEnabled(false);
            est_editar.setEnabled(true);
        } else {
            est_guardar.setEnabled(true);
            est_editar.setEnabled(false);
            est_nombre.setText("");
            est_latitud.setText("");
            est_longitud.setText("");
            est_domicilio.setText("");
        }
    }//GEN-LAST:event_jT_datosEstacionMouseClicked

    private void est_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_est_editarActionPerformed
        int row = jT_datosEstacion.getSelectedRow();
        
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        ArrayList<Zona> data1 = obtenerZonas();
        ArrayList<Sector> data2 = obtenerSectores();
        ArrayList<CentroT> data3 = obtenerCentros();
        ArrayList<TipoEst> data4 = obtenerTipoEst();
        ArrayList<Responsable> data5 = obtenerResponsables();

        String est = est_nombre.getText();
        String lat = est_latitud.getText();
        String lon = est_longitud.getText();
        String dom = est_domicilio.getText();
        
        if (jT_datosEstacion.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            int idZona = data1.get(combo_Zona.getSelectedIndex()).getIdZona();
            int idSector = data2.get(combo_est_sector.getSelectedIndex()).getId_sector();
            int idCentro = data3.get(combo_est_centro.getSelectedIndex()).getId_cent();
            int idTipoEst = data4.get(combo_est_tipo.getSelectedIndex()).getId_tipo_est();
            int idRespo = data5.get(combo_est_resp.getSelectedIndex()).getId_resp();
            int id_Est = data.get(row).getId_est();        
            
            updateEstacion(id_Est,est, lat, lon, dom, idZona, idSector, idCentro,idRespo,idTipoEst);
        
            est_nombre.setText("");
            est_latitud.setText("");
            est_longitud.setText("");
            est_domicilio.setText("");
            
            mostrarEstaciones();
            est_guardar.setEnabled(true);
        }

    }//GEN-LAST:event_est_editarActionPerformed

    private void est_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_est_borrarActionPerformed
         ArrayList<Estacion_Est> data = obtenerEstaciones();
        int row = jT_datosEstacion.getSelectedRow();

        if (jT_datosEstacion.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de seas eliminar este registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                int idEst = data.get(row).getId_est();
                deleteEstacion(idEst);
                mostrarEstaciones();
                est_nombre.setText("");
                est_latitud.setText("");
                est_longitud.setText("");
                est_domicilio.setText("");
                est_guardar.setEnabled(true);
                        
            } // Fin Joption
        } // Fin de else
        
    }//GEN-LAST:event_est_borrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        Registro_Elementos regElementos = new Registro_Elementos();
        regElementos.setResizable(false);
        regElementos.setVisible(true);
        regElementos.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing
    
    public void mostrarEstaciones(){
        DefaultTableModel tEstacion = (DefaultTableModel) jT_datosEstacion.getModel();
        tEstacion.setRowCount(0);
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        Object[] row = new Object[12];
        int longitud = data.size();

        if (longitud == 0) {
            tEstacion.setRowCount(0);
//            tEstacion.addRow(new Object[]{"Sin Informacion", "Sin Informacion", "Sin Informacion", "Sin Informacion", "Sin Informacion",
//                "Sin Informacion", "Sin Informacion", "Sin Informacion", "Sin Informacion"});
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getEst_nombre();
                row[1] = data.get(i).getZona();
                row[2] = data.get(i).getSector();
                row[3] = data.get(i).getCentro();
                row[4] = data.get(i).getLatitud();
                row[5] = data.get(i).getLongitud();
                row[6] = data.get(i).getEst_tipo();
                row[7] = data.get(i).getNombre() + " " + data.get(i).getAp_Paterno() + " " + data.get(i).getAp_Materno();
                row[8] = data.get(i).getDom_con();
                tEstacion.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_datosEstacion.setModel(tEstacion);
    } // Fin de mostrar estaciones

    public void mostrarZonasCombo(){
         ArrayList<Zona> data = obtenerZonas();
         int longitud = data.size();
         
         for (int i = 0; i < longitud; i++) {
             combo_Zona.addItem(data.get(i).getNombreZona());
         }
     } // Fin del metodo
    
    public void mostrarSectorCombo() {
        ArrayList<Sector> data = obtenerSectores();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            combo_est_sector.addItem(data.get(i).getnSector());
        }
    } // Fin del metodo
     
    public void mostrarCentroCombo() {
        ArrayList<CentroT> data = obtenerCentros();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            combo_est_centro.addItem(data.get(i).getnCentro());
        }
    } // Fin del metodo
    
    public void mostrarTipoEstCombo() {
        ArrayList<TipoEst> data = obtenerTipoEst();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            combo_est_tipo.addItem(data.get(i).getnTipo_est());
        }
    } // Fin del metodo
    
    public void mostrarResponsablesCombo(){
        ArrayList<Responsable> data = obtenerResponsables();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            combo_est_resp.addItem(data.get(i).getNombre() + " " + data.get(i).getaPaterno() + " " + data.get(i).getaMaterno());
        }
    } // Fin del metodo
    

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
            java.util.logging.Logger.getLogger(Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_New_Zone;
    private javax.swing.JButton Est_Cent_Trab;
    private javax.swing.JButton Est_Sector;
    private javax.swing.JButton Nuevo_Resp;
    private javax.swing.JButton Tipo_Est;
    private javax.swing.JComboBox combo_Zona;
    private javax.swing.JComboBox<String> combo_est_centro;
    private javax.swing.JComboBox<String> combo_est_resp;
    private javax.swing.JComboBox<String> combo_est_sector;
    private javax.swing.JComboBox<String> combo_est_tipo;
    private javax.swing.JButton est_borrar;
    private javax.swing.JTextField est_domicilio;
    private javax.swing.JButton est_editar;
    private javax.swing.JButton est_guardar;
    private javax.swing.JTextField est_latitud;
    private javax.swing.JTextField est_longitud;
    private javax.swing.JTextField est_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_datosEstacion;
    // End of variables declaration//GEN-END:variables
}
