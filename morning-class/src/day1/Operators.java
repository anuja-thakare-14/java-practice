package day1;

import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value b : ");
        int b = sc.nextInt();

        System.out.println(" a+b = " + (a+b) + "\n a-b = " + (a-b) + "\n a*b = " + (a*b)+ "\n a/b = " + (a/(float)b) + "\n a%b = " + (a%b));
    }
}
