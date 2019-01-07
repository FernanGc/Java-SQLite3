
package App_Main_View;

import static App_Controller.Contoller_Planta_Fuerza.deletePlanta;
import static App_Controller.Contoller_Planta_Fuerza.insertPlanta;
import static App_Controller.Contoller_Planta_Fuerza.obtenerPlantasF;
import static App_Controller.Contoller_Planta_Fuerza.updatePlantaF;
import static App_Controller.Controller_Estacion.obtenerEstaciones;
import static App_Controller.Controller_Pfz_Marcas.obtenerMarcasPfz;
import static App_Controller.Controller_Pfz_Modelos.obtenerModelosPfz;
import App_Controller.Estacion_Est;
import App_Controller.Pfz_Marcas;
import App_Controller.Pfz_Modelos;
import App_Controller.Pfz_Planta_Fuerza;
import App_Internal_View.Planta_Marca;
import App_Internal_View.Planta_Modelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Planta_Fza extends javax.swing.JFrame {

    public Planta_Fza() {
        initComponents();
        listarPlantasFuerza();
        mostrarEstacionesCombo();
        mostrarMarcaPfzCombo();
        mostrarModelosPfzCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jB_Guardar = new javax.swing.JButton();
        jB_Update = new javax.swing.JButton();
        jB_Delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_PlantasPfz = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextNo_Serie = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jText_Desc = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jComboMarcasPfz = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jComboModeloPfz = new javax.swing.JComboBox<>();
        Planta_Marca = new javax.swing.JButton();
        Planta_Modelo = new javax.swing.JButton();
        jSpinner_Capacidad = new javax.swing.JSpinner();
        jComboEstacion = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Planta de Fuerza");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Planta de Fuerza");

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

        jT_PlantasPfz.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_PlantasPfz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estaciòn", "No. Serie", "Marca", "Modelo", "Capacidad", "Descropción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_PlantasPfz.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_PlantasPfz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_PlantasPfzMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_PlantasPfz);
        jT_PlantasPfz.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 109, 240));
        jLabel47.setText("Numero de Serie");

        jTextNo_Serie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextNo_Serie.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 109, 240));
        jLabel48.setText("Capacidad");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 109, 240));
        jLabel49.setText("Descripción");

        jText_Desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jText_Desc.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 109, 240));
        jLabel50.setText("Marca Planta de Fuerza");

        jComboMarcasPfz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboMarcasPfz.setFocusable(false);
        jComboMarcasPfz.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 109, 240));
        jLabel51.setText("Modelo Planta de Fuerza");

        jComboModeloPfz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboModeloPfz.setFocusable(false);
        jComboModeloPfz.setPreferredSize(new java.awt.Dimension(0, 30));

        Planta_Marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Planta_Marca.setToolTipText("Nuevo Elemento");
        Planta_Marca.setBorder(null);
        Planta_Marca.setPreferredSize(new java.awt.Dimension(30, 30));
        Planta_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planta_MarcaActionPerformed(evt);
            }
        });

        Planta_Modelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        Planta_Modelo.setToolTipText("Nuevo Elemento");
        Planta_Modelo.setBorder(null);
        Planta_Modelo.setPreferredSize(new java.awt.Dimension(30, 30));
        Planta_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planta_ModeloActionPerformed(evt);
            }
        });

        jSpinner_Capacidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10));
        jSpinner_Capacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jSpinner_Capacidad.setFocusable(false);
        jSpinner_Capacidad.setPreferredSize(new java.awt.Dimension(29, 30));

        jComboEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboEstacion.setFocusable(false);
        jComboEstacion.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 109, 240));
        jLabel52.setText("Estacion");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextNo_Serie, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addComponent(jSpinner_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jText_Desc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboMarcasPfz, javax.swing.GroupLayout.Alignment.LEADING, 0, 255, Short.MAX_VALUE)
                            .addComponent(jComboModeloPfz, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Planta_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Planta_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboMarcasPfz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Planta_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboModeloPfz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Planta_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextNo_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        String numSerie = jTextNo_Serie.getText();
        String descripcion = jText_Desc.getText();
        int capacidad = (Integer) jSpinner_Capacidad.getValue();

        ArrayList<Estacion_Est> data1 = obtenerEstaciones();
        ArrayList<Pfz_Marcas> data2 = obtenerMarcasPfz();
        ArrayList<Pfz_Modelos> data3 = obtenerModelosPfz();

        int idEst = data1.get(jComboEstacion.getSelectedIndex()).getId_est();
        int idMarca = data2.get(jComboMarcasPfz.getSelectedIndex()).getId_pfzMarca();
        int idModelo = data3.get(jComboModeloPfz.getSelectedIndex()).getId_pfzModelo();
        if (numSerie.isEmpty()) { numSerie = "Sin informaciòn"; }
        if (descripcion.isEmpty()) { descripcion = "Sin informaciòn"; }
        insertPlanta(idEst, numSerie, capacidad, descripcion, idMarca, idModelo);
        listarPlantasFuerza();
        jTextNo_Serie.setText("");
        jText_Desc.setText("");
        jSpinner_Capacidad.setValue(0);
      

    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void Planta_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planta_MarcaActionPerformed
        dispose();
        Planta_Marca PlantaMarca = new Planta_Marca();
        PlantaMarca.setVisible(true);
        PlantaMarca.setResizable(false);
        PlantaMarca.setLocationRelativeTo(null);
    }//GEN-LAST:event_Planta_MarcaActionPerformed

    private void Planta_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planta_ModeloActionPerformed
        dispose();
        Planta_Modelo PlantaModelo = new Planta_Modelo();
        PlantaModelo.setVisible(true);
        PlantaModelo.setResizable(false);
        PlantaModelo.setLocationRelativeTo(null);
    }//GEN-LAST:event_Planta_ModeloActionPerformed

    private void jT_PlantasPfzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_PlantasPfzMouseClicked

        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jT_PlantasPfz.getSelectedRow();

            jComboEstacion.setSelectedItem(jT_PlantasPfz.getModel().getValueAt(row, 0));
            jTextNo_Serie.setText(jT_PlantasPfz.getModel().getValueAt(row, 1).toString());
            jComboMarcasPfz.setSelectedItem(jT_PlantasPfz.getModel().getValueAt(row, 2));
            jComboModeloPfz.setSelectedItem(jT_PlantasPfz.getModel().getValueAt(row, 3));
            
            String a = (String) jT_PlantasPfz.getModel().getValueAt(row, 4);
            a = a.replace(" ", "");
            String b = a.replaceAll("A", "");
            int c = Integer.parseInt(b);
            jSpinner_Capacidad.setValue(c);
//            jSpinner_Capacidad.setValue(jT_PlantasPfz.getModel().getValueAt(row, 4));
            jText_Desc.setText(jT_PlantasPfz.getModel().getValueAt(row, 5).toString());
            jB_Update.setEnabled(true);
            jB_Guardar.setEnabled(false);
        } else { 
            jB_Guardar.setEnabled(true);
            jB_Update.setEnabled(false);
            jSpinner_Capacidad.setValue(0);
            jTextNo_Serie.setText("");
            jText_Desc.setText("");
        }
    }//GEN-LAST:event_jT_PlantasPfzMouseClicked

    private void jB_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateActionPerformed
        ArrayList<Pfz_Planta_Fuerza> data = obtenerPlantasF();
        int row = jT_PlantasPfz.getSelectedRow();
        String numSerie = jTextNo_Serie.getText();
        String descripcion = jText_Desc.getText();
        
        if (jT_PlantasPfz.getSelectionModel().isSelectionEmpty() || descripcion.isEmpty() ||  numSerie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int idPlanta = data.get(row).getIdPfz();
            int capacidad = (Integer) jSpinner_Capacidad.getValue();

            ArrayList<Estacion_Est> data1 = obtenerEstaciones();
            ArrayList<Pfz_Marcas> data2 = obtenerMarcasPfz();
            ArrayList<Pfz_Modelos> data3 = obtenerModelosPfz();

            int idEst = data1.get(jComboEstacion.getSelectedIndex()).getId_est();
            int idMarca = data2.get(jComboMarcasPfz.getSelectedIndex()).getId_pfzMarca();
            int idModelo = data3.get(jComboModeloPfz.getSelectedIndex()).getId_pfzModelo();
            updatePlantaF(idPlanta, idEst, numSerie, capacidad, descripcion, idMarca, idModelo);
            jTextNo_Serie.setText("");
            jText_Desc.setText("");
            listarPlantasFuerza();
            jB_Guardar.setEnabled(true);
        }
    }//GEN-LAST:event_jB_UpdateActionPerformed

    private void jB_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteActionPerformed
        ArrayList<Pfz_Planta_Fuerza> data = obtenerPlantasF();
        int row = jT_PlantasPfz.getSelectedRow();
        if (jT_PlantasPfz.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                
                int idPlanta = data.get(row).getIdPfz();
                deletePlanta(idPlanta);
                listarPlantasFuerza();
                jTextNo_Serie.setText("");
                jText_Desc.setText("");
                jB_Guardar.setEnabled(true);
            } // Fin if JOption
        }
    }//GEN-LAST:event_jB_DeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        Registro_Elementos regElementos = new Registro_Elementos();
        regElementos.setResizable(false);
        regElementos.setVisible(true);
        regElementos.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

    
    public void listarPlantasFuerza() {
        DefaultTableModel tPlantasF = (DefaultTableModel) jT_PlantasPfz.getModel();
        tPlantasF.setRowCount(0);
        ArrayList<Pfz_Planta_Fuerza> data = obtenerPlantasF();
        Object[] row = new Object[6];
        int longitud = data.size();

        if (longitud == 0) {
            tPlantasF.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getEst();
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
    
    private void mostrarEstacionesCombo() {
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboEstacion.addItem(data.get(i).getEst_nombre());
        }
    } // Fin del metodo
    
    private void mostrarMarcaPfzCombo() {
        ArrayList<Pfz_Marcas> data = obtenerMarcasPfz();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboMarcasPfz.addItem(data.get(i).getPfzMarca());
        }
    } // Fin del metodo
    
    private void mostrarModelosPfzCombo() {
        ArrayList<Pfz_Modelos> data = obtenerModelosPfz();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboModeloPfz.addItem(data.get(i).getPfzModelo());
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
            java.util.logging.Logger.getLogger(Planta_Fza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planta_Fza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planta_Fza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planta_Fza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planta_Fza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Planta_Marca;
    private javax.swing.JButton Planta_Modelo;
    private javax.swing.JButton jB_Delete;
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Update;
    private javax.swing.JComboBox<String> jComboEstacion;
    private javax.swing.JComboBox<String> jComboMarcasPfz;
    private javax.swing.JComboBox<String> jComboModeloPfz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Capacidad;
    private javax.swing.JTable jT_PlantasPfz;
    private javax.swing.JTextField jTextNo_Serie;
    private javax.swing.JTextField jText_Desc;
    // End of variables declaration//GEN-END:variables
}
