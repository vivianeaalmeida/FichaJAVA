package PL02;
import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 03 ***");
        int salario;
        System.out.println("Introduza o salário total, sem pontos: ");
        salario = input.nextInt();

        if(salario <= 15000){
            System.out.println("Valor dos impostos sobre o salário: " + salario * 0.2);
        } else if (salario <= 20000) {
            System.out.println("Valor dos impostos sobre o salário: " + salario * 0.3);
        } else if (salario <= 25000) {
            System.out.println("Valor dos impostos sobre o salário: " + salario * 0.35);
        } else {
            System.out.println("Valor dos impostos sobre o salário: " + salario * 0.4);
        }
    }
}

//o else if pode ignorar os primeiros valores. Por exemplo, se o salário é maior que 15, ele vai pro Else if e não é
//necessário validar novamente. Ou seja. Seria else if (salario <= 20.000)
//e não salario > 15000 & salario <= 20000
// else if (salario > 15000 && salario <= 20000) -> else if(salario <= 20000)