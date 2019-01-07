
package App_Main_View;

import App_Internal_View.Est_Centro_Trabajo;
import App_Internal_View.Est_Responsable;



public class Registro_Elementos extends javax.swing.JFrame {


    public Registro_Elementos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Form_Estacion = new javax.swing.JButton();
        Form_Radio = new javax.swing.JButton();
        Form_Antena = new javax.swing.JButton();
        Form_Torre = new javax.swing.JButton();
        Form_MotoGen = new javax.swing.JButton();
        Form_PantaFza = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CEM - Registro de Elementos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 109, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formularios de Registro");

        Form_Estacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/002-web-page-home.png"))); // NOI18N
        Form_Estacion.setToolTipText("");
        Form_Estacion.setFocusable(false);
        Form_Estacion.setMaximumSize(new java.awt.Dimension(60, 60));
        Form_Estacion.setMinimumSize(new java.awt.Dimension(60, 60));
        Form_Estacion.setPreferredSize(new java.awt.Dimension(60, 60));
        Form_Estacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_EstacionActionPerformed(evt);
            }
        });

        Form_Radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/004-car-radio.png"))); // NOI18N
        Form_Radio.setToolTipText("");
        Form_Radio.setFocusable(false);
        Form_Radio.setMaximumSize(new java.awt.Dimension(60, 60));
        Form_Radio.setMinimumSize(new java.awt.Dimension(60, 60));
        Form_Radio.setPreferredSize(new java.awt.Dimension(60, 60));
        Form_Radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_RadioActionPerformed(evt);
            }
        });

        Form_Antena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/010-satellite-dish-1.png"))); // NOI18N
        Form_Antena.setToolTipText("");
        Form_Antena.setFocusable(false);
        Form_Antena.setMaximumSize(new java.awt.Dimension(60, 60));
        Form_Antena.setMinimumSize(new java.awt.Dimension(60, 60));
        Form_Antena.setPreferredSize(new java.awt.Dimension(60, 60));
        Form_Antena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_AntenaActionPerformed(evt);
            }
        });

        Form_Torre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/012-communication-tower.png"))); // NOI18N
        Form_Torre.setToolTipText("");
        Form_Torre.setFocusable(false);
        Form_Torre.setMaximumSize(new java.awt.Dimension(60, 60));
        Form_Torre.setMinimumSize(new java.awt.Dimension(60, 60));
        Form_Torre.setPreferredSize(new java.awt.Dimension(60, 60));
        Form_Torre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_TorreActionPerformed(evt);
            }
        });

        Form_MotoGen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/003-power.png"))); // NOI18N
        Form_MotoGen.setToolTipText("");
        Form_MotoGen.setFocusable(false);
        Form_MotoGen.setMaximumSize(new java.awt.Dimension(60, 60));
        Form_MotoGen.setMinimumSize(new java.awt.Dimension(60, 60));
        Form_MotoGen.setPreferredSize(new java.awt.Dimension(60, 60));
        Form_MotoGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_MotoGenActionPerformed(evt);
            }
        });

        Form_PantaFza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Resources/002-power-bank.png"))); // NOI18N
        Form_PantaFza.setToolTipText("");
        Form_PantaFza.setFocusable(false);
        Form_PantaFza.setMaximumSize(new java.awt.Dimension(60, 60));
        Form_PantaFza.setMinimumSize(new java.awt.Dimension(60, 60));
        Form_PantaFza.setPreferredSize(new java.awt.Dimension(60, 60));
        Form_PantaFza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_PantaFzaActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Estación");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Radio");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Antena");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Torre");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Planta Fza");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Moto Gen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Form_Estacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_Radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_Antena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Form_Torre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Form_PantaFza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Form_MotoGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Form_MotoGen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Form_Estacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Form_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Form_Antena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Form_Torre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Form_PantaFza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(jLabel32)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Form_EstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_EstacionActionPerformed
//        this.setExtendedState(Registro_Elementos.ICONIFIED);    
        Estacion fEst = new Estacion();
        fEst.setVisible(true);
        fEst.setResizable(false);
        fEst.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Form_EstacionActionPerformed

    private void Form_RadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_RadioActionPerformed
        dispose();
        Radio fRadio = new Radio();
        fRadio.setVisible(true);
        fRadio.setResizable(false);
        fRadio.setLocationRelativeTo(null);
    }//GEN-LAST:event_Form_RadioActionPerformed

    private void Form_AntenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_AntenaActionPerformed
        dispose();
        Antena fAntena = new Antena();
        fAntena.setVisible(true);
        fAntena.setResizable(false);
        fAntena.setLocationRelativeTo(null);
    }//GEN-LAST:event_Form_AntenaActionPerformed

    private void Form_TorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_TorreActionPerformed
        dispose();
        Torre fTorre = new Torre();
        fTorre.setVisible(true);
        fTorre.setResizable(false);
        fTorre.setLocationRelativeTo(null);
    }//GEN-LAST:event_Form_TorreActionPerformed

    private void Form_PantaFzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_PantaFzaActionPerformed
        dispose();
        Planta_Fza fPlantaFza = new Planta_Fza();
        fPlantaFza.setVisible(true);
        fPlantaFza.setResizable(false);
        fPlantaFza.setLocationRelativeTo(null);
    }//GEN-LAST:event_Form_PantaFzaActionPerformed

    private void Form_MotoGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_MotoGenActionPerformed
        dispose();
        Moto_Gen fMotoGen = new Moto_Gen();
        fMotoGen.setVisible(true);
        fMotoGen.setResizable(false);
        fMotoGen.setLocationRelativeTo(null);
    }//GEN-LAST:event_Form_MotoGenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
        Menu_Principal mainMenu = new Menu_Principal();
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Registro_Elementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Elementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Elementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Elementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Elementos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Form_Antena;
    private javax.swing.JButton Form_Estacion;
    private javax.swing.JButton Form_MotoGen;
    private javax.swing.JButton Form_PantaFza;
    private javax.swing.JButton Form_Radio;
    private javax.swing.JButton Form_Torre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
