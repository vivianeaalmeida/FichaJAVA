package PL03;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 05 ***");
        int inteiros = 0, soma = 0;
        while (inteiros < 100){
            inteiros++; //inicia com 1 já e também imprime o 100.
            soma += inteiros; //soma 1 a 100 normal
            System.out.println(inteiros);
        }
        System.out.println(soma);
    }
}
