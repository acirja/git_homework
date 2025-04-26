package Polimorfism;

public class Main {
    public static void main(String[] args){
        Angajat angajat = new FullTime("Ana", 5000);
        Angajat angajat2 = new Freelancer("Mihai", 40, 10);

        angajat.afiseazaDetalii();
        angajat2.afiseazaDetalii();
    }

    //aceeasi metoda care in aceeasi clasa are implementari diferite
    //supraincarcarea metodei => overloading
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
    static double add(double a, double b){
        return a +b;
    }

}
