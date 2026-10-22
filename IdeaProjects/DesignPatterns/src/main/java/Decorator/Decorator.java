package Decorator;

public class Decorator implements Console{

    private ConsoleFisica console;

    public Decorator(ConsoleFisica console){
        this.console = console;
    }

    @Override
    public void leggiDisco() {
        console.leggiDisco();
    }
}
