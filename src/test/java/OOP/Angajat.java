package OOP;

public class Angajat extends Persoana implements AngajatInt{

    //Modificatori de acces
    //PUBLIC = codul se poate accesa de oriunde si de catre orice clasa
    //PRIVATE = codul se poate accesa doar din clasa unde s-a scris codul
    //PROTECTED = codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre subclase (mostenire)
    //DEFAULT = codul se poate accesa doar din pachetul in care s-a scris codul; Intra pe DEFAULT daca nu se specifica un alt
    //modificator de acces

    private String firma;
    private Integer experienta;
    private Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta, String firma, Integer experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma este:" + firma);
        System.out.println("Experienta angajatului: " + experienta);
        System.out.println("Angajatul are " + zileConcediu + "zile de concediu");
    }

    //Suprascriem metoda din parinte POLIMORFISMUL DINAMIC
    public void mananca(){
        System.out.println("Angajatul mananca cand are pauza de masa");
    }

    //Polimorfismul static
    public void marire(){
        System.out.println("Nu avem buget de mariri");
    }

    public void marire(Integer procent){
        System.out.println("Angajatul a primit o marire cu: " + procent + "%");
    }

    public void marire(String grad){
        System.out.println("Angajatul a primit gradul: " + grad);

    }

    public void promovare(){
        System.out.println("Angajatul cu numele: " + getNume() + "a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul merge in pauza");
    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Angajatul nu pleaca din firma");
    }
}
