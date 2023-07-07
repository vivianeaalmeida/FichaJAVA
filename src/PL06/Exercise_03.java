package PL06;

import java.util.Scanner;

public class Exercise_03 {


    static boolean positivoOuNegativo(int num){
        boolean ehPositivo = true;
        if(num < 0){
            ehPositivo = false;
        }
        return ehPositivo;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num;
        System.out.println("Insira um numero: ");
        num = input.nextInt();

        System.out.println(positivoOuNegativo(num));
    }
}
