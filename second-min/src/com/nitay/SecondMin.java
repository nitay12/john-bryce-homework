package com.nitay;

import java.util.Scanner;

public class SecondMin {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr = generateArr();
        int num = getSecondMin(arr);
        System.out.println("The second minimal number is: "+num);


    }
    // Generating an array from user input
    static int[] generateArr(){
        System.out.print("How many numbers would you like to enter?: ");
        int arrLength = SCANNER.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++){
            System.out.print("#"+(i+1)+" Please enter a whole number: ");
            arr[i]=SCANNER.nextInt();
        }
        return arr;
    }
    // Getting the second minimal number from a given array
    static int getSecondMin(int[] arr){
        int minNumber = arr[0];
        int secMinNumber = arr[1];
        if (minNumber>secMinNumber){
            minNumber=arr[1];
            secMinNumber=arr[0];
        }
        for(int i=2; i<arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i]<minNumber){
                secMinNumber = minNumber;
                minNumber = arr[i];
            }
            else if (arr[i]<secMinNumber){
                    secMinNumber=arr[i];
            }
        }
        return secMinNumber;
    }

}
