package Builder;

public class Computer {

    //OBBLIGATORI PER COSTRUIRE L'OGGETTO
    private String processore;
    private String schedaVideo;

    //OPZIONALI
    private String schedaM;
    private String luci;
    private String led;

    public static class Builder{

        //OBBLIGATORI PER COSTRUIRE L'OGGETTO
        private String processore;
        private String schedaVideo;

        //OPZIONALI
        private String schedaM;
        private String luci;
        private String led;

        public Builder(String processor, String schedaVide){
            processore = processor; schedaVideo = schedaVide;
        }

        public Builder schedaM(String scheda){
            schedaM = scheda; return this;
        }
        public Builder luci(String lux){
            luci = lux; return this;
        }
        public Builder led(String leds){
            led = leds; return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    private Computer(Builder b){
        processore = b.processore; schedaVideo = b.schedaVideo; led =b.led;
        luci = b.luci; schedaM = b.schedaM;
    }

}
