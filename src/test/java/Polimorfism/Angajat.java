package Polimorfism;

public class Angajat {
    private String nume;

    //constructor
    public Angajat(String nume){
        this.nume = nume;
    }

    public double calculeazaSalariul(){
        return 0;
    }

    public void afiseazaDetalii(){
        System.out.println("Angajat: " + nume + "salariul: " + calculeazaSalariul());
    }
}
