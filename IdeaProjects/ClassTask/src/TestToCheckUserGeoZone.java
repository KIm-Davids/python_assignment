import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EnumSet;

public class TestToCheckUserGeoZone {

    @Test

    public void testToCheckTheUserGeoPoliticalZone(){
        assertSame(GeoPoliticalZones.SOUTH_SOUTH,  GeoPoliticalZones.getValues("Bayelsa"));
        System.out.println(Arrays.toString(getStateArray()));
    }


    public String[] getStateArray( ){
           for(GeoPoliticalZones geoPoliticalZones : GeoPoliticalZones.values()){

                  return geoPoliticalZones.getStates();
           }

           return null;
    }



}
