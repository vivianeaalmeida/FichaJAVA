package PL02;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 14 ***");
        //MATH.MAX!!!!
        double number1, number2, number3;
        System.out.println("Insira o primeiro número: ");
        number1 = input.nextDouble();
        System.out.println("Insira o segundo número: ");
        number2 = input.nextDouble();
        System.out.println("Insira o terceiro número: ");
        number3 = input.nextDouble();

        if(number1 < number2 && number1 < number3){
            if(number2 < number3){
                System.out.println(number1 + " " +number2 + " " + number3);
            } else {
                System.out.println(number1 + " " +number3 + " " + number2);
            }
        } else if (number2 < number1 && number2 < number3) {
            if(number1 < number3){
                System.out.println(number2 + " " + number1 + " " + number3);
            } else {
                System.out.println(number2 + " " + number3 + " " + number1);
            }
        } else {
            if(number1 < number2){
                System.out.println(number3 + " " + number1 + " " + number2);
            } else {
                System.out.println(number3 + " " + number2 + " " + number1);
            }
        }
    }
}
