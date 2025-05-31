package entities;

public class Operation {
    private double totalValue;
    private double mortadela;
    private double cheese;
    private int bread;

    public Operation( double mortadelaG, double cheeseG, int breadUnit){
        this.mortadela = mortadelaG;
        this.cheese = cheeseG;
        this.bread = breadUnit;
        inputValue(mortadelaG, cheeseG, breadUnit);
    }

    public void inputValue(double mortadelaG, double cheeseG, int breadUnit) {
        totalValue = mortadelaG * 0.636;
        totalValue = cheeseG * 0.836;
        totalValue += breadUnit;
    }


    public String toString() {
        return String.format("Details of order: %n")
                + "Items: "
                + String.format("%.0f", mortadela)
                + "g of mortadela, "
                + String.format("%.0f", cheese)
                + "g of cheese, "
                + bread
                + String.format(" breads. %n")
                + "Total value: "
                + String.format("%.2f", totalValue);
    }
}
