package com.cbfacademy.shapes;

public class Sphere {
    
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Override the getArea method to calculate the area of the sphere
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2); // Area = 4 * π * radius²
    }
}



