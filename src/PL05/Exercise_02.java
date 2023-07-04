package PL05;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 02 ***");

        //declarar váriaveis
        double[] vetor = new double[10];
        double total = 0;

        //ciclo para introduzir preços
        for(int i = 0; i < 10; i++){
            System.out.println("Insira o preço no vetor["+i+"]: ");
            vetor[i] = input.nextDouble();
            total += vetor[i];
        }
        System.out.println(total);
    }
}
