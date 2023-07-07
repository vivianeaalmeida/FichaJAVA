package PL06;

import java.util.Scanner;

public class Exercise_04 {

    static boolean numPrimo(int num){
        boolean ehPrimo = true;
        for(int divisor = 2; divisor < num; divisor++){
            if(num % divisor == 0){
                ehPrimo = false;
            }
        }
        return ehPrimo;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num;
        System.out.println("Insira um numero: ");
        num = input.nextInt();

        System.out.println(numPrimo(num));
    }
}


/*
7
fazer o loop entre 6 e 2
 */