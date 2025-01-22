package VariabilaMetoda;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercises {
    //colectie, dar care spre deosebire de array ne permite manipulare elementelor CRUD
    public static void main(String[] args) {
        //cum cream un arrayList?
        ArrayList<String> nume = new ArrayList<>();

        //adaugam elemente
        nume.add("Ana");
        nume.add("Bob");
        nume.add("Carl");

        //dimensiunea NU este fixa

        //cum putem sa accesam un element din array list
        nume.get(1);

        //modificarea unui element se face folosind metoda SET
        nume.set(0, "David");

        //stergerea unui element din lista
        nume.remove("Carl");
        //nume.remove(1); //folosind indexul
        System.out.println(nume);

        //cum aflam dimensiunea
        nume.size();

        //putem sa golim lista
        nume.clear();

        //Arrays
        //dimensiunea este fixa
        //length()
        //accesarea unui element folosind index

        //Array List
        //dimensiunea este dinamica
        //size()
        //accesarea unui element folosind get()

        ArrayList<String> nume1 = new ArrayList<>(Arrays.asList("Ana", "Mihai", "Bob", "Carl"));

        //data viitoare list, maps?
    }
}
