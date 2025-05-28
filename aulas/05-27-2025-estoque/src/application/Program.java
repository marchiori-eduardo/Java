package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Digite os dados do produto: ");
        System.out.print("nome: ");
        product.name = sc.nextLine();

        System.out.print("preço: ");
        product.price = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Digite o número de produtos que serão adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.printf("Dados atualizados: " +product);
        System.out.println();

        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();

        System.out.printf("Dados atualizados: " + product);


        sc.close();
    }
}
