package Inheritance;

import Encapsulation.CodBancar;

public class ContEconomii extends ContBancarMosternire {
    private double taxaAdministrare;

    //constructor
    public ContEconomii(double sold, double taxaAdministrare){
        super(sold); //apeleaza contructorul parinte; super este obligatoriu sa fie prima instructiune
        this.taxaAdministrare = taxaAdministrare;
    }


    public void aplicaTaxaAdministrare(double taxaAdministrare){
        if (taxaAdministrare <= sold){
            retrageBani(taxaAdministrare);
        }
        else{
            System.out.println("Fonduri insuficiente pentru taxa de administrare");
        }
    }
}
