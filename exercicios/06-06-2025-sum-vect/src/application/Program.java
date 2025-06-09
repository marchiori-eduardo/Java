package application;

import entities.Data;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        Data[] vect = new Data[n];


        for(int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();
            vect[i] = new Data(number);
        }
        
        System.out.println();

        double sum = 0;

        for (int i = 0; i < vect.length; i++){
             sum += vect[i].getNumber();

        }
        System.out.print("Values = ");
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f  ",vect[i].getNumber());
        }

        System.out.println();

        System.out.printf("sum = %.2f", sum);

        System.out.println();

        double average = sum / vect.length;

        System.out.printf("Average = %.2f", average);

       sc.close();
    }
}
