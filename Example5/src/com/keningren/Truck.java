package com.keningren;

public class Truck {
    private String name;
    private int age;

    public Truck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Truck() {
        this("Buick", 23);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
