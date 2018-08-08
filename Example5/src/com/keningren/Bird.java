package com.keningren;

public abstract class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing");
    }

    public Bird(String name) {
        super(name);
    }

    abstract public void fly();
}
