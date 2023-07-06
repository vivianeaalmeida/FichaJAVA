package PL05;

import java.util.List;
import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 08 ***");
        int[][] matriz = new int[3][3];
        //criacao da matriz
        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.print("Insira um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }

        }
        //print da matriz
        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println(" ");
        }

    }
}






/*
3 8 1 [0][0] [0][1] [0][2]
7 4 2 [1][0] [1][1] [1][2]
5 1 9 [2][0] [2][1] [2][2]



 */