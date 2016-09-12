package main.java.com.company;
import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {

        ArrayList<Figure> figureList = new ArrayList<>();
        figureList.add(new Triangle("Cool triangle", 2, 4));
        figureList.add(new Reactangle("Best reactangle", 3, 6));
        figureList.add(new Circle("Fun circle", 8.6));

        System.out.println();

    }

}
