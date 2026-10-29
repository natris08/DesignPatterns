package Flyweight;

import java.util.ArrayList;

public class TipoFactory {

    private ArrayList<TipoAlbero> cache = new ArrayList<>();

    public TipoAlbero getTipoAlbero(String repeatingState){
        for(TipoAlbero t:cache){
            if (t.getRepeatingState().equals(repeatingState))
                return t;
        }
        TipoAlbero t = new TipoAlbero(repeatingState);
        cache.add(t);
        return t;
    }

    public ArrayList<TipoAlbero> getCache(){
        return cache;
    }

}
