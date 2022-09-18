package com.redeyesncode.algos;

import java.util.Arrays;

public class BubbleSort {
// https://www.youtube.com/watch?v=Y6Rd9ZQBVG0

    // Sinking sort, Exchange Sort , Inplace Sort & It's a Stable Sorting Algorithm.

    public static final int[] unsortedArray = {2,6,16,45,35,32};

    public static void main(String[] args) {
        performBubbleSort(unsortedArray);
//        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }


    public static void performBubbleSort(int[] arr){
        boolean isSwapped = false;
        // perform steps for N times
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            // For any value for i the swap does not occur means that the array is sorted
            // in asc or desc order automatically.
//            if(!isSwapped){
//                break;
//            }



            // Internal loop for comparing the elements.
            // j < arr.length -i or j <= arr.length -i -1 but why are we doing this

            // Answer : We are doing this because we don't want to compare the other part of the
            // sorted array as well.

            // Note start J from 1. not 0.
            for (int j = 1; j < arr.length-i; j++) { // or j<=arr.length-i-1;

                // doing the compares now.
                if(arr[j] < arr[j-1]){
                    // do the swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // swap has been done.
                    isSwapped = true;

                }
                // else no swap has happened.
            }
            // For any value for i the swap does not occur means that the array is sorted
            // in asc or desc order automatically.
            if(!isSwapped){
                break;
            }
        }
    }




}
