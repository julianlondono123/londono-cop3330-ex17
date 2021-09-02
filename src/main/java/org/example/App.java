import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        double bac, ounces, gender, weight, hours, r;

        System.out.println("Enter a 1 if you are a male or a 2 if you are a female");
        while (!input.hasNextDouble()) {
            System.out.println("not a number");
            input.next();
        }

        gender = input.nextDouble();

        System.out.println("How many ounces of alcohol did you have?");
        while (!input.hasNextDouble()) {
            System.out.println("not a number");
            input.next();
        }

        ounces = input.nextDouble();

        System.out.println("What is your weight in pounds?");
        while (!input.hasNextDouble()) {
            System.out.println("not a number");
            input.next();
        }

        weight = input.nextDouble();

        System.out.println("How many hours since your last drink?");
        while (!input.hasNextDouble()) {
            System.out.println("not a number");
            input.next();
        }

        hours = input.nextDouble();

        if (gender == 1) {
            r  = 0.73;
        }
        else {
            r = 0.66;
        }

        bac = (ounces * 5.14 / weight * r) - 0.015 * hours;
        bac = Math.round(bac * 1000000.00) / 1000000.00;

        System.out.println ("Your BAC is " + bac);

        if (0.08 > bac) {
            System.out.println(" It is legal for you to drive");
        }
        else {
            System.out.println("It is not legal for you to drive");
        }
    }
}

