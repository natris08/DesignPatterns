package Facade;

//IL NOSTRO FACADE, IL NOSTRO CLIENT INTERAGIRA' DIRETTAMENTE CON QUESTO
public class Teatro {

    private Luci luci;
    private Sipario sipario;
    private Proiettore proiettore;

    public Teatro(Luci luci, Sipario sipario, Proiettore proiettore){
        this.luci = luci;
        this.sipario = sipario;
        this.proiettore = proiettore;
    }

    public void inizioSpettacolo(){
        sipario.aperturaSipario();
        luci.chiusuraLuci();
        proiettore.inizioProiettore();
    }

}
