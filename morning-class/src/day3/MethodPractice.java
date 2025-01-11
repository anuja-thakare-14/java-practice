package day3;

import java.util.Scanner;

public class MethodPractice {

    public static void checkNumber(double a){
        if(a<0){
            System.out.println("Given number is Negative");
        }
        else if(a>0){
            System.out.println("Given number is Positive");
        }
        else if(a==0){
            System.out.println("Given number is Zero");
        }
    }

    public static double square(double a){
        double squ = a*a;
        return squ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        double a = sc.nextDouble();

        checkNumber(a);

        double sq = square(a);
        System.out.println("Square : " + sq);
    }
}
