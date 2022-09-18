package com.redeyesncode.algos;

import java.util.Arrays;

public class SelectionSort {
    public static final int[] unsortedArray = {2,6,16,45,35,32};



    public static void main(String[] args) {
        doSelectionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));


    }




    static void doSelectionSort(int[] arr){


        // We need to run the steps N number of times.
        for (int i = 0; i < arr.length; i++) {

            // We need to find the max element in the array then swap it with the last
            // index element
            int last = arr.length -i -1; // key point here in selection & bubble sort for the second loop
            // that we use difference is of -1
            //getMaxIndex contains the second loop.
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);



        }
    }


    static void swap(int arr[], int firstElement, int secondElement){
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;


    }





    // Finding the maximum element in the entire array.
    static int getMaxIndex(int[] arr, int start , int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                // here we are return the max index not the value.
                max = i;


            }



        }
        return max;




    }
    static int getMaxIndexValue(int[] arr, int start , int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                // here we are return the max index not the value.
                max = arr[i];


            }



        }
        return max;


    }
}
