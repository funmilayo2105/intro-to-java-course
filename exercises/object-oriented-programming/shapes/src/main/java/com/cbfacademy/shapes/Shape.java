package com.cbfacademy.shapes;


    public abstract class Shape {
        // Abstract method to get the area of the shape
        abstract double getArea();
        
        // Method to get the name of the shape
        public String getName() {
            return this.getClass().getSimpleName(); // Returns the simple name of the class
        }
    }