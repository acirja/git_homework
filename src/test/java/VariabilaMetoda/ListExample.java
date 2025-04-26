package VariabilaMetoda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args){
        //List
        List<String> lista1 = new ArrayList<String>();
        lista1.add("Ana");
        lista1.add("Maria");
        lista1.add("David");

        List<String> lista2 = new ArrayList<>(Arrays.asList("Ana", "Maria", "David"));

        //ArrayList
        ArrayList<String> lista3 = new ArrayList<String>();
        lista3.add("Ana");
        lista3.add("Maria");
        lista3.add("David");

        ArrayList<String> lista4 = new ArrayList<>(Arrays.asList("Ana", "Maria", "David"));

        //cum accesam elementele:
        addElementsToList(lista3, "Popescu");
        System.out.println(lista3);
        removeElement(lista3, "Popescu");
        //updateElement(lista3, )
        updateElement(lista3, 0, "Andreea");
       // sortList();

        System.out.println(lista4.get(0)); //Ana
    }

    static List<String> addElementsToList(List<String> list, String newElementToBeAdded){
        list.add(newElementToBeAdded);
        return list;
    }

    static List<String> removeElement(List<String> list, String elementToRemove){
        list.remove(elementToRemove);
        return list;
    }

    static int getSize(List<String> list){
        return list.size();
    }

    //cum modificam un element din lista
    static List<String> updateElement(List<String> list, int index, String newElementToBeUpdated){
        list.set(index, newElementToBeUpdated);
        return list;
    }

    //verificam daca un element exista in lista
    static boolean containsElement(List<String> list, String elementToFind){
        return list.contains(elementToFind);
    }

    //sortarea elementelor
    static List<String> sortList(List<String> list){
        Collections.sort(list);
        return list;
    }

    //cum sortam invers elementele listei
    static List<String> reverseList(List<String> list){
        Collections.reverse(list);
        return list;
    }

    //stergem toate elementele
    static List<String> clearList(List<String> list){
        list.clear();
        return list;
    }

    static boolean isListEmpty(List<String> list){
        return list.isEmpty();
    }

}
