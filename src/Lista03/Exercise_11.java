package Lista03;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 11 ***");
        int firstNumber, secondNumber;
        System.out.println("Insira o menor número: ");
        firstNumber = input.nextInt();
        System.out.println("Insira o maior número: ");
        secondNumber = input.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("Error");
        }

        while (firstNumber <= secondNumber){ //%5 == 0
            if(firstNumber % 5 == 0){
                System.out.println(firstNumber);
            }
            firstNumber++;
        }
    }
}


//1-10
//5, 10
