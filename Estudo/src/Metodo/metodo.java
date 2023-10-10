package Metodo;

//criar o método checkAge() com uma variável de interação chamada idade
public class metodo {

    static int getIdade(int anoNascimento, int anoAtual) {
        return anoAtual - anoNascimento;
    }
    static void checkAge(int age) {
        if (age < 18){
            System.out.println("Você tem " + age + " anos, logo é menor de idade!");
        } else {
            System.out.println("Você tem " + age + " anos, logo é maior de idade!");
        }
    }

    static void checkName(String name){
        System.out.println("Seu nome é " + name);
    }


}
