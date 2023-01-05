package com.redeyesncode.basic;

public class EvenOdd {

    public static void main(String[] args) {

        checkIfEven(44);
        checkIfOdd(77);


    }
    private static int checkIfEven(int number){

        if(number%2==0){
            return 0;
        }else {
            return -1;
        }

    }

    private static int checkIfOdd(int number){
        if(number%2!=0){
            return 0;
        }else {
            return -1;

        }



    }

}
