package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio07_easy {
    
    public static void main(String[] args) {

        double salario, inss=0.0;
        String salarioDigitado;

        salarioDigitado = JOptionPane.showInputDialog("Digite seu salário!");
        salario = Double.parseDouble(salarioDigitado); // atribuir o valor digitado para a variavel DOUBLE

        if (salario <= 1045.00) {
            inss = salario * 0.075;
        }

        if (salario >= 1045.01 && salario <=2089.60) {
            inss = salario * 0.09;
        }

        if (salario >= 2089.61 && salario <=3134.40) {
            inss = salario * 0.12;
        }

        if (salario >= 3134.41 && salario <=6101.06) {
            inss = salario * 0.14;
        }

        if (salario >= 6101.07) {
            inss = 6101.06 * 0.075;
        }

        System.out.println("O valor do INSS a ser pago é: R$ " + (inss));
        System.out.println("O valor do salário com desconto do INSS é: R$ " + (salario-inss));
    }
}
