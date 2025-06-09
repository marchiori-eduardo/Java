
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of %dth person: %n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        double porcentable = 0;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += height[i];
            if (age[i] < 16){
                porcentable ++;
            }
        }

        double averageH = sum / n;
        double percent = porcentable * 100.0 / n;


        System.out.println();
        System.out.printf("Average height: %.2f%n", averageH);
        System.out.printf("Peoples with less 16 years old: %.1f%%%n", percent);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }








        sc.close();
    }
}

