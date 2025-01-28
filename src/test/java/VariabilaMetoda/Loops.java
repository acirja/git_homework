package VariabilaMetoda;

public class Loops {
//    for(init; conditie; increment) {
//        //codul care se executa
//    }

    //afiseaz numere de la 1 la 10
    public static void main(String[] args){
      //  afiseazaNumere();
        printeazaNumerelePare();

        System.out.println("Numerele prime intre 1 si 100 sunt: ");
        afiseazaNumerelePrimeMaiMiciDecat100();
    }

    public static void afiseazaNumere(){
        for (int i = 1; i <= 10; i++){
            System.out.println("Contor: " + i);
        }
    }

    public static void afiseazaNumerelePrimeMaiMiciDecat100(){
        for (int i=1; i<100; i++){
            boolean isPrime = true;
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i + " ");
        }
    }
    //while (conditie) {
        //intre acolade se execute codul
    //}

    public static void printeazaNumerelePare(){
        int contor = 2;
        while (contor <= 10){
            if (contor % 2 ==0){
                System.out.println("Contor: " + contor);
            }
            contor++;
        }

    }

}
