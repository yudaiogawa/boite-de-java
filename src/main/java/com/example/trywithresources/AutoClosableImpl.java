package com.example.trywithresources;

class AutoClosableImpl implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Closed.");
    }
}
