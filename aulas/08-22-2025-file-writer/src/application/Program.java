package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"}; //vetor com os itens a serem escritos

        String path = "C:\\Users\\Eduardo\\Desktop\\java\\java-basico\\aulas\\08-22-2025-file-writer\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for  (String line : lines) {
                bw.write(line); //comando para escrever
                bw.newLine(); //pular linha
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
