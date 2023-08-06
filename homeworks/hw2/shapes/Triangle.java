package de.telran.geork.homeworks.hw2.shapes;

public class Triangle extends Shape {
    private int first;
    private int second;
    private int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем треугольник со сторонами %d, %d, %d%n", first, second, third);
    }

    @Override
    public void calculateAre() {
        int p = (first + second + third)/2;
        double area = Math.sqrt(p * (p - first) * (p - second) * (p - third));
        System.out.println("Площадь треугольника = " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = first + second + third;
        System.out.println("Периметр треугольника = " + perimeter);
    }
}