package com.example;

// Define an abstract class Shape with abstract methods for area and perimeter
abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Define the Polygon interface
interface Polygon {
    int numberOfSides();
}

// Circle class inherits from Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class inherits from Shape and implements Polygon
class Rectangle extends Shape implements Polygon {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

// RightTriangle class inherits from Shape and implements Polygon
class RightTriangle extends Shape implements Polygon {
    protected double leg1;
    protected double leg2;

    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public double getPerimeter() {
        return leg1 + leg2 + Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}

// Square class inherits from Rectangle
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// IsocelesRightTriangle class inherits from RightTriangle
class IsocelesRightTriangle extends RightTriangle {
    public IsocelesRightTriangle(double leg) {
        super(leg, leg);
    }

    @Override
    public int numberOfSides() {
        return 3; // Still has three sides like any right triangle
    }
}

// Main class to demonstrate the creation and usage of these shapes
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        Square square = new Square(5);
        IsocelesRightTriangle isoTriangle = new IsocelesRightTriangle(5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Right Triangle Area: " + rightTriangle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Isoceles Right Triangle Perimeter: " + isoTriangle.getPerimeter());
        System.out.println("Square Sides: " + square.numberOfSides());
    }
}
