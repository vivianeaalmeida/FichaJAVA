package PL03;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 08 ***");
        int firstNumber = 2, readNumber;
        System.out.println("Digite um número: ");
        readNumber = input.nextInt();
        while (firstNumber < readNumber){
            System.out.println(firstNumber);
            firstNumber += 2;

        }
    }
}
