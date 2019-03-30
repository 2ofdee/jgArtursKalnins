package lv.Homework8;

public class Bus extends Vehicle {

    private String color;


    public Bus(String color) {
        super(8, 30);
        this.color = color;
    }


    public boolean equals(Bus obj) {
        return super.equals(obj) && this.color == obj.color;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "color='" + this.color + '\'' +
                '}';
    }
}
