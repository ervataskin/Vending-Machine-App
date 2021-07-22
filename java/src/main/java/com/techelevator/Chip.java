package com.techelevator;

public class Chip extends Item {

    private String type = "Chip";

    public Chip(String slot, String name, double price) {
        super(slot, name, price);
    }

    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
