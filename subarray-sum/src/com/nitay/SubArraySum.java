package com.nitay;

import java.util.Scanner;

public class SubArraySum {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
     int[] arr = generateArr();
     int count = subarraySum(arr);
        System.out.println("The number of sub arrays equals to 0 is: " + count);
    }
    static int subarraySum(int[] arr) {
        int count = 0;
        for (int i=0; i< arr.length; i++) {
            int sum=0;
            for (int j= i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum == 0)
                    count++;
            }
        }
        return count;
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
}
