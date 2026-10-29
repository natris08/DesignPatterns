package Flyweight;

public class Albero {

    //Stato Estrinseco MUTABILE
    private int x;
    private int y;

    private TipoAlbero tipo;

    public Albero(TipoFactory factory, String repeatingState, int x, int y){
        this.x = x; this.y = y;
        this.tipo = factory.getTipoAlbero(repeatingState);
    }

    public void disegna(){
        tipo.disegna(x,y);
    }


}
