package day2;

import java.util.Scanner;

// Sum of n natural numbers
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a NUMBER : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum +i;
        }
        System.out.println("Sum of n natural number : "+sum);
    }
}
