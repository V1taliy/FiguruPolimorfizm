package main.java.com.company;



public class Reactangle extends Figure {
    public Reactangle (String name, int storonaA, int storonaB){
        super (name, storonaA, storonaB);
    }

    @Override
    public double getSquare() {
        return storonaA *storonaB;
    }
}
