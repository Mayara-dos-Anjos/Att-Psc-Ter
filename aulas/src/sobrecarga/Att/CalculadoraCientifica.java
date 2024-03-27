package sobrecarga.Att;


    public class CalculadoraCientifica {
    
        // Método para calcular a raiz quadrada de um inteiro
        public double raiz(int numero) {
            return Math.sqrt(numero);
        }
        
        // Método para calcular a raiz quadrada de um double
        public double raiz(double numero) {
            return Math.sqrt(numero);
        }
        
        // Método para calcular a raiz quadrada de uma String convertida para double
        public double raiz(String numero) {
            double num = Double.parseDouble(numero);
            return Math.sqrt(num);
        }
        
        // Método para calcular a potência de dois bytes
        public double potencia(byte a, byte b) {
            return Math.pow(a, b);
        }
        
        // Método para calcular a potência de duas Strings convertidas para double
        public double potencia(String s1, String s2) {
            double num1 = Double.parseDouble(s1);
            double num2 = Double.parseDouble(s2);
            return Math.pow(num1, num2);
        }
        
        // Método para calcular a potência de um inteiro e um double
        public double potencia(int a, double b) {
            return Math.pow(a, b);
        
    }
    
}
