package modelo;

public class Inercia extends RegionCircular {

    public Inercia(double radio_circular, double distancia) {
        super(radio_circular, distancia);
    }

    public Inercia() {
        super(0, 0);
    }

    public String calcular(double rho, double rMax, double rMin){
        int numIntervalsR = 1000; // Número de intervalos para r
        double thetaMin = 0.0; // Valor mínimo de theta
        double thetaMax = 2 * Math.PI; // Valor máximo de theta
        int numIntervalsTheta = 1000; // Número de intervalos para theta
        double integral = 0.0; // Variable para almacenar el resultado de la integral

        double deltaR = (rMax - rMin) / numIntervalsR;
        double deltaTheta = (thetaMax - thetaMin) / numIntervalsTheta;

        // Realiza la integral doble utilizando dos bucles anidados para r y theta
        for (int i = 0; i < numIntervalsR; i++) {
            double r = rMin + i * deltaR;
            for (int j = 0; j < numIntervalsTheta; j++) {
                double theta = thetaMin + j * deltaTheta;
                double integrand = rho * r * r * deltaR * deltaTheta;
                integral += integrand;
            }
            integral = Math.round(integral);
        }
        // Imprime el resultado

        return integral + " ";
    }
    
    
}
