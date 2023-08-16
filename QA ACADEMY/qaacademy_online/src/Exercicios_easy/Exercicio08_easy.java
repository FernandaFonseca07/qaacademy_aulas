package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio08_easy {
    public static void main(String[] args) {
        double salarioBruto, impostoRenda=0.0, salarioLiquido=0.0;
        String salarioBrutoDigitado = JOptionPane.showInputDialog("Digite o valor do seu salário!");

        salarioBruto = Double.parseDouble(salarioBrutoDigitado);

        if (salarioBruto <= 1903.98) {
            impostoRenda = 0.0;
            salarioLiquido = salarioBruto;
        }

        if (salarioBruto >= 1903.99 && salarioBruto <=2826.65) {
            impostoRenda = (salarioBruto * 0.075) - 142.80;
            salarioLiquido = salarioBruto - impostoRenda;
        }

        if (salarioBruto >= 2826.66 && salarioBruto <=3751.05) {
            impostoRenda = (salarioBruto * 0.15) - 354.80;
            salarioLiquido = salarioBruto - impostoRenda;
        }

        if (salarioBruto >= 3751.06 && salarioBruto <=4664.68) {
            impostoRenda = (salarioBruto * 0.225) - 636.13;
            salarioLiquido = salarioBruto - impostoRenda;
        }

        if (salarioBruto >=4664.69) {
            impostoRenda = (salarioBruto * 0.275) - 869.36;
            salarioLiquido = salarioBruto - impostoRenda;
        }


        System.out.println("O seu salário bruto é = R$ " + (salarioBruto));
        System.out.println("O Imposto de Renda a ser pago é = R$ " + (impostoRenda));
        System.out.println("O seu salário líquido é = R$ " + (salarioLiquido));


    }
    
}
