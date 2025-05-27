import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double soma = 0;


        System.out.println("Digite a quantidade de notas: ");
        int x = sc.nextInt();

        System.out.println("Digite as notas em sequência: ");

        for (int i = 0; i < x; i++) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            soma = n1 * 2.0 + n2 * 3.0 + n3 * 5.0 / 10.0;

            System.out.println(soma);

        }


        sc.close();
    }
}
