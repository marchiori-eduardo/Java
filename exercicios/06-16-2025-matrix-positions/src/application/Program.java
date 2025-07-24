package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a number entered: ");
        int x = sc.nextInt();
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (x == matrix[i][j]) {
                    System.out.printf("Position %d, %d:%n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d %n", matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Up: %d %n", matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.printf("Right: %d  %n", matrix[i][j + 1]);
                    }
                    if (i < matrix[i].length - 1) {
                        System.out.printf("Down: %d  %n", matrix[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();

        sc.close();
    }
}
