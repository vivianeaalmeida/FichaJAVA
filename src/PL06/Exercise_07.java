package PL06;

import java.util.Scanner;

public class Exercise_07 {

    static int[] novoArray(int[] num, int tam){

        for(int i = 0; i < tam; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Insira um numero: ");
            num[i] = input.nextInt(); //insiro o valor na posicao[i]
        }
        //System.out.print();
        return num;
    }

//    static void imprimirVetor(int[] num, int tam){
//        System.out.print( "[ ");
//        for(int i = 0; i < 4; i++){
//            System.out.print( vetor[i] + ", ");
//        }
//        System.out.print( "] ");
//    }

    public static void main(String[] args) {
        //Chamada da funcao e opcao do usuario
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num, tam;
        System.out.println("Insira o tamanho do Array: ");
        tam = input.nextInt();

        int[] array = new int[tam]; //array é criado com base no tamanho

       array = novoArray(array, tam);
    }
}
