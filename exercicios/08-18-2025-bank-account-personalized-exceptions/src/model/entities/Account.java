package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        if (amount < 0) {
            throw new DomainExceptions("Invalid Value, only positive numbers are allowed");
        }
        balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(double);
        balance -= amount;
    }

    public void validateWithdraw(Double amount) {
        if (amount > withdrawLimit ) {
            throw new DomainExceptions("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainExceptions("Not enough balance");
        }
        if (amount < 0) {
            throw new DomainExceptions("Invalid Value, only positive numbers are allowed");
        }
    }
    }

    @Override
    public String toString() {
        return String.format("New balance: $ %.2f%n", balance );
    }
}
