package polimorfismo;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void desenhar() {
        int centroX = (int) raio;
        int centroY = (int) raio;

        for (int i = 0; i <= 2 * raio; i++) {
            for (int j = 0; j <= 2 * raio; j++) {
                double distanciaCentro = Math.sqrt(Math.pow(i - centroX, 2) + Math.pow(j - centroY, 2));
                if (Math.abs(distanciaCentro - raio) < 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    
    }
}
