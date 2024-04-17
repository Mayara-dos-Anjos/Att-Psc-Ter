package polimorfismo.animal;

public class Animal {
    
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void fazerBarulho(){
        System.out.println("Animal fazendo barulho");
    }
    public void mover(){
        System.out.println("Animal se movendo");
    }
}
