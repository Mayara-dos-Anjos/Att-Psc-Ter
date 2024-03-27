package sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(5, 3);
        int resultado2 = calculadora.somar(5, 3, 2);
        double resultado3 = calculadora.somar(5.2, 3.3);
        String resultado4 = calculadora.concatenar("Olá", " Mundo");

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

    }
}
