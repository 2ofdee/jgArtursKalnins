package lv.Homework8;

//Typo klases nosaukumā
public class PassangerVehicle extends Vehicle {

    private int milage; //Typo

    public PassangerVehicle(int milage) {
        super(4, 4);
        this.milage = milage;
    }

    public boolean equals(PassangerVehicle obj) {
        return super.equals(obj) && this.milage == obj.milage;
    }

    //šai klases superklasei ir divi lauki wheelCount un seatCount, kuru arī ir jāizvada
    @Override
    public String toString() {
        return "PassangerVehicle{" +
                "milage=" + this.milage +
                '}';
    }
}
