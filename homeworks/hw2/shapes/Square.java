package de.telran.geork.homeworks.hw2.shapes;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        super("квадрат");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем квадрат со стороной %d%n", size);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public void calculateAre() {
        int area = size * size ;
        System.out.println("Площадь квадрата = " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = size * 4;
        System.out.println("Периметр квадрата = " + perimeter);
    }
}