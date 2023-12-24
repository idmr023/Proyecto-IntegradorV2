package modelo;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.*; 

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Procedimiento {
    private static final String RUTA_IMAGEN = "descargas/captura_ventana.png";

    public static void procedimiento(String ventana) throws Exception{
        PasarAPDF a = new PasarAPDF();
        HWND ventanaObjetivo = obtenerVentanaXTítulo(ventana);

        if (ventanaObjetivo != null) {
            capturarVentana(ventanaObjetivo, RUTA_IMAGEN);
            JOptionPane.showMessageDialog(null,"Procedimiento guardado",
                    "Descargar Procedimiento",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró la ventana de interés", "Error", JOptionPane.ERROR_MESSAGE);
        }
        a.pdfAimg(RUTA_IMAGEN);
    }
    
    public static HWND obtenerVentanaXTítulo(String windowTitle) {
        User32 user32 = User32.INSTANCE;
        HWND hwnd = user32.FindWindow(null, windowTitle);
        return hwnd;
    }

    public static void capturarVentana(HWND hwnd, String outputFile) {
        User32 user32 = User32.INSTANCE;
        RECT rect = new RECT();
        user32.GetWindowRect(hwnd, rect);

        int width = rect.right - rect.left;
        int height = rect.bottom - rect.top;

        Robot robot;
        try {
            robot = new Robot();
            BufferedImage capturaVentana = robot.createScreenCapture(
                    new Rectangle(rect.left, rect.top, width, height)
            );

            File outputImageFile = new File(outputFile);
            ImageIO.write(capturaVentana, "png", outputImageFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}