package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

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
