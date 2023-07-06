package PL05;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 11 ***");
        int[][] matriz = new int[3][3];
        int menorValor = 0, maiorValor = 0;

        //criação da matriz
        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                System.out.print("Insira um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //iterar a matriz
        for(int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                if(maiorValor == 0 || menorValor == 0){
                    maiorValor = matriz[0][0];
                    menorValor = matriz[0][0];
                } else if(matriz[linha][coluna] > maiorValor){
                    maiorValor = matriz[linha][coluna];
                } else if (matriz[linha][coluna] < menorValor) {
                    menorValor = matriz[linha][coluna];
                }
            }
        }
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
    }
}

/*
else if (matriz[linha][coluna] < menorValor)

 if(matriz[linha][coluna] > maiorValor){
                    maiorValor = matriz[linha][coluna];
                } else if (matriz[linha][coluna] < menorValor) {
                    menorValor = matriz[linha][coluna];
                } else {
                    maiorValor = matriz[0][0];
                    menorValor = matriz[0][0];
                }


 */
