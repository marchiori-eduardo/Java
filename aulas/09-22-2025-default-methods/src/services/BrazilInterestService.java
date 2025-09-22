package services;

public class BrazilInterestService implements InterestService {
    private Double interestRate = 2.0;


    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
