package PL06;

import java.util.Scanner;

public class Exercise_14 {
    static int somarMatrizes(int[][] matriz1, int[][] matriz2){
        int soma = 0;

        //passar pela 1 matriz e somar
        for(int linha = 0; linha < matriz1.length; linha++){
            for(int coluna = 0; coluna < matriz1.length; coluna++){
                soma += matriz1[linha][coluna];
            }
        }
        //passar pela 2 matriz e somar
        for(int linha = 0; linha < matriz2.length; linha++){
            for(int coluna = 0; coluna < matriz2.length; coluna++){
                soma += matriz2[linha][coluna];
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //declaração das variáveis
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];

        //criação das matrizes
        //matriz1
        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.print("Insira um valor: ");
                matriz1[linha][coluna] = input.nextInt();
            }
        }
        //matriz2
        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.print("Insira um valor: ");
                matriz2[linha][coluna] = input.nextInt();
            }
        }

        //nova matriz com a soma das outras matrizes. Verificar possib função.
        //matriz3
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        int soma = somarMatrizes(matriz1,matriz2); //inserir a função numa variavel p exec. e retorno
        System.out.print(soma);
        System.out.print(matriz3);
    }
}

/*
123  246  =>  369   matriz1[0][0] + matriz2[0][0] || matriz[0][1] + matriz[0][1]
123  246  =>  369
123  246  =>  369

matriz1 - linha 0
[0][0]
[0][1]
[0][2]

matriz1 - linha 1
[1][0]
[1][1]
[1][2]

(...)

e depois a soma de todos os elementos - SOMA OK
*/