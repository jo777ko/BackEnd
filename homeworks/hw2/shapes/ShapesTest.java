package de.telran.geork.homeworks.hw2.shapes;

import java.util.Scanner;

public class ShapesTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6,4, 5);
        Rectangle rectangle = new Rectangle(3, 5);
        Square square = new Square(7);

        circle.calculateAre();
        circle.calculatePerimeter();
        triangle.calculateAre();
        triangle.calculatePerimeter();
        rectangle.calculateAre();
        rectangle.calculatePerimeter();
        square.calculateAre();
        square.calculatePerimeter();

        ShapeGenerator shapeGenerator = new ShapeGenerator();
        shapeGenerator.generate();
    }

}