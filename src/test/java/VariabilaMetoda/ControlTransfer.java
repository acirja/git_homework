package VariabilaMetoda;

public class ControlTransfer {
    //Break
    //ce face? - opreste executia curenta a unui loop
    public static void main(String[] args){
        for (int i=0; i<10; i++){
            if (i ==3){
                break;
            }
            System.out.println(i);
        }

        //continue
        //cand il folosim? - atunci cand dorim sa sarim peste anumite conditii dar fara a opri executia completa
        for (int i=0; i<10; i++){
            if (i ==3){
                continue;
            }
            System.out.println(i);
        }
        returnExample();
    }

    //return
    //ce face return? - opreste executia unei metode si returneaza o valoare daca metoda nu e void
    public static void returnExample(){
        for (int i=0; i<10; i++){
            if (i == 3){
                return; //iesim complet din metoda
            }
            System.out.println(i);
        }
        System.out.println("Bucla s-a terminat"); //aceasta linie nu se executa
    }
}
