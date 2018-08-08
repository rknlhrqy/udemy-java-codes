package com.keningren;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y) {
        super(x, y);
        this.width = 0;
        this.height = 0;
    }

    public  Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
