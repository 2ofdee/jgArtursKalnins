package lv.Homework3;

public class Circle {

    double radius;  //jābūt private

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;

    }



}
