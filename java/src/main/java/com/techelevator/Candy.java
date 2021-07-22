package com.techelevator;

public class Candy extends Item {
    private String type = "Candy";

    public Candy(String slot, String name, double price) {
        super(slot, name, price);
    }

    public String getSound() {
        return "Munch Munch, Yum!";
    }
}
