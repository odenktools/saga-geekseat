package com.odenktools.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test person A calculate
     */
    public void testValidPersonACalculate() {
        Person person = new Person(10, 12);
        int totalPersonA = person.calculate();
        assertEquals(totalPersonA, 2);
    }

    /**
     * Test person B calculate
     */
    public void testValidPersonBCalculate() {
        Person person = new Person(13, 17);
        int totalPersonA = person.calculate();
        assertEquals(totalPersonA, 4);
    }

    /**
     * Test sage person A calculate
     */
    public void testValidSagaPersonACalculate() {
        Person person = new Person(10, 12);
        Saga saga = new Saga(person);
        int sagaPersonA = saga.calculate();
        assertEquals(sagaPersonA, 2);
    }

    /**
     * Test sage person A calculate
     */
    public void testValidSagaPersonBCalculate() {
        Person person = new Person(13, 17);
        Saga saga = new Saga(person);
        int sagaPersonB = saga.calculate();
        assertEquals(sagaPersonB, 7);
    }
}
