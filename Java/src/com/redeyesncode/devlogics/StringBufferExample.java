package com.redeyesncode.devlogics;

public class StringBufferExample {
    public static void main(String[] args) {
        // Strings are immutable right ? well, the String Buffer is
        // mutable you can easily insert, create new , delete chars containing
        // in the string

        // Example.

        StringBuffer stringBufferExample = new StringBuffer("RedEyesNCode");
        // Adding items to the end of the string
        stringBufferExample.append(1);

        // Insert the char at given position and also increases the length
        // of the array.
        stringBufferExample.insert(2,"x");
        System.out.println(stringBufferExample.toString());

    }
}
