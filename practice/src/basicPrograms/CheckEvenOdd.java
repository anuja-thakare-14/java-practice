package basicPrograms;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int check = sc.nextInt();

         if(check%2==0){
             System.out.println("The number is even");
         }
         else{
             System.out.println("Number is odd");
         }
    }
}
