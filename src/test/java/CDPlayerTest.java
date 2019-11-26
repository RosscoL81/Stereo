import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(3, "Sony", "ZX100");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("ZX100", cdPlayer.getModel());
    }

    @Test
    public void canGetNoOfDiscs(){
        assertEquals(3, cdPlayer.getNoOfDiscs());
    }

    @Test
    public void canPressPlay(){
        assertEquals("play pressed", cdPlayer.play());
    }

    @Test
    public void canPressStop(){
        assertEquals("stop pressed", cdPlayer.stop());
    }
}
