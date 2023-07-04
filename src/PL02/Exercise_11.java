package PL02;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 11 ***");
        double balance, credit, debit, finalBalance;
        System.out.println("Insira o saldo atual: ");
        balance = input.nextDouble();
        System.out.println("Insira o montante a creditar: ");
        credit = input.nextDouble();
        balance += credit;
        System.out.println("Insira o montante a debitar: ");
        debit = input.nextDouble();

        //ver se é possível realizar o debito
        if(debit > balance){
            System.out.println("Saldo insuficiente");
        }
        else if (debit <= balance){
            finalBalance = balance - debit;
            System.out.println("O saldo atual é de: " + finalBalance);
        } else {
            finalBalance = balance;
            System.out.println("O saldo atual é de: " + finalBalance);
        }

        //finalBalance = balance + credit - debit;
    }
}
