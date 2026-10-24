package Prototype;

public class Client {

    public static void main(String[] args){
        DatabaseProto d = new DatabasePro();
        System.out.println(d.getName()+" "+d.getVersion());
        DatabaseProto copia = d.clone();
        copia.setVersion(2);
        System.out.println(d.getName()+" "+d.getVersion());
        System.out.println(copia.getName()+" "+copia.getVersion());
    }//SI EVITA DI FARE NUOVAMENTE NEW AL CLIENT E SCRIVERE CODICE AGGINTIVO,
     //PASSANDO DIRETTAMENTE I PARAMETRI ALL'INTERNO DEL METODO CLONE

}
