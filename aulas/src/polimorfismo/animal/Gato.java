package polimorfismo.animal;

public class Gato extends Animal{
    String nome;

    public Gato(String nome) {
        super(nome);
    }

    public void fazerBarulho() {
        System.out.println("miau");
    }
    public void mover(){
        System.out.println("Gato se movendo");
    }
}
