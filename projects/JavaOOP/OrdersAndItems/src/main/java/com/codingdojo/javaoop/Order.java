package com.codingdojo.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private List<Item> items = new ArrayList<>();

    public Order() {
    }

    public Order(String name) {
        this.name = name;
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}