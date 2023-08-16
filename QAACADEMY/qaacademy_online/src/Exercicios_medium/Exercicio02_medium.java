package Exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio02_medium {
    public static void main(String[] args) {
        double valorInvestimento, valorTotalInvestimento, juros = 0.05;
        int i = 1;
        String valorInvestimentoStg = JOptionPane.showInputDialog("Digito o valor do investimento");
        valorInvestimento = Integer.parseInt(valorInvestimentoStg);
        valorTotalInvestimento = valorInvestimento;

        while (i <= 10) {
            valorTotalInvestimento = (valorTotalInvestimento * juros) + valorTotalInvestimento;
            i++;
        } // fim while

        System.out.println("O valor inicial do investimento é: R$ " + valorInvestimento);
        System.out.println("O valor total do juros é: R$" + (valorTotalInvestimento - valorInvestimento));
        System.out.println("O valor total do investimento em 10 anos é: R$ " + valorTotalInvestimento);

    } // fim maim

} // fim class
