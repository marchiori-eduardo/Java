package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(String name, Double price) {
        super(name, price);
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + String.format(" (used) $ %.2f", super.getPrice()) + " (manufacture date: " +  sdf.format(manufactureDate) + ")";
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

}
