package PL05;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 05 EX 12 ***");
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        //criação do array 1
        for(int i = 0; i < 10; i++){
            System.out.println("Introduza um numero no vetor 1 ["+i+"]: ");
            array1[i] = input.nextInt();
        }
        //criacao do array 2
        for(int i = 0; i < 10; i++){
            System.out.println("Introduza um numero no vetor 2 ["+i+"]: ");
            array2[i] = input.nextInt();
        }

        for(int i = 0; i < 10; i++){
            System.out.print(array1[i] + " " + array2[i] + "\n");
//            for(int j = 0; j < array2.length; j++){
//                System.out.print(array2[j] + " ");
//            }
        }

    }
}

/*
porem eh preciso fazer matriz 10x2
2   1
4   3
6   5
8   7
10  9
12  11
14  13
16  15
18  17
20  19
22  21
 */