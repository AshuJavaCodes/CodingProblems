package com.redeyesncode.algos;

public class LinearSearch {
    public static final int[] ascendingArray = {2,4,5,17,34,55,86,};

    public static void main(String[] args) {

        for (int i = 0; i < ascendingArray.length; i++) {

            System.out.println("Element number  "+i+" of Ascending array is : " + ascendingArray[i]);

        }


        //Linear search is same like loop over an array of objects till the very end.
        // Worst case : N (Number of compares done to find the target element

        // Finding the target number by doing linear search

        int target = 34;

        for (int i = 0; i < ascendingArray.length; i++) {
            if(ascendingArray[i]==target){
                System.out.println("Target found at position "+i);
                break;
            }else{
                System.out.println("Target not found at position "+i);
            }
        }


    }
}
