package com.npv.week6.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("checking_accounts")
public class Checking extends Account {

    private double insufficientFundFee;

    public Checking() {}

    // only this class's own field needs getters/setters
    public double getInsufficientFundFee() { return insufficientFundFee; }
    public void setInsufficientFundFee(double insufficientFundFee) { this.insufficientFundFee = insufficientFundFee; }
}
