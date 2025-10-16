package com.npv.week6.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("savings_accounts")
public class Savings extends Account {

    private double interestRate; // percentage (e.g., 2.5)

    public Savings() {}

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
}
