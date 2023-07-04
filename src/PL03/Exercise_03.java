package PL03;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 03 ***");
        int inicio = 0, inteiro;
        System.out.println("Insira um número: ");
        inteiro = input.nextInt();
        while (inicio <= inteiro){
            System.out.println(inicio);
            inicio++;
        }
    }
}
