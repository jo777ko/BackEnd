package de.telran.geork.homeworks.hw2.shapes;

import java.util.Random;

public class ShapeGenerator extends Shape{

    @Override
    public void draw() {

    }

    @Override
    public void calculateAre() {

    }

    @Override
    public void calculatePerimeter() {

    }

    void generate(){
        Random random = new Random();
        int x = random.nextInt(6);
        if(x == 0){
            Circle circle = new Circle(5);
            circle.draw();
        } else if (x == 1) {
            Square square = new Square(5);
            square.draw();
        } else if (x == 2){
            Triangle triangle = new Triangle(3,5,6);
            triangle.draw();
        } else if (x == 3) {
            Rectangle rectangle = new Rectangle(4,7);
            rectangle.draw();
        } else if (x == 4) {
            Cube cube = new Cube(6);
            cube.draw();
        } else {
            Cylinder cylinder = new Cylinder(4,7);
            cylinder.draw();
        }

    }
}
