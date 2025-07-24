package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product ;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product product) {
        this.product = product;
    }

    public Double subTotal(Integer quantity, Double price) {
        return quantity * price;
    }



    @Override
    public String toString() {
        return product.getProductName()
                + String.format(", $%.2f, ",product.getPrice())
                + "Quantity: " + quantity
                + String.format(", Subtotal: $%.2f", subTotal(quantity, price));
    }

    public Double subTotal() {
        return subTotal(quantity, price);
    }
}
