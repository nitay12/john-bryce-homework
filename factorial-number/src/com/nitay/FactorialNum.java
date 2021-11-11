package com.nitay;

import java.util.Scanner;

public class FactorialNum {
    static final Scanner SCANNER = new Scanner(System.in);
    static final String prompt = "Please enter a whole number to get it's factorial: ";
    public static void main(String[] args) {
        int num = factorial(getUserInput());
        System.out.println(num);
    }
    static int getUserInput(){
        System.out.print(prompt);
        return SCANNER.nextInt();
    }
    static int factorial(int num){
        int product = 1;
        for(int i = 1; i<=num; i++) {
            product *= i;
        }
        return product;
    }
}
