package PL06;

import java.util.Scanner;

public class Exercise_06 {
    //funçao par ou impar
    static boolean parOuImpar(int num){

        boolean ehPar = false;
        if(num % 2 == 0){
            ehPar = true;
        }
        return ehPar;
    }
    //funcao positivo ou negativo
    static boolean positivoOuNegativo(int num){
        boolean ehPositivo = true;
        if(num < 0){
            ehPositivo = false;
        }
        return ehPositivo;
    }
    //funcao num primo
    static boolean numPrimo(int num){
        boolean ehPrimo = true;
        for(int divisor = 2; divisor < num; divisor++){
            if(num % divisor == 0){
                ehPrimo = false;
            }
        }
        return ehPrimo;
    }
    //funcao num perfeito
    static boolean numPerf(int num){
        boolean ehPerf = false;
        int sum = 0;
        for(int divisor = 1; divisor <= num; divisor++){
            if(num % divisor == 0){
                sum += divisor;
            }
            if(sum == num){
                ehPerf = true;
            }
        }
        return ehPerf;
    }

    //menu com as opcoes de funcoes possiveis para execucao
    static void escolhaFuncao(int num){
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Procedimento \n1 - é par " + "\n2 - é positivo \n3- é primo \n4- é perfeito");
            System.out.println("Insira uma opção: ");
                opcao = input.nextInt();
            } while (opcao < 1 || opcao > 4);

        switch (opcao){
            case 1:
                System.out.println(parOuImpar(num));
                break;

            case 2:
                System.out.println(positivoOuNegativo(num));
                break;

            case 3:
                System.out.println(numPrimo(num));
                break;

            case 4:
                System.out.println(numPerf(num));
                break;
        }
    }

    //Chamada da funcao e opcao do usuario
    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num;
        System.out.println("Insira um numero: ");
        num = input.nextInt();

        escolhaFuncao(num);
    }
}
