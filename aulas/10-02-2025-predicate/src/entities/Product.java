package entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Boolean staticProductPredicate (Product p) {
        return p.getPrice() >= 100.0;
    }

    public Boolean nonStaticProductPredicate () {
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return  name +
                ", " + price ;
    }
}
