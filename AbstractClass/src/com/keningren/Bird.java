package com.keningren;

public abstract class Bird extends Animal implements ICanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathes in and breathes out");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping the wings");
    }
}
