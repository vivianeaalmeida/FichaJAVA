package PL02;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 08 ***");
        double nota1, nota2, nota3, mediaFinal;
        System.out.println("Insira a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Insira a terceira nota: ");
        nota3 = input.nextDouble();

        if(nota1 < 0 || nota1 > 20){
            System.out.println("Insira a primeira nota - maior que 0 e menor que 20: ");
            nota1 = input.nextDouble();
        }
        if(nota2 < 0 || nota2 > 20){
            System.out.println("Insira a segunda nota - maior que 0 e menor que 20: ");
            nota2 = input.nextDouble();
        }
        if(nota3 < 0 || nota3 > 20){
            System.out.println("Insira a segunda nota - maior que 0 e menor que 20: ");
            nota3 = input.nextDouble();
        }

        mediaFinal = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        if(mediaFinal > 9.5){
            System.out.println("O aluno está aprovado com a nota " + mediaFinal);
        } else {
            System.out.println("O aluno está reprovado");
        }
    }
}
