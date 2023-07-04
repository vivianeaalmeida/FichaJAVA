package PL02;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 02 ***");
        int salario;
        System.out.println("Introduza o salário total, sem pontos: ");
        salario = input.nextInt();
        if(salario <= 15000){
            System.out.println("Valor dos impostos sobre o salário: " + salario * 0.2);
        } else {
            System.out.println("Valor dos impostos sobre o salário: " + salario * 0.3);
        }
    }
}
