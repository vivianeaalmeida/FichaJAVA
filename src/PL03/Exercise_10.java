package PL03;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 10 ***");
        int readNumber = 0, intervalo0a25 = 0, intervalo26a50 = 0, intervalo51a75 = 0, intervalo76a100 = 0;
        while (readNumber != -1){
            System.out.println("Insira um número negativo ou positivo: ");
            readNumber = input.nextInt();
            if(readNumber >= 0 && readNumber <= 25){
                intervalo0a25++;
            } else if (readNumber >= 26 && readNumber <= 50) {
                intervalo26a50++;
            } else if (readNumber >= 51 && readNumber <= 75) {
                intervalo51a75++;
            } else if(readNumber >= 76 && readNumber <= 100) {
                intervalo76a100++;
            } else {
                System.out.println("Numeros no intervalo de 0-25: " + intervalo0a25);
                System.out.println("Numeros no intervalo de 26-50: " + intervalo26a50);
                System.out.println("Numeros no intervalo de 51-75: " + intervalo51a75);
                System.out.println("Numeros no intervalo de 76-100: " + intervalo76a100);
            }
        }
    }
}
