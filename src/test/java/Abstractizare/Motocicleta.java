package Abstractizare;

public class Motocicleta extends Vehicul{

    public Motocicleta(String marca){
        super(marca);
    }

    @Override
    void porneste(){
        System.out.println(marca + " Porneste");
    }

    @Override
    void opreste(){
        System.out.println(marca + " Opreste");
    }
}
