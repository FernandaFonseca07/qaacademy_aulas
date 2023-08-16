package Exercicios_medium;
public class Exercicio04_medium {
    public static void main(String[] args) {
        int i=1, multiplicacao = 1;

        while (i <= 1000) {
            multiplicacao = multiplicacao * i;
            i++;

            if (multiplicacao >= 1000) {
                multiplicacao = 1;
            }
        }
        System.out.println("A ultima mulplicação foi no valor de: " + multiplicacao);
    } //fim main
    
} // fim class
