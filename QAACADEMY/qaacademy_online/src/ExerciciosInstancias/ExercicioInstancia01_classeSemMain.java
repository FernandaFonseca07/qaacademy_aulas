package ExerciciosInstancias;

public class ExercicioInstancia01_classeSemMain {
    String nomeCachorro = "Jorel";
    int pulo = 90;

public String cachorroLate(){
    return "au au au";
} 

public void cachorroPula(){
    System.out.println("O " + nomeCachorro + " pulou na altura de " + pulo + "cm do chão");
}

public String cachorroAltoOuNao(){
    if (pulo>=90) {
              return "O " + nomeCachorro + " pula alto";  
    }
    else{
        return "O " + nomeCachorro + " pula baixo";
    }
}


}
