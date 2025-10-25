package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        Predicate<Product> pred = p -> p.getPrice() >= min;

//      list.removeIf(new ProductPredicate()); //implementação da interface
//      list.removeIf(Product::staticProductPredicate); //Method reference
//      list.removeIf(Product::nonStaticProductPredicate); //Method reference non-static
//      list.removeIf(pred); //expressão lambda declarada
        list.removeIf(p -> p.getPrice() >= min); //expressão lambda inline

        list.forEach(System.out::println);
    }
}
