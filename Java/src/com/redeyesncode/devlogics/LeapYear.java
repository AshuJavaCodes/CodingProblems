package com.redeyesncode.devlogics;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {

       int inputYear = new Scanner(System.in).nextInt();

        int result =  isLeapYear(inputYear);
        if(result==0){
           System.out.println(inputYear+" is a leap year");

       }else{
            System.out.println(inputYear+" This is not a leap year. ");
        }
    }

    static int isLeapYear(int year){
        // divisible by 4 or not divisible by 100
        if(year%4==0 || year%100!=0){
            return 0;
        }else {
            return -1;
        }




    }

}
