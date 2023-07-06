package PL05;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 09 ***");
        int[][] matriz = new int[5][5];
        int soma = 0;

        //criação da matriz
        for(int linha = 0; linha < 5; linha++){
            for (int coluna = 0; coluna < 5; coluna++){
                System.out.print("Insira um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //print da matriz
        for(int linha = 0; linha < 5; linha++){
            for (int coluna = 0; coluna < 5; coluna++){
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println(" ");
        }

        //soma dos valores da matriz criada anteriormente
        for(int linha = 0; linha < 5; linha++){
            for (int coluna = 0; coluna < 5; coluna++){
                soma += matriz[linha][coluna];
            }
        }
        System.out.println("A soma dos itens é: " + soma);

    }
}


/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

 */