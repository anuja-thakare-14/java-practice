package day4.areacalculator;

import java.util.Scanner;

/**
 *  Create a class Area calculator to store three variables l,b and r
 *  and write functions to return area of Rectangle (l*b), square (l*l) and circle (2*3.14*r)
 *  Main class should display menu for calulation of are
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Create object of class ArithmeticCalculator here
        System.out.println("1. Area of Rectangle \n 2.Area of Square \n 3. Area of Circle  \n Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // Take 2 int for length and breadth
                // set the variable of class
                // call method to calculate area
                break;
            case 2:
                // Take 1 int for side of rectangle
                break;
            case 3:
                // Take 1 int for radius

                break;

            default:
                break;
        }

    }
}