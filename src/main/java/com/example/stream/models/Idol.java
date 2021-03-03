package com.example.stream.models;

public class Idol {

    private final String name;
    private final int age;

    public Idol(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[Name] " + name + " [Age] " + age;
    }
}
