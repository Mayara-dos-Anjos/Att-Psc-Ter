package polimorfismo.animal;

public class Gato extends Animal{
    String nome;

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("miau");
    }
    @Override
    public void mover(){
        System.out.println("Gato se movendo");
    }
}
