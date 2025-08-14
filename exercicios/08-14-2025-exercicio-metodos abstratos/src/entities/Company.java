package entities;

public class Company extends Payers{

    private int numberOfEmployees;
    private Double tax;

    public Company() {
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public double taxes() {
        if (numberOfEmployees > 10) {
            tax = getAnualIncome() * 0.14;
        }
        else if (numberOfEmployees < 10) {
            tax = getAnualIncome() * 0.14;
        }
        return tax;
    }

    public String toString() {
        return String.format("%s: $ %.2f", super.getName(), tax);
    }

}
