import java.util.Scanner;

public class diferencaDoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite em seguida os valores A, B, C e D:");

        int A, B, C, D, conta;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        conta = (A * B) - (C * D);

        System.out.printf("DIFERENCA = %d%n", conta);

    }
}
