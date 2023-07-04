package PL02;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 09 ***");
        int firstValue, secondValue, thirdValue;
        System.out.println("Insira o primeiro valor: ");
        firstValue = input.nextInt();
        System.out.println("Insira o segundo valor: ");
        secondValue = input.nextInt();
        System.out.println("Insira o terceiro valor: ");
        thirdValue = input.nextInt();

        if(firstValue < secondValue && firstValue < thirdValue){
            System.out.println("O menor valor é: " + firstValue);
        } else if (secondValue < firstValue && secondValue < thirdValue) {
            System.out.println("O menor valor é: " + secondValue);
        } else {
            System.out.println("O menor valor é: " + thirdValue);
        }
    }
}
