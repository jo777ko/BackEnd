package de.telran.geork.homeworks.hw2.shapes;

public class Rectangle extends Shape {
    private int first;
    private int second;

    public Rectangle(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем прямоугольник со сторонами %d, %d%n", first, second);
    }

    @Override
    public void calculateAre() {
        int area = first * second;
        System.out.println("Площадь прямоугольника = " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = (first + second) * 2;
        System.out.println("Периметр прямоугольника = " + perimeter);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}