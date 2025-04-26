package Abstractizare;

abstract class Vehicul {
    protected  String marca;

    public Vehicul(String marca){
        this.marca = marca;
    }
    abstract void porneste(); //metoda abstracta nu are implementare

    abstract void opreste();
}
