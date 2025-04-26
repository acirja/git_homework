package Session_9_obiect_constructor;

import org.testng.annotations.Test;

public class AvionTest {
    @Test
    public void metodaTest(){
        Avion avion1 = new Avion("Pasageri", "Boeing", "B-127", 260, "Kerosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Pasageri", "Boeing" ,"B-180" , 300, "Kerosen");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Pasageri", "Boeing" ,"B-180" , 300, "Kerosen", 20);
        avion3.prezentareAvion();
    }
}
