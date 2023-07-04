package Lista04;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 04 EX 04 ***");
        int numero;
        boolean primo = true;
        System.out.println("Insira um número: ");
        numero = input.nextInt();
        for(int i = numero - 1; i > 1; i--){
            if(numero % i == 0){
                primo = false;
            }
        }
        if(primo){
            System.out.println("O número é primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}

/*

substituir isso:
for(int i = primo; i > 0; i--)
por isso:
for(int i = primo - 1; i > 1; i--)

para o número não dividir por ele mesmo, nem por um,
realizando apenas as divisões pelos outros números e assim
verificando se ele é mesmo primo.

recebo 13. Ele divide por 12, 11, 10... e para em 2.

 */