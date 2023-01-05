package com.redeyesncode.basic;

import java.util.Scanner;

public class ReadNumberFromUserInput {



    // We use scanner for taking the input the specific class.
    public static void main(String[] args) {
        System.out.print("Please enter a number");
        Scanner scanner  = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(x+" Your entered number ");


    }
}
