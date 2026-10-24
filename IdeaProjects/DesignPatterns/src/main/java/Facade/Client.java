package Facade;

public class Client {

    public static void main(String[] args){
        Teatro t = new Teatro(new Luci(), new Sipario(), new Proiettore());
        t.inizioSpettacolo();
    }

}
