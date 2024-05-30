public class AcButtons {

    private int temperature;

    public boolean onButton(){
        int onButton = 1 ;
        if(onButton == 1){
            return true;
        }
        return false;
    }

    public boolean offButton(){
        int offButton = 0;
        if(offButton == 0){
            return true;
        }
        return false;
    }

    public int getTemperature(){
        return temperature = 23;
    }

    public boolean digitalDisplay(int digitalDisplay){
        if(digitalDisplay == 23){
            return true;
        }else {
            return false;
        }
    }

    public int increaseAc(){
        int newTemperature = getTemperature();
        return newTemperature + 1;
    }

    public int decreaseAc(){
        int newTemperature = getTemperature();
        return newTemperature - 1;
    }
}