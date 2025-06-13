package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How numbers will entered? ");
        int n = sc.nextInt();

        double[] position = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            position[i] = sc.nextDouble();
        }

        double biggestValue = 0.0;
        int positionBiggest = 0;

        for (int i = 0; i < n; i++) {
            if (position[i] > biggestValue) {
                biggestValue = position[i];
                positionBiggest = i;
            }
        }

        System.out.printf("Biggest value = %.1f",  biggestValue);
        System.out.println();
        System.out.printf("Position of the Biggest = %d",  positionBiggest);

        sc.close();
    }
}
