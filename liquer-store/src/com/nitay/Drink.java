package com.nitay;

public class Drink {
    public Drink(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    private String name;
    private float price;
    private int amount;

    public void decreaseOne() {
        this.amount-=1;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String toString(){
        return this.name;
    }
}
