package com.nitay;

import java.util.Scanner;

public class VendingMachine {

    static final Scanner SCANNER = new Scanner(System.in);

    double cash = 0;
    static Drink coke = new Drink("Coca Cola", 5,5, "a1");
    static Drink sprite = new Drink("Sprite", 5,5, "a2");
    static Drink water = new Drink("Water", 4.5,5,"a3");
    static Drink mangoJuice = new Drink("Mango Juice", 4.9,10,"a4");
    static Drink[] drinks = {coke, sprite, water, mangoJuice};

    public Drink chooseDrink(){
        System.out.println("Please enter drink's code: (press c enter to see the available codes) ");
        String code = SCANNER.next();
        for (int i=0; i<drinks.length; i++){
            if (code.equals(drinks[i].code)){
                return drinks[i];
            }
        }
        return null;
    }
    public void buyDrink(Drink drink){
        if (drink == null){
            System.out.println("No code found");
            System.out.println("Available codes: ");
            for (int i=0;i<drinks.length; i++){
                System.out.println(drinks[i].name + " code: " + drinks[i].code+", ");
            }
        }
        else{
            System.out.println(drink.name + " " + drink.price + " NIS");
            System.out.println("Please enter cash to the machine: ");
        if (drink.amount==0){
            System.out.println("Sorry " + drink.name + " is out of stock");
        }
        double amountOfMoney = SCANNER.nextDouble();
        if (amountOfMoney<drink.price){
            System.out.println("Not enough money");
        }
        else if (amountOfMoney> drink.price){
            System.out.println("Don't forget you're excess " + (amountOfMoney -drink.price));
            cash += drink.price;
            drink.amount--;
        }
        else {
            System.out.println("Thank you! please take your drink");
            cash += drink.price;
            drink.amount--;
        }
        }
    }
}
