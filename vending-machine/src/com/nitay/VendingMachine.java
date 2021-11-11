package com.nitay;

import java.util.Scanner;

public class VendingMachine {
    public void buyDrink(double amountOfMoney){
        if (amountOfMoney<4.5){
            System.out.println("Not enough money");
        }
        else if (amountOfMoney>10){
            System.out.println("Too much money");
        }
        else {
            System.out.println("Thank you! please take your drink");
        }
    }
}
