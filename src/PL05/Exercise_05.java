package PL05;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 05 ***");
        double[] vetor = new double[10];
        double media = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextDouble();
            media += vetor[i];
            count++;
        }
        System.out.println("A media eh: " + (media / count));
    }
}
