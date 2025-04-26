package Session_10_Exceptii;

public class Exceptia1 {
    //exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia
    //ofera un mecanism eficient de identificare si rezolvare a erorilor
    //sunt modelate sub forma de clase; ex clasa: error, exception, run time exception, dar putem crea si clase personalizate
    //exceptiile sunt gestionate folosind cuvinte predefinite in java: TRY, CATCH, FINALLY

    //sunt 2 tipuri mari de exceptii: CHECKED si UNCHECKED
    //**erorile CHECKED sunt exceptii de compilare; prin urmare nu putem rula proiectul fara ca aceste erori sa fie rezolvate in
    //prealabil; exemple: SQLException, IOException, ClassNotFoundException

    //**erorile UNCHECKED sunt exceptii de run time, ignorate in timpul compilarii, insa aruncate in timpul executiei programului
    //exemple: NullPointerException, ArrayIndexOutOfBound, ArithmeticException

    //cuvantul THROW - cuvant cheie care arunca exceptia in mod explicit de la o metoda sau bloc de cod
    //cuvantuk THROWS - cuvant cheie care foloseste odata cu metoda; poate arunca un tip sau mai multe de exceptii

    public static void main(String[] args) throws ExceptieCustom{
//       //ex erorea de tip unchecked
        try{
            int[] numbers = new int[10];
            numbers[11] = 34;
            //System.out.println(12 / 0);
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
//        catch (ArithmeticException e){
//            System.out.println("Error Arithmetic exception thrown: " + e.getMessage());
//        }
        catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            throw new ExceptieCustom("Eroare Custom");
        }
        //Thread.sleep(5000); //tip de eroare checked; daca rulam main-ul o sa primim eroare; trebuie rezolvata ca main-ul sa fie
        //rulat cu succes
        finally {
            System.out.println("Aceasta linie se executa indiferenta daca exceptia este prinsa");
        }
    }
}
