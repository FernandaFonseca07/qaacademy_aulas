package ExerciciosInstancias;

public class ExercicioExercucao {
    public static void main(String[] args) {
        ExercicioInstancia01_classeSemMain Exercicio01Instancia = new ExercicioInstancia01_classeSemMain(); //criei a classe na memoria

        //visualização das variaveis
        System.out.println("O nome do cachorro é " + Exercicio01Instancia.nomeCachorro); //consigo puxar as variaveis (para visualizar usar sysout)
        System.out.println("O " + Exercicio01Instancia.nomeCachorro + " pula a altura de " + Exercicio01Instancia.pulo + "cm!");

        //visualização dos métodos
        System.out.println(Exercicio01Instancia.cachorroLate()); //lembrar que metodos tem os dois () parenteses
        Exercicio01Instancia.cachorroPula();
        System.out.println(Exercicio01Instancia.cachorroAltoOuNao());
    }
}
