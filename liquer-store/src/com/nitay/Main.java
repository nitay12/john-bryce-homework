package com.nitay;

public class Main {
        static final String[] drinks =new String[]{"Vodka","Rum","Whiskey","Gin","Tequila"};
        static LiqueurStore myBar = new LiqueurStore("Nitay", drinks);
    public static void main(String[] args) {
        myBar.purchaseDrink("Arak",50);
        myBar.purchaseDrink("Vodka",50);
        myBar.purchaseDrink("Vodka",50);
        myBar.printDrinks();
        System.out.println(myBar.getCashInRegister());
    }
}
