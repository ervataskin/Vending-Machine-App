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
}
