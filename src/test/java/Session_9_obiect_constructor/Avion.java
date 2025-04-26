package Session_9_obiect_constructor;

public class Avion {
    //constructor = are ca rol sa initializeze variabilele unei clase
    //recunoastem un constructor dupa numele clasei
    //intr-o clasa putem avea n constructori care se diferentiaza dupa numarul/tipul de parametri
    //exista 2 tipuri de constructori: cu parametri / fara parametri

    //intr-o clasa avem tot timpul un constructor default (fara parametri)

    //constructorul trebuie sa fie public
    //obiect = instanta unei clase
    //dintr-o clasa putem sa facem mai multe obiecte
    //ca sa initializam un obiect ne folosim de cuvantul NEW
    //cand se initializeaza un obiect se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String combustibil;
    public Integer numarBagaje;

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String combustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.combustibil = combustibil;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String combustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.combustibil = combustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului: " + tip);
        System.out.println("Marca avionului: " + marca);
        System.out.println("Modelul avionului: " + model);
        System.out.println("Capacitate pasageri: " + capacitatePasageri);
        System.out.println("Tip combustibil: " + combustibil);
        if (numarBagaje != null){
            System.out.println("Numar bagaje: " + numarBagaje);
        }
        else {
            System.out.println("Avionul nu are bagaje");
        }

    }
}
