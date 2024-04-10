package Vetores;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Vetor {
    public static void main(String[] args) {
        double[] notas = {7.6, 8.4,9.0,7.5};

       
            double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            
            soma += notas[i];
        }
        double media = soma/notas.length;

        DecimalFormat formato = new DecimalFormat("#.##");
        
        // Define o arredondamento para cima
        formato.setRoundingMode(RoundingMode.CEILING);
        
        // Formata o número para exibir apenas duas casas decimais
        String numeroFormatado = formato.format(media);
        
        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i+1) +": " + notas[i]);
            
        }
        System.out.println("A média é: "+numeroFormatado);
    }
}
