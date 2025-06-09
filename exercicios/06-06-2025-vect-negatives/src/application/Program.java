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
        System.out.println();

        for (int i = 0; i <vect.length; i ++) {
            sc.nextLine();
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            vect[i] = new Data(number);
        }

        System.out.println("Negative numbers: ");
        for(int i =0; i<vect.length; i++){
            if (vect[i].getNumber()<0){
                System.out.println(vect[i].getNumber());
            }
        }

        sc.close();
    }
}
