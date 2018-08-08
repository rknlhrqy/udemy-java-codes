package com.keningren;

public class Car {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car() {
        this("Porche", 15);
    }

    public void drive(double speed) {
        System.out.println("speed = " + String.valueOf(speed));
    }
}
