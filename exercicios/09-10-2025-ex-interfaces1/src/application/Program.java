package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter the data of contract: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date: ");
        LocalDateTime date = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Enter value of contract: ");
        double valueContract = sc.nextDouble();
        System.out.print("enter the number of installments");
        int numberInstalments = sc.nextInt();
        System.out.println("Installments: ");


        sc.close();
    }

}