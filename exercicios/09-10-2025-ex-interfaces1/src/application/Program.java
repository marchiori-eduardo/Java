package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter the data of contract: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date: ");
        Date date = sdf.parse(sc.next());;
        System.out.print("Enter value of contract: ");
        double amount = sc.nextDouble();
        System.out.print("enter the number of installments");
        int numberInstalments = sc.nextInt();
        System.out.println("Installments: ");


        sc.close();
    }

}