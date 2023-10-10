package Metodo;

public class testaRecursao {
    public static void main(String[] args) {
        int result = soma(10);
        System.out.println(result);
    }
    public static int soma(int k) {
        if (k > 0) {
            return k + soma(k - 1);
        } else {
            return 0;
        }
    }
}
//por baixo dos panos
//10 + soma (9)
//10 + ( 9 + soma (8) )
//10 + ( 9 + ( 8 + soma (7) ) )
//...
//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + soma(0)
//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
