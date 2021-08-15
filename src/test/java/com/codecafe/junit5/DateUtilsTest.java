package com.codecafe.junit5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DateUtilsTest {

    @Test
    void normalLeapYearTest() {
        assertTrue(DateUtils.isLeapYear(1992));
        assertFalse(DateUtils.isLeapYear(1993));
        assertTrue(DateUtils.isLeapYear(1996));
    }

    @Test
    void centuryYearsAreNotLeapYearsTest() {
        assertFalse(DateUtils.isLeapYear(2100));
        assertFalse(DateUtils.isLeapYear(1900));
    }

    @Test
    void year2000WasLeapYearTest() {
        assertTrue(DateUtils.isLeapYear(2000));
    }

}