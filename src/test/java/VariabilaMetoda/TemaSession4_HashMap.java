package VariabilaMetoda;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.chromium.HasLaunchApp;

import java.util.HashMap;
import java.util.Map;

public class TemaSession4_HashMap {
    private static HashMap<String,String> cityName = new HashMap<>();

    private static HashMap<String, String> productPrice = new HashMap<>();

    //method to add a pair of key-value
    public void addNewKeyValuePair(String key, String value, HashMap<String, String> hashMapParam){
        hashMapParam.put(key, value);
        System.out.println("New key-value pair added: " + key + " -> " + value);
    }

   //method to return the value for a given key
    public String returnValue(String key, HashMap<String, String> hashMapParam){
        return hashMapParam.getOrDefault(key, "Value not found");
    }

    //check if a key exists
    public boolean checkIfAKeyExists(String key, HashMap<String, String> hashMapParam){
        return hashMapParam.containsKey(key);
    }

    //remove a pair key-value
    public void removeAPairKeyValue(String key, String value, HashMap<String, String> hashMapParam){
        hashMapParam.remove(key, value);
        System.out.println("Remove " + key + "->" + value + " from the list");
    }

    //update the value for a given existing key
    public void replaceAValueForAGivenKey(String key, String newValue, HashMap<String, String> hashMapParam){
        if (hashMapParam.replace(key, newValue) != null){
            System.out.println("Updated: " + key + " -> " + newValue);
        }
        else {
            System.out.println("Value with key " + key + " not found");
        }
    }

    //add a value if the key doesn't already exist
    public void putIfAbsentKey(String key, String value, HashMap<String, String> hashMapParam){
        if (hashMapParam.putIfAbsent(key, value) != null){
            System.out.println("Key with: " + key + " already exists so it will not be added");
        }
        else{
            System.out.println("New value: " + key + " -> " + value + " was added") ;
        }
    }


    //display the key-value pairs from a HashMap
    public void displayAllKeyValuePairs(HashMap<String, String> hasMapParam)
    {
        for (String key : hasMapParam.keySet()){
            System.out.println(key + " -> " + hasMapParam.get(key));
        }
    }

    public void displayAllPairsWithEntrySet(HashMap<String, String> hashMapParam){
        System.out.println("Pairs in the HashMap: ");
        hashMapParam.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue())
        );
    }

    // 1st method using a for-each loop
    public void iterateUsingForEach1(HashMap<String, String> hashMapParam){
        System.out.println("Iterating using for-each loop method 1: ");
        for (Map.Entry<String, String> entry : hashMapParam.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , " + "Value: " + entry.getValue());
        }
    }

    //2nd method
    public void iterateUsingForEach2(HashMap<String, String> hashMapParam){
        System.out.println("Iterating using for-each loop method 2:");
        hashMapParam.entrySet().forEach(entry ->
                System.out.println("Key: " + entry.getKey() + " , " + "Value: " + entry.getValue())
        );
    }

    //3rd method
    public void iterateUsingForEachWithLoopInside(HashMap<String, String> hashMapParam){
        System.out.println("Iterating using entrySet() and forEach() but with a internal loop:");
        hashMapParam.entrySet().forEach(entry ->{
            for (int i=0; i<1; i++){ //it will run once for each key-value pair
                System.out.println("Key: " + entry.getKey() + " , " + "Value: " + entry.getValue());
            }
        });
    }

    //1st method using a lambda expression
    public void iterationUsingLambdaForEach(HashMap<String, String> hashMapParam){
        System.out.println("Iterating using lambda with forEach():");
        hashMapParam.forEach((key, value) -> System.out.println("Key: " + key + " , " + "Value: " + value));
    }

    //2nd method using lambda expression
    public void iterationUsingLambda(HashMap<String, String> hashMapParam){
        System.out.println("Iteration using lambda:");
        hashMapParam.forEach((key, value) ->{
            System.out.println("Display key: " + key);
            System.out.println("Display value: " + value);
        });
    }

    public static void main(String[] args) {
        TemaSession4_HashMap object = new TemaSession4_HashMap();

        //calls for all methods/functions for the HashMap with Cities and Names
        object.addNewKeyValuePair("CHI", "Chicago", cityName);
        object.addNewKeyValuePair("NY", "New York", cityName);
        object.addNewKeyValuePair("LA", "Los Angeles", cityName);

        System.out.println("City for key 'NY': " + object.returnValue("NY", cityName));
        System.out.println("City for key 'WDC': " + object.returnValue("WDC", cityName));

        System.out.println("Is there a city for the given name? " + object.checkIfAKeyExists("NY", cityName));
        System.out.println("Is there a city for the given name? " + object.checkIfAKeyExists("MI", cityName));

        object.removeAPairKeyValue("NY", "New York", cityName);
        object.displayAllKeyValuePairs(cityName);

        object.replaceAValueForAGivenKey("LA", "San Francisco", cityName); //updating an existing name/key
        object.replaceAValueForAGivenKey("SF", "San Diego", cityName); //trying to update a name/key which doesn't exist

        object.displayAllKeyValuePairs(cityName);

        object.putIfAbsentKey("WDC", "Washington DC", cityName);
        object.putIfAbsentKey("CHI", "Chicago", cityName);
        object.displayAllKeyValuePairs(cityName);

        object.displayAllPairsWithEntrySet(cityName);
        object.iterateUsingForEach1(cityName);
        object.iterateUsingForEach2(cityName);
        object.iterateUsingForEachWithLoopInside(cityName);
        object.iterationUsingLambdaForEach(cityName);
        object.iterationUsingLambda(cityName);


        //calls for all methods/functions for the HashMap with Products and Prices
        object.addNewKeyValuePair("Faina", "3", productPrice);
        object.addNewKeyValuePair("Ulei", "11", productPrice);
        object.addNewKeyValuePair("Unt", "12", productPrice);
        object.addNewKeyValuePair("Paine neagra", "9", productPrice);
        object.displayAllKeyValuePairs(productPrice);

        System.out.println("Price for key 'Unt': " + object.returnValue("Unt", productPrice));
        System.out.println("Price for key 'Paine neagra': " + object.returnValue("Paine neagra", productPrice));

        System.out.println("Is there a price for the given product? " + object.checkIfAKeyExists("Ulei", productPrice));
        System.out.println("Is there a price for the given product? " + object.checkIfAKeyExists("Unt", productPrice));

        object.removeAPairKeyValue("Faina", "3", productPrice);
        object.displayAllKeyValuePairs(productPrice);

        object.replaceAValueForAGivenKey("Ulei", "Otet", productPrice); //updating an existing name/key
        object.replaceAValueForAGivenKey("Biscuiti", "9", productPrice); //trying to update a name/key which doesn't exist

        object.displayAllKeyValuePairs(productPrice);

        object.putIfAbsentKey("Ulei", "12", productPrice);
        object.putIfAbsentKey("Cascaval", "30", productPrice);
        object.displayAllKeyValuePairs(productPrice);

        object.displayAllPairsWithEntrySet(productPrice);
        object.iterateUsingForEach1(productPrice);
        object.iterateUsingForEach2(productPrice);
        object.iterateUsingForEachWithLoopInside(productPrice);
        object.iterationUsingLambdaForEach(productPrice);
        object.iterationUsingLambda(productPrice);

    }
}
