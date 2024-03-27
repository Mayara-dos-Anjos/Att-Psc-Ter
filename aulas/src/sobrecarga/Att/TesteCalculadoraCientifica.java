package sobrecarga.Att;

public class TesteCalculadoraCientifica {
    
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        
        // Testando o método raiz com diferentes parâmetros
        
        System.out.println("Raiz de 16 (inteiro): " + calculadora.raiz(16));
        System.out.println("Raiz de 16.0 (double): " + calculadora.raiz(16.0));
        System.out.println("Raiz de 25 (String): " + calculadora.raiz("25"));
        
        // Testando o método potencia com diferentes parâmetros
        
        System.out.println("Potência de 2 elevado a 3 (byte): " + calculadora.potencia((byte)2, (byte)3));
        System.out.println("Potência de 2.5 elevado a 3.0 (String): " + calculadora.potencia("2.5", "3.0"));
        System.out.println("Potência de 3 elevado a 2.5 (int e double): " + calculadora.potencia(3, 2.5));
    }
}

