package lv.Homework5;

//ctrl + alt + l
//funkcionāli OK
public class TV {
    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;
//lieka rinda

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void turnOn() {
        turnedOn = true;
       }

    public void turnOff() {
        turnedOn = false;
    }

    public void nextChannel() {
        if (isTurnedOn()) {
            currentChannel++;
            System.out.println("channel to channel number " + currentChannel);
        } else {
            System.out.println("please turn on the TV first!");
        }
    }

    public void previousChannel() {
        if (isTurnedOn()) {
            currentChannel--;
            System.out.println("changed to channel number "+ currentChannel);
        } else {
            System.out.println("please turn on the TV first");
        }
//liekas rindas
//
    }

    public void increaseVolume() {
        if(isTurnedOn()){
            currentChannel++;
            System.out.println("volume changed to number "+ currentVolumeLevel);
        }else{
            System.out.println("please turn on the TV first");
        }
    }

    public void decreaseVolume(){
        if(isTurnedOn()){
            currentVolumeLevel--;
            System.out.println("Volume changed to number "+ currentVolumeLevel);
        }else{
            System.out.println("please turn on the TV first");
        }
    }


    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnedOn=" + turnedOn +
                '}';
    }

    public boolean equals(TV tv){
        return currentChannel == (tv.getCurrentChannel())
                && currentVolumeLevel == (tv.getCurrentVolumeLevel())
                && manufacturer.equals(tv.getManufacturer())
                && turnedOn ==(tv.isTurnedOn());
//lieka rinda
    }
//liekas rindas
//
}
