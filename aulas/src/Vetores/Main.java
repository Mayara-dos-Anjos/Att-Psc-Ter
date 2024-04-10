package Vetores;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
      
        Random random = new Random();

        
        int[] vetor = new int[10];

       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); 
        }

        
        System.out.println("Valores aleatórios:");
        for (int i = 0; i < vetor.length; i++) {

        }
        StringBuilder mensagem = new StringBuilder("Valores aleatórios:\n");
        for (int i = 0; i < vetor.length; i++) {
            mensagem.append(vetor[i]).append("\n");
        }
        
        
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Valores Aleatórios", JOptionPane.INFORMATION_MESSAGE);
        }
    }

