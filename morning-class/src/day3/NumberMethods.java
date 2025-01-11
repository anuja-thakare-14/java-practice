package day3;

import java.util.Scanner;

public class NumberMethods {

    public static int findMax(int a, int b){
         if(a>b){
             return a;
         }
         else if(b>a){
             return b;
         }

        return a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter th number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the number c : ");
        int c = sc.nextInt();

        int maxNum = findMax(a, b);
        maxNum = findMax(maxNum, c);
        System.out.println("Maximum of given numbers : " + maxNum);
    }
}
