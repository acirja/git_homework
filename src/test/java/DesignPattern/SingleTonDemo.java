package DesignPattern;

public class SingleTonDemo {

    public static  void main (String[] args){
        SingleObject myObject = SingleObject.getInstance();
        //SingleObject secondObject = new SingleObject(); //constuctorul este privat si atunci nu ne lasa
        myObject.showMessage();
    }
}
