package PL06;

import java.util.Scanner;

public class Exercise_05 {

    static boolean numPerf(int num){
        boolean ehPerf = false;
        int sum = 0;
        for(int divisor = 1; divisor <= num; divisor++){
            if(num % divisor == 0){
                sum += divisor;
            }
            if(sum == num){
                ehPerf = true;
            }
        }
        return ehPerf;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num;
        System.out.println("Insira um numero: ");
        num = input.nextInt();

        System.out.println(numPerf(num));
    }
}
