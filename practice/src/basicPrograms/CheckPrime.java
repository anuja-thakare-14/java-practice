package basicPrograms;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt(); //taking num for taking input value from user in num.

        if(num<=1){
            System.out.println("Number is not Prime");
        }
        for(int i =2; i<num; i++){
            if(num%i==0){
                System.out.println("Number is not a Prime");
            }
            else{
                System.out.println("Number is Prime");
            }
        }

    }
}
