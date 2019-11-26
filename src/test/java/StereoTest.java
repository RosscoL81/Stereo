import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;
    RecordDeck recordDeck;

    @Before
    public void before() {
        radio = new Radio();
        cdPlayer = new CDPlayer(3, "Sony", "ZX100");
        recordDeck = new RecordDeck(45, "Hitachi", "Tokyo");
        stereo = new Stereo("Boombox", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.tuneRadio());
    }

    @Test
    public void canStopCDPlayer(){
        assertEquals("stop pressed", stereo.stopCDPlayer());
    }

    @Test
    public void canPlayRecordDeck(){
        assertEquals("play pressed", stereo.playRecordDeck());
    }
}
