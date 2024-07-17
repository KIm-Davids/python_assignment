import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TelevisionSetTest {
    TelevisionSet tvSet = new TelevisionSet();

    @Test
    public void testThatTheTvIsOff(){
        assertTrue(tvSet.offButton());
    }

    @BeforeEach
    public void testThatTheTvCanOn(){
        assertTrue(tvSet.onButton());
    }

    @Test
    public void testThatTheTvCanChangeChannels(){

        assertTrue(tvSet.channelButton());

        //The for loop represents how many times the user presses the button
        for(int counter = 0; counter < 9; counter++){
            tvSet.changeChannelButton();
        }
          assertEquals(9,tvSet.getChannelNumber());
    }

    @Test
    public void testThatTheTvVolumeWorks(){
        assertTrue(tvSet.volumeButton());

        for(int counter = 0; counter < 5; counter++){
            tvSet.volume();
        }
        assertEquals(5, tvSet.VolumeButton());
    }

    @Test
    public void testTheTvBrightnessLevel(){
        assertTrue(tvSet.settingButton());

        for(int counter = 0; counter < 100; counter++){
            tvSet.brightness();
        }

        assertEquals(100, tvSet.getBrightnessLevel());
        assertEquals("REALLY BRIGHT", tvSet.getBrightness());
    }

}
