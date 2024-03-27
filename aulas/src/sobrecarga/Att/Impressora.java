package sobrecarga.Att;

public class Impressora {
    
    public void exibir(float numero) {
        System.out.println(numero);
    }
    
    public void exibir(float numero1, float numero2) {
        System.out.println(numero1 + ", " + numero2);
    }
    
    public void exibir(float numero, String texto) {
        System.out.println(numero + ", " + texto);
    }
    
    public void exibir(String texto, float numero) {
        System.out.println(texto + ", " + numero);
    }
    
    public void exibir(String texto1, String texto2, String texto3) {
        System.out.println(texto1 + ", " + texto2 + ", " + texto3);
    }
    
    public void exibir(int numero1, int numero2, String texto) {
        System.out.println(numero1 + ", " + numero2 + ", " + texto);
    }
}
