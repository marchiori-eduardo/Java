import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, horas;
        double valorHora, salario ;

        System.out.println("Digite seu número de identificação:");
        id = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        horas = sc.nextInt();

        System.out.println("Digite o valor da hora:");
        valorHora = sc.nextDouble();

        salario = (valorHora * horas);

        System.out.printf("Número = %d%n", id);
        System.out.printf("salário = U$ %.2f", salario);


        sc.close();
    }
}
