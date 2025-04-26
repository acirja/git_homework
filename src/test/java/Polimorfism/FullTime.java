package Polimorfism;

public class FullTime extends Angajat {
    private double salariuFix;

    public FullTime(String nume, double salariuFix){
        super(nume);
        this.salariuFix = salariuFix;
    }

    @Override
    public double calculeazaSalariul(){
        return  salariuFix;
    }
}
