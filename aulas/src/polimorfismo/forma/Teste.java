package polimorfismo.forma;

public class Teste {
    
    public static void main(String[] args) {

        Forma[] forma = new Forma[2];

        forma[0] = new Retangulo(5, 5 );
        forma[1] = new Circulo(3.5);

        for (int i = 0; i < forma.length; i++) {
            System.out.println("Área da forma: "+(i+1) +": " + forma[i].calcularArea());
            System.out.println("Desenho da forma: "+(i+1)+": ");
            forma[i].desenhar();
            System.out.println();
        }
    }
    
}
