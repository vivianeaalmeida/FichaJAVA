package Lista02;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 05 ***");
        int firstValue, secondValue;
        System.out.println("Introduza o primeiro número: ");
        firstValue = input.nextInt();
        System.out.println("Introduza o segundo número: ");
        secondValue = input.nextInt();

        if(firstValue > secondValue){
            System.out.println("Menor valor: " + secondValue);
            System.out.println("Maior valor: " + firstValue);
        } else {
            System.out.println("Menor valor: " + firstValue);
            System.out.println("Maior valor: " + secondValue);
        }
    }
}
