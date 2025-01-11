package day4.calci;

import java.util.Scanner;

/**
 *  Create a class Arithmetic calculator to store two variables a, b
 *  and write functions to print addition, subtraction, multiplication, division
 *  Main class should take two input first then display menu to choose the operation
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        // 1. Create object of class ArithmeticCalculator here
        // AC obj = new AC(a,b);
        System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // 2. Call addition function here
                // obj.printAddition();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }

    }
}
