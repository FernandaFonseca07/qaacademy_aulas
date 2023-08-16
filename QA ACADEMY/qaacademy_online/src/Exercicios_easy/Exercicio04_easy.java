package Exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio04_easy {
    public static void main(String[] args) {
     int numeroDigitado, resultado;
     String numeroDigitadoUsuario = JOptionPane.showInputDialog ("Digite um número!");
     numeroDigitado = Integer.parseInt (numeroDigitadoUsuario);
     resultado = numeroDigitado * 2;
     System.out.println("O dobro do número digitado é: " + resultado);
     JOptionPane.showMessageDialog(null, "O dobro do número digitado é: " + resultado); //caso queira mostrar na caixinha o resultado
    }
     
       
    
}
