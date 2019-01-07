
package App_Main_View;

import static App_Controller.Contoller_Planta_Fuerza.obtenerPlantasF;

import static App_Controller.Controller_Estacion.obtenerEstaciones;
import static App_Controller.Controller_Motogenerador.deleteMotoGen;
import static App_Controller.Controller_Motogenerador.insertModelo;
import static App_Controller.Controller_Motogenerador.obtenerMotogens;
import static App_Controller.Controller_Motogenerador.updateMotogen;
import static App_Controller.Controller_Mtg_Marcas.obtenerMarcasMtg;
import static App_Controller.Controller_Mtg_Modelos.obtenerModelosMtg;

import App_Controller.Estacion_Est;
import App_Controller.Mtg_Marcas;
import App_Controller.Mtg_Modelos;
import App_Controller.Mtg_Motogenerador;

import App_Internal_View.MotoGen_Marca;
import App_Internal_View.MotoGen_Modelo;
import App_Internal_View.Planta_Marca;
import App_Internal_View.Planta_Modelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Moto_Gen extends javax.swing.JFrame {

    public Moto_Gen() {
        initComponents();
        listarMotoGens();
        mostrarEstacionesCombo();
        mostrarMarcaMtgCombo();
        mostrarModelosMtgCombo();
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
        jT_MotoGens = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextNo_Serie = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jText_Desc = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jComboMarcasMttg = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jComboModeloMtg = new javax.swing.JComboBox<>();
        MotoGen_Marca = new javax.swing.JButton();
        MotoGen_Modelo = new javax.swing.JButton();
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
        jLabel1.setText("Motogenerador");

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

        jT_MotoGens.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_MotoGens.setModel(new javax.swing.table.DefaultTableModel(
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
        jT_MotoGens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_MotoGens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_MotoGensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_MotoGens);
        jT_MotoGens.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
        jLabel50.setText("Marca Motogenerador");

        jComboMarcasMttg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboMarcasMttg.setFocusable(false);
        jComboMarcasMttg.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 109, 240));
        jLabel51.setText("Modelo Motogenerador");

        jComboModeloMtg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboModeloMtg.setFocusable(false);
        jComboModeloMtg.setPreferredSize(new java.awt.Dimension(0, 30));

        MotoGen_Marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        MotoGen_Marca.setToolTipText("Nuevo Elemento");
        MotoGen_Marca.setBorder(null);
        MotoGen_Marca.setPreferredSize(new java.awt.Dimension(30, 30));
        MotoGen_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotoGen_MarcaActionPerformed(evt);
            }
        });

        MotoGen_Modelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/001-preference.png"))); // NOI18N
        MotoGen_Modelo.setToolTipText("Nuevo Elemento");
        MotoGen_Modelo.setBorder(null);
        MotoGen_Modelo.setPreferredSize(new java.awt.Dimension(30, 30));
        MotoGen_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotoGen_ModeloActionPerformed(evt);
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
                            .addComponent(jComboMarcasMttg, javax.swing.GroupLayout.Alignment.LEADING, 0, 255, Short.MAX_VALUE)
                            .addComponent(jComboModeloMtg, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MotoGen_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotoGen_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jComboMarcasMttg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotoGen_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jComboModeloMtg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotoGen_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        ArrayList<Mtg_Marcas> data2 = obtenerMarcasMtg();
        ArrayList<Mtg_Modelos> data3 = obtenerModelosMtg();

        int idEst = data1.get(jComboEstacion.getSelectedIndex()).getId_est();
        int idMarca = data2.get(jComboMarcasMttg.getSelectedIndex()).getId_mtgMarca();
        int idModelo = data3.get(jComboModeloMtg.getSelectedIndex()).getId_mtgModelo();
        if(numSerie.isEmpty()) {numSerie = "Sin informaciòn";}
        if (descripcion.isEmpty()) {descripcion = "Sin informaciòn";}
        insertModelo(idEst, numSerie, capacidad, descripcion, idMarca, idModelo);
        listarMotoGens();
        jTextNo_Serie.setText("");
        jText_Desc.setText("");
        jSpinner_Capacidad.setValue(0);
        

    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void MotoGen_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotoGen_MarcaActionPerformed
        dispose();
        MotoGen_Marca MgMarca = new MotoGen_Marca();
        MgMarca.setVisible(true);
        MgMarca.setResizable(false);
        MgMarca.setLocationRelativeTo(null);
    }//GEN-LAST:event_MotoGen_MarcaActionPerformed

    private void MotoGen_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotoGen_ModeloActionPerformed
        dispose();
        MotoGen_Modelo MgModelo = new MotoGen_Modelo();
        MgModelo.setVisible(true);
        MgModelo.setResizable(false);
        MgModelo.setLocationRelativeTo(null);
    }//GEN-LAST:event_MotoGen_ModeloActionPerformed

    private void jT_MotoGensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_MotoGensMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jT_MotoGens.getSelectedRow();
            
            jComboEstacion.setSelectedItem(jT_MotoGens.getModel().getValueAt(row, 0));
            jTextNo_Serie.setText(jT_MotoGens.getModel().getValueAt(row, 1).toString());
            jComboMarcasMttg.setSelectedItem(jT_MotoGens.getModel().getValueAt(row, 2));
            jComboModeloMtg.setSelectedItem(jT_MotoGens.getModel().getValueAt(row, 3));
            
            String a = (String) jT_MotoGens.getModel().getValueAt(row, 4);
            a = a.replace(" ", "");
            String b = a.replaceAll("KW", "");
            int c = Integer.parseInt(b);
            jSpinner_Capacidad.setValue(c);
//            jSpinner_Capacidad.setValue(jT_PlantasPfz.getModel().getValueAt(row, 4));       
            jText_Desc.setText(jT_MotoGens.getModel().getValueAt(row, 5).toString());
            jB_Update.setEnabled(true);
            jB_Guardar.setEnabled(false);
        } else { 
            jB_Guardar.setEnabled(true);
            jB_Update.setEnabled(false);
            jTextNo_Serie.setText("");
            jText_Desc.setText("");
            jSpinner_Capacidad.setValue(0);
        
        }
    }//GEN-LAST:event_jT_MotoGensMouseClicked

    private void jB_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateActionPerformed
        ArrayList<Mtg_Motogenerador> data = obtenerMotogens();
        int row = jT_MotoGens.getSelectedRow();
        String numSerie = jTextNo_Serie.getText();
        String descripcion = jText_Desc.getText();
        
        if (jT_MotoGens.getSelectionModel().isSelectionEmpty() || descripcion.isEmpty() ||  numSerie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            int idMtg = data.get(row).getIdMtg();
            int capacidad = (Integer) jSpinner_Capacidad.getValue();

            ArrayList<Estacion_Est> data1 = obtenerEstaciones();
            ArrayList<Mtg_Marcas> data2 = obtenerMarcasMtg();
            ArrayList<Mtg_Modelos> data3 = obtenerModelosMtg();

            int idEst = data1.get(jComboEstacion.getSelectedIndex()).getId_est();
            int idMarca = data2.get(jComboMarcasMttg.getSelectedIndex()).getId_mtgMarca();
            int idModelo = data3.get(jComboModeloMtg.getSelectedIndex()).getId_mtgModelo();

            updateMotogen(idMtg, idEst, numSerie, capacidad, descripcion, idMarca, idModelo);

            jTextNo_Serie.setText("");
            jText_Desc.setText("");
            listarMotoGens();
            jB_Guardar.setEnabled(true);
        }
    }//GEN-LAST:event_jB_UpdateActionPerformed

    private void jB_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteActionPerformed
       ArrayList<Mtg_Motogenerador> data = obtenerMotogens();
        int row = jT_MotoGens.getSelectedRow();
        if (jT_MotoGens.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                
                int idMtg = data.get(row).getIdMtg();
                deleteMotoGen(idMtg);
                listarMotoGens();
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

    
    public void listarMotoGens() {
        DefaultTableModel tMotoGens = (DefaultTableModel) jT_MotoGens.getModel();
        tMotoGens.setRowCount(0);
        ArrayList<Mtg_Motogenerador> data = obtenerMotogens();
        Object[] row = new Object[6];
        int longitud = data.size();

        if (longitud == 0) {
            tMotoGens.setRowCount(0);
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getEst();
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
    
    private void mostrarEstacionesCombo() {
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboEstacion.addItem(data.get(i).getEst_nombre());
        }
    } // Fin del metodo
    
    private void mostrarMarcaMtgCombo() {
        ArrayList<Mtg_Marcas> data = obtenerMarcasMtg();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboMarcasMttg.addItem(data.get(i).getMtgMarca());
        }
    } // Fin del metodo
    
    private void mostrarModelosMtgCombo() {
        ArrayList<Mtg_Modelos> data = obtenerModelosMtg();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jComboModeloMtg.addItem(data.get(i).getMtgModelo());
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
            java.util.logging.Logger.getLogger(Moto_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moto_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moto_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moto_Gen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moto_Gen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MotoGen_Marca;
    private javax.swing.JButton MotoGen_Modelo;
    private javax.swing.JButton jB_Delete;
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Update;
    private javax.swing.JComboBox<String> jComboEstacion;
    private javax.swing.JComboBox<String> jComboMarcasMttg;
    private javax.swing.JComboBox<String> jComboModeloMtg;
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
    private javax.swing.JTable jT_MotoGens;
    private javax.swing.JTextField jTextNo_Serie;
    private javax.swing.JTextField jText_Desc;
    // End of variables declaration//GEN-END:variables
}
