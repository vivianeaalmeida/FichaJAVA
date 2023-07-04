package Lista04;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 04 EX 01 ***");
        double firstNumber, secondNumber;
        String sign, executeAgain;

        do{
            System.out.println("Insira o primeiro número: ");
            firstNumber = input.nextInt();
            System.out.println("Insira a operação: ");
            sign = input.next();
            System.out.println("Insira o segundo número: ");
            secondNumber = input.nextInt();

            if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
                System.out.println("Insira uma operação válida: + | - | * | / :");
            } else {
                if(sign.equals("+")){
                    System.out.println(firstNumber + secondNumber);
                } else if (sign.equals("-")) {
                    System.out.println(firstNumber - secondNumber);
                } else if (sign.equals("*")) {
                    System.out.println(firstNumber * secondNumber);
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
            }
            System.out.println("Deseja continuar? s ou n : ");
            executeAgain = input.next();
        } while (executeAgain.equals("s"));
    }
}
