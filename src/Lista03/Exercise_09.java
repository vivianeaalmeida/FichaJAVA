package Lista03;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 03 EX 09 ***");
        int readNumber, readIncrement, init = 0;
        System.out.println("Insira um número: ");
        readNumber = input.nextInt();
        System.out.println("Insira um incremento: ");
        readIncrement = input.nextInt();

        while (init < readNumber){ //enquanto 0 for menor que 10
            System.out.println(init);
            init += readIncrement;

        }
            //0 e 10 init

    }
}
