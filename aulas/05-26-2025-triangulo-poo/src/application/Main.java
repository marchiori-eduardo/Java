package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, P;

        double a, p;

        String maiorArea;

        System.out.println("Insira as medidas do Triângulo X:");
        double L1 = sc.nextDouble();
        double L2 = sc.nextDouble();
        double L3 = sc.nextDouble();

        P = (L1 + L2 + L3) / 2;

        A = Math.sqrt(P * (P - L1) * (P - L2) * (P - L3));

        System.out.println("Insira as medidas do Triângulo Y:");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double l3 = sc.nextDouble();

        p = (l1 + l2 + l3) / 2;

        a = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));

        if (a > A) {
            maiorArea = "Y";
        }
        else {
            maiorArea = "X";
        }


        System.out.printf("Área do triângulo X: %.4f%n", A);
        System.out.printf("Área do triângulo Y: %.4f%n", a);
        System.out.printf("Maior área: %s%n", maiorArea);

        sc.close();
    }
}
