package lv.homework2;

import java.util.Scanner;

public class workWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your first number, it should not be less then 1: ");
        int firstNumber = scanner.nextInt();

        while (firstNumber < 1) {
            System.out.println("The number is less then 1, please enter number, that is higher than 1: ");
            firstNumber = scanner.nextInt();
        }

        System.out.println("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        while (secondNumber < 1) {
            System.out.println("The number is less then 1, please enter number, that is higher than 1: ");
            secondNumber = scanner.nextInt();
        }

        int sumResult = firstNumber + secondNumber;
        int substrResult = secondNumber - firstNumber;

        int divideResult = secondNumber / firstNumber;
        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Your first number = " + firstNumber);
        System.out.println("Your second number = " + secondNumber);
        System.out.println("Sum result of your first number and second number = " + sumResult);
        System.out.println("Substract result of first number from second number =" + substrResult);
        System.out.println("Divide result of second number by first number = " + divideResult);
        System.out.println("multiply result of first number and second number = " + multiplyResult);





    }


}




