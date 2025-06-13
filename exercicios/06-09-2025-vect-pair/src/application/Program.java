package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        System.out.print("How many numbers will entered? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Insert a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Pair numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                cont++;
            }
        }

        System.out.println();
        System.out.printf("Pair quantity = %d", cont);


        sc.close();
    }
}
