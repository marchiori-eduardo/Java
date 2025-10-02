package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println();

        double factor = 1.1;

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

//        list.forEach(new PriceUpdate());
//        list.forEach(Product::staticPriceUpdate);
//        list.forEach(Product::nonStaticPriceUpdate);
//        list.forEach( p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(cons);


        list.forEach(System.out::println);
    }
}
