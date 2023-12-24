package vista;

import controlador.Negocio;
import java.awt.*;
import javax.swing.*;
import modelo.*;

public class FrmCalcular extends javax.swing.JFrame {
    private Negocio principal;
    Procedimiento d = new Procedimiento();
    Inercia i = new Inercia();
    int xMouse, yMouse;
    
    public FrmCalcular(Negocio general) {
        initComponents();
        this.setTitle("Calcular momento de inercia");
        
        if (general == null) {
            System.out.println("No hay Negocio, se crea nueva instancia");
            this.principal = new Negocio();
        } else {
            System.out.println("Hay Negocoi, se procede a incorporarlo");
            this.principal =  general;}
        lblcargoAhora.setText(principal.getCargoUsuarioLogin());
    }

    public void ShowPanel(JPanel panel){
        panel.setSize(800,600);
        panel.setLocation(0,0);
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    
    public double radioExt(){
        double radio = Double.parseDouble( txtRadioExt.getText());
        return radio;
    }
    
        public double radioInt(){
        double radio = Double.parseDouble( txtRadioInt.getText());
        return radio;
    }
    
    public double densidad(){
        double densidad = Double.parseDouble(txtDensidad.getText());
        return densidad;
    }
    
    private void valCamposNuméricos(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (c <'0' || c > '9' ) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se permiten ingresar carácteres numéricos");
        }
    }
    
    public void msj_error(String mensaje){
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean sonConsecutivos(double numero1, double numero2) {
        double menor = Math.min(numero1, numero2);
        double mayor = Math.max(numero1, numero2);
        
        return (mayor - menor == 1) && (menor >= 1 && mayor <= 5);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        minbtn = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        MenuBtns = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        btnProcedimiento = new javax.swing.JPanel();
        text6 = new javax.swing.JLabel();
        lblcargoAhora = new javax.swing.JLabel();
        lbltextocargoahora = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCalcular1 = new javax.swing.JToggleButton();
        btnRepasar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRadioExt = new javax.swing.JTextField();
        txtDensidad = new javax.swing.JTextField();
        txtRadioInt = new javax.swing.JTextField();
        text7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(37, 50, 55));
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

        header.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, -1));

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

        header.add(minbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Calcular momento de inercia");
        header.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 180, 20));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        MenuBtns.setBackground(new java.awt.Color(37, 50, 55));
        MenuBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(37, 50, 55));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });

        text3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio2.png"))); // NOI18N
        text3.setText("Inicio");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        btnCerrar.setBackground(new java.awt.Color(37, 50, 55));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        text4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text4.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 200, 50));

        btnCalcular.setBackground(new java.awt.Color(37, 50, 55));
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularMouseExited(evt);
            }
        });

        text5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/analitica2.png"))); // NOI18N
        text5.setText("Calcular");

        javax.swing.GroupLayout btnCalcularLayout = new javax.swing.GroupLayout(btnCalcular);
        btnCalcular.setLayout(btnCalcularLayout);
        btnCalcularLayout.setHorizontalGroup(
            btnCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCalcularLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        btnCalcularLayout.setVerticalGroup(
            btnCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCalcularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 40));

        btnProcedimiento.setBackground(new java.awt.Color(37, 50, 55));
        btnProcedimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcedimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcedimientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProcedimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProcedimientoMouseExited(evt);
            }
        });

        text6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text6.setForeground(new java.awt.Color(255, 255, 255));
        text6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura2.png"))); // NOI18N
        text6.setText("Acerca de");

        javax.swing.GroupLayout btnProcedimientoLayout = new javax.swing.GroupLayout(btnProcedimiento);
        btnProcedimiento.setLayout(btnProcedimientoLayout);
        btnProcedimientoLayout.setHorizontalGroup(
            btnProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProcedimientoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnProcedimientoLayout.setVerticalGroup(
            btnProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcedimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 40));

        lblcargoAhora.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblcargoAhora.setForeground(new java.awt.Color(102, 204, 255));
        lblcargoAhora.setText("#######");
        MenuBtns.add(lblcargoAhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 120, 20));

        lbltextocargoahora.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lbltextocargoahora.setForeground(new java.awt.Color(102, 204, 255));
        lbltextocargoahora.setText("c:");
        MenuBtns.add(lbltextocargoahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 20, 20));

        jPanel1.add(MenuBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 600));

        content.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese los datos:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Densidad (ρ):");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fórmula:");

        btnCalcular1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCalcular1.setText("Calcular");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        btnRepasar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRepasar.setText("Repasar mis conocimientos");
        btnRepasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepasarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Radio exterior (R):");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Radio interior (r):");

        txtRadioExt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtRadioExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRadioExtKeyTyped(evt);
            }
        });

        txtDensidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDensidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDensidadKeyTyped(evt);
            }
        });

        txtRadioInt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtRadioInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRadioIntKeyTyped(evt);
            }
        });

        text7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        text7.setForeground(new java.awt.Color(255, 255, 255));
        text7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/formula.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("A considerar:\n- Ningún valor puede ser 0.\n- R y r no pueden ser números consecutivos entre el 0 y el 5\n- R debe ser mayor que r");
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(text7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRadioExt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRadioInt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(153, 153, 153)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnCalcular1)
                .addGap(44, 44, 44)
                .addComponent(btnRepasar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(txtRadioExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtRadioInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular1)
                    .addComponent(btnRepasar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnProcedimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcedimientoMouseExited
        btnProcedimiento.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnProcedimientoMouseExited

    private void btnProcedimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcedimientoMouseEntered
        btnProcedimiento.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnProcedimientoMouseEntered

    private void btnProcedimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcedimientoMouseClicked
        FrmAcerca pan = new FrmAcerca();
        pan.setVisible(true);
    }//GEN-LAST:event_btnProcedimientoMouseClicked

    private void btnCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseExited
        btnCalcular.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnCalcularMouseExited

    private void btnCalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseEntered
        btnCalcular.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnCalcularMouseEntered

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked

    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        FrmCalcular lgn = new FrmCalcular(principal);

        principal.setCargoUsuarioLogin("");

        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        btnInicio.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        FrmCalcular ven = new FrmCalcular(principal);
        ven.setVisible(true);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        String[] txt = {"Las variables no pueden ser 0", "R debe ser mayor que r", "Las variables no pueden ser números consecutivos entre el 1 y el 5"};

        if (radioExt() != 0 && radioInt() != 0 && densidad() != 0) {
            //if (sonConsecutivos(radioExt(), radioInt())) {
                if (radioExt() > radioInt()) {
                    FrmProcedimiento prc = new FrmProcedimiento();
                    prc.setRadioExt(txtRadioExt.getText());
                    prc.setDensidad(txtDensidad.getText());
                    prc.setRadioInt(txtRadioInt.getText());
                    prc.setVisible(true);
                    String resultado = i.calcular(densidad(), radioExt(), radioInt());
                    prc.setResultado(resultado);
                } else {
                    msj_error(txt[1]);
                }
            /*} else {
                msj_error(txt[2]);
            }*/
        } else {
            msj_error(txt[0]);
        }
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void btnRepasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepasarActionPerformed
        FrmRepasar rps = new FrmRepasar();
        rps.setVisible(true);
    }//GEN-LAST:event_btnRepasarActionPerformed

    private void txtRadioExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRadioExtKeyTyped
        valCamposNuméricos(evt);
    }//GEN-LAST:event_txtRadioExtKeyTyped

    private void txtRadioIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRadioIntKeyTyped
        valCamposNuméricos(evt);
    }//GEN-LAST:event_txtRadioIntKeyTyped

    private void txtDensidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDensidadKeyTyped
        valCamposNuméricos(evt);
    }//GEN-LAST:event_txtDensidadKeyTyped
    
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
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Negocio aux = null;
                new FrmCalcular(aux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBtns;
    private javax.swing.JPanel btnCalcular;
    private javax.swing.JToggleButton btnCalcular1;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JLabel btnMin;
    private javax.swing.JPanel btnProcedimiento;
    private javax.swing.JToggleButton btnRepasar;
    private javax.swing.JPanel content;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblcargoAhora;
    private javax.swing.JLabel lbltextocargoahora;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtDensidad;
    private javax.swing.JTextField txtRadioExt;
    private javax.swing.JTextField txtRadioInt;
    // End of variables declaration//GEN-END:variables

    public Negocio getPrincipal() {
        return principal;
    }

    public void setPrincipal(Negocio principal) {
        this.principal = principal;
    }
}
