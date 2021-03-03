package com.example.lambda.pkg01;

public class Factory {

    public static FunctionalInterfaceExample create() {
        return () -> System.out.println("lambda function");
    }
}
