package ChainOfResponsability;

public class Azienda {

    public static void main(String[] args){
        Handler h1 = new BotAutomatico();
        Handler h2 = new Operatore();
        Handler h3 = new Tecnico();
        Handler h4 = new TeamSviluppo();

        h1.setNext(h2); h2.setNext(h3); h3.setNext(h4);

        Ticket t = new Ticket(3, "INDEFINITO");

        h1.handle(t);

    }

}
