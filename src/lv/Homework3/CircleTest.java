package lv.Homework3;

//Ok
public class CircleTest {
    public static void main(String[] args) {

        Circle circleArea = new Circle();

        circleArea.setRadius(3);

        System.out.println("The are of circle with radius " + circleArea.getRadius() + " is " + circleArea.calculateArea());

    }

}
