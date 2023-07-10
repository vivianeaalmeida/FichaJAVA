package PL06;

import java.util.Scanner;

public class Exercise_11 {
    //funcao para criar o array
    static int[] novoArray(int vetor[], int tam) {
        for (int i = 0; i < tam; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Insira um numero: ");
            vetor[i] = input.nextInt(); //insiro o valor na posicao[i]
        }
        //System.out.print();
        return vetor;
    }

    //funcao maiorElem ex08
    static int maiorElem(int[] vetor, int tam) {

        int maiorValor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }

    //funcao menorValor
    static int menorElem(int[] vetor, int tam) {

        int menorValor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        return menorValor;
    }

    //funcao ehCresc ex10
    static boolean ehCrescente(int[] vetor, int tam) {
        Scanner input = new Scanner(System.in);
        boolean ehCrescente = true;
        int anterior = 0, proximo;

        //iterar o array
        for (int i = 0; i < vetor.length; i++) {
            proximo = vetor[i];
            if (proximo < anterior) {
                ehCrescente = false;
            }
            anterior = proximo;
        }
        //retorno do boolean
        return ehCrescente;
    }

    //funcao com menu de opcoes


        public static void main (String[]args){
            //scanner obrigatorio
            Scanner input = new Scanner(System.in);
            //declarar variáveis
            int tam, opcao, continuar;


            System.out.println("Insira o tamanho do Array: ");
            tam = input.nextInt();
            int[] vetor = new int[tam]; //array é criado com base no tamanho

            vetor = novoArray(vetor, tam); //atribuo a funcao a variavel vetor

            do{
                do {
                    System.out.println("Opções: \n1 - Maior Valor " + "\n2 -Menor valor \n3- Crescente ");
                    System.out.println("Insira uma opção: ");
                    opcao = input.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("O maior valor encontrado é: " + maiorElem(vetor, tam));
                            break;
                        case 2:
                            System.out.println("O menor valor encontrado é: " + menorElem(vetor, tam));
                            break;
                        case 3:
                            System.out.println("Crescente? " + ehCrescente(vetor, tam));
                            break;
                    }

                } while (opcao < 1 || opcao > 3);
                System.out.println("Deseja continuar? 1-Sim | 2-Não");
                continuar = input.nextInt();
            } while (continuar == 1);
        }
}

