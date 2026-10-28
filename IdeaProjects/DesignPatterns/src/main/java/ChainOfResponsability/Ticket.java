package ChainOfResponsability;

public class Ticket {

    private int ID;
    private String descrizione;

    public Ticket(int ID, String descrizione){
        this.ID = ID;
        this.descrizione = descrizione;
    }

    public int getID(){
        return ID;
    }

    public String getDescrizione(){
        return descrizione;
    }

}
