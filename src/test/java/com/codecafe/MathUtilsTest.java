package com.codecafe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// unordered execution of tests

// in JUnit 5, every time a test runs,
// a new instance of the class is created

// i.e. a new instance of MathUtilsTest will be
// created for every @Test execution

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit() {
        System.out.println("Before All\n");
    }

    @AfterAll
    static void cleanUpAfterAll() {
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
    @DisplayName("Testing add method")
    void testAdd() {
        System.out.println("  testAdd");
        int expected = 5;
        int actual = mathUtils.add(3, 2);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide() {
        System.out.println("  testDivide");
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw ArithmeticException");
    }

    @Test
    @DisplayName("Testing computeSquareArea method")
    void testComputeSquareArea() {
        System.out.println("  testComputeSquareArea");
        double expected = 25.0;
        double actual = mathUtils.computeSquareArea(5);
        assertEquals(expected, actual, "Should return right Area of a Square");
    }

    @Test
    @Disabled
    @DisplayName("Under development! Should not be run!")
    void disabledTest() {
        fail("This test should be disabled");
    }

}