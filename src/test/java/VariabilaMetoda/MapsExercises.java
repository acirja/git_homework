package VariabilaMetoda;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExercised {
    //Maps este o interfata, implementari comune:
    //HashMap
    //TreeMap
    //LinkedHashMap
    public static void main(String[] args){

        //Declaram un hashMap => tot timpul trebuie sa avem chei unice
        Map<String, Object> studenti = new HashMap<>();
        studenti.put("nume", "Ana");
        studenti.put("prenume", "Popescu");
        studenti.put("varsta", 23);

        System.out.println(studenti);

        Map<String, Object> studenti1 = new TreeMap<>();
        studenti.put("nume", "Ana");
        studenti.put("prenume", "Popescu");
        studenti.put("varsta", 23);

        System.out.println(studenti);

        Map<String, Object> studenti3 = new HashMap<>(Map.of("nume", "Ana", "prenume", "Popescu"));

//        Map<String, Object> studenti4 = new HashMap<>(Map.of(
//           "Ana", Map.of(
//                   "varsta", 24,
//                   "promovat", true
//                ),
//           "Andrea", Map.of(
//                        "varsta", 25,
//                        "promovat", false
//                ),
//                "David", Map.of(
//                        "varsta", 26,
//                        "promovat", false
//                )
//        ));

        Map<String, Map<String, Object>> studenti4 = new HashMap<>(Map.of(
                "Ana", Map.of(
                        "varsta", 24,
                        "promovat", true
                ),
                "Andrea", Map.of(
                        "varsta", 25,
                        "promovat", false
                ),
                "David", Map.of(
                        "varsta", 26,
                        "promovat", false
                )
        ));


        System.out.println(studenti4);

//        //cum iteram => recomandat entrySet()
//        for (Map.Entry<String, Object> entry : studenti4.entrySet()){
//            System.out.println("Student: " + entry.getKey());
//            String nume = entry.getKey();
//            System.out.println(entry.getValue());
//            Map<String, Object> valori = (Map<String, Object>) entry.getValue();
//
//            for (Map.Entry<String, Object> entry2: valori.entrySet()){
//                //String nume2 = entry.getKey();
//                if (entry2.getKey().equals("varsta")){
//                    System.out.println("Varsta lui " +  nume + " este: " + entry2.getValue());
//                }
//
//                if (entry2.getKey().equals("promovat")){
//                    System.out.println(nume + " este promovat:" + entry2.getValue());
//                }
//            }
//        }

        studenti4.forEach((cheie, detalii) -> {
            System.out.println(cheie);
            detalii.forEach((nume, valoare) -> {
                System.out.println(nume + ": " + valoare); //detaliile studentului
                });
        });

//            detalii.forEach((nume, valoare) -> {
//            });
        

        //lamda expression (param1, param2) -> {Blocul de cod}

        };
    }

