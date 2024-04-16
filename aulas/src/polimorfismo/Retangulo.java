package polimorfismo;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.base;
    }

    @Override
    public void desenhar() {
        for (int i = 0; i <altura; i++){
            for (int j = 0; j < base; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    
}
