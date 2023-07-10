package PL06;

import java.util.Scanner;

public class Exercise_08 {

    static int maiorElem(int[] vetor){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        int maiorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int[] vetor = new int[10];

        System.out.println(maiorElem(vetor));
    }
}
