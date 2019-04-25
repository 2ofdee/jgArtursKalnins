package lv.Homework8;

public class Truck extends Vehicle {

    private int weight;

    public Truck(int weight) {
        super(6, 2);
        this.weight = weight;
    }

    public boolean equals(Truck obj) {
        return super.equals(obj) && this.weight == obj.weight;
    }

    //šai klases superklasei ir divi lauki wheelCount un seatCount, kuru arī ir jāizvada
    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + this.weight +
                '}';
    }
}

