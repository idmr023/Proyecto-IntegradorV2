package modelo;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Descargar {
    public static void DescArchivo(){
        String url = "https://drive.google.com/uc?id=1vQsACZ1jHY9k50IWugzt44vwfHQ6OeZ8&export=download"; 
        String name = "procedimiento.pdf";

        String folder = "descargas/";
        String txt;

        //Crea el directorio de destino en caso de que no exista
        File dir = new File(folder);

        if (!dir.exists())
          if (!dir.mkdir())
            return;
        
        File file = new File(folder + name);
        
        try {
            URLConnection conn = new URL(url).openConnection();
            conn.connect();
            txt = "\nEmpezando descarga: \n>> URL: " + url
                   + "\n >> Nombre: " + name
                   + "\n >> tamaño: " + conn.getContentLength() + " bytes";
            JOptionPane.showMessageDialog(null, txt,
                    "Iniciando descarga",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
            InputStream in = conn.getInputStream();
            OutputStream out = new FileOutputStream(file);

            int b = 0;
            while (b != -1) {
              b = in.read();
              if (b != -1)
                out.write(b);
            }

            out.close();
            in.close();

         } catch (MalformedURLException e) {
             JOptionPane.showInputDialog("la url: " + url + " no es valida!");
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
