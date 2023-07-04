package PL05;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 03 ***");

        int[] vetor = new int[10];
        int max = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Insira um valor no vetor["+i+"]: ");
            vetor[i] = input.nextInt();
            if(vetor[i] > max){
                max = vetor[i];
            }
        }
        System.out.println("O maior valor eh: " + max);
    }
}
