package com.codecafe.junit5;

public class DateUtils {

    public static boolean isLeapYear(int year) {
        return isDivisibleBy(year, 4) &&
                (!isDivisibleBy(year, 100) || isDivisibleBy(year, 400));
    }

    public static boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }

}