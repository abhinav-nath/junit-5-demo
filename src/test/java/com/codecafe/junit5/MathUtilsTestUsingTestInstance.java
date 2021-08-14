package com.codecafe.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// unordered execution of tests

// We can use @TestInstance to create the instance of the Test Class
// per class or per method
// No need of static in @BeforeAll and @AfterAll if we are
// using @TestInstance per class

// By default it is PER_METHOD

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTestUsingTestInstance {

    MathUtils mathUtils;

    // no need of static now
    @BeforeAll
    void beforeAllInit() {
        System.out.println("Before All\n");
    }

    // no need of static now
    @AfterAll
    void cleanUpAfterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void init() {
        System.out.println(" Before Test");
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanUpAfterEach() {
        System.out.println(" After Test\n");
    }

    @Test
    void testAdd() {
        System.out.println("  testAdd");
        int expected = 5;
        int actual = mathUtils.add(3, 2);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void testDivide() {
        System.out.println("  testDivide");
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw ArithmeticException");
    }

    @Test
    void testComputeSquareArea() {
        System.out.println("  testComputeSquareArea");
        double expected = 25.0;
        double actual = mathUtils.computeSquareArea(5);
        assertEquals(expected, actual, "Should return right Area of a Square");
    }

}