package com.example.lambda.model;

import java.util.function.Consumer;

public class Item {

    private String id;
    private String name;
    private String desc;
    private int price;

    public Item id(String id) {
        this.id = id;
        return this;
    }

    public Item name(String name) {
        this.name = name;
        return this;
    }

    public Item desc(String desc) {
        this.desc = desc;
        return this;
    }

    public Item price(int price) {
        this.price = price;
        return this;
    }

    public static void save(Consumer<Item> c) {
        Item i = new Item();
        c.accept(i);
        System.out.println("saved the item below.");
        System.out.println(i);
    }

    @Override
    public String toString() {
        return "[ID] " + id + " [Name] " + name + " [Description] " + desc + " [Price] " + price;
    }
}
