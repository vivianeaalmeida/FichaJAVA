package PL05;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 10 ***");
        int[][] matriz = new int[4][5];
        //criação da matriz
        for(int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 5; coluna++){
                System.out.print("Insira um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

    }
}
