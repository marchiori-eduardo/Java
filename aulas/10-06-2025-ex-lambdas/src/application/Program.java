package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list);

        System.out.println("Sum =" + String.format("%.2f", sum));

//        list.forEach(System.out::println);

    }
}
