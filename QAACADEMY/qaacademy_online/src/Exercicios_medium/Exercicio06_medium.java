package Exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio06_medium {
    public static void main(String[] args) {
        int fatorial, i;
        String fatorialStg = JOptionPane.showInputDialog("Digite um número para ser calculado seu fatorial!");
        fatorial = Integer.parseInt(fatorialStg);
        i = fatorial;
        
        while (i>1) {
            fatorial = fatorial * (i-1);
            i--;       
                
        }//fim while

        System.out.println("O fatorial do número digitado é = " + fatorial);
        JOptionPane.showMessageDialog(null, "O fatorial do número digitado é: " + fatorial);
        
    } // fim main
} //fim class
