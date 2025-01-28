package VariabilaMetoda;

import java.sql.SQLOutput;

public class Switch {
//    switch (valoare) {
//        case 'valoare1':
//            //codul care se executa daca valoare ==valoare1;
//            break;
//
//        case 'valoare2':
//            //codul care se executa daca valoare ==valoare2;
//            break;
//
//        case 'valoare3':
//            //codul care se executa daca valoare ==valoare3;
//            break;
//            //break e necesar pentru a opri executarea ulterioara
//    }
//}

    public static void afiseazaZiuaSaptamanii(int ziua) {
        switch (ziua){
            case 1:
                System.out.println("ziua este luni");
                break;
            case 2:
                System.out.println("ziua este marti");
                break;
            case 3:
                System.out.println("ziua este miercuri");
                break;
            default:
                System.out.println("ziua este invalida");
        }
    }

    public static void main(String[] args){
        afiseazaZiuaSaptamanii(3);
    }
}
