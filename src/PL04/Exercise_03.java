package PL04;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 04 EX 03 ***");
        int numberPlayer1, numberPlayer2, tries = 0;

        System.out.println("Insira um número entre 1 e 100: ");
        numberPlayer1 = input.nextInt();

        while (numberPlayer1 < 0 || numberPlayer1 > 100){
            System.out.println("Valor inválido. Insira um número entre 1 e 100: ");
            numberPlayer1 = input.nextInt();
        }

        do{
            System.out.println("Adivinhe o número correspondente: ");
            numberPlayer2 = input.nextInt();
            tries++;

            if(numberPlayer2 > numberPlayer1){
                System.out.println("O valor inserido é superior");
            } else if (numberPlayer2 < numberPlayer1){
                System.out.println("O valor inserido é inferior");
            } else {
                System.out.println("Acertou! O número de tentativas foi: " + tries);
            }
        } while (numberPlayer2 != numberPlayer1);

    }
}