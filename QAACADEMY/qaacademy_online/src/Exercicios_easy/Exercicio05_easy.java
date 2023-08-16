package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio05_easy {
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, terceiroNumero, soma, subtracao, multiplicacao, media;
        String primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado;

        primeiroNumeroDigitado = JOptionPane.showInputDialog ("Digite o primeiro número!");
        segundoNumeroDigitado = JOptionPane.showInputDialog ("Digite o segundo número!");
        terceiroNumeroDigitado = JOptionPane.showInputDialog ("Digite o terceiro número!");

        primeiroNumero = Integer.parseInt(primeiroNumeroDigitado);
        segundoNumero = Integer.parseInt(segundoNumeroDigitado);
        terceiroNumero = Integer.parseInt(terceiroNumeroDigitado);

        soma = primeiroNumero + segundoNumero + terceiroNumero;
        subtracao = primeiroNumero - segundoNumero - terceiroNumero;
        multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        media = (primeiroNumero + segundoNumero + terceiroNumero) /3;

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A subtração dos números digitados é: " + subtracao);
        System.out.println("A multiplicação dos números digitados é: " + multiplicacao);
        System.out.println("A média dos números digitados é: " + media);

        JOptionPane.showMessageDialog (null, "A soma dos números digitados é: " + soma);
        JOptionPane.showMessageDialog (null, "A subtração dos números digitados é: " + subtracao);
        JOptionPane.showMessageDialog (null, "A multiplicação dos números digitados é: " + multiplicacao);
        JOptionPane.showMessageDialog (null, "A média dos números digitados é: " + media);


    }
    
}
