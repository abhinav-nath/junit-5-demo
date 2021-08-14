package com.codecafe.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before All\n");
    }

    @BeforeEach
    void setUp() {
        System.out.println(" Before Each");
        greeting = new Greeting();
    }

    @Test
    void helloWorldTest() {
        System.out.println("  Test::helloWorldTest");
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void helloPersonTest() {
        System.out.println("  Test::helloPersonTest");
        assertEquals("Hello John", greeting.helloPerson("John"));
        assertNotEquals("Hello John", greeting.helloPerson("Wick"));
    }

    @AfterEach
    void tearDown() {
        System.out.println(" After Each\n");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("\nAfter All");
    }

}