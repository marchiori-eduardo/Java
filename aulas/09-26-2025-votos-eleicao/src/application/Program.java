package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> resultados = new HashMap<>();

        System.out.println("Enter results path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path)){

        } catch (IOException : e) {
            System.out.println("Error: " e.);
        }


    }
}
