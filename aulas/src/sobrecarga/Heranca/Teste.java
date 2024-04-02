package sobrecarga.Heranca;

public class Teste {
    public static void main(String[] args) {
        Romance eaqa = new Romance("É assim que acaba", "Collen Hoover", true,"Second chance" );

        System.out.println(eaqa.titulo);
        System.out.println(eaqa.autor);
        System.out.println(eaqa.serie);
        System.out.println(eaqa.trope);
        System.out.println("");

        Distopia jv = new Distopia("Jogos Vorazes", "Suzane Collins" , true);
        System.out.println(jv.titulo);
        System.out.println(jv.autor);
        System.out.println(jv.serie);
        System.out.println("");

    }
}
