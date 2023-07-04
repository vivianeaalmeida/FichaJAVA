package Lista04;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 04 EX 02 ***");
        int option;

        do{
            System.out.println("Insira uma opção: 1 | 2 | 3| 4 : ");
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
                    System.out.println("Opção inválida");
            }
        } while (option != 4);
    }
}



/*
1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair

 */