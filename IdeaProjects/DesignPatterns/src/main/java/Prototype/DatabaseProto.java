package Prototype;

//Rappresenta l'interfaccia comune dei nostri oggetti prototipi
public interface DatabaseProto extends Cloneable {

    public DatabaseProto clone();
    public String getName();
    public int getVersion();
    public void setVersion(int i);

}
