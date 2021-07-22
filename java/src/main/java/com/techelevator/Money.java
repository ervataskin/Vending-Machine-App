package com.techelevator;

public class Money {

    private int current = 0;

    public int getCurrent() {
        return current;
    }

    public void feedCurrent(int money){
        this.current += money;
    }

    public void makePurchase(int cost){
        this.current -= cost;
    }
}
