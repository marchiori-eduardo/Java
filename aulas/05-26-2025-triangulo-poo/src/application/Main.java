package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, P;

        double a, p;

        String maiorArea;

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira as medidas do Triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        P = (x.a + x.b + x.c) / 2;

        A = Math.sqrt(P * (P - x.a) * (P - x.b) * (P - x.c));

        System.out.println("Insira as medidas do Triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        p = (y.a + y.b + y.c) / 2;

        a = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
