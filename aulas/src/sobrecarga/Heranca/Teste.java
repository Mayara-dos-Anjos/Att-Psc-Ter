package sobrecarga.Heranca;

public class Teste {
    public static void main(String[] args) {
        Romance eaqa = new Romance("É assim que acaba", "Collen Hoover", true,"Second chance" );

   

        Distopia jv = new Distopia("Jogos Vorazes", "Suzane Collins" , true);
     

        Fantasia cdlc = new Fantasia("Cidade da lua crescente", "Sarah J. Mass ", "Baixa");
        
        
        eaqa.exibirR();
        jv.exibirD();
        cdlc.exibirF();

    }
}
