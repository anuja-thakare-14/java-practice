package day3;
// To check if the given number is prime or not :

import java.util.Scanner;

public class PrimeNumberHW {

    public static boolean checkPrime(int num) {

        if(num<=1){
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        // why checkPrime??
        if(checkPrime(num)){
            System.out.println(num + " is a Prime number");
        }
        else{
            System.out.println(num + " is not a Prime Number");
        }
    }
}
