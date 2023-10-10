package Metodo;

public class testaRecursaoParada {
    public static void main(String[] args) {
        int result = soma(5, 10);
        System.out.println(result);
    }
    public static int soma(int start, int end) {
        if (end > start) {
            int i = end + soma(start, end - 1);
            return i;
        } else {
            return end;
        }
    }
}

//POR BAIXO DOS PANOS
//5 + soma (10 + 4) = 19
//6 + soma (10 + 4) = 20
