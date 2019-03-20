package lv.Homework6;

public class PowerCalculator {
//liekas rindas

    public long pow(long number, int power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return number;
        } else {
            for (int i = 2; i <= power; i++) {
                number *= number; //nemainām ieejas datus, bet izveido lokalo mainīgo kurā glabā starp rezultātu
            }
            return number;
        }
//liekas rindas
//
    }
}