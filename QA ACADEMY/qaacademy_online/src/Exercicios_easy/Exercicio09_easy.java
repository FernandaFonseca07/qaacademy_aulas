package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio09_easy {
public static void main(String[] args) {
   int numero, i=1, resultado;
   String numeroDigitado = JOptionPane.showInputDialog("Digite um número");
   numero = Integer.parseInt(numeroDigitado);

   while (i<=10) {
    resultado = numero * i;
    System.out.println(numero + " X " + i + " = " + resultado);
    i++;
   }

}
}