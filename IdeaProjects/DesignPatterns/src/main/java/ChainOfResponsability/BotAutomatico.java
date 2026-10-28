package ChainOfResponsability;

public class BotAutomatico implements  Handler{

    private Handler nextGestore;
    private final int IDgestibile = 1;

    @Override
    public void setNext(Handler h) {
        nextGestore = h;
    }

    @Override
    public void handle(Ticket t) {
        if (t.getID() == IDgestibile)
            System.out.println("RICHIESTA GESTITA DA BOT AUTOMATICO");
        else if (nextGestore != null){
            nextGestore.handle(t);
        }
    }
}
