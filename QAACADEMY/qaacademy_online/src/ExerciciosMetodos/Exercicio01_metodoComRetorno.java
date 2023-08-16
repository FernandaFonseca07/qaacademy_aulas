package ExerciciosMetodos;

public class Exercicio01_metodoComRetorno {
    public static void main(String[] args) {
        System.out.println(metodoUm());
        System.out.println (metodoDois());
        System.out.println (metodoTres());
        System.out.println (metodoQuatro());
        System.out.println (metodoCinco());
    }

    public static String metodoUm(){
        return "metodoUm";   
    }

    public static int metodoDois(){
        return 1;    
    }

    public static double metodoTres (){
        return 26.5;
    }

    public static boolean metodoQuatro (){
        return true;
    }

    public static String metodoCinco () {
    return "Esse é o modo de criar métodos!";
    }
}
