package Inheritance;

public class ContBancarMosternire {
    protected double sold;

    public ContBancarMosternire(double sold){
        if (sold >=0){
            this.sold = sold;
        }
        else{
            System.out.println("Soldul nu poate");
        }
    }

    //metoda retragere bani
    public void retrageBani(double suma){
        if (suma > 0 && suma <= sold){
            //sold = sold - suma; //sold -= suma;
            this.sold -= suma;
            System.out.println("Ai retras o suma:  " + suma + "RON. Sold ramas: " +  this.sold);
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
    }
}
