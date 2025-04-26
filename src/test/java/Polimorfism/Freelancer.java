package Polimorfism;

public class Freelancer extends Angajat {
    private double tarifPeOra;
    private int oreLucrate;

    public Freelancer(String nume, double tarifPeOra, int oreLucrate){
        super(nume);
        this.tarifPeOra = tarifPeOra;
        this.oreLucrate = oreLucrate;
    }

    @Override
    public double calculeazaSalariul(){
        return tarifPeOra * oreLucrate;
    }

}
