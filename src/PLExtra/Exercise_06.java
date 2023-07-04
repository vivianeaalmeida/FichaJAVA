package PLExtra;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 06 ***");
        int number, higherNumber, smallestNumber;
        System.out.println("Insira um número: ");
        number = input.nextInt();
        higherNumber = number;
        smallestNumber = number;

        do{
            System.out.println("Insira um número: ");
            number = input.nextInt();

            if(number > higherNumber && number != 0){
                higherNumber = number;
            }
            if(number < smallestNumber && number != 0){
                smallestNumber = number;
            }
        } while (number != 0);
        System.out.println("O maior numero é: " + higherNumber);
        System.out.println("O menor numero é: " + smallestNumber);
    }

}
/*

15
smallest armazena = 15
higher armazena = 15
21
smallest armazena 15
higher armazena 21

menor = 0
menor = inputnextInt
menor < inputnextint

 */
