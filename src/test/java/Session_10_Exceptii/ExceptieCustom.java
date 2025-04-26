package Session_10_Exceptii;

public class ExceptieCustom extends Exception{
    public ExceptieCustom(String mesajEroare){
        super(mesajEroare); //chemam constructorul clasei parinte Exception
    }
}
