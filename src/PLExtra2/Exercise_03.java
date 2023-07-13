package PLExtra2;

import java.util.Scanner;

public class Exercise_03 {

    static double areaRetangulo(double base, double altura){
        double area;
        area = base * altura;

        return area;
    }


    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        double base, altura;
        //entrada de valores
        System.out.println("Insira o valor da base: ");
        base = input.nextInt();
        System.out.println("Insira o valor da altura: ");
        altura = input.nextInt();


        areaRetangulo(base, altura);
    }
}
