package com.codecafe.junit5;

public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld() {
        return HELLO + " " + WORLD;
    }

    public String helloPerson(String name) {
        return HELLO + " " + name;
    }

}