package aula01;

import java.util.Scanner;

public class TesteGato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Gato gato1 = new Gato();
        
        System.out.println("Digite a idade do gato em anos: ");
        int catAge = scanner.nextInt();
        
        int humanAge = Gato.catAgeToHuman (catAge);
        
        scanner.close();

        gato1.nome = "Lisa";
        gato1.raça = "Ragdoll";
        gato1.idade = catAge;

        System.out.println("O nome do gato é: " + gato1.nome);
        System.out.println("A raça do gato é: " + gato1.raça);
        System.out.println("A idade do gato é: " + gato1.idade);
        System.out.println("A idade do gato em anos humanos é aproximadamente: " + humanAge);

        gato1.comer();
        gato1.miar();
        gato1.andar();

    }
}
