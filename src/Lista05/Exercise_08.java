package Lista05;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 08 ***");
        int number1, number2, result = 1;
        System.out.println("Insira o primeiro numero: ");
        number1 = input.nextInt();
        System.out.println("Insira o segundo numero");
        number2 = input.nextInt();

        for(int i = 1; i <= number2; i++){
            result *=  number1;
        }
        System.out.println(result);


    }
}

/*
5, 3

i  j

for(i = 0; i < 3; i++)
res *= number1;

5 * 5 * 5


 */