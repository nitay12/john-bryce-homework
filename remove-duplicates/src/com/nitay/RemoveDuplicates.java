package com.nitay;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    static final Scanner SCANNER = new Scanner(System.in);
    static final String inputPrompt = "Please enter the list length: ";

    public static void main(String[] args) {
    int[] arr = generateArr();
    int[] newArr = removeDuplicates(arr);
    printArr(newArr);
        System.out.println("Array fixed length: " + newArr.length);
    }

    static int[] removeDuplicates(int[] arr) {
        int len = arr.length;
        if (len == 0|| len==1) {
            return arr;
        }
        //Sorting the array
        Arrays.sort(arr);
        //Generating a temp array and storing the unduplicated elements
        int[] tempArr = new int[len];
        int newLen = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArr[newLen++] = arr[i];
            }
        }
        tempArr[newLen++] = arr[len - 1];
        // Creating new array with fixed length
        int[] newArr = new int[newLen];
        for (int i = 0; i < newLen; i++) {
            newArr[i] = tempArr[i];
        }
        return newArr;
    }

    // Generating an array from user input
    static int[] generateArr() {
        System.out.print(inputPrompt);
        int arrLength = SCANNER.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("#" + (i + 1) + " Please enter a whole number: ");
            arr[i] = SCANNER.nextInt();
        }
        return arr;
    }

    //Printing array elements separated by space
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
