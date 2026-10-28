package ChainOfResponsability;

public class Tecnico implements Handler{

    private Handler nextGestore;
    private final int IDgestibile = 3;

    @Override
    public void setNext(Handler h) {
        nextGestore = h;
    }

    @Override
    public void handle(Ticket t) {
        if (t.getID()==IDgestibile){
            System.out.println("RICHIESTA GESTITA TECNICO");
        }
        else if (nextGestore != null){
            nextGestore.handle(t);
        }
    }


}
