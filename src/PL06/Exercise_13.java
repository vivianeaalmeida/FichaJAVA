package PL06;

import java.util.Scanner;

public class Exercise_13 {

    static void imprimeCaracter(String letra, int numLinhas, int numColunas){
        for(int line = 0; line < numLinhas; line++){
            //System.out.print(letra);
            for(int column = 0; column < numColunas; column++){
                //System.out.print(letra);
            }
        }
    }


    public static void main(String[] args) {
        //declaracao obrigatoria do scanner
        Scanner input = new Scanner(System.in);
        //declaracao das variaveis
        String letra;
        int numLinhas, numColunas;
        System.out.println("Insira o caracter: ");
        letra = input.next();
        System.out.println("Insira o numero de linhas: ");
        numLinhas = input.nextInt();
        System.out.println("Insira o numero de colunas: ");
        numColunas = input.nextInt();

        imprimeCaracter(letra, numLinhas, numColunas);
    }
}

/*
zzzzzz  zzzzzz
z****z  z****z
z****z
zzzzzz



 */
