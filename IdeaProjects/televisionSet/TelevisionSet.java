public class TelevisionSet {

    private boolean tvStateIsOff = true;
    private int changeChannel;
    private int volume;
    private String brightness;
    private int brightnessLevel;
    private boolean plusButton;
    private boolean volumeButton = false;
    private boolean settingsButton;


    public boolean onButton(){
        this.tvStateIsOff = true;
        return tvStateIsOff;
    }

    public boolean offButton(){
        this.tvStateIsOff =true;
        return tvStateIsOff;
    }

    public boolean channelButton(){
        return plusButton = true;
    }

    public boolean settingButton(){
        return settingsButton = true;
    }

    public void changeChannelButton()  {
            if(getChannelNumber() < 10 && channelButton()) {
                this.changeChannel += 1;
            }
    }


    public int getChannelNumber(){
        return changeChannel;
    }

    public boolean volumeButton(){
        return volumeButton = true;
    }
    public void volume(){
        if(volumeButton && volume < 10){
            this.volume += 1;
        }
    }

    public int VolumeButton(){
        return volume;
    }

    public void decreaseVolume(short volumeButton){
        if(volumeButton >= 1){
            this.volume -= 1;
        }
    }

    public int getVolumeDecreaseButton(){
        return volume;
    }

    public void brightness(){
        int counter = 0;
        brightnessLevel++;
        if(brightnessLevel >= 0 && brightnessLevel < 26) {
            brightness = "LOW BRIGHT";
        }

        if(brightnessLevel >= 25 && brightnessLevel < 51){
            brightness = "NOT REALLY BRIGHT";
        }

        if(brightnessLevel >= 50  && brightnessLevel < 76){
            brightness = "BRIGHT";
        }

        if(brightnessLevel >= 75  && brightnessLevel <= 100){
            brightness = "REALLY BRIGHT";
        }
    }

    public String getBrightness(){
        return brightness;
    }

    public int getBrightnessLevel(){
        return brightnessLevel;
    }
}
