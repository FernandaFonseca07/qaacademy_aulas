import javax.swing.JOptionPane;

import Exercicios_easy.Exercicio06_easy;
import Exercicios_easy.Exercicio07_easy;

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

        // Exercicio07_easy
        String salarioDigitado;

        salarioDigitado = JOptionPane.showInputDialog("Digite seu salário!");
        double salario = Double.parseDouble(salarioDigitado);

        Exercicio07_easy exercicio07_easy = new Exercicio07_easy();
        System.out.println("O valor do INSS a ser pago é: R$ " + exercicio07_easy.calcularINSS(salario));

        double inss = exercicio07_easy.calcularINSS(salario);
        System.out.println("O valor do salário com desconto do INSS é: R$ " + (salario - inss));

    }

}
