import javax.swing.JOptionPane;

import Exercicios_easy.Exercicio06_easy;

public class ExecucaoExercicio06Ao11_easy {
    public static void main(String[] args) {

        // Exercicio06_easy
        String nota1digitada, nota2digitada;
        nota1digitada = JOptionPane.showInputDialog("Digite a primeira nota");
        nota2digitada = JOptionPane.showInputDialog("Digite a segunda nota");

        double nota1, nota2;
        nota1 = Double.parseDouble(nota1digitada);
        nota2 = Double.parseDouble(nota2digitada);

        Exercicio06_easy exercicio06_easy = new Exercicio06_easy();
        System.out.println(exercicio06_easy.verificaMediaEAprovacao(nota1, nota2));

    }

}
