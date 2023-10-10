package Metodo;

import Metodo.metodo;
import Metodo.metodoSobrecarga;

public class testaMetodo {
    public static void main(String[] args) {
        int age = metodo.getIdade(2000, 2023);
        metodo.checkAge(age);
        metodo.checkName("Priscilla");

        int myNum1 = metodoSobrecarga.sobrecarga(8,5);
        System.out.println(myNum1);
        double myNum2 = metodoSobrecarga.sobrecarga(5.3, 8.25);
        System.out.println(myNum2);
    }
}
