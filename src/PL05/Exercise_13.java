package PL05;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 13 ***");
        int[][] matriz = new int[4][4];
        int sum = 0;


        //criação da matriz
        for(int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 4; coluna++){
                System.out.print("Insira um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        //soma dos elementos da diagonal principal da matriz
        for(int i = 0; i < matriz.length; i++){
                sum += matriz[i][i];
            }
        System.out.println("soma " + sum);
        }

}



/*
mudando apenas uma váriavel, ja que valor de linha e coluna sao iguais
1 2 3 [0][0]
1 2 3 [1][1]
1 2 3 [2][2]
 */