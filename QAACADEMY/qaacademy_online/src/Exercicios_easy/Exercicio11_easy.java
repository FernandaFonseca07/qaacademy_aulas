package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio11_easy {

public static void main(String[] args) {
    int numero, i=1;
    String numeroDigitado = JOptionPane.showInputDialog("Digite um número!");
    numero = Integer.parseInt(numeroDigitado);

    while (i<=100) {
        numero = numero + 2;
        System.out.println(numero);
        i++;
    }
    
    System.out.println(numero);

}
}
