package Exercicios_easy;

public class Execucao {
    public static void main(String[] args) {

        //exercicio 02_easy
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        String palavra = exercicio02_easy.retornarPalavra("Fernanda");
        System.out.println(palavra);

        //Exercicio03_easy
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy ();
        String numeros = exercicio03_easy.retornarNumero("25", "25");
        System.out.println(numeros);

        //Exercicio04_easy
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        int numero = exercicio04_easy.dobroNumero(10);
        System.out.println("O dobro do número é: " + numero);
    }
    
}
