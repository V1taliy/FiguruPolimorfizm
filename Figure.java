package com.company;


public abstract class Figure {
    protected String name;
    protected int storonaA;
    protected int storonaB;

    public Figure(String name, int storonaA, int storonaB){
        this.name = name;
        this.storonaA = storonaA;
        this.storonaB = storonaB;

    }
public String getName(){
    return name;
}
    public int getStoronaA(){
        return storonaA;
    }
    public int getStoronaB(){
        return storonaB;
    }
    public abstract double getSquare();
}
