package lv.homework2;

import java.util.Random;

public class RandomNumberServiceTest {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int firstNumber = randomGenerator.nextInt(1000);
        System.out.println("First Random number =" + firstNumber);

        int secondNumber = randomGenerator.nextInt(1000);
        System.out.println("Second random number = " + secondNumber);

        int thirdNumber = randomGenerator.nextInt(1000);
        System.out.println("Third random number = " +thirdNumber);

        int randomNumberResult = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum result of all 3 random numbers is "+ randomNumberResult);

    }


}
