
package App_Main_View;


import static App_Controller.Controller_Estacion.obtenerEstaciones;
import static App_Controller.Controller_Torre.deleteTorre;
import static App_Controller.Controller_Torre.insertTorre;
import static App_Controller.Controller_Torre.obtenerEstadosT;
import static App_Controller.Controller_Torre.obtenerTiposT;
import static App_Controller.Controller_Torre.obtenerTorres;
import static App_Controller.Controller_Torre.obtenerUbicacionesT;
import static App_Controller.Controller_Torre.updateTorre;
import App_Controller.Estacion_Est;
import App_Controller.Tor_Estados;
import App_Controller.Tor_Tipos;
import App_Controller.Tor_Ubicacion;
import App_Controller.TorreSF;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Torre extends javax.swing.JFrame {


    public Torre() {
        initComponents();
        listarTorres();
        mostrarTiposTCombo();
        mostrarEstacionesCombo();
        mostrarEstadosTCombo();
        mostrarUbicacionTCombo();
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
        jT_Torres = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jCombo_TiposT = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jSpinner_Altura = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jCombo_Estados = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jCombo_Ubicacion = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jCombo_Estaciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Torre");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Torre");

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

        jT_Torres.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jT_Torres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estacion", "Tipo", "Altura", "Estado", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Torres.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_Torres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_TorresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_Torres);
        jT_Torres.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jT_Torres.getColumnModel().getColumnCount() > 0) {
            jT_Torres.getColumnModel().getColumn(2).setPreferredWidth(40);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 109, 240));
        jLabel14.setText("Tipo de Torre");

        jCombo_TiposT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_TiposT.setFocusable(false);
        jCombo_TiposT.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 109, 240));
        jLabel15.setText("Altura");

        jSpinner_Altura.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 10.0d));
        jSpinner_Altura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jSpinner_Altura.setFocusable(false);
        jSpinner_Altura.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 109, 240));
        jLabel16.setText("Estado de la Torre");

        jCombo_Estados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Estados.setFocusable(false);
        jCombo_Estados.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 109, 240));
        jLabel17.setText("Ubicacion");

        jCombo_Ubicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Ubicacion.setFocusable(false);
        jCombo_Ubicacion.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 109, 240));
        jLabel18.setText("Estacion");

        jCombo_Estaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCombo_Estaciones.setFocusable(false);
        jCombo_Estaciones.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jCombo_Estados, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCombo_Estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombo_TiposT, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCombo_Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCombo_Estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCombo_TiposT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCombo_Estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCombo_Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        ArrayList<Estacion_Est> data1 = obtenerEstaciones();
        ArrayList<Tor_Tipos> data2 = obtenerTiposT();
        ArrayList<Tor_Estados> data3 = obtenerEstadosT();
        ArrayList<Tor_Ubicacion> data4 = obtenerUbicacionesT();
    
        int idEst = data1.get(jCombo_Estaciones.getSelectedIndex()).getId_est();
        int idTipoT = data2.get(jCombo_TiposT.getSelectedIndex()).getId_tipoT();
        Double altura = (Double) jSpinner_Altura.getValue();
        int idEstadoT = data3.get(jCombo_Estados.getSelectedIndex()).getId_Estado();
        int idUbica = data4.get(jCombo_Ubicacion.getSelectedIndex()).getId_ubicacion();
               
        insertTorre(idEst,idTipoT,altura,idEstadoT,idUbica);
        listarTorres();
    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void jB_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateActionPerformed
        if (jT_Torres.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int row = jT_Torres.getSelectedRow();
            
            ArrayList<TorreSF> data0 = obtenerTorres();
            ArrayList<Estacion_Est> data1 = obtenerEstaciones();
            ArrayList<Tor_Tipos> data2 = obtenerTiposT();
            ArrayList<Tor_Estados> data3 = obtenerEstadosT();
            ArrayList<Tor_Ubicacion> data4 = obtenerUbicacionesT();
            
            int idTorre = data0.get(row).getId_torre();
            int idEst = data1.get(jCombo_Estaciones.getSelectedIndex()).getId_est();
            int idTipoT = data2.get(jCombo_TiposT.getSelectedIndex()).getId_tipoT();
            Double altura = (Double) jSpinner_Altura.getValue();
            int idEstadoT = data3.get(jCombo_Estados.getSelectedIndex()).getId_Estado();
            int idUbica = data4.get(jCombo_Ubicacion.getSelectedIndex()).getId_ubicacion();
            updateTorre(idTorre,idEst,idTipoT,altura,idEstadoT,idUbica);
            listarTorres();
            jB_Guardar.setEnabled(true);
        }
    }//GEN-LAST:event_jB_UpdateActionPerformed

    private void jT_TorresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_TorresMouseClicked
         if (evt.getClickCount() == 2 && !evt.isConsumed()) {  
            int row = jT_Torres.getSelectedRow();
            jB_Guardar.setEnabled(false);

            jCombo_Estaciones.setSelectedItem(jT_Torres.getModel().getValueAt(row, 0));
            jCombo_TiposT.setSelectedItem(jT_Torres.getModel().getValueAt(row, 1));
            String al = (String) jT_Torres.getModel().getValueAt(row, 2);
            al = al.replace("m","");
            double valAltura = Double.parseDouble(al);
            jSpinner_Altura.setValue(valAltura);
    //        jSpinner_Altura.setValue(jT_Torres.getModel().getValueAt(row, 2));
            jCombo_Estados.setSelectedItem(jT_Torres.getModel().getValueAt(row, 3));
            jCombo_Ubicacion.setSelectedItem(jT_Torres.getModel().getValueAt(row, 4)); 
            
            jB_Update.setEnabled(true);
            jB_Guardar.setEnabled(false);
            } else {
            jB_Guardar.setEnabled(true);
            jB_Update.setEnabled(false);
            jSpinner_Altura.setValue(0);
        }
    }//GEN-LAST:event_jT_TorresMouseClicked

    private void jB_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteActionPerformed
        ArrayList<TorreSF> data = obtenerTorres();
        int row = jT_Torres.getSelectedRow();

        if (jT_Torres.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                int idTorre = data.get(row).getId_torre();
                deleteTorre(idTorre);
                listarTorres();
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

    public void listarTorres() {
        DefaultTableModel tTorres = (DefaultTableModel) jT_Torres.getModel();
        tTorres.setRowCount(0);
        ArrayList<TorreSF> data = obtenerTorres();
        Object[] row = new Object[5];
        int longitud = data.size();

        if (longitud == 0) {
            tTorres.setRowCount(0);
//            tMarcasR.addRow(new Object[]{"Sin Informacion", "Sin Informacion"});
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getEstacion();
                row[1] = data.get(i).getTipoTorre();
                row[2] = data.get(i).getAltura() + " m ";
                row[3] = data.get(i).getEstado();
                row[4] = data.get(i).getUbicacion();
                tTorres.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_Torres.setModel(tTorres);
    } // Fin de listarR
    
    private void mostrarEstacionesCombo() {
        ArrayList<Estacion_Est> data = obtenerEstaciones();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Estaciones.addItem(data.get(i).getEst_nombre());
        }
    } // Fin del metodo
    
    private void mostrarTiposTCombo() {
        ArrayList<Tor_Tipos> data = obtenerTiposT();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_TiposT.addItem(data.get(i).getTipoT());
        }
    } // Fin del metodo
    
    private void mostrarEstadosTCombo() {
        ArrayList<Tor_Estados> data = obtenerEstadosT();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Estados.addItem(data.get(i).getEstado());
        }
    } // Fin del metodo
    
    private void mostrarUbicacionTCombo() {
        ArrayList<Tor_Ubicacion> data = obtenerUbicacionesT();
        int longitud = data.size();

        for (int i = 0; i < longitud; i++) {
            jCombo_Ubicacion.addItem(data.get(i).getUbicacion());
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
            java.util.logging.Logger.getLogger(Torre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Torre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Torre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Torre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Torre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Delete;
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Update;
    private javax.swing.JComboBox<String> jCombo_Estaciones;
    private javax.swing.JComboBox<String> jCombo_Estados;
    private javax.swing.JComboBox<String> jCombo_TiposT;
    private javax.swing.JComboBox<String> jCombo_Ubicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Altura;
    private javax.swing.JTable jT_Torres;
    // End of variables declaration//GEN-END:variables
}
