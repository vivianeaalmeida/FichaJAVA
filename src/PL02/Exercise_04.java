package PL02;
import java.util.Scanner;
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 04 ***");
        int score;
        System.out.println("Introduza o lugar final: ");
        score = input.nextInt();

        switch (score){
            case 1:
                System.out.println("10 pontos");
                break;

            case 2:
                System.out.println("8 pontos");
                break;

            case 3:
                System.out.println("6 pontos");
                break;

            case 4:
                System.out.println("5 pontos");
                break;

            case 5:
                System.out.println("4 pontos");
                break;

            case 6:
                System.out.println("3 pontos");
                break;

            case 7:
                System.out.println("2 pontos");
                break;

            case 8:
                System.out.println("1 ponto");
                break;

        }
    }
}
