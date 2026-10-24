package AbstractFactory;

public class CreaIntel implements CreazioneOggetti{
    @Override
    public Processore creaProcessore() {
        return new ProcessoreIntel();
    }

    @Override
    public Ram creaRam() {
        return new RamIntel();
    }
}
