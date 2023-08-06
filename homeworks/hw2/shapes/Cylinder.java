package de.telran.geork.homeworks.hw2.shapes;

public class Cylinder extends Shape3D{
    protected int radius;
    protected int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем цилиндр с радиусом " + radius + " и высотой " +height);
    }

    @Override
    public void calculateAre() {
        double areaCylinder = 2*Math.PI*radius*height + 2 *Math.PI*radius*radius;
        System.out.println(areaCylinder);
    }

    @Override
    public void calculatePerimeter() {
        int perimeterCylinder = 0;
        System.out.println(perimeterCylinder);
    }

    @Override
    void volume() {
        double volumeCylinder = Math.PI * radius * radius *height;
        System.out.println(volumeCylinder);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
