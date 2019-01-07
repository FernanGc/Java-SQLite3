
package App_Main_View;

import static App_Controller.Controller_Estacion.obtenerEstaciones;
import static App_Controller.Controller_Gestores_Radio.obtenerGestoresR;
import static App_Controller.Controller_Marcas_Radio.obtenerMarcasR;
import static App_Controller.Controller_Modelos_Radio.obtenerModelosR;
import static App_Controller.Controller_Radio.deleteRadio;
import static App_Controller.Controller_Radio.insertRadio;
import static App_Controller.Controller_Radio.obtenerRadio;
import static App_Controller.Controller_Radio.updateRadioR;
import static App_Controller.Controller_TipoRadio.obtenerTiposR;
import App_Controller.Estacion_Est;
import App_Controller.GestoresRadio;
import App_Controller.MarcasRadio;
import App_Controller.ModelosRadio;
import App_Controller.RadioRad;
import App_Controller.TipoRadio;
import App_Internal_View.Radio_Gestor;
import App_Internal_View.Radio_Marca;
import App_Internal_View.Radio_Modelo;
import App_Internal_View.Radio_Tipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Radio extends javax.swing.JFrame {

    public Radio() {
        initComponents();
        listarRadios();
        mostrarMarcasCombo();
        mostrarModelosCombo();
        mostrarGestoresCombo();
        mostrarEstacionesCombo();
        mostrarDireccionesCombo();
        mostrarTipoRadiosCombo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Radios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jB_Guardar = new javax.swing.JButton();
        jB_Update = new javax.swing.JButton();
        jB_Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jText_IpRado = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSpinner_BandW = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jText_Formato = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jText_Config = new javax.swing.JTextField();
        jB_Tipo_Radio = new javax.swing.JButton();
        jCombo_Tipos = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jCombo_Marcas = new javax.swing.JComboBox<>();
        jB_Marca_Radio = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jCombo_Modelos = new javax.swing.JComboBox<>();
        jB_Modelo_Radio = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jCombo_Gestores = new javax.swing.JComboBox<>();
        jB_Gestor_Radio = new javax.swing.JButton();
        jComboEstacion = new javax.swing.JComboBox<>();
        jCombo_Direccion = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Radio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jT_Radios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_Radios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estación", "Dirección", "Marca", "Modelo", "Gestor", "IP", "Bandwitdh", "Formato", "Tipo", "Configuración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Radios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_Radios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_RadiosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Radios);
        jT_Radios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jB_Guardar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_Guardar.setText("Guardar");
        jB_Guardar.setBorder(null);
        jB_Guardar.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarActionPerformed(evt);
            }
        });

        jB_Update.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_Update.setText("Actualizar");
        jB_Update.setBorder(null);
        jB_Update.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_UpdateActionPerformed(evt);
            }
        });

        jB_Delete.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_Delete.setText("Eliminar");
        jB_Delete.setBorder(null);
        jB_Delete.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jB_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jB_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jB_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Radio");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 109, 240));
        jLabel21.setText("Radio IP");

        jText_IpRado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jText_IpRado.setPreferredSize(new java.awt.Dimension(56, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 109, 240));
        jLabel22.setText("Bandwidth");

        jSpinner_BandW.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 50));
        jSpinner_BandW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jSpinner_BandW.setPreferredSize(new java.awt.Dimension(56, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 109, 240));
        jLabel23.setText("Formato ");

        jText_Formato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jText_Formato.setPreferredSize(new java.awt.Dimension(56, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 109, 240));
        jLabel24.setText("Tipo");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 109, 240));
        jLabel25.setText("Configuración");

        jText_Config.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jText_Config.setPreferredSize(new java.awt.Dimension(6, 30));

        jB_Tipo_Radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        jB_Tipo_Radio.setToolTipText("Nuevo Elemento");
        jB_Tipo_Radio.setBorder(null);
        jB_Tipo_Radio.setPreferredSize(new java.awt.Dimension(30, 30));
        jB_Tipo_Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Tipo_RadioActionPerformed(evt);
            }
        });

        jCombo_Tipos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Tipos.setFocusable(false);
        jCombo_Tipos.setPreferredSize(new java.awt.Dimension(230, 30));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jSpinner_BandW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jText_IpRado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Formato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jCombo_Tipos, 0, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Tipo_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Config, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jText_IpRado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCombo_Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_Tipo_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_BandW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Config, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 109, 240));
        jLabel18.setText("Marca radio");

        jCombo_Marcas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Marcas.setFocusable(false);
        jCombo_Marcas.setPreferredSize(new java.awt.Dimension(56, 30));

        jB_Marca_Radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        jB_Marca_Radio.setToolTipText("Nuevo Elemento");
        jB_Marca_Radio.setBorder(null);
        jB_Marca_Radio.setPreferredSize(new java.awt.Dimension(30, 30));
        jB_Marca_Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Marca_RadioActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 109, 240));
        jLabel19.setText("Modelo radio");

        jCombo_Modelos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Modelos.setFocusable(false);
        jCombo_Modelos.setPreferredSize(new java.awt.Dimension(56, 30));

        jB_Modelo_Radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        jB_Modelo_Radio.setToolTipText("Nuevo Elemento");
        jB_Modelo_Radio.setBorder(null);
        jB_Modelo_Radio.setPreferredSize(new java.awt.Dimension(30, 30));
        jB_Modelo_Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Modelo_RadioActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 109, 240));
        jLabel20.setText("Gestor");

        jCombo_Gestores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Gestores.setFocusable(false);
        jCombo_Gestores.setPreferredSize(new java.awt.Dimension(56, 30));

        jB_Gestor_Radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        jB_Gestor_Radio.setToolTipText("Nuevo Elemento");
        jB_Gestor_Radio.setBorder(null);
        jB_Gestor_Radio.setPreferredSize(new java.awt.Dimension(30, 30));
        jB_Gestor_Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Gestor_RadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_Modelos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_Gestores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_Marcas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Marca_Radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Modelo_Radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Gestor_Radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_Marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Marca_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_Modelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Modelo_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_Gestores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Gestor_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jComboEstacion.setToolTipText("");
        jComboEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboEstacion.setFocusable(false);
        jComboEstacion.setPreferredSize(new java.awt.Dimension(230, 30));

        jCombo_Direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Direccion.setFocusable(false);
        jCombo_Direccion.setPreferredSize(new java.awt.Dimension(230, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 109, 240));
        jLabel27.setText("Estación:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 109, 240));
        jLabel28.setText("Dreccion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboEstacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_Direccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombo_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        String ip = jText_IpRado.getText();
        String formato = jText_Formato.getText();
        String config = jText_Config.getText();
        int bw = (Integer) jSpinner_BandW.getValue();
    
//        if (ip.isEmpty() || formato.isEmpty() || config.isEmpty() ) {
//            JOptionPane.showMessageDialog(this, "Existen campos vacios", "Información", JOptionPane.INFORMATION_MESSAGE);
//        } else {
            
            ArrayList<Estacion_Est> data1 = obtenerEstaciones();
            ArrayList<MarcasRadio> data2 = obtenerMarcasR();
            ArrayList<ModelosRadio> data3 = obtenerModelosR();
            ArrayList<GestoresRadio> data4 = obtenerGestoresR();
            ArrayList<TipoRadio> data5 = obtenerTiposR();
            
            int idEst = data1.get(jComboEstacion.getSelectedIndex()).getId_est();
            String dir = jCombo_Direccion.getSelectedItem().toString();
            int idMarca = data2.get(jCombo_Marcas.getSelectedIndex()).getId_marcaR();
            int idModelo = data3.get(jCombo_Modelos.getSelectedIndex()).getId_modelo();
            int idGestor = data4.get(jCombo_Gestores.getSelectedIndex()).getId_gestor();
            int idTipo = data5.get(jCombo_Tipos.getSelectedIndex()).getId_TipoR();
            if (ip.isEmpty()) {ip = "0.0.0.0";}
            if (formato.isEmpty()) {formato = "Sin informaciòn";}
            if (config.isEmpty()) {config = "Sin información";}
            insertRadio(idEst, dir, idMarca, idModelo, idGestor, ip, bw, formato,idTipo,config );
            jText_IpRado.setText("");
            jText_Formato.setText("");
            jText_Config.setText("");
            listarRadios();
//            
//        } // Fin de else
    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void jB_Marca_RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Marca_RadioActionPerformed
        dispose();
        Radio_Marca RMarca = new Radio_Marca();
        RMarca.setVisible(true);
        RMarca.setResizable(false);
        RMarca.setLocationRelativeTo(null);
    }//GEN-LAST:event_jB_Marca_RadioActionPerformed

    private void jB_Modelo_RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Modelo_RadioActionPerformed
        dispose();
        Radio_Modelo RModelo = new Radio_Modelo();
        RModelo.setVisible(true);
        RModelo.setResizable(false);
        RModelo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jB_Modelo_RadioActionPerformed

    private void jB_Gestor_RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Gestor_RadioActionPerformed
        dispose();
        Radio_Gestor RGestor = new Radio_Gestor();
        RGestor.setVisible(true);
        RGestor.setResizable(false);
        RGestor.setLocationRelativeTo(null);
    }//GEN-LAST:event_jB_Gestor_RadioActionPerformed

    private void jT_RadiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_RadiosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jT_Radios.getSelectedRow();
            jComboEstacion.setSelectedItem(jT_Radios.getModel().getValueAt(row, 0));
            jCombo_Direccion.setSelectedItem(jT_Radios.getModel().getValueAt(row, 1));

            jCombo_Marcas.setSelectedItem(jT_Radios.getModel().getValueAt(row, 2));
            jCombo_Modelos.setSelectedItem(jT_Radios.getModel().getValueAt(row, 3));
            jCombo_Gestores.setSelectedItem(jT_Radios.getModel().getValueAt(row, 4));

            jText_IpRado.setText(jT_Radios.getModel().getValueAt(row, 5).toString());
            String a = (String) jT_Radios.getModel().getValueAt(row, 6);
            a = a.replace(" ","");
            String b = a.replaceAll("Mbps","");
            int c = Integer.parseInt(b);
            jSpinner_BandW.setValue(c);
    //        jSpinner_BandW.setValue(jT_Radios.getModel().getValueAt(row, 6));
            jText_Formato.setText(jT_Radios.getModel().getValueAt(row, 7).toString());

            jCombo_Tipos.setSelectedItem(jT_Radios.getModel().getValueAt(row, 8));
            jText_Config.setText(jT_Radios.getModel().getValueAt(row, 9).toString());
            jB_Guardar.setEnabled(false);
            jB_Update.setEnabled(true);
        } else {
            jB_Guardar.setEnabled(true);
            jB_Update.setEnabled(false);
            jSpinner_BandW.setValue(0);
            jText_IpRado.setText("");
            jText_Formato.setText("");
            jText_Config.setText("");
        }
    }//GEN-LAST:event_jT_RadiosMouseClicked

    private void jB_Tipo_RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Tipo_RadioActionPerformed
        dispose();
        Radio_Tipo RTipo = new Radio_Tipo();
        RTipo.setVisible(true);
        RTipo.setResizable(false);
        RTipo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jB_Tipo_RadioActionPerformed

    private void jB_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateActionPerformed
         ArrayList<RadioRad> data = obtenerRadio();
         int row = jT_Radios.getSelectedRow();
         
        if (jT_Radios.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            int idRadio = data.get(row).getId_radio();
            String ip = jText_IpRado.getText();
            String formato = jText_Formato.getText();
            String config = jText_Config.getText();
            int bw = (Integer) jSpinner_BandW.getValue();
            
            ArrayList<Estacion_Est> data1 = obtenerEstaciones();
            ArrayList<MarcasRadio> data2 = obtenerMarcasR();
            ArrayList<ModelosRadio> data3 = obtenerModelosR();
            ArrayList<GestoresRadio> data4 = obtenerGestoresR();
            ArrayList<TipoRadio> data5 = obtenerTiposR();

            int idEst = data1.get(jComboEstacion.getSelectedIndex()).getId_est();
            String dir = jCombo_Direccion.getSelectedItem().toString();
            int idMarca = data2.get(jCombo_Marcas.getSelectedIndex()).getId_marcaR();
            int idModelo = data3.get(jCombo_Modelos.getSelectedIndex()).getId_modelo();
            int idGestor = data4.get(jCombo_Gestores.getSelectedIndex()).getId_gestor();
            int idTipo = data5.get(jCombo_Tipos.getSelectedIndex()).getId_TipoR();
            
            updateRadioR(idRadio ,idEst, dir, idMarca, idModelo, idGestor, ip, bw, formato,idTipo,config );
            
            jText_IpRado.setText("");
            jText_Formato.setText("");
            jText_Config.setText("");

            listarRadios();
            jB_Guardar.setEnabled(true);
        }
    }//GEN-LAST:event_jB_UpdateActionPerformed

    private void jB_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteActionPerformed
        ArrayList<RadioRad> data = obtenerRadio();
        int row = jT_Radios.getSelectedRow();

        if (jT_Radios.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                int idRadio = data.get(row).getId_radio();
                deleteRadio(idRadio);
                listarRadios();
                jText_IpRado.setText("");
                jText_Formato.setText("");
                jText_Config.setText("");
                jB_Guardar.setEnabled(true);
            }
        } // Fin de else
    }//GEN-LAST:event_jB_DeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        Registro_Elementos regElementos = new Registro_Elementos();
        regElementos.setResizable(false);
        regElementos.setVisible(true);
        regElementos.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing
    
    public void listarRadios() {
        DefaultTableModel tRadiosR = (DefaultTableModel) jT_Radios.getModel();
        tRadiosR.setRowCount(0);
        ArrayList<RadioRad> data = obtenerRadio();
        Object[] row = new Object[10];
        int longitud = data.size();

        if (longitud == 0) {
            tRadiosR.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getEstacion();
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

    
    private void mostrarEstacionesCombo() {
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboEstacion.addItem(data.get(i).getEst_nombre());
        }
    } // Fin del metodo
    
    private void mostrarDireccionesCombo() {
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Direccion.addItem(data.get(i).getEst_nombre().toString());
        }
       
    } // Fin del metodo
    
    private void mostrarMarcasCombo() {
        ArrayList<MarcasRadio> data = obtenerMarcasR();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Marcas.addItem(data.get(i).getMarcaR());
        }
    } // Fin del metodo
    
    private void mostrarModelosCombo() {
        ArrayList<ModelosRadio> data = obtenerModelosR();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Modelos.addItem(data.get(i).getModeloR());
        }
    } // Fin del metodo
    
    private void mostrarGestoresCombo() {
        ArrayList<GestoresRadio> data = obtenerGestoresR();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Gestores.addItem(data.get(i).getGestor());
        }
    } // Fin del metodo
    
    private void mostrarTipoRadiosCombo() {
        ArrayList<TipoRadio> data = obtenerTiposR();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Tipos.addItem(data.get(i).getTipoRadio());
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
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Radio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Delete;
    private javax.swing.JButton jB_Gestor_Radio;
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Marca_Radio;
    private javax.swing.JButton jB_Modelo_Radio;
    private javax.swing.JButton jB_Tipo_Radio;
    private javax.swing.JButton jB_Update;
    private javax.swing.JComboBox<String> jComboEstacion;
    private javax.swing.JComboBox<String> jCombo_Direccion;
    private javax.swing.JComboBox<String> jCombo_Gestores;
    private javax.swing.JComboBox<String> jCombo_Marcas;
    private javax.swing.JComboBox<String> jCombo_Modelos;
    private javax.swing.JComboBox<String> jCombo_Tipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_BandW;
    private javax.swing.JTable jT_Radios;
    private javax.swing.JTextField jText_Config;
    private javax.swing.JTextField jText_Formato;
    private javax.swing.JTextField jText_IpRado;
    // End of variables declaration//GEN-END:variables
}
