package Exercicios_medium;
public class Exercicio03_medium {
    public static void main(String[] args) {
        int i=0, soma = 0;

        while (i<=1000) {
            soma = soma + i;
            System.out.println("A soma dos valor na interação " + (i+1) + " é: " + soma);
            i++;

            if (soma >=1500) {
                break;
            }
        }
    }
}
