package Exercicios_easy;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {

        //exercicio 02_easy
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        String palavra = exercicio02_easy.retornarPalavra("Fernanda");
        System.out.println(palavra);

        //Exercicio03_easy
        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor!");
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor!");
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy ();
        System.out.println(exercicio03_easy.retornarValorTrocado(primeiroValor, segundoValor));
        

        //Exercicio04_easy
        String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um número para calcular o dobro");
        int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        System.out.println("O dobro do valor digitado é: " + exercicio04_easy.calcularDobro(numeroDigitado));
    }
    
}
