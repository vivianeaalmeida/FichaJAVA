package PL03;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 01 ***");
        int numPares = 0;

        while (numPares < 300){
            numPares += 2;
            System.out.println(numPares);
        }
    }
}

//o ideal era iniciar o pares com 2, o print ns linha 12 e o incremento na linha 13.
//ou seja, inverter a ordem do print. e o numPares seria <= 300