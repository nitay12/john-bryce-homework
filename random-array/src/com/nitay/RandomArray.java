package com.nitay;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    static final Scanner SCANNER = new Scanner(System.in);
    static final String prompt = "Please enter the list desired length: ";
    public static void main(String[] args) {
        int arrLength = getUserInput();
        int[] arr = (createRandomArray(arrLength));
        printArr(arr);
    }
    static int getUserInput(){
        System.out.print(prompt);
        return SCANNER.nextInt();
    }
    static int[] createRandomArray(int len){
        int[] arr = new int[len];
        for(int i=0; i<len; i++ ){
            int randomNum = new Random().nextInt(101);
            arr[i] = randomNum;
        }
        return arr;
    }
    static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
