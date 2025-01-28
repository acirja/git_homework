package VariabilaMetoda;

public class Conditions {
   /* if (condition) {
        //codul care se executa cand condition = true
    }
    else if (otherCondition){
        //codul care se executa cand condition = false si otherCondition = true
    }
    else{
        //codul care se executa daca nici una dintre conditiile de mai sus nu e true
    }*/

    public static void verificaNumar(int n){
        if (n > 0){
            System.out.println("Numarul"+ n +"este pozitiv");
        }
        else if (n < 0){
            System.out.println("Numarul"+ n +"este negativ");
        }
        else {
            System.out.println("Numarul"+ n +"este egal cu zero");
        }
    }

    public static void verificaNumarPar(int n){
        if (n % 2 == 0) {
            System.out.println(n + " este numar par");
        }
        else{
            System.out.println(n + " este numar impar");
        }
    }

    public static void main(String[] args){
        verificaNumar(123);

        verificaNumarPar(21);

        verificaNumarPar(122);
    }
}
