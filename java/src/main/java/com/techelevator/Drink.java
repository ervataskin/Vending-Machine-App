package com.techelevator;

public class Drink extends Item {

    private String type = "Drink";

    public Drink(String slot, String name, double price) {
        super(slot, name, price);
    }

    public String getSound() {
        return "Glug Glug, Yum!";
    }
}
