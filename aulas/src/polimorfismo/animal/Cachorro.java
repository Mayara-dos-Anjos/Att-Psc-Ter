package polimorfismo.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }
    public void fazerBarulho(){
        System.out.println("au au");
    }

    public void mover(){
        System.out.println("Cachorro se movendo");
    }
    
}
