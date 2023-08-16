package Exercicios_easy;


import javax.swing.JOptionPane;

public class Exercicio06_easy {
    
public static void main(String[] args) {
    
    String nota1digitada, nota2digitada;
    double nota1, nota2, media;

    nota1digitada = JOptionPane.showInputDialog ("Digite a primeira nota");
    nota2digitada = JOptionPane.showInputDialog ("Digite a segunda nota");

    nota1 = Integer.parseInt(nota1digitada);
    nota2 = Integer.parseInt(nota2digitada);

    media = (nota1 + nota2) /2;

    if (media>5) {
        System.out.println("A nota do aluno foi: " + media + " - " + "O aluno foi aprovado");
        JOptionPane.showMessageDialog(null,"A nota do aluno foi: " + media + " - " + "O aluno foi aprovado");
    }

    if (media<5) {
        System.out.println("A nota do aluno foi: " + media + " - " + "O aluno foi reprovado");
        JOptionPane.showMessageDialog(null,"A nota do aluno foi: " + media + " - " + "O aluno foi reprovado");
    }
    
    if (media==5) {
        System.out.println("A nota do aluno foi: " + media + " - " + "O aluno está de exame");
        JOptionPane.showMessageDialog(null,"A nota do aluno foi: " + media + " - " + "O aluno está de exame");
        
}
}

}