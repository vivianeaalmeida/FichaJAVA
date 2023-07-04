package Lista03;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 07 ***");
        int numInserido = 0, numDeInputs = 0; //primeiro input nao entra no while, por isso 1 aqui.
        double media = 0;

        while (numInserido != -1){
            System.out.println("Insira um número negativo ou positivo: ");
            numInserido = input.nextInt();
            if(numInserido != -1){
                media += numInserido;
                numDeInputs++;
            }

        }
        media = media / numDeInputs;
        System.out.println(media);
    }
}

//continuar