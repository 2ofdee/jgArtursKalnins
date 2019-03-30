package lv.Homework8;

public class PassangerVehicle extends Vehicle {

    private int milage;

    public PassangerVehicle(int milage) {
        super(4, 4);
        this.milage = milage;
    }

    public boolean equals(PassangerVehicle obj) {
        return super.equals(obj) && this.milage == obj.milage;
    }

    @Override
    public String toString() {
        return "PassangerVehicle{" +
                "milage=" + this.milage +
                '}';
    }
}
