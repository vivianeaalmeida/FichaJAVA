package Lista03;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 12 ***");
        int readNumber = 0, numSeguinte = 0, numAnterior;
        boolean crescente;

        while (readNumber != -1){
            System.out.println("Insira um número: ");
            readNumber = input.nextInt();
            numAnterior = numSeguinte;
            numSeguinte = readNumber;
//            System.out.println(numSeguinte);
//            System.out.println(numAnterior);
            while (numSeguinte > numAnterior){
                //crescente = true;
            }
            if (numSeguinte < numAnterior){
                crescente = false;
                //System.out.println("Não é crescente");
            }
        }
    }
}

/*
if(crescente == true){
"Ordem está crescente"
1 8 9 7 8 9 -> nao eh crescente
1 2 3 -> crescente

while(proximo < anterior){  8 < 9
    crescente = false

    proximo < anterior



 */