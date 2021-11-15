package com.nitay;

public class LiqueurStore {
    public LiqueurStore(String ownerName, String[] availableDrinks) {
        this.ownerName = ownerName;
        this.availableDrinks = availableDrinks;
        this.cashInRegister = 0;
    }

    private String ownerName;
    private String[] availableDrinks;
    private float cashInRegister;

    public void purchaseDrink(String drinkName,float amountOfMoney) {
        for(int i=0;i<availableDrinks.length;i++){
            if(drinkName.equals(availableDrinks[i])){
                System.out.println(availableDrinks[i]+" purchased!");
                    availableDrinks[i] = availableDrinks[i]+"-OUT OF STOCK!";
                    setCashInRegister(cashInRegister+amountOfMoney);
                    return;
            }
            System.out.println(drinkName+" is not available");
            printDrinks();
            return;
        }
    }
    public void printDrinks(){
        System.out.println("\nAVAILABLE DRINKS:");
        for(int i=0;i<availableDrinks.length;i++){
            System.out.println(availableDrinks[i]);
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

