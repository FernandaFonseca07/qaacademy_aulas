package Exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public static void main(String[] args) {
        String[] vetorNomesAlunos;
        int[] vetorNumeroAlunos;
        int i = 0;

        vetorNomesAlunos = new String[5];
        vetorNumeroAlunos = new int[5];

        while (i < 5) {
            vetorNomesAlunos[i] = JOptionPane.showInputDialog("Escreva o nome do aluno");
            vetorNumeroAlunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Escreva o nome do aluno"));
            System.out.println("Aluno (a): " + vetorNomesAlunos[i] + " Número: " + vetorNumeroAlunos[i]);
            i++;
        }
    }
}
