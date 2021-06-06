/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        Scanner UserInput = new Scanner(System.in);
        int Gender = UserInput.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        double Ounces = UserInput.nextDouble();

        System.out.println("What is your weight, in pounds? ");
        double weight = UserInput.nextDouble();

        System.out.println("How many hours has it been since your last drink?");
        double hours = UserInput.nextDouble();

        double BACM = (Ounces * 5.14 / weight * 0.73) - (0.015 * hours);
        double BACW = (Ounces * 5.14 / weight * 0.66) - (0.015 * hours);

        if (Gender == 1){
            System.out.println("Your BAC is " + BACM);
            if (BACM < 0.08){
                System.out.println("It is legal for you to drive.");
            }else {
                System.out.println("It is not legal for you to drive.");
            }
        } else if (Gender == 2){
            System.out.println("Your BAC is " + BACW);
            if (BACW < 0.08){
                System.out.println("It is legal for you to drive.");
            }else {
                System.out.println("It is not legal for you to drive.");
            }
        }
    }
}
