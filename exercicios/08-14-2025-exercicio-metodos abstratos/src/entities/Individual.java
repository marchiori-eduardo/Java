package entities;

public class Individual extends Payers{

    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxes() {
        double tax = 0;
        if (getAnualIncome() < 20000) {
            tax = getAnualIncome() * 0.15;
        }
        else if (getAnualIncome() >= 20000) {
            tax = getAnualIncome() * 0.25;
        }
        if (healthExpenditures > 0) {
            tax -= healthExpenditures / 2;
        }
        if (tax < 0) {
            tax = 0;
        }

        return tax;
    }



}
