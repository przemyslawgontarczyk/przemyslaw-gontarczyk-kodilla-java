package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){



        // Calculator Class test

        Calculator calculator = new Calculator(10,5);
        int sumResult = calculator.add();
        int subResult = calculator.subtract();
        if (sumResult == 15) {
            System.out.println("Sum function working ok!");
        }   else{
          System.out.println("Sum test failed");
            }
        if (subResult == 5){
            System.out.println("Sub function working ok!");
        }else{
            System.out.println("Sub test failed");
        }



    }
}