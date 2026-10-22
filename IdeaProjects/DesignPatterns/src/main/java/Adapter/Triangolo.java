package Adapter;


//CLASSE ADAPTEE, RAPPRESENTA LA CLASSE DA ADATTARE CHE NON E'
//CONFORME ALL'INTERFACCIA
public class Triangolo {

    private int base, altezza;

    public Triangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public double getArea(){
        return (base*altezza)/2;
    }

}
