package ExerciciosMetodos;
public class ExercicioMetodosComParametro {
    public static void main(String[] args) {

        // com retorno
        System.out.println(retornarNomeEIdade("Fernanda", 26));
        System.out.println(retornarPalavra("testando com retorno"));
        System.out.println(retornarDoubro(10500));
        System.out.println(retornarnomeSalario("Gabriel", 4500.50));
        System.out.println(retornarNomeESobrenome("Fernanda", "Fonseca"));

        // sem retorno
        semRetornarNomeEIdade("Fernanda", 26);
        semRetornarPalavra("Testando sem retorno");
        semRetornarDoubro(10500);
        semRetornarnomeSalario("Gabriel", 4500.50);
        semRetornarNomeESobrenome("Fernanda", "Fonseca");
    }

    // com retorno
    public static String retornarNomeEIdade(String nome, int idade) {
        return "Nome: " + nome + " - Idade: " + idade;
    }

    public static String retornarPalavra(String palavra) {
        return palavra;
    }

    public static double retornarDoubro(int numero) {
        return numero * 2;
    }

    public static String retornarnomeSalario(String nome, double salario) {
        return "Nome: " + nome + " - Salário: R$ " + salario;
    }

    public static String retornarNomeESobrenome(String nome, String sobreNome) {
        return nome + " " + sobreNome;
    }

    // sem retorno
    public static void semRetornarNomeEIdade(String nome, int idade) {
        System.out.println("Nome: " + nome + " - Idade: " + idade);
    }

    public static void semRetornarPalavra(String palavra) {
        System.out.println(palavra);
    }

    public static void semRetornarDoubro(int numero) {
        System.out.println(numero * 2);
    }

    public static void semRetornarnomeSalario(String nome, double salario) {
        System.out.println("Nome: " + nome + " - Salário: R$ " + salario);
    }

    public static void semRetornarNomeESobrenome(String nome, String sobreNome) {
        System.out.println(nome + " " + sobreNome);
    }
}