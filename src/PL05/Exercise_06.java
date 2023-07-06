package PL05;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 06 ***");
        int[] vetor = new int[10];
        boolean ehCrescente = true;
        int primeiroNum;
        System.out.println("Insira um numero: ");
        primeiroNum = input.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println("Insira um numero: ");
            vetor[i] = input.nextInt();
            if(vetor[i] < primeiroNum){
                ehCrescente = false;
            }
            primeiroNum = vetor[i];
        }


        if(ehCrescente == false){
            System.out.println("A sequencia não é crescente");
        } else {
            System.out.println("A sequencia é crescente");
        }
    }
}


/*
if(itemAnterior < proximoItem)
if(itemAtual < itemAnterior)
 */