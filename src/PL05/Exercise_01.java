package PL05;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 01 ***");

        //declarar váriavel
        int[] vetor = new int[10];
        //introduz os numeros no vetor
        for(int i = 0; i < 10; i++){
            System.out.println("Introduza um numero no vetor ["+i+"]: ");
            vetor[i] = input.nextInt();
        }
        //imprime o conteudo do vetor
        for(int i = 0; i < 10; i++){
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }
    }
}
