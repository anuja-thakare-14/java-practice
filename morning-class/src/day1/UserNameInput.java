package day1;

import java.util.Scanner;

/**
Take the user's name and age as input.
        Print a message like:
        Hello, [Name]! You are [Age] years old.
**/
public class UserNameInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
//        System.out.println(name);

        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
//        System.out.println(age);

        System.out.println("Hello " + name + "! You are " + age + " years old.");
    }
}
