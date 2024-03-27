package sobrecarga;
// sobrecarga de metodossão métodos com o mesmo nome porem parametros diferentes
public class Calculadora {
    
    public int somar(int a, int b) {
        return a + b;
    }
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    public double somar(double a, double b) {
        return a + b;
    }
    public String concatenar (String a, String b){
        return a + b;
    }
    
    
}
