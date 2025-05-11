package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test

    public void metodaTest(){
        Student student = new Student("Pop", "Cristi", 25, "UBB", "2", true);
        student.infoStudent();
        student.mananca();

        Angajat angajat = new Angajat("Popescu", "Tudor", 27, "Panemar", 3, 19);
        angajat.infoAngajat();

        angajat.promovare();
        angajat.setZileConcediu(25);
        angajat.infoAngajat();

        angajat.mananca();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("sef");
    }
}
