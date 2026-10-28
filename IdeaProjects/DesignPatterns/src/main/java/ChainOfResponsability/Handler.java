package ChainOfResponsability;

public interface Handler {

    public void setNext(Handler h);
    public void handle(Ticket t);

}
