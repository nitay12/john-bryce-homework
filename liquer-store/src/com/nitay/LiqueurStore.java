package com.nitay;

public class LiqueurStore {
    public LiqueurStore(String ownerName, Drink[] availableDrinks) {
        this.ownerName = ownerName;
        this.availableDrinks = availableDrinks;
        this.cashInRegister = 0;
    }

    private String ownerName;
    private Drink[] availableDrinks;
    private float cashInRegister;

    public void purchaseDrink(Drink drink, float amountOfMoney) {
        if (drink.getAmount()<=0){
            System.out.println(drink.toString()+" is out of stock");
        }
        else {
            for (int i = 0; i < availableDrinks.length; i++) {
                if (drink == availableDrinks[i]) {
                    if(amountOfMoney>=drink.getPrice()){
                    System.out.println(availableDrinks[i].toString() + " purchased!");
                    availableDrinks[i].decreaseOne();
                    setCashInRegister(cashInRegister + drink.getPrice());
                    return;
                    }
                    else{
                        System.out.println("Not enough money! you payed "+amountOfMoney+", "+drink.toString()+" price is "+drink.getPrice());
                    }
                }
            }
            System.out.println(drink.toString() + " is not available");
            printDrinks();
            return;
        }
    }
    public void printDrinks(){
        System.out.println("\nAVAILABLE DRINKS:");
        for(int i=0;i<availableDrinks.length;i++){
            System.out.println(availableDrinks[i].toString()+": "+availableDrinks[i].getAmount());
        }
    }

    public float getCashInRegister() {
        return cashInRegister;
    }

    private void setCashInRegister(float cashInRegister) {
        this.cashInRegister = cashInRegister;
        if (this.cashInRegister<0){
            this.cashInRegister=0;
        }
    }
}

