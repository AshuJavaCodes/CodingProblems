package com.company;
 interface MyInterface{
    void interfaceMethod();
    int interfaceMethodWithParameters(int a,int b);
}

public class InterfaceJava  implements MyInterface{

    @Override
    public void interfaceMethod() {

    }

    @Override
    public int interfaceMethodWithParameters(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {

    }


    //Steps to Create an Interface.

    // 1. It requires 3 things
    //(a) access specifier - public , private or protected.
    // (b) interface - keyword
    // (c) interfaceName - Define your own
    // Points to note Interface never has parameters ie. ()
    // interface only contains the method definition and not the method body meaning
    // we only write the method return type , method name and Method parameters inside the interface.



    // ** INTERFACES ARE ONLY IMPLEMENTED IN OTHER CLASSES AND THE IN THE CLASS IN WHICH THEY ARE CREATED.

    // Steps to Implement or Use an Interface.
    // implements InterfaceJava.MyInterface
    // Use the implements keyword in the class in which you want to use the interface
    //Next Step is to override the interface method ~ Use java inbuilt function
    //Now in overide you can define your own method body.



}

