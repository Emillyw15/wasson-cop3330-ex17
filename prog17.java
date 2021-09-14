/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class prog17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000000");
        double BAC;
        double ratio = 0;

        System.out.print("Enter 1 if you are male or 2 if you are female: ");
        int gender = in.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        int ounce = in.nextInt();
        System.out.print("What is your weight in pounds? ");
        int weight = in.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        int hours = in.nextInt();

        if (gender == 1) {
            ratio = 0.73;
        }
        else if (gender == 2) {
            ratio = 0.66;
        }
        else {
            System.out.print("This is not a known value.");
            System.exit(0);
        }

        BAC = (ounce * 5.14 / weight * ratio) - .015 * hours;
        
        if (BAC >= 0.08) {
            System.out.print("Your BAC is " + df.format(BAC) + ". It is not legal for you to drive.");
        }
        else {
            System.out.print("Your BAC is " + df.format(BAC) + ". It is legal for you to drive.");
        }
    }
}
