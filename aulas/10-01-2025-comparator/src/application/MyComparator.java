package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        /*Nesse método de comparação:

        se retornar positivo: o primeiro é maior que o segundo
        se retornar 0: os dois são iguais
        se retornar negativo: o primeiro é menor que o segundo

        */
    }


}
