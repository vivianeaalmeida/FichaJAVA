package PL06;

import java.util.Scanner;

public class Exercise_12 {
    static void imprimeAsteriscos(int num){
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Insira um numero: ");
            num = input.nextInt();
        } while (num < 0);

        for(int i = 0; i < num; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Insira um numero: ");
        num = input.nextInt();

        imprimeAsteriscos(num);
    }
}
