package Lista05;

public class Exercise_04_1 {
    public static void main(String[] args) {
        for (int line = 0; line <= 5; line++) {
            for(int column = 0; column < 5 ; column++){
                System.out.print("+");
            }
            System.out.println("*");
        }
    }
}



/*
    'Piramide' invertida :O

    public class Exercise_04_1 {
        public static void main(String[] args) {
            for (int line = 0; line <= 5; line++) {
                for(int column = line; column < 5 ; column++){ column eh 0
                    System.out.print("+");
                }
                System.out.println("*");
            }
        }
    }

    primeiro loop imprime:
    line: 0
    column: 0 1 2 3 4 5       //e pega o * no fim do loop

    line: 1
    column: 1 2 3 4 5

    line: 2
    column: 2 3 4 5

    line: 3
    column: 3 4 5









    linha
    coluna
    imprimir até o final da linha







*/