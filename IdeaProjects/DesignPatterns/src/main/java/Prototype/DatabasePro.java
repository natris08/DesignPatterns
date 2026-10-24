package Prototype;

public class DatabasePro implements DatabaseProto{

    private final String name= "DATABASE PRO";
    private int version = 1;

    public String getName(){
        return name;
    }

    public int getVersion(){
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public DatabaseProto clone() {
        try {
            super.clone();
            return new DatabasePro();
        }catch (CloneNotSupportedException c){
            throw new AssertionError(c);
        }
    }

}
