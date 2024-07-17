import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Stream;

public enum GeoPoliticalZones {

    NORTH_CENTRAL("Benue","FCT", "Kogi", "Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe","Taraba", "yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi"," Sokoto", "Jigawa","Zamfara"),
    SOUTH_EAST("Abai", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun","Oyo")
    ;

    private String[] states;


    GeoPoliticalZones(String... states){
        this.states = states;
   }
   public String[] getStates(){
        return states;
   }

   public static GeoPoliticalZones getValues(String state){
        for(GeoPoliticalZones zones : GeoPoliticalZones.values()){
            if(Arrays.asList(zones.getStates()).contains(state)){
                return zones;
            }
        }
        return null;
   }
   public static Stream<GeoPoliticalZones> stream(){
        return Stream.of(GeoPoliticalZones.values());
   }


}
