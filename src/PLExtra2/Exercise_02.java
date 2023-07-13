package PLExtra2;

import java.util.Scanner;

public class Exercise_02 {

    static double media(int n1, int n2, int n3){
        double mediaAritm;
        mediaAritm = (n1 + n2 + n3) / 3;
        System.out.println("A media eh: " + mediaAritm);
        return mediaAritm;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int valor1, valor2, valor3; //posso declarar n1n2n3, mas nao "importa"
        //entrada dos valores
        System.out.println("Insira o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.println("Insira o segundo valor: ");
        valor2 = input.nextInt();
        System.out.println("Insira o terceiro valor: ");
        valor3 = input.nextInt();
        //chamada funcao
        media(valor1, valor2, valor3);
    }
}
