package main.java.com.company;


public class Circle extends Figure{
    public Circle(String name, double radius){
        super (name, radius);
    }

    @Override
    public double getSquare() {
        return (int)radius * Math.PI;
    }
}
