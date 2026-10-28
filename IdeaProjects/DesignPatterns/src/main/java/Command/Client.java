package Command;

public class Client {

    public static void main(String[] args){
        Cancello cancello = new Cancello();
        Command comando = new AperturaCancelloCommand(cancello);
        Re re = new Re(comando);
        re.ordinaApertura();
    }

}
