package lv.Homework6;

public class PowerCalculator {


    public long pow(long number, int power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return number;
        } else {
            for (int i = 2; i <= power; i++) {
                number *= number;
            }
            return number;
        }


    }
}