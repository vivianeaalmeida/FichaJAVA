package PL05;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 07 ***");
        int[] vetor = new int[10];
        int maiorValor;
        boolean haPares = false;
        System.out.println("Insira um numero: ");
        vetor[0] = input.nextInt();
        maiorValor = vetor[0];

        for(int i = 1; i < 10; i++){
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
            if(vetor[i] > maiorValor && vetor[i] % 2 == 0){
                maiorValor = vetor[i];
            }
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                haPares = true;
            }
        }

        if(haPares == true){
            System.out.println("Maior valor par: " + maiorValor);
        } else {
            System.out.println("Não há maior valor par");
        }

    }
}

//falta o valor par.

/*
 else if (maiorValor % 2 == 1) {
                impar = true;
            }

 if(impar == true){
            System.out.println("Não há valores pares");
        } else {
            System.out.println("Maior valor par: " + maiorValor);
        }

 */