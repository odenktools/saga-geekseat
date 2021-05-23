package com.odenktools.app;

import java.io.Console;


public class App {

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }

    public void run() throws Exception {
        Console console = System.console();
        Saga saga;
        Person person;
        String strAgeOfDeathPersonA = console.readLine("Person A, Age of death: ");
        String strYearOfDeathPersonA = console.readLine("Person A, Year of death: ");

        int agePersonA = Integer.parseInt(strAgeOfDeathPersonA);
        int yearPersonA = Integer.parseInt(strYearOfDeathPersonA);

        if (agePersonA < 0 || yearPersonA < 0) {
            throw new Exception("Age / Year must > 0");
        }

        person = new Person(agePersonA, yearPersonA);
        int totalPersonA = person.calculate();
        saga = new Saga(person);
        int sagaPersonA = saga.calculate();
        console.printf("\r\n===========================================\r\n");
        console.printf("number of people killed on year " + totalPersonA + " is = " + sagaPersonA);
        console.printf("\r\n===========================================\r\n");


        String strAgeOfDeathPersonB = console.readLine("Person B, Age of death: ");
        String strYearOfDeathPersonB = console.readLine("Person B, Year of death: ");

        int agePersonB = Integer.parseInt(strAgeOfDeathPersonB);
        int yearPersonB = Integer.parseInt(strYearOfDeathPersonB);

        if (agePersonB < 0 || yearPersonB < 0) {
            throw new Exception("Age / Year must > 0");
        }

        person = new Person(agePersonB, yearPersonB);
        int totalPersonB = person.calculate();
        saga = new Saga(person);
        int sagaPersonB = saga.calculate();
        console.printf("\r\n===========================================\r\n");
        console.printf("number of people killed on year " + totalPersonB + " is = " + sagaPersonB);
        console.printf("\r\n===========================================\r\n");

        float summary = ((Float.parseFloat("" + sagaPersonA) + Float.parseFloat("" + sagaPersonB)) / 2.0f);
        console.printf("\r\n===========================================\r\n");
        console.printf("Average = " + (sagaPersonA) + "+" + (sagaPersonB) + "/2=" + summary);
        console.printf("\r\n===========================================\r\n");
    }
}
