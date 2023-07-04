package Lista03;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 06 ***");
        int numInput, more, less;
        System.out.println("Insira um número: ");
        numInput = input.nextInt();
        more = numInput + 5;
        less = numInput - 5;

        while (numInput > less){
            System.out.println(less);
            less++;
        }
        while (numInput < more){
            numInput++;
            System.out.println(numInput);
        }

    }
}

/*
recebo 15 (numInput)
enq 15 > 10
imprimo 10++ até chegar em 15. 10 11 12 13 14
numInput é igual 15 no fim do while.
entra no proximo com valor de 16. e somo até chegar a 20. numInput + 5.

10      16
11      17
12      18
13      19
14      20

numInput + 5
numInput - 5
while (numInput <= numInput + 5){
 */