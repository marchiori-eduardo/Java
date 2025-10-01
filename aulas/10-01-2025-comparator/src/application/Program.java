package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("TV", 900.0));

        /*                    VERSÃO SUGERIDA PELA IDE:
            Comparator<Product> comp = Comparator.comparing(p -> p.getName().toUpperCase());
        */


//EXPRESSÃO LAMBDA: Comparator<Product> comp = (p1, p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        /*           |      */
        /*EXPRESSÃO LAMBDA bem menos verbosa do que a implementação anonima :*/
    //                                                     |
    //                                                    \ /
    //                                                     V
        /*Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/


        //expressão inserida no argumento da função
        list.sort((p1, p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()););

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
