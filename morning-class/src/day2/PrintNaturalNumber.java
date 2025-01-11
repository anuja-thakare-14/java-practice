package day2;

//Write a program to print all numbers from 1 to 10 using:
//A for loop.
//A while loop.


import java.util.Scanner;

// Take start and end from user and print the numbers from start to end
public class PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Start Number : ");
        int start = sc.nextInt();

        System.out.println("Enter End Number : ");
        int end = sc.nextInt();

        if(end<start){
            System.out.println("Invalid");
        }
        else {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }

            System.out.print("    ");

            int i = start;
            while (i <= end) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
