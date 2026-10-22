package Adapter;

public class Adapter extends Triangolo implements Poligono{

    public Adapter(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public double area() {
        return getArea();
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
