package Composite;

public class Client {
    public static void main(String[] args){
        Component p1 = new Persona("Teresa");
        Component p2 = new Persona("Sara");
        Component p3 = new Persona("Natalino");
        Component p4 = new Persona("Giuseppe");
        Component registro = new Registro();
        registro.aggiungi(p1);registro.aggiungi(p2);registro.aggiungi(p3);registro.aggiungi(p4);
        Component registro2 = new Registro();
        registro2.aggiungi(new Persona("c"));
        registro.aggiungi(registro2);
        registro.operation();
    }

}
