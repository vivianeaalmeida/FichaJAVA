package PL06;

import java.util.Scanner;

public class Exercise_02 {

    static boolean parOuImpar(int num){

        boolean ehPar = false;
        if(num % 2 == 0){
            ehPar = true;
        }
            return ehPar;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num;
        System.out.println("Insira um numero: ");
        num = input.nextInt();

        System.out.println(parOuImpar(num));
    }
}
