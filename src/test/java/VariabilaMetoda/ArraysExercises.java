package VariabilaMetoda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExercises {
    //ce sunt? - un tablou/colectie de elemente; elemente de acelasi tip
    //dimensiunea unui array este fixa si trebuie declarata la inceput
    public static void main(String[] args){
        //declaram si initializam un array
        //[0], [1], [2], [3] indexul unui array
        int[] note = {1,2,3,4,5,6,7,8,9,10};
        String[] nume = {"Ana", "Mihai"};
        int[]  note2 = new int[2];

        //cum putem afla dimensiunea unui array
        System.out.println("Dimensiunea array-ului: " + note.length);

        //iteram un array
        for (int i=0; i<note.length; i++){
            System.out.println(note[i]);
        }

        //iteram prin array folosing for-each lop
        for (int nota : note){
            System.out.println(nota);
        }

        //sortare Strings - sortam array-ul de Stringuri
        Arrays.sort(nume, Collections.reverseOrder());
        System.out.println(Arrays.toString(nume));

        String[] nume2 = {"Mihai", "Ana"};
        System.out.println("Sunt array-urile egale? " + Arrays.equals(nume, nume2));

        nume[0] = "Andrada";
        System.out.println(Arrays.toString(nume));
    }
}
