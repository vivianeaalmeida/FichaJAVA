package PLExtra;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 07 ***");
        int number, higherNumber, smallestNumber, countNeg = 0, countPosit = 0, countZeros = 0;
        System.out.println("Insira um número: ");
        number = input.nextInt();
        higherNumber = number;
        smallestNumber = number;
        //contagem positivo e negativo
        if(number > 0) {
            countPosit++;
        } else {
            countNeg++;
        }

        do{
            System.out.println("Insira um número: ");
            number = input.nextInt();
            //contagem positivo e negativo
            if(number > 0) {
                countPosit++;
            } else if (number < 0){
                countNeg++;
            } else {
                countZeros++;
            }
            //maior e menor número
            if(number > higherNumber && number != 0){
                higherNumber = number;
            }
            if(number < smallestNumber && number != 0){
                smallestNumber = number;
            }


        } while (number != 0);
        System.out.println("O maior numero é: " + higherNumber);
        System.out.println("O menor numero é: " + smallestNumber);
        System.out.println("Numeros positivos: " + countPosit + " | Numeros negativos: " + countNeg + " | Zeros: " + countZeros);
    }

}

