package PL03;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 13 ***");
        int fatorial, caixinha;
        System.out.println("Escreva um número: ");
        fatorial = input.nextInt();
        caixinha = fatorial; //armazena o valor
        while (fatorial > 1){

            fatorial--;
            caixinha = caixinha * fatorial;
        }
        System.out.println(caixinha);
    }
}


/*

5
5*4
20*3
60*2
120*1
1*0


fatorial = fatorial * numero anterior;
5
5 4 3 2 1

(numInserido * numInserido - 1)
5 * 4 = 20 //preciso armazenar o 20
20 * 3
60 * 2
120 * 1
1 * 0

5 * 4

5 * 4
4 * 3
3 * 2
2 * 1

4
4 * 3 * 2 * 1




 */