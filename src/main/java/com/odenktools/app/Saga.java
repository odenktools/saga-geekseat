package com.odenktools.app;

import java.util.Arrays;

public class Saga {
    private final Person person;

    public Saga(Person person) {
        this.person = person;
    }

    public int calculate() {
        int firstNumber = 0;
        int secondNumber = 1;
        int result = secondNumber;
        int output;
        int personCalculate = person.calculate();
        int[] totals = new int[personCalculate];

        for (int i = 0; i < personCalculate - 1; i++) {
            output = secondNumber + firstNumber;
            result = result + output;
            firstNumber = secondNumber;
            secondNumber = output;
            totals[i] = firstNumber;
            totals[i + 1] = secondNumber;
        }
        // return.
        return Arrays.stream(totals).sum();
    }
}
