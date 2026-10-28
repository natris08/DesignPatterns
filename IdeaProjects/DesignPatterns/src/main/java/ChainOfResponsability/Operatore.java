package ChainOfResponsability;

public class Operatore implements Handler{

    private Handler nextGestore;
    private final int IDgestibile = 2;

    @Override
    public void setNext(Handler h) {
        nextGestore = h;
    }

    @Override
    public void handle(Ticket t) {
        if (t.getID()==IDgestibile){
            System.out.println("RICHIESTA GESTITA DA OPERATORE");
        }
        else if (nextGestore != null){
                nextGestore.handle(t);
            }
        }
}
