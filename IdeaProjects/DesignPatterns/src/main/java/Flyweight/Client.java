package Flyweight;

public class Client {

    public static void main(String[] args){
        TipoFactory factory = new TipoFactory();
        Albero a = new Albero(factory,"Quercia", 1, 2);
        Albero a1 = new Albero(factory,"Querci", 3, 2);

        a.disegna();
        a1.disegna();

        for(TipoAlbero t: factory.getCache())
            System.out.println(t.getRepeatingState());

    }

}
