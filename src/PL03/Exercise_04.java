package PL03;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 04 ***");
        int number1, number2;
        System.out.println("Insira um número: ");
        number1 = input.nextInt();
        System.out.println("Insira outro número: ");
        number2 = input.nextInt();
        if(number1 > number2){
            while (number1 >= number2){
                System.out.println(number1);
                number1--;
            }
        } else {
            while (number1 <= number2){
                System.out.println(number1);
                number1++;
            }
        }
    }
}
