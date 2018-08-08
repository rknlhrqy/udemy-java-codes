package com.keningren;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat() is called");
        chew();
        super.eat();
    }
    @Override
    public void sleep() {
        super.sleep();
    }

    public void walk() {
        System.out.println("Dog walk() is called");
        // The method is from parent class. You can also use
        // super.move(5);
        move(5);
    }

    public void run() {
        System.out.println("Dog run() is called");
        // The method below is from parent class. You can also use
        // super.move(10);
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move() is called");
        moveLegs(speed);
        super.move(speed);
    }
}
