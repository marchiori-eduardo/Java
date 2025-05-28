package application;



import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();


        System.out.print("Funcionário: ");
        funcionario.name = sc.nextLine();

        System.out.println();
        System.out.print("Sálario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.printf("Funcionário: %s, $ %.2f%n", funcionario.name, funcionario.salarioLiquido() );


        System.out.println();
        System.out.print("Quanto % será o aumento? ");
        funcionario.percetage = sc.nextDouble();

        System.out.println();
        System.out.println(funcionario);
        sc.close();
    }
}
