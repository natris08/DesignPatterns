package Decorator;

public class ConsoleFisica implements Console{

    @Override
    public void leggiDisco(){
        System.out.println("LETTURA DEL DISCO");
    }

}
