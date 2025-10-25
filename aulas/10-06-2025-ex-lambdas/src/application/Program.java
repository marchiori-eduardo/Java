package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        ProductService ps = new ProductService();



//        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);

        System.out.println("Sum =" + String.format(" %.2f", sum));

//        list.forEach(System.out::println);

    }
}
