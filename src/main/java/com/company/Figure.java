package main.java.com.company;


public abstract class Figure implements Comparable {
    protected String name;
    protected int storonaA;
    protected int storonaB;
    protected double radius;

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", storonaA=" + storonaA +
                ", storonaB=" + storonaB +
                ", radius=" + radius +
                '}';
    }

    public Figure(String name, int storonaA, int storonaB) {
        this.name = name;
        this.storonaA = storonaA;
        this.storonaB = storonaB;


    }

    public Figure(String name, double radius) {
        this.name = name;
        this.radius = radius;

    }

    public String getName() {
        return name;
    }

    public int getStoronaA() {
        return storonaA;
    }

    public int getStoronaB() {
        return storonaB;
    }

    public double getRadius() {
        return radius;
    }

    public abstract double getSquare();
}
