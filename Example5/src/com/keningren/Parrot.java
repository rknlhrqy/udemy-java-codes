package com.keningren;

public class Parrot extends Bird implements IPortableDevice{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void carry() {
        System.out.println(getName() + " carries the phone");
    }

    @Override
    public void powerOn() {
        System.out.println(getName() + " powers on the phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(getName() + " has the phone number " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println(getName() + " answer the phone call");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
