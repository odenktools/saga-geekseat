package com.odenktools.app;

public class Person {
    int ageOfDeath;
    int yearOfDeath;

    public Person(int ageOfDeath, int yearOfDeath) {
        this.ageOfDeath = ageOfDeath;
        this.yearOfDeath = yearOfDeath;
    }

    public int calculate() {
        return yearOfDeath - ageOfDeath;
    }
}