package Prototype;

public class DatabaseMid implements DatabaseProto{
    @Override
    public DatabaseProto clone() {
        try {
            super.clone();
            return this;
        }catch (CloneNotSupportedException c){
            throw new AssertionError(c);
        }
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getVersion() {
        return 0;
    }

    @Override
    public void setVersion(int i) {

    }
}
