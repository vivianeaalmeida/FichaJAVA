package Lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 01 ***");
        int firstNumber, secondNumber;
        System.out.println("Introduza o primeiro número: ");
        firstNumber = input.nextInt();
        System.out.println("Introduza o segundo numero: ");
        secondNumber = input.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("O número maior é: " + firstNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O número maior é: " + secondNumber);
        }
    }
}

