package PL05;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 07 ***");
        int[] vetor = new int[10];
        int maiorValor;
        System.out.println("Insira um numero: ");
        vetor[0] = input.nextInt();
        maiorValor = vetor[0];

        for(int i = 1; i < 10; i++){
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
        }
        System.out.println("Maior valor par: " + maiorValor);

    }
}

//falta o valor par.
