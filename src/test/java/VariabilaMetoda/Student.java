package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    //intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa avem
    //mai multe clase cu acelasi nume
    //intr-o clasa putem defini proprietatile si actiunile entitatii

    //variabila = proprietatea unei clase
    //variabilele pot sa fie de 2 feluri: global si local
    //variabilele globale = sunt vizibile peste tot in proiect
    //variabilele locale = sunt vizibile in locul unde au fost declarate
    //ca sa definim o variabila globala: accesscontrol (public) tip variabila nume variabila

    //in momentul cand definim o variabila nu este obligatoriu nu este obligatoriu sa-i dam o valoare

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime; //tip de date non-primitive; se comporta ca un obiect si avem acces la metode (ocupa mai mult spatiu in memorie)
    //public int Inaltime; // tip de date primitive; e stocat in memorie

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;

    public void seteazaNume(String Nume) {
        this.Nume = Nume;
    }

    public String afiseazaNume(){
        return Nume;
    }

    public Student(String Nume, Integer Varsta){
        this.Nume = Nume;
        this.Varsta = Varsta;
    }

    //metoda = actiunea unei clase
    //exista 2 tipuri de metode: void si return

    @Test
    public void prezentareStudent(){
        Nume = "Popescu";
        Prenume = "Alex";
        Varsta = 20;
        Adresa = "Taberei";
        Inaltime = 1.8;
        Sex = 'M';
        AreDiploma = true;

        System.out.println(Nume+" "+Prenume+" "+Varsta);
        System.out.println(Prenume);

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);

        calculMedie();
        System.out.println(getSalariu());
   }


   public void calculMedie(){
        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este: " + medie);
   }

   //metoda cu return
    public Integer getSalariu(){
        Integer salariu = 5000;
        return salariu;
    }

}
