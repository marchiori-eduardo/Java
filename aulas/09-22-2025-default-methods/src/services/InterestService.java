package services;

public interface InterestService {
    public double getInterestRate();

    default double payment(double amount, int months){
        if (months < 1){
            throw new IllegalArgumentException("Months must be greater than zero");
        }
        return amount * Math.pow((1.0 + getInterestRate() / 100), months);
    }
}
