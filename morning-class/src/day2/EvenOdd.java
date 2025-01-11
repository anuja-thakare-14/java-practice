package day2;

import java.util.Scanner;

// Write a program to check if a number is even or odd using if-else.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();

        if(num1%2==0){
            System.out.println("The number " + num1 + " is EVEN");
        }
        else{
            System.out.println("The number " + num1 + " is ODD");
        }
    }

}
