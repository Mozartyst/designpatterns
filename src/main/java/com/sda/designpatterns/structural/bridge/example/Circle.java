package com.sda.designpatterns.structural.bridge.example;

public class Circle extends Shape {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;

    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
