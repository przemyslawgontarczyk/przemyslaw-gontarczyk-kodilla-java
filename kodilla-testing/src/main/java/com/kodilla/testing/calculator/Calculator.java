package com.kodilla.testing.calculator;

public class Calculator {

    int x;
    int y;

    public Calculator(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int add() {

        int sum = x + y;
        return sum;
    }

    public int subtract() {

        int sub = x - y;
        return sub;
    }
}
