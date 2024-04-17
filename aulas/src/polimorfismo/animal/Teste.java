package polimorfismo.animal;

public class Teste {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Gato("Bob");
        animals[1] = new Cachorro("Marley");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Nome do animal: " + animals[i].getName()+ ". ");
            animals[i].fazerBarulho();
            animals[i].mover();
        }
    }
}
