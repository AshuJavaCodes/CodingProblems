package com.company;

import java.util.Scanner;

public class CodeChefProblemOne implements MyInterface {

    @Override
    public void interfaceMethod() {

    }

    @Override
    public int interfaceMethodWithParameters(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        int num=0;
        int x=0;
        int p=0,z=0;
        int totalMarks=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Number of Quetions: ");
        num = reader .nextInt();
        System.out.print("Number of correct: ");
        x = reader .nextInt();
        System.out.print("Number of Passing marks: ");
        p = reader .nextInt();
        z=num-x; // Z >> NUMBER OF  OF INCORRECT QUESTIONS.
        //TOTAL MARKS GAINED.

        //TOTAL NEGATIVE MARKING = z*-1

        //EACH CORRECT ANSWER IS +3
        //EACH INCORRECT ANSWER IS -1
        //TOTAL MARKS = CORRECT QUESTION - INCORRECT QUESTIONS;
        totalMarks = (x*3) - (z*-1);

        for (int i = 0; i < x; i++) {
            System.out.println(x*3);
        }

        for (int i = 0; i < z; i++) {
            System.out.println(z*-1);
        }

        if(totalMarks<p){
            //FAIL
            System.out.println("FAILED");
        }else if(totalMarks>=p){
            System.out.println("PASSED");
        }



    }
}
