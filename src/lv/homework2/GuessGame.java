package lv.homework2;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int myNumber = random.nextInt(10000);

        System.out.println("I'm thinking of a number that is somewhere between 1 and 10 000. What number do you think it is?");
        int numberGuessed = scanner.nextInt();

        while (myNumber != numberGuessed) {
            if (numberGuessed < 10000 && numberGuessed > 1) {
                if (numberGuessed < myNumber) {
                    System.out.println("the number you've guessed is smaller then i'm thinking, try higher: ");
                    numberGuessed = scanner.nextInt();
                } if (numberGuessed > myNumber) {
                    System.out.println("The number you've guessed is higher then i'm thinking, try lower");
                    numberGuessed = scanner.nextInt();
                }
            } else  {
                System.out.println("The number you've entered is not in range of 1...10 000, please enter different number: ");
                numberGuessed = scanner.nextInt();
            }



        }
        System.out.println("Congradulation! you've won! My number was "+myNumber);
    }


}
