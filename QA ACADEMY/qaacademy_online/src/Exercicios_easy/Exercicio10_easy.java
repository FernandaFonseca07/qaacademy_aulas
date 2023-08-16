package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio10_easy {
    public static void main(String[] args) {
        double valorInvestimento,taxaJuros=0.05, valorJuros=0.0, valorTotalInvestimento, ano=1;
        String valorInvestimentoDigitado = JOptionPane.showInputDialog("Digite o valor do seu investimento!");
        valorInvestimento = Double.parseDouble(valorInvestimentoDigitado);

        

        while (ano <=10) {
            valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
            ano++;
        }

        valorTotalInvestimento = valorInvestimento+valorJuros;
        
        System.out.println("O valor do investimento inicial é: R$ " + (valorInvestimento));
        System.out.println("O valor do juros em 10 anos é: R$ " + (valorJuros));
        System.out.println("O valor total do investimento em 10 anos é: R$ " + (valorTotalInvestimento));


    }
}
