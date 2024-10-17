package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override the getArea method to calculate the area of the cylinder
    @Override
    public double getArea() {
        return height * Math.PI * Math.pow(radius, 2); // Area = height * π * radius²
    }
}
