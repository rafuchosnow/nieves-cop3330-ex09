package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String lengthString = input.nextLine();
        int lengthNumber = Integer.parseInt(lengthString);

        System.out.print("What is the width of the room in feet? ");
        String widthString = input.nextLine();
        int widthNumber = Integer.parseInt(widthString);

        DecimalFormat noDecimal = new DecimalFormat("#");
        float conversion = 350;
        float areaFeet = lengthNumber * widthNumber;
        float gallon = (float) Math.ceil(areaFeet / conversion);

        System.out.println("You entered dimensions of " + lengthNumber + " feet by " + widthNumber + " feet.");
        System.out.println("The area of the ceiling is " + noDecimal.format(areaFeet) + " square feet");
        System.out.println("You will need to purchase " + noDecimal.format(gallon) + " gallons of paint to cover " + noDecimal.format(areaFeet) + " square feet.");
    }
}
