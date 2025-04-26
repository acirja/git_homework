package Inheritance;

import org.checkerframework.checker.units.qual.C;

public class Main {

    public static void main(String[] args){
        //instanta ContEconomii
        ContEconomii contEconomii = new ContEconomii(3000, 3);
        //retrage banii
        contEconomii.retrageBani(1000);
        //aplica taxa de administrare
        contEconomii.aplicaTaxaAdministrare(10);

        System.out.println(contEconomii.sold);

    }
//    private double sold; //private => putem accesa variabila doar din interiorul clasei
//
//    //getter - permite citirea soldului
//    public double getSold(){
//        return sold;
//    }
//
//    //setter
//    public void setSold(double sold){
//        if (sold >= 0 ){
//            this.sold = sold;
//        }
//        else{
//            System.out.println("Soldul nu poate fi negativ");
//        }
//    }

//    public CodBancar(double sold){
//        if (sold >=0){
//            this.sold = sold;
//        }
//        else{
//            System.out.println("Soldul nu poate fi negativ");
//            this.sold = 0;
//        }
//    }
}
