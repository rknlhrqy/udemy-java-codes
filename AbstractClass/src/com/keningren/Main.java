package com.keningren;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("yorkie");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Austrilian Ringneck");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
