package main.java.com.company;
import java.util.ArrayList;

import java.util.Collections;

public class TestMain {

    public static void main(String[] args) {

        ArrayList<Figure> arraylist = new ArrayList<>();
        arraylist.add(new Triangle("Cool triangle", 2, 2));
        arraylist.add(new Reactangle("Best reactangle", 3, 6));
        arraylist.add(new Circle("Fun circle", 3.6));

        StringBuilder sb = new StringBuilder();
        for (Figure f : arraylist) {
            if ((f.getSquare() > 1) && f instanceof Triangle) {
                sb.append(f.toString() + "Triangle" + "\n");
            } else if ((f.getSquare() > 1) && f instanceof Reactangle) {
                sb.append(f.toString() + "Reactangle" + "\n");
            } else if ((f.getSquare() > 1) && f instanceof Circle) {
                sb.append(f.toString() + "Circle" + "\n" );
            } else  {
                System.out.println("Wrong input data");
            }

            System.out.println(f.getSquare());

        }
        ArrayList<Figure> getSquare = new ArrayList<>();

        System.out.println("Before sorting");
        for(Figure counter: arraylist){
            System.out.println(counter);
        }
        Collections.sort(arraylist);
        System.out.println("After sorting:");
        for(Figure counter:arraylist){

            System.out.println(counter);
        }

    }
}
