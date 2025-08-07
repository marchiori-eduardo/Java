package entities;

public class ImportedProduct extends Product{
    private double customsFee;

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price) {
        super(name, price);
    }

    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.getName() + String.format(" $ %.2f", totalPrice()) + String.format(" (Customs fee: $ %.2f)", customsFee);
    }

    public Double totalPrice(){
        return customsFee + getPrice();
    }

}
