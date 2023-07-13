package PLExtra2;

import java.util.Scanner;

public class Exercise_04 {

    static void imprimirTabuada(int num){
        //int tabuada[];
        int n;
        for(int i = 1; i <= 10; i++){
             n = num * i;
             System.out.println(n);
        }
        //return tabuada;
    }




    public static void main(String[] args) {
        //scanner obrigatorio
        Scanner input = new Scanner(System.in);
        //declarar variáveis
        int num;
        //entrada de valores
        System.out.println("Insira um numero: ");
        num = input.nextInt();
        //chamada da função
        imprimirTabuada(num);
    }
}
