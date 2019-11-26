public class Stereo {

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck){
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
    }

    public String tuneRadio(){
        return radio.tune();
    }

    public String stopCDPlayer(){
        return cdPlayer.stop();
    }

    public String playRecordDeck(){
        return recordDeck.play();
    }
}
