package pl.sda.wyjatki;

public class EmailException extends Exception{
    public EmailException(){

    }
    public EmailException(String messege){
        super(messege);
    }

}
