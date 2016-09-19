package main.java.com.company;


public class Triangle extends Figure {
    public Triangle(String name, int storonaA, int storonaB){
        super (name, storonaA, storonaB);
    }

    @Override
    public double getSquare() {
        return 0.5 * storonaA * storonaB;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
