package com.nitay;

public class Main {
    static VendingMachine jbVendingMachine = new VendingMachine();
    public static void main(String[] args) {
        while (true) {
            Drink chosenDrink = jbVendingMachine.chooseDrink();
            jbVendingMachine.buyDrink(chosenDrink);
        }
    }

}