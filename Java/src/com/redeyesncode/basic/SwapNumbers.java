package com.redeyesncode.basic;

public class SwapNumbers {

    public static void main(String[] args) {

        swapNumberWithThirdVariable(12,13);
        swapNumberWithoutThirdVariable(4,77);

    }

    private static void swapNumberWithThirdVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers are replaced");

    }

    private static void swapNumberWithoutThirdVariable(int a, int b) {
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println("No use of third variable here.");


    }
}
