package com.example.trywithresources;

class Example {

    void method() {
        try (AutoClosableImpl ac = new AutoClosableImpl()) {
            System.out.println("Try Block.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally Block.");
        }
    }
}
