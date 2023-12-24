package modelo;

public class Usuario {
    private String contrasena;
    private String fechaCreacion;
    private String fechaModificacion;

    public Usuario(String contrasena,  String fechaCreacion, String fechaModificacion) {
        this.contrasena = contrasena;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
    
    public String getContraseña() {
        return contrasena;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }
}
