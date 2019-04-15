package lv.Homework8;

public class Bus extends Vehicle {

    private String color;
//lieka rinda

    public Bus(String color) {
        super(8, 30);
        this.color = color;
    }
//lieka rinda

    public boolean equals(Bus obj) {
        return super.equals(obj) && this.color == obj.color;
    }

    //šai klases superklasei ir divi lauki wheelCount un seatCount, kuru arī ir jāizvada
    @Override
    public String toString() {
        return "Bus{" +
                "color='" + this.color + '\'' +
                '}';
    }
}
