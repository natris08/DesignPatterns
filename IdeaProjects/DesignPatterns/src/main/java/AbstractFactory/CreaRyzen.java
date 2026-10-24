package AbstractFactory;

public class CreaRyzen implements CreazioneOggetti{
    @Override
    public Processore creaProcessore() {
        return new ProcessoreRyzen();
    }

    @Override
    public Ram creaRam() {
        return new RamRyzen();
    }
}
