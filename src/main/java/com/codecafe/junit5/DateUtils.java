package com.codecafe.junit5;

public class DateUtils {

    private DateUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

}