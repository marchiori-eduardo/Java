package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Localizando o arquivo com seu caminho
        File file = new File("C:\\Users\\Eduardo\\Desktop\\java\\java-basico\\aulas\\08-20-2025-read-files\\in.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) { //irá percorrer o arquivo identificando as linhas escritas
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}
