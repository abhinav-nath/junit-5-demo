package com.codecafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void test() {
        MathUtils mathUtils = new MathUtils();
        int expected = 5;
        int actual = mathUtils.add(3, 2);
        assertEquals(expected, actual);
    }

}