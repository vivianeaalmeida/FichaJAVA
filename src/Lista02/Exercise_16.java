package Lista02;

import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 16 ***");
        int money, notas;
        System.out.println("Insira um valor múltiplo de 5: ");
        money = input.nextInt();
        if(money >= 200){
            notas = money / 200; //+=

        }

    }
}
/*
* pego um valor total, vejo quantas vezes pode ser dividido pela nota
* maior, tendo resto 0. quando for menor que a nota, por ex, 200,
* ai entra nas notas de 100. Depois entra na nota de 50 e assim vai.
*
* 550       570     235
*
* 200       200     200
* 200       200      20
* 100       100      10
* 50         50       5
*            20
*
*
*
*
* if(money >= 200)
*
*
*
*
*
*/