package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Eduardo\\Desktop\\java\\java-basico\\aulas\\08-17-2025-bloco-finally\\bloco.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file); //irá ler a partir do arquivo

            while (sc.hasNextLine()) { //irá percorrer as linhas do arquivo
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
