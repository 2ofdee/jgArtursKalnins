package lv.Homework3;

//OK
public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setColor("Yellow");
        myCar.setManufacturer("Mitsubishi");
        myCar.setYear(2018);

        System.out.println("My cars manufacturer is " + myCar.getManufacturer());
        System.out.println("My cars colour is " + myCar.getColor());
        System.out.println("My cars year is " + myCar.getYear());

    }
}
