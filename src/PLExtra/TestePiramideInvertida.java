package PLExtra;

public class TestePiramideInvertida {
    public static void main(String[] args) {
        for (int line = 1; line < 5; line++) {
            for(int column = 5; column > 0 ; column--){
                System.out.print(line);
            }
            System.out.println(line);
        }
    }
}




/*
public class TestePiramideInvertida {
    public static void main(String[] args) {
        for (int line = 0; line <= 5; line++) {
            for(int column = line; column < 5 ; column++){ //column eh 0
                System.out.print("+");
            }
            System.out.println("*");
        }
    }
}*/

/*
line 0
column 0 1 2 3 4 5

line 1
column 1 2 3 4 5

line 2
column 2 3 4 5

line 3
column 3 4 5

line 4
column 4 5

line 5
column 5



 */