package VariabilaMetoda;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class TemaSession3 {
    public static void main(String[] args) {

        //primul array cu elemente de tip int
        int[] years = {1900, 1910, 1920, 1930, 1940, 1950, 1960, 1970, 1980, 1990};

        //parcurgerea array-ului int folosind FOR
        for (int i = 0; i < years.length; i++) {
            //System.out.println("Afiseara array-ul years folosind For: " + years[i]);
        }

        //parcurgerea array-ului int folosind FOR-EACH loop
        for (int year : years) {
            //System.out.println("Afiseara array-ul years folosind For-each: " + year);
        }


        //al doilea array cu elemente de tip String
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};

        //parcurgerea array-ului String folosind FOR
        for (int i = 0; i < colors.length; i++) {
            //System.out.println("Afiseaza array-ul colors folosind For: " + colors[i]);
        }

        //parcurgerea array-ului String folosind For-each
        for (String color : colors) {
            //System.out.println("Afiseara array-ul colors folosind For-each: " + color);
        }


        //al treilea array cu elemente double
        double[] temperatures = {-3.5, 5.8, 10.4, 20.7, -2.3, -0.9};
        //parcugerea array-ului Double folosind For
        for (int i = 0; i < temperatures.length; i++) {
            //System.out.println("Afiseaza array-ul temperatures folosind For: " + temperatures[i]);
        }

        //parcurgerea array-ului Double folosind For-each
        for (double temperature : temperatures) {
            //System.out.println("Afiseaza array-ul temperatures folosind For-each: " + temperature);
        }


        //Array list of different types
        //the first one with String elements
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Skoda");
        cars.add("Dacia");
        cars.add("Volvo");
        cars.add("Ford");

        for (int i = 0; i < cars.size(); i++) {
            //System.out.println("Afiseara Array list-ul Cars folosind For: " + cars.get(i));
        }

        for (String i : cars) {
           // System.out.println("Afiseaza Array list-ul Car folosind For-each: " + i);
        }

        //the second Array List with Characters elements
        ArrayList<Character> vocals = new ArrayList<>();
        vocals.add('a');
        vocals.add('e');
        vocals.add('i');
        vocals.add('o');
        vocals.add('u');
        vocals.add('ă');
        vocals.add('â');

        for (int i=0; i < vocals.size(); i++) {
            //System.out.println("Afiseaza Array list-ul vocals folosind For: " + vocals.get(i));
        }

        for (Character i : vocals) {
            //System.out.println("Afiseaza Array list-ul vocals folosind For-each: " + i);
        }

        //the third Array List with Float elements
        ArrayList<Float> floatingNumbers = new ArrayList<>();
        floatingNumbers.add(1.99F);
        floatingNumbers.add(2.99F);
        floatingNumbers.add(3.99F);

        for (int i=0; i < floatingNumbers.size(); i++) {
            //System.out.println("Afiseaza Array list-ul floatingNumbers folosind For: " + floatingNumbers.get(i));
        }

        for (Float i : floatingNumbers){
            //System.out.println("Afiseaza Array list-ul floatingNumbers folosind For-each: " + i);
        }
    }

}
