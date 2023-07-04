package PLExtra;

public class Exercise_04_2 {
    public static void main(String[] args) {
        for (int line = 5; line > 0; line--) {
            for(int column = line; column < 5 ; column++){
                System.out.print("+");
            }
            System.out.println("*");
        }
    }
}

/*
line 5
column 5
passa direto na condição, pois 5 não é menor que 5. é igual. Imprime o *.

line 4
column 4
4 < 5. Sim. Imprime o + e depois o *.

line 3
column 3

3 < 5. Sim. Imprime o + e depois o *.
Aumenta um na column
4 < 5. Sim. Imprime outro *

...output foi:

*
+*
++*
+++*
++++*

 */