package Builder;

public class Client {
    public static void main(String[] args){
        Computer c = new Computer.Builder("Intel", "GTX").led("gd").luci("fsj").build();
    }

}
