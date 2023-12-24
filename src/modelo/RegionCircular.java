package modelo;

public class RegionCircular {
    private double radio_circular;
    private double distancia;
    private double momento_inercia;
    private double densidad;

    public RegionCircular(double radio_circular, double distancia) {
        this.radio_circular = radio_circular;
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getRadio_circular() {
        return radio_circular;
    }

    public void setRadio_circular(double radio_circular) {
        this.radio_circular = radio_circular;
    }

    public double getMomento_inercia() {
        return momento_inercia;
    }

    public double getDensidad() {
        return densidad;
    }    
}