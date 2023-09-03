package de.telran.geork.homeworks.hw9.level1;

import java.util.Objects;

public class Windows {
    private double weight;
    private double width;
    private double height;
    private String glassType;

    public Windows(double weight, double width, double height, String glassType) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.glassType = glassType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Windows windows = (Windows) o;
        return Double.compare(windows.weight, weight) == 0 && Double.compare(windows.width, width) == 0 && Double.compare(windows.height, height) == 0 && Objects.equals(glassType, windows.glassType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, width, height, glassType);
    }

    @Override
    public String toString() {
        return "Windows{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", glassType='" + glassType + '\'' +
                '}';
    }
}
