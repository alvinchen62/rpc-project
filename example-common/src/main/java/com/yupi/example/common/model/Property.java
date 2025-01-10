package com.yupi.example.common.model;

public class Property {

    private String name;
    private int cost;


    public void set(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String get() {
        return "The price of " + name + " is " + cost * 100;
    }

    public int getCost() {
        return this.cost;
    }
}
