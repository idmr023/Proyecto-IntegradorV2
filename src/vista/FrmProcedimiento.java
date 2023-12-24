package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Procedimiento;

public class FrmProcedimiento extends javax.swing.JFrame {
    
    private String radioExt, densidad, radioInt, resultado;
    Procedimiento proc = new Procedimiento();
    int xMouse, yMouse;
    
    public FrmProcedimiento() {
        initComponents();
        setTitle("FRM_Procedimiento");
        setLocationRelativeTo(null);
    }
    
    public void setRadioExt(String radioExt){
        this.radioExt = radioExt;
        txtRadExt.setText(radioExt);
    }
    
    public void setDensidad(String densidad){
        this.densidad = densidad;
        txtDensidad.setText(densidad);
    }
    
    public void setRadioInt(String radioInt){
        this.radioInt = radioInt;
        txtRadInt.setText(radioInt);
        txtRadInt2.setText(radioInt);
    }
    
    public void setResultado(String resultado){
        this.resultado = radioInt;
        txtRes.setText(resultado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        txtRes = new javax.swing.JTextField();
        txtRadInt = new javax.swing.JTextField();
        txtRadExt = new javax.swing.JTextField();
        txtDensidad = new javax.swing.JTextField();
        txtRadInt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtRadInt3 = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        minbtn = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jToggleButton1.setText("Guardar procedimiento en PDF");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 650, -1, -1));

        txtRes.setEditable(false);
        txtRes.setBackground(new java.awt.Color(255, 255, 255));
        txtRes.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtRes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRes.setBorder(null);
        txtRes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRes.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRes.setEnabled(false);
        getContentPane().add(txtRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 160, 60));

        txtRadInt.setEditable(false);
        txtRadInt.setBackground(new java.awt.Color(255, 255, 255));
        txtRadInt.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        txtRadInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRadInt.setBorder(null);
        txtRadInt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRadInt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRadInt.setEnabled(false);
        getContentPane().add(txtRadInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 20, 20));

        txtRadExt.setEditable(false);
        txtRadExt.setBackground(new java.awt.Color(255, 255, 255));
        txtRadExt.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        txtRadExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRadExt.setBorder(null);
        txtRadExt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRadExt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRadExt.setEnabled(false);
        txtRadExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadExtActionPerformed(evt);
            }
        });
        getContentPane().add(txtRadExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 20, 20));

        txtDensidad.setEditable(false);
        txtDensidad.setBackground(new java.awt.Color(255, 255, 255));
        txtDensidad.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtDensidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDensidad.setBorder(null);
        txtDensidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDensidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtDensidad.setEnabled(false);
        getContentPane().add(txtDensidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 30, 20));

        txtRadInt2.setEditable(false);
        txtRadInt2.setBackground(new java.awt.Color(255, 255, 255));
        txtRadInt2.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        txtRadInt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRadInt2.setBorder(null);
        txtRadInt2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRadInt2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRadInt2.setEnabled(false);
        getContentPane().add(txtRadInt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procedimiento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 900, 660));

        txtRadInt3.setEditable(false);
        txtRadInt3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtRadInt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRadInt3.setBorder(null);
        txtRadInt3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRadInt3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRadInt3.setEnabled(false);
        getContentPane().add(txtRadInt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 20, 20));

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitbtn.setBackground(new java.awt.Color(89, 89, 89));

        btnExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        header.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, -1));

        minbtn.setBackground(new java.awt.Color(89, 89, 89));

        btnMin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("_");
        btnMin.setToolTipText("");
        btnMin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minbtnLayout = new javax.swing.GroupLayout(minbtn);
        minbtn.setLayout(minbtnLayout);
        minbtnLayout.setHorizontalGroup(
            minbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        minbtnLayout.setVerticalGroup(
            minbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        header.add(minbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Procedimiento");
        header.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 130, 20));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            proc.procedimiento("FRM_Procedimiento");
        } catch (Exception ex) {
            Logger.getLogger(FrmProcedimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtRadExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadExtActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        exitbtn.setBackground(new java.awt.Color(211,77,77));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        exitbtn.setBackground(new java.awt.Color(89,89,89));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(FrmCalcular.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        minbtn.setBackground(new java.awt.Color(120,120,120));
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        minbtn.setBackground(new java.awt.Color(89,89,89));
    }//GEN-LAST:event_btnMinMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

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
            java.util.logging.Logger.getLogger(FrmProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProcedimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMin;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtDensidad;
    private javax.swing.JTextField txtRadExt;
    private javax.swing.JTextField txtRadInt;
    private javax.swing.JTextField txtRadInt2;
    private javax.swing.JTextField txtRadInt3;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
