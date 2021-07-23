package com.techelevator;

import java.math.BigDecimal;

public class Money {

    private double current = 0;

    public double getCurrent() {
        return current;
    }

    public void feedCurrent(double money){
        this.current += money;
    }

    public void makePurchase(double cost) {
            this.current -= cost;

    }

    public String getChange(double amount) {

        double amountInPennies = amount * 100;
        double quarter;
        double dime;
        double nickel;

        quarter = (int) (amountInPennies / 25);
        amountInPennies %= 25;
        dime = (int) (amountInPennies / 10);
        amountInPennies %= 10;
        nickel = (int) (amountInPennies / 5);
        amountInPennies %= 5;

        return "Quarters: " + quarter + "\nDimes: " + dime + "\nNickels: " + nickel;
    }


}
