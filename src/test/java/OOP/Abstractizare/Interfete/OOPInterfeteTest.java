package OOP.Abstractizare.Interfete;

import org.testng.annotations.Test;

public class OOPInterfeteTest {
    @Test

    public void metodaTest(){
        Cerc cerc = new Cerc();
        cerc.setRaza(5);
        cerc.calculeazaAria();

        Patrat patrat = new Patrat();
        patrat.setLatura(6);
        patrat.calculeazaAria();


    }
}
