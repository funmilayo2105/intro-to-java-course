package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    // Constructor that accepts parameters for make, model, colour, and year
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // Returns the make of the car
    public String getMake() {
        return make;
    }

    // Returns the model of the car
    public String getModel() {
        return model;
    }

    // Returns the year the car was made
    public int getYear() {
        return year;
    }

    // Returns the colour of the car
    public String getColour() {
        return colour;
    }

    // Sets a new colour for the car
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Returns the car's details including make, model, colour, and year
    public String getDetails() {
        return "Car Details: Make - " + make + ", Model - " + model + 
               ", Colour - " + colour + ", Year - " + year;
    }
}

