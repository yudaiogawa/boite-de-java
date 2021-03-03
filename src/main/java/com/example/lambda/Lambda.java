package com.example.lambda;

import com.example.lambda.model.Item;
import com.example.lambda.pkg01.Factory;
import com.example.lambda.pkg01.FunctionalInterfaceExample;
import com.example.lambda.pkg01.Process;

import java.util.function.Supplier;

class Lambda {

    void useFunctionalInterface() {
        FunctionalInterfaceExample ex = Factory.create();
        ex.run();
    }

    void runProcess() {
        Process process = new Process();
        process.basicProcess(() -> System.out.println("lambda function"));
    }

    void methodChain() {
        Item.save(i -> i.id("id").name("name").desc("desc").price(100));
    }

    void useSupplier() {
        Supplier<Double> s = Math::random;
        System.out.println(s.get());
    }
}
