package org.example;

public class Calculator {
    //no attributes
    public int positiveAddition(int number1, int number2) {
        //return 0;
        // || OR
        // && AND
        if (number1 < 0 || number2 < 0) {
            throw new IllegalArgumentException("Both numbers bust be positive");
        }
        return number1 + number2;
    }
}
