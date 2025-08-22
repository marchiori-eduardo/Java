package application;

import entities.Company;
import entities.Individual;
import entities.Payers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Payers> list = new ArrayList<Payers>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome,numberOfEmployees));
            }
            else if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.println("Invalid input");
            }
            System.out.println();

        }

        System.out.println("TAXES PAID: ");
            double totalTax = 0;
        for (Payers p : list) {
            System.out.printf("%s: $ %.2f\n", p.getName(), p.taxes());
            totalTax += p.taxes();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f",totalTax);
        sc.close();
    }
}
