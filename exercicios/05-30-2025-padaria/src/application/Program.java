package application;

import entities.Operation;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to PadaJava!");
        System.out.print("How many grams of Mortadela you will purchase today? ");
        double mortadelaG = sc.nextDouble();
        System.out.println();

        System.out.print("How many grams of Cheese would you like? ");
        double cheeseG = sc.nextDouble();
        System.out.println();

        System.out.println("How many breads?");
        int breadUnit = sc.nextInt();
        System.out.println();





        Operation operation = new Operation (mortadelaG, cheeseG, breadUnit);

        System.out.println(operation);
        sc.close();
    }
}
