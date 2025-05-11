package OOP;

public class Persoana {
    //OOP = programare orientate obiect
    //4 principii: mostesnire, incapsulare, polimorfism, abstractizare

    //MOSTENIREA este conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    //in Java putem mosteni o singura clasa
    //in momentul cand o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    //in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //constructorul din parinte in copil se apeleaza folosind cuvantul SUPER


    //INCAPSULARE = procesul prin care tinem departe anumite informatii, ca ele sa nu poate fi modificate
    //facem variabilele/metode din public in private
    //Private = access control care restrictioneaza accesul doar in clasa respectiva
    //ca sa extragem/modificam o valoare a unui variabile private ne folosim de metodele GET si SET

    //POLIMORFISM = procesul prin care definim mai multe implementari pentru o metoda
    //poate sa fie de doua feluri: dinamic (override) si static (overload)
    //Polimorfismul DINAMIC = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //Polimorfismul STATIC = posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului sau tipului
    //de parametri

    //ABSTRACTIZARE = reducerea unui element complex la un element mai simplu (reducerea completa a implementarii a metodelor
    //lasand doar numele functiilor, parametri si tipul returnat
    //abstractizare se poate obtine prin clase ABSTRACE si/sau INTERFETE
    //clasele abstracte sunt utilizate pentru a declara caracteristici comune unor subclase
    //o clasa abstracta nu poate fi instantiata; ea poate fi utilizata doar ca SUPERCLASA pentru alte clase
    //clasa abstracta este definita folosind cuvantul cheie/modificatorul ABSTRACT
    //o clasa abstracta poate contine artibute si metode pe langa clasa abstracta

    //Interfata ofera raspuns lipsii mostenirii multiple
    //creeaza un protocol pe care clasele trebuie sa-l implementeze
    //in interfata avem doar metode abstracte!!! (fara implementare)! (interfata e o clasa pur abstracta)
    //o clasa poate implementa mai multe interfete!!

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    //definim prima implementare pentru o metoda (POLIMORFISM DINAMIC)
    public void mananca(){
        System.out.println("Persona mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
