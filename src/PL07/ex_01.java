package PL07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_01 {
    public static void lerLinhasInteiras() throws FileNotFoundException{
        Scanner in = new Scanner(new File("ficheiros/exercicio_01.txt"));
        String linha;

        while (in.hasNextLine()){
            linha = in.nextLine();
            System.out.println(linha);
        }
        in.close();
    }
    public static void main(String[] args) {
        lerLinhasInteiras();
    }
}


//File file = new File("ficheiros/exercicio.txt");