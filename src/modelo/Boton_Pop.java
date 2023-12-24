package modelo;

import javax.swing.*;
import java.awt.event.*;
import vista.*;

public class Boton_Pop {
    private static JFrame frame = new JFrame();
    
    public void boton_popout() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setTitle("Pregunta");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                frame.setLocationRelativeTo(null);

                JPanel mainPanel = new JPanel();
                frame.add(mainPanel);

                JLabel lbImagen = new javax.swing.JLabel();
                lbImagen.setText("¿Desea realizar el cuestionario de nuevo?");
                
                JRadioButton radioButton1 = new JRadioButton("Si");
                JRadioButton radioButton2 = new JRadioButton("No");

                ButtonGroup buttonGroup = new ButtonGroup();
                buttonGroup.add(radioButton1);
                buttonGroup.add(radioButton2);
                
                radioButton1.addActionListener(new BotonSiPulsado());
                radioButton2.addActionListener(new BotonNoPulsado());
                
                mainPanel.add(lbImagen);
                mainPanel.add(radioButton1);
                mainPanel.add(radioButton2);
                frame.setVisible(true);
            }
        });
    }
    
    private static class BotonSiPulsado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrmRepasar nuevoFormulario = new FrmRepasar();
            frame.dispose();
        }
    }
    
    private static class BotonNoPulsado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }    					
}