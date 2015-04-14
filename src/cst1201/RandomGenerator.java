package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        int sum, max, min;
        sum = 0;
        max = 0;

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the min number:");
        int minNumber = keyboard.nextInt();
        min = minNumber + 1;
        System.out.print("Enter the max number:");
        int maxNumber = keyboard.nextInt();
        System.out.print("Input a number of random integers to generate: ");

        int num = keyboard.nextInt();

        System.out.println("The random numbers are: ");
        for (int i = 0; i < num; i++) {
            int randomNum = rand.nextInt((maxNumber - minNumber) + 1) + minNumber;
            System.out.println(randomNum + "");

            if (max < randomNum) {
                max = randomNum;
            }
            if (min > randomNum) {
                min = randomNum;
            }
            sum = sum + randomNum;
        }
        double average = sum / num;
        System.out.println("The min number is: " + min);
        System.out.println("The max number is: " + max);
        System.out.println("There are " + num + " numbers in total.");
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }

}
