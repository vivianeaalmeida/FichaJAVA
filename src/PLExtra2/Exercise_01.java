package PLExtra2;

import java.util.Scanner;

public class Exercise_01 {

    static int menorNum(int num1, int num2, int num3){
        int menor;
        if(num1 < num2 && num1 < num3){
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        System.out.println("O menor numero eh: " + menor);
        return menor;
    }

    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int n1, n2, n3;
        System.out.println("Insira o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Insira o segundo numero: ");
        n2 = input.nextInt();
        System.out.println("Insira o terceiro numero: ");
        n3 = input.nextInt();

        menorNum(n1, n2, n3);
    }
}
