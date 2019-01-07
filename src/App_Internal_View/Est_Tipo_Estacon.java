
package App_Internal_View;

import static App_Controller.Controller_TipoEst.deleteTipoEst;
import static App_Controller.Controller_TipoEst.insertTipoEst;
import static App_Controller.Controller_TipoEst.obtenerTipoEst;
import static App_Controller.Controller_TipoEst.updateTipoEst;
import App_Controller.TipoEst;
import App_Main_View.Estacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Est_Tipo_Estacon extends javax.swing.JFrame {

    public Est_Tipo_Estacon() {
        initComponents();
        listarZonas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jText_TipoEst = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jB_Guardar = new javax.swing.JButton();
        jB_Update = new javax.swing.JButton();
        jB_Delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_TipoEst = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tipo de Estación");
        setPreferredSize(new java.awt.Dimension(382, 400));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jText_TipoEst.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jText_TipoEst.setToolTipText("");
        jText_TipoEst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jText_TipoEst.setPreferredSize(new java.awt.Dimension(360, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 240));
        jLabel2.setText("Tipo de Estación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_TipoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_TipoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo de Estaciones");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jB_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jB_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jB_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jT_TipoEst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Estaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_TipoEst.setColumnSelectionAllowed(true);
        jT_TipoEst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_TipoEst.getTableHeader().setReorderingAllowed(false);
        jT_TipoEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_TipoEstMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jT_TipoEst);
        jT_TipoEst.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        String data1 = jText_TipoEst.getText();
        if (data1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Existen campos vacios", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            insertTipoEst(data1);
            listarZonas();
            jText_TipoEst.setText("");
        } // Fin de else
    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void jT_TipoEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_TipoEstMouseClicked
         if (evt.getClickCount() == 2 && !evt.isConsumed()) {   
            int row = jT_TipoEst.getSelectedRow();
            String dato1 = jT_TipoEst.getModel().getValueAt(row, 0).toString();
            jB_Guardar.setEnabled(false);
            jB_Update.setEnabled(true);
            jText_TipoEst.setText(dato1);
        } else {
            jB_Guardar.setEnabled(true);
            jB_Update.setEnabled(false);
            jText_TipoEst.setText("");
            
        }
    }//GEN-LAST:event_jT_TipoEstMouseClicked

    private void jB_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_UpdateActionPerformed
        ArrayList<TipoEst> data = obtenerTipoEst();
        int row = jT_TipoEst.getSelectedRow();

        if (jT_TipoEst.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_TipoEst = data.get(row).getId_tipo_est();
            String dato1 = jText_TipoEst.getText();
            updateTipoEst(id_TipoEst, dato1);
            jText_TipoEst.setText("");
            jB_Guardar.setEnabled(true);
            listarZonas();
        }
    }//GEN-LAST:event_jB_UpdateActionPerformed

    private void jB_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteActionPerformed
        ArrayList<TipoEst> data = obtenerTipoEst();
        int row = jT_TipoEst.getSelectedRow();

        if (jT_TipoEst.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                int idTipoEst = data.get(row).getId_tipo_est();
                deleteTipoEst(idTipoEst);
                listarZonas();
                jText_TipoEst.setText("");
                jB_Guardar.setEnabled(true);
            }
        } // Fin de else
    }//GEN-LAST:event_jB_DeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        mostrarVentanaEst();
    }//GEN-LAST:event_formWindowClosing
    
    public void listarZonas() {
        DefaultTableModel tTipoEst = (DefaultTableModel) jT_TipoEst.getModel();
        tTipoEst.setRowCount(0);
        ArrayList<TipoEst> data = obtenerTipoEst();
        Object[] row = new Object[2];
        int longitud = data.size();

        if (longitud == 0) {
            tTipoEst.setRowCount(0);
//            tTipoEst.addRow(new Object[]{"Sin Informacion"});
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getnTipo_est();
                tTipoEst.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_TipoEst.setModel(tTipoEst);
    } // Fin del metodo
    
    public void mostrarVentanaEst() {
        dispose();
        Estacion est = new Estacion();
        est.setVisible(true);
        est.setResizable(false);
        est.setLocationRelativeTo(null);
    }
    
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
            java.util.logging.Logger.getLogger(Est_Tipo_Estacon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Est_Tipo_Estacon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Est_Tipo_Estacon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Est_Tipo_Estacon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Est_Tipo_Estacon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Delete;
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT_TipoEst;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText_TipoEst;
    // End of variables declaration//GEN-END:variables
}
