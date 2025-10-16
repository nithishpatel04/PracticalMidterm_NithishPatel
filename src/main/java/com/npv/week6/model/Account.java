package com.npv.week6.model;

import org.springframework.data.annotation.Id;

/** Base class with shared fields + getters/setters */
public class Account {

    @Id
    private String id;
    private String accountHolder;
    private double balance;

    public Account() {}

    // getters
    public String getId() { return id; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // setters
    public void setId(String id) { this.id = id; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public void setBalance(double balance) { this.balance = balance; }

    // simple domain ops (optional)
    public void deposit(double amount) { this.balance += amount; }
    public void withdrawal(double amount) { this.balance -= amount; }
}
