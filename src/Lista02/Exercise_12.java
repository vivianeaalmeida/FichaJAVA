package Lista02;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 12 ***");
        int option;
        System.out.println("Escolha uma opção de 1 a 4: ");
        option = input.nextInt();
        switch (option){
            case 1:
                System.out.println("Criar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida. Insira um número de 1 a 4.");
        }

    }
}
