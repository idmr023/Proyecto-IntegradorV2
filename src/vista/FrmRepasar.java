package vista;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelo.*;

public class FrmRepasar extends javax.swing.JFrame {
    static String urlBD = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQdsIW3xFFGqG83fJtkh8ZK8MlVpHRTsBiaxBe4uAQlJp3MMTgA_BdLBgYr7Od7Vv3--DoryREd-1Ez/pub?output=tsv";
    static String textoBaseDePreguntas = LeerArchivo_ASCII(urlBD);
    static String[] renglones = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones.length;

    static String[][] baseDePreguntas = new String[cantidadDePreguntas][5];
    
    Descargar desc = new Descargar();
    Boton_Pop pop = new Boton_Pop();
    int xMouse, yMouse;
       
    public FrmRepasar() {
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            baseDePreguntas[i] = renglon.split("\t");
        }
        
        initComponents();
        setSize(811, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        jugar();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        minbtn = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        lbPregunta = new javax.swing.JLabel();
        btnOpc1 = new javax.swing.JButton();
        btnOpc3 = new javax.swing.JButton();
        btnOpc4 = new javax.swing.JButton();
        btnOpc2 = new javax.swing.JButton();
        lbImagen = new javax.swing.JLabel();
        btnDescargarProc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 50, 51));
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 50, 51));

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
        titulo.setText("Repasar conocimientos");
        header.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 150, 20));

        lbPregunta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lbPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPregunta.setText("Pregunta");

        btnOpc1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOpc1.setText("Opción 1");
        btnOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc1ActionPerformed(evt);
            }
        });

        btnOpc3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOpc3.setText("Opción 3");
        btnOpc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc3ActionPerformed(evt);
            }
        });

        btnOpc4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOpc4.setText("Opción 4");
        btnOpc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc4ActionPerformed(evt);
            }
        });

        btnOpc2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOpc2.setText("Opción 2");
        btnOpc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpc2ActionPerformed(evt);
            }
        });

        lbImagen.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagen.setText("Imagen");

        btnDescargarProc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescargarProc.setText("Descargar procedimiento");
        btnDescargarProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarProcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDescargarProc)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOpc2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOpc4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpc3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(90, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(btnDescargarProc)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(btnOpc1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOpc2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOpc3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOpc4)
                            .addGap(78, 78, 78)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc1ActionPerformed
        escogerRespuesta(0);
    }//GEN-LAST:event_btnOpc1ActionPerformed

    private void btnOpc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc2ActionPerformed
        escogerRespuesta(1);
    }//GEN-LAST:event_btnOpc2ActionPerformed

    private void btnOpc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc3ActionPerformed
        escogerRespuesta(2);
    }//GEN-LAST:event_btnOpc3ActionPerformed

    private void btnOpc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpc4ActionPerformed
        escogerRespuesta(3);
    }//GEN-LAST:event_btnOpc4ActionPerformed

    private void btnDescargarProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarProcActionPerformed
        desc.DescArchivo();
    }//GEN-LAST:event_btnDescargarProcActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
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

    String[] preguntaEscogida;
    String pregunta;
    String respuesta;
    String img;
    int j = 0,k = 0;
    ArrayList<String> Opciones = new ArrayList<>();

    int n_pregunta = 0;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        new FrmRepasar();
    }

    public void escogerPregunta(int n) {
        preguntaEscogida = baseDePreguntas[n];
        pregunta = preguntaEscogida[0];
        respuesta = preguntaEscogida[1];
        if (preguntaEscogida.length > 5) {
            img = preguntaEscogida[5];
        } else {
            img = "";
        }
        Opciones.clear();
        for (int i = 1; i < 5; i++) {
            Opciones.add(preguntaEscogida[i]);
        }
        for (int i = 0; i < 4; i++) {
            Collections.shuffle(Opciones);
        }
    }
    
    public void mostrarPregunta() {
        lbPregunta.setText(pregunta);
        if (img.equals("")) {
            lbImagen.setVisible(false);
        } else {
            lbImagen.setVisible(true);
            lbImagen.setText("");
            try {
                BufferedImage imagen = ImageIO.read(new URL(img));
                Image imagenEscalada = imagen.getScaledInstance(-1, 100, Image.SCALE_SMOOTH);
                lbImagen.setIcon(new ImageIcon(imagenEscalada));
            } catch (Exception e) {
                lbImagen.setText("La imágen no se pudo cargar");
                lbImagen.setIcon(null);
            }
        }
        btnOpc1.setText(Opciones.get(0));
        btnOpc2.setText(Opciones.get(1));
        btnOpc3.setText(Opciones.get(2));
        btnOpc4.setText(Opciones.get(3));
    }
    
    void escogerRespuesta(int n) {
        if (Opciones.get(n).equals(respuesta)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Su respuesta es correcta",
                    "Respuesta acertada",
                    JOptionPane.INFORMATION_MESSAGE
            );
            j++;
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Su respuesta es incorrecta, la respuesta es: " + respuesta,
                    "Respuesta equivocada",
                    JOptionPane.ERROR_MESSAGE
            );
            k++;
        }
        try {
            jugar();
        } catch (Exception e) {
            
        }
    }

    public void jugar() {
        if (n_pregunta == cantidadDePreguntas) {
            JOptionPane.showMessageDialog(
                    this,
                    "Repuestas correctas: "+j + " \tRespuestas incorrectas: "+k,
                    "Cuestionario Terminado",
                    JOptionPane.PLAIN_MESSAGE
            );
            
            pop.boton_popout();
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
    }
    
    public static String LeerArchivo_ASCII(String ruta) {
        try {
            if (ruta == null) {
                throw new RuntimeException("Error, la URL de lectura no puede ser nula");
            }
            URL url = new URL(ruta);
            URLConnection conexión = url.openConnection();
            InputStreamReader isr = new InputStreamReader(conexión.getInputStream());
            return LeerArchivo_ASCII(isr);
        } catch (Exception e) {
            System.out.println("No hay conexión a internet, la base de datos no pudo ser cargada");
            System.exit(0);
        }
        return "";
    }

    public static String LeerArchivo_ASCII(Reader reader) throws Exception {
        BufferedReader br = new BufferedReader(reader);
        String texto = "";
        String linea;
        boolean primerRenglón = true;
        while ((linea = br.readLine()) != null) {
            if (primerRenglón) {
                primerRenglón = false;
            } else {
                texto += "\n";
            }
            texto += linea;
        }
        reader.close();
        br.close();
        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargarProc;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMin;
    private javax.swing.JButton btnOpc1;
    private javax.swing.JButton btnOpc2;
    private javax.swing.JButton btnOpc3;
    private javax.swing.JButton btnOpc4;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbPregunta;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}