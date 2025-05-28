package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock (){
        return  this.quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", U$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total: U$ "
                + String.format("%.2f", totalValueInStock());
    }
}
