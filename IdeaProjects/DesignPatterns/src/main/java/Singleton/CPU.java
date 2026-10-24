package Singleton;

//QUESTO E' IL NOSTRO SINGLETON, SI VUOLE CREARE UNA SOLA ISTANZA DELLA NOSTRA
//CLASSE CPU
public class CPU {

    private static CPU cpu;

    private CPU(){}

    public static CPU getInstance(){
        if (cpu == null)
            cpu = new CPU();
        return cpu;
    } //COME SI VEDE DA QUESTO METODO SI HA L'UNICO PUNTO DI CREAZIONE DELL'INSTANZA

}
