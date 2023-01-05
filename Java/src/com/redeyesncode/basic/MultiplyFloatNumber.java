package com.redeyesncode.basic;

import java.util.Scanner;

public class MultiplyFloatNumber {

    public static void main(String[] args) {
        System.out.println("Please enter two float numbers");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println("Please enter second number");
        float b = scanner.nextFloat();

        float result = a*b;
        System.out.println("Result is "+result);



    }
}
