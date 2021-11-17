package com.nitay;

public class Main {
        static final Drink vodka = new Drink("Vodka",13.9f,3);
        static final Drink rum = new Drink("Rum",13.9f,3);
        static final Drink whiskey = new Drink("Whiskey",13.9f,3);
        static final Drink gin = new Drink("Gin",13.9f,3);
        static final Drink tequila = new Drink("Tequila",13.9f,3);
        static final Drink[] drinks =new Drink[]{vodka,rum,whiskey,gin,tequila};
        static LiqueurStore myBar = new LiqueurStore("Nitay", drinks);
    public static void main(String[] args) {
        myBar.purchaseDrink(vodka,12);
        myBar.purchaseDrink(vodka,14);
        myBar.purchaseDrink(vodka,1);
        myBar.purchaseDrink(gin,100);
        myBar.printDrinks();
        System.out.println(myBar.getCashInRegister());
    }
}
