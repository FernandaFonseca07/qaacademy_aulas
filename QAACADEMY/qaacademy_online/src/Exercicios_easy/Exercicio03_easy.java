package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio03_easy {
    public static void main(String[] args) {
            
        String primeiroNumero, segundoNumero;
        primeiroNumero = JOptionPane.showInputDialog ("Digite o primeiro número");
        segundoNumero = JOptionPane.showInputDialog ("Digite o segundo número");
        System.out.println("O primeiro número digitado é: " + primeiroNumero);
        System.out.println("O segundo número digitado é: " + segundoNumero);
    }

}
