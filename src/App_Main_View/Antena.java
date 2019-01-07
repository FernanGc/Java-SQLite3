
package App_Main_View;

import App_Controller.Ant_Antena_Marcas;
import App_Controller.Ant_Antena_Modelos;
import App_Controller.Antena_SG;
import static App_Controller.Controller_Antena_Marcas.obtenerMarcas;
import static App_Controller.Controller_Antena_Modelo.obtenerModelos;
import static App_Controller.Controller_Lineas.obtenerMarcasLinea;
import static App_Controller.Controller_Radio.obtenerRadio;
import static App_Controller.Cotroller_Antena_Linea.deleteAntena;
import static App_Controller.Cotroller_Antena_Linea.deleteLinea;
import static App_Controller.Cotroller_Antena_Linea.insertAntena;
import static App_Controller.Cotroller_Antena_Linea.insertLineas;
import static App_Controller.Cotroller_Antena_Linea.obtenerAntenas;
import static App_Controller.Cotroller_Antena_Linea.obtenerLineas;
import static App_Controller.Cotroller_Antena_Linea.updateAntena;
import static App_Controller.Cotroller_Antena_Linea.updateLinea;
import App_Controller.Linea_SG;
import App_Controller.RadioRad;
import App_Controller.Tipos_Lineas;
import App_Internal_View.Antena_Marca;
import App_Internal_View.Antena_Modelo;
import App_Internal_View.Est_Zona;
import App_Internal_View.Linea_Tipos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Antena extends javax.swing.JFrame {

    public Antena() {
        initComponents();
        listarAntenas();
        listarLineas();
        
        listarLineasCombo();
        listarRadiosCombo();
        listarAntenasComoboMarcas();
        listarAntenasComoboModelo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Antenas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Lineas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCombo_MarcasAnt = new javax.swing.JComboBox<>();
        jCombo_ModeloAnt = new javax.swing.JComboBox<>();
        Antena_Marca = new javax.swing.JButton();
        Antena_Modelo = new javax.swing.JButton();
        jSpinner_DiamatroAnt = new javax.swing.JSpinner();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jCombo_LineaTx = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jSpinner_LineaLong = new javax.swing.JSpinner();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jCombo_Radios = new javax.swing.JComboBox<>();
        jB_DeleteAnt = new javax.swing.JButton();
        jB_GuardarAnt = new javax.swing.JButton();
        jB_UpdateAnt = new javax.swing.JButton();
        jB_GuardarLinea = new javax.swing.JButton();
        jB_UpdateLinea = new javax.swing.JButton();
        jB_DeleteLinea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Antena");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Antena");

        jTable_Antenas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable_Antenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Radio", "Marca", "Modelo", "Diametro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Antenas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_Antenas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AntenasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Antenas);
        jTable_Antenas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTable_Lineas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable_Lineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Radio", "Tipo de Linea", "Longitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Lineas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_Lineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_LineasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Lineas);
        jTable_Lineas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 109, 240));
        jLabel10.setText("Marca: de la Antena");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 109, 240));
        jLabel11.setText("Modelo de la Antena");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 109, 240));
        jLabel12.setText("Diametro: de la Antena");

        jCombo_MarcasAnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_MarcasAnt.setFocusable(false);
        jCombo_MarcasAnt.setPreferredSize(new java.awt.Dimension(245, 30));

        jCombo_ModeloAnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_ModeloAnt.setFocusable(false);
        jCombo_ModeloAnt.setPreferredSize(new java.awt.Dimension(245, 30));

        Antena_Marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Antena_Marca.setToolTipText("Nuevo Elemento");
        Antena_Marca.setBorder(null);
        Antena_Marca.setPreferredSize(new java.awt.Dimension(30, 30));
        Antena_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Antena_MarcaActionPerformed(evt);
            }
        });

        Antena_Modelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Antena_Modelo.setToolTipText("Nuevo Elemento");
        Antena_Modelo.setBorder(null);
        Antena_Modelo.setPreferredSize(new java.awt.Dimension(30, 30));
        Antena_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Antena_ModeloActionPerformed(evt);
            }
        });

        jSpinner_DiamatroAnt.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        jSpinner_DiamatroAnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jSpinner_DiamatroAnt.setFocusable(false);
        jSpinner_DiamatroAnt.setPreferredSize(new java.awt.Dimension(245, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCombo_ModeloAnt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_MarcasAnt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_DiamatroAnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Antena_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Antena_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_MarcasAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Antena_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_ModeloAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Antena_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner_DiamatroAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 109, 240));
        jLabel13.setText("Linea Transmicion");

        jCombo_LineaTx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_LineaTx.setFocusable(false);
        jCombo_LineaTx.setPreferredSize(new java.awt.Dimension(245, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        jButton9.setToolTipText("Nuevo Elemento");
        jButton9.setBorder(null);
        jButton9.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 109, 240));
        jLabel26.setText("Loongitud de La Linea");

        jSpinner_LineaLong.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        jSpinner_LineaLong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jSpinner_LineaLong.setFocusable(false);
        jSpinner_LineaLong.setPreferredSize(new java.awt.Dimension(255, 30));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner_LineaLong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jCombo_LineaTx, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombo_LineaTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner_LineaLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 109, 240));
        jLabel14.setText("Radio:");

        jCombo_Radios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Radios.setFocusable(false);
        jCombo_Radios.setPreferredSize(new java.awt.Dimension(245, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombo_Radios, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCombo_Radios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jB_DeleteAnt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_DeleteAnt.setText("Eliminar");
        jB_DeleteAnt.setBorder(null);
        jB_DeleteAnt.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_DeleteAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DeleteAntActionPerformed(evt);
            }
        });

        jB_GuardarAnt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_GuardarAnt.setText("Guardar");
        jB_GuardarAnt.setBorder(null);
        jB_GuardarAnt.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_GuardarAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarAntActionPerformed(evt);
            }
        });

        jB_UpdateAnt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_UpdateAnt.setText("Actualizar");
        jB_UpdateAnt.setBorder(null);
        jB_UpdateAnt.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_UpdateAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_UpdateAntActionPerformed(evt);
            }
        });

        jB_GuardarLinea.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_GuardarLinea.setText("Guardar");
        jB_GuardarLinea.setBorder(null);
        jB_GuardarLinea.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_GuardarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarLineaActionPerformed(evt);
            }
        });

        jB_UpdateLinea.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_UpdateLinea.setText("Actualizar");
        jB_UpdateLinea.setBorder(null);
        jB_UpdateLinea.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_UpdateLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_UpdateLineaActionPerformed(evt);
            }
        });

        jB_DeleteLinea.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jB_DeleteLinea.setText("Eliminar");
        jB_DeleteLinea.setBorder(null);
        jB_DeleteLinea.setPreferredSize(new java.awt.Dimension(75, 30));
        jB_DeleteLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DeleteLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_DeleteAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_UpdateAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_GuardarAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_DeleteLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_UpdateLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_GuardarLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jB_GuardarAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jB_UpdateAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jB_DeleteAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_GuardarLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_UpdateLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_DeleteLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_DeleteAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteAntActionPerformed
        ArrayList<Antena_SG> data1 = obtenerAntenas();
        int row = jTable_Antenas.getSelectedRow();

        if (jTable_Antenas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                
                    int idAntena = data1.get(row).getId_antena();
                    deleteAntena(idAntena);
                    listarAntenas();
            }
        } // Fin de else
    }//GEN-LAST:event_jB_DeleteAntActionPerformed

    private void Antena_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Antena_MarcaActionPerformed
        dispose();
        Antena_Marca AntMarca = new Antena_Marca();
        AntMarca.setVisible(true);
        AntMarca.setResizable(false);
        AntMarca.setLocationRelativeTo(null);
    }//GEN-LAST:event_Antena_MarcaActionPerformed

    private void Antena_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Antena_ModeloActionPerformed
        dispose();
        Antena_Modelo AntModelo = new Antena_Modelo();
        AntModelo.setVisible(true);
        AntModelo.setResizable(false);
        AntModelo.setLocationRelativeTo(null);
    }//GEN-LAST:event_Antena_ModeloActionPerformed

    private void jB_GuardarAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarAntActionPerformed
        ArrayList<RadioRad> data1 = obtenerRadio();
        ArrayList<Ant_Antena_Marcas> data2 = obtenerMarcas();
        ArrayList<Ant_Antena_Modelos> data3 = obtenerModelos();

        int idRadio = data1.get(jCombo_Radios.getSelectedIndex()).getId_radio();
        int idMarca = data2.get(jCombo_MarcasAnt.getSelectedIndex()).getId_Marcas();
        int idModelo = data3.get(jCombo_ModeloAnt.getSelectedIndex()).getIdModelo();
        double diametro = (Double) jSpinner_DiamatroAnt.getValue();

        insertAntena(idRadio,  idMarca, idModelo, diametro);
        listarAntenas();
    }//GEN-LAST:event_jB_GuardarAntActionPerformed

    private void jB_UpdateAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateAntActionPerformed
        if (jTable_Antenas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<Antena_SG> data1 = obtenerAntenas();
            ArrayList<RadioRad> data2 = obtenerRadio();
            ArrayList<Ant_Antena_Marcas> data3 = obtenerMarcas();
            ArrayList<Ant_Antena_Modelos> data4 = obtenerModelos();
            
            int row = jTable_Antenas.getSelectedRow();
            int idAnt = data1.get(row).getId_antena();
            int idRadio = data2.get(jCombo_Radios.getSelectedIndex()).getId_radio();
            int idMarca = data3.get(jCombo_MarcasAnt.getSelectedIndex()).getId_Marcas();
            int idModelo = data4.get(jCombo_ModeloAnt.getSelectedIndex()).getIdModelo();
            double diametro = (Double) jSpinner_DiamatroAnt.getValue();
            updateAntena(idAnt, idRadio, idMarca, idModelo, diametro);
            listarAntenas();
            jB_GuardarAnt.setEnabled(true);
        }
    }//GEN-LAST:event_jB_UpdateAntActionPerformed

    private void jB_GuardarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarLineaActionPerformed
        ArrayList<RadioRad> data1 = obtenerRadio();
        ArrayList<Tipos_Lineas> data2 = obtenerMarcasLinea(); // Los id del comoboBox
        
        int idRadio = data1.get(jCombo_Radios.getSelectedIndex()).getId_radio();
        int idTipoL = data2.get(jCombo_LineaTx.getSelectedIndex()).getIdLinea();
        double longitud = (Double) jSpinner_LineaLong.getValue();
        insertLineas(idRadio, idTipoL, longitud);
        listarLineas();
    }//GEN-LAST:event_jB_GuardarLineaActionPerformed

    private void jB_UpdateLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateLineaActionPerformed
      
        if (jTable_Lineas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            ArrayList<Linea_SG> data1 = obtenerLineas();
            ArrayList<RadioRad> data2 = obtenerRadio();
            ArrayList<Tipos_Lineas> data3 = obtenerMarcasLinea();
            
            int row = jTable_Lineas.getSelectedRow();
            int idLinea = data1.get(row).getId_linea();
            int idRadio = data2.get(jCombo_Radios.getSelectedIndex()).getId_radio();
            int idLineaT = data3.get(jCombo_LineaTx.getSelectedIndex()).getIdLinea();
            double longitud = (Double) jSpinner_LineaLong.getValue();
            updateLinea(idLinea, idRadio, idLineaT, longitud);
            listarLineas();
            jB_GuardarAnt.setEnabled(true);
        }  
    }//GEN-LAST:event_jB_UpdateLineaActionPerformed

    private void jB_DeleteLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteLineaActionPerformed
        ArrayList<Linea_SG> data1 = obtenerLineas();
        int row = jTable_Lineas.getSelectedRow();

        if (jTable_Lineas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                int idLinea = data1.get(row).getId_linea();
                deleteLinea(idLinea);
                listarLineas();
            }
        } // Fin de else
    }//GEN-LAST:event_jB_DeleteLineaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
        Linea_Tipos linea = new Linea_Tipos();
        linea.setVisible(true);
        linea.setResizable(false);
        linea.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable_AntenasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AntenasMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jTable_Antenas.getSelectedRow();
 
            jCombo_Radios.setSelectedItem(jTable_Antenas.getModel().getValueAt(row, 0));
            jCombo_MarcasAnt.setSelectedItem(jTable_Antenas.getModel().getValueAt(row, 1));
            jCombo_ModeloAnt.setSelectedItem(jTable_Antenas.getModel().getValueAt(row, 2));
            String a = (String) jTable_Antenas.getModel().getValueAt(row, 3);
            a = a.replace(" ", "");
            String b = a.replaceAll("m", "");
            double c = Double.parseDouble(b);
            jSpinner_DiamatroAnt.setValue(c);
            jB_UpdateAnt.setEnabled(true);
            jB_GuardarAnt.setEnabled(false);
        } else {
            jB_GuardarAnt.setEnabled(true);
            jB_UpdateAnt.setEnabled(false);
            jSpinner_DiamatroAnt.setValue(0);
        }
    }//GEN-LAST:event_jTable_AntenasMouseClicked

    private void jTable_LineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_LineasMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jTable_Lineas.getSelectedRow();

            jCombo_Radios.setSelectedItem(jTable_Lineas.getModel().getValueAt(row, 0));
            jCombo_LineaTx.setSelectedItem(jTable_Lineas.getModel().getValueAt(row, 1));

            String a = (String) jTable_Lineas.getModel().getValueAt(row, 2);
            a = a.replace(" ", "");
            String b = a.replaceAll("m", "");
            double c = Double.parseDouble(b);
            jSpinner_LineaLong.setValue(c);
            jB_UpdateLinea.setEnabled(true);
            jB_GuardarLinea.setEnabled(false);
        } else {
            jB_GuardarLinea.setEnabled(true);
            jB_UpdateLinea.setEnabled(false);
            jSpinner_LineaLong.setValue(0);
        }
    }//GEN-LAST:event_jTable_LineasMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        Registro_Elementos regElementos = new Registro_Elementos();
        regElementos.setResizable(false);
        regElementos.setVisible(true);
        regElementos.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

    public void listarAntenas() {
        DefaultTableModel tAntenas = (DefaultTableModel) jTable_Antenas.getModel();
        tAntenas.setRowCount(0);
        ArrayList<Antena_SG> data = obtenerAntenas();
        Object[] row = new Object[4];
        int longitud = data.size();

        if (longitud == 0) {
            tAntenas.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getEst() + " - " + data.get(i).getDir();
                row[1] = data.get(i).getMarca();
                row[2] = data.get(i).getModelo();
                row[3] = data.get(i).getDiamtro() + " m ";
                tAntenas.addRow(row);
            } // Fin de for
        } // Fin de else
        jTable_Antenas.setModel(tAntenas);
    } // Fin de listarR
    
    public void listarLineas() {
        /* Para el Frame principal*/
        DefaultTableModel tLineas = (DefaultTableModel) jTable_Lineas.getModel();
        tLineas.setRowCount(0);
        ArrayList<Linea_SG> data1 = obtenerLineas();
        Object[] row = new Object[3];
        int longitud = data1.size();
        if (longitud == 0) {
            tLineas.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data1.get(i).getEst() + " - " + data1.get(i).getDir();
                row[1] = data1.get(i).getTipoL();
                row[2] = data1.get(i).getLongi() + " m ";
                tLineas.addRow(row);
            } // Fin de for
        } // Fin de else
        jTable_Lineas.setModel(tLineas);
    } // Fin de listarR
    
    public void listarLineasCombo(){
        /*Del frame interno o POPUP*/
        ArrayList<Tipos_Lineas> data = obtenerMarcasLinea();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_LineaTx.addItem(data.get(i).getLinea());
        }
    } // Fin del metodo
    
    public void listarRadiosCombo(){
        ArrayList<RadioRad> data = obtenerRadio();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Radios.addItem(data.get(i).getEstacion()  + " - " + data.get(i).getDireccion());
        }
    } // Fin del metodo
    
    public void listarAntenasComoboMarcas() {
        ArrayList<Ant_Antena_Marcas> data = obtenerMarcas();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_MarcasAnt.addItem(data.get(i).getMarcas());
        }
    } // Fin del metodo
    
    public void listarAntenasComoboModelo() {
        ArrayList<Ant_Antena_Modelos> data = obtenerModelos();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_ModeloAnt.addItem(data.get(i).getModelo());
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
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Antena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Antena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Antena_Marca;
    private javax.swing.JButton Antena_Modelo;
    private javax.swing.JButton jB_DeleteAnt;
    private javax.swing.JButton jB_DeleteLinea;
    private javax.swing.JButton jB_GuardarAnt;
    private javax.swing.JButton jB_GuardarLinea;
    private javax.swing.JButton jB_UpdateAnt;
    private javax.swing.JButton jB_UpdateLinea;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jCombo_LineaTx;
    private javax.swing.JComboBox<String> jCombo_MarcasAnt;
    private javax.swing.JComboBox<String> jCombo_ModeloAnt;
    private javax.swing.JComboBox<String> jCombo_Radios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_DiamatroAnt;
    private javax.swing.JSpinner jSpinner_LineaLong;
    private javax.swing.JTable jTable_Antenas;
    private javax.swing.JTable jTable_Lineas;
    // End of variables declaration//GEN-END:variables
}
