package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTestTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 25, circle.getArea(), "Area should match π * r^2");
    }

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(5);
        assertEquals(2 * Math.PI * 5, circle.getPerimeter(), "Circumference should match 2 * π * r");
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea(), "Area should match length * width");
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.getPerimeter(), "Perimeter should match 2 * (length + width)");
    }

    @Test
    public void testRectangleSides() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(4, rectangle.numberOfSides(), "Rectangle should have 4 sides");
    }

    @Test
    public void testRightTriangleArea() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6, triangle.getArea(), "Area should match (leg1 * leg2) / 2");
    }

    @Test
    public void testRightTrianglePerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(3 + 4 + 5, triangle.getPerimeter(), "Perimeter should match leg1 + leg2 + hypotenuse");
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25, square.getArea(), "Area of square should match side * side");
    }

    @Test
    public void testSquarePerimeter() {
        Square square = new Square(5);
        assertEquals(20, square.getPerimeter(), "Perimeter of square should match 4 * side");
    }

    @Test
    public void testIsocelesRightTriangleArea() {
        IsocelesRightTriangle isoTriangle = new IsocelesRightTriangle(5);
        assertEquals(12.5, isoTriangle.getArea(), "Area should match (leg * leg) / 2");
    }

    @Test
    public void testIsocelesRightTrianglePerimeter() {
        IsocelesRightTriangle isoTriangle = new IsocelesRightTriangle(5);
        double hypotenuse = Math.sqrt(50);
        assertEquals(5 + 5 + hypotenuse, isoTriangle.getPerimeter(), "Perimeter should match leg + leg + hypotenuse");
    }
}
