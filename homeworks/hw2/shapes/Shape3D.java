package de.telran.geork.homeworks.hw2.shapes;

public abstract class Shape3D extends Shape {

    public Shape3D(String type) {
        super(type);
    }

    public Shape3D() {
    }

    abstract void volume();
}
