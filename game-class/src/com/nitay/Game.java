package com.nitay;
// name, ,
public class Game {
    public Game(String name, int yearOfPublishing, float price) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.price = price;
    }
    public String name;
    public int yearOfPublishing;
    public float price;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println("price: " + price +"$");
    }
    public void install(){
        System.out.println(name + " is being installed!");
    }
}
