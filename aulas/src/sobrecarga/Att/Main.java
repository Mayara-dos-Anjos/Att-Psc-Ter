package sobrecarga.Att;

public class Main {
    
    
        public static void main(String[] args) {
            Impressora impressora = new Impressora();
            
            // Testando cada método exibir com diferentes parâmetros
            
            impressora.exibir(3.14f);
            
            impressora.exibir(5.5f, 10.2f);
            
            impressora.exibir(2.7f, "Olá, mundo!");
            
            impressora.exibir("Alo", 8.9f);
            
            impressora.exibir("Texto1", "Texto2", "Texto3");
            
            impressora.exibir(1, 2, "Texto4");
        
    }
    
}

    