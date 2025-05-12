package DesignPattern;

public class SingleObject {

    private static SingleObject instanta = new SingleObject();

    private SingleObject(){
    }

    public static SingleObject getInstance(){
        return instanta;
    }

    public void showMessage(){
        System.out.println("Hello from Singleton");
    }
}
