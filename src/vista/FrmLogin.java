package vista;

import controlador.Negocio;
import estructuradatos.TablaHash;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class FrmLogin extends javax.swing.JFrame {
    private Negocio nlogin;
    int xMouse, yMouse;
    public FrmLogin(Negocio general) {
        initComponents();
        setTitle("Inicio de sesión");
        setLocationRelativeTo(null);
        
        if (general == null) {
            System.out.println("No hay Negocio, se crea nueva instancia");
            this.nlogin = new Negocio();
        } else {
            System.out.println("Hay Negocio, se procede a incorporarlo");
            this.nlogin =  general;}
        
    }   
    
    public void ver_imagen(){        
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("user-icon.jpg"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(Logo.getWidth(),
                Logo.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        Logo.setIcon(iconoEscalado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        btnAcerca = new javax.swing.JPanel();
        Acerca = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JPanel();
        Ingresar = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        errorCon = new javax.swing.JLabel();
        errorUs = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        campoUsu = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JLabel();
        campoCon = new javax.swing.JPasswordField();
        Separator2 = new javax.swing.JSeparator();
        passicon = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        minbtn = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelLogin.setBackground(new java.awt.Color(0, 51, 51));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcerca.setBackground(new java.awt.Color(102, 102, 102));
        btnAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcercaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcercaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcercaMouseExited(evt);
            }
        });

        Acerca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Acerca.setForeground(new java.awt.Color(255, 255, 255));
        Acerca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acerca.setText("Acerca del programa");

        javax.swing.GroupLayout btnAcercaLayout = new javax.swing.GroupLayout(btnAcerca);
        btnAcerca.setLayout(btnAcercaLayout);
        btnAcercaLayout.setHorizontalGroup(
            btnAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAcercaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Acerca)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnAcercaLayout.setVerticalGroup(
            btnAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAcercaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Acerca, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelLogin.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 150, 30));

        btnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });

        Ingresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ingresar.setText("Ingresar");

        javax.swing.GroupLayout btnIngresarLayout = new javax.swing.GroupLayout(btnIngresar);
        btnIngresar.setLayout(btnIngresarLayout);
        btnIngresarLayout.setHorizontalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 130, 30));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-icon.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setMaximumSize(new java.awt.Dimension(512, 512));
        Logo.setMinimumSize(new java.awt.Dimension(512, 512));
        PanelLogin.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 170));
        PanelLogin.add(errorCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 20, 20));
        PanelLogin.add(errorUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 20, 20));

        Usuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario");
        PanelLogin.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 20));

        campoUsu.setBackground(new java.awt.Color(51, 51, 51));
        campoUsu.setForeground(new java.awt.Color(255, 255, 255));
        campoUsu.setBorder(null);
        campoUsu.setCaretColor(new java.awt.Color(255, 255, 255));
        campoUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoUsuKeyPressed(evt);
            }
        });
        PanelLogin.add(campoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, 20));
        PanelLogin.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 10));

        Contraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña");
        PanelLogin.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 20));

        campoCon.setBackground(new java.awt.Color(51, 51, 51));
        campoCon.setForeground(new java.awt.Color(255, 255, 255));
        campoCon.setActionCommand("<Not Set>");
        campoCon.setBorder(null);
        campoCon.setCaretColor(new java.awt.Color(255, 255, 255));
        campoCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoConKeyPressed(evt);
            }
        });
        PanelLogin.add(campoCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 20));
        PanelLogin.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 180, 10));

        passicon.setIcon(new javax.swing.ImageIcon("/image/ocultar.png"));
        passicon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passiconMouseClicked(evt);
            }
        });
        PanelLogin.add(passicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 20, 20));

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

        header.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, -1));

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

        header.add(minbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 30, 30));

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Ingresar Cuenta");
        header.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 130, 20));

        PanelLogin.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        minbtn.setBackground(new java.awt.Color(89,89,89));
    }//GEN-LAST:event_btnMinMouseExited

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        minbtn.setBackground(new java.awt.Color(120,120,120));
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(FrmCalcular.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        exitbtn.setBackground(new java.awt.Color(89,89,89));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        exitbtn.setBackground(new java.awt.Color(211,77,77));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void passiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passiconMouseClicked

    }//GEN-LAST:event_passiconMouseClicked

    private void campoConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConKeyPressed
        enterLogin(evt);
    }//GEN-LAST:event_campoConKeyPressed

    private void campoUsuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuKeyPressed
        enterLogin(evt);
    }//GEN-LAST:event_campoUsuKeyPressed

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        String contra = new String(campoCon.getPassword());
        String usuar = campoUsu.getText().toString();

        String mensaje = "";
        boolean datosValicion = false;

        if (usuar.equals("") && contra.equals("")) {
            datosValicion = false;
            mensaje = "Falta Usuario y Contraseña";

        } else if (usuar.equals("")) {
            datosValicion = false;
            mensaje = "Falta Usuario";

            errorCon.setIcon(null);
        } else if (contra.equals("")) {
            datosValicion = false;
            mensaje = "Falta Contraseña";

            errorUs.setIcon(null);
        } else {
            datosValicion = true;

            errorUs.setIcon(null);
            errorCon.setIcon(null);
        }

        if (datosValicion) {

            TablaHash tblLogin = nlogin.getTablaLogin();
            Usuario userdato = tblLogin.obtenerValorTabHash(usuar);

            if (userdato != null) {
                if (contra.equals(userdato.getContraseña())) {
                    System.out.println("Contraseña igual");

                    FrmCalcular mn = new FrmCalcular(nlogin);
                    mn.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "La Contraseña no coincide", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe", "Usuario no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, ""+mensaje,"Faltan Datos",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseExited
        btnAcerca.setBackground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_btnAcercaMouseExited

    private void btnAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseEntered
        btnAcerca.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnAcercaMouseEntered

    private void btnAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseClicked
        FrmAcerca acr = new FrmAcerca();
        acr.setVisible(true);
    }//GEN-LAST:event_btnAcercaMouseClicked
    
    boolean mostrarContrasena = false;
    public void enterLogin(java.awt.event.KeyEvent evt){
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresarMouseClicked(null);
        }
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
            java.util.logging.Logger.getLogger(FrmCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Negocio aux = null;
                new FrmLogin(aux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acerca;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Ingresar;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel btnAcerca;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnIngresar;
    private javax.swing.JLabel btnMin;
    private javax.swing.JPasswordField campoCon;
    private javax.swing.JTextField campoUsu;
    private javax.swing.JLabel errorCon;
    private javax.swing.JLabel errorUs;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel passicon;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
