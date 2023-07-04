package PL02;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 10 ***");
        double firstNumber, secondNumber, result;
        String operator;
        System.out.println("Insira o primeiro número para operação: ");
        firstNumber = input.nextDouble();
        System.out.println("Insira a operação desejada - + | - | * | / : ");
        operator = input.next();
        System.out.println("Insira o segundo número para operação: ");
        secondNumber = input.nextDouble();

        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            if (operator.equals("+")) {
                System.out.println(firstNumber + secondNumber);
            } else if (operator.equals("-")) {
                System.out.println(firstNumber - secondNumber);
            } else if (operator.equals("*")) {
                System.out.println(firstNumber * secondNumber);
            } else {
                System.out.println(firstNumber / secondNumber);
            }

        }
        if(!operator.equals("+") && !operator.equals("-") &&!operator.equals("*") &&! operator.equals("/")){
            System.out.println("Erro");
        }

    }

}

