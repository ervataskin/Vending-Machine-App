package com.techelevator;


public class Item {

    private String slot;
    private String name;
    private Double price;
    private String type;

    private int inventory ;

    public Item(String slot, String name, Double price, String type) {
        this.inventory =5;
        this.slot = slot;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public String getSlot() {
        return slot;
    }

    public int getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }

}
