package Lista02;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 17 ***");
        double balance, possibleLoan;
        System.out.println("Insira o saldo médio: ");
        balance = input.nextDouble();

        if(balance <= 2000){
            System.out.println("Não há crédito possível para essa conta.");
        } else if (balance <= 4000) {
            possibleLoan = balance * 0.2;
            System.out.println(possibleLoan);
        } else if (balance <= 6000) {
            possibleLoan = balance * 0.3;
            System.out.println(possibleLoan);
        } else {
            possibleLoan = balance * 0.4;
            System.out.println(possibleLoan);
        }
    }
}
