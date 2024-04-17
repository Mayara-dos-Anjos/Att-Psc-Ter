package polimorfismo.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void fazerBarulho(){
        System.out.println("au au");
    }

    @Override
    public void mover(){
        System.out.println("Cachorro se movendo");
    }
    
}
