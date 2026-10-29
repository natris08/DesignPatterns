package Flyweight;

//Flyweight, contiene lo stato Intrinseco non mutabile
public class TipoAlbero {

    private String repeatingState;

    public TipoAlbero(String repeatingState){
        this.repeatingState = repeatingState;
    }

    public String getRepeatingState(){
        return repeatingState;
    }

    public void disegna(int x, int y){
        System.out.println("DISEGNATO ALBERO DI TIPO "+repeatingState+ " in posizione "+x+" "+y);
    }

}
