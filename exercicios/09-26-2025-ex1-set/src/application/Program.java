package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file fill path: ");
        String path = sc.nextLine();



        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" ");
                String username = fields[0];
                LocalDateTime moment = LocalDateTime.ofInstant(Instant.parse(fields[1]), ZoneId.systemDefault());

                set.add(new LogEntry(username, moment));

                line = br.readLine();

            }
            System.out.println("Total users: " + set.size());

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
