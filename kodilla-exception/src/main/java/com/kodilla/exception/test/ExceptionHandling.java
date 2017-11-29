package com.kodilla.exception.test;

import java.time.LocalDate;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2.5, 3.5);
        } catch (Exception e) {
            System.out.println("Test of new exception");
        } finally {
            System.out.println(LocalDate.now());
        }
    }
}
