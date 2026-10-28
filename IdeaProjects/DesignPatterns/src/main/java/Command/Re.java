package Command;

//Invocker
public class Re {

    private Command comando;

    public Re(Command comando){
        this.comando = comando;
    }

    public void ordinaApertura(){
        comando.execute();
    }


}
