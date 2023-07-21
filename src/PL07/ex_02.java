package PL07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex_02 {

    public static void usingPrintWriter() throws FileNotFoundException {
        String fileContent = "Hello! Adoro Programar em Java";

        File file = new File("C:\\Users\\Public\\temporary\\eeeovo.txt");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("É minha UFCD Favorita");

        printWriter.close();


    }
    public static void main(String[] args) throws FileNotFoundException {
        usingPrintWriter();
    }
}
