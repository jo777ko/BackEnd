package de.telran.geork.homeworks.hw2.shapes;

public class Cube extends Shape3D{

    protected int size;

    public Cube(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем куб со стороной %d%n", size);
    }

    @Override
    public void calculateAre() {
        int cubeArea = 6*size*size;
        System.out.println(cubeArea);
    }

    @Override
    public void calculatePerimeter() {
        int cubePerimetr = 12 *size;
        System.out.println(cubePerimetr);
    }

    @Override
    void volume() {
        int cubeVolume = size*size*size;
        System.out.println(cubeVolume);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "size=" + size +
                '}';
    }
}
