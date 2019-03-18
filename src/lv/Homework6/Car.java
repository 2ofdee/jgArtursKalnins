package lv.Homework6;

public class Car {
    private int currentSpeed;
    private String model;
    private String color;
    private int maxSpeed;


    public Car(String model, String color, int maxSpeed, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public void slowDown() {
        if (isDriving()) {
            currentSpeed--;
        } else {
            System.out.println("Ya can't go any slower, buddy");
        }

    }

    public void accelerate() {
        if (canAccelerate()) {
            currentSpeed++;
        } else {
            System.out.println("Ya can't go any faster, buddy");

        }
    }

    public void speedUp() {
        while(canAccelerate()) {
            currentSpeed++;
            System.out.println("WE ARE GAINING SPEED, JOHNNY, HOLD ON TO YOUR HORSES. Current speed is " + currentSpeed);
        }
        System.out.println("This is as fast as we can go. Current speed is " + currentSpeed);
    }

    public boolean isDriving() {
        if (currentSpeed > 0) {
            return true;
        } else {
            return false;
        }


    }

    public boolean canAccelerate() {
        if (currentSpeed == maxSpeed) {
            return false;
        } else {
            return true;
        }

    }

}