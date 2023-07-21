package PL07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex_03 {

    public static void lerLinhasInteirasDoFicheiro() throws FileNotFoundException {
        Scanner in = new Scanner(new File("ficheiros/exercicio_03.txt")); //arquivo para leitura
        String linha; //declaro a linha para leitura
        File file = new File("C:\\Users\\Public\\temporary\\novoEx03.txt"); //novo arquivo que será gerado
        PrintWriter printWriter = new PrintWriter(file);


        while (in.hasNextLine()){
            linha = in.nextLine();
            printWriter.println(linha);
        }
        in.close();
        printWriter.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasDoFicheiro();
    }
}


//File file = new File("ficheiros/exercicio_03.txt")