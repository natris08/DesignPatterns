package Command;

public class AperturaCancelloCommand implements Command{

    private Cancello cancello;

    public AperturaCancelloCommand(Cancello cancello){
        this.cancello = cancello;
    }

    @Override
    public void execute() {
        cancello.apri();
    }
}
