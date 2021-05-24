package com.codecafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void test() {
        MathUtils mathUtils = new MathUtils();
        int expected = 5;
        int actual = mathUtils.add(3, 2);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void testComputeSquareArea() {
        MathUtils mathUtils = new MathUtils();
        double expected = 25.0;
        double actual = mathUtils.computeSquareArea(6);
        assertEquals(expected, actual, "Should return right Area of a Square");
    }

}