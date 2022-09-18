package com.redeyesncode.devlogics;

import java.text.ParseException;

public class IsNumericString {
    public static void main(String[] args) {
     checkIfNumericString("ASD");


    }

    private static void checkIfNumericString(String inputString) {

        try {
            Double.parseDouble(inputString);
            System.out.println("NUMERIC STRING ! ");
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Not a Numeric String");
        }


    }

}
