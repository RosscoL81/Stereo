import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck(45, "Hitachi", "Tokyo");
    }

    @Test
    public void hasMake(){
        assertEquals("Hitachi", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Tokyo", recordDeck.getModel());
    }

    @Test
    public void hasPlaySpeed(){
        assertEquals(45, recordDeck.speed());
    }


    @Test
    public void canPressPlay(){
        assertEquals("play pressed", recordDeck.play());
    }

    @Test
    public void canPressStop(){
        assertEquals("stop pressed", recordDeck.stop());
    }
}
