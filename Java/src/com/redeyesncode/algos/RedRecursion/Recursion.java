package com.redeyesncode.algos.RedRecursion;

public class Recursion {


    public static void main(String[] args) {

        // Print number from  1 to 5.
        // Conditions are : 1. Call only one function. 2. You cannot modify the function

        printNumberOne(1);

    }

    private static void printNumberOne(int i) {
        System.out.println(i);
        printNumberTwo(2);

    }

    private static void printNumberTwo(int i) {
        System.out.println(i);
        printNumberThree(3);
    }

    private static void printNumberThree(int i) {
        System.out.println(i);
        printNumberFour(4);
    }

    private static void printNumberFour(int i) {
        System.out.println(i);
        printNumberFive(4);
    }

    private static void printNumberFive(int i) {
        System.out.println(i);
    }


}
