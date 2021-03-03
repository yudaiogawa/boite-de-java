package com.example.lambda;

import org.junit.jupiter.api.Test;

public class LambdaTest {

    Lambda sut = new Lambda();

    @Test
    void useFunctionalInterface() {
        sut.useFunctionalInterface();
    }

    @Test
    void runProcess() {
        sut.runProcess();
    }

    @Test
    void methodChain() {
        sut.methodChain();
    }

    @Test
    void useSupplier() {
        sut.useSupplier();
    }
}
