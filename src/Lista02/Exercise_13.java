package Lista02;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** PL 02 EX 13 ***");
        int hour, minut;
        System.out.println("Insira a hora: ");
        hour = input.nextInt();
        System.out.println("Insira os minutos: ");
        minut = input.nextInt();

        if(hour < 1 && hour > 24 && minut < 0 && minut > 59){
            System.out.println("Hora ou minutos inválidos.");
        } else if (hour > 12){
            hour -= 12;
            System.out.println("Horário: " + hour + " " + minut);
        } else {
            System.out.println("Horário: " + hour + " " + minut);
        }
    }
}
