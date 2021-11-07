package com.nitay;

import java.util.Scanner;

public class ReverseString {
    static final Scanner SCANNAER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter your line :");
        String userString = SCANNAER.nextLine();
        String reversedString="";
        for(int i = userString.length()-1; i>=0; i--){
            reversedString += userString.charAt(i);
        }
        System.out.println("youR reverseD texT iS " + reversedString);
    }
}
