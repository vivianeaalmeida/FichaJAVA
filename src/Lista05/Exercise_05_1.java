package Lista05;

public class Exercise_05_1 {
    public static void main(String[] args) {
        for (int line = 5; line > 0; line--) {
            for(int column = line; column < 5 ; column++){
                System.out.print(line);
            }
            System.out.println(line);
        }
    }
}
