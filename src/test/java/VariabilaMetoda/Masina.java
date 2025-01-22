package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Masina {
    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi", "Q7", 2021);
        dateMasina("BMW", "X1", 2019);

        calculMedie(6.5, 9.8);
    }

    public void dateMasina(String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie este: " + anFabricatie);
    }

    //calculam media la doua numere
    public void calculMedie(Double nota1, Double nota2){
        Double rezultat = (nota1 + nota2)/2;
        System.out.println("Media este: " + rezultat);
    }
}
