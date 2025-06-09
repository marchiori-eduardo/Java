package entities;

public class Product {

    private String Name;
    private double Price;

    public Product(double price, String name) {
        this.Price = price;
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
