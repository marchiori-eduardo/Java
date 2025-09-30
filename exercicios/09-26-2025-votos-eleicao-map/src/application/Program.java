package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> results = new HashMap<>();

        System.out.print("Enter results path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int numberVotes = Integer.parseInt(fields[1]);

                results.put(name, numberVotes);

                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Votos Totais: 0");
        for (String key : results.keySet()) {
            System.out.println(key + ": " + results.get(key));
        }
        sc.close();
    }
}
