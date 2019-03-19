package lv.Homework4;

import java.sql.SQLOutput;

//OK
public class LightColorDetector {

    public String detect (int waveLength) {
        String color = "the light is not visible";
        if (waveLength >= 380 && waveLength < 450) {
            color = "Purple";
            System.out.println("Purple");
        } else if (waveLength >= 450 && waveLength < 495) {
            color = "Blue";
            System.out.println("Blue");
        } else if (waveLength >= 495 && waveLength < 570) {
            color = "Green";
            System.out.println("Green");
        } else if (waveLength >= 570 && waveLength < 590) {
            color = "Yellow";
            System.out.println("yellow");
        } else if (waveLength >= 590 && waveLength < 620) {
            color = "Orange";
            System.out.println("Orange");
        } else if (waveLength >= 620 && waveLength < 750) {
            color = "Red";
            System.out.println("Red");
        }
        return color;
    }
}
