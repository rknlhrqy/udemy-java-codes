package com.keningren;

public class SomeClass {
    private final int instanceNum = 1;
    private final String name;
    private static int classC = 0;
    public final int instN;

    public SomeClass(String name) {
        this.name = name;
        classC++;
        instN = classC;
    }
}
