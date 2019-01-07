
package App_Internal_View;


import static App_Controller.Controller_Zona.deleteZona;
import static App_Controller.Controller_Zona.insertZona;
import static App_Controller.Controller_Zona.obtenerZonas;
import static App_Controller.Controller_Zona.updateZona;
import App_Controller.Zona;
import App_Main_View.Estacion;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public final class Est_Zona extends javax.swing.JFrame {

    public Est_Zona() {
        initComponents();
        listarZonas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        clave_Zona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre_Zona = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        guardarZona = new javax.swing.JButton();
        editar_Zona = new javax.swing.JButton();
        eliminar_Zona = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_Zonas = new javax.swing.JTable();

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
        setTitle("Zonas");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        clave_Zona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        clave_Zona.setToolTipText("");
        clave_Zona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        clave_Zona.setPreferredSize(new java.awt.Dimension(360, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 109, 240));
        jLabel2.setText("Clave Zona:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 109, 240));
        jLabel3.setText("Nombre Zona:");

        nombre_Zona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nombre_Zona.setToolTipText("");
        nombre_Zona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nombre_Zona.setPreferredSize(new java.awt.Dimension(360, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(clave_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zonas");

        guardarZona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        guardarZona.setText("Guardar");
        guardarZona.setBorder(null);
        guardarZona.setPreferredSize(new java.awt.Dimension(75, 30));
        guardarZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarZonaActionPerformed(evt);
            }
        });

        editar_Zona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        editar_Zona.setText("Actualizar");
        editar_Zona.setBorder(null);
        editar_Zona.setPreferredSize(new java.awt.Dimension(75, 30));
        editar_Zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_ZonaActionPerformed(evt);
            }
        });

        eliminar_Zona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        eliminar_Zona.setText("Eliminar");
        eliminar_Zona.setBorder(null);
        eliminar_Zona.setPreferredSize(new java.awt.Dimension(75, 30));
        eliminar_Zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_ZonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(guardarZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editar_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(guardarZona, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(editar_Zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar_Zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jT_Zonas.setBackground(null);
        jT_Zonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Zonas.setToolTipText("");
        jT_Zonas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jT_Zonas.getTableHeader().setReorderingAllowed(false);
        jT_Zonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ZonasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jT_Zonas);
        jT_Zonas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jT_Zonas.getColumnModel().getColumnCount() > 0) {
            jT_Zonas.getColumnModel().getColumn(0).setResizable(false);
            jT_Zonas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jT_Zonas.getColumnModel().getColumn(1).setResizable(false);
        }

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarZonaActionPerformed
     
        String data1 = clave_Zona.getText();
        String data2 = nombre_Zona.getText();
        if (data1.isEmpty() || data2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Existen campos vacios", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            insertZona(data1, data2);
            clave_Zona.setText("");
            nombre_Zona.setText("");
            listarZonas();
        } // Fin de else
    }//GEN-LAST:event_guardarZonaActionPerformed

    private void editar_ZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_ZonaActionPerformed
        ArrayList<Zona> data = obtenerZonas();
        int row = jT_Zonas.getSelectedRow(); 
      
        if(jT_Zonas.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int idZona = data.get(row).getIdZona();
            String dato1 = clave_Zona.getText();
            String dato2 = nombre_Zona.getText();
            updateZona(idZona,dato1, dato2 );
            clave_Zona.setText("");
            nombre_Zona.setText("");
            guardarZona.setEnabled(true);
            listarZonas();
        }
    }//GEN-LAST:event_editar_ZonaActionPerformed

    private void jT_ZonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ZonasMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            int row = jT_Zonas.getSelectedRow();
            String dato1 = jT_Zonas.getModel().getValueAt(row, 0).toString();
            String dato2 = jT_Zonas.getModel().getValueAt(row, 1).toString();
            clave_Zona.setText(dato1);
            nombre_Zona.setText(dato2);
            guardarZona.setEnabled(false);
            editar_Zona.setEnabled(true);
        } else { 
            clave_Zona.setText("");
            nombre_Zona.setText("");
            guardarZona.setEnabled(true);
            editar_Zona.setEnabled(false);
        }
    }//GEN-LAST:event_jT_ZonasMouseClicked

    private void eliminar_ZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_ZonaActionPerformed
        ArrayList<Zona> data = obtenerZonas();
        int row = jT_Zonas.getSelectedRow();

        if (jT_Zonas.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Seguro que de sea eliminar el registro?", "CEM-Información",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                int idZona = data.get(row).getIdZona();
                deleteZona(idZona);
                listarZonas();
                clave_Zona.setText("");
                nombre_Zona.setText("");
                guardarZona.setEnabled(true);
            }
        } // Fin de else
    }//GEN-LAST:event_eliminar_ZonaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        mostrarVentanaEst();
    }//GEN-LAST:event_formWindowClosing

    public void listarZonas(){
        DefaultTableModel tZonas = (DefaultTableModel) jT_Zonas.getModel();
        tZonas.setRowCount(0);
        ArrayList<Zona> data = obtenerZonas();
        Object[] row = new Object[3];
        int longitud = data.size();

        if (longitud == 0) {
            tZonas.setRowCount(0);
//            tZonas.addRow(new Object[]{"Sin Informacion","Sin Informacion"});
        } else {
            for (int i = 0; i < longitud; i++) {
                row[0] = data.get(i).getClaveZona();
                row[1] = data.get(i).getNombreZona();
                tZonas.addRow(row);
            } // Fin de for
        } // Fin de else
        jT_Zonas.setModel(tZonas);
    } // Fin del metodo

   public void mostrarVentanaEst(){
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
            java.util.logging.Logger.getLogger(Est_Zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Est_Zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Est_Zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Est_Zona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Est_Zona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clave_Zona;
    private javax.swing.JButton editar_Zona;
    private javax.swing.JButton eliminar_Zona;
    private javax.swing.JButton guardarZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT_Zonas;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre_Zona;
    // End of variables declaration//GEN-END:variables
}
