package com.company;

public class BinarySearch {
    public static final int[] ascendingArray = {2,4,5,17,34,55,86};
    public static final int[] descendingArray = {87,50,49,41,34,11,2};

    public static void main(String[] args) {

        // Key concept for binary search
        // Note : You know that the given array is a sorted one in ascending order.
        // 1. Find the middle element in the array = array.length/2 = take int only 4.5 = 4
        // 2. Apply these conditions then
        // mid == target // answer
        // mid > target search in the right.
        // mid < target search in the left.




    }

    // We will be creating some functions in  order to code the binary search algo.

    private int returnMiddleElementIndex(int[] ascendingArray){
        int midIndex = ascendingArray.length/2; // this will throw back some exceptions if the limit exceet the
        // Integer max or min value. so optimized code will be start + (end-start)/2 Solve it it's basic maths to will
        // again arrive the same thing which is s+e/2.
        return midIndex;
    }

    // find if the given array is sorted in asc or desc order.

    private boolean isAscending(int[] arr){
        if(arr[0]>arr[arr.length]){
            return false;

        }else{
            return true;
        }


    }


    private void getBinarySearchTheory(int [] userArray, int target){
        int start = 0;
        int end = ascendingArray.length;
        boolean isAsc = isAscending(userArray);

        // Binary search also gets affected from the type of sorted array not that much
        // but some code will change.

        // Use while loop for this. for implementation.

        int [] exampleArray = {2,4,5,14,34,55,86,};

        int midIndex = returnMiddleElementIndex(exampleArray);
        int midValue = exampleArray[midIndex];
        int searchTarget = 4;
        // Applying the required conditions of the binary search.

        // start = target
        if (start==target){
            // return the index.

        }else if (midValue>searchTarget){
            // search ----> this side.

        }else if(midValue<searchTarget){

            // search <---- this side.
            // find the middle element for the new array now which is

            //After the first loop over array you will arrive at this new array.
            // Getting ready for repeating over the same logic again until we arrive at the solution.
            int[] shorterArray = {2,4,5};

            // if we are going <----- side then
            int newMidPoint = shorterArray.length/2; // Answer : 4[1]
            int newStart = start;
            int newEndIndex = midIndex-1;
            int newEndValue = shorterArray[newEndIndex];

        }








    }





}
