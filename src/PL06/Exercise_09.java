package PL06;

import java.util.Scanner;

public class Exercise_09 {
    static int menorElem(int[] vetor){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        int menorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }
        return menorValor;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int[] vetor = new int[10];

        System.out.println(menorElem(vetor));
    }
}
