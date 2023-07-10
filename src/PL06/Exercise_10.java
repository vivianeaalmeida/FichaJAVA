package PL06;

import java.util.Scanner;

public class Exercise_10 {

    static boolean ehCrescente(int[] nArray){
        Scanner input = new Scanner(System.in);
        boolean ehCrescente = true;
        int anterior = 0, proximo;
        //criar o array
        for(int i = 0; i < 10; i++){
            System.out.println("Insira um valor: ");
            nArray[i] = input.nextInt();
        }
        //iterar o array
        for(int i = 0; i < nArray.length; i++){
            proximo = nArray[i];
            if(proximo < anterior){
                ehCrescente = false;
            }
            anterior = proximo;
        }
        //retorno do boolean
        return ehCrescente;
    }

    public static void main(String[] args) {
        //declarar variáveis
        int[] nArray = new int[10];

        System.out.println(ehCrescente(nArray));
    }
}

/*
for(int i=1; i< nArray.length; i++){
    if ( vetor[i] < vetor[i-1]) {
    cresente=false;
    }
}

 */