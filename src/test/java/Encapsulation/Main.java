package Encapsulation;

public class Main {
    public static void main(String args[]){
        CodBancar codBancar = new CodBancar(1000);
        codBancar.setSold(500);
        System.out.println(codBancar.getSold());
    }

}
