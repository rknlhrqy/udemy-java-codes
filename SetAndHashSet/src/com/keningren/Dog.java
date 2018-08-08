package com.keningren;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Dog) {
            return this.name.equals(((Dog) obj).getName());
        }

        return false;
    }
}
