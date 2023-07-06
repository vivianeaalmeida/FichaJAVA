package PL05;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 10 ***");
        int[][] matriz = new int[4][5];
        int numeroInserido, count = 0;
        //criação da matriz
        for(int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 5; coluna++){
                System.out.print("Insira um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //pergunta ao usuario o número
        System.out.println("Insira um número: ");
        numeroInserido = input.nextInt();

        //verifica quantas vezes o número apareceu na matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){ //pode ser i no lugar de [0] tb. tamanho da linha
                if(matriz[i][j] == numeroInserido){
                    count++;
                }
            }
        }
        System.out.println("Aparece: " + count + " vez(es)");

    }
}


