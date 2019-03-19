package lv.Homework5;

public class TV {
    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;


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

    public boolean turnOn() {
        turnedOn = true;
        return turnedOn;
    }

    public boolean turnOff() {
        turnedOn = false;
        return turnedOn;
    }

    public void nextChannel() {
        if (turnedOn = true) {
            currentChannel++;
        } else {
            System.out.println("please turn on the TV first!");
        }
    }

    public void previousChannel() {
        if (turnedOn = true) {
            currentChannel--;
        } else {
            System.out.println("please turn on the TV first");
        }


    }

    public void increaseVolume() {
        if(turnedOn = true){
            currentChannel++;
        }else{
            System.out.println("please turn on the TV first");
        }
    }

    public void decreaseVolume(){
        if(turnedOn = true){
            currentVolumeLevel--;
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

    }


}
