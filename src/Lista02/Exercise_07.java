package Lista02;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 07 ***");
        int number;
        System.out.println("Introduza um número: ");
        number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
