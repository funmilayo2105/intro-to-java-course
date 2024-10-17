package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the getArea method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return length * width; // Area = length * width
    }
}
