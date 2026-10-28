package ChainOfResponsability;

public class TeamSviluppo implements Handler{

    //private Handler nextGestore;
    private final int IDgestibile = 4;

    @Override
    public void setNext(Handler h) {
        //nextGestore = h;
    }

    @Override
    public void handle(Ticket t) {
        if (t.getID()==IDgestibile){
            System.out.println("RICHIESTA GESTITA DA TEAM SVILUPPO");
        }
        else {
            System.out.println("IMPOSSIBILE GESTIRE RICHIESTA");
        }
    }

}
