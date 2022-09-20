package com.redeyesncode.algos.RedRecursion;

public class Recursion {


    public static void main(String[] args) {

        // Print number from  1 to 5.
        // Conditions are : 1. Call only one function. 2. You cannot modify the function


        printNumberOne(1);

        // Key points related to recursion are:

        // 1. Functions remain the stack until they have finished  their lines of code.
        // 2. Once the function have completed their line of code. They are removed from the stack the order they were placed.

        // RECURSION ( A Coder's Nightmare )

        // A function calling itself it is known as recursion.
        // Every recursion program should have a base condition which holds a boolean value to tell java that "If this particular
        // condition is true stop the recursive call.

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
