package VariabilaMetoda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args){
        Map<String, Object> row1 = new HashMap<>();
        //tipul de obiect pentru cheie = String
        //tipul de obiect pentru valoare = Object

        row1.put("customerName", "Andreea");
        row1.put("city", "Iasi");
        row1.put("codPostal", 123);

        Map<String, Object> row2 = new HashMap<>();
        row2.put("customerName", "Mihai");
        row2.put("city", "Cluj");
        row2.put("codPostal", 1233);

        List<Map<String, Object>> customers = new ArrayList<>();

        customers.add(row1);
        customers.add(row2);

        //System.out.println(customers);

        for (Map<String, Object> element : customers){
            //System.out.println(element);
            for (Map.Entry<String, Object> entry: element.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
