import java.util.Locale;
import java.util.Scanner;

public class compra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd1,qtd2;
        double valorUnd1,valorUnd2, valorTotal;

        System.out.println("Insira as informações do primeiro produto na ordem:");
        System.out.println("[código] [quantidade] [valor]");
        sc.nextInt();
        qtd1 = sc.nextInt();
        valorUnd1 = sc.nextDouble();


        System.out.println("Insira as informações do segundo produto na ordem:");
        System.out.println("[código] [quantidade] [valor]");
        sc.nextInt();
        qtd2 = sc.nextInt();
        valorUnd2 = sc.nextDouble();



        valorTotal = (qtd1 * valorUnd1) + (qtd2 * valorUnd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);



        sc.close();
    }
}
