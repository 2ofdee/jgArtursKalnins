package lv.Homework5;

public class TVController {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.setTurnedOn(true);
        tv.setCurrentVolumeLevel(10);
        tv.setManufacturer("Samsung");
        tv.setCurrentChannel(22);

        tv.turnOn();
        tv.nextChannel();
        tv.previousChannel();
        tv.increaseVolume();
        tv.decreaseVolume();
        tv.turnOff();
        tv.nextChannel();
        tv.previousChannel();
        tv.increaseVolume();
        tv.decreaseVolume();


    }


}
