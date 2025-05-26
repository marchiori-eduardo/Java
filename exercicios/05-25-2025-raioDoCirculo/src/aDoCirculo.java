import java.util.Locale;
import java.util.Scanner;

public class aDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o raio da circunferência: ");

        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("Área da circunferência = %.4f%n", area);


        sc.close();
    }
}
