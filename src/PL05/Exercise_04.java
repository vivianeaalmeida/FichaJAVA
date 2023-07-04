package PL05;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 04 ***");

        int[] vetor = new int[10];
        int min = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
            if(min == 0){
                min = vetor[i];
            }
            if(vetor[i] < min){
                min = vetor[i];
            }
        }
        System.out.println(min);
    }
}
