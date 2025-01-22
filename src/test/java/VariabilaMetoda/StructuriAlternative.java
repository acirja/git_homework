package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structurile alternative = if-then-else; switch-case;

    @Test
    public void metodaTest(){
       // metodaVerificareNumar(8);
        vericareNumarParPozitiv(0);
    }

    //verificam daca un numar e mai mare decat 5
    public void metodaVerificareNumar(int numar){
        if (numar > 5){
            System.out.println("numarul: " + numar + "e mai mare decat 5");
        }
        else if (numar < 5){
            System.out.println("numarul: " + numar + "e mai mic decat 5");
        }
        else {
            System.out.println("numarul: " + numar + "este egal cu 5");
        }
    }

    //verificam daca un umar e par pozitiv sau par negativ
    public void vericareNumarParPozitiv(int numar){
        if (numar > 0){
            if (numar % 2 == 0){
                System.out.println("numarul: " + numar + "este par pozitiv");
            }
            else {
                System.out.println("numarul: " + numar + "este impar pozitiv");;
            }
        }
        else if (numar < 0){
            if (numar % 2 == 0){
                System.out.println("numarul: " + numar + "este par negativ");
            }
            else {
                System.out.println("numarul: " + numar + "este impar negativ");;
            }
        }
        else {
            System.out.println("numarul este egal cu 0");
        }
    }

    //exemplu switch case

}
