package modelo;

import com.aspose.words.*;

public class PasarAPDF {
    public void pdfAimg(String nombre) throws Exception{
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.insertImage(nombre);
        doc.save("descargas/Procedimiento_guardado.pdf");
    }

}
