package com.techelevator;

public class Gum extends Item {
    private String type = "Gum";

    public Gum(String slot, String name, double price) {
        super(slot, name, price);
    }

    public String getSound() {
        return "Chew Chew, Yum";
    }
}
