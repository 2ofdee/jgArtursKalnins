package lv.Homework7;

import java.util.Random;

public class ArrayService {
    public static void main(String[] args) {

        create(3);
        printArrayToConsole();
        sumInArray();
        fillArrayWithRandomNumbers();
    }

    private static int[] anArray;

    public static int[] create(int arraylenght) {
        anArray = new int[arraylenght];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = fillArrayWithRandomNumbers();
        }
        return anArray;
    }

    public static void printArrayToConsole() {
        for (int n : anArray) {
            System.out.println(n + " ");
        }
    }


    public static int fillArrayWithRandomNumbers() {

        Random rand = new Random();
        int randomNum = rand.nextInt(1000);
        return randomNum;

    }

    public static void sumInArray() {
        int sum = 0;
        for (int i : anArray) {
            sum += i;
        }

        System.out.println("sum of the an Array is " + sum);
    }
}


