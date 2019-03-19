package lv.Homework5;

public class TVTest {
    public static void main(String[] args) {
        TV tv1 = new TV();

        tv1.setCurrentChannel(33);
        tv1.setCurrentVolumeLevel(12);
        tv1.setManufacturer("Samsung");
        tv1.setTurnedOn(true);

        TV tv2 = new TV();

        tv1.setCurrentChannel(16);
        tv1.setCurrentVolumeLevel(2);
        tv1.setManufacturer("Samsung");
        tv1.setTurnedOn(true);


        if(tv1.equals(tv2)){
            System.out.println("everything is the same");
        }else{
            System.out.println("Nothing is the same!");
            System.out.println("TV1: " +tv1.toString());
            System.out.println("TV2: " + tv2.toString());
        }


    }
}
