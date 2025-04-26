package Encapsulation;

public class CodBancar {
   //private double sold; //private => putem accesa variabila doar din interiorul clasei
    protected double sold;
    //getter - permite citirea soldului
    public double getSold(){
        return sold;
    }

    //setter
    public void setSold(double sold){
        if (sold >= 0 ){
            this.sold = sold;
        }
        else{
            System.out.println("Soldul nu poate fi negativ");
        }
    }

    public CodBancar(double sold){
        if (sold >=0){
            this.sold = sold;
        }
        else{
            System.out.println("Soldul nu poate fi negativ");
            this.sold = 0;
        }
    }
}
