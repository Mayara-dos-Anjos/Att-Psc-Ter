package aula01;

public class Gato {
    
    String nome;
    String raça;
    int idade;

    public void comer(){
        System.out.println("O gato está comendo...");
    }
    public void miar (){
        System.out.println("O gato está miando...");
    }
    public void andar (){
        System.out.println("O gato está andando...");
    }
    public int idadeHumana(int catAge) {
        int humanAge;
        
        if (catAge == 1) {
            humanAge = 15;
        } else if (catAge == 2) {
            humanAge = 24;
        } else {
            humanAge = 24 + (catAge - 2) * 4;
        }
        
        return humanAge;
       
    }
    
}
