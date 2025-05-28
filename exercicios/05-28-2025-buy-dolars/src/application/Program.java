package application;

import util.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double dolar = sc.nextDouble();

        System.out.println();
        System.out.print("Quantos dólares serão comprados? ");
        double compra = sc.nextDouble();

        double total = Converter.CurrencyConverter(dolar, compra);

        System.out.println();
        System.out.printf("O total a pagar será: %.2f%n", total);






        sc.close();
    }
}
