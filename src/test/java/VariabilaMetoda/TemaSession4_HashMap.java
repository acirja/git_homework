package VariabilaMetoda;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;

public class TemaSession4_HashMap {
    private static HashMap<String,String> cityName = new HashMap<>();

    //method to add a pair of key-value
    public void addNewCity(String name, String city){
        cityName.put(name, city);
        System.out.println("New city added: " + name + " -> " + city);
    }

    //method to return the city/value for a given name/key
    public String returnCity(String name){
        return cityName.getOrDefault(name, "City not found");
    }

    //check if a name/key exists
    public boolean checkIfANameExists(String name){
        return cityName.containsKey(name);
    }

    //remove a pair of name-city
    public void removeANameCity(String name, String city){
        cityName.remove(name, city);
        System.out.println("Remove " + name + "->" + city + " from the list");
    }

    //update the city for a given existing name
    public void replaceACityForName(String name, String newCity){
        if (cityName.replace(name, newCity) != null){
            System.out.println("Updated: " + name + " -> " + newCity);
        }
        else {
            System.out.println("City with name " + name + " not found");
        }
    }

    //add a value if the name doesn't already exist
    public void putIfAbsentCity(String name, String city){
        if (cityName.putIfAbsent(name, city) != null){
            System.out.println("City with: " + name + " already exists so it will not be added");
        }
        else{
            System.out.println("New city: " + name + " -> " + city + " was added") ;
        }
    }


    //display the list with all cities
    public void displayCities()
    {
        for (String name : cityName.keySet()){
            System.out.println(name + " -> " + cityName.get(name));
        }
    }

    public void displayCitiesWithEntrySet(){
        System.out.println("Cities in the HashMap: ");
//        for (Map.Entry<String, String> entry : cityName.entrySet()){
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }

       // cityName.forEach((nume, city) -> System.out.println(nume + " -> " + city));

        cityName.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue())
        );
    }

    // 1st method using a for-each loop
    public void iterateUsingForEach1(){
        System.out.println("Iterating using for-each loop method 1: ");
        for (Map.Entry<String, String> entry : cityName.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , " + "Value: " + entry.getValue());
        }
    }

    //2nd method
    public void iterateUsingForEach2(){
        System.out.println("Iterating using for-each loop method 2:");
        cityName.entrySet().forEach(entry ->
                System.out.println("Key: " + entry.getKey() + " , " + "Value: " + entry.getValue())
        );
    }

    //3rd method
    public void iterateUsingForEachWithLoopInside(){
        System.out.println("Iterating using entrySet() and forEach() but with a internal loop:");
        cityName.entrySet().forEach(entry ->{
            for (int i=0; i<1; i++){ //it will run once for each key-value pair
                System.out.println("Key: " + entry.getKey() + " , " + "Value: " + entry.getValue());
            }
        });
    }

    //1st method using a lambda expression
    public void iterationUsingLambdaForEach(){
        System.out.println("Iterating using lambda with forEach():");
        cityName.forEach((nume, city) -> System.out.println("Key: " + nume + " , " + "Value: " + city));
    }

    //2nd method using lambda expression
    public void iterationUsingLambda(){
        System.out.println("Iteration using lambda:");
        cityName.forEach((nume, city) ->{
            System.out.println("Display key: " + nume);
            System.out.println("Display value: " + city);
        });
    }

    public static void main(String[] args) {
        TemaSession4_HashMap cityName = new TemaSession4_HashMap();

        //add cities
        cityName.addNewCity("CHI", "Chicago");
        cityName.addNewCity("NY", "New York");
        cityName.addNewCity("LA", "Los Angeles");

//        System.out.println("City for key 'NY': " + cityName.returnCity("NY"));
//        System.out.println("City for key 'WDC': " + cityName.returnCity("WDC"));
//
//        System.out.println("Is there a city for the given name? " + cityName.checkIfANameExists("NY"));
//        System.out.println("Is there a city for the given name? " + cityName.checkIfANameExists("MI"));
//
//        cityName.removeANameCity("NY", "New York");
//        cityName.displayCities();
//
//        cityName.replaceACityForName("LA", "San Francisco"); //updating an existing name/key
//        cityName.replaceACityForName("SF", "San Diego"); //trying to update a name/key which doesn't exist

//        cityName.displayCities();
//
//        cityName.putIfAbsentCity("WDC", "Washington DC");
//        cityName.putIfAbsentCity("CHI", "Chicago");
//        cityName.displayCities();

         // cityName.displayCitiesWithEntrySet();

          //calling iteration methods
        //cityName.iterateUsingForEach1();
       // cityName.iterateUsingForEach2();
        //cityName.iterationUsingReference();
        //cityName.iterateUsingForEachWithLoopInside();
        //cityName.iterationUsingLambdaForEach();
        cityName.iterationUsingLambda();

    }
}
