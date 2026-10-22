package Decorator;

public class MasterizzaDec extends Decorator{

    public MasterizzaDec(ConsoleFisica console) {
        super(console);
    }

    @Override
    public void leggiDisco(){
        System.out.println("LETTURA DISCO E "+masterizzazione());
    }

    public String masterizzazione(){
        return "MASTERIZZAZIONE DI ESSO";
    }

}
