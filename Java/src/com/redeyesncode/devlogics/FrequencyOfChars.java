package com.redeyesncode.devlogics;

import java.util.Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        countCharsInString("RedEyesNCode");

    }

    static void countCharsInString(String inputString){
        int count = 1;
        int length = inputString.length();
        int[] freq = new int[inputString.length()];

        char[] string = inputString.toCharArray();

        // running the steps N number of times i.e to the length of the String.

//        for (int i = 0; i < inputString.length(); i++) {
//            char currrentChar = inputString.charAt(i);
//            for (int j = i+1; j < inputString.length(); j++) {
//                if(currrentChar == inputString.charAt(j)){
//                    count++;
//                }
//
//            }
//            System.out.println(currrentChar+" has frequency of "+count);
//        }

        for (int i = 0; i < inputString.length(); i++) {

            for (int j = i+1; j < inputString.length(); j++) {
                freq[i] = 1;

                if(string[i]==string[j]){
                    freq[i]++;
                }

                // We are changing the value once the searching has been done from the particular
                // element & we want to avoid that searching for the same element again and again
                string[j] = 0;
            }

            for(i = 0; i < freq.length; i++) {
                if(string[i] != ' ' && string[i] != '0')
                    System.out.println(string[i] + "-" + freq[i]);
            }

        }
        System.out.println(Arrays.toString(freq));
    }

}
