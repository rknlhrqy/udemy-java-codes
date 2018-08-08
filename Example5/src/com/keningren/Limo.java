package com.keningren;

public class Limo extends Car {
    private String make;

    public Limo(String name, int age, String make) {
        super(name, age);
        this.make = make;
    }

    public Limo() {
        super("Buick", 20);
        this.make = "Ford";

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public void drive(double speed) {
        System.out.println("This is limo");
        super.drive(speed);
    }

    public void drive(Boolean start) {
        super.drive(10.2);
        System.out.println(start?"Yes":"No");
    }

    public void run(Boolean start) {
        drive(start);
        drive(10.2);
        super.drive(10.2);
    }
}
