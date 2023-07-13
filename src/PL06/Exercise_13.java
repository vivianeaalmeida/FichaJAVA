package PL06;

import java.util.Scanner;

public class Exercise_13 {

    static void imprimeCaracter(String letra, int numLinhas, int numColunas){
        for(int i = 0; i < numLinhas; i++){
            for(int j = 0; j < numColunas; j++){
                if(i == 0 || i == 4){  //n teste em i e j
                    System.out.print(letra);
                }
                if(j == 0 || j == 5){
                    System.out.println(letra);
                }
            }
        }
    }

    /*
        [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
        [1][0]                             [1][5]
        [2][0]                             [2][5]
        [3][0]                             [3][5]
        [4][0] [4][1] [4][2] [4][3] [4][4] [5][4]

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                if((j = 0 || j = 5) && (i = 0 || i == 4)){

     */

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

zzzzzzzzz   ele imprime toda linha 0. Se não está na linha zero ou na ultima linha, ele imprime
z       z   so na coluna 0 e na ultima coluna.
z       z
zzzzzzzzz

LINHAS: 4
COLUNAS: 5

[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
[1][0]                             [1][5]
[2][0]                             [2][5]
[3][0]                             [3][5]
[4][0] [4][1] [4][2] [4][3] [4][4] [5][4]

for(int i = 0; i < 4; i++){
    for(int j = 0; j < 5; j++){
        if((j = 0 || j = 5) && (i = 0 || i == 4)){



            if(i = 0 || i = 4)


for(int lineAtual = 1; lineAtual < numLinhas; line++){
            if(lineAtual == 0 || lineAtual == numLinhas){ //numLinhas é o 4
                System.out.print(letra);
            }

            for(int column = 1; column < numColunas; column++){ //numColunas é o 9
                if((column == 0 || column == numColunas)){
                    System.out.println(letra);
                }
}

line = 4
column = 9

lineAtual só vai ser 0 uma vez. Não adianta

 */


/*
for inicial
for(int line = 0; line < numLinhas; line++){   //4
            if(numLinhas == 0 || line == numLinhas){
                System.out.print(letra);
            }

            for(int column = 0; column < numColunas; column++){  //9
                if((column == 0 || column == numColunas)){
                    System.out.println(letra);
                }
            }
        }
 */